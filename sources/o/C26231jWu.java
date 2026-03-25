package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jWu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26231jWu {
    public static final boolean copydefault(@NotNull C26213jWc c26213jWc, android.view.View view) {
        Intrinsics.checkNotNullParameter(c26213jWc, "");
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        c26213jWc.getLocationInWindow(iArr2);
        int i = iArr[0] - iArr2[0];
        int i2 = iArr[1] - iArr2[1];
        return c26213jWc.copydefault() >= ((float) i) && c26213jWc.copydefault() <= ((float) (i + view.getWidth())) && c26213jWc.EZpvd() >= ((float) i2) && c26213jWc.EZpvd() <= ((float) (i2 + view.getHeight()));
    }

    public static final RecyclerView OLrzqt(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "");
            RecyclerView recyclerViewOLrzqt = OLrzqt(childAt);
            if (recyclerViewOLrzqt != null) {
                return recyclerViewOLrzqt;
            }
        }
        return null;
    }

    public static final int copydefault(@NotNull C26213jWc c26213jWc, RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(c26213jWc, "");
        if (recyclerView == null) {
            return -1;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = recyclerView.getChildAt(i);
            if (copydefault(c26213jWc, childAt)) {
                return recyclerView.getChildAdapterPosition(childAt);
            }
        }
        return -1;
    }

    public static final C26213jWc copydefault(@NotNull android.view.View view, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(context, "");
        C26213jWc c26213jWc = new C26213jWc(context, null, 2, null);
        c26213jWc.addView(view);
        return c26213jWc;
    }
}
