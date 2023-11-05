// SPDX-FileCopyrightText: Ondřej Surý
//
// SPDX-License-Identifier: WTFPL

package DuckFactory;

import DuckFactory.*;
import java.lang.*;

public interface Duck {
	default public int carve() {
		throw new UnsupportedOperationException("Not implemented");
	}
	default public void lure() {
		throw new UnsupportedOperationException("Not implemented");
	}
	default public void frolick() {
		throw new UnsupportedOperationException("Not implemented");
	}
}
