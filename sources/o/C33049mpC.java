package o;

import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mpC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33049mpC {
    public static final C33049mpC OLrzqt = new C33049mpC();
    public static boolean KWHzl = SPUtils.getBoolean("is_force_rtl", false, "DebugConfig");
    public static final java.util.Locale EZpvd = new java.util.Locale("fa");
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return KWHzl;
    }

    private C33049mpC() {
    }

    public final android.content.Context AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (!EZpvd()) {
            return context;
        }
        android.content.res.Configuration configuration = context.getResources().getConfiguration();
        configuration.screenLayout = 128;
        configuration.setLayoutDirection(EZpvd);
        android.content.Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
        Intrinsics.copydefault(contextCreateConfigurationContext);
        return contextCreateConfigurationContext;
    }

    public final android.content.res.Resources EZpvd(@NotNull android.content.res.Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "");
        if (EZpvd()) {
            android.content.res.Configuration configuration = resources.getConfiguration();
            android.util.DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            configuration.screenLayout = 128;
            configuration.setLayoutDirection(EZpvd);
            resources.updateConfiguration(configuration, displayMetrics);
        }
        return resources;
    }
}
