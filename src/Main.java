import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void init() throws Exception {
        System.out.println("Before");
    }


    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("a cool window");
        stage.show();

        Stage stage2 = new Stage();
        stage2.setTitle("Second window");
        stage2.setWidth(1920);
        stage2.setHeight(1080);
        stage2.show();


    }

    @Override
    public void stop() throws Exception {
        System.out.println("after!!");
    }

        public static void main(String[] args){

            launch();
        }

}
