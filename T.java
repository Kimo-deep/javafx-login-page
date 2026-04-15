Delete unwanted file

package t;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class T extends Application{
    public static void main(String[] args) {
        launch(args);        
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button btn = new Button();
        btn.setText("Karim Anan");
        VBox root = new VBox();
        root.getChildren().add(btn);
        Scene s = new Scene(root,720,410);
        stage.setScene(s);
        stage.show();
    }
    
}
