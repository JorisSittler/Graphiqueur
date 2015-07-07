
public class PointDePassage {
	Heure heure;
	float pk;
	
	
	public PointDePassage(Heure h, float k){
		heure = h;
		pk=k;
	}
	
	public void retarderDe(float m){
		heure = heure.retarderDe(m);
	}
	public String toString(){
		return (heure + ", pk :" + pk);
	}
}
