package org.truffle.cs.mj.nodes;

import org.truffle.cs.mj.nodes.MJBreakNode.MJBreakException;
import org.truffle.cs.mj.nodes.MJContinueNode.MJContinueException;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.sun.org.apache.bcel.internal.generic.RETURN;

public class MJWhileLoop extends MJStatementNode {
    @Child MJExpressionNode condition;
    @Child MJStatementNode loopBody;

    public MJWhileLoop(MJExpressionNode cond, MJStatementNode block) {
        this.condition = cond;
        this.loopBody = block;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        while (condition.executeBool(frame)) {
            try {
                loopBody.execute(frame);
            } catch (MJBreakNode.MJBreakException e) {
                return e.value;
            } catch (MJContinueNode.MJContinueException e) {
                continue;
            }
        }
        return null;
    }

}
