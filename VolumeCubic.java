package informatika;

public class VolumeCubic {
	public int hitungVol(int a, int b, int c) {
		if (a != b && b != c && a != c) {
			return 0;
			}
		return a*b*c;
		}
	}

