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
        lbl.setFont(new Font("Arial", 16));//تحديد نوع وحجم النص
        lbl.setTextFill(Color.RED);//تحديد لون النص
        Label lbl2 = new Label();
        lbl2.setFont(new Font("Arial", 16));//تحديد حجم ونوع النص
        lbl2.setTextFill(Color.RED);//تحديد لون النص
        lbl2.setText("PassWord");//وضع نص داخل المربع
        TextField username = new TextField();
        PasswordField password = new PasswordField();
        HBox r = new HBox(lbl, username);
        r.setSpacing(25);//مسافة 
        r.setAlignment(Pos.CENTER);// التحكم في الموضع
        username.setPromptText("ENTER USERNAME");//لوضع نص داخل المربع
        password.setPromptText("ENTER PASSWORD");//لوضع نص داخل المربع
        username.setFocusTraversable(false);//لعدم التركيز على النص داخل المربع
        password.setFocusTraversable(false);//لعدم التركيز على النص داخل المربع
        Separator sp = new Separator();//لوضع خط فاصل 
        HBox r2 = new HBox(lbl2, password);
        r2.setSpacing(25);//وضع مسافه بينه وبين الاشياء الاخرى
        r2.setAlignment(Pos.CENTER);//التحكم في مكان تواجده

        CheckBox cb = new CheckBox("remember me");//لعمل check box 
        cb.setTextFill(Color.BLUE);
        cb.setFont(new Font("Arial", 12));

        Button btn = new Button("Login");//انشاء زر واعطاؤه اسم
        btn.setFont(new Font("Arial", 16));//التحكم في نوع وحجم النص
        btn.setTextFill(Color.CYAN);//التحكم في لون النص
        btn.setBackground(new Background(new BackgroundFill(Color.BLACK, new CornerRadii(16), Insets.EMPTY)));//التحكم في تفاصيل الزر
        VBox root = new VBox(20);//استدعاء مربع الواجهة
        root.getChildren().addAll(r, r2, sp, btn, cb);//لاضافة الازرار داخل الواجهة 
        root.setAlignment(Pos.CENTER);//للتحكم في اماكن وجود الازرار
        root.setBackground(Background.EMPTY);//للتحكم في الخلفية الاخاصة في الروت (الخافية الرئيسية)
        root.setPadding(new Insets(8)); //لتحديد الحواف الداخلية للزر
        Scene s = new Scene(root, 720, 410);//اضافة بيانات الازرار
        s.setFill(Color.PEACHPUFF);//تحديد لون الخلفية
        stage.setScene(s);//ربط المتغيرالي عملناه مع الشاشة
        stage.setResizable(false);//يمنع المستخدم من تغيير حجم النافذة
        stage.setMaximized(false);//يمنع النافذة من الفتح بحجم الشاشةالكامل
        stage.setTitle("Login");//يضع عنوان للواجهة
        stage.setAlwaysOnTop(false);//يحدد وضع ملئ الشاشة
        stage.show();//يعرض النافذة للمستخدم

    }

    public static void main(String[] args) {
        launch(args);//لازم استدعائها عشان يشتغل البرنامج صح
    }

}
