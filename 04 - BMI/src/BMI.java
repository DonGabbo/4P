
public class BMI {

	public static void main(String[] args) {
		final int grammikilo = 1000;
		final int centimetrimetri = 100;
		
		int peso = 62000;
		int altezza = 174;	
		
		double pesokili = (double)peso / grammikilo;
		double altezzametri = (double)altezza / centimetrimetri;
		
		double bmi = pesokili / (altezzametri * altezzametri);
		
		System.out.println("Il tuo BMI è: " + bmi);
		
		if (bmi < 18.5) {
			System.out.print("Sei sottopeso.");
		}
		else if (bmi > 25) {
			System.out.print("Sei sovrappeso.");
		}
		else System.out.print("Il tuo peso è nella norma.");
	}
}
