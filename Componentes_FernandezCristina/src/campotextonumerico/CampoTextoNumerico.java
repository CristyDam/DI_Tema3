/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campotextonumerico;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;

/**
 *
 * @author crist
 */
public class CampoTextoNumerico extends TextField {
    
    //Constructor
    public CampoTextoNumerico(){
        
        super();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CampoTextoNumericoView.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        
        try{
            fxmlLoader.load();
        }catch (IOException exception){
            throw  new RuntimeException(exception);
        }
    }
    
    //No permite escribir texto solo numero
    @Override
    public void replaceText(int start, int end, String text) 
    { 
        if (!text.matches("[a-z, A-Z]")) 
        { 
            super.replaceText(start, end, text); 
        }
        this.setText("Intruduce un campo numerico");
        
    } 
    @Override 
    public void replaceSelection(String text) 
    { 
        if (!text.matches("[a-z, A-Z]")) 
        {
            super.replaceSelection(text); 
        } 
        
    } 
       
}
