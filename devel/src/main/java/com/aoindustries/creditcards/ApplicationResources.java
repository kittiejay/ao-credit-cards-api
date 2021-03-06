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

import com.aoindustries.util.i18n.EditableResourceBundle;
import com.aoindustries.util.i18n.EditableResourceBundleSet;
import com.aoindustries.util.i18n.Locales;
import java.io.File;
import java.util.Locale;

/**
 * @author  AO Industries, Inc.
 */
public final class ApplicationResources extends EditableResourceBundle {

	public static final EditableResourceBundleSet bundleSet = new EditableResourceBundleSet(
		ApplicationResources.class,
		Locale.ROOT,
		Locales.ARABIC,
		Locale.GERMAN,
		Locale.ENGLISH,
		Locales.SPANISH,
		Locale.FRENCH,
		Locale.ITALIAN,
		Locale.JAPANESE,
		Locales.PORTUGUESE,
		Locale.CHINESE
	);

	static File[] getSourceFile(String filename) {
		return new File[] {
			// AO build
			new File(System.getProperty("user.home")+"/maven2/ao/ao-credit-cards/ao-credit-cards-api/src/main/java/com/aoindustries/creditcards", filename),
			// Windows development system
			// new File("C:/maven2/ao/ao-credit-cards/ao-credit-cards/src/main/java/com/aoindustries/creditcards", filename)
		};
	}

	public ApplicationResources() {
		super(Locale.ROOT, bundleSet, getSourceFile("ApplicationResources.properties"));
	}
}
