/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolabdio.controllers;

import java.util.ArrayList;
import projetolabdio.controllers.DAO.PacienteDAO;
import projetolabdio.models.Paciente;

/**
 *
 * @author gabri
 */
public class MedicoController {
    
    public ArrayList<Paciente> getPacientesList(){
        PacienteDAO pac = new PacienteDAO();
        ArrayList<Paciente> pacientes = new ArrayList<>();
        
        // Select pacientes
        pacientes = pac.selectPacientesList(Logged.getCrm());
        
        return pacientes;
    }
    
    public Paciente getPaciente(String cpf){
        PacienteDAO pac = new PacienteDAO();
        
        // Select pacientes
        Paciente paciente = pac.selectPaciente(cpf);
        
        return paciente;
    }
    
}
