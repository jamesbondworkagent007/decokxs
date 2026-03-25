package o;

import android.os.Build;
import android.view.WindowMetrics;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xhQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55302xhQ {
    public static final <T> T AEQbTJ(int i, @NotNull Function1<? super java.lang.Integer, ? extends T> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        if (i != 0) {
            return function1.invoke(java.lang.Integer.valueOf(i));
        }
        return null;
    }

    public static /* synthetic */ java.lang.CharSequence getString$default(android.content.res.TypedArray typedArray, android.content.Context context, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return copydefault(typedArray, context, i, i2);
    }

    public static final java.lang.CharSequence copydefault(@NotNull android.content.res.TypedArray typedArray, @NotNull final android.content.Context context, @androidx.annotation.StyleableRes int i, int i2) {
        Intrinsics.checkNotNullParameter(typedArray, "");
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.CharSequence charSequence = (java.lang.CharSequence) AEQbTJ(typedArray.getResourceId(i, i2), new Function1() { // from class: o.xhW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55302xhQ.copydefault(context, ((java.lang.Integer) obj).intValue());
            }
        });
        return charSequence == null ? typedArray.getText(i) : charSequence;
    }

    public static final java.lang.CharSequence copydefault(android.content.Context context, int i) {
        return context.getText(i);
    }

    public static final int EZpvd(@NotNull android.content.res.Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "");
        return resources.getDisplayMetrics().widthPixels;
    }

    public static final int AEQbTJ(@NotNull android.content.res.Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "");
        return resources.getDisplayMetrics().heightPixels;
    }

    public static final int OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl(context)[0];
    }

    public static final int AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl(context)[1];
    }

    /* JADX DEBUG: Class process forced to load method for inline: androidx.window.layout.ActivityCompatHelperApi30$$ExternalSyntheticApiModelOutline1.m(android.view.WindowMetrics):android.graphics.Rect */
    /* JADX DEBUG: Class process forced to load method for inline: androidx.window.layout.ActivityCompatHelperApi30$$ExternalSyntheticApiModelOutline2.m(android.view.WindowManager):android.view.WindowMetrics */
    public static final int[] KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        int[] iArr = new int[2];
        java.lang.Object systemService = context.getSystemService("window");
        Intrinsics.copydefault(systemService, "");
        android.view.WindowManager windowManager = (android.view.WindowManager) systemService;
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "");
            android.graphics.Rect bounds = currentWindowMetrics.getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "");
            iArr[0] = bounds.width();
            iArr[1] = bounds.height();
        } else {
            android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            if (defaultDisplay != null) {
                defaultDisplay.getRealMetrics(displayMetrics);
            }
            iArr[0] = displayMetrics.widthPixels;
            iArr[1] = displayMetrics.heightPixels;
        }
        return iArr;
    }

    public static final int copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.res.Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static final int EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
