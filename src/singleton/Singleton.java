package singleton;

/**
 *
 * @author agonzalezacevedo
 */
public class Singleton {

    public static void main(String[] args) {
        Persona per = Persona.getInstance();
        Persona otra = Persona.getInstance();
        per.toString();
        otra.toString();
    }
    
}
