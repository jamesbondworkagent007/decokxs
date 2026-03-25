package o;

import com.google.android.flexbox.FlexboxLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gWh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19976gWh extends android.widget.FrameLayout {
    public final InterfaceC56387yDm AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19976gWh(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19976gWh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:36) call: o.gWh.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C19976gWh(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19976gWh(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.gWl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19976gWh.AEQbTJ(context, this);
            }
        });
    }

    private final C21659hHo OLrzqt() {
        return (C21659hHo) this.AEQbTJ.getValue();
    }

    public static final C21659hHo AEQbTJ(android.content.Context context, C19976gWh c19976gWh) {
        return C21659hHo.EZpvd(android.view.LayoutInflater.from(context), c19976gWh, true);
    }

    public final void setData(@NotNull java.util.List<C19981gWm> list, InterfaceC19969gWa interfaceC19969gWa) {
        Intrinsics.checkNotNullParameter(list, "");
        OLrzqt().copydefault.removeAllViews();
        for (C19981gWm c19981gWm : list) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C19975gWg c19975gWg = new C19975gWg(context, null, 0, 6, null);
            c19975gWg.setData(c19981gWm, interfaceC19969gWa);
            FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(-2, -2);
            layoutParams.setFlexBasisPercent(0.5f);
            OLrzqt().copydefault.addView(c19975gWg, layoutParams);
        }
    }
}
