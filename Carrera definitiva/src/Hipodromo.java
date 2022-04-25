import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Hipodromo {

	public static void dibujarPista(int[] Hipodromo) {

		for (int i = 0; i < Hipodromo.length; i++) {
			System.out.print("Caballo " + (i + 1) + ":");
			for (int j = 0; j < Hipodromo[i]; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
		System.out.println("");

	}

	public static void Carrera(int[] Hipodromo, int largoPista) throws InterruptedException {

		while (true) {
			Random aleatorio = new Random();
			TimeUnit.MILLISECONDS.sleep(50);
			int a = aleatorio.nextInt(4);

			Hipodromo[a]++;
			dibujarPista(Hipodromo);
			if (Hipodromo[a] == largoPista) {
				System.out.println("Caballo ganador:" + (a + 1));
				break;
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		int largoPista = 50;
		ArrayList<String> caballosCarrera = new ArrayList<>();
		// aqui agrego los caballos
		caballosCarrera.add("Caballo_0");
		caballosCarrera.add("Caballo_1");
		caballosCarrera.add("Caballo_2");
		caballosCarrera.add("Caballo_3");

		int[] Hipodromo = new int[caballosCarrera.size()];

		Carrera(Hipodromo, largoPista);
	}

}
