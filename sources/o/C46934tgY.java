package o;

import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.okuser.data.User;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tgY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46934tgY {
    public static final C46934tgY AEQbTJ = new C46934tgY();

    private C46934tgY() {
    }

    public final EventData OLrzqt() {
        EventData eventData = new EventData();
        eventData.setAct("event_push");
        return eventData;
    }

    public final void EZpvd(@NotNull ReportManager reportManager, @NotNull EventData eventData) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(reportManager, "");
        Intrinsics.checkNotNullParameter(eventData, "");
        try {
            Result.Application application = Result.Companion;
            reportManager.EZpvd(eventData);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("Grafana.Common", "Failed to add grafana event: " + thM7380exceptionOrNullimpl.getMessage());
        }
    }

    public final void OLrzqt(@NotNull com.okinc.okpush.sdk.utils.NotificationChannel notificationChannel, C46914tgE c46914tgE) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(notificationChannel, "");
        try {
            Result.Application application = Result.Companion;
            if (c46914tgE != null) {
                pUU.KWHzl("PushGrafana", "trackNotificationReceivedEvent: channel=" + notificationChannel + ", notificationDetails=" + c46914tgE);
                EventData eventDataOLrzqt = OLrzqt();
                eventDataOLrzqt.setMsg("PushNotification_Received");
                eventDataOLrzqt.setAttrs(C56424yEw.gEmmrt(C56390yDp.OLrzqt("attr_1", notificationChannel.toString()), C56390yDp.OLrzqt("attr_2", C33488mxR.EZpvd(new C46914tgE(c46914tgE.EZpvd(), c46914tgE.AEQbTJ(), c46914tgE.KWHzl(), c46914tgE.OLrzqt())))));
                EZpvd(ReportManager.AEQbTJ, eventDataOLrzqt);
            } else {
                pUU.KWHzl("PushGrafana", "trackNotificationReceivedEvent(), notification is null");
                AEQbTJ(notificationChannel);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("PushGrafana", "error in trackNotificationReceivedEvent(): " + thM7380exceptionOrNullimpl.getMessage());
            AEQbTJ.AEQbTJ(notificationChannel);
        }
    }

    public final void AEQbTJ(com.okinc.okpush.sdk.utils.NotificationChannel notificationChannel) {
        java.lang.Object objM7377constructorimpl;
        java.lang.Object objM7377constructorimpl2;
        try {
            Result.Application application = Result.Companion;
            java.lang.Object obj = null;
            try {
                User userOLrzqt = C43292rmY.OLrzqt.AwvSrB().OLrzqt();
                objM7377constructorimpl2 = Result.m7377constructorimpl(userOLrzqt != null ? userOLrzqt.getUid() : null);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (!Result.m7383isFailureimpl(objM7377constructorimpl2)) {
                obj = objM7377constructorimpl2;
            }
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            EventData eventDataOLrzqt = OLrzqt();
            eventDataOLrzqt.setMsg("PushNotification_Received");
            eventDataOLrzqt.setAttrs(C56424yEw.gEmmrt(C56390yDp.OLrzqt("attr_1", notificationChannel.toString()), C56390yDp.OLrzqt("attr_2", C33488mxR.EZpvd(new C46914tgE("FAIL_NULL_" + ((java.lang.String) obj) + "_" + jCurrentTimeMillis, "", "", "")))));
            EZpvd(ReportManager.AEQbTJ, eventDataOLrzqt);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th2) {
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("PushGrafana", "error in trackNotificationFailEvent(): " + thM7380exceptionOrNullimpl.getMessage());
        }
    }
}
