import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=test;user=test;password=test";

        try
        {
            System.out.println("Connecting to ..");
            try(Connection connection = DriverManager.getConnection(connectionUrl))
            {
                System.out.println("Done");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
