package org.example.project.fxController;

import org.example.project.HelloApplication;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

public class FxUtils {



    public static void generateAlert(Alert.AlertType alertType, String header, String text){
        //See here, you can just copy paste - https://code.makery.ch/blog/javafx-dialogs-official/
        Alert alert = new Alert(alertType);
        alert.setTitle("System message ");
        alert.setHeaderText(header + " (₌ ᵕ̣̣̣̣̣ ᆽ ᵕ̣̣̣̣̣₌)");
        alert.setContentText(text);
        alert.showAndWait();
    }
}
