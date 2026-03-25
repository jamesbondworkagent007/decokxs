package o;

import androidx.work.Configuration;
import androidx.work.WorkManager;
import com.onesignal.OneSignal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ypj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57826ypj {
    public static final C57826ypj copydefault = new C57826ypj();

    private C57826ypj() {
    }

    public static final WorkManager OLrzqt(@NotNull android.content.Context context) {
        WorkManager workManager;
        synchronized (C57826ypj.class) {
            Intrinsics.checkNotNullParameter(context, "");
            try {
                workManager = WorkManager.getInstance(context);
                Intrinsics.checkNotNullExpressionValue(workManager, "");
            } catch (java.lang.IllegalStateException e) {
                OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "OSWorkManagerHelper.getInstance failed, attempting to initialize: ", e);
                copydefault.KWHzl(context);
                workManager = WorkManager.getInstance(context);
                Intrinsics.checkNotNullExpressionValue(workManager, "");
            }
        }
        return workManager;
    }

    public final void KWHzl(android.content.Context context) {
        try {
            java.lang.Object applicationContext = context.getApplicationContext();
            androidx.work.Configuration workManagerConfiguration = null;
            Configuration.Provider provider = applicationContext instanceof Configuration.Provider ? (Configuration.Provider) applicationContext : null;
            if (provider != null) {
                workManagerConfiguration = provider.getWorkManagerConfiguration();
            }
            if (workManagerConfiguration == null) {
                workManagerConfiguration = new Configuration.Builder().build();
            }
            Intrinsics.checkNotNullExpressionValue(workManagerConfiguration, "");
            WorkManager.initialize(context, workManagerConfiguration);
        } catch (java.lang.IllegalStateException e) {
            OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "OSWorkManagerHelper initializing WorkManager failed: ", e);
        }
    }
}
