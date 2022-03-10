package pacotepadrao;


public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	@Override // é uma anotação que indica que o método original esta sendo sobreescrito
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}
	@Override
	public void deposita(double valor) {
		super.saldo = super.saldo + valor;
		
	}
}
