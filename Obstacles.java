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
 * Class is obstacles in this game
 * the characteristics are damage and type
 */
public class Obstacles {
    private int damage;
    private String type;
    /**
     * constructor
     */
    public Obstacles(int damage, String type) {
        this.damage = damage;
        this.type = type;
    }
    /**
     * getter and setter
     */
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
