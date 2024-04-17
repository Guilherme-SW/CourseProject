module org.example.project {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires mysql.connector.j;
    requires java.sql;
    requires org.hibernate.orm.core;
    requires jakarta.persistence;
    requires java.naming;
    requires org.kordamp.bootstrapfx.core;




    opens org.example.project to javafx.fxml;
    exports org.example.project;

    opens org.example.project.fxController to javafx.fxml;
    exports org.example.project.fxController to javafx.fxml;
//    opens org.example.project.fxController.tableParameters to javafx.fxml, javafx.base;
//    exports org.example.project.fxController.tableParameters to javafx.fxml, java.base;
    opens   org.example.project.Model to javafx.fxml, org.hibernate.orm.core, jakarta.persistence;
    exports  org.example.project.Model to javafx.fxml, org.hibernate.orm.core, jakarta.persistence;



}