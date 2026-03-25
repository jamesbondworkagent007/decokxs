package o;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.mpA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33047mpA {
    public static RecyclerView.LayoutManager KWHzl(android.content.Context context) {
        return new LinearLayoutManager(context, 1, false);
    }

    public static RecyclerView.LayoutManager OLrzqt(android.content.Context context) {
        return new LinearLayoutManager(context, 0, false);
    }

    public static RecyclerView.LayoutManager copydefault(android.content.Context context, int i) {
        return new GridLayoutManager(context, i, 1, false);
    }

    public static RecyclerView.LayoutManager KWHzl(android.content.Context context, int i) {
        return new GridLayoutManager(context, i, 1, false);
    }

    public static RecyclerView.ItemDecoration KWHzl(int i, int i2, int i3, boolean z) {
        return new C33599mzW(i, i2, i3, z);
    }

    public static RecyclerView.ItemDecoration AEQbTJ(int i, int i2) {
        return new C33599mzW(i, i2, i2, false);
    }

    public static RecyclerView.ItemDecoration KWHzl(android.content.Context context, android.graphics.drawable.Drawable drawable, boolean z, boolean z2) {
        return new C31684mAb(drawable, z, z2);
    }
}
