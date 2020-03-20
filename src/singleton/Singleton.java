package singleton;

/**
 *
 * @author agonzalezacevedo
 */
public class Singleton {

    public static void main(String[] args) {
        Persona per = Persona.getInstance("Gabriel","Campos",21);
        System.out.println(per.toString());
        Persona otra = Persona.getInstance("Xavier","García",17);
        System.out.println(otra.toString());
        
    }
    
}
