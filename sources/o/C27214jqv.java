package o;

import android.view.ViewGroup;
import androidx.core.view.MarginLayoutParamsCompat;
import o.C27208jqp;

/* JADX INFO: renamed from: o.jqv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27214jqv {
    public static final int valueOf(android.view.View view) {
        return view.getPaddingStart() + view.getPaddingEnd();
    }

    public static final int AhwBna(android.view.View view) {
        return view.getPaddingTop() + view.getPaddingBottom();
    }

    public static final float djBIcL(android.view.View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C27208jqp.StateListAnimator stateListAnimator = layoutParams instanceof C27208jqp.StateListAnimator ? (C27208jqp.StateListAnimator) layoutParams : null;
        if (stateListAnimator != null) {
            return stateListAnimator.AEQbTJ();
        }
        return -1.0f;
    }

    public static final int AYXKKw(android.view.View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int marginStart = layoutParams instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams) : 0;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        return marginStart + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) layoutParams2) : 0);
    }

    public static final int gEmmrt(android.view.View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        return i + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
    }
}
