package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Menu implements TouchDelegate {
    public final java.util.Map<java.lang.String, java.util.List<InterfaceC52616wS>> KWHzl;
    public final OnApplyWindowInsetsListener OLrzqt;
    public final java.util.List<InterfaceC52616wS> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Menu() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public Menu(OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.OLrzqt = onApplyWindowInsetsListener;
        this.KWHzl = C56423yEv.EZpvd(C56390yDp.OLrzqt("CreateToken", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(C52643wT.OLrzqt.copydefault(), null, 2, null))));
        this.copydefault = C56402yEa.EZpvd(C3020Ae.sigV4$default(false, null, null, null, null, 31, null));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.OnApplyWindowInsetsListener:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.OnApplyWindowInsetsListener) : (r1v0 o.OnApplyWindowInsetsListener))
 A[MD:(o.OnApplyWindowInsetsListener):void (m)] (LINE:10) call: o.Menu.<init>(o.OnApplyWindowInsetsListener):void type: THIS */
    public /* synthetic */ Menu(OnApplyWindowInsetsListener onApplyWindowInsetsListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : onApplyWindowInsetsListener);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, kotlin.coroutines.Continuation] */
    @Override // o.InterfaceC52724wW
    public /* bridge */ /* synthetic */ java.lang.Object OLrzqt(MenuItem menuItem, Continuation continuation) {
        return OLrzqt2(menuItem, (Continuation<? super java.util.List<? extends InterfaceC52616wS>>) continuation);
    }

    /* JADX INFO: renamed from: OLrzqt, reason: avoid collision after fix types in other method */
    public java.lang.Object OLrzqt2(@NotNull MenuItem menuItem, @NotNull Continuation<? super java.util.List<? extends InterfaceC52616wS>> continuation) {
        java.util.List<InterfaceC52616wS> list = this.KWHzl.get(menuItem.EZpvd());
        if (list == null) {
            list = this.copydefault;
        }
        return list;
    }
}
