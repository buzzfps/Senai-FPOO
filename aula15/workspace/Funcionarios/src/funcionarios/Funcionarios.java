package funcionarios;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Funcionarios {
	private int matricula;
	private String nome;
	private Calendar nascimento = Calendar.getInstance();

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Funcionarios(int matricula, String nome, Calendar nascimento)throws ParseException {
		this.matricula = matricula;
		this.nome = nome;
		this.nascimento = nascimento;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getNascimento() {
		return nascimento;
	}

	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}

	public String toString() {
		return String.format("%d\t%s\t%s", matricula, nome, sdf.format(nascimento.getTime()));
	}

}
