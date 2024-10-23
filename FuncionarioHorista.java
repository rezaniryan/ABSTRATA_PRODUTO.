package Gestao;

// classe funcionarioHorista que implementa a interface funcionario
public class FuncionarioHorista implements Funcionario {

	    private double totalAnualRecebido;// armazena o total anual

	    // classe construtora que inicia o total anual recebido
	    public FuncionarioHorista(double totalAnualRecebido) {
	        this.totalAnualRecebido = totalAnualRecebido;
	    }

	    // calcula o bônus baseado no total anual recebido
	    @Override
	    public double calcularBonus() {
	        return totalAnualRecebido * 0.10; // 10% do total anual
	    }

	    // metodo getter para receber o total anual recebido
	    public double getTotalAnualRecebido() {
	        return totalAnualRecebido;
	    }
	}


