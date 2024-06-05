/**

 * Project: Space Game
 * Purpose Details: Construction of a text-based Space Game using Java, create class, fields/characteristics and methods/behaviors.Having application print the objects.
 * Course:IST202
 * Author:Christina Yang
 * Date Developed:May26
 * Last Date Changed:May27
 * Revision:4

 */


public class Main {
    public static void main(String[] args) {
        Player player = new Player("kate", 50, 5, 32456);
        Ship ship = new Ship(1,"small",100);
        Obstacles obstacles = new Obstacles(-5, "Aliens");
        PowerUps powerUps = new PowerUps(10, "Laser");
        Enemies enemies = new Enemies("Aliens", 7);

        Game game = new Game(player, ship, obstacles, powerUps, enemies);

        System.out.println("start game");
        System.out.println("Player{name='" + player.getName() + "', health=" + player.getHealth() + ", ID=" + player.getID() + ", score=" + player.getScore() + "}");
        System.out.println("Ship{id='" + ship.getId() +"', size='" + ship.getSize() +"',  health='"+ ship.getHealth() + "'}");
        System.out.println("Obstacles{damage=" + obstacles.getDamage() + ", type='" + obstacles.getType() + "'}");
        System.out.println("PowerUps{strength=" + powerUps.getStrength() + ", powerType='" + powerUps.getPowerType() + "'}");
        System.out.println("Enemies{category='" + enemies.getCategory() + "', levels=" + enemies.getLevels() + "}");
    }
}

