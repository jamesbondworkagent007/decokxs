package o;

import androidx.core.app.NotificationCompat;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core.notification.RecallNotificationType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rDZ {
    public static final rDZ OLrzqt = new rDZ();

    private rDZ() {
    }

    public final void copydefault(@NotNull android.content.Context context, @NotNull final RecallNotificationType recallNotificationType, long j, long j2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(recallNotificationType, "");
        java.lang.Long l = SPUtils.getLong("recall_notification_current_resend_count", 0L);
        if (l.longValue() > j2) {
            pUU.KWHzl("RecallNotification", "currentCount (" + l + ") > maxResendCount (" + j2 + ") | Not setting notification");
            return;
        }
        java.lang.Object systemService = context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        Intrinsics.copydefault(systemService, "");
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) systemService;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) rDX.class);
        intent.putExtra("extra_notification_type", (android.os.Parcelable) recallNotificationType);
        android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(context, 10001, intent, 201326592);
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() + java.util.concurrent.TimeUnit.SECONDS.toMillis(j);
        try {
            alarmManager.setAndAllowWhileIdle(0, jCurrentTimeMillis, broadcast);
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("KYC_Recall_IDV_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rDY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return rDZ.KWHzl(recallNotificationType, (EventParamsList) obj);
                }
            });
            pUU.KWHzl("RecallNotification", "Scheduled notification | trigger time: " + jCurrentTimeMillis);
        } catch (java.lang.Exception e) {
            pUU.copydefault("RecallNotification", "Failed to schedule notification: " + e.getMessage());
        }
    }

    public static final Unit KWHzl(RecallNotificationType recallNotificationType, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "entry_source", recallNotificationType.getValue(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "user_action", "schedule", false, 4, null);
        EventParamsList.put$default(eventParamsList, "is_vpn", C33129mqd.gEmmrt(java.lang.Boolean.valueOf(C43396roW.EZpvd().AhwBna())), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "notification_permission_enabled", C33129mqd.gEmmrt(java.lang.Boolean.valueOf(C33625mzw.OLrzqt().OLrzqt(C32979mnm.EZpvd.OLrzqt()))), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull android.content.Context context, @NotNull final RecallNotificationType recallNotificationType) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(recallNotificationType, "");
        java.lang.Object systemService = context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        Intrinsics.copydefault(systemService, "");
        android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(context, 10001, new android.content.Intent(context, (java.lang.Class<?>) rDX.class), 201326592);
        ((android.app.AlarmManager) systemService).cancel(broadcast);
        broadcast.cancel();
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("KYC_Recall_IDV_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rDV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rDZ.AEQbTJ(recallNotificationType, (EventParamsList) obj);
            }
        });
        pUU.KWHzl("RecallNotification", "Cancelled notification");
    }

    public static final Unit AEQbTJ(RecallNotificationType recallNotificationType, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "entry_source", recallNotificationType.getValue(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "user_action", "remove", false, 4, null);
        EventParamsList.put$default(eventParamsList, "is_vpn", C33129mqd.gEmmrt(java.lang.Boolean.valueOf(C43396roW.EZpvd().AhwBna())), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "notification_permission_enabled", C33129mqd.gEmmrt(java.lang.Boolean.valueOf(C33625mzw.OLrzqt().OLrzqt(C32979mnm.EZpvd.OLrzqt()))), false, 4, null);
        return Unit.INSTANCE;
    }
}
