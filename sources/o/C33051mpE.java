package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mpE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33051mpE {
    public static final C33051mpE AEQbTJ = new C33051mpE();
    public static final int EZpvd = 8;
    public static boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        copydefault = z;
    }

    private C33051mpE() {
    }

    public final android.content.Context KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Context contextAEQbTJ = C33049mpC.OLrzqt.AEQbTJ(context);
        if (!copydefault) {
            return contextAEQbTJ;
        }
        android.content.res.Configuration configuration = contextAEQbTJ.getResources().getConfiguration();
        if (configuration.fontScale <= 1.0f) {
            return contextAEQbTJ;
        }
        configuration.fontScale = 1.0f;
        android.content.Context contextCreateConfigurationContext = contextAEQbTJ.createConfigurationContext(configuration);
        Intrinsics.copydefault(contextCreateConfigurationContext);
        return contextCreateConfigurationContext;
    }

    public final android.content.res.Resources EZpvd(@NotNull android.content.res.Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "");
        android.content.res.Resources resourcesEZpvd = C33049mpC.OLrzqt.EZpvd(resources);
        if (!copydefault) {
            return resourcesEZpvd;
        }
        android.content.res.Configuration configuration = resourcesEZpvd.getConfiguration();
        android.util.DisplayMetrics displayMetrics = resourcesEZpvd.getDisplayMetrics();
        if (configuration.fontScale > 1.0f) {
            configuration.fontScale = 1.0f;
        }
        float f = displayMetrics.scaledDensity;
        float f2 = displayMetrics.density;
        if (f > f2) {
            displayMetrics.scaledDensity = f2;
        }
        resourcesEZpvd.updateConfiguration(configuration, displayMetrics);
        return resourcesEZpvd;
    }
}
