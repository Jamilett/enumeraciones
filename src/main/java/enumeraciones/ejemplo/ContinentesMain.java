package enumeraciones.ejemplo;

/**
 * Esta clase hace un test de la enumeracion Continentes, mediante acceso
 * directo, sentencia switch y metodo value
 *
 * @author jamsr
 */
public class ContinentesMain {

    /**
     * Metodo main para probar acceso directo, sentencia switch y metodo value
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Continente 4: " + Continentes.AMERICA);
        System.out.println("Numero de paises de " + Continentes.AMERICA + " es: " + Continentes.AMERICA.getPaises());

        // Accede al metodo indicarPaises de la constante indicada
        indicarPaises(Continentes.AMERICA);
        // Accede al metodo imprimirPaises para iterar TODA la enumeración
        imprimirPaises();
    }

    /**
     * Metodo para imprimir a los paises del continente indicado mediante una
     * sentencia de control Switch
     *
     * @param continente
     */
    public static void indicarPaises(Continentes continente) {
        switch (continente) {
            case AMERICA:
                System.out.println("El numero de paises en " + continente + " es ----> " + continente.getPaises());
        }
    }

    /**
     * Metodo que imprime cada valor de la enumeracion mediante un ciclo forEach
     */
    public static void imprimirPaises() { // No recibe parametros ya que itera toda la enumeracion
        // Usamos forEach
        // Variable tipo Continentes : enumeracion.values (se agrega por default en cada enumeracion)
        for (Continentes c : Continentes.values()) {
            System.out.println("Continente " + c + " contiene " + c.getPaises() + " paises");
        }

    }

}
