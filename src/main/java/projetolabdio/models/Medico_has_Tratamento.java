package projetolabdio.models;

public class Medico_has_Tratamento {

    private int Medico_crm;
    private int Tratamento_id;

    public Medico_has_Tratamento(int medico_crm, int tratamento_id) {
        Medico_crm = medico_crm;
        Tratamento_id = tratamento_id;
    }

    public int getMedico_crm() {
        return Medico_crm;
    }

    public int getTratamento_id() {
        return Tratamento_id;
    }
}
