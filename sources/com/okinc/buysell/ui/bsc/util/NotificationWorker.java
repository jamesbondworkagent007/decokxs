package com.okinc.buysell.ui.bsc.util;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.browser.trusted.NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.android.exoplayer2.util.NotificationUtil$$ExternalSyntheticApiModelOutline1;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.okpaymentapi.data.remote.model.management.OrderFrequency;
import com.okinc.okpaymentapi.data.remote.model.management.OrderType;
import com.okinc.okx.paymentapi.service.BuySellConvertParameters;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import com.okinc.okx.paymentapi.service.TargetTab;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.C31354lsT;
import o.C33069mpW;
import o.C33070mpX;
import o.C46880tfX;
import o.C46881tfY;
import o.C46942tgg;
import o.C56390yDp;
import o.C56423yEv;
import o.lAF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class NotificationWorker extends CoroutineWorker {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final Context OLrzqt;
    public final WorkerParameters copydefault;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.bsc.util.NotificationWorker.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(workerParameters, "");
        this.OLrzqt = context;
        this.copydefault = workerParameters;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationUtil$$ExternalSyntheticApiModelOutline1.m();
            NotificationChannel notificationChannelM = NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m("local_notification_channel", "simple trade channel", 3);
            notificationChannelM.setDescription("simple trade push notification channel");
            Object systemService = getApplicationContext().getSystemService(RemoteMessageConst.NOTIFICATION);
            Intrinsics.copydefault(systemService, "");
            ((NotificationManager) systemService).createNotificationChannel(notificationChannelM);
        }
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(@NotNull Continuation<? super ListenableWorker.Result> continuation) {
        OrderType orderTypeKWHzl;
        OrderFrequency orderFrequencyAEQbTJ;
        String string = this.copydefault.getInputData().getString("baseCurrency");
        String string2 = this.copydefault.getInputData().getString("orderType");
        String string3 = this.copydefault.getInputData().getString("orderFrequency");
        if (string != null) {
            C31354lsT.KWHzl.KWHzl(Intrinsics.EZpvd((Object) string2, (Object) OrderType.RECURRING.getTxt()) ? "recurring" : "one_time");
            if (string2 == null || (orderTypeKWHzl = C46881tfY.KWHzl(string2)) == null) {
                orderTypeKWHzl = OrderType.ONE_TIME;
            }
            if (string3 == null || (orderFrequencyAEQbTJ = C46880tfX.AEQbTJ(string3)) == null) {
                orderFrequencyAEQbTJ = OrderFrequency.NO_FREQ;
            }
            copydefault(string, orderTypeKWHzl, orderFrequencyAEQbTJ);
        }
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        Intrinsics.checkNotNullExpressionValue(resultSuccess, "");
        return resultSuccess;
    }

    public final void copydefault(String str, OrderType orderType, OrderFrequency orderFrequency) {
        OKPaymentSource oKPaymentSource;
        OrderType orderType2;
        String strOLrzqt;
        String strAYXKKw;
        Intent intent = new Intent(getApplicationContext(), (Class<?>) lAF.class);
        intent.setFlags(536870912);
        OrderType orderType3 = OrderType.RECURRING;
        if (orderType == orderType3) {
            oKPaymentSource = OKPaymentSource.PUSH_NOTIFICATION_RECURRING;
        } else {
            oKPaymentSource = OKPaymentSource.PUSH_NOTIFICATION;
        }
        intent.putExtra("buy_sell_convert_params", new BuySellConvertParameters(oKPaymentSource, TargetTab.BUY, str, null, null, null, null, null, orderType, orderFrequency, orderFrequency.getTxt(), null, 2296, null));
        PendingIntent activity = PendingIntent.getActivity(getApplicationContext(), 0, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "");
        NotificationCompat.Builder smallIcon = new NotificationCompat.Builder(getApplicationContext(), "local_notification_channel").setSmallIcon(C46942tgg.Application.KWHzl);
        if (orderType == orderType3) {
            orderType2 = orderType;
            strOLrzqt = C33069mpW.OLrzqt(C33070mpX.AYXKKw(C31351lsQ.Activity.QkdxfA), C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, str)));
        } else {
            orderType2 = orderType;
            strOLrzqt = C33069mpW.OLrzqt(C33070mpX.AYXKKw(C31351lsQ.Activity.QHmsKR), C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, str)));
        }
        NotificationCompat.Builder contentTitle = smallIcon.setContentTitle(strOLrzqt);
        if (orderType2 == orderType3) {
            strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.ffGIBT);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.RKDWNf);
        }
        NotificationCompat.Builder autoCancel = contentTitle.setContentText(strAYXKKw).setContentIntent(activity).setAutoCancel(true);
        Intrinsics.checkNotNullExpressionValue(autoCancel, "");
        NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(getApplicationContext());
        if (ContextCompat.checkSelfPermission(this.OLrzqt, "android.permission.POST_NOTIFICATIONS") != 0) {
            return;
        }
        notificationManagerCompatFrom.notify(1, autoCancel.build());
    }
}
