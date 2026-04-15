package t;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class info2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label result = new Label("result ");
        result.setTooltip(new Tooltip("result"));//لعرض معلومات عن العنصر عند الوقوف عليه دون الضغط
        result.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 16));//regular عادي
        result.setTextFill(Color.rgb(0, 0, 0));
        result.setCursor(Cursor.DISAPPEAR);//التحكم في زر الماوس

        Label lbl = new Label("number1 ");
        lbl.setTooltip(new Tooltip("number"));//لعرض معلومات عن العنصر عند الوقوف عليه دون الضغط
        lbl.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 16));//regular عادي
        lbl.setTextFill(Color.rgb(0, 0, 0));
        lbl.setCursor(Cursor.OPEN_HAND);//التحكم في زر الماوس
        lbl.setBorder(new Border(new BorderStroke(Color.BLUE, BorderStrokeStyle.SOLID, new CornerRadii(7), BorderWidths.DEFAULT)));//حدود حول العنصر

        Label lbl1 = new Label("number2");
        lbl1.setTooltip(new Tooltip("number"));//لعرض معلومات عن العنصر عند الوقوف عليه دون الضغط
        lbl1.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 16));//regular عادي
        lbl1.setTextFill(Color.rgb(140, 80, 20));
        lbl1.setCursor(Cursor.OPEN_HAND);//التحكم في زر الماوس
        lbl1.setBorder(new Border(new BorderStroke(Color.RED, BorderStrokeStyle.SOLID, new CornerRadii(7), BorderWidths.DEFAULT)));//حدود حول العنصر

        TextField tf1 = new TextField();
        tf1.setPromptText("set the number1");
        tf1.setFocusTraversable(false);

        TextField tf2 = new TextField();
        tf2.setPromptText("set the number2");
        tf2.setFocusTraversable(false);

        HBox h = new HBox(20, lbl, tf1);
        h.setAlignment(Pos.CENTER);
        HBox h1 = new HBox(20, lbl1, tf2);
        h1.setAlignment(Pos.CENTER);

        Button btn = new Button("Calc");
        btn.setTooltip(new Tooltip("press"));
        btn.setCursor(Cursor.HAND);
        btn.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 16));//regular عادي
        btn.setFocusTraversable(false);
        btn.setTextFill(Color.rgb(140, 80, 20));
        btn.setBorder(new Border(new BorderStroke(Color.RED, BorderStrokeStyle.SOLID, new CornerRadii(7), BorderWidths.DEFAULT)));//حدود حول العنصر

        ToggleButton tb = new ToggleButton("on");//زر ايقاف وتشغيل
        tb.setTooltip(new Tooltip("press"));
        tb.setCursor(Cursor.HAND);
        tb.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 16));//regular عادي
        tb.setFocusTraversable(false);
        tb.setTextFill(Color.rgb(140, 80, 20));
        tb.setBorder(new Border(new BorderStroke(Color.RED, BorderStrokeStyle.SOLID, new CornerRadii(7), BorderWidths.DEFAULT)));//حدود حول العنصر
        
        RadioButton rb = new RadioButton("male");// check button
        RadioButton rb1 = new RadioButton("female");
        ToggleGroup gr = new ToggleGroup();//button group
        rb.setToggleGroup(gr);
        rb1.setToggleGroup(gr);
        
        btn.setOnAction(e -> {//لاستخدام لمبدا لعمل العمليات الحسابية
            if (tf1.getText().equals("") && tf2.getText().equals("")) {
                result.setText("enter the numbers first");
                result.setTextFill(Color.RED);
            } else {
                int n1 = Integer.parseInt(tf1.getText());
                int n2 = Integer.parseInt(tf2.getText());
                int sum = n1 + n2;
                result.setText(sum + "");
                result.setTextFill(Color.GREEN);
            }
        });
        VBox root = new VBox(25, h, h1, btn, result, tb, rb, rb1);
        root.setAlignment(Pos.CENTER);
        Scene s = new Scene(root, 720, 410);
        stage.setScene(s);
        stage.show();
        stage.setResizable(false);

    }

}
