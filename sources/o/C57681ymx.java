package o;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ymx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57681ymx {
    public static /* synthetic */ void margin$default(android.view.View view, java.lang.Float f, java.lang.Float f2, java.lang.Float f3, java.lang.Float f4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            f2 = null;
        }
        if ((i & 4) != 0) {
            f3 = null;
        }
        if ((i & 8) != 0) {
            f4 = null;
        }
        AEQbTJ(view, f, f2, f3, f4);
    }

    public static final int OLrzqt(@NotNull android.view.View view, float f) {
        Intrinsics.checkNotNullParameter(view, "");
        android.content.Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return EZpvd(context, f);
    }

    public static final int EZpvd(@NotNull android.content.Context context, float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return (int) android.util.TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static final void AEQbTJ(@NotNull android.view.View view, java.lang.Float f, java.lang.Float f2, java.lang.Float f3, java.lang.Float f4) {
        Intrinsics.checkNotNullParameter(view, "");
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (f != null) {
                marginLayoutParams.leftMargin = OLrzqt(view, f.floatValue());
            }
            if (f2 != null) {
                marginLayoutParams.topMargin = OLrzqt(view, f2.floatValue());
            }
            if (f3 != null) {
                marginLayoutParams.rightMargin = OLrzqt(view, f3.floatValue());
            }
            if (f4 != null) {
                marginLayoutParams.bottomMargin = OLrzqt(view, f4.floatValue());
            }
        }
    }
}
