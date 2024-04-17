package org.example.project.fxController;


import org.example.project.HelloApplication;
//import org.example.project.hibernate.ShopHibernate;
import org.example.project.Model.User;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginForm implements Initializable {
    @FXML
    public TextField loginField;
    @FXML
    public PasswordField pswField;

    private EntityManagerFactory entityManagerFactory;
    private User user;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        entityManagerFactory = Persistence.createEntityManagerFactory("Shop");
    }

    public void validateAndLoadMain() throws IOException {

        //If user exists, open main window form

       // if (user != null) {

        if (user != null){
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main-window.fxml"));
            //Load resources associated with the form. We need this step to access controllers
            Parent parent = fxmlLoader.load();
            //Access controller of main window. Each form has its own controller, so make sure that you make no mistake here
            MainWindow mainWindow = fxmlLoader.getController();
            mainWindow.setData(entityManagerFactory, (User) user);
            //Every element in the form knows to which scene it belongs and scene knows to which stage (window it belongs)
            Stage stage = (Stage) loginField.getScene().getWindow();
            Scene scene = new Scene(parent);
            stage.setTitle("Shop");
            stage.setScene(scene);
            stage.show();
        } else {

            //Something went wrong, generate an alert
            FxUtils.generateAlert(Alert.AlertType.INFORMATION, "Login error", "No such user or wrong credentials");
        }
    }

    public void openRegistration(ActionEvent actionEvent) {
    }
}
