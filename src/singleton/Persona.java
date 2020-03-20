package singleton;

/**
 *
 * agonzalezacevedo
 */
public class Persona {

    private static String nome;
    private static String apelido;
    private static int edad;
    private static Persona launica;
    
    private Persona() {
    }

    private Persona(String nome, String apelido, int edad) {
        launica.nome = nome;
        launica.apelido = apelido;
        launica.edad = edad;
    }
    public static Persona getInstance(String nome, String apelido, int edad){
        if(launica==null){
            launica = new Persona(nome,apelido,edad);
        }
        return launica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString() {
        return "Persona: " + "nome=" + nome + ", apellido=" + apelido + ", edad=" + edad;
    }
    
}
