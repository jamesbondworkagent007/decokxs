package o;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.ScrollingView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: renamed from: o.yrI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class InterpolatorC57905yrI implements android.view.animation.Interpolator {
    public static final float AEQbTJ;
    public static float EZpvd = android.content.res.Resources.getSystem().getDisplayMetrics().density;
    public static int KWHzl = 0;
    public static int OLrzqt = 1;
    public static final float copydefault;
    public int AhwBna;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static float KWHzl(int i) {
        return i / EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int OLrzqt(float f) {
        return (int) ((f * EZpvd) + 0.5f);
    }

    public InterpolatorC57905yrI(int i) {
        this.AhwBna = i;
    }

    public static int EZpvd(android.view.View view) {
        int iMakeMeasureSpec;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i = layoutParams.height;
        if (i > 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(childMeasureSpec, iMakeMeasureSpec);
        return view.getMeasuredHeight();
    }

    public static void AEQbTJ(@androidx.annotation.NonNull android.widget.AbsListView absListView, int i) {
        absListView.scrollListBy(i);
    }

    public static boolean KWHzl(android.view.View view) {
        return (view instanceof android.widget.AbsListView) || (view instanceof android.widget.ScrollView) || (view instanceof ScrollingView) || (view instanceof android.webkit.WebView) || (view instanceof NestedScrollingChild);
    }

    public static boolean OLrzqt(android.view.View view) {
        return KWHzl(view) || (view instanceof ViewPager) || (view instanceof NestedScrollingParent);
    }

    public static void KWHzl(android.view.View view, int i) {
        if (view instanceof android.widget.ScrollView) {
            ((android.widget.ScrollView) view).fling(i);
            return;
        }
        if (view instanceof android.widget.AbsListView) {
            ((android.widget.AbsListView) view).fling(i);
            return;
        }
        if (view instanceof android.webkit.WebView) {
            ((android.webkit.WebView) view).flingScroll(0, i);
        } else if (view instanceof NestedScrollView) {
            ((NestedScrollView) view).fling(i);
        } else if (view instanceof RecyclerView) {
            ((RecyclerView) view).fling(0, i);
        }
    }

    public static boolean OLrzqt(@androidx.annotation.NonNull android.view.View view, PointF pointF) {
        if (EZpvd(view, -1) && view.getVisibility() == 0) {
            return false;
        }
        if (!(view instanceof android.view.ViewGroup) || pointF == null) {
            return true;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        PointF pointF2 = new PointF();
        for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
            android.view.View childAt = viewGroup.getChildAt(childCount - 1);
            if (KWHzl(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                if ("fixed".equals(childAt.getTag()) || "fixed-bottom".equals(childAt.getTag())) {
                    return false;
                }
                pointF.offset(pointF2.x, pointF2.y);
                boolean zOLrzqt = OLrzqt(childAt, pointF);
                pointF.offset(-pointF2.x, -pointF2.y);
                return zOLrzqt;
            }
        }
        return true;
    }

    public static boolean copydefault(@androidx.annotation.NonNull android.view.View view, PointF pointF, boolean z) {
        if (EZpvd(view, 1) && view.getVisibility() == 0) {
            return false;
        }
        if ((view instanceof android.view.ViewGroup) && pointF != null && !KWHzl(view)) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                android.view.View childAt = viewGroup.getChildAt(childCount - 1);
                if (KWHzl(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if ("fixed".equals(childAt.getTag()) || "fixed-top".equals(childAt.getTag())) {
                        return false;
                    }
                    pointF.offset(pointF2.x, pointF2.y);
                    boolean zCopydefault = copydefault(childAt, pointF, z);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return zCopydefault;
                }
            }
        }
        return z || EZpvd(view, -1);
    }

    public static boolean EZpvd(@androidx.annotation.NonNull android.view.View view, int i) {
        return view.canScrollVertically(i);
    }

    public static boolean KWHzl(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2, float f, float f2, PointF pointF) {
        if (view2.getVisibility() != 0) {
            return false;
        }
        float[] fArr = {f, f2};
        fArr[0] = (view.getScrollX() - view2.getLeft()) + f;
        float scrollY = fArr[1] + (view.getScrollY() - view2.getTop());
        fArr[1] = scrollY;
        float f3 = fArr[0];
        boolean z = f3 >= 0.0f && scrollY >= 0.0f && f3 < ((float) view2.getWidth()) && fArr[1] < ((float) view2.getHeight());
        if (z && pointF != null) {
            pointF.set(fArr[0] - f, fArr[1] - f2);
        }
        return z;
    }

    static {
        float fCopydefault = 1.0f / copydefault(1.0f);
        AEQbTJ = fCopydefault;
        copydefault = 1.0f - (fCopydefault * copydefault(1.0f));
    }

    public static float copydefault(float f) {
        float f2 = f * 8.0f;
        if (f2 < 1.0f) {
            return f2 - (1.0f - ((float) java.lang.Math.exp(-f2)));
        }
        return 0.36787945f + ((1.0f - ((float) java.lang.Math.exp(1.0f - f2))) * 0.63212055f);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (this.AhwBna == OLrzqt) {
            float f2 = 1.0f - f;
            return 1.0f - (f2 * f2);
        }
        float fCopydefault = AEQbTJ * copydefault(f);
        return fCopydefault > 0.0f ? fCopydefault + copydefault : fCopydefault;
    }
}
