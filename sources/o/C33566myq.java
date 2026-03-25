package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.myq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33566myq {
    public static final C33566myq EZpvd = new C33566myq();

    private C33566myq() {
    }

    public final int AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public final int EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService("window");
        Intrinsics.copydefault(systemService, "");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        ((android.view.WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public final int OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService("window");
        Intrinsics.copydefault(systemService, "");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        ((android.view.WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }
}
