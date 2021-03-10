package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private TextField txtTempo;
    
    @FXML
    private Button btnCancella;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    @FXML
    void doInsert(ActionEvent event) {
    	// TODO
    	this.elenco.addParola(txtParola.getText());
    	String s = "";
    	for(String p : elenco.getElenco()) {
    		s+=p+"\n";
    	}
    	txtResult.setText(s);
    	txtParola.setText("");
    	String tempo = Long.toString(System.nanoTime());
    	txtTempo.setText(tempo);
    	
    }

    @FXML
    void doReset(ActionEvent event) {
    	// TODO
    	elenco.reset();
    	txtResult.setText("");
    	String tempo = Long.toString(System.nanoTime());
    	txtTempo.setText(tempo);
    	
    }
    
    @FXML
    void doCancella(ActionEvent event) {
    	
    	this.elenco.cancella(txtParola.getText());
    	
    	String s = "";
    	for(String p : elenco.getElenco()) {
    		s+=p+"\n";
    	}
    	txtResult.setText(s);
    	txtParola.setText("");
    	String tempo = Long.toString(System.nanoTime());
    	txtTempo.setText(tempo);
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTempo != null : "fx:id=\"txtTempo\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Scene.fxml'.";
        elenco = new Parole() ;
    }
}
//160764349635500   PIU' VELOCE LA LINKEDLIST!!!!1
//160815213141300