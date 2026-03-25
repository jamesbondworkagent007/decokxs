package com.okinc.okpush.sdk.init;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okpush.sdk.config.OKPushConfig;
import com.okinc.okpush.sdk.init.PushInitManager;
import com.okinc.okpush.sdk.net.bean.PushBindReqInfo;
import com.okinc.okpush.sdk.net.bean.PushChannelInfo;
import com.okinc.okpush.sdk.net.service.PushApiService;
import com.okinc.rxutils.RxBus;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import o.AbstractC58185ywX;
import o.C32866mlf;
import o.C33490mxT;
import o.C33527myD;
import o.C34703nhO;
import o.C43292rmY;
import o.C43308rmo;
import o.C46915tgF;
import o.C46917tgH;
import o.C46919tgJ;
import o.C46926tgQ;
import o.C46934tgY;
import o.C46935tgZ;
import o.C46992thd;
import o.C46993the;
import o.C46994thf;
import o.C46996thh;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.C56444yFp;
import o.InterfaceC46921tgL;
import o.InterfaceC46958tgw;
import o.InterfaceC56445yFq;
import o.pUU;
import o.xVW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class PushInitManager implements InterfaceC46958tgw {
    public static final int AEQbTJ;
    public static CoroutineScope AYXKKw;
    public static InterfaceC46921tgL AhwBna;
    public static long AkhnZx;
    public static boolean EZpvd;
    public static volatile boolean copydefault;
    public static PushBindReqInfo djBIcL;
    public static long gEmmrt;
    public static Handler isConnected;
    public static Map<String, Object> valueOf;
    public static final PushInitManager OLrzqt = new PushInitManager();
    public static final Map<String, Integer> KWHzl = new ConcurrentHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46958tgw
    public void copydefault() {
        EZpvd = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC46921tgL valueOf() {
        return AhwBna;
    }

    private PushInitManager() {
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        AkhnZx = timeUnit.toMillis(10L);
        isConnected = new Handler(Looper.getMainLooper());
        gEmmrt = timeUnit.toMillis(30L);
        valueOf = new ConcurrentHashMap();
        AYXKKw = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
        AEQbTJ = 8;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PushInfoReqType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ PushInfoReqType[] $VALUES;
        public static final PushInfoReqType BIND = new PushInfoReqType("BIND", 0);
        public static final PushInfoReqType UNBIND = new PushInfoReqType("UNBIND", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ PushInfoReqType[] $values() {
            return new PushInfoReqType[]{BIND, UNBIND};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<PushInfoReqType> getEntries() {
            return $ENTRIES;
        }

        private PushInfoReqType(String str, int i) {
        }

        static {
            PushInfoReqType[] pushInfoReqTypeArr$values = $values();
            $VALUES = pushInfoReqTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(pushInfoReqTypeArr$values);
        }

        public static PushInfoReqType valueOf(String str) {
            return (PushInfoReqType) Enum.valueOf(PushInfoReqType.class, str);
        }

        public static PushInfoReqType[] values() {
            return (PushInfoReqType[]) $VALUES.clone();
        }
    }

    @Override // o.InterfaceC46958tgw
    public void EZpvd(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        pUU.KWHzl("PushInitManager", "package: " + C34703nhO.KWHzl(context) + ",country:" + C46935tgZ.KWHzl.AEQbTJ());
        values();
        fetchVPNInfo();
        BuildersKt__Builders_commonKt.launch$default(AYXKKw, null, null, new PushInitManager$init$1(context, null), 3, null);
    }

    public final void KWHzl(Context context) {
        copydefault(context);
        isConnected();
        copydefault = true;
    }

    public final void ejfBZ() {
        if (AYXKKw()) {
            AkhnZx();
            DbNXlk();
        }
    }

    public final void EZpvd() {
        if (EZpvd) {
            OLrzqt("BIND_FROM_INIT");
        }
    }

    public final void DbNXlk() {
        C32866mlf.EZpvd("detect_country", new TrackChannel[]{TrackChannel.OKStatistics}, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.tgv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return PushInitManager.EZpvd((EventParamsList) obj);
            }
        });
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        OLrzqt.KWHzl(eventParamsList);
        return Unit.INSTANCE;
    }

    @VisibleForTesting
    public final void KWHzl(@NotNull EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        OKPushConfig oKPushConfig = OKPushConfig.copydefault;
        EventParamsList.put$default(eventParamsList, "notification_enable", String.valueOf(NotificationManagerCompat.from(oKPushConfig.copydefault()).areNotificationsEnabled()), false, 4, null);
        if (C46996thh.KWHzl.copydefault(oKPushConfig.copydefault())) {
            EventParamsList.put$default(eventParamsList, "fcm_supported", "true", false, 4, null);
        } else {
            EventParamsList.put$default(eventParamsList, "fcm_supported", "false", false, 4, null);
        }
        C46935tgZ c46935tgZ = C46935tgZ.KWHzl;
        if (c46935tgZ.OLrzqt()) {
            EventParamsList.put$default(eventParamsList, "hms_supported", "true", false, 4, null);
        } else {
            EventParamsList.put$default(eventParamsList, "hms_supported", "false", false, 4, null);
        }
        C46915tgF c46915tgFAEQbTJ = c46935tgZ.AEQbTJ();
        if (c46915tgFAEQbTJ != null) {
            EventParamsList.put$default(eventParamsList, "detect_country", c46915tgFAEQbTJ.EZpvd(), false, 4, null);
            EventParamsList.put$default(eventParamsList, "detect_country_reliable", String.valueOf(C46917tgH.OLrzqt(c46915tgFAEQbTJ)), false, 4, null);
        }
        InterfaceC46921tgL interfaceC46921tgL = AhwBna;
        String strEZpvd = interfaceC46921tgL != null ? interfaceC46921tgL.EZpvd() : null;
        EventParamsList.put$default(eventParamsList, "pushTokenNull", String.valueOf(strEZpvd == null || strEZpvd.length() == 0), false, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(@NotNull Context context, @NotNull Continuation<? super Boolean> continuation) throws Throwable {
        PushInitManager$shouldUseOneSignal$1 pushInitManager$shouldUseOneSignal$1;
        PushInitManager pushInitManager;
        if (continuation instanceof PushInitManager$shouldUseOneSignal$1) {
            pushInitManager$shouldUseOneSignal$1 = (PushInitManager$shouldUseOneSignal$1) continuation;
            int i = pushInitManager$shouldUseOneSignal$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pushInitManager$shouldUseOneSignal$1.label = i - Integer.MIN_VALUE;
            } else {
                pushInitManager$shouldUseOneSignal$1 = new PushInitManager$shouldUseOneSignal$1(this, continuation);
            }
        }
        Object objWithContext = pushInitManager$shouldUseOneSignal$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = pushInitManager$shouldUseOneSignal$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            PushInitManager$shouldUseOneSignal$channel$1 pushInitManager$shouldUseOneSignal$channel$1 = new PushInitManager$shouldUseOneSignal$channel$1(null);
            pushInitManager$shouldUseOneSignal$1.L$0 = this;
            pushInitManager$shouldUseOneSignal$1.L$1 = context;
            pushInitManager$shouldUseOneSignal$1.label = 1;
            objWithContext = BuildersKt.withContext(main, pushInitManager$shouldUseOneSignal$channel$1, pushInitManager$shouldUseOneSignal$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            pushInitManager = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objWithContext);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = (Context) pushInitManager$shouldUseOneSignal$1.L$1;
            pushInitManager = (PushInitManager) pushInitManager$shouldUseOneSignal$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        Integer num = (Integer) objWithContext;
        if (num != null && num.intValue() == 1) {
            return C56443yFo.KWHzl(true);
        }
        if (num != null && num.intValue() == 2) {
            return C56443yFo.KWHzl(false);
        }
        if (C34703nhO.AEQbTJ()) {
            return C56443yFo.KWHzl(true);
        }
        if (pushInitManager.AhwBna()) {
            return C56443yFo.KWHzl(true);
        }
        C46935tgZ c46935tgZ = C46935tgZ.KWHzl;
        if (C46917tgH.EZpvd(c46935tgZ.AEQbTJ())) {
            return C56443yFo.KWHzl(false);
        }
        if (C46917tgH.AEQbTJ(c46935tgZ.AEQbTJ())) {
            C46996thh c46996thh = C46996thh.KWHzl;
            pushInitManager$shouldUseOneSignal$1.L$0 = null;
            pushInitManager$shouldUseOneSignal$1.L$1 = null;
            pushInitManager$shouldUseOneSignal$1.label = 2;
            objWithContext = c46996thh.AEQbTJ(context, pushInitManager$shouldUseOneSignal$1);
            return objWithContext == objCopydefault ? objCopydefault : objWithContext;
        }
        return C56443yFo.KWHzl(C46996thh.KWHzl.copydefault(context));
    }

    public final void isConnected() {
        if (AYXKKw()) {
            C32866mlf.EZpvd("fallback_to_jpush", new TrackChannel[]{TrackChannel.OKStatistics}, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.tgA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return PushInitManager.OLrzqt((EventParamsList) obj);
                }
            });
        }
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        OLrzqt.KWHzl(eventParamsList);
        return Unit.INSTANCE;
    }

    @VisibleForTesting
    public final void AkhnZx() {
        pUU.KWHzl("PushInitManager", "begin trackFcmTokenStat, success, thread: " + Thread.currentThread());
        try {
            Intrinsics.copydefault(FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: o.tgB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    PushInitManager.OLrzqt(task);
                }
            }));
        } catch (Throwable th) {
            pUU.EZpvd("PushInitManager", ", thread: " + Thread.currentThread() + ", error: " + th);
        }
    }

    public static final void OLrzqt(Task task) {
        Intrinsics.checkNotNullParameter(task, "");
        OLrzqt.EZpvd(task.isSuccessful());
        if (!task.isSuccessful()) {
            pUU.OLrzqt("PushInitManager", "trackFcmTokenStat,Fetching FCM registration token failed", task.getException());
            return;
        }
        pUU.KWHzl("PushInitManager", "trackFcmTokenStat, success,token:" + ((String) task.getResult()));
    }

    public final void EZpvd(final boolean z) {
        C32866mlf.EZpvd("fcm_token_getting_result", new TrackChannel[]{TrackChannel.OKStatistics}, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.tgz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return PushInitManager.copydefault(z, (EventParamsList) obj);
            }
        });
    }

    public static final Unit copydefault(boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "isSuccess", String.valueOf(z), false, 4, null);
        InterfaceC46921tgL interfaceC46921tgL = AhwBna;
        if (interfaceC46921tgL != null) {
            EventParamsList.put$default(eventParamsList, "pushChannel", interfaceC46921tgL.OLrzqt(), false, 4, null);
            EventParamsList.put$default(eventParamsList, "pushTokenNull", interfaceC46921tgL.EZpvd(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final boolean AhwBna() {
        return C46935tgZ.KWHzl.OLrzqt() && (OKPushConfig.copydefault.AhwBna() || C34703nhO.copydefault());
    }

    @VisibleForTesting
    public final void AhwBna(@NotNull final Context context) {
        C46915tgF c46915tgFAEQbTJ;
        Intrinsics.checkNotNullParameter(context, "");
        if (copydefault || C34703nhO.AEQbTJ()) {
            return;
        }
        C46935tgZ c46935tgZ = C46935tgZ.KWHzl;
        if (c46935tgZ.OLrzqt() || (c46915tgFAEQbTJ = c46935tgZ.AEQbTJ()) == null || !C46917tgH.AEQbTJ(c46915tgFAEQbTJ)) {
            return;
        }
        isConnected.postDelayed(new Runnable() { // from class: o.tgC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                PushInitManager.OLrzqt(context);
            }
        }, gEmmrt);
    }

    public static final void OLrzqt(Context context) {
        Object objM7377constructorimpl;
        PushInitManager pushInitManager = OLrzqt;
        try {
            Result.Application application = Result.Companion;
            if (!copydefault) {
                boolean zDjBIcL = pushInitManager.djBIcL();
                pUU.KWHzl("PushInitManager", "OneSignal watchdog check => operational=" + zDjBIcL);
                if (!zDjBIcL) {
                    pushInitManager.KWHzl(FallbackReason.ONE_SIGNAL_WATCHDOG_TIMEOUT, "OneSignal not operational within " + gEmmrt + " ms");
                    pUU.valueOf("PushInitManager", "OneSignal not operational within " + gEmmrt + " ms, fallback to JPush");
                    pushInitManager.copydefault(context);
                    pushInitManager.isConnected();
                    copydefault = true;
                    InterfaceC46921tgL interfaceC46921tgL = AhwBna;
                    if (interfaceC46921tgL != null) {
                        interfaceC46921tgL.AEQbTJ();
                    }
                    pushInitManager.EZpvd();
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.valueOf("PushInitManager", "OneSignal watchdog failed: " + thM7380exceptionOrNullimpl);
        }
    }

    @VisibleForTesting
    public final void KWHzl(@NotNull FallbackReason fallbackReason, @NotNull String str) {
        Intrinsics.checkNotNullParameter(fallbackReason, "");
        Intrinsics.checkNotNullParameter(str, "");
        C46915tgF c46915tgFAEQbTJ = C46935tgZ.KWHzl.AEQbTJ();
        C46934tgY c46934tgY = C46934tgY.AEQbTJ;
        EventData eventDataOLrzqt = c46934tgY.OLrzqt();
        eventDataOLrzqt.setMsg("PushInit_FallbackTo_JPush");
        Pair[] pairArr = new Pair[4];
        pairArr[0] = C56390yDp.OLrzqt("attr_1", fallbackReason.toString());
        pairArr[1] = C56390yDp.OLrzqt("attr_2", str);
        String strEZpvd = c46915tgFAEQbTJ != null ? c46915tgFAEQbTJ.EZpvd() : null;
        pairArr[2] = C56390yDp.OLrzqt("attr_3", strEZpvd != null ? strEZpvd : "");
        pairArr[3] = C56390yDp.OLrzqt("attr_4", String.valueOf(c46915tgFAEQbTJ != null ? Integer.valueOf(c46915tgFAEQbTJ.OLrzqt()) : null));
        eventDataOLrzqt.setAttrs(C56424yEw.gEmmrt(pairArr));
        c46934tgY.EZpvd(ReportManager.AEQbTJ, eventDataOLrzqt);
    }

    @VisibleForTesting
    public final boolean djBIcL() {
        InterfaceC46921tgL interfaceC46921tgL = AhwBna;
        return (interfaceC46921tgL != null ? Intrinsics.EZpvd(interfaceC46921tgL.copydefault(), Boolean.TRUE) : false) && OLrzqt().length() > 0;
    }

    public final boolean gEmmrt() {
        return !copydefault && (AhwBna instanceof C46926tgQ);
    }

    @Override // o.InterfaceC46958tgw
    public PushChannelInfo AEQbTJ() {
        PushChannelInfo pushChannelInfo = new PushChannelInfo(null, null, null, 7, null);
        InterfaceC46921tgL interfaceC46921tgL = AhwBna;
        if (interfaceC46921tgL != null) {
            pushChannelInfo.setChannelName(interfaceC46921tgL.OLrzqt());
            pushChannelInfo.setChannelId$OKPush_okpush_notification(interfaceC46921tgL.KWHzl());
        }
        pushChannelInfo.setDeviceToken(OLrzqt());
        C46996thh c46996thh = C46996thh.KWHzl;
        OKPushConfig oKPushConfig = OKPushConfig.copydefault;
        if (c46996thh.copydefault(oKPushConfig.copydefault())) {
            pushChannelInfo.setChannelReason(pushChannelInfo.getChannelReason() + "support fcm;");
        } else {
            pushChannelInfo.setChannelReason(pushChannelInfo.getChannelReason() + "not support fcm;");
        }
        C46935tgZ c46935tgZ = C46935tgZ.KWHzl;
        if (c46935tgZ.OLrzqt()) {
            pushChannelInfo.setChannelReason(pushChannelInfo.getChannelReason() + "support hms;");
        } else {
            pushChannelInfo.setChannelReason(pushChannelInfo.getChannelReason() + "not support hms;");
        }
        if (!oKPushConfig.AhwBna()) {
            pushChannelInfo.setChannelReason(pushChannelInfo.getChannelReason() + "not gp package;");
        }
        C46915tgF c46915tgFAEQbTJ = c46935tgZ.AEQbTJ();
        if (c46915tgFAEQbTJ != null) {
            pushChannelInfo.setChannelReason(pushChannelInfo.getChannelReason() + c46915tgFAEQbTJ.EZpvd() + "," + c46915tgFAEQbTJ.OLrzqt());
        }
        return pushChannelInfo;
    }

    @VisibleForTesting
    public final void valueOf(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        pUU.KWHzl("PushInitManager", "initOneSignal");
        AhwBna = new C46926tgQ(context);
    }

    public final void copydefault(Context context) {
        pUU.KWHzl("PushInitManager", "initJiGuang");
        AhwBna = new C46919tgJ(context);
    }

    public final void fetchVPNInfo() {
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("EVENT_CHANGE_LANGUAGE");
        final Object obj = new Object();
        abstractC58185ywXAEQbTJ.subscribe(new RxBus.EventCallback<String>(obj) { // from class: com.okinc.okpush.sdk.init.PushInitManager$setLanguageChangeListener$1
            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(String str) {
                pUU.KWHzl("PushInitManager", "setLanguageChangeListener : " + str);
                if (C43292rmY.OLrzqt.AwvSrB().values()) {
                    return;
                }
                PushInitManager.OLrzqt.OLrzqt("BIND_FROM_SWITCH_LANGUAGE");
            }
        });
    }

    @VisibleForTesting
    public final void values() {
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("ev_account_login", "ev_account_logout", "ev_account_change");
        final Object obj = new Object();
        abstractC58185ywXAEQbTJ.subscribe(new RxBus.EventCallback<String>(obj) { // from class: com.okinc.okpush.sdk.init.PushInitManager$setLoginListener$1
            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(String str) {
                InterfaceC46921tgL interfaceC46921tgLValueOf;
                pUU.KWHzl("PushInitManager", "setLoginListener event " + str);
                if (str != null) {
                    int iHashCode = str.hashCode();
                    if (iHashCode == 456924105) {
                        if (str.equals("ev_account_login")) {
                            PushInitManager.OLrzqt.OLrzqt("BIND_FROM_LOGIN");
                        }
                    } else {
                        if (iHashCode != 1015444304) {
                            if (iHashCode == 1279751466 && str.equals("ev_account_logout") && (interfaceC46921tgLValueOf = PushInitManager.OLrzqt.valueOf()) != null) {
                                interfaceC46921tgLValueOf.AhwBna();
                                return;
                            }
                            return;
                        }
                        if (str.equals("ev_account_change")) {
                            PushInitManager pushInitManager = PushInitManager.OLrzqt;
                            InterfaceC46921tgL interfaceC46921tgLValueOf2 = pushInitManager.valueOf();
                            if (interfaceC46921tgLValueOf2 != null) {
                                interfaceC46921tgLValueOf2.AEQbTJ();
                            }
                            pushInitManager.OLrzqt("BIND_FROM_ACCOUNT_CHANGE");
                        }
                    }
                }
            }
        });
    }

    @VisibleForTesting
    public final String OLrzqt() {
        String strEZpvd;
        InterfaceC46921tgL interfaceC46921tgL = AhwBna;
        return (interfaceC46921tgL == null || (strEZpvd = interfaceC46921tgL.EZpvd()) == null) ? "" : strEZpvd;
    }

    @VisibleForTesting
    public final void AEQbTJ(@NotNull String str) {
        InterfaceC46921tgL interfaceC46921tgL;
        Intrinsics.checkNotNullParameter(str, "");
        EventData eventData = new EventData();
        eventData.setAct("push_device_token_is_valid");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("type", str);
        InterfaceC46921tgL interfaceC46921tgL2 = AhwBna;
        String strKWHzl = interfaceC46921tgL2 != null ? interfaceC46921tgL2.KWHzl() : null;
        linkedHashMap.put("attr_1", strKWHzl != null ? strKWHzl : "");
        if (!TextUtils.isEmpty(OLrzqt()) && (interfaceC46921tgL = AhwBna) != null && Intrinsics.EZpvd(interfaceC46921tgL.copydefault(), Boolean.TRUE)) {
            linkedHashMap.put("attr_2", "valid");
        } else {
            linkedHashMap.put("attr_2", "invalid");
            linkedHashMap.put("attr_3", OLrzqt());
            InterfaceC46921tgL interfaceC46921tgL3 = AhwBna;
            linkedHashMap.put("attr_4", String.valueOf(interfaceC46921tgL3 != null ? interfaceC46921tgL3.copydefault() : null));
        }
        eventData.setAttrs(linkedHashMap);
        pUU.EZpvd("PushInitManager", "reportBindPushInfo:" + eventData.getAct() + " " + linkedHashMap);
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    public final boolean AYXKKw() {
        return C43308rmo.KWHzl(OKPushConfig.copydefault.copydefault());
    }

    @Override // o.InterfaceC46958tgw
    public void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!AYXKKw()) {
            pUU.EZpvd("PushInitManager", "bindPushInfo, not ui process, return");
            return;
        }
        if (AhwBna == null) {
            pUU.KWHzl("PushInitManager", "bindPushInfo, before push init, return");
            return;
        }
        pUU.KWHzl("PushInitManager", "bindPushInfo from " + str);
        KWHzl.put(str, 1);
        KWHzl(str);
        AEQbTJ(str);
    }

    @Override // o.InterfaceC46958tgw
    public void KWHzl(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        pUU.EZpvd("PushInitManager", "addPushExtraData extras: " + map);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            valueOf.put(entry.getKey(), entry.getValue());
        }
        OLrzqt("BIND_FROM_EXTRAMAP_CHANGED");
    }

    public final void KWHzl(final String str) {
        final PushBindReqInfo pushBindReqInfoEZpvd = EZpvd(PushInfoReqType.BIND);
        pUU.KWHzl("PushInitManager", "bindPushInfo start " + pushBindReqInfoEZpvd);
        if (C46992thd.OLrzqt.OLrzqt(pushBindReqInfoEZpvd).getFirst().booleanValue()) {
            pUU.EZpvd("PushInitManager", "bindPushInfo, same as last time:" + Intrinsics.EZpvd(pushBindReqInfoEZpvd, djBIcL));
            C33527myD.subscribeOnIO$default(PushApiService.Companion.AEQbTJ().bindPushInfo(pushBindReqInfoEZpvd), new Function1() { // from class: o.tgu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return PushInitManager.OLrzqt(str, (java.lang.Throwable) obj);
                }
            }, (Function0) null, new Function1() { // from class: o.tgD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return PushInitManager.OLrzqt(pushBindReqInfoEZpvd, (ResponseData) obj);
                }
            }, 2, (Object) null);
        }
    }

    public static final Unit OLrzqt(String str, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C46993the.copydefault.copydefault(false);
        OLrzqt.AYXKKw(str);
        pUU.copydefault("PushInitManager", "bindPushInfo error: " + th);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(PushBindReqInfo pushBindReqInfo, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        C46993the.copydefault.copydefault(true);
        djBIcL = pushBindReqInfo;
        pUU.KWHzl("PushInitManager", "bindPushInfo success");
        return Unit.INSTANCE;
    }

    @VisibleForTesting
    public final void AYXKKw(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Map<String, Integer> map = KWHzl;
        Integer num = map.get(str);
        int iIntValue = num != null ? num.intValue() : 0;
        pUU.KWHzl("PushInitManager", "retryBindInfo " + str + " times " + iIntValue);
        if (1 > iIntValue || iIntValue >= 2) {
            return;
        }
        isConnected.postDelayed(new Runnable() { // from class: o.tgG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                PushInitManager.copydefault(str);
            }
        }, AkhnZx);
        map.put(str, Integer.valueOf(iIntValue - 1));
    }

    public static final void copydefault(String str) {
        OLrzqt.KWHzl(str);
    }

    public final PushBindReqInfo EZpvd(PushInfoReqType pushInfoReqType) {
        String strOLrzqt = OLrzqt();
        String strCopydefault = xVW.copydefault();
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        String str = strCopydefault;
        InterfaceC46921tgL interfaceC46921tgL = AhwBna;
        Boolean boolCopydefault = interfaceC46921tgL != null ? interfaceC46921tgL.copydefault() : null;
        boolean zValues = pushInfoReqType == PushInfoReqType.BIND ? C43292rmY.OLrzqt.AwvSrB().values() : false;
        pUU.KWHzl("PushInitManager", "getReqInfo reqType: " + pushInfoReqType + ", deviceId: " + str + " ,pushService: " + AhwBna + " ,isLogin " + zValues + ", deviceToken: " + strOLrzqt);
        String strOLrzqt2 = valueOf.isEmpty() ? null : C33490mxT.OLrzqt(valueOf);
        String string = boolCopydefault != null ? boolCopydefault.toString() : null;
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(C46994thf.OLrzqt.copydefault(), ",", null, null, 0, null, null, 62, null);
        InterfaceC46921tgL interfaceC46921tgL2 = AhwBna;
        return new PushBindReqInfo(String.valueOf(zValues), string, str, strOLrzqt, strJoinToString$default, interfaceC46921tgL2 != null ? interfaceC46921tgL2.KWHzl() : null, KWHzl(), Long.valueOf(System.currentTimeMillis()), strOLrzqt2);
    }

    @VisibleForTesting
    public final String KWHzl() {
        return C34703nhO.AEQbTJ() ? "5" : C34703nhO.copydefault() ? "7" : OKPushConfig.copydefault.AhwBna() ? "3" : "1";
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FallbackReason {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ FallbackReason[] $VALUES;
        public static final FallbackReason DECIDE_BY_CONFIGURATION = new FallbackReason("DECIDE_BY_CONFIGURATION", 0);
        public static final FallbackReason ONE_SIGNAL_INIT_EXCEPTION = new FallbackReason("ONE_SIGNAL_INIT_EXCEPTION", 1);
        public static final FallbackReason ONE_SIGNAL_WATCHDOG_TIMEOUT = new FallbackReason("ONE_SIGNAL_WATCHDOG_TIMEOUT", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ FallbackReason[] $values() {
            return new FallbackReason[]{DECIDE_BY_CONFIGURATION, ONE_SIGNAL_INIT_EXCEPTION, ONE_SIGNAL_WATCHDOG_TIMEOUT};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<FallbackReason> getEntries() {
            return $ENTRIES;
        }

        private FallbackReason(String str, int i) {
        }

        static {
            FallbackReason[] fallbackReasonArr$values = $values();
            $VALUES = fallbackReasonArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(fallbackReasonArr$values);
        }

        public static FallbackReason valueOf(String str) {
            return (FallbackReason) Enum.valueOf(FallbackReason.class, str);
        }

        public static FallbackReason[] values() {
            return (FallbackReason[]) $VALUES.clone();
        }
    }
}
