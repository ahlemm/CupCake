/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entite.Patisserie;
import entite.User;
import java.io.File;
import service.ServicePatisserie;
import service.ServiceUser;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SortEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import static utile.Utils.patissier;

/**
 * FXML Controller class
 *
 * @author Mdin Ahlem
 */
public class PatisserieController implements Initializable {

    ObservableList listPat = FXCollections.observableArrayList();

    @FXML
    private Button patisserie;
    @FXML
    private TextField nom2;
    @FXML
    private TextField adresse2;
    @FXML
    private Button rechercher2;
    @FXML
    private TableColumn<?, ?> id_patisserie;
    @FXML
    private TableColumn<?, ?> nom_patisserie;
    @FXML
    private TableColumn<?, ?> spetialite;
    @FXML
    private TableColumn<?, ?> info_patisserie;
    @FXML
    private TableColumn<?, ?> adresse_patisserie;
    @FXML
    private TableColumn<?, ?> patissier;
    @FXML
    private TableView<?> listPatisserie;
    
    @FXML
    private TextField activite22;
   
    @FXML
    private Label label5;
    @FXML
    private Button voir_Map;
    @FXML
    private Button page_précédente1;
    @FXML
    private ImageView retour33;
    @FXML
    private Button deconnecti2;
    @FXML
    private ImageView retour331;
    @FXML
    private ImageView retour332;
    @FXML
    private AnchorPane browse1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void getAllPatisseries(ActionEvent event) {
        id_patisserie.setCellValueFactory(new PropertyValueFactory<>("id_patisserie"));
        nom_patisserie.setCellValueFactory(new PropertyValueFactory<>("nom_patisserie"));
        spetialite.setCellValueFactory(new PropertyValueFactory<>("activite"));
        info_patisserie.setCellValueFactory(new PropertyValueFactory<>("info_patisserie"));
        adresse_patisserie.setCellValueFactory(new PropertyValueFactory<>("adresse_patisserie"));
        patissier.setCellValueFactory(new PropertyValueFactory<>("patissier"));
      //  photo_pat.setCellValueFactory(new PropertyValueFactory<>("photo_patisserie"));

        ServicePatisserie sp = new ServicePatisserie();
        listPat = sp.getAllPatisserieApprouved();
        listPatisserie.setItems(listPat);
        label5.setText("");
        
    
        
        
        
    }
//
//    private void searchPatisserie(ActionEvent event) {
//        ServicePatisserie sp = new ServicePatisserie();
//       String x; String y;  String z;
//       listPatisserie.setEditable(true);
//        
//          id_patisserie.setCellValueFactory(new PropertyValueFactory<>("id_patisserie"));
//		nom_patisserie.setCellValueFactory(new PropertyValueFactory<>("nom_patisserie"));
//		spetialite.setCellValueFactory(new PropertyValueFactory<>("activite"));
//		info_patisserie.setCellValueFactory(new PropertyValueFactory<>("info_patisserie"));
//		adresse_patisserie.setCellValueFactory(new PropertyValueFactory<>("adresse_patisserie"));
//                  patissier.setCellValueFactory(new PropertyValueFactory<>("patissier"));
//
//            
//
//  listPat= (ObservableList) sp.searchPatisserie(nom2.getText(), activite22.getText(), adresse2.getText() );
//       listPatisserie.setItems(listPat);
//        
//    }

    @FXML
    private void searchPatisserie(ActionEvent event) {
        ServicePatisserie sp = new ServicePatisserie();
        listPatisserie.setEditable(true);

        id_patisserie.setCellValueFactory(new PropertyValueFactory<>("id_patisserie"));
        nom_patisserie.setCellValueFactory(new PropertyValueFactory<>("nom_patisserie"));
        spetialite.setCellValueFactory(new PropertyValueFactory<>("activite"));
        info_patisserie.setCellValueFactory(new PropertyValueFactory<>("info_patisserie"));
        adresse_patisserie.setCellValueFactory(new PropertyValueFactory<>("adresse_patisserie"));
        patissier.setCellValueFactory(new PropertyValueFactory<>("patissier"));

        if (nom2.getText().equals("") && activite22.getText().equals("") && adresse2.getText().equals("")) {
            label5.setText("veuillez remplir au minimum un champ de recherche");
        } else {
            listPat = sp.searchPatisserie(nom2.getText(), activite22.getText(), adresse2.getText());
            listPatisserie.setItems(listPat);
        }

    }

    @FXML
    private void voir_map(ActionEvent event) throws IOException {
        
         FXMLLoader loader = new FXMLLoader(getClass().getResource("Gmaps.fxml"));
            Parent root = loader.load();
           Scene homePageScene=new Scene(root); 
           Stage appStage =(Stage) ((Node) event.getSource()).getScene().getWindow(); 
           appStage.setScene(homePageScene); 
           appStage.show();
        
        
    }

    @FXML
    private void page_précédente1(ActionEvent event) throws IOException {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuClient.fxml"));
            Parent root = loader.load();
           Scene homePageScene=new Scene(root); 
           Stage appStage =(Stage) ((Node) event.getSource()).getScene().getWindow(); 
           appStage.setScene(homePageScene); 
           appStage.show();
    }

    @FXML
    private void deconnecti(ActionEvent event) throws IOException {
          FXMLLoader loader = new FXMLLoader(getClass().getResource("Authentification.fxml"));
        Parent root = loader.load();
        Scene homePageScene = new Scene(root);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(homePageScene);
        appStage.show();
    }

    private void afficher_photo(ActionEvent event) {
        
            listPatisserie.setEditable(true);
        int selectedIndex = listPatisserie.getSelectionModel().getSelectedIndex();

        Patisserie p = (Patisserie) listPatisserie.getSelectionModel().getSelectedItem();
                             Label iconLabel = new Label();
                             ImageView imv=new ImageView(new Image(p.getPhoto_patisserie()));
                             imv.setFitHeight(50);
                             imv.setFitWidth(50);
                            
   iconLabel.setGraphic(imv);
    }

 
}
