import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.MenuItem;




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

        MenuItem item1 = new MenuItem("Taco");
        MenuItem item2 = new MenuItem("Burrito");
        MenuItem item3 = new MenuItem("Cheese insalda");
        MenuItem item4 = new MenuItem( " Coca coal");

        MenuButton menuButton = new MenuButton("Favourtite Mexican food", null, item1, item2, item3, item4);
        Label food = new Label("No food selected");

        item1.setOnAction(e -> {
            food.setText("Food: Taco");
        });

        item2.setOnAction(e -> {
            food.setText("Food: burrito");
        });

        item3.setOnAction(e -> {
            food.setText("Food: Cheese");
        });

        item4.setOnAction(e -> {
            food.setText("Food: Salad");
        });

        ToggleButton button1 = new ToggleButton("Blue");
        ToggleButton button2 = new ToggleButton("Pink");
        ToggleButton button3 = new ToggleButton(" Purple");
        ToggleGroup  buttonGroup = new ToggleGroup();
        button1.setToggleGroup(buttonGroup);
        button2.setToggleGroup(buttonGroup);
        button3.setToggleGroup(buttonGroup);

        RadioButton r1 = new RadioButton("Brown");
        RadioButton r2 = new RadioButton("Green");
        r1.setToggleGroup(buttonGroup);
        r2.setToggleGroup(buttonGroup);

        root.getChildren().addAll(menuButton, food, button1, button2, button3, r1, r2);

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
