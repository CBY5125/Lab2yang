

/**
 * Project:Lab2 Database Assignment Space Game Data stored in MySQL, and Mongo
 * Purpose Details: Using CRUD to operate for both databases MySQL, and Mongo.
 * Course:IST242
 * Author:Christina Yang
 * Date Developed:6/2
 * Last Date Changed:6/4
 * Rev:3

 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * MySQL is the class that interact with a MySQL database.
 * The JDBC URL for connecting to the MySQL database along with the unsername and password
 *
 */
public class MySQL {
    private static final String JDBC_URL = "jdbc:mysql://127.0.0.1:3306/spacegame";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "IST888IST888";
    /**
     *   CRUD operations on the MySQL database.
     */

    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // Create
            insertShip(connection, 1, "small", 100);

            // Read
            List<Ship> ships = getAllShip(connection);
            for (Ship s : ships) {
                System.out.println(s);
            }

            // Update
            updateShip(connection, 1, 60);

            // Read again
            ships = getAllShip(connection);
            for (Ship s : ships) {
                System.out.println(s);
            }

            // Delete
            deleteShip(connection, 1);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Inserts a ship into the database
     */

    private static void insertShip(Connection connection, int id, String size, int health) {
        String sql = "INSERT INTO ship (id, size, health) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, size);
            preparedStatement.setInt(3, health);
            int rows = preparedStatement.executeUpdate();
            System.out.println("Insert operation: " + (rows > 0 ? "Success" : "Failure"));
            System.out.println("Ship Health: " + health);
        } catch (SQLException e) {
            System.out.println("Insert operation: Failure");
            e.printStackTrace();
        }
    }
    /**
     * Retrieves all ships from the database.
     * @return list of ships.
     */
    private static List<Ship> getAllShip(Connection connection) {
        List<Ship> ships = new ArrayList<>();
        String sql = "SELECT id, size, health FROM ship";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String size = resultSet.getString("size");
                int health = resultSet.getInt("health");
                ships.add(new Ship(id, size, health));
                System.out.println("Read Ship: ID=" + id + ", Size=" + size + ", Health=" + health);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ships;
    }

    /**
     * Update the health for the ship
     */
    private static void updateShip(Connection connection, int id, int newHealth) {
        String sql = "UPDATE ship SET health = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, newHealth);
            preparedStatement.setInt(2, id);
            int rows = preparedStatement.executeUpdate();
            System.out.println("Update operation: " + (rows > 0 ? "Success" : "Failure"));
            if (rows > 0) {
                System.out.println("Updated Ship Health: " + newHealth);
            }
        } catch (SQLException e) {
            System.out.println("Update operation: Failure");
            e.printStackTrace();
        }
    }

    /**
     * Delete the ID ship from database
     */

    private static void deleteShip(Connection connection, int id) {
        String sql = "DELETE FROM ship WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            int rows = preparedStatement.executeUpdate();
            System.out.println("Delete operation: " + (rows > 0 ? "Success" : "Failure"));
        } catch (SQLException e) {
            System.out.println("Delete operation: Failure");
            e.printStackTrace();
        }
    }
}