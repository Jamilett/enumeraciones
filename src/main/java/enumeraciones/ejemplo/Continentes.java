package enumeraciones.ejemplo;

/**
 * Esta enumeracion permite acceder a los continentes del mundo y al numero de
 * paises de cada continente
 *
 * @author jamsr
 */
public enum Continentes {
    // Se manda a llamar el constructor creado para acceder e inicializar la variable paises
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);

    // Dentro de una enumeracion tambien pueden existir atributos, metodos y constructores
    private final int paises;

    /**
     * Constructor que inicializa la variable paises de cada elemento de la
     * enumeracion
     *
     * @param paises
     */
    Continentes(int paises) {
        this.paises = paises;
    }

    /**
     * Metodo get para obtener el numero de paises de la enumeracion
     *
     * @return int paises
     */
    public int getPaises() {
        return this.paises;
    }

}
