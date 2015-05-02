import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

/**
 * Created by Łukasz Rutkowski on 2015-04-09.
 */
public class Main extends Application
{
    public static void main(String[] args) throws FileNotFoundException
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        GamePane gamePane = new GamePane();
        Scene scene = new Scene(gamePane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Wizardry 7: Crusader of Dark Savant");
        primaryStage.setResizable(false);
        primaryStage.setAlwaysOnTop(false);
        primaryStage.show();
        gamePane.requestFocus();
    }
}