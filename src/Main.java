import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.awt.*;


public class Main extends Application{

    @Override
    public void init() throws Exception {
        System.out.println("Before");
    }


    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Episdoe 4 - Stages");
        stage.setWidth(500);
        stage.setHeight(700);

        VBox root = new VBox();

        Hyperlink link = new Hyperlink("click me boy");

        link.setOnAction(e -> {
            System.out.println("thie link works");
        });

        root.getChildren().addAll(link);

        Scene scene = new Scene(root);
        stage.setScene(scene);


        stage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("after!!");
    }

        public static void main(String[] args){

            launch();
        }

}
