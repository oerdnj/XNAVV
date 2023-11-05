# Simple StateMachine Patter in Java

Ondřej Surý, P23010
XNAVV, Úkol č. 1

Implement a simple state machine with following states and transitions:

Three states:
  * READY
  * IDLE
  * RUNNING

Four transitions:

  * IDLE->ready()->READY
  * READY->run()->RUNNING
  * RUN->wait()->IDLE
  * RUN->break()->READY
