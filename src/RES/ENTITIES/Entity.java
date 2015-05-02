package RES.ENTITIES;

/**
 * Created by Łukasz Rutkowski on 2015-04-08.
 */
public abstract class Entity
{
    private String name;
    private String nameUnidentified;
    private String[] alliances;
    private byte defaultNumOfAppearances;
    private long experiencePoints;

    private int health;
    private int stamina;
    private int mana;

    //Armor classes for various body objects in more specific classes

    private int resistanceFire;
    private int resistanceWater;
    private int resistanceEarth;
    private int resistanceAir;
    private int resistanceMental;
    private int resistanceHoly;
    private int resistanceMissiles;
    private int resistanceDeath;
    private int resistancePoison;
    private int resistanceNether;

    public String getName()
    {
        return name;
    }

    public String getNameUnidentified()
    {
        return nameUnidentified;
    }

    public String[] getAlliances()
    {
        return alliances;
    }

    public byte getDefaultNumOfAppearances()
    {
        return defaultNumOfAppearances;
    }

    public long getExperiencePoints()
    {
        return experiencePoints;
    }

    public int getHealth()
    {
        return health;
    }

    public int getStamina()
    {
        return stamina;
    }

    public int getMana()
    {
        return mana;
    }

    public int getResistanceFire()
    {
        return resistanceFire;
    }

    public int getResistanceWater()
    {
        return resistanceWater;
    }

    public int getResistanceEarth()
    {
        return resistanceEarth;
    }

    public int getResistanceAir()
    {
        return resistanceAir;
    }

    public int getResistanceMental()
    {
        return resistanceMental;
    }

    public int getResistanceHoly()
    {
        return resistanceHoly;
    }

    public int getResistanceMissiles()
    {
        return resistanceMissiles;
    }

    public int getResistanceDeath()
    {
        return resistanceDeath;
    }

    public int getResistancePoison()
    {
        return resistancePoison;
    }

    public int getResistanceNether()
    {
        return resistanceNether;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setNameUnidentified(String nameUnidentified)
    {
        this.nameUnidentified = nameUnidentified;
    }

    public void setAlliances(String[] alliances)
    {
        this.alliances = alliances;
    }

    public void setDefaultNumOfAppearances(byte defaultNumOfAppearances)
    {
        this.defaultNumOfAppearances = 1;
    }

    public void setExperiencePoints(long experiencePoints)
    {
        this.experiencePoints = 0;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }

    public void setStamina(int stamina)
    {
        this.stamina = stamina;
    }

    public void setMana(int mana)
    {
        this.mana = mana;
    }

    public void setResistanceFire(byte resistanceFire)
    {
        this.resistanceFire = resistanceFire;
    }

    public void setResistanceWater(byte resistanceWater)
    {
        this.resistanceWater = resistanceWater;
    }

    public void setResistanceEarth(byte resistanceEarth)
    {
        this.resistanceEarth = resistanceEarth;
    }

    public void setResistanceAir(byte resistanceAir)
    {
        this.resistanceAir = resistanceAir;
    }

    public void setResistanceMental(byte resistanceMental)
    {
        this.resistanceMental = resistanceMental;
    }

    public void setResistanceHoly(byte resistanceHoly)
    {
        this.resistanceHoly = resistanceHoly;
    }

    public void setResistanceMissiles(byte resistanceMissiles)
    {
        this.resistanceMissiles = resistanceMissiles;
    }

    public void setResistanceDeath(byte resistanceDeath)
    {
        this.resistanceDeath = resistanceDeath;
    }

    public void setResistancePoison(byte resistancePoison)
    {
        this.resistancePoison = resistancePoison;
    }

    public void setResistanceNether(byte resistanceNether)
    {
        this.resistanceNether = resistanceNether;
    }
}
