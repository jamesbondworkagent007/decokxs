package o;

import android.app.ActivityManager;
import android.os.Build;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core.notification.RecallNotificationDeeplinkParams;
import com.okinc.ok_kyc_core.notification.RecallNotificationType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rAu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C41950rAu implements InterfaceC43234rlT {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX INFO: renamed from: o.rAu$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RecallNotificationType.values().length];
            try {
                iArr[RecallNotificationType.LOCAL_PUSH_NOTIFICATION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RecallNotificationType.UNKNOWN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX INFO: renamed from: o.rAu$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rAu.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    @Override // o.InterfaceC43234rlT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        boolean z;
        final RecallNotificationType recallNotificationTypeAEQbTJ;
        rTU rtu;
        java.lang.String string;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        pUU.EZpvd("KYCDeepLinkHandler", "PATH==kyc");
        java.util.Iterator<T> it = map.keySet().iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                recallNotificationTypeAEQbTJ = null;
                break;
            }
            java.lang.String str = (java.lang.String) it.next();
            java.lang.Object obj = map.get(str);
            recallNotificationTypeAEQbTJ = (obj == null || (string = obj.toString()) == null || !java.lang.Boolean.parseBoolean(string)) ? null : RecallNotificationDeeplinkParams.Companion.AEQbTJ(str);
            if (recallNotificationTypeAEQbTJ != null) {
                break;
            }
        }
        if (recallNotificationTypeAEQbTJ != null) {
            java.lang.Long l = SPUtils.getLong("recall_notification_current_resend_count", 0L);
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("KYC_Recall_IDV_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rAA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C41950rAu.EZpvd(recallNotificationTypeAEQbTJ, (EventParamsList) obj2);
                }
            });
            int i = Application.copydefault[recallNotificationTypeAEQbTJ.ordinal()];
            if (i == 1) {
                SPUtils.put("recall_notification_current_resend_count", java.lang.Long.valueOf(l.longValue() + 1));
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            pUU.KWHzl("KYCDeepLinkHandler", "Recall notification clicked with type: " + recallNotificationTypeAEQbTJ.getValue());
        }
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(context);
        if (activityOLrzqt == null) {
            activityOLrzqt = C54819xWm.KWHzl().AEQbTJ();
        }
        java.lang.Object systemService = context.getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
        Intrinsics.copydefault(systemService, "");
        android.app.ActivityManager activityManager = (android.app.ActivityManager) systemService;
        if (Build.VERSION.SDK_INT >= 26) {
            java.util.List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
            if (C33129mqd.KWHzl((java.util.Collection) appTasks)) {
                java.lang.String canonicalName = ActivityC42162rIq.class.getCanonicalName();
                android.content.ComponentName componentName = appTasks.get(0).getTaskInfo().topActivity;
                if (!Intrinsics.EZpvd((java.lang.Object) canonicalName, (java.lang.Object) (componentName != null ? componentName.getClassName() : null))) {
                    z = false;
                }
            }
        } else {
            java.util.List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
            if (C33129mqd.KWHzl((java.util.Collection) runningTasks)) {
                java.lang.String canonicalName2 = ActivityC42162rIq.class.getCanonicalName();
                android.content.ComponentName componentName2 = runningTasks.get(0).topActivity;
                if (!Intrinsics.EZpvd((java.lang.Object) canonicalName2, (java.lang.Object) (componentName2 != null ? componentName2.getClassName() : null))) {
                }
            }
        }
        if (activityOLrzqt == null || z || (rtu = (rTU) C43251rlk.OLrzqt(rTU.class)) == null) {
            return;
        }
        rtu.EZpvd(activityOLrzqt, map);
    }

    public static final Unit EZpvd(RecallNotificationType recallNotificationType, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "entry_source", recallNotificationType.getValue(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "user_action", "click", false, 4, null);
        EventParamsList.put$default(eventParamsList, "is_vpn", C33129mqd.gEmmrt(java.lang.Boolean.valueOf(C43396roW.EZpvd().AhwBna())), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "notification_permission_enabled", C33129mqd.gEmmrt(java.lang.Boolean.valueOf(C33625mzw.OLrzqt().OLrzqt(C32979mnm.EZpvd.OLrzqt()))), false, 4, null);
        return Unit.INSTANCE;
    }
}
