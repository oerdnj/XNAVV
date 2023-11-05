// SPDX-FileCopyrightText: Ondřej Surý
//
// SPDX-License-Identifier: WTFPL

package DuckFactory;
import DuckFactory.*;

public class WildDuck implements Duck {
	private int meatWeight = 5;
	public WildDuck() {
	}

	public int carve() {
		int meatWeight = this.meatWeight;
		if (meatWeight > 0) {
			this.meatWeight = 0;

			System.out.println("Don't forget to cook the duck meat before eating!");

			return meatWeight;
		} else {
			System.out.println("You can't eat the duck twice!");
			return 0;
		}
	}
}
