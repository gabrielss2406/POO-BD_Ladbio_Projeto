package projetolabdio.config;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Class for save the information for connect with DB
 * @author Francisco Pereira Guimaraes
 * @since 02/11/2022
 * @version 1.0
 */
public class Db_Config {
    private final String database = "mydb";//nome do BD
    private final String user = "root";
    private final String password = "root";
    private final String url = "jdbc:mysql://localhost:3306/" + database + "?useTimezone=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";

    //Getters

    /**
     * Method get for database name
     * @return database name
     */
    public String getDatabase() {
        return database;
    }

    /**
     * Method get for database user
     * @return database user
     */
    public String getUser() {
        return user;
    }

    /**
     * Method get for database password
     * @return database password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Method get for database url
     * @return database url
     */
    public String getUrl() {
        return url;
    }

    
}
