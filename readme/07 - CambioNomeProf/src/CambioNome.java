import java.io.*;

public class CambioNome {

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
		
		for (int i = 0; i < n; i++) {
			System.out.print(nome[i] + ", ");
			nomiModificati[i] = nome[i];
		}
		
		for (int i = 0; i < n; i++) {
			nomiModificati[i] = nome[i].replaceAll(" ", "");
			nomiModificati[i] = nomiModificati[i].toLowerCase();
			if (nomiModificati[i].startsWith("anna")) {
				nomiModificati[i] = "Maria" + nomiModificati[i].substring(4);
			}
		}
		
		System.out.print("\n");
		System.out.println("Nomi Modificati: ");
		
		for (int i = 0; i < n; i++) 
			System.out.print(nomiModificati[i] + ", ");
			
	}

}
