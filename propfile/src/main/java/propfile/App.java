package propfile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class App {

    public static void main(String[] args) {

        try {
            Properties prop = new Properties();
            prop.load(App.class.getResourceAsStream("/app.properties"));

            String cfgUsername = prop.getProperty("USERNAME");
            String cfgGroup = prop.getProperty("GROUP");

            System.out.println("username: " + cfgUsername);
            System.out.println("group: " + cfgGroup);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}