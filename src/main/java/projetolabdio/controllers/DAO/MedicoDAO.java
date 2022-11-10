package projetolabdio.controllers.DAO;

import projetolabdio.models.Medico;
import java.sql.SQLException;
/**
 * Class for CREATE, READ objects of the table "Medico"
 * @author Francisco Pereira Guimaraes
 * @since 02/11/2022
 * @version 1.0
 */
public class MedicoDAO extends ConnectionDAO{
    //DAO - Data Access Object
    boolean sucesso = false; //Para saber se funcionou

    /**
     * Function for CREATE a new object in the table "Medico"
     * @param medico Object of Medico that will be created
     * @return boolean variable (1 - success) (2 - fail)
     */
    public boolean insertMedico(Medico medico) { //CREATE

        connectToDB();

        String sql = "INSERT INTO Medico() values(?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, medico.getCrm());
            pst.setString(2, medico.getNome());
            pst.setString(3, medico.getEspecialidade());
            pst.setString(4, medico.getTelefone());
            pst.setString(5, medico.getSenha());
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
     * Function for verify if exists an object in the "Medico" table that has these attributes
     * @param CRM Primary key of "Medico" table
     * @param SENHA Password of "Medico" table
     * @return an object for the "Medico" table
     */
    public Medico selectMedicoLogin(int CRM, String SENHA) { //Read
        connectToDB();
        String sql = "SELECT * FROM `Medico` WHERE `crm`=? AND `senha`=?";
        Medico medico = null;

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, CRM);
            pst.setString(2, SENHA);
            rs = pst.executeQuery();
            if(rs != null && rs.next()){
                medico = new Medico(rs.getInt("crm"),rs.getString("nome"),rs.getString("telefone"), rs.getString("especialidade"), rs.getString("senha"));
            }
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                //st.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return medico;
    }
}
