package o;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qTh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C40369qTh extends C40503qYg {
    public boolean AYXKKw;
    public int djBIcL;
    public Function0<Unit> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C40369qTh(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C40369qTh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C40503qYg
    public void setEmptyNestedScrollingEnabled(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnTouch(Function0<Unit> function0) {
        this.gEmmrt = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C40503qYg
    public boolean valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:19) call: o.qTh.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C40369qTh(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40369qTh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void setEmptyViewAdditionTopMargin$OKMarket_market_impl(int i) {
        this.djBIcL = i;
        C55173xeu c55173xeuGEmmrt = gEmmrt();
        if (c55173xeuGEmmrt != null) {
            ViewGroup.LayoutParams layoutParams = c55173xeuGEmmrt.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = C55298xhM.KWHzl(90.0f, context) + i;
                c55173xeuGEmmrt.setLayoutParams(layoutParams2);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        Function0<Unit> function0 = this.gEmmrt;
        if (function0 != null) {
            function0.invoke();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // o.C40503qYg
    public void EZpvd(@NotNull C55113xdn c55113xdn) {
        Intrinsics.checkNotNullParameter(c55113xdn, "");
        c55113xdn.setAnimation(C41431qqg.OLrzqt(this) ? "loading_market_double_night.lottie" : "loading_market_double.lottie");
    }

    @Override // o.C40503qYg
    public ConstraintLayout.LayoutParams EZpvd() {
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        layoutParams.leftToLeft = 0;
        layoutParams.topToTop = 0;
        layoutParams.rightToRight = 0;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C55298xhM.KWHzl(90.0f, context) + this.djBIcL;
        return layoutParams;
    }

    @Override // o.C40503qYg
    public ConstraintLayout.LayoutParams OLrzqt() {
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams.leftToLeft = 0;
        layoutParams.topToTop = 0;
        layoutParams.rightToRight = 0;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = AhwBna();
        return layoutParams;
    }

    @Override // o.C40503qYg, o.qXK
    public void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        super.AEQbTJ(C33070mpX.AYXKKw(qZH.PendingIntent.DuR), str2, str3, 7, function0);
    }
}
