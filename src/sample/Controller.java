package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    Label titleText;

    @FXML
    TableView myTable;

    //TODO add here something

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setTitle();
        TableColumn col = new TableColumn();
        col.setCellFactory(
            new PropertyValueFactory<String,String>("Hello")
        );

        myTable.getColumns().add(col);
    }

    public void setTitle(){
        titleText.setText("ESL PRO MASTERS");
    }
}
