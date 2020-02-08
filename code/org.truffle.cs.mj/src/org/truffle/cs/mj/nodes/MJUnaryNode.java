package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;

@NodeChild(value = "lhs", type = MJExpressionNode.class)
public class MJUnaryNode extends MJExpressionNode {

    public static abstract class IncrementNode extends MJUnaryNode {
        @Specialization
        public int add(int lhs) {
            return lhs + 1;
        }
    }

    public static abstract class DecrementNode extends MJUnaryNode {
        @Specialization
        public int add(int lhs) {
            return lhs - 1;
        }
    }

}
