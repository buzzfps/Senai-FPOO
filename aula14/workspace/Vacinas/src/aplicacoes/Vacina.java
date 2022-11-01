package aplicacoes;


public class Vacina {
	static String nomedoPet;
	static String veterinario;
	static String nomeVacina;
	static String data;
	
	
	public String getNomedoPet() {
		return nomedoPet;
	}
	public void setNomedoPet(String nomedoPet) {
		Vacina.nomedoPet = nomedoPet;
	}
	public String getVeterinario() {
		return veterinario;
	}
	public void setVeterinario(String veterinario) {
		Vacina.veterinario = veterinario;
	}
	public String getNomeVacina() {
		return nomeVacina;
	}
	public void setNomeVacina(String nomeVacina) {
		Vacina.nomeVacina = nomeVacina;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		Vacina.data = data;
	}
	
	public String toString() {
		return String.format("\t%s\t\t%s\t\t%s\t\t%s\t", nomedoPet, veterinario, nomeVacina, data);
	}
	
	
	
	
	
	
}
