package enumeraciones.ejemplo;

/**
 * Esta clase accederá a los valores de la enumeracion Dias
 *
 * @author Jamilett Samperio
 */
public class DiasMain {

    public static void main(String[] args) {

        System.out.println("Valor 1: " + Dias.LUNES);
        System.out.println("Valor 2: " + Dias.MARTES);
        System.out.println("Valor 3: " + Dias.MIERCOLES);
        /**
         * Accede al método indicarDia
         */
        indicarDia(Dias.LUNES);

    }

    /**
     * Método para hacer un test del dia, contiene una sentencia de control
     * Switch
     *
     * @param dia
     */
    public static void indicarDia(Dias dia) {
        switch (dia) {
            case LUNES:
                System.out.println("Primer día de la semana");
                break;
            case MARTES:
                System.out.println("Segundo día de la semana");
                break;
            case MIERCOLES:
                System.out.println("Mitad de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto día de la semana");
                break;
            case VIERNES:
                System.out.println("Inicio del fin de semana");
                break;
            case SABADO:
                System.out.println("Sexto día de la semana");
                break;
            case DOMINGO:
                System.out.println("Último día de la semana");
                break;

        }

    }

}
