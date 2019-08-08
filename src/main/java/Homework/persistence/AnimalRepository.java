package Homework.persistence;

import Homework.domain.Animal;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AnimalRepository {

    public void createAnimalItem(String name, int starving, int happiness, int health) throws SQLException, IOException, ClassNotFoundException {

        String insertSql = "INSERT INTO animal(name,starving,happiness,health) VALUES(?,?,?,?)";

        try (Connection connection = DatabaseConfiguration.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertSql)
        ) {
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, starving);
            preparedStatement.setInt(3, happiness);
            preparedStatement.setInt(4, health);

            preparedStatement.executeUpdate();
        }
    }

    public List<Animal> getAnimalItems() throws SQLException, IOException, ClassNotFoundException {

        String query = "SELECT id,name,starving,happiness,health FROM animal";

        try (Connection connection = DatabaseConfiguration.getConnection();
             Statement statement = connection.createStatement();
        ) {
            ResultSet resultSet = statement.executeQuery(query);
            List<Animal> animals = new ArrayList<>();

            while (resultSet.next()) {
                Animal animal = new Animal();
                animal.setId(resultSet.getLong("id"));
                animal.setName(resultSet.getString("name"));
                animal.setStarving(resultSet.getInt("starving"));
                animal.setHappiness(resultSet.getInt("happiness"));
                animal.setHealth(resultSet.getInt("health"));

                animals.add(animal);

            }
            return animals;
        }
    }

    public void deleteAnimalItem(long id) throws SQLException, IOException, ClassNotFoundException {
        String sql = "DELETE FROM animal WHERE id = ?";

        try (Connection connection = DatabaseConfiguration.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ) {
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        }
    }

    public void updateAnimalItem(long id, int starving, int happiness, int health) throws SQLException, IOException, ClassNotFoundException {
        String sql = "UPDATE animal SET starving =?,happiness=?,health=?  WHERE id = ?";

        try (Connection connection = DatabaseConfiguration.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ) {
            preparedStatement.setInt(1,starving);
            preparedStatement.setInt(2,happiness);
            preparedStatement.setInt(3,health);
            preparedStatement.setLong(4,id);

            preparedStatement.executeUpdate();
        }
    }
}
