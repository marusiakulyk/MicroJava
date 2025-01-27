package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;

@NodeChild(value = "lhs", type = MJExpressionNode.class)
@NodeChild(value = "rhs", type = MJExpressionNode.class)
public abstract class MJBinaryNode extends MJExpressionNode {

    public static abstract class AddNode extends MJBinaryNode {
        @Specialization
        public int doInt(int lhs, int rhs) {
            return lhs + rhs;
        }

        @Specialization
        public float doInt(float lhs, float rhs) {
            return lhs + rhs;
        }

        @Specialization
        public float doInt(int lhs, float rhs) {
            return lhs + rhs;
        }

        @Specialization
        public float doInt(float lhs, int rhs) {
            return lhs + rhs;
        }

        @Specialization
        public char doInt(char lhs, int rhs) {
            return (char) (lhs + rhs);
        }

        @Specialization
        public char doInt(int lhs, char rhs) {
            return (char) (lhs + rhs);
        }

        @Specialization
        public char doInt(char lhs, char rhs) {
            return (char) (lhs + rhs);
        }
    }

    public static abstract class SubtractNode extends MJBinaryNode {
        @Specialization
        public int doInt(int lhs, int rhs) {
            return lhs - rhs;
        }

        @Specialization
        public float doInt(float lhs, float rhs) {
            return lhs - rhs;
        }

        @Specialization
        public float doInt(int lhs, float rhs) {
            return lhs - rhs;
        }

        @Specialization
        public float doInt(float lhs, int rhs) {
            return lhs - rhs;
        }

        @Specialization
        public char doInt(char lhs, int rhs) {
            return (char) (lhs - rhs);
        }

        @Specialization
        public char doInt(int lhs, char rhs) {
            return (char) (lhs - rhs);
        }

        @Specialization
        public char doInt(char lhs, char rhs) {
            return (char) (lhs - rhs);
        }
    }

    public static abstract class MultiplicationNode extends MJBinaryNode {
        @Specialization
        public int doInt(int lhs, int rhs) {
            return lhs * rhs;
        }

        @Specialization
        public float doInt(float lhs, float rhs) {
            return lhs * rhs;
        }

        @Specialization
        public float doInt(int lhs, float rhs) {
            return lhs * rhs;
        }

        @Specialization
        public float doInt(float lhs, int rhs) {
            return lhs * rhs;
        }
    }

    public static abstract class DividerNode extends MJBinaryNode {
        @Specialization
        public int doInt(int lhs, int rhs) {
            return lhs / rhs;
        }

        @Specialization
        public float doInt(float lhs, float rhs) {
            return lhs / rhs;
        }

        @Specialization
        public float doInt(float lhs, int rhs) {
            return lhs / rhs;
        }

        @Specialization
        public float doInt(int lhs, float rhs) {
            return lhs / rhs;
        }
    }

    public static abstract class ModulationNode extends MJBinaryNode {
        @Specialization
        public int doInt(int lhs, int rhs) {
            return lhs % rhs;
        }
    }

    public static abstract class EqualNode extends MJBinaryNode {
        @Specialization
        public boolean equal(int lhs, int rhs) {
            return lhs == rhs;
        }

        @Specialization
        public boolean equal(float lhs, float rhs) {
            return lhs == rhs;
        }

        @Specialization
        public boolean equal(float lhs, int rhs) {
            return lhs == rhs;
        }

        @Specialization
        public boolean equal(int lhs, float rhs) {
            return lhs == rhs;
        }

        @Specialization
        public boolean equal(char lhs, char rhs) {
            return lhs == rhs;
        }

        @Specialization
        public boolean equal(char lhs, int rhs) {
            return lhs == rhs;
        }

        @Specialization
        public boolean equal(int lhs, char rhs) {
            return lhs == rhs;
        }

        @Specialization
        public boolean equal(Object lhs, Object rhs) {
            return lhs == rhs;
        }

    }

    public static abstract class NotEqualNode extends MJBinaryNode {
        @Specialization
        public boolean equal(int lhs, int rhs) {
            return lhs != rhs;
        }

        @Specialization
        public boolean equal(float lhs, float rhs) {
            return lhs != rhs;
        }

