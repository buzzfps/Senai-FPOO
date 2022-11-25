package padrao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Main {
	
	static BufferedReader br;
	static int i = 0;
	
	public static void main(String[] args) {
		try {
			br = new BufferedReader(new FileReader("./bd/dados2.csv"));
			String linha = br.readLine();
			while(linha != null) {
				String coluna[] = linha.split(";");
				System.out.println(coluna[0]+"\t"+coluna[1]+"\t"+coluna[2]);
				linha = br.readLine();
				i++;
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado, erro: "+e);
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo, erro: "+e);
		}
		
		System.out.printf("A quantidade de linhas do programa é : %d", i);	  
	}
}
