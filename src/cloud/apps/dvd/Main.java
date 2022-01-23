package cloud.apps.dvd;

public class Main {
	public static String[] dvdlogo = new String[8];
	public static int color = 0;
	
	public static void main(String[] args) {
		for (int i = 1; i < 9; i++) {
			dvdlogo[i-1] = "/assets/dvdlogo-0"+i+".png";
		}
		new DVD();
	}
}
