package o;

import com.onesignal.NotificationOpenedReceiver;
import com.onesignal.NotificationOpenedReceiverAndroid22AndOlder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ynD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57688ynD {
    public final android.content.Context AEQbTJ;
    public final java.lang.Class<?> OLrzqt;
    public final java.lang.Class<?> copydefault;

    public C57688ynD(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = context;
        this.OLrzqt = NotificationOpenedReceiver.class;
        this.copydefault = NotificationOpenedReceiverAndroid22AndOlder.class;
    }

    public final android.content.Intent EZpvd(int i) {
        android.content.Intent intentAddFlags = OLrzqt().putExtra("androidNotificationId", i).addFlags(603979776);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags, "");
        return intentAddFlags;
    }

    public final android.content.Intent OLrzqt() {
        return new android.content.Intent(this.AEQbTJ, this.OLrzqt);
    }

    public final android.app.PendingIntent OLrzqt(int i, @NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        return android.app.PendingIntent.getActivity(this.AEQbTJ, i, intent, 201326592);
    }
}