        @Specialization
        public boolean equal(float lhs, int rhs) {
            return lhs != rhs;
        }

        @Specialization
        public boolean equal(int lhs, float rhs) {
            return lhs != rhs;
        }

        @Specialization
        public boolean equal(char lhs, char rhs) {
            return lhs != rhs;
        }

        @Specialization
        public boolean equal(char lhs, int rhs) {
            return lhs != rhs;
        }

        @Specialization
        public boolean equal(int lhs, char rhs) {
            return lhs != rhs;
        }

        @Specialization
        public boolean equal(Object lhs, Object rhs) {
            return lhs != rhs;
        }

    }

    public static abstract class LessNode extends MJBinaryNode {
        @Specialization
        public boolean equal(int lhs, int rhs) {
            return lhs < rhs;
        }

        @Specialization
        public boolean equal(float lhs, float rhs) {
            return lhs < rhs;
        }

        @Specialization
        public boolean equal(float lhs, int rhs) {
            return lhs < rhs;
        }

        @Specialization
        public boolean equal(int lhs, float rhs) {
            return lhs < rhs;
        }

        @Specialization
        public boolean equal(char lhs, char rhs) {
            return lhs < rhs;
        }

        @Specialization
        public boolean equal(char lhs, int rhs) {
            return lhs < rhs;
        }

        @Specialization
        public boolean equal(int lhs, char rhs) {
            return lhs < rhs;
        }

    }

    public static abstract class LessEqualNode extends MJBinaryNode {
        @Specialization
        public boolean equal(int lhs, int rhs) {
            return lhs <= rhs;
        }

        @Specialization
        public boolean equal(float lhs, float rhs) {
            return lhs <= rhs;
        }

        @Specialization
        public boolean equal(float lhs, int rhs) {
            return lhs <= rhs;
        }

        @Specialization
        public boolean equal(int lhs, float rhs) {
            return lhs <= rhs;
        }

        @Specialization
        public boolean equal(char lhs, char rhs) {
            return lhs <= rhs;
        }

        @Specialization
        public boolean equal(char lhs, int rhs) {
            return lhs <= rhs;
        }

        @Specialization
        public boolean equal(int lhs, char rhs) {
            return lhs <= rhs;
        }

    }

    public static abstract class GreaterNode extends MJBinaryNode {
        @Specialization
        public boolean equal(int lhs, int rhs) {
            return lhs > rhs;
        }

        @Specialization
        public boolean equal(float lhs, float rhs) {
            return lhs > rhs;
        }

        @Specialization
        public boolean equal(float lhs, int rhs) {
            return lhs > rhs;
        }

        @Specialization
        public boolean equal(int lhs, float rhs) {
            return lhs > rhs;
        }

        @Specialization
        public boolean equal(char lhs, char rhs) {
            return lhs > rhs;
        }

        @Specialization
        public boolean equal(char lhs, int rhs) {
            return lhs > rhs;
        }

        @Specialization
        public boolean equal(int lhs, char rhs) {
            return lhs > rhs;
        }

    }

    public static abstract class GreaterEqualNode extends MJBinaryNode {
        @Specialization
        public boolean equal(int lhs, int rhs) {
            return lhs >= rhs;
        }

        @Specialization
        public boolean equal(float lhs, float rhs) {
            return lhs >= rhs;
        }

        @Specialization
        public boolean equal(float lhs, int rhs) {
            return lhs >= rhs;
        }

        @Specialization
        public boolean equal(int lhs, float rhs) {
            return lhs >= rhs;
        }

        @Specialization
        public boolean equal(char lhs, char rhs) {
            return lhs >= rhs;
        }

        @Specialization
        public boolean equal(char lhs, int rhs) {
            return lhs >= rhs;
        }

        @Specialization
        public boolean equal(int lhs, char rhs) {
            return lhs >= rhs;
        }

    }

    public static abstract class OrNode extends MJBinaryNode {
        @Specialization
        public boolean equal(boolean lhs, boolean rhs) {
            return lhs || rhs;
        }

    }

    public static abstract class AndNode extends MJBinaryNode {
        @Specialization
        public boolean equal(boolean lhs, boolean rhs) {
            return lhs && rhs;
        }
    }
}
