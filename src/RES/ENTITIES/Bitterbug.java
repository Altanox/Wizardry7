package RES.ENTITIES;

import RES.Mechanics;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Łukasz Rutkowski on 2015-04-09.
 */
public class Bitterbug extends Bug {
    public Bitterbug() {
        setName("Bitterbug");
        setNameUnidentified(super.getNameUnidentified());
        setHealth(Mechanics.RandomValuesDice(2, 7));
        setStamina(Mechanics.RandomValuesDice(60, 120));
        setDefaultNumOfAppearances((byte) Mechanics.RandomValuesDice(1, 4));
        setExperiencePoints(Mechanics.RandomValuesDice(60, 80));
        setHeadArmorVal(1);
        setBodyArmorVal(3);
        setLegArmorVal(0);
        setResistanceFire((byte) 0);
        setResistanceWater((byte) 20);
        setResistanceEarth((byte) 20);
        setResistanceAir((byte) 60);
        setResistanceHoly((byte) 0);
        setResistanceMental((byte) 10);
        setResistanceMissiles((byte) 50);
        setResistanceNether((byte) 0);
        setResistancePoison((byte) 60);
        setResistanceDeath((byte) 0);

        Map<String, Integer> limbs = new HashMap<String, Integer>();
        limbs.put(super.getLeg(), this.getLegArmorVal());
        limbs.put(super.getBody(), this.getBodyArmorVal());
        limbs.put(super.getHead(), this.getHeadArmorVal());

    }

}
