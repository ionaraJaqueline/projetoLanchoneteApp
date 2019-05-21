package entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Funcionario extends Usuario {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="SALARIO")
	private Float salario;

	public Funcionario() {

	}

	public Float getSalario() {
		return salario;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}

}