package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.UnexpectedResultException;

public abstract class MJExpressionNode extends Node {

    public abstract Object executeGeneric(VirtualFrame frame);

    public int executeI32(VirtualFrame frame) throws UnexpectedResultException {
        return MJTypeNodeGen.expectInteger(executeGeneric(frame));
    }

// public boolean executeBool(VirtualFrame frame) throws UnexpectedResultException {
// return MJTypeNodeGen.expectInteger(executeGeneric(frame)) != 0;
// }

    public boolean executeBool(VirtualFrame frame) {
        Object resultObject = executeGeneric(frame);
        if (resultObject instanceof Boolean) {
            return (boolean) resultObject;
        }
        CompilerDirectives.transferToInterpreter();
        throw new Error("type mismatch");
    }
}
