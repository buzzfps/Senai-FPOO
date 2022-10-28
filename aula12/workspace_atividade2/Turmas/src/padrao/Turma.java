package padrao;

public class Turma {
	String nomeTurma;
	String periodo;
	String diaSemana;
	int numAlunos;
	int horasSemanais;
	float mensalidade;
	
	Turma(){}
	
	Turma(String nomt, String peri, String diase, int numal, int horasema, float mensal){
		nomeTurma = nomt;
		periodo = peri;
		diaSemana = diase;
		numAlunos = numal;
		horasSemanais = horasema;
		mensalidade = mensal;
	}
	
	public float faturamentoMensal() {
		return numAlunos*mensalidade;
	}
	public float faturamentoPorHora() {
		return faturamentoMensal() / (4.5f * horasSemanais);
	}
	
	public String toSring(){
		return String.format("%s\t%s\t%s\t%d\t%d\t%.2f\t%.2f\t%.2f", nomeTurma, periodo, diaSemana, numAlunos, horasSemanais, mensalidade, faturamentoMensal(), faturamentoPorHora());
	}
	
}
