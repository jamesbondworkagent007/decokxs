package o;

import com.onesignal.OSUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yoD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57741yoD {
    public static final C57741yoD EZpvd = new C57741yoD();

    private C57741yoD() {
    }

    public final boolean EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return !Intrinsics.EZpvd((java.lang.Object) "DISABLE", (java.lang.Object) OSUtils.OLrzqt(context, "com.onesignal.NotificationOpened.DEFAULT"));
    }

    public final boolean AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return OSUtils.AEQbTJ(context, "com.onesignal.suppressLaunchURLs");
    }
}
