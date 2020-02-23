/**
 * 
 * @author Aisosa
 *
 */
import java.util.scanner,
public class CoatAdviser {
    public static void main(String[] args) {
    	scanner kb = new scanner(system.in);
    	
    	System.out.println("Welcome To Coat Adviser");
    	System.out.println("Enter Weather in Fareinheit");
    	double weather = kb.nextDouble();
    	
    	if(weather>70)
    		System.out.println("It's hot");
    	else if(weather>50)
    		System.out.println("It's warm");
    	else if(weather>30)
    		System.out.println("It's cold, wear a jacket");
    	else
    		System.out.println("It's too cold, wear a coat");
    		
    }
	
}
