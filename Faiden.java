import java.util.Random;

/**
 * Subclase Faiden: ataques más fuertes pero más variables.
 */
public class Faiden extends Personaje {
    private static final int MIN_DANO = 12;
    private static final int MAX_DANO = 30;
    private Random rand = new Random();

    public Faiden(String nombre) {
        super(nombre); // se pasa el nombre elegido por el jugador
    }

    @Override
    public void atacar(IPersonaje oponente) {
        int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO;
        System.out.println(this.nombre + " lanza un golpe fuerte a " +
                oponente.getNombre() + " causando " + dano + " puntos de daño.");
        oponente.recibirDano(dano);
    }
}
