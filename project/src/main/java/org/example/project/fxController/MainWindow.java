package org.example.project.fxController;

import jakarta.persistence.EntityManagerFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import org.example.project.Model.*;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class MainWindow {


    public ListView productAdminList;
    public RadioButton legoBut;
    public ToggleGroup productType;
    public RadioButton plushieBut;
    public RadioButton candyBut;
    public Button shopRe;
    public Button shopAd;
    public Button shopDe;
    public Button shopBy;
    public TextField plushieSizeField;
    public TextField candyFlavorField;
    public TextField candyTypeField;
    public TextField plushieMaterialField;
    public TextField legoCountField;
    public TextField legoSetField;
    public TextField legoSizeField;
    public TextField productPriceField;
    public TextField productQtyField;
    public TextField productDesField;
    public TextField productNameField;
    public Button productsUp;

    @FXML
    public void createRecord(ActionEvent actionEvent) {
        if (legoBut.isSelected()) {
            Lego lego = new Lego(productNameField.getText(),
                    productDesField.getText(),
                    Float.parseFloat(productPriceField.getText()),
                    Integer.parseInt(productQtyField.getText()),
                    Integer.parseInt(legoCountField.getText()),
                    legoSetField.getText(),
                    Integer.parseInt(legoSizeField.getText()));
            //TODO insert to database
            productAdminList.getItems().add(lego);

    

        } else if (plushieBut.isSelected()) {
            Plushie plushie = new Plushie(productNameField.getText(),
                    productDesField.getText(),
                    Float.parseFloat(productPriceField.getText()),
                    Integer.parseInt(productQtyField.getText()),
                    plushieMaterialField.getText(),
                    plushieSizeField.getText());

            productAdminList.getItems().add(plushie);


        } else if (candyBut.isSelected()) {
            Candy candy = new Candy(productNameField.getText(),
                    productDesField.getText(),
                    Float.parseFloat(productPriceField.getText()),
                    Integer.parseInt(productQtyField.getText()),
                    candyFlavorField.getText(),
                    candyTypeField.getText());

            productAdminList.getItems().add(candy);

        } else {
            // Handle the case where no product type is selected (e.g., show an error message)
            System.out.println("Error: Please select a product type.");
        }
    }



    public void updateRecord(ActionEvent actionEvent) {
/*   //TODO class shopHibernate

        //Once the product is selected, load that information to the fields for easier editing
        //You can also implement a TableView for easier manipulation
        Product product = shopHibernate.getEntityById(Product.class, productAdminList.getSelectionModel().getSelectedItem().getId());
        //We need to determine what kind of object it is.
        //If it is Plant - I need to disable non plant fields and fill plant fields with data
        if (product instanceof Lego) {
            Lego lego = (Lego) product;
            product.setName(productNameField.getText());
            //productDescriptionField.setText(plant.getDescription());
            lego.setDescription(productDesField.getText());
            //Once all information from the fields is collected, update the record
            shopHibernate.update(lego);
        } else if (product instanceof Plushie) {
            //TODO complete for remaining product types
        } else {
            //TODO complete for remaining product types
        }*/

    }

    public void deleteRecord(ActionEvent actionEvent) {
        Product product = (Product) productAdminList.getSelectionModel().getSelectedItem();
        productAdminList.getItems().remove(product);
    }

    public void disableFields(ActionEvent actionEvent) {
        if (legoBut.isSelected()) {
            legoCountField.setDisable(false);
            legoSetField.setDisable(false);
            legoSizeField.setDisable(false);
            plushieSizeField.setDisable(true);
            plushieMaterialField.setDisable(true);
            candyFlavorField.setDisable(true);
            candyTypeField.setDisable(true);
        } else if (plushieBut.isSelected()) {
            legoCountField.setDisable(true);
            legoSetField.setDisable(true);
            legoSizeField.setDisable(true);
            plushieSizeField.setDisable(false);
            plushieMaterialField.setDisable(false);
            candyFlavorField.setDisable(true);
            candyTypeField.setDisable(true);
        } else {
            legoCountField.setDisable(true);
            legoSetField.setDisable(true);
            legoSizeField.setDisable(true);
            plushieSizeField.setDisable(true);
            plushieMaterialField.setDisable(true);
            candyFlavorField.setDisable(false);
            candyTypeField.setDisable(false);
        }
    }

    public void loadProductData(MouseEvent mouseEvent) {
    }

    public void setData(EntityManagerFactory entityManagerFactory, User user) {
    }
}
