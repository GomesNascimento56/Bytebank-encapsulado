
public class TesteDeConstrutor {

	public static void main(String[] args) {
		
		Conta conta = new Conta(455,5454);
		
		Conta conta2 = new Conta(455,6545);
			
		
		System.out.println("Total de conta: " + Conta.getTotal());
		
	}
}
