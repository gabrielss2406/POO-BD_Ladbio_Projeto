package projetolabdio.controllers.DAO;

import projetolabdio.models.Medico_has_Tratamento;
import java.sql.SQLException;

/**
 * Class for CREATE objects of the table "Medico_has_Tratamento"
 * @author Francisco Pereira Guimaraes
 * @since 02/11/2022
 * @version 1.0
 */
public class Medico_has_TratamentoDAO extends ConnectionDAO{ //DAO - Data Access Object

    boolean sucesso = false; //Variable to check if it worked

    /**
     * Function for CREATE a new object in the table "Medico_has_Tratamento"
     * @param mht Object of Medico_has_Tratamento that will be created
     * @return boolean variable (1 - success) (2 - fail)
     */
    public boolean insertMedico_has_Tratamento(Medico_has_Tratamento mht) { //CREATE

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
