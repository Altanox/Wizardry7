package RES.ENTITIES;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Created by Łukasz Rutkowski on 2015-04-09.
 */
public abstract class Bug extends Entity {

    private final ImageView animation = new ImageView(new Image("/RES/ENTITIES/PICS/bug.gif"));

    private final String leg = "leg";
    private final String body = "body";
    private final String head = "head";

    private int legArmorVal;
    private int bodyArmorVal;
    private int headArmorVal;

    public ImageView getAnimation() {
        return animation;
    }

    @Override
    public void setNameUnidentified(String nameUnidentified) {
        super.setNameUnidentified("Bug");
    }

    public void setLegArmorVal(int legArmorVal) {
        this.legArmorVal = legArmorVal;
    }

    public void setBodyArmorVal(int bodyArmorVal) {
        this.bodyArmorVal = bodyArmorVal;
    }

    public void setHeadArmorVal(int headArmorVal) {
        this.headArmorVal = headArmorVal;
    }

    public String getHead() {
        return head;
    }

    public String getBody() {
        return body;
    }

    public String getLeg() {
        return leg;
    }

    public int getLegArmorVal() {
        return legArmorVal;
    }

    public int getBodyArmorVal() {
        return bodyArmorVal;
    }

    public int getHeadArmorVal() {
        return headArmorVal;
    }
}
