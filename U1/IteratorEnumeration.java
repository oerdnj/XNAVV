// SPDX-FileCopyrightText: Ondřej Surý
//
// SPDX-License-Identifier: WTFPL

// Ondřej Surý, P23010
// XNAVV, Úkol č. 1

// Documentation for implementing the Adapter
// Enumeration: https://docs.oracle.com/javase/10/docs/api/java/util/Enumeration.html
// Iterator: https://docs.oracle.com/javase/10/docs/api/java/util/Iterator.html

import java.util.Iterator;
import java.util.Enumeration;

public class IteratorEnumeration<E> implements Enumeration {
	Iterator<E> iterator;

	public boolean hasMoreElements() {
		return iterator.hasNext();
	}

	public E nextElement() {
		// We can directly call next() as both nextElement() and next() throw:
		// https://docs.oracle.com/javase/10/docs/api/java/util/NoSuchElementException.html
		return iterator.next();
	}

	public Iterator<E> asIterator() {
		return iterator;
	}
}
