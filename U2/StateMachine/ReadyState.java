// SPDX-FileCopyrightText: Ondřej Surý
//
// SPDX-License-Identifier: WTFPL

package StateMachine;
import StateMachine.*;

public class ReadyState extends State {
	public ReadyState(StateMachine sm) {
		super(sm);
	}

	public void run() {
		getStateMachine().setState(getStateMachine().RUNNING);
	}
}
