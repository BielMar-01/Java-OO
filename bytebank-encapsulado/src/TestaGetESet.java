
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		//conta.numero = 1337; - maneira errada
		//conta.setNumero(1337); - maneira certa
		//conta.setAgencia(1);
		System.out.println(conta.getNumero());
		System.out.println(conta.getAgencia());
		
		Cliente gabriel = new Cliente();
		//conta.titular = gabriel;
		gabriel.setNome("Gabriel Marques");
		
		conta.setTitular(gabriel);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		
		// Agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador Java");
		
		// Chamando o mesmo dado:
		System.out.println(titularDaConta);
		System.out.println(gabriel);
		System.out.println(conta.getTitular());
	}
}
