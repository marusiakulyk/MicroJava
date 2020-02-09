package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.dsl.Specialization;

public abstract class MJFloatNode extends MJExpressionNode {

    private float value;

    public MJFloatNode(float value) {
        this.value = value;
    }

    @Specialization
    public float doFloat() {
        return value;
    }
}
