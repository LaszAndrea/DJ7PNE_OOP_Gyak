package Konyv;

/**
 * @author laszl
 *
 */
public class konyv {

	

	private String szerzo;
	private double ar;
	private int ev;
	private String cim;
	
	public String toString() {
		return "konyv [szerzo=" + szerzo + ", ar=" + ar + ", ev=" + ev + ", cim=" + cim + "]";
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
