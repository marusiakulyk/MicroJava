package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.VirtualFrame;

public class MJFrameWrapper {
    private FrameSlot frame;
    private String type;

    public MJFrameWrapper(String type, FrameSlot frame) {
        this.frame = frame;
        this.type = type;

    }

    public String getType() {
        return this.type;
    }

    public FrameSlot getFrame() {
        return this.frame;
    }

}
