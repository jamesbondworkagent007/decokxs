package o;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.kNL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class kNL extends android.widget.FrameLayout {
    public ViewPager2 KWHzl;
    public ViewPager2.OnPageChangeCallback OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kNL(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kNL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.kNL.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ kNL(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kNL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if (childAt instanceof ViewPager2) {
                this.KWHzl = (ViewPager2) childAt;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setupPageChangeListener();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewPager2 viewPager2;
        super.onDetachedFromWindow();
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.OLrzqt;
        if (onPageChangeCallback != null && (viewPager2 = this.KWHzl) != null) {
            viewPager2.unregisterOnPageChangeCallback(onPageChangeCallback);
        }
        this.OLrzqt = null;
    }

    public static final class Application extends ViewPager2.OnPageChangeCallback {
        public Application() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            final kNL knl = kNL.this;
            knl.post(new java.lang.Runnable() { // from class: o.kNS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    kNL.Application.KWHzl(knl);
                }
            });
        }

        public static final void KWHzl(kNL knl) {
            knl.requestLayout();
        }
    }

    public final void setupPageChangeListener() {
        ViewPager2 viewPager2 = this.KWHzl;
        if (viewPager2 == null) {
            return;
        }
        Application application = new Application();
        viewPager2.registerOnPageChangeCallback(application);
        this.OLrzqt = application;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        ViewPager2 viewPager2 = this.KWHzl;
        if (viewPager2 == null) {
            super.onMeasure(i, i2);
            return;
        }
        viewPager2.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = viewPager2.getMeasuredHeight();
        android.view.View childAt = viewPager2.getChildAt(0);
        android.view.ViewGroup viewGroup = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
        if (viewGroup != null && viewGroup.getChildCount() != 0) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                android.view.View childAt2 = viewGroup.getChildAt(i3);
                if (childAt2.getVisibility() != 8) {
                    childAt2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    if (measuredHeight2 > measuredHeight) {
                        measuredHeight = measuredHeight2;
                    }
                }
            }
        }
        if (measuredHeight > 0) {
            viewPager2.measure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), viewPager2.getMeasuredHeight());
    }
}
