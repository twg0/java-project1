module com.likelion.newproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.likelion.newproject to javafx.fxml;
    exports com.likelion.newproject;
}