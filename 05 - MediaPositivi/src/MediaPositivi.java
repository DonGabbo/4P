import java.io.*;
public class MediaPositivi {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Quanti numeri vuoi immettere? ");
		int nnumeri = Integer.parseInt(stdin.readLine());
		
		int array[];
		array = new int [nnumeri];
		
		for (int p = 0; p < nnumeri; p++) 
		    array[p] = Integer.parseInt(stdin.readLine());
		
		for (int p = 0; p < nnumeri; p++) 
			System.out.print(array[p] + ", ");
		
		int array2 [];
		array2 = new int [nnumeri];
		
		int z = 0;
		
		for (int p = 0; p < nnumeri; p++ ) {
			if(array[p] > 0) {
				array2[p] = array[p];
				z++;
		}
		}
		System.out.println(z);
		
		int somma = 0;
		float mediapositivi = 0;
		
		for (int p = 0; p < nnumeri; p++) 
			somma = somma + array2[p];
		
		System.out.println(somma);
		
		mediapositivi = somma / (float)z;
		
		System.out.print("La media dei numeri positivi è: " + mediapositivi);
			
	}

}
