/**
 * IPersonaje.java
 * Interfaz que define el comportamiento que deben exponer todos los personajes.
 */
public interface IPersonaje {
    /**
     * Realiza un ataque sobre otro personaje.
     * @param oponente personaje objetivo
     */
    void atacar(IPersonaje oponente);

    /**
     * Recibe daño (aplica reducción de vida).
     * @param dano cantidad de daño
     */
    void recibirDano(int dano);

    /** @return true si el personaje tiene vida > 0 */
    boolean estaVivo();

    /** @return nombre del personaje */
    String getNombre();

    /** @return puntos de vida actuales */
    int getPuntosDeVida();

    /**
     * Hook opcional ejecutado al inicio del turno (por defecto no hace nada).
     * Sirve para implementar cooldowns o efectos por turno si se requiere más tarde.
     */
    default void inicioTurno() {}
}

