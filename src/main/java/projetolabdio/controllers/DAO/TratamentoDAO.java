package projetolabdio.controllers.DAO;

import projetolabdio.models.Tratamento;
import java.sql.SQLException;
import java.util.ArrayList;

public class TratamentoDAO extends ConnectionDAO{
    //DAO - Data Access Object
    boolean sucesso = false; //Para saber se funcionou

    //INSERT
    public boolean insertTratamento(Tratamento tratamento) {

        connectToDB();

        String sql = "INSERT INTO Tratamento() values(?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, String.valueOf(tratamento.getId()));
            pst.setString(2, String.valueOf(tratamento.getPreco()));
            pst.setString(3, tratamento.getDescricao());
            pst.setString(3, String.valueOf(tratamento.getData()));
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

    //SELECT
    public ArrayList<Tratamento> selectTratamento(String cpf) {
        ArrayList<Tratamento> tratamentos = new ArrayList<>();
        connectToDB();
        String sql = "SELECT * FROM tratamentos WHERE Paciente_cpf = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, String.valueOf(cpf));
            st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                Tratamento tratamentoAux = new Tratamento(rs.getInt("id"),rs.getFloat("preco"),rs.getString("descricao"), rs.getDate("data"), rs.getString("Paciente_cpf"));
                tratamentos.add(tratamentoAux);
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
        return tratamentos;
    }
}
