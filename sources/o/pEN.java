package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pEN {
    public static final pEN EZpvd = new pEN();

    private pEN() {
    }

    public final int AEQbTJ(@NotNull android.content.Context context) {
        android.content.res.Configuration configuration;
        Intrinsics.checkNotNullParameter(context, "");
        android.content.res.Resources resources = context.getResources();
        if (resources == null || (configuration = resources.getConfiguration()) == null) {
            return 1;
        }
        return configuration.orientation;
    }

    public final int EZpvd(android.content.Context context) {
        try {
            java.lang.Object systemService = context.getSystemService("window");
            android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
            android.view.Display defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
            if (defaultDisplay != null) {
                return defaultDisplay.getRotation();
            }
        } catch (java.lang.Exception unused) {
        }
        return -1;
    }

    public final int KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        int iEZpvd = EZpvd(context);
        return (iEZpvd == -1 || iEZpvd == 0 || iEZpvd == 1 || !(iEZpvd == 2 || iEZpvd == 3)) ? 0 : 8;
    }
}
