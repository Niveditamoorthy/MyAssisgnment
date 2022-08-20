package Week3.day1.org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("10 inches");
	}
	
	
	public static void main(String[] args) {
		
		Desktop call = new Desktop();
		call.computermodel();
		call.desktopSize();
		String colour2=call.colour;
		System.out.println(colour2);
		
	}
}
