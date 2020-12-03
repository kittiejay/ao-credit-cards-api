/*
 * ao-credit-cards-api - Credit card processing API supporting multiple payment gateways.
 * Copyright (C) 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2016, 2019, 2020  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of ao-credit-cards-api.
 *
 * ao-credit-cards-api is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ao-credit-cards-api is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with ao-credit-cards-api.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.aoindustries.creditcards;

import com.aoindustries.io.LocalizedIOException;
import com.aoindustries.lang.Throwables;
import java.io.Serializable;

/**
 * Extends <code>LocalizedIOException</code> to provide exceptions along with the corresponding error code.
 *
 * @author  AO Industries, Inc.
 */
public class ErrorCodeException extends LocalizedIOException {

	private static final long serialVersionUID = 1L;

	final private TransactionResult.ErrorCode errorCode;

	public ErrorCodeException(TransactionResult.ErrorCode errorCode, String key) {
		super(Resources.RESOURCES, key);
		this.errorCode = errorCode;
	}

	public ErrorCodeException(TransactionResult.ErrorCode errorCode, String key, Serializable... args) {
		super(Resources.RESOURCES, key, args);
		this.errorCode = errorCode;
	}

	public ErrorCodeException(Throwable cause, TransactionResult.ErrorCode errorCode, String key) {
		super(cause, Resources.RESOURCES, key);
		this.errorCode = errorCode;
	}

	public ErrorCodeException(Throwable cause, TransactionResult.ErrorCode errorCode, String key, Serializable... args) {
		super(cause, Resources.RESOURCES, key, args);
		this.errorCode = errorCode;
	}

	public TransactionResult.ErrorCode getErrorCode() {
		return errorCode;
	}

	static {
		Throwables.registerSurrogateFactory(ErrorCodeException.class, (template, cause) ->
			new ErrorCodeException(
				cause,
				template.errorCode,
				template.key,
				template.args
			)
		);
	}
}
