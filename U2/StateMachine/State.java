// SPDX-FileCopyrightText: Ondřej Surý
//
// SPDX-License-Identifier: WTFPL

package StateMachine;
import StateMachine.*;

public abstract class State {
	private StateMachine sm;

	public State(StateMachine sm) {
		this.sm = sm;
	}

	public StateMachine getStateMachine() {
		return this.sm;
	}

	public void ready() {
		throw new UnsupportedOperationException("Invalid transition method of the current state");
	}
	public void run(){
		throw new UnsupportedOperationException("Invalid transition method of the current state");
	}
	public void stop(){ // break is a keyword
		throw new UnsupportedOperationException("Invalid transition method of the current state");
	}
	public void pause() { // wait is a keyword
		throw new UnsupportedOperationException("Invalid transition method of the current state");
	}
	public String status() {
		String s = getClass().getName();
		return s.substring(s.lastIndexOf('.') + 1);
	}
}
