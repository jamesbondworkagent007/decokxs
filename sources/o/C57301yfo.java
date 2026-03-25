package o;

import android.view.ViewGroup;
import androidx.core.view.MarginLayoutParamsCompat;
import o.C57299yfm;

/* JADX INFO: renamed from: o.yfo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57301yfo {
    public static final int valueOf(android.view.View view) {
        return view.getPaddingStart() + view.getPaddingEnd();
    }

    public static final int fetchVPNInfo(android.view.View view) {
        return view.getPaddingTop() + view.getPaddingBottom();
    }

    public static final float AYXKKw(android.view.View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C57299yfm.Activity activity = layoutParams instanceof C57299yfm.Activity ? (C57299yfm.Activity) layoutParams : null;
        if (activity != null) {
            return activity.copydefault();
        }
        return 40.0f;
    }

    public static final float gEmmrt(android.view.View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C57299yfm.Activity activity = layoutParams instanceof C57299yfm.Activity ? (C57299yfm.Activity) layoutParams : null;
        if (activity != null) {
            return activity.OLrzqt();
        }
        return 12.0f;
    }

    public static final int AhwBna(android.view.View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int marginStart = layoutParams instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams) : 0;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        return marginStart + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) layoutParams2) : 0);
    }

    public static final int DbNXlk(android.view.View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        return i + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
    }
}
