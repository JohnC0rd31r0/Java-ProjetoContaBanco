
public class Main {

	public static void main(String[] args) {
		Cliente joao = new Cliente();
		
		joao.setNome("Joao");
		
		Cliente carlos = new Cliente();
		
		carlos.setNome("Carlos");
		
		Conta cc = new ContaCorrente(joao);
		
		Conta poupanca = new ContaPoupanca(joao);
		
		Conta ppCarlos = new ContaPoupanca(carlos);
		
		cc.depositar(55);
		
		cc.transferir(40, ppCarlos);
		
		cc.imprimirExtrato();
		
		poupanca.imprimirExtrato();
		
		ppCarlos.imprimirExtrato();
	}	

}
