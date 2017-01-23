package br.com.clone.treinamento;


public class Comparacao {
	public static void main(String[] args) {
		Carro1 fiat = new Carro1();
		fiat.nome = "idea";
		fiat.placa= "ck1212";
		fiat.chassi = 1212551;
		
		
		Carro1 chevrolet = new Carro1();
		chevrolet.nome = "prisma";
		chevrolet.placa = "ckck";
		chevrolet.chassi = 122121;
		
		System.out.println(fiat.equals(chevrolet));
		
		
		
		
		
		
		
	}

}
