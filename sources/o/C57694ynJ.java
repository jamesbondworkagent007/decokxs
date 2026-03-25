package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ynJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57694ynJ {
    public static final C57694ynJ OLrzqt = new C57694ynJ();

    private C57694ynJ() {
    }

    public final void OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.addFlags(268435456);
        intent.putExtra("app_package", context.getPackageName());
        android.content.pm.ApplicationInfo applicationInfoKWHzl = C57721ynk.Companion.KWHzl(context);
        if (applicationInfoKWHzl != null) {
            intent.putExtra("app_uid", applicationInfoKWHzl.uid);
        }
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        context.startActivity(intent);
    }
}
