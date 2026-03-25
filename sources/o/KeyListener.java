package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class KeyListener implements TransformationMethod {
    public final java.util.Map<java.lang.String, java.util.List<InterfaceC52616wS>> AEQbTJ;
    public final java.util.List<InterfaceC52616wS> EZpvd;
    public final URLSpan KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public KeyListener() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public KeyListener(URLSpan uRLSpan) {
        this.KWHzl = uRLSpan;
        this.AEQbTJ = C56423yEv.EZpvd(C56390yDp.OLrzqt("GetRoleCredentials", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(C52643wT.OLrzqt.copydefault(), null, 2, null))));
        this.EZpvd = C56402yEa.EZpvd(C3020Ae.sigV4$default(false, null, null, null, null, 31, null));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.URLSpan:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.URLSpan) : (r1v0 o.URLSpan))
 A[MD:(o.URLSpan):void (m)] (LINE:10) call: o.KeyListener.<init>(o.URLSpan):void type: THIS */
    public /* synthetic */ KeyListener(URLSpan uRLSpan, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uRLSpan);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC52724wW
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object OLrzqt(@NotNull CharacterStyle characterStyle, @NotNull Continuation<? super java.util.List<? extends InterfaceC52616wS>> continuation) {
        java.util.List<InterfaceC52616wS> list = this.AEQbTJ.get(characterStyle.EZpvd());
        if (list == null) {
            list = this.EZpvd;
        }
        return list;
    }
}
