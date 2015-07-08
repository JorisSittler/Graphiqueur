
public class PointDePassage {
	Heure heure;
	float pk;
	
	
	public PointDePassage(Heure h, float k){
		heure = h;
		pk=k;
	}
	public PointDePassage(float[] tab){
		heure = new Heure((int) tab[0], tab[1]);
		pk = tab[2];
	}
	
	public void retarderDe(float m){
		heure = heure.retarderDe(m);
	}
	public String toString(){
		return (heure + ", " + pk);
	}
	public String toCSV(){
		return ("" + heure.toCSV() + ", " + pk);
	}
}
