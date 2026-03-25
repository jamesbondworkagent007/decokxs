package com.okinc.business.defi.dapp.bridge;

import android.app.Activity;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.PendingIntentCompat;
import androidx.core.content.ContextCompat;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.base.utils.commmon.ThreadUtils;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.dapp.bridge.NotificationWork;
import com.okinc.components.track.TrackChannel;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43238rlX;
import o.C14923duc;
import o.C32866mlf;
import o.C33069mpW;
import o.C43251rlk;
import o.C52761wXj;
import o.C54819xWm;
import o.C55097xdX;
import o.C56390yDp;
import o.C56424yEw;
import o.C57656ymY;
import o.InterfaceC43294rma;
import o.dBQ;
import o.dLX;
import o.pTA;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class NotificationWork extends Worker {
    public Context KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationWork(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(workerParameters, "");
        this.KWHzl = context;
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        ThreadUtils.copydefault(new Runnable() { // from class: o.dsH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                NotificationWork.copydefault(this.EZpvd);
            }
        });
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        Intrinsics.checkNotNullExpressionValue(resultSuccess, "");
        return resultSuccess;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.dBQ.Activity.getIntent$default(o.dBQ$Activity, android.content.Context, com.okinc.business.defi.api.bean.PlatformItem, java.util.List, java.lang.String, java.lang.Long, kotlin.jvm.functions.Function0, boolean, boolean, java.lang.String, boolean, java.lang.String, int[], int, java.lang.Object):android.content.Intent */
    public static final void copydefault(NotificationWork notificationWork) {
        Intent intent$default;
        try {
            String string = notificationWork.getInputData().getString("title");
            final String string2 = notificationWork.getInputData().getString("dappUrl");
            long j = notificationWork.getInputData().getLong(CrashHianalyticsData.TIME, 0L);
            int i = notificationWork.getInputData().getInt("id", 0);
            String string3 = notificationWork.getInputData().getString("dappName");
            final boolean zValues = ((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class)).values(string2 == null ? "" : string2);
            if (zValues) {
                intent$default = Intent.parseUri(string2 == null ? "" : string2, 1);
                Intrinsics.copydefault(intent$default);
            } else {
                intent$default = dBQ.Activity.getIntent$default(dBQ.Companion, notificationWork.KWHzl, new PlatformItem(0L, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, string2 == null ? "" : string2, (String) null, 0L, 0, (String) null, (String) null, 16127, (DefaultConstructorMarker) null), C14923duc.EZpvd.isConnected(), null, null, null, false, false, null, true, null, null, 3576, null);
            }
            intent$default.setFlags(268435456);
            PendingIntent activity = PendingIntentCompat.getActivity(notificationWork.KWHzl, 0, intent$default, 134217728, !zValues);
            Intrinsics.checkNotNullExpressionValue(activity, "");
            NotificationCompat.Builder contentTitle = new NotificationCompat.Builder(notificationWork.KWHzl, "discover_notification").setContentTitle(string);
            Date date = new Date(j);
            OKDateEnum oKDateEnum = OKDateEnum.NONE;
            OKTimeEnum oKTimeEnum = OKTimeEnum.TIME_FORMAT_SIMPLE_HM;
            Notification notificationBuild = contentTitle.setContentText(pTA.format$default(date, oKDateEnum, oKTimeEnum, null, null, false, 28, null)).setSmallIcon(C52761wXj.TaskDescription.svhCHd).setAutoCancel(true).setChannelId("discover_notification").setPriority(1).setContentIntent(activity).build();
            Intrinsics.checkNotNullExpressionValue(notificationBuild, "");
            NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(notificationWork.KWHzl);
            Intrinsics.checkNotNullExpressionValue(notificationManagerCompatFrom, "");
            C32866mlf.onEvent$default("Notification_InAppPushNotification_Notification_View", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
            C57656ymY c57656ymY = C57656ymY.OLrzqt;
            final C55097xdX c55097xdX = new C55097xdX(notificationWork.KWHzl, null, 0, 6, null);
            c55097xdX.setState(2);
            c55097xdX.setLeadingIcon(AppCompatResources.getDrawable(c55097xdX.getContext(), C52761wXj.TaskDescription.zdxASf));
            if (string == null) {
                string = "";
            }
            c55097xdX.setTitle(string);
            if (string3 == null || string3.length() == 0) {
                string3 = C14923duc.EZpvd.KWHzl(string2 == null ? "" : string2);
            }
            Resources resources = c55097xdX.getContext().getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            c55097xdX.setMessage(C33069mpW.copydefault(resources, dLX.Dialog.QSLkRj, (Map<String, ? extends Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("hm", pTA.format$default(new Date(j), oKDateEnum, oKTimeEnum, null, null, false, 28, null)), C56390yDp.OLrzqt("host", string3))));
            c55097xdX.OLrzqt().setClickable(true);
            dBQ.Activity activity2 = dBQ.Companion;
            Context context = c55097xdX.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            final Intent intent$default2 = dBQ.Activity.getIntent$default(activity2, context, new PlatformItem(0L, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, string2 == null ? "" : string2, (String) null, 0L, 0, (String) null, (String) null, 16127, (DefaultConstructorMarker) null), C14923duc.EZpvd.isConnected(), null, null, null, false, false, null, false, null, null, 3576, null);
            intent$default2.setFlags(268435456);
            c55097xdX.OLrzqt().setOnClickListener(new View.OnClickListener() { // from class: o.dsO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    NotificationWork.KWHzl(zValues, string2, c55097xdX, intent$default2, view);
                }
            });
            C57656ymY.showNotificationViewWithToast$default(c57656ymY, c55097xdX, 0L, 0, 0, 0, 30, null);
            if (ContextCompat.checkSelfPermission(notificationWork.KWHzl, "android.permission.POST_NOTIFICATIONS") != 0) {
                return;
            }
            notificationManagerCompatFrom.notify(i, notificationBuild);
            C32866mlf.onEvent$default("Notification_DevicePushNotification_Notification_View", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
        } catch (Exception e) {
            String message = e.getMessage();
            pUU.copydefault("NotificationWork error", message != null ? message : "");
        }
    }

    public static final void KWHzl(boolean z, String str, C55097xdX c55097xdX, Intent intent, View view) {
        if (z) {
            InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
            Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            Intrinsics.checkNotNullExpressionValue(activityAEQbTJ, "");
            InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, activityAEQbTJ, str == null ? "" : str, null, new Function1() { // from class: o.dsM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return NotificationWork.KWHzl((AbstractC43238rlX) obj);
                }
            }, 4, null);
        } else {
            c55097xdX.getContext().startActivity(intent);
        }
        C32866mlf.onEvent$default("Notification_InAppPushNotification_Notification_Click", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
    }

    public static final Unit KWHzl(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }
}
