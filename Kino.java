import java.util.Random;
/**
 * Subclase Kino: ataques rápidos pero de menor daño.
 */
public class Kino extends Personaje {
    private static final int MIN_DANO = 10;
    private static final int MAX_DANO = 20;
    private Random rand = new Random();

    public Kino(String nombre) {
        super(nombre); // se pasa el nombre elegido por el jugador
    }

    @Override
    public void atacar(IPersonaje oponente) {
        int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO;
        System.out.println(this.nombre + " ataca rápido a " + 
                oponente.getNombre() + " causando " + dano + " puntos de daño.");
        oponente.recibirDano(dano);
    }
}
