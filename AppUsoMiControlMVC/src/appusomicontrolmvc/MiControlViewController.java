/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusomicontrolmvc;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.Application.launch;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import proyectomicontrol.MiControl;

/**
 * FXML Controller class
 *
 * @author crist
 */
public class MiControlViewController implements Initializable {

    @FXML
    private Label lbMiControl;
    @FXML
    private MiControl miControl;
    @FXML
    private Label lbEstado;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void OnAcctionMouseClicked(MouseEvent event) throws NoSuchMethodException 
    {
        
            // Mostrar por consola los Constructores.
            System.out.println("------------------------------------------- Contructors -------------------------------------------");
            System.out.println(miControl.getClass().getConstructor());


            // Mostrar por consola los Métodos.
            Method[] listaMetodos;

            listaMetodos = miControl.getClass().getMethods();

            // Lista todos los métodos
            System.out.println("\n------------------------------------------- Methods -------------------------------------------");
            for(Method metodo: listaMetodos)
            System.out.println(metodo);


            // Mostrar por consola los Fields.
            Field[] listaFields;

            listaFields = miControl.getClass().getFields();

            // Lista todos los fields
            System.out.println("\n------------------------------------------- Fields -------------------------------------------");
            for(Field field: listaFields)
            System.out.println(field);


            // Mostrar por consola los Modifiers.
            System.out.println("\n------------------------------------------- Modifiers -------------------------------------------");
            System.out.println(miControl.getClass().getModifiers());
    }
    
    
    
    
}
