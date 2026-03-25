package o;

import androidx.compose.material3.CalendarModelKt;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.lexisnexisrisk.threatmetrix.TMXConfig;
import com.lexisnexisrisk.threatmetrix.TMXEndNotifier;
import com.lexisnexisrisk.threatmetrix.TMXProfiling;
import com.lexisnexisrisk.threatmetrix.TMXProfilingHandle;
import com.lexisnexisrisk.threatmetrix.TMXProfilingOptions;
import com.lexisnexisrisk.threatmetrix.TMXStatusCode;
import com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections;
import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okrisk.BackgroundTimerWorkerUtils;
import com.okinc.okrisk.FingerprintIdStatus;
import com.okinc.okrisk.OKRiskLibrarySource;
import com.okinc.okrisk.OKRiskManager$initConfigs$1;
import com.okinc.okrisk.OKRiskManager$profileBiometric$1;
import com.okinc.okrisk.OKRiskManager$profileInHouseSignals$1;
import com.okinc.okrisk.OKRiskPayloadManager;
import com.okinc.okrisk.SessionStatus;
import com.okinc.okrisk.collection.OKRiskDataFetcher;
import com.okinc.okrisk.service.AliFaceGuardService;
import com.okinc.okrisk.service.DeviceProfileRemoteConfig;
import com.okinc.okrisk.service.ProfileStatus;
import com.okinc.okrisk.service.data.RiskRemoteDomainResponse;
import com.okinc.okrisk.signals.p0.SyncSignal;
import com.okinc.okuser.data.User;
import face.security.device.api.FaceSecInitListener;
import face.security.device.api.FaceSecToken;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.serialization.json.JsonElement;
import o.C47004thp;
import o.C47065tix;
import o.InterfaceC46982thT;
import o.InterfaceC46986thX;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.thp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47004thp implements InterfaceC46982thT {
    public static final android.os.HandlerThread AEQbTJ;
    public static volatile boolean AYXKKw;
    public static volatile long AhwBna;
    public static volatile InterfaceC47026tiK DbNXlk;
    public static final C47004thp EZpvd;
    public static volatile C47001thm KWHzl;
    public static final int OLrzqt;
    public static final android.os.Handler copydefault;
    public static volatile C47001thm djBIcL;
    public static volatile C47001thm gEmmrt;
    public static OneTimeWorkRequest isConnected;
    public static volatile FingerprintIdStatus valueOf;
    public static volatile C47001thm values;

    /* JADX INFO: renamed from: o.thp$ActionBar */
    public static final class ActionBar implements InterfaceC47047tif {
    }

    /* JADX INFO: renamed from: o.thp$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TMXStatusCode.values().length];
            try {
                iArr[TMXStatusCode.TMX_OK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TMXStatusCode.TMX_PartialProfile.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull FingerprintIdStatus fingerprintIdStatus) {
        Intrinsics.checkNotNullParameter(fingerprintIdStatus, "");
        valueOf = fingerprintIdStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FingerprintIdStatus valueOf() {
        return valueOf;
    }

    private C47004thp() {
    }

    static {
        C47004thp c47004thp = new C47004thp();
        EZpvd = c47004thp;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("OKRiskManager");
        handlerThread.start();
        AEQbTJ = handlerThread;
        copydefault = new android.os.Handler(handlerThread.getLooper());
        gEmmrt = new C47001thm(null, SessionStatus.OK, 0L, 5, null);
        values = new C47001thm(null, SessionStatus.PENDING, 0L, 5, null);
        KWHzl = new C47001thm(null, SessionStatus.FAIL, 0L, 5, null);
        djBIcL = new C47001thm(null, SessionStatus.PARTIAL, 0L, 5, null);
        valueOf = FingerprintIdStatus.UNINITIALIZED;
        DbNXlk = c47004thp.DbNXlk();
        OLrzqt = 8;
    }

    public final void fetchVPNInfo() {
        OKRiskLibrarySource oKRiskLibrarySource;
        try {
            OKRiskPayloadManager oKRiskPayloadManager = OKRiskPayloadManager.copydefault;
            if (oKRiskPayloadManager.fJNWhG() == null) {
                oKRiskPayloadManager.KWHzl(C46966thD.EZpvd);
            }
            FingerprintIdStatus fingerprintIdStatus = FingerprintIdStatus.NOT_PROFILE;
            valueOf = fingerprintIdStatus;
            C43292rmY.OLrzqt.OLrzqt(new C46998thj(C47136tkO.AEQbTJ.EZpvd(), "fp-status=" + fingerprintIdStatus.getStatus(), null, 4, null));
            if (AYXKKw) {
                return;
            }
            android.os.Handler handler = copydefault;
            handler.post(new java.lang.Runnable() { // from class: o.tht
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C47004thp.copydefault();
                }
            });
            AYXKKw = true;
            if (!SPUtils.getBoolean("hasLaunchedPreviously", false)) {
                SPUtils.put("hasLaunchedPreviously", java.lang.Boolean.TRUE);
                oKRiskLibrarySource = OKRiskLibrarySource.APP_INSTALL;
            } else {
                oKRiskLibrarySource = OKRiskLibrarySource.APP_LAUNCH;
            }
            OKRiskLibrarySource oKRiskLibrarySource2 = oKRiskLibrarySource;
            if (oKRiskPayloadManager.fJNWhG() == null) {
                pUU.KWHzl("OKRiskManager", "init - Native library failed to load in init(), will retry in initConfigs()");
            }
            handler.post(new java.lang.Runnable() { // from class: o.thu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() throws java.lang.InterruptedException {
                    C47004thp.AEQbTJ();
                }
            });
            InterfaceC46982thT.TaskDescription.profile$default(this, oKRiskLibrarySource2, null, null, null, 14, null);
            isConnected();
        } catch (java.lang.Exception e) {
            C6777aVl.Companion.EZpvd(new java.lang.Exception("OKRiskManager Init fail==" + e.getMessage()));
            AYXKKw = false;
        }
    }

    public static final void copydefault() {
        DbNXlk.copydefault();
    }

    public static final void AEQbTJ() throws java.lang.InterruptedException {
        EZpvd.values();
        OKRiskPayloadManager oKRiskPayloadManager = OKRiskPayloadManager.copydefault;
        if (oKRiskPayloadManager.getNewProxyInstance()) {
            return;
        }
        oKRiskPayloadManager.AEQbTJ("OKRiskManager init", "Gcc Invoke not success");
    }

    public final void values() throws java.lang.InterruptedException {
        OKRiskPayloadManager oKRiskPayloadManager = OKRiskPayloadManager.copydefault;
        if (oKRiskPayloadManager.fJNWhG() == null) {
            pUU.valueOf("OKRiskManager", "initConfigs - Native library not loaded, attempting to load");
            oKRiskPayloadManager.KWHzl(C46966thD.EZpvd);
            if (oKRiskPayloadManager.fJNWhG() == null) {
                pUU.copydefault("OKRiskManager", "initConfigs - Failed to load native library, some features will be unavailable");
            }
        }
        oKRiskPayloadManager.isConnected();
        BuildersKt__BuildersKt.runBlocking$default(null, new OKRiskManager$initConfigs$1(null), 1, null);
        if (!oKRiskPayloadManager.uzCIH()) {
            try {
                pUU.KWHzl("OKRiskManager", "initConfigs - Starting app data collection");
                C47048tig.AEQbTJ.EZpvd(GlobalScope.INSTANCE, C32979mnm.EZpvd.OLrzqt());
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("OKRiskManager", "initConfigs - Failed to collect app data: " + e.getMessage(), e);
            }
        } else {
            pUU.KWHzl("OKRiskManager", "initConfigs - App data collection disabled by gray switch");
        }
        if (!OKRiskPayloadManager.copydefault.AubY()) {
            InterfaceC46982thT.TaskDescription.profileBiometric$default(this, OKRiskLibrarySource.APP_LAUNCH, null, 2, null);
        } else {
            pUU.KWHzl("OKRiskManager", "initConfigs - Biometric profiling disabled by gray switch");
        }
    }

    public final void isConnected() {
        C54819xWm.KWHzl().AEQbTJ(new Activity());
    }

    /* JADX INFO: renamed from: o.thp$Activity */
    public static final class Activity implements InterfaceC54816xWj {
        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.thT.TaskDescription.profile$default(o.thT, com.okinc.okrisk.OKRiskLibrarySource, o.tiL, java.lang.String, kotlinx.coroutines.CoroutineScope, int, java.lang.Object):void */
        @Override // o.InterfaceC54816xWj
        public void copydefault() {
            InterfaceC46982thT.TaskDescription.profile$default(C47004thp.EZpvd, OKRiskLibrarySource.APP_ENTER_FOREGROUND, null, null, null, 14, null);
        }
    }

    public final java.util.List<java.lang.String> AYXKKw() {
        return gEmmrt().getProfileCheckPoints();
    }

    public final int djBIcL() {
        return gEmmrt().getFreq();
    }

    public final DeviceProfileRemoteConfig gEmmrt() {
        DeviceProfileRemoteConfig deviceProfileRemoteConfig = new DeviceProfileRemoteConfig(new java.util.ArrayList(), null, 0, 0, 0, 0, null, WebSocketProtocol.PAYLOAD_SHORT, null);
        DeviceProfileRemoteConfig deviceProfileRemoteConfig2 = (DeviceProfileRemoteConfig) C48787ucK.AEQbTJ.EZpvd("fingerprintConfig", DeviceProfileRemoteConfig.class);
        return deviceProfileRemoteConfig2 != null ? deviceProfileRemoteConfig2 : deviceProfileRemoteConfig;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.thX.StateListAnimator.postOkxCollection$default(o.thX, java.lang.String, java.util.Map, com.okinc.network.okg.cor.SubdomainStrategy, int, java.lang.Object):o.ywX */
    public final C47065tix.Activity KWHzl(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.String str2) {
        java.lang.String string = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            JsonElement jsonElement = (JsonElement) ((ResponseData) InterfaceC46986thX.StateListAnimator.postOkxCollection$default(InterfaceC46986thX.Companion.KWHzl(), str, map, null, 4, null).AEQbTJ()).getData();
            string = jsonElement != null ? jsonElement.toString() : null;
        } catch (java.lang.Exception unused) {
        }
        return new C47065tix.Activity(string, null);
    }

    public final void EZpvd(@NotNull android.app.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        if (OKRiskDataFetcher.AEQbTJ() != null) {
            pUU.KWHzl("OkxCollectionV3", "addOkxCollection isInitialized");
            return;
        }
        pUU.KWHzl("OkxCollectionV3", "Collection init");
        final java.lang.String str = C33482mxL.KWHzl;
        User userOLrzqt = ((InterfaceC47230tmC) C58113yvE.copydefault(application, InterfaceC47230tmC.class)).fmB().OLrzqt();
        java.lang.String uid = userOLrzqt != null ? userOLrzqt.getUid() : null;
        java.lang.String str2 = uid == null ? "" : uid;
        OKRiskDataFetcher.KWHzl();
        OKRiskDataFetcher.EZpvd(application, str2, str, new InterfaceC47060tis() { // from class: o.thz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC47060tis
            public final C47065tix.Activity AEQbTJ(java.lang.String str3, java.util.Map map, java.util.Map map2) {
                return C47004thp.KWHzl(str, str3, map, map2);
            }
        }, new ActionBar(), xVW.copydefault());
    }

    public static final C47065tix.Activity KWHzl(java.lang.String str, java.lang.String str2, java.util.Map map, java.util.Map map2) {
        C47004thp c47004thp = EZpvd;
        Intrinsics.copydefault((java.lang.Object) str2);
        Intrinsics.copydefault(map);
        Intrinsics.copydefault((java.lang.Object) str);
        return c47004thp.KWHzl(str2, map, str);
    }

    @Override // o.InterfaceC46982thT
    public void OLrzqt(@NotNull android.app.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        new C46981thS().EZpvd(application);
    }

    public final void EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        values.copydefault(str);
        values.KWHzl(android.os.SystemClock.elapsedRealtime());
        copydefault.post(new java.lang.Runnable() { // from class: o.ths
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C47004thp.KWHzl(str);
            }
        });
    }

    public static final void KWHzl(final java.lang.String str) {
        DbNXlk.AEQbTJ(str, new Function1() { // from class: o.thv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47004thp.copydefault(str, (TMXProfilingHandle.Result) obj);
            }
        });
    }

    public static final Unit copydefault(java.lang.String str, TMXProfilingHandle.Result result) {
        Intrinsics.checkNotNullParameter(result, "");
        EZpvd.EZpvd(str, result);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void aliTokenCallback$OKRiskLibrary_okrisk_impl$default(C47004thp c47004thp, FaceSecToken faceSecToken, java.util.Map map, OKRiskLibrarySource oKRiskLibrarySource, InterfaceC47027tiL interfaceC47027tiL, java.lang.String str, CoroutineScope coroutineScope, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str = null;
        }
        c47004thp.copydefault(faceSecToken, map, oKRiskLibrarySource, interfaceC47027tiL, str, coroutineScope);
    }

    public final void copydefault(FaceSecToken faceSecToken, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull OKRiskLibrarySource oKRiskLibrarySource, @NotNull InterfaceC47027tiL interfaceC47027tiL, java.lang.String str, CoroutineScope coroutineScope) {
        java.lang.String str2;
        InterfaceC47027tiL interfaceC47027tiL2 = interfaceC47027tiL;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(oKRiskLibrarySource, "");
        Intrinsics.checkNotNullParameter(interfaceC47027tiL2, "");
        C47220tlt.log$default(C47220tlt.KWHzl, oKRiskLibrarySource.getTag(), "aliTokenCallback - source=" + oKRiskLibrarySource + ", code=" + (faceSecToken != null ? java.lang.Integer.valueOf(faceSecToken.code) : null) + ", tokenLength=" + ((faceSecToken == null || (str2 = faceSecToken.token) == null) ? 0 : str2.length()), null, null, 12, null);
        map.put(SyncSignal.SignalKey.ALIFD_DEVICETOEKN_ID.getKey(), java.lang.String.valueOf(faceSecToken != null ? faceSecToken.token : null));
        if (faceSecToken == null || faceSecToken.code != 10000) {
            interfaceC47027tiL2.onDeviceTokenReturned(new C47029tiN(null, null, ProfileStatus.ALI_TOKEN_FETCH_FAILED, faceSecToken != null ? java.lang.Integer.valueOf(faceSecToken.code) : null, 3, null));
            interfaceC47027tiL2 = null;
        }
        EZpvd(map, oKRiskLibrarySource, interfaceC47027tiL2, str, coroutineScope);
    }

    public final InterfaceC47026tiK DbNXlk() {
        return new TaskDescription();
    }

    /* JADX INFO: renamed from: o.thp$TaskDescription */
    public static final class TaskDescription implements InterfaceC47026tiK {
        @Override // o.InterfaceC47026tiK
        public void copydefault() {
            TMXProfilingConnections tMXProfilingConnections = new TMXProfilingConnections();
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
            tMXProfilingConnections.setConnectionTimeout(20, timeUnit);
            tMXProfilingConnections.setRetryTimes(3);
            TMXConfig tMXConfig = new TMXConfig();
            tMXConfig.setOrgId("9kqz9786");
            tMXConfig.setFPServer(C47004thp.EZpvd.OLrzqt());
            tMXConfig.setContext(C32979mnm.EZpvd.OLrzqt());
            tMXConfig.setProfileTimeout(10, timeUnit);
            tMXConfig.setProfilingConnections(tMXProfilingConnections);
            tMXConfig.setRegisterForLocationServices(false);
            TMXProfiling.getInstance().init(tMXConfig);
        }

        @Override // o.InterfaceC47026tiK
        public void AEQbTJ(java.lang.String str, final Function1<? super TMXProfilingHandle.Result, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            TMXProfilingOptions tMXProfilingOptions = new TMXProfilingOptions();
            tMXProfilingOptions.setSessionID(str);
            TMXProfiling.getInstance().profile(tMXProfilingOptions, new TMXEndNotifier() { // from class: o.thx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.lexisnexisrisk.threatmetrix.TMXEndNotifier
                public final void complete(TMXProfilingHandle.Result result) {
                    C47004thp.TaskDescription.KWHzl(function1, result);
                }
            });
        }

        public static final void KWHzl(Function1 function1, TMXProfilingHandle.Result result) {
            Intrinsics.copydefault(result);
            function1.invoke(result);
        }
    }

    @Override // o.InterfaceC46982thT
    public void OLrzqt(@NotNull final OKRiskLibrarySource oKRiskLibrarySource, final InterfaceC47027tiL interfaceC47027tiL, final java.lang.String str, final CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(oKRiskLibrarySource, "");
        copydefault.post(new java.lang.Runnable() { // from class: o.thw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() throws java.lang.Throwable {
                C47004thp.AEQbTJ(oKRiskLibrarySource, interfaceC47027tiL, str, coroutineScope);
            }
        });
    }

    public static final void AEQbTJ(OKRiskLibrarySource oKRiskLibrarySource, InterfaceC47027tiL interfaceC47027tiL, java.lang.String str, CoroutineScope coroutineScope) throws java.lang.Throwable {
        EZpvd.EZpvd(oKRiskLibrarySource, interfaceC47027tiL, str, coroutineScope);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.okrisk.service.AliFaceGuardService.init$default(com.okinc.okrisk.service.AliFaceGuardService, android.content.Context, java.lang.String, face.security.device.api.FaceSecInitListener, int, java.lang.Object):void */
    /* JADX DEBUG: Class process forced to load method for inline: o.tlt.log$default(o.tlt, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object):void */
    public final void EZpvd(@NotNull final OKRiskLibrarySource oKRiskLibrarySource, final InterfaceC47027tiL interfaceC47027tiL, final java.lang.String str, final CoroutineScope coroutineScope) throws java.lang.Throwable {
        Intrinsics.checkNotNullParameter(oKRiskLibrarySource, "");
        pUU.KWHzl("OKRisk", "profile " + oKRiskLibrarySource + " " + AYXKKw);
        C47220tlt c47220tlt = C47220tlt.KWHzl;
        C47220tlt.log$default(c47220tlt, oKRiskLibrarySource.getTag(), "profile START " + oKRiskLibrarySource + " " + AYXKKw, java.lang.String.valueOf(java.lang.System.currentTimeMillis()), null, 8, null);
        if (!AYXKKw) {
            fetchVPNInfo();
            return;
        }
        if (oKRiskLibrarySource == OKRiskLibrarySource.APP_LAUNCH || oKRiskLibrarySource == OKRiskLibrarySource.APP_INSTALL) {
            AliFaceGuardService.init$default(AliFaceGuardService.copydefault, C32979mnm.EZpvd.OLrzqt(), null, new FaceSecInitListener() { // from class: o.thn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // face.security.device.api.FaceSecInitListener
                public final void onInitFinish(int i) {
                    C47004thp.EZpvd(oKRiskLibrarySource, i);
                }
            }, 2, null);
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (OLrzqt(valueOf) || EZpvd(oKRiskLibrarySource) || KWHzl(jCurrentTimeMillis)) {
            C47136tkO c47136tkO = C47136tkO.AEQbTJ;
            java.lang.String strAhwBna = c47136tkO.AhwBna(C32979mnm.EZpvd.OLrzqt());
            final java.util.Map mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt(SyncSignal.SignalKey.TRANSACTION_ID.getKey(), strAhwBna), C56390yDp.OLrzqt("page", oKRiskLibrarySource.getTag()));
            if (oKRiskLibrarySource == OKRiskLibrarySource.KYC_LIVENESS && interfaceC47027tiL != null) {
                AliFaceGuardService.copydefault.KWHzl(coroutineScope == null ? GlobalScope.INSTANCE : coroutineScope, str, oKRiskLibrarySource, new Function1() { // from class: o.tho
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C47004thp.OLrzqt(mapDjBIcL, oKRiskLibrarySource, interfaceC47027tiL, str, coroutineScope, (FaceSecToken) obj);
                    }
                });
            } else {
                profileInHouseSignals$default(this, mapDjBIcL, oKRiskLibrarySource, null, null, coroutineScope, 8, null);
            }
            EZpvd(strAhwBna);
            AhwBna = java.lang.System.currentTimeMillis();
            KWHzl(c47136tkO.EZpvd(), strAhwBna);
            C47220tlt.log$default(c47220tlt, oKRiskLibrarySource.getTag(), "profile END " + oKRiskLibrarySource, java.lang.String.valueOf(java.lang.System.currentTimeMillis()), null, 8, null);
        }
    }

    public static final void EZpvd(OKRiskLibrarySource oKRiskLibrarySource, int i) {
        C47220tlt.KWHzl.copydefault(oKRiskLibrarySource.getTag(), "AliFaceGuard init " + oKRiskLibrarySource, java.lang.String.valueOf(java.lang.System.currentTimeMillis()), java.lang.String.valueOf(i));
    }

    public static final Unit OLrzqt(java.util.Map map, OKRiskLibrarySource oKRiskLibrarySource, InterfaceC47027tiL interfaceC47027tiL, java.lang.String str, CoroutineScope coroutineScope, FaceSecToken faceSecToken) {
        EZpvd.copydefault(faceSecToken, map, oKRiskLibrarySource, interfaceC47027tiL, str, coroutineScope);
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2) throws java.lang.Throwable {
        Data dataBuild = new Data.Builder().putString("fingerprintId", str).putString("transactionId", str2).build();
        Intrinsics.checkNotNullExpressionValue(dataBuild, "");
        OneTimeWorkRequest oneTimeWorkRequest = null;
        if (isConnected != null) {
            WorkManager workManager = WorkManager.getInstance(C32979mnm.EZpvd.OLrzqt());
            OneTimeWorkRequest oneTimeWorkRequest2 = isConnected;
            if (oneTimeWorkRequest2 == null) {
                Intrinsics.gEmmrt("");
                oneTimeWorkRequest2 = null;
            }
            workManager.cancelWorkById(oneTimeWorkRequest2.getId());
        }
        isConnected = new OneTimeWorkRequest.Builder(BackgroundTimerWorkerUtils.class).setInputData(dataBuild).setInitialDelay(djBIcL(), java.util.concurrent.TimeUnit.SECONDS).build();
        WorkManager workManager2 = WorkManager.getInstance(C32979mnm.EZpvd.OLrzqt());
        ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.REPLACE;
        OneTimeWorkRequest oneTimeWorkRequest3 = isConnected;
        if (oneTimeWorkRequest3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            oneTimeWorkRequest = oneTimeWorkRequest3;
        }
        workManager2.enqueueUniqueWork("background_refresh_timer_work", existingWorkPolicy, oneTimeWorkRequest);
    }

    public final boolean KWHzl(long j) {
        return j - AhwBna >= ((long) (djBIcL() * 1000));
    }

    public final boolean EZpvd(@NotNull OKRiskLibrarySource oKRiskLibrarySource) {
        Intrinsics.checkNotNullParameter(oKRiskLibrarySource, "");
        return AYXKKw().contains(oKRiskLibrarySource.getTag());
    }

    public final boolean OLrzqt(@NotNull FingerprintIdStatus fingerprintIdStatus) {
        Intrinsics.checkNotNullParameter(fingerprintIdStatus, "");
        return fingerprintIdStatus != FingerprintIdStatus.SUCCESS;
    }

    @Override // o.InterfaceC46982thT
    public void copydefault(@NotNull OKRiskLibrarySource oKRiskLibrarySource, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(oKRiskLibrarySource, "");
        if (coroutineScope == null) {
            coroutineScope = GlobalScope.INSTANCE;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OKRiskManager$profileBiometric$1(oKRiskLibrarySource, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.thp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void profileInHouseSignals$default(C47004thp c47004thp, java.util.Map map, OKRiskLibrarySource oKRiskLibrarySource, InterfaceC47027tiL interfaceC47027tiL, java.lang.String str, CoroutineScope coroutineScope, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = new LinkedHashMap();
        }
        c47004thp.EZpvd(map, oKRiskLibrarySource, (i & 4) != 0 ? null : interfaceC47027tiL, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : coroutineScope);
    }

    public final void EZpvd(java.util.Map<java.lang.String, java.lang.String> map, @NotNull OKRiskLibrarySource oKRiskLibrarySource, InterfaceC47027tiL interfaceC47027tiL, java.lang.String str, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(oKRiskLibrarySource, "");
        if (coroutineScope == null) {
            coroutineScope = GlobalScope.INSTANCE;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new OKRiskManager$profileInHouseSignals$1(map, oKRiskLibrarySource, interfaceC47027tiL, str, coroutineScope, null), 2, null);
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull TMXProfilingHandle.Result result) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(result, "");
        values.AEQbTJ();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        TMXStatusCode status = result.getStatus();
        int i = status == null ? -1 : Application.OLrzqt[status.ordinal()];
        if (i == 1) {
            gEmmrt.copydefault(str);
            gEmmrt.KWHzl(jElapsedRealtime);
        } else if (i == 2) {
            djBIcL.copydefault(str);
            djBIcL.KWHzl(jElapsedRealtime);
        } else {
            KWHzl.copydefault(str);
            KWHzl.KWHzl(jElapsedRealtime);
        }
    }

    @Override // o.InterfaceC46982thT
    public C47001thm AhwBna() {
        if (copydefault(yDY.gEmmrt(gEmmrt, djBIcL, values, KWHzl)).isEmpty()) {
            EZpvd(C47136tkO.AEQbTJ.AhwBna(C32979mnm.EZpvd.OLrzqt()));
        }
        return gEmmrt.KWHzl() ? gEmmrt : djBIcL.KWHzl() ? djBIcL : values.KWHzl() ? values : KWHzl;
    }

    public final java.util.List<C47001thm> copydefault(java.util.List<C47001thm> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (C47001thm c47001thm : list) {
            if (OLrzqt(c47001thm.OLrzqt())) {
                c47001thm.AEQbTJ();
            } else {
                arrayList.add(c47001thm);
            }
        }
        return arrayList;
    }

    public final boolean OLrzqt(long j) {
        return j == -1 || android.os.SystemClock.elapsedRealtime() - j >= CalendarModelKt.MillisecondsIn24Hours;
    }

    public final java.lang.String OLrzqt() {
        java.util.ArrayList<java.lang.String> tmxUrls;
        java.lang.String str;
        RiskRemoteDomainResponse riskRemoteDomainResponse = (RiskRemoteDomainResponse) C48787ucK.AEQbTJ.EZpvd("riskDomainConfig", RiskRemoteDomainResponse.class);
        return (riskRemoteDomainResponse == null || (tmxUrls = riskRemoteDomainResponse.getTmxUrls()) == null || (str = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(tmxUrls)) == null) ? "contendvc.cnouyi.pizza" : str;
    }
}
