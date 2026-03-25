package o;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.okpush.sdk.utils.PushServiceCapabilityDetector$isFcmAvailable$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.thh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46996thh {
    public static final C46996thh KWHzl = new C46996thh();
    public static final java.lang.String EZpvd = C46996thh.class.getSimpleName();

    private C46996thh() {
    }

    public final boolean copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        boolean zAEQbTJ = AEQbTJ(context);
        pUU.KWHzl(EZpvd, "supportsGooglePush : " + zAEQbTJ);
        return zAEQbTJ;
    }

    public final java.lang.Object AEQbTJ(@NotNull android.content.Context context, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new PushServiceCapabilityDetector$isFcmAvailable$2(context, null), continuation);
    }

    public final boolean AEQbTJ(android.content.Context context) {
        try {
            int iIsGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context);
            pUU.KWHzl(EZpvd, "isGooglePlayServicesAvailable, code: " + iIsGooglePlayServicesAvailable);
            return iIsGooglePlayServicesAvailable == 0;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(EZpvd, "init failed " + th.getMessage());
            return false;
        }
    }

    @VisibleForTesting
    public final void KWHzl(long j, boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C46934tgY c46934tgY = C46934tgY.AEQbTJ;
        EventData eventDataOLrzqt = c46934tgY.OLrzqt();
        eventDataOLrzqt.setMsg("PushService_FCM_GetToken_TimeCost");
        eventDataOLrzqt.setAttrs(C56424yEw.gEmmrt(C56390yDp.OLrzqt("totalTime", java.lang.String.valueOf(j)), C56390yDp.OLrzqt("attr_1", java.lang.String.valueOf(z)), C56390yDp.OLrzqt("attr_2", str)));
        c46934tgY.EZpvd(ReportManager.AEQbTJ, eventDataOLrzqt);
    }
}
