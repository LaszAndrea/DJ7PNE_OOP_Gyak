package hf05_02;

public class konyv {

	java.time.LocalDate currentDate = java.time.LocalDate.now();
	private String szerzo;
	private double ar;
	private int ev;
	private String cim;
	
	public String toString() {
		return "konyv [szerzo=" + szerzo + ", ar=" + ar + ", ev=" + ev + ", cim=" + cim + "]";
	}
	
	public konyv(String szerzo, double ar, int ev, String cim) {
		this.szerzo = szerzo;
		this.ar = ar;
		this.ev = ev;
		this.cim = cim;
	}
	
	public konyv(String szerzo,String cim) {
		this.szerzo = szerzo;
		ar=2500;
		ev = currentDate.getYear(); ;
		this.cim = cim;
	}
	
	public String getCim() {
		return cim;
	}

	public void setCim(String cim) {
		this.cim = cim;
	}


	public String getSzerzo() {
		return szerzo;
	}


	public void setSzerzo(String szerzo) {
		this.szerzo = szerzo;
	}


	public double getAr() {
		return ar;
	}


	public void setAr(double ar) {
		this.ar = ar;
	}


	public int getEv() {
		return ev;
	}


	public void setEv(int ev) {
		this.ev = ev;
	}

	public void setArNovel(double szazalek)
	{
		this.ar = this.ar+(ar*(szazalek/100));
	}
	
	
}
