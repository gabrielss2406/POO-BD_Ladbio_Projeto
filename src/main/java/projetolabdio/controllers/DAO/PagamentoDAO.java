package projetolabdio.controllers.DAO;


import projetolabdio.models.Pagamento;
import java.sql.SQLException;
import java.util.ArrayList;

public class PagamentoDAO extends ConnectionDAO{
    //DAO - Data Access Object
    boolean sucesso = false; //Para saber se funcionou

    //INSERT
    public boolean insertPagamento(Pagamento pagamento) {

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

    //UPDATE
    public boolean updatePagamento(int id) {
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

    //SELECT
    public ArrayList<Pagamento> selectPagamento(int ID) {
        ArrayList<Pagamento> pagamentos = new ArrayList<>();
        connectToDB();
        String sql = "SELECT * FROM Pagamento WHERE Tratamento_idTratamento = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,ID);
            st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                Pagamento pagamentoAux = new Pagamento(rs.getInt("id"), rs.getInt("parcelas"),rs.getString("forma"),rs.getDate("data"), rs.getBoolean("pago"), rs.getInt("Tratamento_idTratamento"));
                pagamentos.add(pagamentoAux);
            }
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return pagamentos;
    }
}
