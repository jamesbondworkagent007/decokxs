package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Writer implements AssertionError {
    public final HB EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Writer() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public Writer(@NotNull HB hb) {
        Intrinsics.checkNotNullParameter(hb, "");
        this.EZpvd = hb;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:o.HB:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.HB:0x0006: INVOKE (wrap:o.HL$TaskDescription:0x0004: SGET  A[WRAPPED] (LINE:17) o.HL.OLrzqt o.HL$TaskDescription) VIRTUAL call: o.HL.TaskDescription.copydefault():o.HL A[MD:():o.HL (m), WRAPPED] (LINE:17)) : (r1v0 o.HB))
 A[MD:(o.HB):void (m)] (LINE:16) call: o.Writer.<init>(o.HB):void type: THIS */
    public /* synthetic */ Writer(HB hb, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? HL.OLrzqt.copydefault() : hb);
    }

    @Override // o.AssertionError
    public java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.String> continuation) {
        return this.EZpvd.EZpvd(IOException.zsXlph.ejfBZ().OLrzqt());
    }
}
