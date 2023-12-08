
public class TestaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(4646,664);
		
		conta.setAgencia(213421);
		System.out.println(conta.getAgencia());
		
		Cliente paulo = new Cliente();
		
		paulo.getNome();
		
		conta.setTitular(paulo);
	}
}
