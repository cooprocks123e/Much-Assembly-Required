package net.simon987.server.assembly.instruction;

import net.simon987.server.assembly.Instruction;
import net.simon987.server.assembly.Status;
import net.simon987.server.assembly.Target;
import net.simon987.server.assembly.Util;

public class DecInstruction extends SubInstruction {

    @Override
    public static final int OPCODE = 42;

    public AddInstruction() {
        super("dec", OPCODE);
    }

    @Override
    public Status execute(Target dst, int dstIndex, Status status) {

        int a = (char) dst.get(dstIndex);
        int b = 1;

        return sub(a, b, status, dst, dstIndex);
    }
}
