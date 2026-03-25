package o;

import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uzG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C50002uzG extends android.widget.FrameLayout {
    public float AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public float KWHzl;
    public int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C50002uzG(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C50002uzG(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:16) call: o.uzG.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C50002uzG(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50002uzG(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.uzD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50002uzG.EZpvd(this.AEQbTJ);
            }
        });
        this.OLrzqt = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }

    private final android.view.ViewParent EZpvd() {
        return (android.view.ViewParent) this.EZpvd.getValue();
    }

    /* JADX DEBUG: Duplicate block (B:5:0x000c) to fix multi-entry loop: BACK_EDGE: B:5:0x000c -> B:6:0x000d */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x000d, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final android.view.ViewParent EZpvd(C50002uzG c50002uzG) {
        android.view.View view;
        java.lang.Object parent = c50002uzG.getParent();
        if (parent instanceof android.view.View) {
            view = (android.view.View) parent;
            while (view != null && !c50002uzG.copydefault(view)) {
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

    public final boolean copydefault(android.view.View view) {
        return (view instanceof ViewPager) || (view instanceof ViewPager2);
    }

    private final android.view.View copydefault() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    public final boolean KWHzl(int i, float f) {
        int i2 = -((int) java.lang.Math.signum(f));
        if (copydefault() instanceof wXI) {
            return true;
        }
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
        KWHzl(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void KWHzl(android.view.MotionEvent motionEvent) {
        java.lang.Integer numValueOf;
        android.view.ViewParent viewParentEZpvd = EZpvd();
        if (viewParentEZpvd instanceof ViewPager2) {
            android.view.ViewParent viewParentEZpvd2 = EZpvd();
            numValueOf = null;
            ViewPager2 viewPager2 = viewParentEZpvd2 instanceof ViewPager2 ? (ViewPager2) viewParentEZpvd2 : null;
            if (viewPager2 != null) {
                numValueOf = java.lang.Integer.valueOf(viewPager2.getOrientation());
            }
        } else if (!(viewParentEZpvd instanceof ViewPager)) {
            return;
        } else {
            numValueOf = 0;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            if (KWHzl(iIntValue, -1.0f) || KWHzl(iIntValue, 1.0f)) {
                if (motionEvent.getAction() == 0) {
                    this.AEQbTJ = motionEvent.getX();
                    this.KWHzl = motionEvent.getY();
                    OLrzqt(true);
                } else if (motionEvent.getAction() == 2) {
                    float x = motionEvent.getX() - this.AEQbTJ;
                    float y = motionEvent.getY() - this.KWHzl;
                    boolean z = iIntValue == 0;
                    if (z == (java.lang.Math.abs(y) * (z ? 1.0f : 0.5f) > java.lang.Math.abs(x) * (z ? 0.5f : 1.0f))) {
                        OLrzqt(false);
                        return;
                    }
                    if (!z) {
                        x = y;
                    }
                    if (KWHzl(iIntValue, x)) {
                        OLrzqt(true);
                    } else {
                        OLrzqt(false);
                    }
                }
            }
        }
    }

    public final void OLrzqt(boolean z) {
        android.view.ViewParent viewParentEZpvd;
        if ((EZpvd() instanceof ViewPager) && (viewParentEZpvd = EZpvd()) != null) {
            viewParentEZpvd.requestDisallowInterceptTouchEvent(z);
        }
        getParent().requestDisallowInterceptTouchEvent(z);
    }
}
