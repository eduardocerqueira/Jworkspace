package example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.net.InetAddress;

public class App {

    public static void main(String[] args) {
        String systemName;

        try {
            systemName = InetAddress.getLocalHost().getHostName();
            System.out.println("running on: " + systemName);

        } catch (Exception e) {
            e.printStackTrace();
        }

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("Example executed completed at: " + now.format(dateFormat) + "\n");
    }
}
