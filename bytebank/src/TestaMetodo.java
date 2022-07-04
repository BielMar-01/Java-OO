
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoUser = new Conta();
		contaDoUser.saldo = 100;
		contaDoUser.deposita(50);
		
		System.out.println(contaDoUser.saldo);
	}
}
