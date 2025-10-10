import java.util.Scanner;

/**
 * Clase principal que controla la pelea.
 */
public class JuegoLucha {
    private IPersonaje jugador1;
    private IPersonaje jugador2;

    public JuegoLucha(IPersonaje jugador1, IPersonaje jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public void iniciarPelea() {
        System.out.println(" ¡Comienza la batalla épica entre " +
                jugador1.getNombre() + " y " + jugador2.getNombre() + "! 🔥\n");

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            turno(jugador1, jugador2);
            if (jugador2.estaVivo()) {
                turno(jugador2, jugador1);
            }
        }

        if (jugador1.estaVivo()) {
            System.out.println("Yeahh " + jugador1.getNombre() + " ha ganado la pelea.");
        } else {
            System.out.println("Yeahh " + jugador2.getNombre() + " ha ganado la pelea.");
        }
    }

    private void turno(IPersonaje atacante, IPersonaje defensor) {
        System.out.println("Turno de " + atacante.getNombre() +
                ". Vida de " + defensor.getNombre() + ": " + defensor.getPuntosDeVida());
        atacante.atacar(defensor);
        System.out.println(defensor.getNombre() + " ahora tiene " +
                defensor.getPuntosDeVida() + " puntos de vida.\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Preguntar nombres de los jugadores
        System.out.print(" Ingresa el nombre del jugador : ");
        String nombre1 = sc.nextLine();

        System.out.print(" Ingresa el nombre del jugador ");
        String nombre2 = sc.nextLine();

        // Crear personajes con los nombres ingresados
        IPersonaje kino = new Kino(nombre1);
        IPersonaje faiden = new Faiden(nombre2);

        // Iniciar el juego
        JuegoLucha juego = new JuegoLucha(kino, faiden);
        juego.iniciarPelea();

        sc.close();
    }
}