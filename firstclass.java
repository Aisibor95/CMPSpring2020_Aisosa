/**
 * 
 * @author Aisosa
 *created: 1.29.20
 *description: This program calculates the Birth Year
 *
 **/
import java.util.scanner;
public class FirstProgram {
     //This is the first method the JVM looks for, to run
	public static void main(string[] args) {
		Scanner Keyboard = new scanner(System.in);
		System.out.println("Welcome to my First Program \nThis program calculates the Birth Year");
		System.out.print("Enter your age: ");
		int age = Keyboard.nextInt();
		
		int birthYear =2020-age;
		System.out.println("You are most likely to be born in " + birthYear);
		
	}
}
