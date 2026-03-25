package o;

import androidx.core.widget.NestedScrollView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uyY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49967uyY {
    public static final C49967uyY EZpvd = new C49967uyY();

    private C49967uyY() {
    }

    public final void KWHzl(@NotNull android.view.View view, int i, @NotNull java.util.List<C47988uAv> list) {
        android.view.Window window;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(list, "");
        android.content.Context context = view.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        try {
            C49967uyY c49967uyY = EZpvd;
            android.view.View viewFindViewById = window.getDecorView().findViewById(i);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            c49967uyY.OLrzqt((NestedScrollView) viewFindViewById, list);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            pUU.copydefault("TradeValidityCheckUtil", "scroll exception: " + Unit.INSTANCE);
        }
    }

    public final void OLrzqt(@NotNull NestedScrollView nestedScrollView, @NotNull java.util.List<C47988uAv> list) {
        C47988uAv next;
        Intrinsics.checkNotNullParameter(nestedScrollView, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<C47988uAv> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.getFieldNames() || next.uzCIH()) {
                break;
            }
        }
        if (next == null || EZpvd(next) == 0) {
            return;
        }
        nestedScrollView.smoothScrollTo(0, next.getTop() - 200, 300);
    }

    public final int EZpvd(android.view.View view) {
        if (view == null) {
            return 0;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        if (view.getGlobalVisibleRect(rect)) {
            return (rect.width() < view.getMeasuredWidth() || rect.height() < view.getMeasuredHeight()) ? 1 : 0;
        }
        return 2;
    }
}
