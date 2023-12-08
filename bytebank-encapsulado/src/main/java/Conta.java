

//VOID não retorna nada
public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	//STATIC significa que o atributo é da classe Conta
	private static int total;

	//construtor
	public Conta( int numero,int agencia) {
		Conta.total++;
		//System.out.println("O total de contas é: " + Conta.total );
		this.numero = numero;
		this.agencia = agencia;
		
		System.out.println("estou criando uma conta " 
		                    +"Numero " + this.numero
		                    +"Agencia " + this.agencia);
	}

	public void deposita(double valor) {

		// this.saldo = saldo + valor;
		this.saldo += valor;
	}

	public boolean saca(double valor) {

		if (this.saldo >= valor) {

			// this.saldo = saldo - valor;
			this.saldo -= valor;

		} else {

			System.out.println("Seu saldo é insufuciente!");
		}

		return true;

	}

	public boolean transfere(double valor, Conta destino) {

		if (this.saldo >= valor) {

			this.saldo -= valor;

			destino.deposita(valor);

			return true;

		} else {

			return false;
		}
	}

	 public int getNumero() { 
         return this.numero;
     }

     public void setNumero(int numero) { 
         this.numero = numero;
     }

     public int getAgencia() {
         return this.agencia;
    }

	 public void setAgencia(int agencia){
	     this.agencia = agencia;
	 }
	
	 public void setTitular(Cliente titular) { 
	     this.titular = titular; 
	
	 }
	
	 public Cliente getTitular() {
	     return titular;
	 }

	public static int getTotal() {
		return total;
	}
    
	// static significa que é um atributo da própria classe
	// nesse exemplo o atributo total é para calcular o total 
	//de todas as contas criadas.
	public static void setTotal(int total) {
		Conta.total = total;
	}
	 
	
	
	
	
}
