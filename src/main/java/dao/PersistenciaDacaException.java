package dao;

import exception.DacException;

public class PersistenciaDacaException extends DacException {

	private static final long serialVersionUID = 1780243892137781599L;

	public PersistenciaDacaException(String mensagem) {
		super(mensagem);
	}

	public PersistenciaDacaException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

}