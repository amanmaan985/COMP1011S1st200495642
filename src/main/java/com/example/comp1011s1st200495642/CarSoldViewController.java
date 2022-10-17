package com.example.comp1011s1st200495642;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class CarSoldViewController implements Initializable {

    @FXML
    private BarChart<?, ?> barChart;

    @FXML
    private TableColumn<CarSold, Integer> fifthColumnPrice;

    @FXML
    private ComboBox<CarSold> filterByYear;

    @FXML
    private TableColumn<CarSold, Integer> firstColumnCarId;

    @FXML
    private TableColumn<CarSold, String> fourthModel;

    @FXML
    private CategoryAxis horizontalAxis;

    @FXML
    private TableColumn<CarSold, Integer> lastCoulmnDateSold;

    @FXML
    private NumberAxis numberAxis;

    @FXML
    private TableColumn<CarSold, Integer> secondColumnModelYear;

    @FXML
    private TableColumn<CarSold, String> thirdColumnMake;

    @FXML
    private Label totalSalesLabel;

    @FXML
    private Label unitsLabel;


    @FXML
    private TableView<CarSold> tableView;

    @Override

    public void initialize(URL url, ResourceBundle resourceBundle) {
        firstColumnCarId.setCellValueFactory(new PropertyValueFactory<>("carId"));
        secondColumnModelYear.setCellValueFactory(new PropertyValueFactory<>("modelYear"));
        thirdColumnMake.setCellValueFactory(new PropertyValueFactory<>("make"));
        fourthModel.setCellValueFactory(new PropertyValueFactory<>("model"));
        fifthColumnPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        lastCoulmnDateSold.setCellValueFactory(new PropertyValueFactory<>("dateSold"));

        ArrayList<CarSold> carSolds = DBUtilities.getSoldCarObjectFromDB();
        tableView.getItems().addAll(DBUtilities.getSoldCarObjectFromDB());
    }
}

