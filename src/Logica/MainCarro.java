package Logica;

public class MainCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro(3, 140);
        Carro c2 = new Carro(4, 140);
        Carro c3 = new Carro(1, 120);

        /*c1.setPotencia(2);
        c1.setVelocidad(80);
        c2.setPotencia(3);
        c2.setVelocidad(65);
        c3.setPotencia(2);
        c3.setVelocidad(80);/*

        /* System.out.println("La potencia del carro es: " + c1.getPotencia() + " y la velocidad es: " + c1.getVelocidad()); */

        c1.acelerar();
        c1.acelerar();
        c1.frenar();

        c2.acelerar();
        c2.acelerar();
        c2.acelerar();

        c3.frenar();
        c3.frenar();

        System.out.println("La potencia del carro 1 es: " + c1.getPotencia() + " y la velocidad es: " + c1.getVelocidad());
        System.out.println("La potencia del carro 2 es: " + c2.getPotencia() + " y la velocidad es: " + c2.getVelocidad());
        System.out.println("La potencia del carro 3 es: " + c3.getPotencia() + " y la velocidad es: " + c3.getVelocidad());
    }
}