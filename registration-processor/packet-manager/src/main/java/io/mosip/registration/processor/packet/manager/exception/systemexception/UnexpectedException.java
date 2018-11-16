package io.mosip.registration.processor.packet.manager.exception.systemexception;

import io.mosip.kernel.core.exception.BaseUncheckedException;
import io.mosip.registration.processor.core.exception.util.PlatformErrorCodes;

/**
 * This is unexpected exception.
 *
 */
public class UnexpectedException extends BaseUncheckedException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new unexpected exception.
	 */
	public UnexpectedException() {
		super();
	}

	/**
	 * Instantiates a new unexpected exception.
	 *
	 * @param message the message
	 */
	public UnexpectedException(String message) {
		super(PlatformErrorCodes.RPR_PKM_UNEXCEPTED_ERROR, message);
	}

	/**
	 * Instantiates a new unexpected exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public UnexpectedException(String message, Throwable cause) {
		super(PlatformErrorCodes.RPR_PKM_UNEXCEPTED_ERROR + EMPTY_SPACE, message, cause);
	}
}
