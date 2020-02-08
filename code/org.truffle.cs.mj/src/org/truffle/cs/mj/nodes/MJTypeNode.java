package org.truffle.cs.mj.nodes;

import java.math.BigInteger;

import com.oracle.truffle.api.dsl.ImplicitCast;
import com.oracle.truffle.api.dsl.TypeSystem;

@TypeSystem({long.class, boolean.class, int.class})

public abstract class MJTypeNode {

// @ImplicitCast
// public static BigInteger castInteger(long value) {
// return BigInteger.valueOf(value);
// }

}
