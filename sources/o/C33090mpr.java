package o;

import android.view.ViewGroup;

/* JADX INFO: renamed from: o.mpr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33090mpr {
    public static void EZpvd(android.view.View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public static void EZpvd(android.view.View view, boolean z) {
        view.setSelected(z);
    }
}
