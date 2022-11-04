package projetolabdio.controllers.DAO;

import projetolabdio.config.Db_Config;

import java.sql.*;

/**
 * Mother class for all DAO's class
 * @author Francisco Pereira Guimaraes
 * @since 02/11/2022
 * @version 1.0
 */
public abstract class ConnectionDAO {

    Connection con; //connection
    PreparedStatement pst; // (query) - SQL code
    Statement st; // (query) - SQL code
    ResultSet rs; //response

    //Config DataBase
    Db_Config config = new Db_Config();

    //Information for connect to DB
    String user = config.getUser();
    String password = config.getPassword();
    String url = config.getUrl();

    /**
     * Function for connect to DB
     */
    public void connectToDB() {
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexao deu certo!");
        } catch(SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        }
    }
}
