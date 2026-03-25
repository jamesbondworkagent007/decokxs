package o;

import android.view.View;

/* JADX INFO: renamed from: o.arU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7842arU {
    public static int copydefault(android.view.View view, android.content.Context context) {
        EZpvd(view);
        return view.getMeasuredHeight();
    }

    public static int OLrzqt(android.view.View view, android.content.Context context) {
        EZpvd(view);
        return view.getMeasuredWidth();
    }

    public static void EZpvd(android.view.View view) {
        android.util.DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        view.measure(View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, Integer.MIN_VALUE));
    }
}
