/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author esprit
 */
public class MenuClientController implements Initializable {

    private Label menu;
    @FXML
    private Button patisserie_client;
    @FXML
    private Button promotion_page;
    @FXML
    private Button recetteClient;
    @FXML
    private Button inscriForma;
    @FXML
    private Button reclam;
    @FXML
    private Button retour88;
    @FXML
    private Button consulterMonCompte2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void consulter(ActionEvent event) throws IOException {
        Stage stage = (Stage) menu.getScene().getWindow();
        stage.close();

        Stage window = new Stage();

        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("Commande.fxml")));
        window.setScene(scene);
        window.show();
        
        
        
        
    }

    private void retour(ActionEvent event) throws IOException {
        Stage stage = (Stage) menu.getScene().getWindow();
        stage.close();

        Stage window = new Stage();

        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("Authentification.fxml")));
        window.setScene(scene);
        window.show();
    }

    private void consulterMonCompte(ActionEvent event) throws IOException {
         Stage stage = (Stage) menu.getScene().getWindow();
        stage.close();

        Stage window = new Stage();

        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("Compte.fxml")));
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void listComd(ActionEvent event) throws IOException {
              Stage stage = (Stage) menu.getScene().getWindow();
        stage.close();

        Stage window = new Stage();

        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("ListCommande.fxml")));
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void patisserie_client(ActionEvent event) throws IOException {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("patisserie.fxml"));
            Parent root = loader.load();
           Scene homePageScene=new Scene(root); 
           Stage appStage =(Stage) ((Node) event.getSource()).getScene().getWindow(); 
           appStage.setScene(homePageScene); 
           appStage.show();
    }

    @FXML
    private void promotion_page(ActionEvent event) throws IOException { FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLPromo.fxml"));
            Parent root = loader.load();
           Scene homePageScene=new Scene(root); 
           Stage appStage =(Stage) ((Node) event.getSource()).getScene().getWindow(); 
           appStage.setScene(homePageScene); 
           appStage.show();
    }

    @FXML
    private void gestion_recette2(ActionEvent event) throws IOException {
        
         FXMLLoader loader = new FXMLLoader(getClass().getResource("crudRecetteFXML.fxml"));
            Parent root = loader.load();
           Scene homePageScene=new Scene(root); 
           Stage appStage =(Stage) ((Node) event.getSource()).getScene().getWindow(); 
           appStage.setScene(homePageScene); 
           appStage.show();
    }

    @FXML
    private void inscriForma(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLInscri.fxml"));
            Parent root = loader.load();
           Scene homePageScene=new Scene(root); 
           Stage appStage =(Stage) ((Node) event.getSource()).getScene().getWindow(); 
           appStage.setScene(homePageScene); 
           appStage.show();
    }

    @FXML
    private void reclam(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("AffichageReclamation.fxml"));
            Parent root = loader.load();
           Scene homePageScene=new Scene(root); 
           Stage appStage =(Stage) ((Node) event.getSource()).getScene().getWindow(); 
           appStage.setScene(homePageScene); 
           appStage.show();
    }

    @FXML
    private void consulterMonCompte2(ActionEvent event) throws IOException {
           FXMLLoader loader = new FXMLLoader(getClass().getResource("Compte.fxml"));
            Parent root = loader.load();
           Scene homePageScene=new Scene(root); 
           Stage appStage =(Stage) ((Node) event.getSource()).getScene().getWindow(); 
           appStage.setScene(homePageScene); 
           appStage.show();
    }

    @FXML
    private void retour88(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("Authentification.fxml"));
            Parent root = loader.load();
           Scene homePageScene=new Scene(root); 
           Stage appStage =(Stage) ((Node) event.getSource()).getScene().getWindow(); 
           appStage.setScene(homePageScene); 
           appStage.show();
    }
}
