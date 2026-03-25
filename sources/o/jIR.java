package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class jIR extends qXZ {
    public final ViewTreeObserver.OnGlobalLayoutListener EZpvd;
    public float KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jIR(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jIR(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:19) call: o.jIR.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ jIR(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jIR(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = 0.66964287f;
        this.EZpvd = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.jIP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                jIR.KWHzl(this.AEQbTJ);
            }
        };
    }

    public final void setRatio(float f) {
        this.KWHzl = f;
        requestLayout();
    }

    public static final void KWHzl(jIR jir) {
        android.view.ViewParent parent = jir.getParent();
        while (parent != null && !(parent instanceof ViewPager) && !(parent instanceof ViewPager2)) {
            parent = parent.getParent();
        }
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup == null || jir.getHeight() <= viewGroup.getHeight()) {
            return;
        }
        pUU.OLrzqt("parent change(this: " + jir.getHeight() + " parent: " + viewGroup.getHeight() + "), update now!");
        ViewGroup.LayoutParams layoutParams = jir.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = ((int) (viewGroup.getHeight() * jir.KWHzl)) - 1;
            jir.setLayoutParams(layoutParams2);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this.EZpvd);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.EZpvd);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        android.view.View viewFindViewById = findViewById(qZH.StateListAnimator.dvImUD);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 8388611;
                viewFindViewById.setLayoutParams(layoutParams2);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) / this.KWHzl), 1073741824));
        android.view.View viewFindViewById = findViewById(qZH.StateListAnimator.dvImUD);
        if (viewFindViewById != null) {
            float paddingLeft = ((r6 - getPaddingLeft()) - getPaddingRight()) / viewFindViewById.getMeasuredWidth();
            viewFindViewById.setScaleX(paddingLeft);
            viewFindViewById.setScaleY(paddingLeft);
            float f = paddingLeft - 1;
            float f2 = 2;
            viewFindViewById.setTranslationX(((viewFindViewById.getMeasuredWidth() * f) / f2) * (C55296xhK.AEQbTJ(this) ? -1 : 1));
            viewFindViewById.setTranslationY((viewFindViewById.getMeasuredHeight() * f) / f2);
        }
    }
}
