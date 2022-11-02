package projetolabdio.controllers.DAO;


import projetolabdio.models.Medico_has_Tratamento;
import java.sql.SQLException;

public class Medico_has_TratamentoDAO extends ConnectionDAO{
    //DAO - Data Access Object
    boolean sucesso = false; //Para saber se funcionou

    //INSERT
    public boolean insertMedico_has_Tratamento(Medico_has_Tratamento mht) {

        connectToDB();

        String sql = "INSERT INTO Medico_has_Tratamento() values(?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, String.valueOf(mht.getMedico_crm()));
            pst.setString(2, String.valueOf(mht.getTratamento_id()));
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
}
