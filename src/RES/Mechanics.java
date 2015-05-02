package RES;

/**
 * Created by Łukasz Rutkowski on 2015-04-10.
 */
public abstract class Mechanics
{
    public static int RandomValuesDice(int minVal, int maxVal)
    {
        return (int)(minVal + Math.random() *maxVal);
    }
}
