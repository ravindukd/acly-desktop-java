module com.iitprojects.acly {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.iitprojects.acly to javafx.fxml;
    exports com.iitprojects.acly;
}
