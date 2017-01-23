package br.com.clone;

import br.com.treinar.caixa.modelo.caixa.Conta;

public class ContaInvestimento extends Conta {

	public Double taxaRendimento;
	public Double taxaManutencao;
	
	//sobreescreve o metodo depositar contido na classe pai
	//alterando o funcionamento para as especifica��es necessarias em uma conta investimento
	@Override
	public void depositar(Double valor) {
		// TODO Auto-generated method stub
		
	}
	
}
