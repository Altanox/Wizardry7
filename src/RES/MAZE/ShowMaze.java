package RES.MAZE;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;


/**
 * Created by Lukasz on 2015-04-10.
 */
public class ShowMaze extends StackPane
{
    private Image dungeonFloor = new Image("RES/MAZE/DUNGEON/16.PNG");
    private Image dungeonCeiling = new Image("RES/MAZE/DUNGEON/15.PNG");
    private ImageView showDungeonFloor = new ImageView(dungeonFloor);
    private ImageView showDungeonCeiling = new ImageView(dungeonCeiling);

    private Image dungeonLeftWall0 = new Image("RES/MAZE/DUNGEON/3.PNG");
    private Image dungeonRightWall0 = new Image("RES/MAZE/DUNGEON/7.PNG");
    private Image dungeonLeftWall1 = new Image("RES/MAZE/DUNGEON/4.PNG");
    private Image dungeonRightWall1 = new Image("RES/MAZE/DUNGEON/8.PNG");
    private Image dungeonLeftWall2 = new Image("RES/MAZE/DUNGEON/5.PNG");
    private Image dungeonRightWall2 = new Image("RES/MAZE/DUNGEON/9.PNG");
    private Image dungeonLeftWall3 = new Image("RES/MAZE/DUNGEON/6.PNG");
    private Image dungeonRightWall3 = new Image("RES/MAZE/DUNGEON/10.PNG");

    private Image dungeonOuterLeftWall1 = new Image("RES/MAZE/DUNGEON/11.PNG");
    private Image dungeonOuterLeftWall2 = new Image("RES/MAZE/DUNGEON/12.PNG");
    private Image dungeonOuterRightWall1 = new Image("RES/MAZE/DUNGEON/13.PNG");
    private Image dungeonOuterRightWall2 = new Image("RES/MAZE/DUNGEON/14.PNG");


    private Image dungeonFrontWall1 = new Image("RES/MAZE/DUNGEON/0.PNG");
    private Image dungeonFrontWall2 = new Image("RES/MAZE/DUNGEON/1.PNG");
    private Image dungeonFrontWall3 = new Image("RES/MAZE/DUNGEON/2.PNG");

    private Pane dngFloorCeiling = new Pane();
    private Pane dngPlanFirst = new Pane();
    private Pane dngPlanSecond = new Pane();
    private Pane dngPlanThird = new Pane();
    private Pane dngPlanFourth = new Pane();
    private Pane dngPlanFifth = new Pane();
    private Pane dngPlanSixth = new Pane();

