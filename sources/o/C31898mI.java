package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C31898mI implements InterfaceC32006mM {
    public final InterfaceC32141mR AEQbTJ;
    public final java.util.Map<java.lang.String, java.util.List<InterfaceC52616wS>> EZpvd;
    public final java.util.List<InterfaceC52616wS> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C31898mI() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C31898mI(InterfaceC32141mR interfaceC32141mR) {
        this.AEQbTJ = interfaceC32141mR;
        this.EZpvd = C56424yEw.KWHzl();
        this.copydefault = C56402yEa.EZpvd(C3020Ae.sigV4$default(false, null, null, null, null, 31, null));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.mR:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.mR) : (r1v0 o.mR))
 A[MD:(o.mR):void (m)] (LINE:9) call: o.mI.<init>(o.mR):void type: THIS */
    public /* synthetic */ C31898mI(InterfaceC32141mR interfaceC32141mR, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : interfaceC32141mR);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, kotlin.coroutines.Continuation] */
    @Override // o.InterfaceC52724wW
    public /* bridge */ /* synthetic */ java.lang.Object OLrzqt(C31817mF c31817mF, Continuation continuation) {
        return OLrzqt2(c31817mF, (Continuation<? super java.util.List<? extends InterfaceC52616wS>>) continuation);
    }

    /* JADX INFO: renamed from: OLrzqt, reason: avoid collision after fix types in other method */
    public java.lang.Object OLrzqt2(@NotNull C31817mF c31817mF, @NotNull Continuation<? super java.util.List<? extends InterfaceC52616wS>> continuation) {
        java.util.List<InterfaceC52616wS> list = this.EZpvd.get(c31817mF.OLrzqt());
        if (list == null) {
            list = this.copydefault;
        }
        return list;
    }
}
