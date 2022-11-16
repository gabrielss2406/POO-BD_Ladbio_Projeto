package projetolabdio.controllers.DAO;

import projetolabdio.models.Paciente;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 * Class to CREATE, READ, UPDATE, DELETE objects of the table "Paciente"
 * @author Francisco Pereira Guimaraes
 * @since 02/11/2022
 * @version 1.0
 */
public class PacienteDAO extends ConnectionDAO{
    //DAO - Data Access Object
    boolean sucesso = false; //Para saber se funcionou

    /**
     * Function to CREATE a new object in the table "Medico"
     * @param paciente Object of Paciente that will be created
     * @return boolean variable (1 - success) (2 - fail)
     */
    public boolean insertPaciente(Paciente paciente) { //CREATE

        connectToDB();

        String sql = "INSERT INTO Paciente() values(?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, paciente.getCpf());
            pst.setString(2, paciente.getNome());
            pst.setString(3, paciente.getEndereco());
            pst.setString(4, paciente.getTelefone());
            pst.setString(5, String.valueOf(paciente.getIdade()));
            //pst.setString(6, paciente.chave de medico);
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
     * Function to search for all Paciente belonging to this Medico
     * @param CRM Primary key of "Medico" table
     * @return a list with all Pacientes found
     */
    public ArrayList<Paciente> selectPacientesList(int CRM) { //READ ALL PACIENTES
        ArrayList<Paciente> pacientes = new ArrayList<>();
        connectToDB();
        String sql = "SELECT * FROM Paciente WHERE Medico_crm=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, CRM);
            rs = pst.executeQuery();

            while (rs.next()) {
                Paciente pacienteAux = new Paciente(rs.getInt("idade"),rs.getString("cpf"),rs.getString("nome"), rs.getString("telefone"), rs.getString("endereco"), rs.getInt("Medico_crm"));
                pacientes.add(pacienteAux);
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
        return pacientes;
    }

    /**
     * Function to search all attributes for Paciente who has this CPF
     * @param CPF Primary key of "Paciente" table
     * @return a list with all the information of the Paciente found
     */
    public Paciente selectPaciente(String CPF) { //SELECT INFORMATIONS OF THIS CPF
        connectToDB();
        String sql = "SELECT * FROM Paciente WHERE cpf=?";
        Paciente paciente = null;

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, CPF);
            rs = pst.executeQuery();

            if(rs != null && rs.next()){
                paciente = new Paciente(rs.getInt("idade"),rs.getString("cpf"),rs.getString("nome"), rs.getString("telefone"), rs.getString("endereco"), rs.getInt("Medico_crm"));
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
        return paciente;
    }

    /**
     * Function to update the telefone of the Paciente who has this CPF
     * @param CPF Primary key of "Paciente" table
     * @param telefone Attribute that will be updated
     * @return boolean variable (1 - success) (2 - fail)
     */
    public boolean updatePacienteTelefone(int CPF, String telefone) { //UPDATE
        connectToDB();
        String sql = "UPDATE Paciente SET telefone=? where id=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, telefone);
            pst.setInt(3,CPF);
            pst.execute();
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
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
     * Function to update the endereço of the Paciente who has this CPF
     * @param CPF Primary key of "Paciente" table
     * @param endereco Attribute that will be updated
     * @return boolean variable (1 - success) (2 - fail)
     */
    public boolean updatePacienteEndereco(int CPF, String endereco) { //UPDATE
        connectToDB();
        String sql = "UPDATE Paciente SET endereco=? where id=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, endereco);
            pst.setInt(2,CPF);
            pst.execute();
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
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
     * Funtion to DELETE the Paciente who has this CPF
     * @param CPF Primary key of "Paciente" table
     * @return boolean variable (1 - success) (2 - fail)
     */
    public boolean deletePaciente(String CPF) { //DELETE
        connectToDB();
        String sql = "DELETE FROM Paciente where cpf=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, CPF);
            pst.execute();
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
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


}

