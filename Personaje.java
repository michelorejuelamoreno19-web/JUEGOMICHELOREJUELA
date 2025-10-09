import java.util.Objects;

/**
 * Personaje.java
 * Clase abstracta que implementa IPersonaje y centraliza datos y comportamiento común.
 * Todas las subclases deben implementar el método atacar(IPersonaje).
 */
public abstract class Personaje implements IPersonaje {
    protected String nombre;
    protected int puntosDeVida;
    protected final int VIDA_MAX = 100;

    /**
     * Constructor principal.
     * @param nombre nombre del personaje
     */
    public Personaje(String nombre) {
        this.nombre = Objects.requireNonNullElse(nombre, "SinNombre");
        this.puntosDeVida = VIDA_MAX;
    }

    /**
     * Cada subclase implementará su forma de atacar.
     */
    @Override
    public abstract void atacar(IPersonaje oponente);

    /**
     * Reduce la vida por el daño recibido.
     * @param dano daño a aplicar
     */
    @Override
    public void recibirDano(int dano) {
        if (dano < 0) return;
        this.puntosDeVida -= dano;
        if (this.puntosDeVida < 0) this.puntosDeVida = 0;
    }

    @Override
    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public int getPuntosDeVida() {
        return this.puntosDeVida;
    }

    /**
     * Representación compacta del estado del personaje.
     * @return cadena con nombre y HP
     */
    @Override
    public String toString() {
        return String.format("%s (HP: %d)", nombre, puntosDeVida);
    }
}
