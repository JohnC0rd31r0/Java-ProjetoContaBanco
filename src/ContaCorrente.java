
public class ContaCorrente extends Conta{
	private static int SEQUENCIAL = 0;

	public void imprimirExtrato() {
		System.out.println("------ Extrato Conta Corrente ------");
		super.imprimirInfosComuns();
	}

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}
}
