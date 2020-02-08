package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public class MJFrameWrapper {
    private VirtualFrame frame;

    public MJFrameWrapper(VirtualFrame frame) {
        this.frame = frame;

    }

}
