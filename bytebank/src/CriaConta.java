
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.titular = "Lucas";
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.titular = "Gabriel";
		segundaConta.saldo = 100;
		System.out.println(segundaConta.titular);
		
		System.out.println("Segunda conta é do " + primeiraConta.titular + " com saldo de " + primeiraConta.saldo);
		System.out.println("Segunda conta é do " + segundaConta.titular + " com saldo de " + segundaConta.saldo);
	}
}
