package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qMZ extends C40512qYp {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (r1v0 o.qso)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:boolean:NOT 
  (wrap:boolean:0x0008: INVOKE 
  (wrap:o.xNn:0x0004: INVOKE  STATIC call: o.pWO.KWHzl():o.xNn A[DONT_GENERATE, MD:():o.xNn (m), REMOVE, WRAPPED] (LINE:29))
 INTERFACE call: o.xNn.EZpvd():boolean A[DONT_GENERATE, MD:():boolean (m), REMOVE, WRAPPED] (LINE:29))
 A[WRAPPED]) : (r2v0 boolean))
 A[MD:(o.qso, boolean):void (m)] (LINE:27) call: o.qMZ.<init>(o.qso, boolean):void type: THIS */
    public /* synthetic */ qMZ(C41545qso c41545qso, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c41545qso, (i & 2) != 0 ? !pWO.KWHzl().EZpvd() : z);
    }

    public qMZ(@NotNull C41545qso c41545qso, boolean z) {
        Intrinsics.checkNotNullParameter(c41545qso, "");
        register(InterfaceC41642quf.class, new qMT(c41545qso, z));
    }
}
