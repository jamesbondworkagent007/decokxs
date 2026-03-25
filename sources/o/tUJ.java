package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class tUJ extends android.widget.FrameLayout {
    public int EZpvd;
    public float KWHzl;
    public float OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tUJ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tUJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.tUJ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ tUJ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tUJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX DEBUG: Duplicate block (B:5:0x000c) to fix multi-entry loop: BACK_EDGE: B:5:0x000c -> B:6:0x000d */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x000d, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ViewPager2 KWHzl() {
        android.view.View view;
        java.lang.Object parent = getParent();
        if (parent instanceof android.view.View) {
            view = (android.view.View) parent;
            while (view != null && !(view instanceof ViewPager2)) {
                java.lang.Object parent2 = view.getParent();
                if (parent2 instanceof android.view.View) {
                    view = (android.view.View) parent2;
                }
            }
            if (view instanceof ViewPager2) {
                return (ViewPager2) view;
            }
            return null;
        }
        view = null;
    }

    public final boolean copydefault(android.view.View view, int i, float f) {
        int i2 = -((int) java.lang.Math.signum(f));
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalArgumentException();
            }
            if (view != null) {
                return view.canScrollVertically(i2);
            }
        } else if (view != null) {
            return view.canScrollHorizontally(i2);
        }
        return false;
    }

    /* JADX DEBUG: Duplicate block (B:5:0x0008) to fix multi-entry loop: BACK_EDGE: B:5:0x0008 -> B:6:0x0009 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: android.view.ViewParent */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0009, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.view.View copydefault(android.view.ViewParent viewParent) {
        android.view.View view;
        if (viewParent instanceof android.view.View) {
            view = (android.view.View) viewParent;
            while (view != null && !Intrinsics.EZpvd(view.getTag(), (java.lang.Object) "market_nest")) {
                java.lang.Object parent = view.getParent();
                if (parent instanceof android.view.View) {
                    view = (android.view.View) parent;
                }
            }
            if (view == null) {
                return null;
            }
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            if (!(view instanceof android.view.ViewGroup)) {
                return null;
            }
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof RecyclerView) {
                    return (RecyclerView) childAt;
                }
            }
            return null;
        }
        view = null;
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0006 */
    public final android.view.View copydefault(android.view.ViewGroup viewGroup, float f, float f2) {
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return null;
            }
            android.view.View childAt = viewGroup.getChildAt(childCount);
            if (f >= childAt.getLeft() && f < childAt.getRight() && f2 >= childAt.getTop() && f2 < childAt.getBottom()) {
                if (childAt instanceof android.view.ViewGroup) {
                    android.view.View viewCopydefault = copydefault((android.view.ViewGroup) childAt, f - r4.getLeft(), f2 - r4.getTop());
                    if (viewCopydefault != null) {
                        return viewCopydefault;
                    }
                }
                return childAt;
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        copydefault(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void copydefault(android.view.MotionEvent motionEvent) {
        android.view.ViewParent parent;
        ViewPager2 viewPager2KWHzl = KWHzl();
        if (viewPager2KWHzl != null) {
            int orientation = viewPager2KWHzl.getOrientation();
            android.view.View viewCopydefault = copydefault(this, motionEvent.getX(), motionEvent.getY());
            android.view.View viewCopydefault2 = (viewCopydefault == null || (parent = viewCopydefault.getParent()) == null) ? null : copydefault(parent);
            if (copydefault(viewCopydefault2, orientation, -1.0f) || copydefault(viewCopydefault2, orientation, 1.0f)) {
                if (motionEvent.getAction() == 0) {
                    this.OLrzqt = motionEvent.getX();
                    this.KWHzl = motionEvent.getY();
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return;
                }
                if (motionEvent.getAction() == 2) {
                    float x = motionEvent.getX() - this.OLrzqt;
                    float y = motionEvent.getY() - this.KWHzl;
                    boolean z = orientation == 0;
                    float fAbs = java.lang.Math.abs(x) * (z ? 0.5f : 1.0f);
                    float fAbs2 = java.lang.Math.abs(y) * (z ? 1.0f : 0.5f);
                    float f = this.EZpvd;
                    if (fAbs > f || fAbs2 > f) {
                        if (z == (fAbs2 > fAbs)) {
                            getParent().requestDisallowInterceptTouchEvent(false);
                            return;
                        }
                        if (!z) {
                            x = y;
                        }
                        if (copydefault(viewCopydefault2, orientation, x)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        } else {
                            getParent().requestDisallowInterceptTouchEvent(false);
                        }
                    }
                }
            }
        }
    }
}
