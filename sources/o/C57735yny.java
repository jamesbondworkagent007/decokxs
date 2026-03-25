package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yny, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57735yny {
    public final boolean AEQbTJ;
    public final android.content.Intent KWHzl;
    public final android.content.Context OLrzqt;

    public C57735yny(@NotNull android.content.Context context, android.content.Intent intent, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = context;
        this.KWHzl = intent;
        this.AEQbTJ = z;
    }

    public final android.content.Intent EZpvd() {
        android.content.Intent intent = this.KWHzl;
        return intent != null ? intent : KWHzl();
    }

    public final android.content.Intent KWHzl() {
        android.content.Intent launchIntentForPackage;
        if (!this.AEQbTJ || (launchIntentForPackage = this.OLrzqt.getPackageManager().getLaunchIntentForPackage(this.OLrzqt.getPackageName())) == null) {
            return null;
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.setFlags(270532608);
        return launchIntentForPackage;
    }
}
