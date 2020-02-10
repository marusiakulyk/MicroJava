// CheckStyle: start generated
package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.dsl.GeneratedBy;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeCost;
import org.truffle.cs.mj.nodes.MJCharNode;

@GeneratedBy(MJCharNode.class)
public final class MJCharNodeGen extends MJCharNode {

    private MJCharNodeGen(char ch) {
        super(ch);
    }

    @Override
    public Object executeGeneric(VirtualFrame frameValue) {
        return doChar();
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

    public static MJCharNode create(char ch) {
        return new MJCharNodeGen(ch);
    }

}
