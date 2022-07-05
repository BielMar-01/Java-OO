
public class TestaBanco {

	public static void main(String[] args) {
		Cliente gabriel = new Cliente();
		gabriel.nome = "Gabriel Marques";
		gabriel.cpf = "222.222.222-22";
		gabriel.profissao = "programador";
		
		Conta contaDoGabriel = new Conta();
		contaDoGabriel.deposita(100);
		
		contaDoGabriel.titular = gabriel;
		System.out.println(contaDoGabriel.titular);
		System.out.println(gabriel);
		System.out.println(contaDoGabriel.titular.nome);
	}
}
