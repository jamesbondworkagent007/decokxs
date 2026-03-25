package o;

import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nfX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34619nfX extends android.widget.FrameLayout {
    public float AEQbTJ;
    public int EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public float copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34619nfX(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34619nfX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.nfX.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C34619nfX(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34619nfX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.nga
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34619nfX.KWHzl(this.OLrzqt);
            }
        });
        this.EZpvd = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }

    private final android.view.ViewParent OLrzqt() {
        return (android.view.ViewParent) this.OLrzqt.getValue();
    }

    /* JADX DEBUG: Duplicate block (B:5:0x000c) to fix multi-entry loop: BACK_EDGE: B:5:0x000c -> B:6:0x000d */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x000d, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final android.view.ViewParent KWHzl(C34619nfX c34619nfX) {
        android.view.View view;
        java.lang.Object parent = c34619nfX.getParent();
        if (parent instanceof android.view.View) {
            view = (android.view.View) parent;
            while (view != null && !c34619nfX.AEQbTJ(view)) {
                java.lang.Object parent2 = view.getParent();
                if (parent2 instanceof android.view.View) {
                    view = (android.view.View) parent2;
                }
            }
            if (view instanceof android.view.ViewParent) {
                return (android.view.ViewParent) view;
            }
            return null;
        }
        view = null;
    }

    public final boolean AEQbTJ(android.view.View view) {
        return (view instanceof ViewPager) || (view instanceof ViewPager2);
    }

    public final boolean copydefault(int i, float f) {
        int i2 = -((int) java.lang.Math.signum(f));
        if (KWHzl() instanceof wXI) {
            return true;
        }
        if (i == 0) {
            android.view.View viewKWHzl = KWHzl();
            if (viewKWHzl != null) {
                return viewKWHzl.canScrollHorizontally(i2);
            }
        } else if (i == 1) {
            android.view.View viewKWHzl2 = KWHzl();
            if (viewKWHzl2 != null) {
                return viewKWHzl2.canScrollVertically(i2);
            }
        } else {
            throw new java.lang.IllegalArgumentException();
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        copydefault(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void copydefault(android.view.MotionEvent motionEvent) {
        java.lang.Integer numValueOf;
        android.view.ViewParent viewParentOLrzqt = OLrzqt();
        if (viewParentOLrzqt instanceof ViewPager2) {
            android.view.ViewParent viewParentOLrzqt2 = OLrzqt();
            numValueOf = null;
            ViewPager2 viewPager2 = viewParentOLrzqt2 instanceof ViewPager2 ? (ViewPager2) viewParentOLrzqt2 : null;
            if (viewPager2 != null) {
                numValueOf = java.lang.Integer.valueOf(viewPager2.getOrientation());
            }
        } else if (!(viewParentOLrzqt instanceof ViewPager)) {
            return;
        } else {
            numValueOf = 0;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            if (copydefault(iIntValue, -1.0f) || copydefault(iIntValue, 1.0f)) {
                if (motionEvent.getAction() == 0) {
                    this.copydefault = motionEvent.getX();
                    this.AEQbTJ = motionEvent.getY();
                    EZpvd(true);
                } else if (motionEvent.getAction() == 2) {
                    float x = motionEvent.getX() - this.copydefault;
                    float y = motionEvent.getY() - this.AEQbTJ;
                    boolean z = iIntValue == 0;
                    if (z == (java.lang.Math.abs(y) * (z ? 1.0f : 0.5f) > java.lang.Math.abs(x) * (z ? 0.5f : 1.0f))) {
                        EZpvd(false);
                        return;
                    }
                    if (!z) {
                        x = y;
                    }
                    if (copydefault(iIntValue, x)) {
                        EZpvd(true);
                    } else {
                        EZpvd(false);
                    }
                }
            }
        }
    }

    public final void EZpvd(boolean z) {
        android.view.ViewParent viewParentOLrzqt;
        if ((OLrzqt() instanceof ViewPager) && (viewParentOLrzqt = OLrzqt()) != null) {
            viewParentOLrzqt.requestDisallowInterceptTouchEvent(z);
        }
        getParent().requestDisallowInterceptTouchEvent(z);
    }

    private final android.view.View KWHzl() {
        if (getChildCount() != 0) {
            return getChildAt(0);
        }
        return null;
    }
}
