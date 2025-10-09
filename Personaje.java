import java.util.Random;

// Clase base abstracta
abstract class Personaje {
    protected String nombre;
    protected int puntosDeVida;

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.puntosDeVida = 100;
    }

    // Método abstracto: cada subclase define su forma de atacar
    public abstract void atacar(Personaje oponente);

    public void recibirDano(int dano) {
        this.puntosDeVida -= dano;
        if (this.puntosDeVida < 0) {
            this.puntosDeVida = 0;
        }
    }

    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPuntosDeVida() {
        return this.puntosDeVida;
    }
} 
