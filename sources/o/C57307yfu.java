package o;

import android.view.ViewGroup;
import androidx.core.view.MarginLayoutParamsCompat;
import o.C57303yfq;

/* JADX INFO: renamed from: o.yfu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57307yfu {
    public static final int AhwBna(android.view.View view) {
        return view.getPaddingStart() + view.getPaddingEnd();
    }

    public static final int djBIcL(android.view.View view) {
        return view.getPaddingTop() + view.getPaddingBottom();
    }

    public static final float gEmmrt(android.view.View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C57303yfq.TaskDescription taskDescription = layoutParams instanceof C57303yfq.TaskDescription ? (C57303yfq.TaskDescription) layoutParams : null;
        if (taskDescription != null) {
            return taskDescription.EZpvd();
        }
        return -1.0f;
    }

    public static final int valueOf(android.view.View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int marginStart = layoutParams instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams) : 0;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        return marginStart + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) layoutParams2) : 0);
    }

    public static final int AYXKKw(android.view.View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        return i + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
    }
}
