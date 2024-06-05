/**

 * Project: Space Game
 * Purpose Details: Construction of a text-based Space Game using Java, create class, fields/characteristics and methods/behaviors.Having application print the objects.
 * Course:IST202
 * Author:Christina Yang
 * Date Developed:May26
 * Last Date Changed:May27
 * Revision:4

 */

/**
 * class is PowerUps
 * characteristic is strength and powerType
 */
public class PowerUps {
    public int strength;
    public String powerType;
    /**
     * constructor
     */
    public PowerUps(int strength, String powerType) {
        this.strength = strength;
        this.powerType = powerType;
    }
    /**
     * getter and setter
     */
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }


    public String getPowerType() {
        return powerType;
    }
    public void setPowerType(String powerType) {
        this.powerType = powerType;
    }
}
