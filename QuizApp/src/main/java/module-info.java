module com.thao225.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires lombok;
    requires java.sql;
    
    opens com.thao225.quizapp to javafx.fxml;
    exports com.thao225.quizapp;
}
