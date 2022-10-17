package com.example.comp1011s1st200495642;

import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;

public class CarSoldViewController {

    @FXML
    private BarChart<?, ?> barChart;

    @FXML
    private TableColumn<?, ?> fifthColumnPrice;

    @FXML
    private ComboBox<?> filterByYear;

    @FXML
    private TableColumn<?, ?> firstColumnCarId;

    @FXML
    private TableColumn<?, ?> fourthModel;

    @FXML
    private CategoryAxis horizontalAxis;

    @FXML
    private TableColumn<?, ?> lastCoulmnDateSold;

    @FXML
    private NumberAxis numberAxis;

    @FXML
    private TableColumn<?, ?> secondColumnModelYear;

    @FXML
    private TableColumn<?, ?> thirdColumnMake;

    @FXML
    private Label totalSalesLabel;

    @FXML
    private Label unitsLabel;

}
