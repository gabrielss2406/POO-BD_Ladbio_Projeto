package projetolabdio.controllers.DAO;

import projetolabdio.models.Paciente;
import java.sql.SQLException;
import java.util.ArrayList;

public class PacienteDAO extends ConnectionDAO{
    //DAO - Data Access Object
    boolean sucesso = false; //Para saber se funcionou

    //INSERT
    public boolean insertPaciente(Paciente paciente) {

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

    //UPDATE
    public boolean updatePaciente(int id, String atributo1, String atributo2) {
        connectToDB();
        String sql = "UPDATE Paciente SET ?=? where id=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, atributo1);
            pst.setString(2, atributo2);
            pst.setInt(3,id);
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

    //DELETE
    public boolean deletePaciente(int id) {
        connectToDB();
        String sql = "DELETE FROM Paciente where id=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
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

    //SELECT
    public ArrayList<Paciente> selectPaciente(int CRM) {
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
}

