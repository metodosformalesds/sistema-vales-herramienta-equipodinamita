package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionBD {
    
    //Atributos de la clase.
    private static String URL = "jdbc:mysql://127.0.0.1/valesprestamo?autoReconnect=true&useSSL=false";
    private static String usuario = "root";
    private static String contra = "1234";
    
    //Metodos de la clase.
    
    //Metodo que realiza la conexion entre la base de datos y el programa.
    public static Connection Conectar (){
        Connection conexion  = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, usuario, contra);
            System.out.println("Conexion Establecida");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error" + e);
        }
        
        return conexion;
    }
}




