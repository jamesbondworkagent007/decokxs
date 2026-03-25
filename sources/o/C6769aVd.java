package o;

import com.appsflyer.AppsFlyerProperties;
import com.google.android.datatransport.cct.TransportProxyManager;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.installations.remote.InstallationsProxyManager;
import com.okinc.base.uploadlog.UploadLogTriggerMethodEnum;
import com.okinc.base.utils.commmon.ThreadUtils;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.dns.DohTypeEnum;
import com.okinc.network.okg.log.NetEventLogListener;
import com.okinc.rxutils.RxBus;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C6769aVd;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.aVd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6769aVd {
    public static volatile C6766aVa EZpvd;
    public static boolean KWHzl;
    public static volatile boolean djBIcL;
    public static final C6769aVd OLrzqt = new C6769aVd();
    public static final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.aVk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C6769aVd.KWHzl();
        }
    });
    public static final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.aVj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C6769aVd.OLrzqt();
        }
    });
    public static final int copydefault = 8;

    /* JADX INFO: renamed from: o.aVd$Activity */
    public static final class Activity extends C32927mmn {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C32927mmn, o.InterfaceC32926mmm
        public java.lang.String EZpvd() {
            return "mobile_infra_firebase_proxy_host";
        }
    }

    /* JADX INFO: renamed from: o.aVd$Application */
    public static final class Application extends C32927mmn {
        public final java.lang.String OLrzqt = "enable_anr_log_upload";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C32927mmn, o.InterfaceC32926mmm
        public java.lang.String EZpvd() {
            return this.OLrzqt;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return djBIcL;
    }

    private C6769aVd() {
    }

    public static final FirebaseCrashlytics KWHzl() {
        return FirebaseCrashlytics.getInstance();
    }

    public final FirebaseCrashlytics gEmmrt() {
        return (FirebaseCrashlytics) AYXKKw.getValue();
    }

    public final Application copydefault() {
        return (Application) AEQbTJ.getValue();
    }

    public static final Application OLrzqt() {
        return new Application();
    }

    public final void KWHzl(@NotNull android.app.Application application, @NotNull final java.lang.String str, java.lang.String str2, @NotNull C6766aVa c6766aVa, final boolean z) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(application, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(c6766aVa, "");
            EZpvd = c6766aVa;
            ABTestManager.registerCallback$default(ABTestManager.AEQbTJ, new StateListAnimator(), null, 2, null);
            pUU.KWHzl("FirebaseCrashManager", "FirebaseApp.initializeApp begin");
            try {
                FirebaseApp.initializeApp(application);
                pUU.KWHzl("FirebaseCrashManager", "FirebaseApp.initializeApp end");
                gEmmrt().setCrashlyticsCollectionEnabled(true);
                FirebaseCrashlytics firebaseCrashlyticsGEmmrt = gEmmrt();
                if (str2 == null) {
                    str2 = "";
                }
                firebaseCrashlyticsGEmmrt.setCustomKey("uuid", str2);
                gEmmrt().setCustomKey("device_id", xVW.copydefault());
                gEmmrt().setCustomKey(AppsFlyerProperties.CHANNEL, str);
                AhwBna();
                djBIcL = true;
                C54819xWm.KWHzl().AEQbTJ(new TaskDescription());
                FirebaseInstallations.getInstance().getId().addOnCompleteListener(new OnCompleteListener() { // from class: o.aVg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        C6769aVd.AEQbTJ(str, z, task);
                    }
                });
            } catch (java.lang.Throwable th) {
                pUU.copydefault("FirebaseCrashManager", "FirebaseCrashlytics initializeApp " + th);
            }
        }
    }

    /* JADX INFO: renamed from: o.aVd$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC32861mla {
        @Override // o.InterfaceC32861mla
        public void EZpvd(AmplitudeName amplitudeName) {
            Intrinsics.checkNotNullParameter(amplitudeName, "");
            C6769aVd.OLrzqt.DbNXlk();
        }

        @Override // o.InterfaceC32861mla
        public void KWHzl(AmplitudeName amplitudeName) {
            Intrinsics.checkNotNullParameter(amplitudeName, "");
            C6769aVd.OLrzqt.DbNXlk();
        }
    }

    /* JADX INFO: renamed from: o.aVd$TaskDescription */
    public static final class TaskDescription implements InterfaceC54816xWj {
        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
        }

        @Override // o.InterfaceC54816xWj
        public void copydefault() {
            super.copydefault();
            C6769aVd.OLrzqt.isConnected();
        }

        @Override // o.InterfaceC54816xWj
        public void EZpvd() {
            super.EZpvd();
            ThreadUtils.KWHzl(new C0823TaskDescription());
            ABTestManager aBTestManager = ABTestManager.AEQbTJ;
            C6769aVd c6769aVd = C6769aVd.OLrzqt;
            boolean zIsEnabled$default = ABTestManager.isEnabled$default(aBTestManager, c6769aVd.copydefault(), null, 2, null);
            UploadLogTriggerMethodEnum uploadLogTriggerMethodEnum = UploadLogTriggerMethodEnum.APP_CRASH;
            if (c6769aVd.djBIcL() && zIsEnabled$default) {
                uploadLogTriggerMethodEnum = UploadLogTriggerMethodEnum.APP_ANR;
            }
            pUU.KWHzl("FirebaseCrashManager", "didCrashOnPreviousExecution:" + c6769aVd.AYXKKw() + " didAnrOnPrevious:" + c6769aVd.djBIcL() + " enableAnrLogUpload:" + zIsEnabled$default);
            if (c6769aVd.AYXKKw() || (c6769aVd.djBIcL() && zIsEnabled$default)) {
                C6750aVK.uploadLogs$default(C6750aVK.KWHzl, null, false, uploadLogTriggerMethodEnum, false, null, 27, null);
                pUU.KWHzl("FirebaseCrashManager", "uploadLogs triggerMethod " + uploadLogTriggerMethodEnum);
            }
        }

        /* JADX INFO: renamed from: o.aVd$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class C0823TaskDescription extends ThreadUtils.TaskDescription<java.lang.Boolean> {
            /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)V */
            @Override // com.okinc.base.utils.commmon.ThreadUtils.StateListAnimator
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public void KWHzl(java.lang.Boolean bool) {
            }

            /* JADX DEBUG: Method merged with bridge method: EZpvd()Ljava/lang/Object; */
            @Override // com.okinc.base.utils.commmon.ThreadUtils.StateListAnimator
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public java.lang.Boolean EZpvd() {
                C6769aVd.OLrzqt.AkhnZx();
                return java.lang.Boolean.TRUE;
            }
        }
    }

    public static final void AEQbTJ(java.lang.String str, boolean z, Task task) {
        Intrinsics.checkNotNullParameter(task, "");
        if (task.isSuccessful()) {
            java.lang.String str2 = (java.lang.String) task.getResult();
            EventData eventData = new EventData();
            eventData.setAct("firebase_installation");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("attr_1", str);
            linkedHashMap.put("isE2E", java.lang.String.valueOf(z));
            linkedHashMap.put("attr_2", str2);
            eventData.setAttrs(linkedHashMap);
            pUU.EZpvd("FirebaseCrashManager", "reportData: " + linkedHashMap);
            ReportManager.AEQbTJ.EZpvd(eventData);
            return;
        }
        pUU.copydefault("FirebaseCrashManager", "Failed to get installation UUID", task.getException());
    }

    public final void KWHzl(@NotNull android.app.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        OkHttpClient.Builder builderAddInterceptor = new OkHttpClient.Builder().addInterceptor(new C6852aXG());
        DohTypeEnum dohTypeEnum = DohTypeEnum.HTTP;
        OkHttpClient.Builder builderDns = builderAddInterceptor.addInterceptor(new C43334rnN(dohTypeEnum)).addInterceptor(new C43421rov()).addInterceptor(new C6886aXo()).eventListenerFactory(NetEventLogListener.Companion.OLrzqt(application, NetEventLogListener.Companion.RequestType.NATIVE)).dns(new C43337rnQ(dohTypeEnum));
        boolean z = SPUtils.getBoolean("sp_enable_proxy_firebase_crashlytics_key", false, "sp_firebase_file_name");
        java.lang.String string = SPUtils.getString("sp_domain_firebase_crashlytics_key", "", "sp_firebase_file_name");
        pUU.KWHzl("FirebaseCrashManager", "initHttpProxy proxy enable " + z + ",domain  " + string);
        TransportProxyManager.getInstance().init(builderDns, java.lang.Boolean.valueOf(z), string);
        InstallationsProxyManager.getInstance().init(builderDns, java.lang.Boolean.valueOf(z), string);
    }

    public final void DbNXlk() {
        try {
            ABTestManager aBTestManager = ABTestManager.AEQbTJ;
            boolean zIsEnabled$default = ABTestManager.isEnabled$default(aBTestManager, new Activity(), null, 2, null);
            java.lang.Object payload$default = ABTestManager.getPayload$default(aBTestManager, "mobile_infra_firebase_proxy_host", null, 2, null);
            Intrinsics.copydefault(payload$default, "");
            java.lang.String string = ((JSONObject) payload$default).get("proxy_host").toString();
            SPUtils.put("sp_enable_proxy_firebase_crashlytics_key", java.lang.Boolean.valueOf(zIsEnabled$default), "sp_firebase_file_name");
            SPUtils.put("sp_domain_firebase_crashlytics_key", string, "sp_firebase_file_name");
            pUU.KWHzl("FirebaseCrashManager", "config proxy enable  " + zIsEnabled$default + ", domain  " + string);
            InstallationsProxyManager.getInstance().updateIsProxy(java.lang.Boolean.valueOf(zIsEnabled$default));
            TransportProxyManager.getInstance().updateIsProxy(java.lang.Boolean.valueOf(zIsEnabled$default));
            InstallationsProxyManager.getInstance().updateDomain(string);
            TransportProxyManager.getInstance().updateDomain(string);
        } catch (java.lang.Throwable th) {
            pUU.copydefault("FirebaseCrashManager", "config domain  " + th);
        }
    }

    public final void AkhnZx() {
        C6766aVa c6766aVa;
        boolean z = SPUtils.getBoolean("sp_have_firebase_crash_key", false, "sp_firebase_file_name");
        pUU.KWHzl("FirebaseCrashManager", "haveException " + z);
        if (z) {
            java.lang.Throwable thCopydefault = C6781aVp.copydefault();
            if (thCopydefault != null && (c6766aVa = EZpvd) != null) {
                java.lang.Thread thread = android.os.Looper.getMainLooper().getThread();
                Intrinsics.checkNotNullExpressionValue(thread, "");
                c6766aVa.EZpvd(thread, thCopydefault);
            }
            SPUtils.put("sp_have_firebase_crash_key", java.lang.Boolean.FALSE, "sp_firebase_file_name");
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            if (djBIcL) {
                gEmmrt().log(str);
            }
        }
    }

    public final void EZpvd(@NotNull java.lang.String str, java.lang.String str2) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            if (djBIcL) {
                FirebaseCrashlytics firebaseCrashlyticsGEmmrt = gEmmrt();
                if (str2 == null) {
                    str2 = "";
                }
                firebaseCrashlyticsGEmmrt.setCustomKey(str, str2);
            }
        }
    }

    public final void values() {
        synchronized (this) {
            pUU.KWHzl("FirebaseCrashManager", "update common key");
            if (djBIcL) {
                gEmmrt().setCustomKey("device_id", xVW.copydefault());
                AhwBna();
            }
        }
    }

    public final void EZpvd(java.lang.String str) {
        synchronized (this) {
            if (djBIcL) {
                FirebaseCrashlytics firebaseCrashlyticsGEmmrt = gEmmrt();
                if (str == null) {
                    str = "";
                }
                firebaseCrashlyticsGEmmrt.setUserId(str);
            }
        }
    }

    public final void AEQbTJ(@NotNull java.lang.Throwable th, java.util.Map<java.lang.String, java.lang.String> map) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(th, "");
            if (djBIcL) {
                gEmmrt().recordException(th);
            }
        }
    }

    public final void isConnected() {
        AhwBna();
        if (KWHzl) {
            return;
        }
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("EVENT_OKEX_HOME_MODE_CHANGE");
        final C6769aVd c6769aVd = OLrzqt;
        abstractC58185ywXAEQbTJ.subscribe(new RxBus.EventCallback<java.lang.String>(c6769aVd) { // from class: com.okinc.base.bugreport.FirebaseCrashManager$updateAppMode$1
            {
                super(c6769aVd);
            }

            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(String str) {
                C6769aVd.OLrzqt.AhwBna();
            }
        });
        KWHzl = true;
    }

    public final void AhwBna() {
        synchronized (this) {
            java.lang.String strEZpvd = C32924mmk.KWHzl.EZpvd();
            if (strEZpvd == null) {
                strEZpvd = "";
            }
            pUU.KWHzl("FirebaseCrashManager", "app_mode " + strEZpvd);
            gEmmrt().setCustomKey("app_mode", strEZpvd);
        }
    }

    public final boolean AYXKKw() {
        return gEmmrt().didCrashOnPreviousExecution();
    }

    public final boolean djBIcL() {
        return C6703aUO.Companion.KWHzl();
    }
}
