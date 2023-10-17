import java.io.*;

public class LetturaStampaArrayStringhe {

	public static void main(String[] args)throws IOException {
		
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		String array[], stringa;
		int numerostringhe, i = 0;
		
		System.out.print("Quante stringhe vuoi inserire? ");
		numerostringhe = Integer.parseInt(stdin.readLine());
		
		array = new String [numerostringhe];
		
		for (i = 0; i < array.length; i++)
			array[i] = stringa = new String (stdin.readLine());
		
		for (i = 0; i < array.length - 1; i++) 
			System.out.print(array[i] + " ");
		
		System.out.print(array[i] + ".");

	}

}