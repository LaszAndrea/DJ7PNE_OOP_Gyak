package hanglemez;

import java.util.Scanner;

public class Fut {

	public static void main(String[] args) {
		Hanglemez h[] = new Hanglemez[2];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < h.length; i++) {
			System.out.println("Kerem az " + i + ". hanglemez eloadoját");
			String eloado = sc.next();
			System.out.println("Kerem az " + i + ". hanglemez cimet");
			String cim = sc.next();
			System.out.println("Kerem az " + i + ". hanglemez hosszat");
			int hossz = sc.nextInt();

			h[i] = new Hanglemez(eloado, cim, hossz);
		}

		sc.close();

		for (Hanglemez hanglemez : h) {
			System.out.println(hanglemez.toString());
		}

	}

}
