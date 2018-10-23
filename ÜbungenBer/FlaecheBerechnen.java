public class FlaecheBerechnen {
	public static void main(String[] args) {
	 	float flaeche = flaecheBerechnen(new float[][] { { 0, 0 }, { 1, 0 }, { 1, 1 }, { 0, 1 } });
		//System.out.println(flaecheBerechnen(new float[][] { { 0, 0 }, { 1, 0 }, { 1, 1 }, { 0, 1 } }));
	}

	public static float flaecheBerechnen(float[][] coord) {
		float result = 0;

		for (int n = 0; n < coord.length; n++) {
			result = result + ((coord[n][0] + coord[(n + 1) % coord.length][0])* (coord[(n + 1) % coord.length][1] - coord[n][1]) / 2);
		}
		return result;
	}

}
