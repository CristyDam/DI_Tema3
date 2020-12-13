
package appusomicontrolmvc;

import java.beans.Introspector;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import proyectomicontrol.MiControl;

/**
 *
 * @author crist
 */
public class AppUsoMiControlMVC extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        MiControl miControl = new MiControl();
        
        StackPane rootMain = new StackPane();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MiControlView.fxml"));
        Pane rootMiControlView = fxmlLoader.load();
        rootMain.getChildren().add(rootMiControlView);
        
        miControl.setOnAction(new EventHandler<MouseEvent>() {
        
            @Override//esto quiero que haga
            public void handle(MouseEvent event) {
                System.out.println("Estas pulsando en la zona roja");
            }
        });
        
        
        Pane root = new Pane();
        root.getChildren().add(miControl);
        Scene scene = new Scene(rootMain);
        
        primaryStage.setTitle("AppUsoMiControlMVC");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
       
    }

   
    
}
