package org.example.veterinaria;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField user;
    @FXML
    private PasswordField passw;
    @FXML
    private ComboBox<String> cmbRol;


    String usuario = "admin";
    String contra = "123456";

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cmbRol.getItems().add("Veterinario");
        cmbRol.getItems().add("Cliente");
    }
    @FXML
    protected void onHelloButtonClick() {
        if (user.getText().equals(usuario) && passw.getText().equals(contra) && "Veterinario".equals(cmbRol.getValue())){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Sistema.fxml"));
                Parent root = fxmlLoader.load();

                Stage nuevaVentana = new Stage();
                nuevaVentana.setTitle("Pantalla Reutilizable");
                nuevaVentana.setScene(new Scene(root));
                nuevaVentana.show();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else {
            welcomeText.setText("Usuario/contraseña incorrectas");
        }

    }

}
