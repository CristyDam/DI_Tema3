/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomicontrol;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Region;

/**
 *
 * @author crist
 */

//extends Region es heredero de nodo de la cual hereda las propiedades
public class MiControl extends Region {
    
    //constructor de mi control
    public MiControl(){ 
        super();//llama al constructor del padre
        
        // marca la zona donde hacer click 
        setStyle("-fx-border-color:red;"); //Caracteristicas de estilo
        setPrefSize(100, 100); 
        
        this.setOnMouseClicked(new EventHandler<MouseEvent>(){
        
            //sobrescribo el manejador de el evento en el handle
            @Override 
            public void handle(MouseEvent event) { 
                onActionProperty().get().handle(event); //onActionProperty pq es un metodo de tipo get q va a devolver una propiedad de la clase
            } 
            //Property es solo lectura solo admite get
        }); 
    } 

 
    //Se define una propiedad propertyOnAction
    private ObjectProperty<EventHandler<MouseEvent>> propertyOnAction = new SimpleObjectProperty<EventHandler<MouseEvent>>();

    public final ObjectProperty<EventHandler<MouseEvent>> onActionProperty() {
        return propertyOnAction;
    } 
    public final void setOnAction(EventHandler<MouseEvent> handler) { 
        propertyOnAction.set(handler);
    
    } 
    public final EventHandler<MouseEvent> getOnAction() { 
        return propertyOnAction.get();
    }

}
