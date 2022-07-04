
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoUser = new Conta();
		contaDoUser.saldo = 100;
		contaDoUser.deposita(50);
		System.out.println(contaDoUser.saldo);
		
		boolean conseguiuRetirar = contaDoUser.saca(20);
		System.out.println(contaDoUser.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDoUser2 = new Conta();
		contaDoUser2.deposita(1000);
		
		boolean sucessoTranferencia = contaDoUser2.transfere(300, contaDoUser);
		if(sucessoTranferencia) {
			System.out.println("Transferencia feita com sucesso");
		} else {
			System.out.println("Erro ao tentar transferir, saldo insuficiente");
		}
		System.out.println(contaDoUser2.saldo);
		System.out.println(contaDoUser.saldo);
	}
}
