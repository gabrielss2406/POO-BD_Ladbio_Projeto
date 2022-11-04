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
    private final String database = "sql10538911";//DB name
    private final String user = "sql10538911"; //DB string
    private final String password = "aVJg18QkdD"; //DB password
    private final String url = "jdbc:mysql://sql10.freemysqlhosting.net:3306/" + database + "?useTimezone=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true"; //DB url

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
