package br.com.contmatic.exceptions;

public class NomeInvalidoException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NomeInvalidoException (String message) {
		super(message);
	}
}
