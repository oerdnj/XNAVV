// SPDX-FileCopyrightText: Ondřej Surý
//
// SPDX-License-Identifier: WTFPL

package StateMachine;
import StateMachine.*;

public class StateMachine {
	public final State IDLE = new IdleState(this);
	public final State READY = new ReadyState(this);
	public final State RUNNING = new RunningState(this);

	private State state = IDLE;

	public void setState(State state) {
		this.state = state;
	}

	public void ready() {
		state.ready();
	}

	public void run() {
		state.run();
	}

	public void pause() {
		state.pause();
	}

	public void stop() {
		state.stop();
	}

	public String status() {
		return state.status();
	}

	public void print() {
		System.out.println("State machine is in " + this.status() + " state");
	}
}
