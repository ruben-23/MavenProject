package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectareDB {

    private static final String URL = "jdbc:mysql://localhost:3306/liceu_db";
    private static final String USER = "root";
    private static final String PAROLA = "password";

    private static Connection conexiune;

    private ConectareDB() {}

    public Connection getConexiune() {

        if(conexiune == null){
            try {
                conexiune = DriverManager.getConnection(URL, USER, PAROLA);
            } catch(SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Conectarea la baza de date a esuat", e);
            }
        }

        return conexiune;
    }

    public static void closeConexiune(){

        if(conexiune != null){
            try{
                conexiune.close();
                conexiune = null;
            } catch(SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
