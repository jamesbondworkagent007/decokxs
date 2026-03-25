package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ush, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49658ush extends android.widget.FrameLayout {
    public final C49654usd KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C49658ush(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C49658ush(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: o.ush.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C49658ush(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49658ush(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.view.LayoutInflater.from(context).inflate(C49511upt.StateListAnimator.fARcdN, (android.view.ViewGroup) this, true);
        this.KWHzl = (C49654usd) findViewById(C49511upt.Application.OJuSTm);
    }

    public static /* synthetic */ void loadImageWithSize$default(C49658ush c49658ush, java.lang.String str, java.lang.String str2, float f, java.lang.Float f2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            f2 = null;
        }
        c49658ush.copydefault(str, str2, f, f2);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, float f, java.lang.Float f2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl.setTokenSize(getContext().getResources().getDisplayMetrics().density * f);
        this.KWHzl.setChainTokenSize((f2 != null ? f2.floatValue() : C33129mqd.djBIcL(java.lang.Float.valueOf(f / 2))) * getContext().getResources().getDisplayMetrics().density);
        int iAhwBna = C33129mqd.AhwBna(C33129mqd.mulS$default(C33129mqd.divS$default(str, 32, null, null, null, 14, null), 4, null, null, null, 14, null));
        C49654usd c49654usd = this.KWHzl;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c49654usd.setChainOffset(C55298xhM.OLrzqt(iAhwBna, context));
        this.KWHzl.setTokens(str);
        this.KWHzl.setChain(str2);
    }

    public static /* synthetic */ void loadImageWithSameSize$default(C49658ush c49658ush, java.lang.String str, java.lang.String str2, float f, java.lang.Float f2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            f2 = null;
        }
        c49658ush.AEQbTJ(str, str2, f, f2);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, float f, java.lang.Float f2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl.setTokenSize(getContext().getResources().getDisplayMetrics().density * f);
        this.KWHzl.setChainTokenSize((f2 != null ? f2.floatValue() : C33129mqd.djBIcL(java.lang.Float.valueOf(f / 2))) * getContext().getResources().getDisplayMetrics().density);
        this.KWHzl.setTokens(str, str2);
    }
}
