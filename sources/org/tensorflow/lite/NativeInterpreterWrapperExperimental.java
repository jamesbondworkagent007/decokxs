package org.tensorflow.lite;

import java.nio.ByteBuffer;
import org.tensorflow.lite.InterpreterImpl;

/* JADX INFO: loaded from: classes13.dex */
public final class NativeInterpreterWrapperExperimental extends NativeInterpreterWrapper {
    public static native void resetVariableTensors(long j, long j2);

    public NativeInterpreterWrapperExperimental(String str, InterpreterImpl.Options options) {
        super(str, options);
    }

    public NativeInterpreterWrapperExperimental(ByteBuffer byteBuffer, InterpreterImpl.Options options) {
        super(byteBuffer, options);
    }

    public void resetVariableTensors() {
        resetVariableTensors(this.interpreterHandle, this.errorHandle);
    }
}
