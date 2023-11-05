// SPDX-FileCopyrightText: Ondřej Surý
//
// SPDX-License-Identifier: WTFPL

package StateMachine;
import StateMachine.*;

public class RunningState extends State {
	public RunningState(StateMachine sm) {
		super(sm);
	}

	public void pause() {
		getStateMachine().setState(getStateMachine().IDLE);
	}
	public void stop() {
		getStateMachine().setState(getStateMachine().READY);
	}
}
