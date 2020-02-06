package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ControlFlowException;

public class MJBreakNode extends MJStatementNode {

    @Override
    public Object execute(VirtualFrame frame) {
        throw new MJBreakException(null);
    }

    public static class MJBreakException extends ControlFlowException {
        public final Object value;

        public MJBreakException(Object value) {
            this.value = value;
        }
    }

}
