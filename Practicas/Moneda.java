import java.util.LinkedList;
import java.util.Scanner;
public class estocastico {
	static LinkedList<Integer> lista = new LinkedList<Integer>();
	
		public static void main(String[] args) {

		int numero, numero2, a, i = 0;
		Scanner in = new Scanner(System.in);
		
				System.out.println(" inserte el numero de veces que desea lanzar la moneda \n");
				numero = in.nextInt();
				moneda(numero);
		}
		
	public static void moneda(int a) {
		int ca = 0;
		int cr = 0;
		for (; a > 0; a--) {
			int lanz = (int) (Math.random() * 100 + 1);
			if (lanz > 50) {
				System.out.print("\n 1");
				ca++;
			} else {
				System.out.print("\n 0");
				cr++;
			}
		}
		System.out.print("\n cara=" + ca + "\n cruz=" + cr);
	}
}