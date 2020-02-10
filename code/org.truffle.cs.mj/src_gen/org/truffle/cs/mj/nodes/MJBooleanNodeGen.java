// CheckStyle: start generated
package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.dsl.GeneratedBy;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeCost;
import org.truffle.cs.mj.nodes.MJBooleanNode;

@GeneratedBy(MJBooleanNode.class)
public final class MJBooleanNodeGen extends MJBooleanNode {

    private MJBooleanNodeGen(boolean bool) {
        super(bool);
    }

    @Override
    public Object executeGeneric(VirtualFrame frameValue) {
        return doBoolean();
    }

    @Override
    public boolean executeBool(VirtualFrame frameValue) {
        return doBoolean();
    }

    @Override
    public NodeCost getCost() {
        return NodeCost.MONOMORPHIC;
    }

    public static MJBooleanNode create(boolean bool) {
        return new MJBooleanNodeGen(bool);
    }

}
