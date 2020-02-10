// CheckStyle: start generated
package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.dsl.GeneratedBy;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeCost;
import org.truffle.cs.mj.nodes.MJFloatNode;

@GeneratedBy(MJFloatNode.class)
public final class MJFloatNodeGen extends MJFloatNode {

    private MJFloatNodeGen(float value) {
        super(value);
    }

    @Override
    public Object executeGeneric(VirtualFrame frameValue) {
        return doFloat();
    }

    @Override
    public boolean executeBool(VirtualFrame frameValue) {
        CompilerDirectives.transferToInterpreterAndInvalidate();
        throw new AssertionError("Delegation failed.");
    }

    @Override
    public NodeCost getCost() {
        return NodeCost.MONOMORPHIC;
    }

    public static MJFloatNode create(float value) {
        return new MJFloatNodeGen(value);
    }

}
