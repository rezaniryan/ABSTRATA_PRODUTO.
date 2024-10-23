package Gestao;

// classe funcionarioAssalariado que implementa a interface funcionario
public class FuncionarioAssalariado implements Funcionario {
	
	    private double salario;// armazena o salario

	    // construtor da classe 
	    public FuncionarioAssalariado(double salario) {
	        this.salario = salario;
	    }

	    // metodo que retorna o bonus fixo
	    @Override
	    public double calcularBonus() {
	        return 6000.00; // Bônus fixo
	    }

	    // metodo getter para obter o salario do funcionario
	    public double getSalario() {
	        return salario;
	    }
	}



