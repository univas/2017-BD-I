package br.edu.univas.si4.bd1;

public class AreaPesquisaException extends Exception {

	public AreaPesquisaException() {
	}

	public AreaPesquisaException(String message) {
		super(message);
	}

	public AreaPesquisaException(Throwable cause) {
		super(cause);
	}

	public AreaPesquisaException(String message, Throwable cause) {
		super(message, cause);
	}

	public AreaPesquisaException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
