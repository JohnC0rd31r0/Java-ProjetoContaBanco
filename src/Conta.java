import java.util.Scanner;

public abstract class Conta {
	private  static final int AGENCIA_PADRAO = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	private String nome;
	
	private static int SEQUENCIAL = 1;

	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.nome = cliente.getNome();
	}
	
	public boolean sacar(double valor) {
		if(saldo >= valor && valor > 0) {
			saldo -= valor;
			return true;
		}else {
			System.out.println("-----------------------");
			System.out.println("Transação Inválida");
			return false;
		}
		
	}
	
	public abstract void imprimirExtrato(); 
	
	
	public void depositar(double valor) {
		if(valor > 0) {
			this.saldo += valor;
		}else {
			System.out.println("Insira um valor válido");
			Scanner sc = new Scanner(System.in);
			valor = sc.nextDouble();
			depositar(valor);
		}
	}
	public void transferir(double valor, Conta contaDestino) {
		if(this.sacar(valor)) {
			contaDestino.depositar(valor);
		}
		
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println(String.format("Nome: %s", this.nome));
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}


}
