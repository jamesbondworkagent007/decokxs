package com.okinc.oklive.app.ui.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import androidx.browser.trusted.NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.exoplayer2.util.NotificationUtil$$ExternalSyntheticApiModelOutline1;
import com.okinc.oklive.app.ui.list.displaymodel.LiveFloatingWindowUIState;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C33084mpl;
import o.C44564sUp;
import o.pUU;
import o.sVd;
import o.sWj;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class LiveFloatingWindowService extends sVd {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public LiveFloatingWindowUIState KWHzl;
    public volatile boolean djBIcL;

    @yCM
    public C44564sUp floatingWindowManager;

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.oklive.app.ui.service.LiveFloatingWindowService.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void KWHzl(@NotNull Context context, @NotNull LiveFloatingWindowUIState liveFloatingWindowUIState) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(liveFloatingWindowUIState, "");
            pUU.EZpvd("LiveFloatingWindowService", "start: Starting service with uiState=" + liveFloatingWindowUIState);
            Intent intent = new Intent(context, (Class<?>) LiveFloatingWindowService.class);
            intent.putExtra("extra_action", "action_start");
            intent.putExtra("extra_ui_state", liveFloatingWindowUIState);
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(intent);
            } else {
                context.startService(intent);
            }
        }

        public final void EZpvd(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            pUU.EZpvd("LiveFloatingWindowService", "stop: Stopping service");
            Intent intent = new Intent(context, (Class<?>) LiveFloatingWindowService.class);
            intent.putExtra("extra_action", "action_stop");
            context.startService(intent);
        }
    }

    public final C44564sUp AYXKKw() {
        C44564sUp c44564sUp = this.floatingWindowManager;
        if (c44564sUp != null) {
            return c44564sUp;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.sVd, androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        pUU.EZpvd("LiveFloatingWindowService", "onCreate: Service created");
        OLrzqt();
        djBIcL();
    }

    public final void djBIcL() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new LiveFloatingWindowService$setupUserEventObserver$1(this, null), 3, null);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        LiveFloatingWindowUIState liveFloatingWindowUIState;
        super.onStartCommand(intent, i, i2);
        pUU.EZpvd("LiveFloatingWindowService", "onStartCommand: intent=" + intent + ", flags=" + i + ", startId=" + i2);
        String stringExtra = intent != null ? intent.getStringExtra("extra_action") : null;
        if (stringExtra != null) {
            int iHashCode = stringExtra.hashCode();
            if (iHashCode != 1497628246) {
                if (iHashCode != 1583723627) {
                    if (iHashCode == 1850778905 && stringExtra.equals("action_start")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            liveFloatingWindowUIState = (LiveFloatingWindowUIState) intent.getParcelableExtra("extra_ui_state", LiveFloatingWindowUIState.class);
                        } else {
                            liveFloatingWindowUIState = (LiveFloatingWindowUIState) intent.getParcelableExtra("extra_ui_state");
                        }
                        if (liveFloatingWindowUIState != null) {
                            this.KWHzl = liveFloatingWindowUIState;
                            AEQbTJ(liveFloatingWindowUIState);
                            EZpvd(liveFloatingWindowUIState);
                            return 3;
                        }
                        pUU.copydefault("LiveFloatingWindowService", "onStartCommand: UI state is null, stopping service");
                        stopSelf();
                        return 3;
                    }
                } else if (stringExtra.equals("action_stop")) {
                    gEmmrt();
                    return 3;
                }
            } else if (stringExtra.equals("action_resume")) {
                valueOf();
                return 3;
            }
        }
        pUU.valueOf("LiveFloatingWindowService", "onStartCommand: Unknown action, stopping service");
        stopSelf();
        return 3;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public IBinder onBind(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        super.onBind(intent);
        return null;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        pUU.EZpvd("LiveFloatingWindowService", "onTaskRemoved: App removed from recent apps, stopping service");
        gEmmrt();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        pUU.EZpvd("LiveFloatingWindowService", "onDestroy: Service destroyed");
        synchronized (this) {
            this.djBIcL = false;
            Unit unit = Unit.INSTANCE;
        }
        super.onDestroy();
    }

    public final void AEQbTJ(LiveFloatingWindowUIState liveFloatingWindowUIState) {
        try {
            startForeground(1001, KWHzl(liveFloatingWindowUIState));
            pUU.EZpvd("LiveFloatingWindowService", "startForegroundWithNotification: Service started in foreground");
        } catch (Exception e) {
            pUU.AEQbTJ("LiveFloatingWindowService", "startForegroundWithNotification: Failed to start foreground", e);
            stopSelf();
        }
    }

    public final Notification KWHzl(LiveFloatingWindowUIState liveFloatingWindowUIState) {
        Intent intent = new Intent(this, (Class<?>) LiveFloatingWindowService.class);
        intent.putExtra("extra_action", "action_resume");
        PendingIntent service = PendingIntent.getService(this, 0, intent, 201326592);
        Intent intent2 = new Intent(this, (Class<?>) LiveFloatingWindowService.class);
        intent2.putExtra("extra_action", "action_stop");
        PendingIntent service2 = PendingIntent.getService(this, 1, intent2, 201326592);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "live_floating_window_channel");
        String strCopydefault = liveFloatingWindowUIState.copydefault();
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        Notification notificationBuild = builder.setContentTitle(strCopydefault).setContentText(getString(sWj.Activity.uzCIH)).setSmallIcon(AhwBna()).setContentIntent(service).setDeleteIntent(service2).setOngoing(false).setAutoCancel(true).setPriority(-2).setCategory("service").setShowWhen(false).setSound(null).setVibrate(null).setOnlyAlertOnce(true).build();
        Intrinsics.checkNotNullExpressionValue(notificationBuild, "");
        return notificationBuild;
    }

    public final int AhwBna() {
        int iIntValue = ((Number) C33084mpl.OLrzqt("NOTIFY_SMALL_ICON2", -1)).intValue();
        if (iIntValue != -1) {
            return iIntValue;
        }
        return -1;
    }

    public final void OLrzqt() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationUtil$$ExternalSyntheticApiModelOutline1.m();
            NotificationChannel notificationChannelM = NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m("live_floating_window_channel", "Live Floating Window", 1);
            notificationChannelM.setShowBadge(false);
            notificationChannelM.setSound(null, null);
            notificationChannelM.enableVibration(false);
            notificationChannelM.enableLights(false);
            NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannelM);
            }
            pUU.EZpvd("LiveFloatingWindowService", "createNotificationChannel: Minimal notification channel created");
        }
    }

    public final void EZpvd(LiveFloatingWindowUIState liveFloatingWindowUIState) {
        try {
            pUU.EZpvd("LiveFloatingWindowService", "showFloatingWindow: Showing floating window with uiState=" + liveFloatingWindowUIState);
            C44564sUp c44564sUpAYXKKw = AYXKKw();
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            c44564sUpAYXKKw.AEQbTJ(applicationContext, liveFloatingWindowUIState);
        } catch (Exception e) {
            pUU.AEQbTJ("LiveFloatingWindowService", "showFloatingWindow: Failed to show floating window", e);
            stopSelf();
        }
    }

    public final void valueOf() {
        LiveFloatingWindowUIState liveFloatingWindowUIState = this.KWHzl;
        String strEZpvd = liveFloatingWindowUIState != null ? liveFloatingWindowUIState.EZpvd() : null;
        if (strEZpvd == null || strEZpvd.length() == 0) {
            pUU.copydefault("LiveFloatingWindowService", "resumeLiveActivity: shareCode is null or empty, cannot resume");
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("IS_MUTED", Boolean.valueOf(liveFloatingWindowUIState.OLrzqt()));
        if (liveFloatingWindowUIState instanceof LiveFloatingWindowUIState.Recording) {
            linkedHashMap.put("RECORDING_POSITION", Long.valueOf(((LiveFloatingWindowUIState.Recording) liveFloatingWindowUIState).KWHzl()));
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new LiveFloatingWindowService$resumeLiveActivity$2(this, strEZpvd, liveFloatingWindowUIState, linkedHashMap, null), 3, null);
    }

    public final void gEmmrt() {
        synchronized (this) {
            if (this.djBIcL) {
                pUU.valueOf("LiveFloatingWindowService", "stopService: Already stopping, ignoring duplicate call");
                return;
            }
            this.djBIcL = true;
            Unit unit = Unit.INSTANCE;
            pUU.EZpvd("LiveFloatingWindowService", "stopService: Stopping service and hiding floating window");
            try {
                AYXKKw().AEQbTJ();
            } catch (Exception e) {
                pUU.AEQbTJ("LiveFloatingWindowService", "stopService: Failed to hide floating window", e);
            }
            stopForeground(1);
            stopSelf();
        }
    }

    @Override // o.sVd, androidx.lifecycle.LifecycleService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
