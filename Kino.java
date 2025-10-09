import java.util.Random;

/**
 * Kino.java
 * Subclase de Personaje: ataques rápidos y consistentes (daño menor).
 */
public class Kino extends Personaje {
    private static final int MIN_DANO = 10;
    private static final int MAX_DANO = 20;
    private final Random rand = new Random();

    public Kino() {
        super("Kino");
    }

    public Kino(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar(IPersonaje oponente) {
        if (oponente == null || !oponente.estaVivo()) return;
        int dano = rand.nextInt(MAX_DANO - MIN_DANO + 1) + MIN_DANO;
        // Mensaje estilizado para buena visualización
        System.out.printf("%s ataca rápido a %s → %d daño%n", this.getNombre(), oponente.getNombre(), dano);
        oponente.recibirDano(dano);
    }
}
