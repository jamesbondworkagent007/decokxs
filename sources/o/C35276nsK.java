package o;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nsK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35276nsK {
    public static final C35276nsK OLrzqt = new C35276nsK();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return Build.VERSION.SDK_INT >= 30;
    }

    private C35276nsK() {
    }

    public final void KWHzl(@NotNull android.app.Service service, int i, @NotNull android.app.Notification notification) {
        Intrinsics.checkNotNullParameter(service, "");
        Intrinsics.checkNotNullParameter(notification, "");
        if (EZpvd()) {
            service.startForeground(i, notification, 128);
        } else {
            service.startForeground(i, notification);
        }
    }
}
