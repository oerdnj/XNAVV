// SPDX-FileCopyrightText: Ondřej Surý
//
// SPDX-License-Identifier: WTFPL

import StateMachine.*;

public class StateMachineTest {
	// We should also test whether the States throw the exceptions,
	// but this would require a test framework (or spaghetti below).

	public static void main(String[] args) {
		StateMachine sm = new StateMachine();

		sm.print();
		sm.ready();
		sm.print();
		sm.run();
		sm.print();
		sm.stop();
		sm.print();
		sm.run();
		sm.print();
		sm.pause();
		sm.print();
	}
}
