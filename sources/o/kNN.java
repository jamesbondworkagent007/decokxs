package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kNN extends android.widget.FrameLayout {
    public boolean AEQbTJ;
    public boolean EZpvd;
    public ViewPager2 KWHzl;
    public ViewPager2 OLrzqt;
    public float copydefault;
    public float gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kNN(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kNN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:12) call: o.kNN.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ kNN(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kNN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AEQbTJ();
    }

    public final void AEQbTJ() {
        android.view.ViewGroup viewGroup = this;
        while (true) {
            if (!(viewGroup.getParent() instanceof android.view.ViewGroup)) {
                break;
            }
            android.view.ViewParent parent = viewGroup.getParent();
            Intrinsics.copydefault(parent, "");
            viewGroup = (android.view.ViewGroup) parent;
            if (viewGroup instanceof ViewPager2) {
                this.KWHzl = (ViewPager2) viewGroup;
                break;
            }
        }
        this.OLrzqt = KWHzl((android.view.ViewGroup) this);
    }

    public final ViewPager2 KWHzl(android.view.ViewGroup viewGroup) {
        ViewPager2 viewPager2KWHzl;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewPager2) {
                return (ViewPager2) childAt;
            }
            if ((childAt instanceof android.view.ViewGroup) && (viewPager2KWHzl = KWHzl((android.view.ViewGroup) childAt)) != null) {
                return viewPager2KWHzl;
            }
        }
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        ViewPager2 viewPager2 = this.OLrzqt;
        if (viewPager2 != null) {
            measureChild(viewPager2, i, View.MeasureSpec.makeMeasureSpec(0, 0));
            setMeasuredDimension(android.view.View.getDefaultSize(getSuggestedMinimumWidth(), i), viewPager2.getMeasuredHeight());
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        KWHzl(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void KWHzl(android.view.MotionEvent motionEvent) {
        ViewPager2 viewPager2;
        if (this.KWHzl == null || this.OLrzqt == null) {
            return;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.copydefault = motionEvent.getX();
            this.gEmmrt = motionEvent.getY();
            this.EZpvd = false;
            ViewPager2 viewPager22 = this.KWHzl;
            if (viewPager22 != null) {
                viewPager22.setUserInputEnabled(false);
                return;
            }
            return;
        }
        if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX() - this.copydefault;
                float y = motionEvent.getY();
                float f = this.gEmmrt;
                if (this.EZpvd || java.lang.Math.abs(x) <= java.lang.Math.abs(y - f)) {
                    return;
                }
                this.EZpvd = true;
                ViewPager2 viewPager23 = this.OLrzqt;
                if (viewPager23 == null) {
                    return;
                }
                if (x > 0.0f && viewPager23.getCurrentItem() == 0) {
                    ViewPager2 viewPager24 = this.KWHzl;
                    if (viewPager24 != null) {
                        viewPager24.setUserInputEnabled(true);
                        return;
                    }
                    return;
                }
                if (x < 0.0f) {
                    int currentItem = viewPager23.getCurrentItem();
                    RecyclerView.Adapter adapter = viewPager23.getAdapter();
                    if (currentItem != (adapter != null ? adapter.getItemCount() : 0) - 1 || (viewPager2 = this.KWHzl) == null) {
                        return;
                    }
                    viewPager2.setUserInputEnabled(true);
                    return;
                }
                return;
            }
            if (action != 3) {
                return;
            }
        }
        this.EZpvd = false;
        ViewPager2 viewPager25 = this.KWHzl;
        if (viewPager25 != null) {
            viewPager25.setUserInputEnabled(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (this.AEQbTJ) {
            return;
        }
        this.AEQbTJ = true;
        post(new java.lang.Runnable() { // from class: o.kNP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                kNN.KWHzl(this.EZpvd);
            }
        });
    }

    public static final void KWHzl(kNN knn) {
        knn.AEQbTJ = false;
        knn.requestLayout();
    }
}
