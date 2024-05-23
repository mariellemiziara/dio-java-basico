package DesafioBanco;

public class Cliente {
    
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    public void sacar(Conta conta, double valor) {
    	conta.saldo -= valor;
    }
}
