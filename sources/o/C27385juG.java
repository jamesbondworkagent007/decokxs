package o;

import androidx.viewpager2.widget.ViewPager2;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.juG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27385juG extends android.widget.FrameLayout {
    public final InterfaceC56387yDm EZpvd;
    public float KWHzl;
    public float OLrzqt;
    public final int copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27385juG(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.EZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0() { // from class: o.juF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27385juG.AEQbTJ(this.OLrzqt);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27385juG(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.EZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0() { // from class: o.juF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27385juG.AEQbTJ(this.OLrzqt);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27385juG(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, @androidx.annotation.AttrRes int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.EZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0() { // from class: o.juF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27385juG.AEQbTJ(this.OLrzqt);
            }
        });
    }

    private final ViewPager2 EZpvd() {
        return (ViewPager2) this.EZpvd.getValue();
    }

    /* JADX DEBUG: Duplicate block (B:5:0x000c) to fix multi-entry loop: BACK_EDGE: B:5:0x000c -> B:6:0x000d */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x000d, code lost:
    
        r2 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ViewPager2 AEQbTJ(C27385juG c27385juG) {
        android.view.View view;
        java.lang.Object parent = c27385juG.getParent();
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

    private final android.view.View AEQbTJ() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    public final boolean KWHzl(int i, float f) {
        int i2 = -((int) java.lang.Math.signum(f));
        if (i == 0) {
            android.view.View viewAEQbTJ = AEQbTJ();
            if (viewAEQbTJ != null) {
                return viewAEQbTJ.canScrollHorizontally(i2);
            }
        } else if (i == 1) {
            android.view.View viewAEQbTJ2 = AEQbTJ();
            if (viewAEQbTJ2 != null) {
                return viewAEQbTJ2.canScrollVertically(i2);
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
        ViewPager2 viewPager2EZpvd = EZpvd();
        if (viewPager2EZpvd != null) {
            int orientation = viewPager2EZpvd.getOrientation();
            if (KWHzl(orientation, -1.0f) || KWHzl(orientation, 1.0f)) {
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
                    float f = this.copydefault;
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
