package dad.codesignal;

public class TheJourneyBegins {

	public int add(int p1, int p2) {
		return p1 + p2;
	}

	public int centuryFromYear(int year) {
		int aux = year / 100;
		if (year % 100 == 0) {
			return aux;
		} else {
			return aux + 1;
		}
	}

	
}
