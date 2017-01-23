package br.com.clone.treinamento;

public class Carro1 {
	int chassi;
	String nome;
	String placa;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + chassi;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro1 other = (Carro1) obj;
		if (chassi != other.chassi)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		return true;
	}
	

}
