package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tVi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C46465tVi extends android.widget.FrameLayout {
    public final int AEQbTJ;
    public float EZpvd;
    public boolean KWHzl;
    public android.view.View OLrzqt;
    public float copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C46465tVi(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C46465tVi(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:20) call: o.tVi.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C46465tVi(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46465tVi(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.copydefault = motionEvent.getX();
            this.EZpvd = motionEvent.getY();
            this.KWHzl = false;
            android.view.View viewCopydefault = copydefault(this, motionEvent.getX(), motionEvent.getY());
            this.OLrzqt = viewCopydefault;
            if (viewCopydefault != null) {
                android.view.ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            } else {
                android.view.ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(false);
                }
            }
        } else if (actionMasked == 1) {
            this.KWHzl = false;
            this.OLrzqt = null;
            android.view.ViewParent parent3 = getParent();
            if (parent3 != null) {
                parent3.requestDisallowInterceptTouchEvent(false);
            }
        } else if (actionMasked == 2) {
            float x = motionEvent.getX() - this.copydefault;
            float y = motionEvent.getY() - this.EZpvd;
            if (!this.KWHzl && (java.lang.Math.abs(x) > this.AEQbTJ || java.lang.Math.abs(y) > this.AEQbTJ)) {
                this.KWHzl = true;
            }
            if (this.KWHzl) {
                boolean z = java.lang.Math.abs(x) > java.lang.Math.abs(y);
                android.view.View view = this.OLrzqt;
                if (z && view != null) {
                    if (OLrzqt(view, x)) {
                        android.view.ViewParent parent4 = getParent();
                        if (parent4 != null) {
                            parent4.requestDisallowInterceptTouchEvent(true);
                        }
                    } else {
                        android.view.ViewParent parent5 = getParent();
                        if (parent5 != null) {
                            parent5.requestDisallowInterceptTouchEvent(false);
                        }
                    }
                } else {
                    android.view.ViewParent parent6 = getParent();
                    if (parent6 != null) {
                        parent6.requestDisallowInterceptTouchEvent(false);
                    }
                }
            }
        } else if (actionMasked == 3) {
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0006 */
    public final android.view.View copydefault(android.view.ViewGroup viewGroup, float f, float f2) {
        android.view.View viewCopydefault;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return null;
            }
            android.view.View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0) {
                float left = childAt.getLeft();
                float top = childAt.getTop();
                float right = childAt.getRight();
                float bottom = childAt.getBottom();
                if (f >= left && f <= right && f2 >= top && f2 <= bottom) {
                    if (childAt instanceof android.widget.HorizontalScrollView) {
                        return childAt;
                    }
                    if ((childAt instanceof RecyclerView) && copydefault((RecyclerView) childAt)) {
                        return childAt;
                    }
                    if ((childAt instanceof android.view.ViewGroup) && (viewCopydefault = copydefault((android.view.ViewGroup) childAt, f - left, f2 - top)) != null) {
                        return viewCopydefault;
                    }
                }
            }
        }
    }

    public final boolean copydefault(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).getOrientation() == 0) {
                return true;
            }
        } else if (recyclerView.canScrollHorizontally(1) || recyclerView.canScrollHorizontally(-1)) {
            return true;
        }
        return false;
    }

    public final boolean OLrzqt(android.view.View view, float f) {
        if (view instanceof android.widget.HorizontalScrollView) {
            return copydefault((android.widget.HorizontalScrollView) view, f);
        }
        if (view instanceof RecyclerView) {
            return EZpvd((RecyclerView) view, f);
        }
        return false;
    }

    public final boolean copydefault(android.widget.HorizontalScrollView horizontalScrollView, float f) {
        android.view.View childAt = horizontalScrollView.getChildAt(0);
        if (childAt == null) {
            return false;
        }
        int iMax = java.lang.Math.max(0, childAt.getMeasuredWidth() - horizontalScrollView.getMeasuredWidth());
        if (f > 0.0f) {
            if (horizontalScrollView.getScrollX() <= 0) {
                return false;
            }
        } else if (horizontalScrollView.getScrollX() >= iMax) {
            return false;
        }
        return true;
    }

    public final boolean EZpvd(RecyclerView recyclerView, float f) {
        if (f > 0.0f) {
            return recyclerView.canScrollHorizontally(-1);
        }
        return recyclerView.canScrollHorizontally(1);
    }
}
