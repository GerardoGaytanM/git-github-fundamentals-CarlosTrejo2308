
import java.util.Scanner;

public class ejemplo {
    static Scanner sc = new Scanner(System.in);
    static Premio[] caja = new Premio[4];

    public static void main(String[] args) {
        int p = 0;
        int pr = (int) (Math.random() * 2);
        //System.out.println("el premio esta en " + pr);
        for (int i = 0; i < 3; i++) {
            if (i == pr) {
                caja[i] = new Premio(false, true, i);
            } else
                caja[i] = new Premio(false, false, i);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(caja[i]);

        }
        System.out.println("escoja un premio");
        int g = sc.nextInt();
        System.out.println(g);
        for (int i = 0; i < 3; i++) {
            if (g == caja[i].getNumero()) {
                caja[i].setSeleccion(true);
            }

        }
        for (int i = 0; i < 3; i++) {
            System.out.println(caja[i]);

        }

        for (int i = 0; i < 3; i++) {
            if (caja[i].isPremio() == false && caja[i].isSeleccion() == false) {
                System.out.println("la puerta  " + i + "contiene una cabra " + caja[i]);
                p = i;
                break;

            }

        }
        System.out.println("desea cambiar de caja? \nsi \nno");

        int r = sc.nextInt();
        if (r == 1) {
            for (int i = 0; i < 3; i++) {
                if (caja[i].isSeleccion() == false && p != i && g != i) {
                    {
                        caja[g].setSeleccion(false);
                        caja[i].setSeleccion(true);
                        System.out.println("cambio la caja");
                    }
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(caja[i]);

        }
        for (int i = 0; i < 3; i++) {
            if (caja[i].isPremio() == true && caja[i].isSeleccion() == true) {
                System.out.println("Premio Mayor!\n");
            } else if (caja[i].isPremio() == false && caja[i].isSeleccion() == true) {
                System.out.println("Siga participando");
            }

        }
    }
}
