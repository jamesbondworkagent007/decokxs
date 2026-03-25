package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AutoCloseable implements AssertionError {
    public final HI KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AutoCloseable() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public AutoCloseable(@NotNull HI hi) {
        Intrinsics.checkNotNullParameter(hi, "");
        this.KWHzl = hi;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:o.HI:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.HI:0x0006: INVOKE (wrap:o.HL$TaskDescription:0x0004: SGET  A[WRAPPED] (LINE:16) o.HL.OLrzqt o.HL$TaskDescription) VIRTUAL call: o.HL.TaskDescription.copydefault():o.HL A[MD:():o.HL (m), WRAPPED] (LINE:16)) : (r1v0 o.HI))
 A[MD:(o.HI):void (m)] (LINE:15) call: o.AutoCloseable.<init>(o.HI):void type: THIS */
    public /* synthetic */ AutoCloseable(HI hi, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? HL.OLrzqt.copydefault() : hi);
    }

    @Override // o.AssertionError
    public java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.String> continuation) {
        return this.KWHzl.OLrzqt(IOException.zsXlph.ejfBZ().EZpvd());
    }
}
