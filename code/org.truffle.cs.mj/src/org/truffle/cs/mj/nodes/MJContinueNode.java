package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ControlFlowException;

public class MJContinueNode extends MJStatementNode {
    @Override
    public Object execute(VirtualFrame frame) {
        throw new MJContinueException(null);
    }

    public static class MJContinueException extends ControlFlowException {
        public final Object value;

        public MJContinueException(Object value) {
            this.value = value;
        }
    }
}
