package Exercicios.Lista03.Ex01;

public class Main
{
    public static void main(String[] args)
    {
        Buffer bufferCompartilhado = new Buffer();
        Produtor produtor01 = new Produtor(1, bufferCompartilhado, 5);
        Produtor produtor02 = new Produtor(2, bufferCompartilhado, 5);
        Consumidor consumidor01 = new Consumidor(1, bufferCompartilhado, 2);
        Consumidor consumidor02 = new Consumidor(2, bufferCompartilhado, 8);

        produtor01.start();
        consumidor01.start();
        produtor02.start();
        consumidor02.start();
    }
}
