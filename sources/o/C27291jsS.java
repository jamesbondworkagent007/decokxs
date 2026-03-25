package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.iZU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jsS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27291jsS extends android.widget.FrameLayout {
    public final InterfaceC56387yDm OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27291jsS(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27291jsS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:13) call: o.jsS.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27291jsS(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27291jsS(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.jsR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27291jsS.copydefault(context, this);
            }
        });
        OLrzqt().OLrzqt.setAnimation(C33492mxV.OLrzqt() ? "invest_protocol_details_loading_dark.lottie" : "invest_protocol_details_loading.lottie");
    }

    private final C23840iLg OLrzqt() {
        return (C23840iLg) this.OLrzqt.getValue();
    }

    public static final C23840iLg copydefault(android.content.Context context, C27291jsS c27291jsS) {
        return C23840iLg.KWHzl(android.view.LayoutInflater.from(context), c27291jsS, true);
    }

    public final void setData(@NotNull iZU izu) {
        Intrinsics.checkNotNullParameter(izu, "");
        C23840iLg c23840iLgOLrzqt = OLrzqt();
        C55173xeu c55173xeu = c23840iLgOLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(izu instanceof iZU.TaskDescription ? 0 : 8);
        C55113xdn c55113xdn = c23840iLgOLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        boolean z = izu instanceof iZU.Application;
        c55113xdn.setVisibility(z ? 0 : 8);
        if (z) {
            C55113xdn.showLoading$default(c23840iLgOLrzqt.OLrzqt, 0L, 1, null);
        } else {
            c23840iLgOLrzqt.OLrzqt.copydefault();
        }
    }
}
