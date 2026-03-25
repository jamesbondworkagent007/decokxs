package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aRZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6555aRZ {
    public final android.content.Context OLrzqt;

    public C6555aRZ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = context;
    }

    public final boolean KWHzl() {
        java.lang.Object systemService = this.OLrzqt.getSystemService("keyguard");
        Intrinsics.copydefault(systemService, "");
        return ((android.app.KeyguardManager) systemService).isDeviceSecure();
    }
}
