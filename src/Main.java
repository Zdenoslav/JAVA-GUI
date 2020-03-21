import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

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
        stage2.setWidth(400);
        stage2.setHeight(300);

        stage2.setX(50);
        stage2.setY(100);
        stage2.show();

        Stage newWindow = new Stage();
        newWindow.initStyle(StageStyle.UNDECORATED);

        //Modality
        newWindow.initModality(Modality.WINDOW_MODAL);
        newWindow.initOwner(stage2);

        newWindow.show();

    }

    @Override
    public void stop() throws Exception {
        System.out.println("after!!");
    }

        public static void main(String[] args){

            launch();
        }

}
