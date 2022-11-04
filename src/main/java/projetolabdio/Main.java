package projetolabdio;
import projetolabdio.controllers.Logged;
import projetolabdio.views.user_auth.TelaLogin;

/**
 * Main class, starts the program and make instances class attributes
 * @author Gabriel Siqueira
 * @since 31/10/22
 * @version 1.1 (with Logged system)
 */
public class Main {

    /**
     * Initial and main method of the entire application
     */
    public static void main(String[] args) {
        // Starts TelaLogin, the initial screen
        TelaLogin inicial = new TelaLogin();
        inicial.setVisible(true);

        // Instances the static attribute for verifying user logged
        Logged logged = new Logged();
    }
    
}
