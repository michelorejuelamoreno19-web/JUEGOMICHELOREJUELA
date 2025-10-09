class JuegoLucha {
    private Personaje kino;
    private Personaje faiden;

    public JuegoLucha() {
        this.kino = new Kino();
        this.faiden = new Faiden();
    }

    public void iniciarPelea() {
        System.out.println(" ¡Comienza la batalla épica entre " +
                kino.getNombre() + " y " + faiden.getNombre() + "!");

        while (kino.estaVivo() && faiden.estaVivo()) {
            turno(kino, faiden);
            if (faiden.estaVivo()) {
                turno(faiden, kino);
            }
        }

        if (kino.estaVivo()) {
            System.out.println("yeahh" + kino.getNombre() + " ha ganado la pelea.");
        } else {
            System.out.println("yeahh" + faiden.getNombre() + " ha ganado la pelea.");
        }
    }

    private void turno(Personaje atacante, Personaje defensor) {
        System.out.println("Turno de " + atacante.getNombre() +
                ". Vida de " + defensor.getNombre() + ": " + defensor.getPuntosDeVida());
        atacante.atacar(defensor);
        System.out.println(defensor.getNombre() + " ahora tiene " +
                defensor.getPuntosDeVida() + " puntos de vida.\n");
    }

    public static void main(String[] args) {
        JuegoLucha juego = new JuegoLucha();
        juego.iniciarPelea();
    }
} 