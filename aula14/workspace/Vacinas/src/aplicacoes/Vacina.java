package aplicacoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Vacina {
	
	private String nomedoPet;
	private String veterinario;
	private String nomeVacina;
	private Calendar data = Calendar.getInstance();
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Vacina(String nomedoPet, String veterinario, String nomeVacina, String data) throws ParseException {
		this.nomedoPet = nomedoPet;
		this.veterinario = veterinario;
		this.nomeVacina = nomeVacina;
		this.data.setTime(sdf.parse(data));
	}

	public String getNomedoPet() {
		return nomedoPet;
	}

	public void setNomedoPet(String nomedoPet) {
		this.nomedoPet = nomedoPet;
	}

	public String getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(String veterinario) {
		this.veterinario = veterinario;
	}

	public String getNomeVacina() {
		return nomeVacina;
	}

	public void setNomeVacina(String nomeVacina) {
		this.nomeVacina = nomeVacina;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	int vacinadoAquantosDias() {
		Calendar hoje = Calendar.getInstance();
		return hoje.get(Calendar.DAY_OF_YEAR) - data.get(Calendar.DAY_OF_YEAR);
	}
	
	public String toString() {
		return String.format("%s\t%s\t%s\t%s\t%d", nomedoPet, veterinario, nomeVacina, sdf.format(data.getTime()), vacinadoAquantosDias());
	}
	
}
