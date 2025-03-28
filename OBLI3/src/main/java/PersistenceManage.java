import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties config = new Properties();

        try (InputStream input = Main.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                throw new RuntimeException("Unable to find config.properties");
            }
            config.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config.properties", e);
        }

        Properties props = new Properties();
        props.setProperty("jakarta.persistence.jdbc.url", config.getProperty("db.url"));
        props.setProperty("jakarta.persistence.jdbc.user", config.getProperty("db.user"));
        props.setProperty("jakarta.persistence.jdbc.password", config.getProperty("db.password"));
        props.setProperty("jakarta.persistence.jdbc.driver", "org.postgresql.Driver");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("personPersistenceUnit", props);

        // Your code using EntityManager here...
    }
}
