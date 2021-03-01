package tti;

public class Szem�ly {

	private String nev;
	private int suly;
	private double magassag;

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public int getSuly() {
		return suly;
	}

	public void setSuly(int suly) {
		this.suly = suly;
	}

	public double getMagassag() {
		return magassag;
	}

	public void setMagassag(double magassag) {
		this.magassag = magassag;
	}

	public String tti() {
		double tti = (double) suly / (magassag * magassag);

		if (tti <= 18.5) {
			return "sov�ny";
		} else if (tti >= 25) {
			return "k�v�r";
		} else
			return "norm�l";
	}

	public String toString() {
		return "Szem�ly [nev=" + nev + ", suly=" + suly + ", magassag=" + magassag + " tti: " + tti() + "]";
	}

	public int ellenorzott(double magassag) {
		int ok = 1;
		if (magassag > 2.72) {
			System.out.println("Nem megfelelo adatok!");
			ok = 0;
		}
		return ok;
	}

}
