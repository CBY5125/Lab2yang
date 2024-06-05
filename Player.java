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
 * class is player
 * characteristics is name, score, health, ID
 */
public class Player {
    public String name;
    private int score;
    private int health;
    private int ID;

    /**
     * constructor
     */
    public Player(String name, int score, int health, int ID) {
        this.name = name;
        this.score = score;
        this.health = health;
        this.ID = ID;
    }

    /**
     * getter and setter
     */
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
}
