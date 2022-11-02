package projetolabdio.controllers.DAO;


import projetolabdio.models.Medico;
import java.sql.SQLException;

public class MedicoDAO extends ConnectionDAO{
    //DAO - Data Access Object
    boolean sucesso = false; //Para saber se funcionou

    //INSERT
    public boolean insertMedico(Medico medico) {

        connectToDB();

        String sql = "INSERT INTO Medico() values(?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, String.valueOf(medico.getCrm()));
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

    //SELECT
    public Medico selectMedicoLogin(int CRM, String SENHA) {
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
