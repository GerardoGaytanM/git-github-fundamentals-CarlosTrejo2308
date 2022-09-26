

import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sim {

    public Sim(int Hilos, int cantI) {
        this.cantHilos = cantHilos;
        cantIter = cantI;
        hilos = new LinkedList();
        threadPool = Executors.newFixedThreadPool(cantHilos);
        iniciarProcesos();
    }



    public void iniciarTodos() {
        for (Sub s : hilos) {
            threadPool.execute(s);
        }
        threadPool.shutdown();
    }



    private int cantHilos = 0;
    private int cantIter = 0;
    private LinkedList<Sub> hilos;
    private ExecutorService threadPool;
    public void iniciarProcesos() {
        Random rnd = new Random();
        for (int i = 0; i < cantHilos; i++)
            hilos.add(new Sub(rnd, cantIter / cantHilos)); // Lo que le tocara a cada hilo
    }
    public double pi() {
        iniciarTodos();
        long totalDentro = 0;
        long totalTotal = 0;
        while (!threadPool.isTerminated())
            ;/// Barrera
        for (Sub t : hilos) {
            totalDentro += t.getCantidadDentro();
            totalTotal += t.getCantidadTotal();
        }
        return 4.0 * totalDentro / totalTotal;
    }
}