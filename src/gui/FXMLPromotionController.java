/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entite.Promotion;
import java.io.IOException;
import service.ServicePromotion;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Arbia
 */
public class FXMLPromotionController implements Initializable {

    @FXML
    private TableView<Promotion> tab2;
    @FXML
    private TableColumn<Promotion, String> nomP=new TableColumn<Promotion, String>();
    @FXML
    private TableColumn<Promotion, Double> prixPr=new TableColumn<Promotion, Double>();
    @FXML
    private TableColumn<Promotion, Integer> pourcen=new TableColumn<Promotion, Integer>();
    @FXML
    private TableColumn<Promotion, Double> nv=new TableColumn<Promotion, Double>();
ServicePromotion ServicePromotion = new ServicePromotion();
    @FXML
    private Button retour44;
private List<Promotion> findPromotion() throws SQLException {
        return ServicePromotion.afficher();
    } 
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) { 
        
        // TODO
        try{ 
              nomP.setCellValueFactory(new PropertyValueFactory<Promotion, String>("nom_produit"));
            prixPr.setCellValueFactory(new PropertyValueFactory<Promotion, Double>("prix_produit"));
            pourcen.setCellValueFactory(new PropertyValueFactory<Promotion, Integer>("pourcentage"));
            nv.setCellValueFactory(new PropertyValueFactory<Promotion, Double>("nv_prix"));
            
            
             ObservableList<Promotion> items = FXCollections.observableArrayList(findPromotion());
            tab2.setItems(items);  
        }
        
         catch (SQLException ex) {
            Logger.getLogger(FXMLPromotionController.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }    

    @FXML
    private void retour44(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuClient.fxml"));
            Parent root = loader.load();
           Scene homePageScene=new Scene(root); 
           Stage appStage =(Stage) ((Node) event.getSource()).getScene().getWindow(); 
           appStage.setScene(homePageScene); 
           appStage.show();
    }
    
}
