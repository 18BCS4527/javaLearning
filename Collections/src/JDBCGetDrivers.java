import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

public class JDBCGetDrivers {
    public static void main(String[] args) {
        Enumeration<java.sql.Driver> drivers = DriverManager.getDrivers();
        System.out.println("Dinesh");
        while (drivers.hasMoreElements()) {
            java.sql.Driver driver = drivers.nextElement();
            System.out.println("Driver Name: " + driver.getClass().getName());
        }
    }
}