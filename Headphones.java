package HelloJava;

public class Headphones {
	String charge = "Micro usb";
	String[] controls = {"power","volume","skip","play/pause"};
	String color = "Red/Black";
	static boolean power = false;
	static int volume = 0;
	
	public static void powerOn() {
		power = true;
		System.out.println("Congrats !! your Battery is ON now..");
	}
	
	public static void powerOff() { 
		power = false;
		System.out.println("your Battery is OFF now..");		
	}
	
	public static void volumeUp() { 
		volume++;
		System.out.println("Volume is increased by .."+(int) volume);
	}
	
	public static void voulumeDown() { 
		volume--;
		System.out.println("Volume is decreased by .."+(int) volume);
	}
	
	public static void main(String[] args) {
		Headphones ion = new Headphones();
		System.out.println(ion.power);
		
		powerOn();
		System.out.println("After Switch on power");
		System.out.println(ion.power);
	}
}
