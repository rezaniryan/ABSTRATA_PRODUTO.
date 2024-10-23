package Gestao;

// importa as classes funcionario assalariado e horista
import Gestao.FuncionarioAssalariado;
import Gestao.FuncionarioHorista;

// metodo main
public class Main { 

	    public static void main(String[] args) {
	        
	    	// cria um funcionario assalariado
	        FuncionarioAssalariado funcionario1 = new FuncionarioAssalariado(60000);
	        System.out.println("Bônus do funcionário assalariado: R$ " + funcionario1.calcularBonus());

	        // cria um funcionario horista
	        FuncionarioHorista funcionario2 = new FuncionarioHorista(80000);
	        System.out.println("Bônus do funcionário horista: R$ " + funcionario2.calcularBonus());
	    }
	}



