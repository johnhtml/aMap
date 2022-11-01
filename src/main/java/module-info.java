module com.example.amap {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.amap to javafx.fxml;
    exports com.example.amap;
}