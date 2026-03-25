package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class StringReader implements BI {
    public final HB copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StringReader() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public StringReader(@NotNull HB hb) {
        Intrinsics.checkNotNullParameter(hb, "");
        this.copydefault = hb;
    }

    @Override // o.BI
    public void copydefault(@NotNull BY<?, ?> by) {
        BI.Activity.KWHzl(this, by);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:o.HB:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.HB:0x0006: INVOKE (wrap:o.HL$TaskDescription:0x0004: SGET  A[WRAPPED] (LINE:24) o.HL.OLrzqt o.HL$TaskDescription) VIRTUAL call: o.HL.TaskDescription.copydefault():o.HL A[MD:():o.HL (m), WRAPPED] (LINE:24)) : (r1v0 o.HB))
 A[MD:(o.HB):void (m)] (LINE:23) call: o.StringReader.<init>(o.HB):void type: THIS */
    public /* synthetic */ StringReader(HB hb, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? HL.OLrzqt.copydefault() : hb);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC5076Du
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull BP<C5036Cg> bp, @NotNull Continuation<? super BP<C5036Cg>> continuation) {
        if (bp.EZpvd().AEQbTJ().AEQbTJ("X-Amzn-Trace-Id")) {
            return bp;
        }
        java.lang.String strEZpvd = this.copydefault.EZpvd("_X_AMZN_TRACE_ID");
        if (this.copydefault.EZpvd("AWS_LAMBDA_FUNCTION_NAME") != null && strEZpvd != null) {
            bp.EZpvd().AEQbTJ().EZpvd("X-Amzn-Trace-Id", StringWriter.OLrzqt.EZpvd(strEZpvd));
        }
        return bp;
    }
}
