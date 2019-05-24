package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comanda {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long codigo;
	@Column(name="Numero")
	private Integer numero;

	public Comanda() {

	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

}
