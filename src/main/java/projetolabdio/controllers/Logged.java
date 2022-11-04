/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolabdio.controllers;

/**
 * Class with the static attribute for verify logged user
 * It is a Session Class for login
 * @author Gabriel Siqueira
 * @since 02/11/2022
 * @version 1.0
 */
public class Logged {
    // Attribute
    private static int crm = 0;

    // Getters and Setters
    public static int getCrm() {
        return crm;
    }

    public static void setCrm(int crm) {
        Logged.crm = crm;
    }
    
}
