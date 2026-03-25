package o;

import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pIi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C37995pIi extends android.widget.FrameLayout {
    public float AEQbTJ;
    public int OLrzqt;
    public float copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37995pIi(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37995pIi(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
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

    private final android.view.View copydefault() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    public final boolean KWHzl(int i, float f) {
        int i2 = -((int) java.lang.Math.signum(f));
        if (i == 0) {
            android.view.View viewCopydefault = copydefault();
            if (viewCopydefault != null) {
                return viewCopydefault.canScrollHorizontally(i2);
            }
        } else if (i == 1) {
            android.view.View viewCopydefault2 = copydefault();
            if (viewCopydefault2 != null) {
                return viewCopydefault2.canScrollVertically(i2);
            }
        } else {
            throw new java.lang.IllegalArgumentException();
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        EZpvd(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void EZpvd(android.view.MotionEvent motionEvent) {
        ViewPager2 viewPager2KWHzl = KWHzl();
        if (viewPager2KWHzl != null) {
            int orientation = viewPager2KWHzl.getOrientation();
            if (KWHzl(orientation, -1.0f) || KWHzl(orientation, 1.0f)) {
                if (motionEvent.getAction() == 0) {
                    this.AEQbTJ = motionEvent.getX();
                    this.copydefault = motionEvent.getY();
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return;
                }
                if (motionEvent.getAction() == 2) {
                    float x = motionEvent.getX() - this.AEQbTJ;
                    float y = motionEvent.getY() - this.copydefault;
                    boolean z = orientation == 0;
                    float fAbs = java.lang.Math.abs(x) * (z ? 0.5f : 1.0f);
                    float fAbs2 = java.lang.Math.abs(y) * (z ? 1.0f : 0.5f);
                    float f = this.OLrzqt;
                    if (fAbs > f || fAbs2 > f) {
                        if (z == (fAbs2 > fAbs)) {
                            getParent().requestDisallowInterceptTouchEvent(false);
                            return;
                        }
                        if (!z) {
                            x = y;
                        }
                        if (KWHzl(orientation, x)) {
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
