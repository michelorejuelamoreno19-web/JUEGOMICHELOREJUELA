// Subclase Faiden: ataques más fuertes pero menos constantes
class Faiden extends Personaje {
    private final int MIN_DANO = 12;
    private final int MAX_DANO = 30;
    private Random rand = new Random();

    public Faiden() {
        super("Faiden");
    }

    @Override
    public void atacar(Personaje oponente) {
        int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO;
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " lanza un golpe fuerte a " +
                oponente.getNombre() + " causando " + dano + " puntos de daño.");
    }
}
