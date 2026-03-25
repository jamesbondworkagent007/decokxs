package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qJw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40114qJw extends C40512qYp {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (r1v0 o.qqI)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:boolean:NOT 
  (wrap:boolean:0x0008: INVOKE 
  (wrap:o.xNn:0x0004: INVOKE  STATIC call: o.pWO.KWHzl():o.xNn A[DONT_GENERATE, MD:():o.xNn (m), REMOVE, WRAPPED] (LINE:27))
 INTERFACE call: o.xNn.EZpvd():boolean A[DONT_GENERATE, MD:():boolean (m), REMOVE, WRAPPED] (LINE:27))
 A[WRAPPED]) : (r2v0 boolean))
 A[MD:(o.qqI, boolean):void (m)] (LINE:25) call: o.qJw.<init>(o.qqI, boolean):void type: THIS */
    public /* synthetic */ C40114qJw(C41407qqI c41407qqI, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c41407qqI, (i & 2) != 0 ? !pWO.KWHzl().EZpvd() : z);
    }

    public C40114qJw(@NotNull C41407qqI c41407qqI, boolean z) {
        Intrinsics.checkNotNullParameter(c41407qqI, "");
        register(C40113qJv.class, new C40112qJu(c41407qqI, z));
    }
}
