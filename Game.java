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
 * Class is game
 * the characteristics are player, ship, obstacles, powerUps, enemies
 */
public class Game {
    private Player player;
    private Ship ship;
    private Obstacles obstacles;
    private PowerUps powerUps;
    private Enemies enemies;
    /**
     * constructor
     */
    public Game(Player player, Ship ship, Obstacles obstacles, PowerUps powerUps, Enemies enemies) {
        this.player = player;
        this.ship = ship;
        this.obstacles = obstacles;
        this.powerUps = powerUps;
        this.enemies = enemies;
    }
    /**
     * Getter and setter
     */
    public Player getPlayer() {
        return player;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }

    public Ship getShip() {
        return ship;
    }
    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public Obstacles getObstacles() {
        return obstacles;
    }
    public void setObstacles(Obstacles obstacles) {
        this.obstacles = obstacles;
    }

    public PowerUps getPowerUps() {
        return powerUps;
    }
    public void setPowerUps(PowerUps powerUps) {
        this.powerUps = powerUps;
    }

    public Enemies getEnemies() {
        return enemies;
    }
    public void setEnemies(Enemies enemies) {
        this.enemies = enemies;
    }
}
