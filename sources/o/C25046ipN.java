package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ipN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25046ipN extends android.widget.FrameLayout {
    public C21504hBv KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25046ipN(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:15) call: o.ipN.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C25046ipN(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25046ipN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C21504hBv c21504hBvAEQbTJ = C21504hBv.AEQbTJ(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c21504hBvAEQbTJ, "");
        this.KWHzl = c21504hBvAEQbTJ;
    }

    public final android.widget.FrameLayout AEQbTJ() {
        android.widget.FrameLayout frameLayout = this.KWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        return frameLayout;
    }

    public final C25248itD OLrzqt() {
        C25248itD c25248itD = this.KWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c25248itD, "");
        return c25248itD;
    }
}
