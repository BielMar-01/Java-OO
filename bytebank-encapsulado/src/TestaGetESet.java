
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		//conta.numero = 1337; - maneira errada
		conta.setNumero(1337);
		conta.setAgencia(1);
		System.out.println(conta.getNumero());
		System.out.println(conta.getAgencia());
	}
}
