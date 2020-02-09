package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.dsl.Specialization;

public abstract class MJCharNode extends MJExpressionNode {

    private char ch;

    public MJCharNode(char ch) {
        this.ch = ch;
    }

    @Specialization
    public char doChar() {
        return ch;
    }
}
