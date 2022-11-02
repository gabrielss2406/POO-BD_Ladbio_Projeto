package projetolabdio.controllers.DAO;
import projetolabdio.config.Db_Config;

import java.sql.*;

public abstract class ConnectionDAO {

    Connection con; //conexão
    PreparedStatement pst; // declaração(query) preparada - código em sql
    Statement st; //declaração(query) - código em sql
    ResultSet rs; //resposta do banco

    Db_Config config = new Db_Config();
    
    String user = config.getUser();
    String password = config.getPassword();
    String url = config.getUrl();

    public void connectToDB() {
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexao deu certo!");
        } catch(SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        }
    }
}
