package tti;

import java.util.Scanner;

public class Futtatas {

	public static void main(String[] args) {
		Személy valaki = new Személy();
		Scanner input;
		boolean ok = true; 

		do
		 {
			ok=true;
			input = new Scanner(System.in);
			System.out.println("Adja meg a nevét, súlyát és a testmagasságát méterben szóközzel elválasztva!");
			if(input.hasNextLine())
			{
				String inString = input.nextLine();
				String[] strArray = inString.split(" ");
				valaki.setNev(strArray[0]);
				valaki.setSuly(Integer.parseInt(strArray[1]));
				double asd = Double.parseDouble(strArray[2]);
				if (asd >= 2.72 || asd<=0) {
					System.out.println("nem megfelelo adat");
					ok = false;
					continue;
				}
				else
					valaki.setMagassag(Double.parseDouble(strArray[2]));
			}
			
			input.close();

		} while(!ok);


		System.out.println(valaki.toString());

	}

}
