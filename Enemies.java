/**
 *

 * Project: Space Game
 * Purpose Details: Construction of a text-based Space Game using Java, create class, fields/characteristics and methods/behaviors.Having application print the objects.
 * Course:IST202
 * Author:Christina Yang
 * Date Developed:May26
 * Last Date Changed:May27
 * Revision:4
 */

/**
 * Class field is Enemies in this game
 * the characteristics are category and levels
 */

public class Enemies {
    private String category;
    private int levels;

    /**
     * Constructor
     */
    public Enemies(String category, int levels) {
        this.category = category;
        this.levels = levels;
    }

    /**
     * getter and setter
     */
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }


    public int getLevels() {
        return levels;
    }
    public void setLevels(int levels) {
        this.levels = levels;
    }
}