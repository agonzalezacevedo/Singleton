package singleton;

/**
 *
 * agonzalezacevedo
 */
public class Persona {

    String nome;
    String apellido;
    int edad;
    private static Persona launica;
    
    private Persona() {
    }

    private Persona(String nome, String apellido, int edad) {
        this.nome = nome;
        this.apellido = apellido;
        this.edad = edad;
    }
    public static Persona getInstance(){
        launica = new Persona();
        return launica;
    }
    @Override
    public String toString() {
        return "Persona{" + "nome=" + nome + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
    
}
