
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoUser = new Conta();
		contaDoUser.saldo = 100;
		contaDoUser.deposita(50);
		System.out.println(contaDoUser.saldo);
		
		boolean conseguiuRetirar = contaDoUser.saca(20);
		System.out.println(contaDoUser.saldo);
		System.out.println(conseguiuRetirar);
	}
}
