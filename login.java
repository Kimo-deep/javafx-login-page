package t;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class login extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Label lbl = new Label("User Name");
        lbl.setFont(new Font("Arial", 16));
        lbl.setTextFill(Color.RED);
        Label lbl2 = new Label();
        lbl2.setFont(new Font("Arial", 16));
        lbl2.setTextFill(Color.RED);
        lbl2.setText("PassWord");
        TextField username = new TextField();
        PasswordField password = new PasswordField();
        HBox r = new HBox(lbl, username);
        r.setSpacing(25);
        r.setAlignment(Pos.CENTER);
        username.setPromptText("ENTER USERNAME");
        password.setPromptText("ENTER PASSWORD");
        username.setFocusTraversable(false);
        password.setFocusTraversable(false);
        Separator sp = new Separator();
        HBox r2 = new HBox(lbl2, password);
        r2.setSpacing(25);
        r2.setAlignment(Pos.CENTER);

        CheckBox cb = new CheckBox("remember me");
        cb.setTextFill(Color.BLUE);
        cb.setFont(new Font("Arial", 12));

        Button btn = new Button("Login");
        btn.setFont(new Font("Arial", 16));
        btn.setTextFill(Color.CYAN);
        btn.setBackground(new Background(new BackgroundFill(Color.BLACK, new CornerRadii(16), Insets.EMPTY)));
        VBox root = new VBox(20);
        root.getChildren().addAll(r, r2, sp, btn, cb);
        root.setAlignment(Pos.CENTER);
        root.setBackground(Background.EMPTY);
        root.setPadding(new Insets(8)); 
        Scene s = new Scene(root, 720, 410);
        s.setFill(Color.PEACHPUFF);
        stage.setScene(s);
        stage.setResizable(false);
        stage.setMaximized(false);
        stage.setTitle("Login");
        stage.setAlwaysOnTop(false);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
