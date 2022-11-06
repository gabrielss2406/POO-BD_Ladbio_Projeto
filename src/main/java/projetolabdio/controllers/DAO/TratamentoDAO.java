package projetolabdio.controllers.DAO;

import projetolabdio.models.Tratamento;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 * Class for CREATE, READ objects of the table "Medico"
 * @author Francisco Pereira Guimaraes
 * @since 02/11/2022
 * @version 1.0
 */
public class TratamentoDAO extends ConnectionDAO{
    //DAO - Data Access Object
    boolean sucesso = false; //Para saber se funcionou

    /**
     * Function for CREATE a new object in the table "Medico"
     * @param tratamento Object of Medico that will be created
     * @return boolean variable (1 - success) (2 - fail)
     */
    public boolean insertTratamento(Tratamento tratamento) { //CREATE

        connectToDB();

        String sql = "INSERT INTO Tratamento() values(?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, String.valueOf(tratamento.getId()));
            pst.setString(2, String.valueOf(tratamento.getPreco()));
            pst.setString(3, tratamento.getDescricao());
            pst.setString(4, String.valueOf(tratamento.getData()));
            //pst.setString(3, tratamento.getFKpaciente);
            pst.execute();
            sucesso = true;
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    /**
     * Function to search for all Tratamentos of the Paciente with this CPF
     * @param cpf Primary key of "Paciente" table
     * @return a list with all Tratamentos found
     */
    public ArrayList<Tratamento> selectTratamento(String cpf) { //READ
        ArrayList<Tratamento> tratamentos = new ArrayList<>();
        connectToDB();
        String sql = "SELECT * FROM Tratamento WHERE Paciente_cpf=? ORDER BY data DESC";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            rs = pst.executeQuery();

            while (rs.next()) {
                Tratamento tratamentoAux = new Tratamento(rs.getInt("idTratamento"),rs.getFloat("preco"),rs.getString("descricao"), rs.getDate("data"), rs.getString("Paciente_cpf"));
                tratamentos.add(tratamentoAux);
            }
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return tratamentos;
    }
    
    /**
     * Function to search all attributes for Tratamento that have this ID
     * @param ID Primary key of "Tratamento" table
     * @return a list with all the information of the Tratamento found
     */
    public Tratamento selectPaciente(int ID) { //SELECT INFORMATIONS OF THIS ID
        connectToDB();
        String sql = "SELECT * FROM Tratamento WHERE idTratamento=?";
        Tratamento tratamento = null;

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, ID);
            rs = pst.executeQuery();

            if(rs != null && rs.next()){
                tratamento = new Tratamento(rs.getInt("idTratamento"),rs.getFloat("preco"),rs.getString("descricao"), rs.getDate("data"), rs.getString("Paciente_cpf"));
            }
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return tratamento;
    }
}
