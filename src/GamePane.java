import RES.MAZE.MapAndCalculations;
import RES.MAZE.ShowMaze;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;

import java.io.FileNotFoundException;

/**
 * Created by Lukasz on 2015-04-10.
 */
public class GamePane extends StackPane implements Runnable {

    private ImageView mainScreen = new ImageView(new Image("/RES/MAZE/MainScreen.png"));

    GamePane() throws FileNotFoundException {
//        setStyle("-fx-background-color: black");
        setPrefSize(960, 720);
        setScaleX(1.5);
        setScaleY(1.5);

        getChildren().add(mainScreen);
        MapAndCalculations.getMapFromFile();
        run();
        requestFocus();
        try {
            Thread.sleep(60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public synchronized void run() {
        setScaleX(1.5);
        setScaleY(1.5);

            setOnKeyPressed(e ->
            {
                if (e.getCode() == KeyCode.DOWN || e.getCode() == KeyCode.UP) {
                    MapAndCalculations.setMap(e.getCode());
                    getChildren().add(new ShowMaze(MapAndCalculations.getMapCellsToRender()));
                    MapAndCalculations.printMap();
                } else if (e.getCode() == KeyCode.LEFT || e.getCode() == KeyCode.RIGHT) {
                    MapAndCalculations.setPartyFacingDirection(e.getCode());
                    getChildren().add(new ShowMaze(MapAndCalculations.getMapCellsToRender()));
//                    MapAndCalculations.printMap();
                }
            });
        }
}
