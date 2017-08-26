package basicAttribute;

import java.util.Scanner;

public class ShuRu {
	@SuppressWarnings("unused")
	private static ShuRu shuru=new ShuRu();
	private ShuRu () {
		
	}
	public static Scanner getInstance() {
		return new Scanner(System.in);
		
	}

}
