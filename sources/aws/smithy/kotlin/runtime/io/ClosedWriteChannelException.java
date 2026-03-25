package aws.smithy.kotlin.runtime.io;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class ClosedWriteChannelException extends IOException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ClosedWriteChannelException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ClosedWriteChannelException(String str) {
        super(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:22) call: aws.smithy.kotlin.runtime.io.ClosedWriteChannelException.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ ClosedWriteChannelException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
