package helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyLoad {
    public String loadAPropetyFile(String propety) {
        try (InputStream input = new FileInputStream("config.properties")) {

            Properties prop = new Properties();

            prop.load(input);

            String getDriverFromFile = prop.getProperty(propety);
            return getDriverFromFile;

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
