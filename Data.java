package com.keiz.projectlibrary;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class Data {

    @FXML
    private TextField cpufield;

    @FXML
    private ComboBox<String> ramcombo;

    @FXML
    private TextField gpufield;

    @FXML
    private DatePicker dateofbuy;

    @FXML
    private TableView<LaptopSpecs> tableView;

    @FXML
    private TableColumn<LaptopSpecs, String> cpushow;

    @FXML
    private TableColumn<LaptopSpecs, String> ramshow;

    @FXML
    private TableColumn<LaptopSpecs, String> gpushow;

    @FXML
    private TableColumn<LaptopSpecs, String> brandshow;

    @FXML
    private TableColumn<LaptopSpecs, String> dateshow;

    @FXML
    private RadioButton asusradio, lenovoradio, hpradio, microsoftradio, appleradio;

    private String selectedBrand;

    @FXML
    private void initialize() {
        ObservableList<String> ramOptions = FXCollections.observableArrayList("4GB", "8GB", "16GB", "32GB", "64GB");
        ramcombo.setItems(ramOptions);

        cpushow.setCellValueFactory(new PropertyValueFactory<>("cpu"));
        ramshow.setCellValueFactory(new PropertyValueFactory<>("ram"));
        gpushow.setCellValueFactory(new PropertyValueFactory<>("gpu"));
        brandshow.setCellValueFactory(new PropertyValueFactory<>("brand"));
        dateshow.setCellValueFactory(new PropertyValueFactory<>("dateOfBuy"));
    }

    @FXML
    private void savedata() {
        String cpu = cpufield.getText();
        String ram = ramcombo.getValue() != null ? ramcombo.getValue() : "";
        String gpu = gpufield.getText();
        String date = dateofbuy.getValue() != null ? dateofbuy.getValue().toString() : "";

        selectedBrand = "";
        if (asusradio.isSelected()) selectedBrand = "Asus";
        else if (lenovoradio.isSelected()) selectedBrand = "Lenovo";
        else if (hpradio.isSelected()) selectedBrand = "HP";
        else if (microsoftradio.isSelected()) selectedBrand = "Microsoft";
        else if (appleradio.isSelected()) selectedBrand = "Apple";

        LaptopSpecs specs = new LaptopSpecs(cpu, ram, gpu, selectedBrand, date);
        RestoreData.saveSpecs(specs);
    }

    @FXML
    private void tabledata() {
        tableView.getItems().clear();
        tableView.getItems().addAll(RestoreData.getAllSpecs());
    }
}
