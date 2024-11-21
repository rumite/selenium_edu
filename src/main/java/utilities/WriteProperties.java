package utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WriteProperties {
    public static void main(String[] args) {
        Properties prop = new Properties();
        OutputStream writeFile = null;

        try {
            writeFile = new FileOutputStream("config.properties");
            prop.setProperty("DBServer", "ins01.kui02.timur");
            prop.setProperty("DBName", "db_timur");
            prop.setProperty("DBPass", "qwertyprop");

            prop.store(writeFile, null);
            System.out.println("Properties created");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writeFile != null) {
                try {
                    writeFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
