package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class ConfigFileReader {

    public class configFile {

        Properties properties;

        public configFile(String FilePath) {

            try {
                FileInputStream Locator = new FileInputStream(FilePath);
                properties = new Properties();
                properties.load(Locator);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        public String getData(String ElementName) throws Exception {
            // Read value using the logical name as Key
            String data = properties.getProperty(ElementName);
            return data;
        }
}
