package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C52643wT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class UnicodeBlock implements CharSequence {
    public final UnicodeScript AEQbTJ;
    public final java.util.Map<java.lang.String, java.util.List<InterfaceC52616wS>> EZpvd;
    public final java.util.List<InterfaceC52616wS> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UnicodeBlock() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public UnicodeBlock(UnicodeScript unicodeScript) {
        this.AEQbTJ = unicodeScript;
        C52643wT.StateListAnimator stateListAnimator = C52643wT.OLrzqt;
        this.EZpvd = C56424yEw.gEmmrt(C56390yDp.OLrzqt("GetCredentialsForIdentity", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))), C56390yDp.OLrzqt("GetId", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))), C56390yDp.OLrzqt("GetOpenIdToken", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))), C56390yDp.OLrzqt("UnlinkIdentity", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))));
        this.KWHzl = C56402yEa.EZpvd(C3020Ae.sigV4$default(false, null, null, null, null, 31, null));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.UnicodeScript:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.UnicodeScript) : (r1v0 o.UnicodeScript))
 A[MD:(o.UnicodeScript):void (m)] (LINE:10) call: o.UnicodeBlock.<init>(o.UnicodeScript):void type: THIS */
    public /* synthetic */ UnicodeBlock(UnicodeScript unicodeScript, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : unicodeScript);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC52724wW
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object OLrzqt(@NotNull Subset subset, @NotNull Continuation<? super java.util.List<? extends InterfaceC52616wS>> continuation) {
        java.util.List<InterfaceC52616wS> list = this.EZpvd.get(subset.AEQbTJ());
        if (list == null) {
            list = this.KWHzl;
        }
        return list;
    }
}
