package br.com.clone;

import br.com.treinar.caixa.modelo.caixa.Conta;

public class ContaPoupanca extends Conta {

	public Float taxaRendimento;
	
	//sobreescreve o metodo depositar contido na classe pai
	//alterando o funcionamento para as especifica��es necessarias em uma conta poupan�a
	@Override
	public void depositar(Double valor) {
		saldo += valor;
	}
	
}
