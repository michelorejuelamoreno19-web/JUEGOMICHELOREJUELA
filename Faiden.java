import java.util.Random;

/**
 * Faiden.java
 * Subclase de Personaje: ataques más fuertes pero con mayor variabilidad.
 */
public class Faiden extends Personaje {
    private static final int MIN_DANO = 12;
    private static final int MAX_DANO = 30;
    private final Random rand = new Random();

    public Faiden() {
        super("Faiden");
    }

    public Faiden(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar(IPersonaje oponente) {
        if (oponente == null || !oponente.estaVivo()) return;
        int dano = rand.nextInt(MAX_DANO - MIN_DANO + 1) + MIN_DANO;
        System.out.printf("%s lanza un golpe fuerte a %s → %d daño%n", this.getNombre(), oponente.getNombre(), dano);
        oponente.recibirDano(dano);
    }
}

