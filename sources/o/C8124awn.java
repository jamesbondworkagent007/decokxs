package o;

import android.provider.Settings;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.awn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8124awn {
    public static final C8124awn EZpvd = new C8124awn();

    private C8124awn() {
    }

    public final int OLrzqt(@NotNull android.content.Context context, float f) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.res.Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        return (int) ((f * resources.getDisplayMetrics().density) + 0.5f);
    }

    public final int copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService("window");
        if (systemService == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        ((android.view.WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
        android.content.res.Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        return resources.getConfiguration().orientation == 1 ? displayMetrics.widthPixels : displayMetrics.widthPixels - AEQbTJ(context);
    }

    public final int OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl(context).y;
    }

    public final android.graphics.Point KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.graphics.Point point = new android.graphics.Point();
        java.lang.Object systemService = context.getSystemService("window");
        if (systemService == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        ((android.view.WindowManager) systemService).getDefaultDisplay().getRealSize(point);
        return point;
    }

    public final int AhwBna(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.res.Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public final int copydefault(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        android.content.Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        android.content.Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        return AhwBna(applicationContext);
    }

    public final int EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.res.Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public final int AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (AYXKKw(context)) {
            return EZpvd(context);
        }
        return 0;
    }

    public final boolean AYXKKw(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (EZpvd(context) != 0) {
            C8125awo c8125awo = C8125awo.OLrzqt;
            if ((!c8125awo.EZpvd() || !valueOf(context)) && ((!c8125awo.AEQbTJ() || !djBIcL(context)) && (!c8125awo.KWHzl() || !values(context)))) {
                return gEmmrt(context);
            }
        }
        return false;
    }

    public final int DbNXlk(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.graphics.Point pointKWHzl = KWHzl(context);
        int i = pointKWHzl.x;
        int i2 = pointKWHzl.y;
        return i > i2 ? i2 : i2 - AEQbTJ(context);
    }

    public final boolean valueOf(android.content.Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "navigationbar_is_min", 0) != 0;
    }

    public final boolean djBIcL(android.content.Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0) != 0;
    }

    public final boolean values(android.content.Context context) {
        return Settings.Secure.getInt(context.getContentResolver(), "navigation_gesture_on", 0) != 0;
    }

    public final boolean gEmmrt(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("window");
        if (systemService == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        int i2 = displayMetrics.widthPixels;
        android.util.DisplayMetrics displayMetrics2 = new android.util.DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics2);
        int i3 = displayMetrics2.heightPixels;
        int i4 = displayMetrics2.widthPixels;
        if (EZpvd(context) + i3 > i) {
            return false;
        }
        return i2 - i4 > 0 || i - i3 > 0;
    }
}
