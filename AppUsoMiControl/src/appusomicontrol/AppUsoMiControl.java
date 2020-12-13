/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusomicontrol;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import proyectomicontrol.MiControl;

/**
 *
 * @author crist
 */
public class AppUsoMiControl extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        MiControl miControl = new MiControl();  //Instancio aqui miControl
        
        introspeccion();
        
        //Registarmos el evento q queremos q se produzca cuando se clicke el raton
        miControl.setOnAction(new EventHandler<MouseEvent>() {
        
            @Override//esto quiero que haga
            public void handle(MouseEvent event) {
                System.out.println("Estas pulsando en la zona roja");
            }
        });
        
        Pane root = new Pane();
        root.getChildren().add(miControl);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("AppUsoMiControl");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void introspeccion(){
        
        //mostrar por consola los constructores
   
            //miControl.getClass().getConstructor(arg0);
                
        //mostrar por consola los Metodos
        //mostrar por consola los Fields
        //mostrar por consola los Modifiers
        MiControl miControl = new MiControl();
        
        Method[] lisMethods = miControl.getClass().getDeclaredMethods();//guardo en un array los metodos de miControl
        Field[] lisFields = miControl.getClass().getFields();//guardo los campos de miControl
        
        // Mostrar por consola los Constructores.
        try {
            System.out.println("El constructor de mi control es: " + miControl.getClass().getConstructor());
            System.out.println("Los metodos son: "  );
            System.out.println("-----------------------METODOS----------------------------------------------");
            
            for(int i = 0; i<lisMethods.length; i++){
                System.out.println("\t" + lisMethods);
            }
            
            System.out.println("------------------------CAMPOS-----------------------------------------------");
            for(int i = 0; i<lisFields.length; i++){
                System.out.println("\t" + lisFields);
            }
            
            System.out.println("-----------------------MODIFICADORES------------------------------------------");
            System.out.println(miControl.getClass().getModifiers());
            
            
        } catch (Exception ex) {
            System.out.println("Error");
            
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
