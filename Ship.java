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
 * class is ship
 * characteristics are the model and size
 */
public class Ship {
    public int id;
    public String size;
    private int health;
    /**
     * constructor
     */
    public Ship(int id, String size, int health) {
        this.id = id;
        this.size = size;
        this.health = health;

    }
    /**
     * getter and setter
     */
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}



