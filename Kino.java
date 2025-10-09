// Subclase Kino: ataques más rápidos pero de menor daño
import java.util.Random;
class Kino extends Personaje {
    private final int MIN_DANO = 10;
    private final int MAX_DANO = 20;
    private Random rand = new Random();

    public Kino() {
        super("Kino");
    }

    @Override
    public void atacar(Personaje oponente) {
        int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO;
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " ataca rápido a " +
                oponente.getNombre() + " causando " + dano + " puntos de daño.");
    }
}
