package depozit;
import java.util.Scanner;
public class depozitt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("vnesete go iznosot na depozitot: ");
        double pocetnaSuma = scanner.nextDouble();
        System.out.print("vnesete go periodot: ");
        int period = scanner.nextInt();
        double kamata = pocetnaSuma * 0.04 * period;
        double krajnaSuma = pocetnaSuma + kamata;
        System.out.println("pocetna suma: " + pocetnaSuma);
        System.out.println(" kamata za" + period + " meseci so stapka 4% e: " + kamata);
        System.out.println( "krajna suma "+ krajnaSuma);
        
        scanner.close();

        

        


	}

}
