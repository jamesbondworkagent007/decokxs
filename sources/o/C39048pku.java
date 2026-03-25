package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pku, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39048pku implements InterfaceC39045pkr {
    public final InterfaceC56387yDm AEQbTJ;
    public final int EZpvd;
    public final android.content.Context KWHzl;
    public android.view.ViewGroup copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.view.ViewGroup EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39045pkr
    public void OLrzqt(android.view.ViewGroup viewGroup) {
        this.copydefault = viewGroup;
    }

    public C39048pku(@NotNull android.content.Context context, @androidx.annotation.LayoutRes int i, android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = context;
        this.EZpvd = i;
        this.copydefault = viewGroup;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.pkv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C39048pku.EZpvd(this.KWHzl);
            }
        });
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (r2v0 int)
  (wrap:android.view.ViewGroup:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null android.view.ViewGroup) : (r3v0 android.view.ViewGroup))
 A[MD:(android.content.Context, int, android.view.ViewGroup):void (m)] (LINE:25) call: o.pku.<init>(android.content.Context, int, android.view.ViewGroup):void type: THIS */
    public /* synthetic */ C39048pku(android.content.Context context, int i, android.view.ViewGroup viewGroup, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, (i2 & 4) != 0 ? null : viewGroup);
    }

    public static final android.view.View EZpvd(C39048pku c39048pku) {
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(c39048pku.KWHzl);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "");
        return C39044pkq.KWHzl(layoutInflaterFrom, c39048pku.EZpvd, c39048pku.EZpvd());
    }

    @Override // o.InterfaceC39045pkr
    public android.view.View AEQbTJ() {
        return (android.view.View) this.AEQbTJ.getValue();
    }
}
