package o;

import android.os.Build;
import androidx.browser.trusted.NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.util.NotificationUtil$$ExternalSyntheticApiModelOutline1;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.im.imui.messages.audio.call.OKIMAudioCallViewActivity;
import com.okinc.im.imui.messages.audio.call.model.CallRequest;
import com.okinc.im.imui.messages.audio.call.service.AudioCallNotificationHelper$fetchDisplayName$2;
import com.okinc.im.imui.messages.audio.call.service.AudioCallNotificationHelper$showCallNotification$1;
import com.okinc.im.imui.messages.audio.call.service.AudioCallNotificationHelper$showNotificationWithName$2;
import com.okinc.okimcore.model.im.AudioCallStatus;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ooc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37161ooc {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final java.lang.String AEQbTJ;
    public final int AYXKKw;
    public android.app.NotificationManager AhwBna;
    public int EZpvd;
    public volatile int KWHzl;
    public final java.lang.String copydefault;
    public final android.app.Service djBIcL;

    public C37161ooc(@NotNull android.app.Service service, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(service, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.djBIcL = service;
        this.copydefault = str;
        this.AEQbTJ = str2;
        this.AYXKKw = i;
        this.EZpvd = 4000;
    }

    /* JADX INFO: renamed from: o.ooc$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ooc.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final java.lang.Integer AEQbTJ() {
        int iIntValue = ((java.lang.Number) C33084mpl.OLrzqt("NOTIFY_SMALL_ICON2", -1)).intValue();
        if (iIntValue != -1) {
            return java.lang.Integer.valueOf(iIntValue);
        }
        return null;
    }

    public final void EZpvd() {
        java.lang.Object systemService = this.djBIcL.getSystemService(RemoteMessageConst.NOTIFICATION);
        Intrinsics.copydefault(systemService, "");
        this.AhwBna = (android.app.NotificationManager) systemService;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationUtil$$ExternalSyntheticApiModelOutline1.m();
            android.app.NotificationChannel notificationChannelM = NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m(this.copydefault, this.AEQbTJ, 4);
            notificationChannelM.enableLights(true);
            notificationChannelM.setLightColor(-16711936);
            notificationChannelM.enableVibration(false);
            notificationChannelM.setSound(null, null);
            notificationChannelM.setLockscreenVisibility(1);
            android.app.NotificationManager notificationManager = this.AhwBna;
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannelM);
            }
        }
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationCompat.Builder builder = new NotificationCompat.Builder(this.djBIcL.getApplicationContext(), this.copydefault);
            builder.setContentTitle(C33070mpX.AYXKKw(C35399nuc.LoaderManager.zFZsbn));
            builder.setContentText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.zFZsbn));
            builder.setDefaults(-1);
            builder.setAutoCancel(true);
            builder.setShowWhen(true);
            java.lang.Integer numAEQbTJ = AEQbTJ();
            if (numAEQbTJ != null) {
                builder.setSmallIcon(numAEQbTJ.intValue());
            }
            try {
                Result.Application application = Result.Companion;
                C35276nsK c35276nsK = C35276nsK.OLrzqt;
                android.app.Service service = this.djBIcL;
                int i = this.EZpvd;
                android.app.Notification notificationBuild = builder.build();
                Intrinsics.checkNotNullExpressionValue(notificationBuild, "");
                c35276nsK.KWHzl(service, i, notificationBuild);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                C44124sEe.fIwbmz("NotificationHelper:showPlaceholderForegroundNotification conversationId[" + str + "] remoteUserId[" + str2 + "] failed to start foreground", thM7380exceptionOrNullimpl);
                this.djBIcL.stopForeground(1);
            }
        }
    }

    public final void KWHzl(@NotNull CoroutineScope coroutineScope, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull CallRequest callRequest, @NotNull InterfaceC35259nru interfaceC35259nru, @NotNull Function0<java.lang.Boolean> function0, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(callRequest, "");
        Intrinsics.checkNotNullParameter(interfaceC35259nru, "");
        Intrinsics.checkNotNullParameter(function0, "");
        android.app.NotificationManager notificationManager = this.AhwBna;
        if (notificationManager != null) {
            notificationManager.cancel(this.EZpvd);
        }
        this.djBIcL.stopForeground(true);
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
            C44124sEe.imLogVoiceCall$default("NotificationHelper:showCallNotification no conversation/remote user id, stopping service...", null, 2, null);
            this.djBIcL.stopSelf();
        } else {
            android.app.PendingIntent pendingIntentEZpvd = EZpvd(callRequest);
            this.KWHzl++;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AudioCallNotificationHelper$showCallNotification$1(this, str, str2, z, str3, this.KWHzl, pendingIntentEZpvd, interfaceC35259nru, function0, null), 3, null);
        }
    }

    public final android.app.PendingIntent EZpvd(CallRequest callRequest) {
        android.content.Intent intentCopydefault = OKIMAudioCallViewActivity.Companion.copydefault(this.djBIcL, callRequest);
        intentCopydefault.putExtra("key_is_from_notification", true);
        intentCopydefault.putExtra("notification_action", "action_audio_call_resume");
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(this.djBIcL, this.AYXKKw, intentCopydefault, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "");
        return activity;
    }

    public static /* synthetic */ java.lang.Object fetchDisplayName$default(C37161ooc c37161ooc, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        return c37161ooc.copydefault(str, str2, z, str3, continuation);
    }

    public final java.lang.Object copydefault(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, Continuation<? super java.lang.String> continuation) {
        return BuildersKt.withContext(sDN.copydefault.copydefault(), new AudioCallNotificationHelper$fetchDisplayName$2(z, str, str2, str3, null), continuation);
    }

    public final java.lang.Object EZpvd(java.lang.String str, android.app.PendingIntent pendingIntent, java.lang.String str2, java.lang.String str3, boolean z, InterfaceC35259nru interfaceC35259nru, Function0<java.lang.Boolean> function0, Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(sDN.copydefault.AEQbTJ(), new AudioCallNotificationHelper$showNotificationWithName$2(this, str, interfaceC35259nru, function0, pendingIntent, str2, str3, z, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> copydefault(java.lang.String str, InterfaceC35259nru interfaceC35259nru) {
        if (interfaceC35259nru.OLrzqt().getFirst() == AudioCallStatus.CallInComing) {
            return C56390yDp.OLrzqt(C33069mpW.copydefault(C35399nuc.LoaderManager.ArkbYM, C56423yEv.EZpvd(C56390yDp.OLrzqt("okim_audio_call_notify_name", str))), "");
        }
        return C56390yDp.OLrzqt(str, C33070mpX.AYXKKw(C35399nuc.LoaderManager.zFZsbn));
    }

    public static /* synthetic */ android.app.Notification buildNotification$default(C37161ooc c37161ooc, java.lang.String str, java.lang.String str2, android.app.PendingIntent pendingIntent, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return c37161ooc.OLrzqt(str, str2, pendingIntent, z);
    }

    public final android.app.Notification OLrzqt(java.lang.String str, java.lang.String str2, android.app.PendingIntent pendingIntent, boolean z) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this.djBIcL.getApplicationContext(), this.copydefault);
        builder.setContentTitle(str);
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
            builder.setContentText(str2);
        }
        java.lang.Integer numAEQbTJ = AEQbTJ();
        if (numAEQbTJ != null) {
            builder.setSmallIcon(numAEQbTJ.intValue());
        }
        builder.setAutoCancel(false);
        builder.setWhen(java.lang.System.currentTimeMillis());
        builder.setContentIntent(pendingIntent);
        if (z) {
            builder.setPriority(-1);
        }
        android.app.Notification notificationBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(notificationBuild, "");
        return notificationBuild;
    }

    public final void KWHzl(android.app.Notification notification, boolean z, java.lang.String str, java.lang.String str2) {
        java.lang.Object objM7377constructorimpl;
        if (z) {
            copydefault(str, str2);
            android.app.NotificationManager notificationManager = this.AhwBna;
            if (notificationManager != null) {
                int i = this.EZpvd + 1;
                this.EZpvd = i;
                notificationManager.notify(i, notification);
                return;
            }
            return;
        }
        try {
            Result.Application application = Result.Companion;
            C35276nsK c35276nsK = C35276nsK.OLrzqt;
            android.app.Service service = this.djBIcL;
            int i2 = this.EZpvd + 1;
            this.EZpvd = i2;
            c35276nsK.KWHzl(service, i2, notification);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44124sEe.fIwbmz("NotificationHelper:displayNotification failed to start foreground", thM7380exceptionOrNullimpl);
        }
        Result.m7376boximpl(objM7377constructorimpl);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C44124sEe.imLogVoiceCall$default("NotificationHelper:dismissNotification conversationId[" + str + "] remoteUserId[" + str2 + "] notificationId[" + this.EZpvd + "]", null, 2, null);
        java.lang.Object systemService = this.djBIcL.getSystemService(RemoteMessageConst.NOTIFICATION);
        Intrinsics.copydefault(systemService, "");
        ((android.app.NotificationManager) systemService).cancel(this.EZpvd);
    }
}
