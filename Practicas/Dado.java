import java.util.LinkedList;
import java.util.Scanner;
public class estocastico {
	static LinkedList<Integer> lista = new LinkedList<Integer>();
	
		public static void main(String[] args) {

		int numero, numero2, a, i = 0;
		Scanner in = new Scanner(System.in);
		
			System.out.println(" inserte el numero de veces que desea lanzar el dado \n");
				numero2 = in.nextInt();
				dado(numero2);
		}
		
	public static void dado(int a) {
		int i = 0, ii = 0, iii = 0, iv = 0, v = 0, vi = 0;
		for (int j = 0; j < a; j++) {
			int lanz = (int) (Math.random() * 100 + 1);
			if (lanz < 30) {
				System.out.print("\n es 5");
				v++;

			} else if (lanz >= 30 && lanz < 44) {
				System.out.print("\n es 1");
				iv++;

			} else if (lanz >= 44 && lanz < 58) {
				System.out.print("\n es 2");
				iii++;
			} else if (lanz >= 58 && lanz < 72) {
				System.out.print("\n es 3");
				ii++;
			} else if (lanz >= 72 && lanz < 86) {
				System.out.print("\n es 4");
				i++;
			} else if (lanz >= 86) {
				System.out.print("\n es 6");
				vi++;
			}

		}
		System.out.print("\n 5=" + v + "\n 4=" + iv + "\n 3=" + iii + "\n 2=" + ii + "\n 1=" + i + "\n 6=" + vi
				+ "\n total= " + (i + ii + iii + iv + v + vi));

	}
}
		
		