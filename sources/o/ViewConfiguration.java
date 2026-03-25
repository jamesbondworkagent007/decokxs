package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewConfiguration implements ViewGroupOverlay {
    public final java.util.Map<java.lang.String, java.util.List<InterfaceC52616wS>> EZpvd;
    public final WindowCallbacks KWHzl;
    public final java.util.List<InterfaceC52616wS> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ViewConfiguration() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ViewConfiguration(WindowCallbacks windowCallbacks) {
        this.KWHzl = windowCallbacks;
        this.EZpvd = C56424yEw.KWHzl();
        this.copydefault = C56402yEa.EZpvd(C3020Ae.sigV4$default(false, null, null, null, null, 31, null));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.WindowCallbacks:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.WindowCallbacks) : (r1v0 o.WindowCallbacks))
 A[MD:(o.WindowCallbacks):void (m)] (LINE:9) call: o.ViewConfiguration.<init>(o.WindowCallbacks):void type: THIS */
    public /* synthetic */ ViewConfiguration(WindowCallbacks windowCallbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : windowCallbacks);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, kotlin.coroutines.Continuation] */
    @Override // o.InterfaceC52724wW
    public /* bridge */ /* synthetic */ java.lang.Object OLrzqt(ViewDebug viewDebug, Continuation continuation) {
        return OLrzqt2(viewDebug, (Continuation<? super java.util.List<? extends InterfaceC52616wS>>) continuation);
    }

    /* JADX INFO: renamed from: OLrzqt, reason: avoid collision after fix types in other method */
    public java.lang.Object OLrzqt2(@NotNull ViewDebug viewDebug, @NotNull Continuation<? super java.util.List<? extends InterfaceC52616wS>> continuation) {
        java.util.List<InterfaceC52616wS> list = this.EZpvd.get(viewDebug.EZpvd());
        if (list == null) {
            list = this.copydefault;
        }
        return list;
    }
}
