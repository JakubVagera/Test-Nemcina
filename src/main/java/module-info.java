module com.example.demo13 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    //requires eu.hansolo.tilesfx;

    opens com.example.demo13 to javafx.fxml;
    exports com.example.demo13;
}