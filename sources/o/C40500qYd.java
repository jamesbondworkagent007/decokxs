package o;

import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qYd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40500qYd implements InterfaceC40497qYa {
    public static final int EZpvd = 8;
    public float AEQbTJ;
    public float KWHzl;
    public final java.lang.String OLrzqt = "NestedScrollableHostDelegate";
    public ViewPager2 copydefault;
    public int gEmmrt;

    public final boolean OLrzqt(android.view.View view, int i, float f) {
        if (view == null) {
            return false;
        }
        int i2 = -((int) java.lang.Math.signum(f));
        if (i == 0) {
            return view.canScrollHorizontally(i2);
        }
        if (i != 1) {
            return false;
        }
        return view.canScrollVertically(i2);
    }

    /* JADX DEBUG: Duplicate block (B:5:0x0008) to fix multi-entry loop: BACK_EDGE: B:5:0x0008 -> B:6:0x0009 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: android.view.ViewParent */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0009, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ViewPager2 OLrzqt(android.view.ViewParent viewParent) {
        android.view.View view;
        if (viewParent instanceof android.view.View) {
            view = (android.view.View) viewParent;
            while (view != null && !(view instanceof ViewPager2)) {
                java.lang.Object parent = view.getParent();
                if (parent instanceof android.view.View) {
                    view = (android.view.View) parent;
                }
            }
            if (view instanceof ViewPager2) {
                return (ViewPager2) view;
            }
            return null;
        }
        view = null;
    }

    public final void AEQbTJ(android.view.View view, boolean z, boolean z2) {
        if (z2) {
            for (android.view.ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof ViewPager2) {
                    ((ViewPager2) parent).setUserInputEnabled(z);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: android.view.ViewParent */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC40497qYa
    public java.lang.Boolean KWHzl(@NotNull android.view.ViewGroup viewGroup, android.view.View view, @NotNull android.view.MotionEvent motionEvent, boolean z) {
        java.lang.String simpleName;
        ViewPager2 viewPager2;
        java.lang.Object tag;
        java.lang.Object tag2;
        java.lang.Object tag3;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (this.gEmmrt == 0) {
            this.gEmmrt = android.view.ViewConfiguration.get(viewGroup.getContext()).getScaledTouchSlop();
        }
        if (this.copydefault == null) {
            android.view.ViewParent parent = viewGroup.getParent();
            Intrinsics.checkNotNullExpressionValue(parent, "");
            this.copydefault = OLrzqt(parent);
        }
        ViewPager2 viewPager22 = this.copydefault;
        java.lang.Boolean bool = null;
        java.lang.String string = (viewPager22 == null || (tag3 = viewPager22.getTag()) == null) ? null : tag3.toString();
        java.lang.Object tag4 = viewGroup.getTag();
        java.lang.String string2 = tag4 != null ? tag4.toString() : null;
        java.lang.String string3 = (view == null || (tag2 = view.getTag()) == null) ? null : tag2.toString();
        android.view.ViewParent parent2 = viewGroup.getParent();
        android.view.View view2 = parent2 instanceof android.view.View ? (android.view.View) parent2 : null;
        if (view2 == null || (tag = view2.getTag()) == null || (simpleName = tag.toString()) == null) {
            simpleName = parent2.getClass().getSimpleName();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("parentViewPager=");
        sb.append(string);
        sb.append(", viewPager=");
        sb.append(string3);
        sb.append(", wrapper=");
        sb.append(string2);
        sb.append(", wrapperParent: ");
        sb.append(simpleName);
        ViewPager2 viewPager23 = this.copydefault;
        if (viewPager23 == null) {
            return null;
        }
        int orientation = viewPager23.getOrientation();
        if (!OLrzqt(view, orientation, -1.0f) && !OLrzqt(view, orientation, 1.0f)) {
            return null;
        }
        if (motionEvent.getAction() == 0) {
            this.KWHzl = motionEvent.getX();
            this.AEQbTJ = motionEvent.getY();
            parent2.requestDisallowInterceptTouchEvent(true);
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            AEQbTJ(viewGroup, true, z);
            return bool2;
        }
        if (motionEvent.getAction() == 2) {
            float x = motionEvent.getX() - this.KWHzl;
            float y = motionEvent.getY() - this.AEQbTJ;
            boolean z2 = orientation == 0;
            float fAbs = java.lang.Math.abs(x) * (z2 ? 0.5f : 1.0f);
            float fAbs2 = java.lang.Math.abs(y) * (z2 ? 1.0f : 0.5f);
            float f = this.gEmmrt;
            if (fAbs <= f && fAbs2 <= f) {
                return null;
            }
            if (z2 == (fAbs2 > fAbs)) {
                if (!z) {
                    parent2.requestDisallowInterceptTouchEvent(false);
                    bool = java.lang.Boolean.FALSE;
                }
                AEQbTJ(viewGroup, false, z);
                return bool;
            }
            AEQbTJ(viewGroup, true, z);
            if (z2) {
                y = x;
            }
            if (OLrzqt(view, orientation, y)) {
                parent2.requestDisallowInterceptTouchEvent(true);
                return java.lang.Boolean.TRUE;
            }
            if (parent2 != 0) {
                parent2.requestDisallowInterceptTouchEvent(false);
            }
            java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
            boolean zOLrzqt = OLrzqt(this.copydefault, orientation, -1.0f);
            boolean zOLrzqt2 = OLrzqt(this.copydefault, orientation, 1.0f);
            if (zOLrzqt && zOLrzqt2) {
                ViewPager2 viewPager24 = this.copydefault;
                if (viewPager24 == null) {
                    return bool3;
                }
                viewPager24.requestDisallowInterceptTouchEvent(true);
                return bool3;
            }
            if (zOLrzqt && !zOLrzqt2) {
                ViewPager2 viewPager25 = this.copydefault;
                if (viewPager25 == null) {
                    return bool3;
                }
                viewPager25.requestDisallowInterceptTouchEvent(x < 0.0f);
                return bool3;
            }
            if (zOLrzqt || !zOLrzqt2 || (viewPager2 = this.copydefault) == null) {
                return bool3;
            }
            viewPager2.requestDisallowInterceptTouchEvent(x > 0.0f);
            return bool3;
        }
        if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
            return null;
        }
        AEQbTJ(viewGroup, true, z);
        return null;
    }
}
