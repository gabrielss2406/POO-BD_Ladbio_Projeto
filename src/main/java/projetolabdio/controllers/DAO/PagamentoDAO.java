package projetolabdio.controllers.DAO;

import projetolabdio.models.Pagamento;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 * Class for CREATE, READ, UPDATE objects of the table "Pagamento"
 * @author Francisco Pereira Guimaraes
 * @since 02/11/2022
 * @version 1.0
 */
public class PagamentoDAO extends ConnectionDAO{
    //DAO - Data Access Object
    boolean sucesso = false; //Para saber se funcionou

    /**
     * Function for CREATE a new object in the table "Pagamento"
     * @param pagamento Object of Pagamento that will be created
     * @return boolean variable (1 - success) (2 - fail)
     */
    public boolean insertPagamento(Pagamento pagamento) { //CREATE

        connectToDB();

        String sql = "INSERT INTO Pagamento() values(?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, String.valueOf(pagamento.getId()));
            pst.setString(2, String.valueOf(pagamento.getParcelas()));
            pst.setString(3, pagamento.getForma());
            pst.setString(4, String.valueOf(pagamento.getData()));
            pst.setString(5, String.valueOf(pagamento.getPago()));
            //pst.setString(5, pagamento.FK Tratamento);
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
     * Function to search the Pagamento with this ID for Tratamento
     * @param ID Primary key of "Tratamento" table
     * @return the Pagamento found
     */
    public Pagamento selectPagamento(int ID) { //READ
        Pagamento pagamento = null;
        connectToDB();
        String sql = "SELECT * FROM Pagamento WHERE Tratamento_idTratamento = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,ID);
            rs = pst.executeQuery();

            while (rs.next()) {
                pagamento = new Pagamento(rs.getInt("idPagamento"), rs.getInt("parcelas"),rs.getString("forma"),rs.getDate("data"), rs.getBoolean("pago"), rs.getInt("Tratamento_idTratamento"));
            }
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return pagamento;
    }

    /**
     * Function for update the attribute "Pago" of Pagamento that have this ID
     * @param id Primary key of Pagamento
     * @return boolean variable (1 - success) (2 - fail)
     */
    public boolean updatePagamento(int id) { //UPDATE
        connectToDB();
        String sql = "UPDATE Pagamento SET pago=1 where id=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,id);
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
