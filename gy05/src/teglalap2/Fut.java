package teglalap2;

import java.util.Scanner;

public class Fut {

	public static void main(String[] args) {
		Teglalap teglalapTomb[] = new Teglalap[10];

		feltolt(teglalapTomb);
		kiir(teglalapTomb);
		System.out.println("a legkisebb teruletu teglalap: " + legkisebbTerulet(teglalapTomb));

		Teglalap uj;

		Scanner sc = new Scanner(System.in);
		System.out.println("Uj teglalap!");
		System.out.println("Kerem az a oldalt");
		int a = sc.nextInt();
		System.out.println("Kerem a b oldalt");
		int b = sc.nextInt();

		uj = new Teglalap(a, b);
		System.out.println(uj);

		sc.close();
		
		System.out.println("ennyien voltak nagyobb teruletuek: " + getTeruletNagyobb(uj, teglalapTomb));
		
		System.out.println(getVanEgyezo(teglalapTomb, uj));
	}

	private static String getVanEgyezo(Teglalap[] teglalapTomb, Teglalap uj) {
		int keresEgyezoOldalak = keresEgyezoOldalak(teglalapTomb, uj);
		
		if(keresEgyezoOldalak!=-1)
		{
			return "Az egyezo adatokkal rendelkezo teglalap indexe: " + keresEgyezoOldalak;
		}
		else
		{
			return "Nincsen egyezo";
		}
	}

	private static void feltolt(Teglalap[] teglalapTomb) {
		for (int i = 0; i < teglalapTomb.length; i++) {
			teglalapTomb[i] = new Teglalap((int) (Math.random() * 8 + 2), (int) (Math.random() * 8 + 2));
		}
	}

	private static void kiir(Teglalap[] teglalapTomb) {
		for (int i = 0; i < teglalapTomb.length; i++) {
			System.out.println(teglalapTomb[i]);
		}
	}

	private static Teglalap legkisebbTerulet(Teglalap[] teglalapTomb) {
		Teglalap min = teglalapTomb[0];

		for (Teglalap teglalap : teglalapTomb) {
			if (teglalap.getTerulet() < min.getTerulet()) {
				min = teglalap;
			}
		}

		return min;
	}
	
	private static int getTeruletNagyobb(Teglalap t, Teglalap[] tomb) {
		int db=0;
		
		for(Teglalap teglalap : tomb)
		{
			if(teglalap.getTerulet()>t.getTerulet())
			{
				db++;
			}
		}
		
		return db;
	}
	
	public static int keresEgyezoOldalak(Teglalap[] tomb, Teglalap t ) {
		int index = -1;
		
		for(int i=0; i< tomb.length; i++)
		{
			if(tomb[i].getOldalakEgyeznek(t))
			{
				index=i;
				break;
			}
		}
		
		
		return index;
	}

}
