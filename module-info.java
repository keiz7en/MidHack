module com.keiz.projectlibrary {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.keiz.projectlibrary to javafx.fxml;
    exports com.keiz.projectlibrary;
}