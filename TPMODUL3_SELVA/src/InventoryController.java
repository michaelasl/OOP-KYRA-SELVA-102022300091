import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class InventoryController {

    @FXML
    private TableView<Album> tableView;

    @FXML
    private TableColumn<Album, String> columnAlbumName;

    @FXML
    private TableColumn<Album, String> columnArtist;

    @FXML
    private TableColumn<Album, Integer> columnTotal;

    @FXML
    private TableColumn<Album, Integer> columnAvailable;

    @FXML
    private TableColumn<Album, Integer> columnRented;

    @FXML
    private TextField fieldAlbumName;

    @FXML
    private TextField fieldArtist;

    @FXML
    private TextField fieldTotal;

    @FXML
    private TextField fieldAvailable;

    private ObservableList<Album> albumList;

    @FXML
    public void initialize() {
        
        columnAlbumName.setCellValueFactory(new PropertyValueFactory<>("albumName"));
        columnArtist.setCellValueFactory(new PropertyValueFactory<>("artist"));
        columnTotal.setCellValueFactory(new PropertyValueFactory<>("total"));
        columnAvailable.setCellValueFactory(new PropertyValueFactory<>("available"));
        columnRented.setCellValueFactory(new PropertyValueFactory<>("rented"));

        
        albumList = FXCollections.observableArrayList();
        tableView.setItems(albumList);

        
        clearForm();
    }

    @FXML
    public void handleTableClick(MouseEvent event) {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            fieldAlbumName.setText(selectedAlbum.getAlbumName());
            fieldArtist.setText(selectedAlbum.getArtist());
            fieldTotal.setText(String.valueOf(selectedAlbum.getTotal()));
            fieldAvailable.setText(String.valueOf(selectedAlbum.getAvailable()));
        }
    }

    @FXML
    public void handleAdd(ActionEvent event) {
        try {
            String albumName = fieldAlbumName.getText();
            String artist = fieldArtist.getText();
            int total = Integer.parseInt(fieldTotal.getText());
            int available = Integer.parseInt(fieldAvailable.getText());

            if (total < available) {
                throw new IllegalArgumentException("Total tidak boleh lebih kecil dari Available");
            }

            albumList.add(new Album(albumName, artist, total, available, total - available));

            showAlert("Success", "Album berhasil ditambahkan!", Alert.AlertType.INFORMATION);
            clearForm();
        } catch (Exception e) {
            showAlert("Error", "Data tidak valid: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    @FXML
    public void handleDelete(ActionEvent event) {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            albumList.remove(selectedAlbum);
            showAlert("Success", "Album berhasil dihapus!", Alert.AlertType.INFORMATION);
            clearForm();
        } else {
            showAlert("Error", "Pilih album yang ingin dihapus!", Alert.AlertType.ERROR);
        }
    }

    @FXML
    public void handleUpdate(ActionEvent event) {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            try {
                String albumName = fieldAlbumName.getText();
                String artist = fieldArtist.getText();
                int total = Integer.parseInt(fieldTotal.getText());
                int available = Integer.parseInt(fieldAvailable.getText());

                if (total < available) {
                    throw new IllegalArgumentException("Total tidak boleh lebih kecil dari Available");
                }

                selectedAlbum.setAlbumName(albumName);
                selectedAlbum.setArtist(artist);
                selectedAlbum.setTotal(total);
                selectedAlbum.setAvailable(available);
                selectedAlbum.setRented(total - available);

                tableView.refresh();
                showAlert("Success", "Album berhasil diperbarui!", Alert.AlertType.INFORMATION);
                clearForm();
            } catch (Exception e) {
                showAlert("Error", "Data tidak valid: " + e.getMessage(), Alert.AlertType.ERROR);
            }
        } else {
            showAlert("Error", "Pilih album yang ingin diubah!", Alert.AlertType.ERROR);
        }
    }

    @FXML
    public void handleRentSelected(ActionEvent event) {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            if (selectedAlbum.getAvailable() > 0) {
                selectedAlbum.setAvailable(selectedAlbum.getAvailable() - 1);
                selectedAlbum.setRented(selectedAlbum.getRented() + 1);
                tableView.refresh();
                showAlert("Success", "Album berhasil disewa!", Alert.AlertType.INFORMATION);
            } else {
                showAlert("Error", "Album tidak tersedia untuk disewa!", Alert.AlertType.ERROR);
            }
        } else {
            showAlert("Error", "Pilih album yang ingin disewa!", Alert.AlertType.ERROR);
        }
    }

    private void showAlert(String title, String content, Alert.AlertType type) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.showAndWait();
    }

    private void clearForm() {
        fieldAlbumName.clear();
        fieldArtist.clear();
        fieldTotal.clear();
        fieldAvailable.clear();
    }
}
