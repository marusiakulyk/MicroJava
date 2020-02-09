package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.dsl.Specialization;

public abstract class MJBooleanNode extends MJExpressionNode {

    private boolean bool;

    public MJBooleanNode(boolean bool) {
        this.bool = bool;
    }

    @Specialization
    public boolean doBoolean() {
        return bool;
    }
}