    public ShowMaze(char[][] mapTable)
    {

        setMinSize(352, 240);
        setMinSize(352, 240);

        dngPlanFirst.setMinSize(352, 240);
        dngPlanSecond.setMinSize(352, 240);
        dngPlanThird.setMinSize(352, 240);
        dngPlanFourth.setMinSize(352, 240);
        dngPlanFifth.setMinSize(352, 240);
        dngPlanSixth.setMinSize(352, 240);


        //Clipper Object will cut extending nodes at the egres of ShowMazePane
        Rectangle clipper = new Rectangle(352, 225);
        clipper.setLayoutX(0);
        clipper.setLayoutY(0);
        setClip(clipper);

        dngFloorCeiling.getChildren().addAll(showDungeonFloor, showDungeonCeiling);
        showDungeonFloor.setX(0);
        showDungeonFloor.setY(96);
        showDungeonCeiling.setX(0);
        showDungeonCeiling.setY(0);

        if (mapTable[0][1] == 'd')
        {
            ImageView showDungeonLeftWall = new ImageView(dungeonLeftWall0);
            dngPlanFirst.getChildren().addAll(showDungeonLeftWall);
            showDungeonLeftWall.setX(0);
            showDungeonLeftWall.setY(2);
        }

        if (mapTable[0][3] == 'd')
        {
            ImageView showDungeonRightWall = new ImageView(dungeonRightWall0);
            dngPlanFirst.getChildren().addAll(showDungeonRightWall);
            showDungeonRightWall.setX(288);
            showDungeonRightWall.setY(2);
        }

        if (mapTable[1][2] == 'd')
        {
            ImageView showDungeonFrontWall1 = new ImageView(dungeonFrontWall1);
            dngPlanFirst.getChildren().add(showDungeonFrontWall1);
            showDungeonFrontWall1.setX(64);
            showDungeonFrontWall1.setY(24);
        }

        if (mapTable[1][1] == 'd')
        {
            ImageView showDungeonFrontWall1Left = new ImageView(dungeonFrontWall1);
            dngPlanSecond.getChildren().add(showDungeonFrontWall1Left);
            showDungeonFrontWall1Left.setX(-160);
            showDungeonFrontWall1Left.setY(24);
        }

        if (mapTable[1][3] == 'd')
        {
            ImageView showDungeonFrontWall1Right = new ImageView(dungeonFrontWall1);
            dngPlanSecond.getChildren().add(showDungeonFrontWall1Right);
            showDungeonFrontWall1Right.setX(288);
            showDungeonFrontWall1Right.setY(24);
        }

        if (mapTable[1][1] == 'd' && mapTable[1][2] != 'd')
        {
            ImageView showDungeonLeftWall1 = new ImageView(dungeonLeftWall1);
            dngPlanSecond.getChildren().add(showDungeonLeftWall1);
            showDungeonLeftWall1.setX(64);
            showDungeonLeftWall1.setY(24);
        }

        if (mapTable[1][3] == 'd' && mapTable[1][2] != 'd')
        {
            ImageView showDungeonRightWall1 = new ImageView(dungeonRightWall1);
            dngPlanSecond.getChildren().add(showDungeonRightWall1);
            showDungeonRightWall1.setX(240);
            showDungeonRightWall1.setY(24);
        }


        if (mapTable[2][2] == 'd' && mapTable[1][2] == ' ')
        {
            ImageView showDungeonFrontWall2 = new ImageView(dungeonFrontWall2);
            dngPlanSecond.getChildren().add(showDungeonFrontWall2);
            showDungeonFrontWall2.setX(96);
            showDungeonFrontWall2.setY(37);
        }

        if (mapTable[2][1] == 'd')
        {
            ImageView showDungeonFrontWall2Left = new ImageView(dungeonFrontWall2);
            dngPlanThird.getChildren().add(showDungeonFrontWall2Left);
            showDungeonFrontWall2Left.setX(-48);
            showDungeonFrontWall2Left.setY(37);
        }

        if (mapTable[2][3] == 'd')
        {
            ImageView showDungeonFrontWall2Right = new ImageView(dungeonFrontWall2);
            dngPlanThird.getChildren().add(showDungeonFrontWall2Right);
            showDungeonFrontWall2Right.setX(240);
            showDungeonFrontWall2Right.setY(37);
        }

        if (mapTable[2][1] == 'd')
        {
            ImageView showDungeonLeftWall2 = new ImageView(dungeonLeftWall2);
            dngPlanThird.getChildren().add(showDungeonLeftWall2);
            showDungeonLeftWall2.setX(96);
            showDungeonLeftWall2.setY(37);
        }

        if (mapTable[2][3] == 'd')
        {
            ImageView showDungeonRightWall2 = new ImageView(dungeonRightWall2);
            dngPlanThird.getChildren().add(showDungeonRightWall2);
            showDungeonRightWall2.setX(224);
            showDungeonRightWall2.setY(37);
        }

//        if(mapTable[2][0] == 'd')
//        {
//            ImageView showDungeonLeftWall2Left = new ImageView(dungeonLeftWall2);
//            dngPlanFourth.getChildren().add(showDungeonLeftWall2Left);
//            showDungeonLeftWall2Left.setX(0);
//            showDungeonLeftWall2Left.setY(37);
//        }
//
//        if(mapTable[2][4] == 'd' && mapTable[2][3] != 'd')
//        {
//            ImageView showDungeonLeftWall2Right = new ImageView(dungeonRightWall2);
//            dngPlanFourth.getChildren().add(showDungeonLeftWall2Right);
//            showDungeonLeftWall2Right.setX(320);
//            showDungeonLeftWall2Right.setY(37);
//        }


        if (mapTable[3][2] == 'd' && mapTable[2][2] != 'd')
        {
            ImageView showDungeonFrontWall3 = new ImageView(dungeonFrontWall3);
            dngPlanThird.getChildren().add(showDungeonFrontWall3);
            showDungeonFrontWall3.setX(128);
            showDungeonFrontWall3.setY(44);
        }

        if (mapTable[3][1] == 'd' && mapTable[2][1] != 'd')
        {
            ImageView showDungeonFrontWall3Left = new ImageView(dungeonFrontWall3);
            dngPlanFourth.getChildren().add(showDungeonFrontWall3Left);
            showDungeonFrontWall3Left.setX(32);
            showDungeonFrontWall3Left.setY(44);
        }

        if (mapTable[3][3] == 'd' && mapTable[2][3] != 'd')
        {
            ImageView showDungeonFrontWall3Right = new ImageView(dungeonFrontWall3);
            dngPlanFourth.getChildren().add(showDungeonFrontWall3Right);
            showDungeonFrontWall3Right.setX(224);
            showDungeonFrontWall3Right.setY(44);
        }

        if (mapTable[3][1] == 'd' && mapTable[3][2] != 'd')
        {
            ImageView showDungeonLeftWall3 = new ImageView(dungeonLeftWall3);
            dngPlanThird.getChildren().add(showDungeonLeftWall3);
            showDungeonLeftWall3.setX(128);
            showDungeonLeftWall3.setY(44);
        }

        if (mapTable[3][3] == 'd' && mapTable[3][2] != 'd')
        {
            ImageView showDungeonRightWall3 = new ImageView(dungeonRightWall3);
            dngPlanThird.getChildren().add(showDungeonRightWall3);
            showDungeonRightWall3.setX(208);
            showDungeonRightWall3.setY(44);
        }

        if (mapTable[3][0] == 'd' && mapTable[2][0] != 'd')
        {
            ImageView showDungeonFrontWall3Left2 = new ImageView(dungeonFrontWall3);
            dngPlanFifth.getChildren().add(showDungeonFrontWall3Left2);
            showDungeonFrontWall3Left2.setX(-64);
            showDungeonFrontWall3Left2.setY(44);
        }

        if (mapTable[3][4] == 'd' && mapTable[2][4] != 'd')
        {
            ImageView showDungeonFrontWall3Right2 = new ImageView(dungeonFrontWall3);
            dngPlanFifth.getChildren().add(showDungeonFrontWall3Right2);
            showDungeonFrontWall3Right2.setX(320);
            showDungeonFrontWall3Right2.setY(44);
        }

        if (mapTable[3][0] == 'd' && mapTable[2][0] == 'd')
        {
            ImageView showDungeOnouterWallLeft1 = new ImageView(dungeonOuterLeftWall1);
            dngPlanFifth.getChildren().add(showDungeOnouterWallLeft1);
            showDungeOnouterWallLeft1.setX(0);
            showDungeOnouterWallLeft1.setY(40);
        }

        if (mapTable[3][4] == 'd' && mapTable[2][4] == 'd')
        {
            ImageView showDungeonOuterRightWal1 = new ImageView(dungeonOuterRightWall1);
            dngPlanFifth.getChildren().add(showDungeonOuterRightWal1);
            showDungeonOuterRightWal1.setX(320);
            showDungeonOuterRightWal1.setY(40);
        }

        if (mapTable[4][0] == 'd' && mapTable[3][0] == 'd')
        {
            ImageView showDungeonOuterWallLeft2 = new ImageView(dungeonOuterLeftWall2);
            dngPlanSixth.getChildren().add(showDungeonOuterWallLeft2);
            showDungeonOuterWallLeft2.setX(32);
            showDungeonOuterWallLeft2.setY(44);
        }

        if (mapTable[4][4] == 'd' && mapTable[3][4] == 'd')
        {
            ImageView showDungeonOuterWallRight2 = new ImageView(dungeonOuterRightWall2);
            dngPlanSixth.getChildren().add(showDungeonOuterWallRight2);
            showDungeonOuterWallRight2.setX(278);
            showDungeonOuterWallRight2.setY(44);
        }

        getChildren().addAll(dngFloorCeiling, dngPlanSixth, dngPlanFifth, dngPlanFourth, dngPlanThird, dngPlanSecond,
                dngPlanFirst);
        setStyle("-fx-background-color: black");
        setTranslateX(310);
        setTranslateY(225);
    }
}
