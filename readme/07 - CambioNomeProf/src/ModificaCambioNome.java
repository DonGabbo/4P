import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ModificaCambioNome {

	public static void main(String[] args) throws IOException {
		
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		String nome[], nomiModificati[];
		int n;
		
		System.out.println("Quant nomi vuoi inserire: ");
		n = Integer.parseInt(stdin.readLine());
		
		nome = new String [n];
		nomiModificati = new String [n];
		
		for (int i = 0; i < n; i++) 
			nome[i] = new String (stdin.readLine());
		
		for (int i = 0; i < n; i++) 
			System.out.print(nome[i] + ", ");
		
		
		for (int i = 0; i < n; i++) {
			nomiModificati[i] = nome[i].trim();
			//nomiModificati[i] = nomiModificati[i].toLowerCase();
			if (nomiModificati[i].substring(0, 4).equalsIgnoreCase("anna")) {
				nomiModificati[i] = "Maria" + nomiModificati[i].substring(4);
				nomiModificati[i] = nomiModificati[i].replaceAll(" ", "");
			}
		}
		
		System.out.print("\n");
		System.out.println("Nomi Modificati: ");
		
		for (int i = 0; i < n; i++) 
			System.out.print(nomiModificati[i] + ", ");
			
	}

}
