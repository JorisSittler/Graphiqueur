
public class Heure {
	int heure;
	float minute;

	public Heure(int h, float m) {
		heure = h;
		minute = m;
	}

	public Heure plus(Heure a) {
		int h;
		float m;

		m = this.minute + a.minute;
		h = this.heure + a.heure;
		if (m > 60) {
			h++;
			m -= 60;
		} else if (m < 0) {
			h--;
			m += 60;
		}
		return new Heure(h, m);
	}

	public String toString() {
		return (heure + ":" + minute);
	}
}
