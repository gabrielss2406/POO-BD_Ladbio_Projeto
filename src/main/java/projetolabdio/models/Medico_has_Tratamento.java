package projetolabdio.models;

/**
 * Model of Medico_has_Tratamento
 * @author Gabriel Siqueira
 * @since 10/11/22
 * @version 1.0
 */
public class Medico_has_Tratamento {

    private int Medico_crm;
    private int Tratamento_id;

    /**
     * Constructor method from Medico_has_Tratamento
     * @param medico_crm Foreing key for Medico
     * @param tratamento_id Foreing key for Tratamento
     */
    public Medico_has_Tratamento(int medico_crm, int tratamento_id) {
        Medico_crm = medico_crm;
        Tratamento_id = tratamento_id;
    }

    /**
     * Getter of crm
     * @return crm
     */
    public int getMedico_crm() {
        return Medico_crm;
    }

    /**
     * Getter of Tratamento_id
     * @return Tratamento_id
     */
    public int getTratamento_id() {
        return Tratamento_id;
    }
}
