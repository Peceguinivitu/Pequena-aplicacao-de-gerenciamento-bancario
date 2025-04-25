package Entities;

public class Usuario {
	private String nome;
	private String sobrenome;
	private String CPF;
	private double saldo;
	
	
	public Usuario() {
		
	}

	public Usuario(String nome, String sobrenome, String CPF, double saldo) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.CPF = CPF;
		this.saldo=saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCPF() {
		return CPF;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public String consultarSaldo() {
		return "|Nome do proprietário:"+nome+" "+sobrenome+" saldo: R$"+saldo+"|";
	}
		public void deposito(double deposito) {
		    System.out.println(deposito > 0 ? "Depósito de R$ " + deposito + " realizado com sucesso." : "Não é possível depositar");
		    
		    saldo = (deposito > 0) ? saldo + deposito : saldo;
		}
		
	public void saque(double saque) {
	    System.out.println((saque > 0 && saque <= saldo) 
	        ? "Saque de R$ " + saque + " realizado com sucesso." 
	        : "Não é possível realizar o saque.");

	    saldo = (saque > 0 && saque <= saldo) ? saldo - saque : saldo;
	}



}
