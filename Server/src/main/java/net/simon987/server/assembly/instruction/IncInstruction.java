package net.simon987.server.assembly.instruction;

import net.simon987.server.assembly.Instruction;
import net.simon987.server.assembly.Status;
import net.simon987.server.assembly.Target;
import net.simon987.server.assembly.Util;

public class IncInstruction extends AddInstruction {

    @Override
    public static final int OPCODE = 41;

    public AddInstruction() {
        super("inc", OPCODE);
    }

    @Override
    public Status execute(Target dst, int dstIndex, Status status) {

        int a = (char) dst.get(dstIndex);
        int b = 1;

        return add(a, b, status, dst, dstIndex);
    }
}
