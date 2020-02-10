package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node.Child;

public class MJAssigmentNode extends MJStatementNode {
    @Child MJStatementNode statement;

    public MJAssigmentNode(MJStatementNode statement) {
        this.statement = statement;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        statement.execute(frame);
        return null;
    }

}
