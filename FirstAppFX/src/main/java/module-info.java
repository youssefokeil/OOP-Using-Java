module org.example.firstappfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens org.example.firstappfx to javafx.fxml;
    exports org.example.firstappfx;
}