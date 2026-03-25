package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55366xib {
    public static final int KWHzl(@androidx.annotation.AttrRes int i, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    public static final int copydefault(@androidx.annotation.AttrRes int i, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    public static final int OLrzqt(@androidx.annotation.AttrRes int i, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    public static final float AEQbTJ(@androidx.annotation.AttrRes int i, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.getDimension(context.getResources().getDisplayMetrics());
    }
}
