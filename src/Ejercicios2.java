import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicios2 {
	static int n = 0;
	static int m = 0;
	static Set<Integer> primerConjunto = new HashSet<Integer>();
	static Set<Integer> segundoConjunto = new HashSet<Integer>();
	static int a = 0;
	static int num;

	public static void leerConjunto(int num) {

		if (a == n + m) {
			segundoConjunto.add(num);
			System.out.print("Segunda coleccion" + segundoConjunto);

		} else {
			if (a <= n) {
				primerConjunto.add(num);

			} else {
				segundoConjunto.add(num);
			}
		}

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String valor;
		String[] lista = new String[1];

		System.out.println("Introduce un valor de 2 cifras y separa los numero por -");
		System.out.print("> ");
		valor = s.next();
		System.out.println("Valor de la cadena " + valor.length());
		if (valor.contains("-") && valor.length()==5) {
			System.out.println(valor.length());
			lista = valor.split("-");
			n = Integer.parseInt(lista[0]);
			m = Integer.parseInt(lista[1]);
		} else {
			do {
				System.out.println("Se esperaba otra cosa, andate al loro de lo que se pide CARAJOOO");
				System.out.println("Introduce un valor:");
				System.out.print("> ");
				valor = s.next();
			} while (!valor.contains("-")&& valor.length()!=3 );
			lista = valor.split("-");
			n = Integer.parseInt(lista[0]);
			m = Integer.parseInt(lista[1]);

		}

		System.out.println("Introduce valores para meter los conjuntos:");
		for (int i = 0; i < n; i++) {

			System.out.print("> ");
			num = s.nextInt();
			a++;
			leerConjunto(num);
			System.out.println("Primera Coleccion posicion " + a);
		}
		for (int j = 0; j < m; j++) {

			System.out.print("> ");
			num = s.nextInt();
			a++;
			leerConjunto(num);
			System.out.println("Segunda Coleccion posicion " + a);

		}

		s.close();
	}

}
