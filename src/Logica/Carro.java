package Logica;

public class Carro {
    private int potencia;
    private double velocidad;

    public Carro (int potencia, double velocidad){
        this.potencia = potencia;
        this.velocidad = velocidad;
        setVelocidad(velocidad);
        setPotencia(potencia);
    }

    public void acelerar() {
        velocidad += potencia;
    }

    public void frenar() {
        velocidad /= 2;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        if (potencia >= 0) {
            this.potencia = potencia;
        }
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        if (velocidad >= 0) {
            this.velocidad = velocidad;
        }
    }
}
