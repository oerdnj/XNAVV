// SPDX-FileCopyrightText: Ondřej Surý
//
// SPDX-License-Identifier: WTFPL

package StateMachine;
import StateMachine.*;

public class IdleState extends State {
	public IdleState(StateMachine sm) {
		super(sm);
	}

	public void ready() {
		getStateMachine().setState(getStateMachine().READY);
	}
}
