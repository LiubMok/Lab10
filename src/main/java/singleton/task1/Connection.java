package singleton.task1;

import lombok.SneakyThrows;

import java.sql.DriverManager;
import java.sql.Statement;

public class Connection {
    public static Connection connection;

    private  java.sql.Connection dbConnection;
    @SneakyThrows
    private Connection(){
        dbConnection = DriverManager.getConnection("jdbc:sqlite:db.sqlite3");
    }
    @SneakyThrows
    public  void executeQuery(String query){
        Statement stmt = dbConnection.createStatement();
        stmt.executeUpdate(query);
    }

    public static Connection getConnection(){
//        статична фабрика
        if (connection == null) {
            connection = new Connection();
        }
        return connection;
    }
}
