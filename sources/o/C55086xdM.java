package o;

import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xdM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C55086xdM {
    public static final C55086xdM OLrzqt = new C55086xdM();

    private C55086xdM() {
    }

    public final void copydefault(@NotNull android.content.Context context, @NotNull android.view.View view, @NotNull android.graphics.drawable.Drawable drawable) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(drawable, "");
        android.graphics.Rect bounds = drawable.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "");
        new android.graphics.Rect().set(bounds);
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getDrawingRect(rect);
        int iOLrzqt = C55298xhM.OLrzqt(4, context);
        bounds.top = rect.top - iOLrzqt;
        int iOLrzqt2 = C55298xhM.OLrzqt(12, context);
        bounds.bottom = iOLrzqt2 - iOLrzqt;
        if (ViewCompat.getLayoutDirection(view) == 0) {
            int i = rect.right;
            bounds.left = (i - iOLrzqt2) + iOLrzqt;
            bounds.right = i + iOLrzqt;
        } else {
            bounds.left = rect.left - iOLrzqt;
            bounds.right = (rect.left + iOLrzqt2) - iOLrzqt;
        }
        drawable.setBounds(bounds);
        drawable.invalidateSelf();
    }
}
