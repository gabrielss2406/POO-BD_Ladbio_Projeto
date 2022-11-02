/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolabdio.controllers;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import projetolabdio.controllers.DAO.PacienteDAO;
import projetolabdio.models.Paciente;

/**
 *
 * @author gabri
 */
public class MedicoController {
    public DefaultListModel getPacientes(){
        PacienteDAO pac = new PacienteDAO();
        ArrayList<Paciente> pacientes = new ArrayList<>();
        
        // Select pacientes
        pacientes = pac.selectPaciente(Logged.getCrm());
        
        // Convert ArrayList -> DefaultListModel
        DefaultListModel model = new DefaultListModel();
        for(Paciente p : pacientes)
            model.addElement(p.getNome());
        
        return model;
    }
}
