package br.com.clone;

public class Cliente2 {
	public static void main(String[] args) {
		Cliente x = new Cliente();
		x.setNome("Glaidson");
		x.setEndereco("rua jacutinga");
		x.setDocumento(11452);
		System.out.println(x.getNome());
		System.out.println(x.getEndereco());
		System.out.println(x.getDocumento());
	}

}
