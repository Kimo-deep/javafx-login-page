package t;

import javafx.application.Application;
import javafx.geometry.NodeOrientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class info extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        
        
        
        Image img = new Image(getClass().getResourceAsStream("/image/722e4a4f17cd633f56a3f2b6e0633f02.jpg"));
        ImageView iv = new ImageView(img);
        iv.setFitHeight(120);
        iv.setFitWidth(80);
        iv.setTranslateX(250);
        iv.setTranslateY(160);

        Text tx = new Text("text");//لا يوجد له جرافيك
        tx.setTranslateX(360);
        tx.setTranslateY(155);

        /* TextArea txa = new TextArea();//منطقة كتابة
        txa.setWrapText(true);
        txa.setTranslateX(360);
        txa.setTranslateY(150);
        txa.setPrefSize(150, 120);
        txa.setFocusTraversable(false);
        txa.setPromptText("enter your massege");*/
        Label lbl = new Label("test1");
        lbl.setTranslateX(360);
        lbl.setTranslateY(160);

        Label lbl1 = new Label("test2");
        lbl1.setTranslateY(175);
        lbl1.setTranslateX(360);

        Label lbl2 = new Label("test3");

        Label lbl3 = new Label("test4");

        Button btn = new Button("Click Me");
        btn.setTranslateX(345);
        btn.setTranslateY(190);

        Group root2 = new Group(lbl, lbl1, iv, btn/*,txa*/);//يجمع العناصر فوق بعض في اقصى الشمال من الاعلى داخل الواجهة

        //VBox root = new VBox(25, lbl, lbl1, btn);
        Scene s = new Scene(root2, 720, 410);
        s.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);//تحويل الواجهة للعربي
        stage.setScene(s);
        stage.setTitle("info 1");
        stage.setResizable(false);
        stage.setAlwaysOnTop(false);
        stage.setAlwaysOnTop(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
