package o;

import androidx.work.WorkRequest;
import com.bytedance.applog.AppLog;
import com.bytedance.applog.IAppLogInstance;
import com.bytedance.applog.IDataObserver;
import com.bytedance.applog.InitConfig;
import com.bytedance.applog.UriConfig;
import com.bytedance.applog.network.INetworkClientV2;
import com.bytedance.applog.network.RangersHttpException;
import com.bytedance.applog.network.RangersHttpTimeoutException;
import com.google.common.net.HttpHeaders;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.components.track.bytedance.DataFinderTester$setupCustomUserId$1;
import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.dns.DohTypeEnum;
import com.okinc.network.okg.dns.DomainsUtils;
import com.okinc.network.okg.log.NetEventLogListener;
import com.okinc.network.proxy.SafeProxySelector;
import com.okinc.okuser.data.User;
import java.net.SocketTimeoutException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.C32935mmv;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.mlY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32859mlY extends AbstractC32806mkY implements InterfaceC54816xWj {
    public static InterfaceC32897mmJ copydefault;
    public static boolean djBIcL;
    public static final C32859mlY KWHzl = new C32859mlY();
    public static final CoroutineScope EZpvd = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getIO()));
    public static java.util.Map<java.lang.String, java.lang.String> AhwBna = C56424yEw.KWHzl();
    public static final java.util.Map<AmplitudeName, IAppLogInstance> OLrzqt = new LinkedHashMap();
    public static final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.mlZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C32859mlY.gEmmrt();
        }
    });
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.mlY$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AmplitudeName.values().length];
            try {
                iArr[AmplitudeName.WEB3.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[INetworkClientV2.RequestType.values().length];
            try {
                iArr2[INetworkClientV2.RequestType.REQUEST_AB.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32806mkY, o.InterfaceC32874mln
    public void AEQbTJ(@NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AhwBna = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54816xWj
    public void KWHzl() {
        djBIcL = true;
    }

    private C32859mlY() {
    }

    public final C32910mmW AYXKKw() {
        return (C32910mmW) valueOf.getValue();
    }

    public static final C32910mmW gEmmrt() {
        return new C32910mmW(C43292rmY.OLrzqt.AwvSrB(), null, 2, 0 == true ? 1 : 0);
    }

    public final void AEQbTJ(@NotNull InterfaceC32897mmJ interfaceC32897mmJ) {
        Intrinsics.checkNotNullParameter(interfaceC32897mmJ, "");
        pUU.EZpvd("DataFinderTester", "onInit [" + interfaceC32897mmJ.EZpvd() + "] on " + java.lang.Thread.currentThread().getName());
        copydefault = interfaceC32897mmJ;
        AhwBna();
        AkhnZx();
        values();
        C32935mmv.KWHzl.KWHzl(new TaskDescription());
        C54819xWm.KWHzl().AEQbTJ(this);
    }

    /* JADX INFO: renamed from: o.mlY$TaskDescription */
    public static final class TaskDescription implements C32935mmv.Application {
        @Override // o.C32935mmv.Application
        public void EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C32859mlY.KWHzl.DbNXlk();
        }

        @Override // o.C32935mmv.Application
        public void copydefault(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            C32859mlY.KWHzl.DbNXlk();
        }
    }

    public final void KWHzl(long j) {
        pUU.KWHzl("DataFinderTester", "onPullABtestConfigThrottleChanged throttleMills=" + j);
        SPUtils.put("dataTesterConfig.pullConfigThrottleMills", java.lang.Long.valueOf(j));
        IAppLogInstance iAppLogInstance = OLrzqt.get(AmplitudeName.CEFI);
        if (iAppLogInstance != null) {
            if (j < 0) {
                j = WorkRequest.MIN_BACKOFF_MILLIS;
            }
            pUU.KWHzl("DataFinderTester", "onPullABtestConfigThrottleChanged realThrottleMills=" + j);
            iAppLogInstance.setPullAbTestConfigsThrottleMills(java.lang.Long.valueOf(j));
        }
    }

    @Override // o.AbstractC32806mkY
    public void KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        for (AmplitudeName amplitudeName : AmplitudeName.values()) {
            KWHzl.OLrzqt(amplitudeName).start();
        }
    }

    public final void AkhnZx() {
        C32864mld.OLrzqt.EZpvd(new Function0() { // from class: o.mma
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32859mlY.djBIcL();
            }
        });
    }

    public static final java.lang.String djBIcL() {
        return KWHzl.OLrzqt(AmplitudeName.CEFI).getDid();
    }

    public final void values() {
        BuildersKt__Builders_commonKt.launch$default(EZpvd, null, null, new DataFinderTester$setupCustomUserId$1(null), 3, null);
    }

    public final java.lang.String valueOf() {
        User userOLrzqt = C43292rmY.OLrzqt.AwvSrB().OLrzqt();
        if (userOLrzqt != null) {
            return userOLrzqt.getTk();
        }
        return null;
    }

    @Override // o.InterfaceC54816xWj
    public void copydefault() {
        super.copydefault();
        if (djBIcL) {
            for (AmplitudeName amplitudeName : AmplitudeName.values()) {
                KWHzl.OLrzqt(amplitudeName).pullAbTestConfigs();
            }
            djBIcL = false;
        }
    }

    public final void DbNXlk() {
        java.lang.String strKWHzl = C32924mmk.KWHzl.KWHzl(C32935mmv.KWHzl.EZpvd());
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strKWHzl)) {
            for (AmplitudeName amplitudeName : AmplitudeName.values()) {
                KWHzl.OLrzqt(amplitudeName).setHeaderInfo("app_mode_realtime_okx", strKWHzl);
            }
        }
    }

    public final IAppLogInstance AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull AmplitudeName amplitudeName) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        IAppLogInstance iAppLogInstanceNewInstance = AppLog.newInstance();
        InitConfig initConfig = new InitConfig(str, xVY.KWHzl(context));
        initConfig.setUriConfig(UriConfig.createByDomain(DomainsUtils.HOLDER_OKX_HTTP_MAIN, null));
        initConfig.setAutoStart(false);
        initConfig.setAbTestExposureEventRepeatEnabled(false);
        initConfig.setAutoTrackEnabled(false);
        initConfig.setAbEnable(true);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        OkHttpClient.Builder builderAddInterceptor = builder.readTimeout(90L, timeUnit).connectTimeout(90L, timeUnit).addInterceptor(new C32915mmb(amplitudeName));
        DohTypeEnum dohTypeEnum = DohTypeEnum.HTTP;
        AEQbTJ(initConfig, builderAddInterceptor.addInterceptor(new C43334rnN(dohTypeEnum)).addInterceptor(new C43421rov()).addInterceptor(new C6886aXo()).eventListenerFactory(NetEventLogListener.Companion.OLrzqt(context, NetEventLogListener.Companion.RequestType.NATIVE)).dns(new C43337rnQ(dohTypeEnum)).proxySelector(new SafeProxySelector(null, 1, null)).build());
        iAppLogInstanceNewInstance.setEncryptAndCompress(true);
        iAppLogInstanceNewInstance.init(context, initConfig);
        if (amplitudeName == AmplitudeName.CEFI) {
            java.lang.Long l = SPUtils.getLong("dataTesterConfig.pullConfigThrottleMills", 1000L);
            Intrinsics.checkNotNullExpressionValue(l, "");
            long jLongValue = l.longValue();
            pUU.KWHzl("DataFinderTester", "Init SP throttleMills=" + jLongValue);
            if (jLongValue < 0) {
                jLongValue = WorkRequest.MIN_BACKOFF_MILLIS;
            }
            pUU.KWHzl("DataFinderTester", "Init realThrottleMills=" + jLongValue);
            iAppLogInstanceNewInstance.setPullAbTestConfigsThrottleMills(java.lang.Long.valueOf(jLongValue));
        }
        Intrinsics.copydefault(iAppLogInstanceNewInstance);
        return iAppLogInstanceNewInstance;
    }

    public final kotlin.Pair<AmplitudeName, IAppLogInstance> copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AmplitudeName amplitudeNameAEQbTJ = AmplitudeName.Companion.AEQbTJ(AhwBna.get(str));
        return amplitudeNameAEQbTJ == null ? C56390yDp.OLrzqt(null, null) : C56390yDp.OLrzqt(amplitudeNameAEQbTJ, OLrzqt(amplitudeNameAEQbTJ));
    }

    public final void AhwBna() {
        for (AmplitudeName amplitudeName : AmplitudeName.values()) {
            OLrzqt(amplitudeName);
        }
    }

    public final IAppLogInstance OLrzqt(@NotNull AmplitudeName amplitudeName) {
        IAppLogInstance iAppLogInstanceAEQbTJ;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(amplitudeName, "");
            java.util.Map<AmplitudeName, IAppLogInstance> map = OLrzqt;
            IAppLogInstance iAppLogInstance = map.get(amplitudeName);
            if (iAppLogInstance != null) {
                return iAppLogInstance;
            }
            if (ActionBar.AEQbTJ[amplitudeName.ordinal()] == 1) {
                iAppLogInstanceAEQbTJ = AEQbTJ(C43246rlf.OLrzqt.valueOf(), "10000007", amplitudeName);
                iAppLogInstanceAEQbTJ.setUserUniqueID(xVW.copydefault());
                InterfaceC32897mmJ interfaceC32897mmJ = copydefault;
                if (interfaceC32897mmJ != null) {
                    iAppLogInstanceAEQbTJ.setHeaderInfo("okx_device_id", interfaceC32897mmJ.AEQbTJ());
                    iAppLogInstanceAEQbTJ.setHeaderInfo("okx_app_type", interfaceC32897mmJ.EZpvd());
                }
            } else {
                iAppLogInstanceAEQbTJ = AEQbTJ(C43246rlf.OLrzqt.valueOf(), "10000010", amplitudeName);
                iAppLogInstanceAEQbTJ.setUserUniqueID(KWHzl.valueOf());
                InterfaceC32897mmJ interfaceC32897mmJ2 = copydefault;
                if (interfaceC32897mmJ2 != null) {
                    iAppLogInstanceAEQbTJ.setHeaderInfo("okx_device_id", interfaceC32897mmJ2.AEQbTJ());
                    iAppLogInstanceAEQbTJ.setHeaderInfo("okx_app_type", interfaceC32897mmJ2.EZpvd());
                }
            }
            map.put(amplitudeName, iAppLogInstanceAEQbTJ);
            pUU.EZpvd("DataFinderTester", amplitudeName + " initAppLogInstance");
            iAppLogInstanceAEQbTJ.addDataObserver(new StateListAnimator(amplitudeName));
            C32902mmO.KWHzl.copydefault(amplitudeName);
            return iAppLogInstanceAEQbTJ;
        }
    }

    /* JADX INFO: renamed from: o.mlY$StateListAnimator */
    public static final class StateListAnimator implements IDataObserver {
        public final /* synthetic */ AmplitudeName AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.bytedance.applog.IDataObserver
        public void onAbVidsChange(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.bytedance.applog.IDataObserver
        public void onIdLoaded(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
        }

        @Override // com.bytedance.applog.IDataObserver
        public void onRemoteConfigGet(boolean z, JSONObject jSONObject) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.bytedance.applog.IDataObserver
        public void onRemoteIdGet(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
        }

        public StateListAnimator(AmplitudeName amplitudeName) {
            this.AEQbTJ = amplitudeName;
        }

        @Override // com.bytedance.applog.IDataObserver
        public void onRemoteAbConfigGet(boolean z, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            C32902mmO.KWHzl.AEQbTJ(this.AEQbTJ);
            pUU.KWHzl("DataFinderTester", this.AEQbTJ + " onRemoteAbConfigGet " + jSONObject);
        }
    }

    @Override // o.InterfaceC32874mln
    public TrackChannel fJNWhG() {
        return TrackChannel.DataFinder;
    }

    @Override // o.InterfaceC32874mln
    public void onEvent(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        kotlin.Pair<AmplitudeName, IAppLogInstance> pairCopydefault = copydefault(str);
        AmplitudeName amplitudeNameComponent1 = pairCopydefault.component1();
        IAppLogInstance iAppLogInstanceComponent2 = pairCopydefault.component2();
        pUU.EZpvd("DataFinderTester", "onEvent " + str + " " + amplitudeNameComponent1);
        AYXKKw().OLrzqt(amplitudeNameComponent1, iAppLogInstanceComponent2, str);
        if (amplitudeNameComponent1 == null || iAppLogInstanceComponent2 == null) {
            return;
        }
        iAppLogInstanceComponent2.onEventV3(str);
    }

    @Override // o.InterfaceC32874mln
    public void copydefault(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) throws JSONException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        kotlin.Pair<AmplitudeName, IAppLogInstance> pairCopydefault = copydefault(str);
        AmplitudeName amplitudeNameComponent1 = pairCopydefault.component1();
        IAppLogInstance iAppLogInstanceComponent2 = pairCopydefault.component2();
        pUU.EZpvd("DataFinderTester", "Map onEvent " + str + " " + amplitudeNameComponent1);
        AYXKKw().OLrzqt(amplitudeNameComponent1, iAppLogInstanceComponent2, str);
        if (amplitudeNameComponent1 == null || iAppLogInstanceComponent2 == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        iAppLogInstanceComponent2.onEventV3(str, jSONObject);
    }

    @Override // o.InterfaceC32874mln
    public void copydefault(@NotNull java.lang.String str, @NotNull EventParamsList eventParamsList) throws JSONException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        kotlin.Pair<AmplitudeName, IAppLogInstance> pairCopydefault = copydefault(str);
        AmplitudeName amplitudeNameComponent1 = pairCopydefault.component1();
        IAppLogInstance iAppLogInstanceComponent2 = pairCopydefault.component2();
        pUU.EZpvd("DataFinderTester", "EventParamsList onEvent " + str + " " + amplitudeNameComponent1);
        AYXKKw().OLrzqt(amplitudeNameComponent1, iAppLogInstanceComponent2, str);
        if (amplitudeNameComponent1 == null || iAppLogInstanceComponent2 == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (EventParam eventParam : eventParamsList) {
            jSONObject.put(eventParam.copydefault(), eventParam.KWHzl());
        }
        iAppLogInstanceComponent2.onEventV3(str, jSONObject);
    }

    /* JADX INFO: renamed from: o.mlY$Application */
    public static final class Application implements INetworkClientV2 {
        public final /* synthetic */ OkHttpClient AEQbTJ;

        /* JADX INFO: renamed from: o.mlY$Application$Application, reason: collision with other inner class name */
        public final /* synthetic */ class C0883Application {
            public static final /* synthetic */ int[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[INetworkClientV2.RequestMethod.values().length];
                try {
                    iArr[INetworkClientV2.RequestMethod.METHOD_GET.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[INetworkClientV2.RequestMethod.METHOD_POST.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                copydefault = iArr;
            }
        }

        public Application(OkHttpClient okHttpClient) {
            this.AEQbTJ = okHttpClient;
        }

        /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a6 A[Catch: all -> 0x01ab, TryCatch #3 {all -> 0x01ab, blocks: (B:3:0x0018, B:5:0x002b, B:6:0x0033, B:8:0x0039, B:10:0x0051, B:12:0x0057, B:13:0x005b, B:17:0x0071, B:21:0x0077, B:24:0x007c, B:26:0x0086, B:28:0x008f, B:30:0x00ad, B:29:0x00a6, B:31:0x00b1, B:32:0x00b6, B:33:0x00b7), top: B:85:0x0018 }] */
        /* JADX WARN: Type inference failed for: r15v0 */
        /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, java.lang.String, java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r15v5 */
        @Override // com.bytedance.applog.network.INetworkClientV2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public byte[] execute(INetworkClientV2.RequestMethod requestMethod, java.net.URL url, byte[] bArr, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, ? extends java.lang.Object> map2) throws java.lang.Throwable {
            java.net.URL urlOLrzqt;
            Request.Builder builderUrl;
            int i;
            ?? r15;
            java.io.InputStream inputStreamByteStream;
            java.lang.Object obj;
            RequestBody requestBodyCreate;
            java.lang.String str;
            Intrinsics.checkNotNullParameter(requestMethod, "");
            Intrinsics.checkNotNullParameter(url, "");
            try {
                urlOLrzqt = C32859mlY.KWHzl.OLrzqt(url, map2);
                builderUrl = new Request.Builder().url(urlOLrzqt);
                if (map != null) {
                    for (Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                        java.lang.String key = entry.getKey();
                        java.lang.String value = entry.getValue();
                        if (!android.text.TextUtils.isEmpty(key) && !android.text.TextUtils.isEmpty(value)) {
                            builderUrl.addHeader(key, value);
                        }
                    }
                }
                builderUrl.addHeader(HttpHeaders.ACCEPT_ENCODING, "gzip");
                i = C0883Application.copydefault[requestMethod.ordinal()];
            } catch (java.lang.Throwable th) {
                th = th;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (bArr == null) {
                    obj = null;
                    requestBodyCreate = RequestBody.Companion.create("", (MediaType) null);
                    builderUrl.post(requestBodyCreate);
                    r15 = obj;
                } else {
                    if (!(bArr.length == 0)) {
                        obj = null;
                        requestBodyCreate = RequestBody.Companion.create$default(RequestBody.Companion, bArr, (map == null || (str = map.get("Content-Type")) == null) ? null : MediaType.Companion.get(str), 0, 0, 6, (java.lang.Object) null);
                    }
                    builderUrl.post(requestBodyCreate);
                    r15 = obj;
                }
                pUU.copydefault("DataFinderTester", "httpClient request " + th);
                if (th instanceof RangersHttpException) {
                    throw th;
                }
                if (th instanceof SocketTimeoutException) {
                    throw new RangersHttpTimeoutException("Request timeout");
                }
                if (th instanceof java.io.IOException) {
                    throw new RangersHttpException(-1, "Network error: " + th.getMessage());
                }
                throw new RangersHttpException(-1, "Unknown error: " + th.getMessage());
            }
            r15 = 0;
            builderUrl.get();
            try {
                Response responseExecute = this.AEQbTJ.newCall(builderUrl.build()).execute();
                pUU.EZpvd("DataFinderTester", java.lang.String.valueOf(urlOLrzqt));
                pUU.EZpvd("DataFinderTester", java.lang.String.valueOf(responseExecute.code()));
                if (responseExecute.isSuccessful()) {
                    ResponseBody responseBodyBody = responseExecute.body();
                    if (responseBodyBody == null) {
                        throw new RangersHttpException(500, "Empty response body");
                    }
                    if (C59449zhJ.gEmmrt("gzip", Response.header$default(responseExecute, "Content-Encoding", r15, 2, r15), true)) {
                        inputStreamByteStream = new GZIPInputStream(responseBodyBody.byteStream());
                    } else {
                        inputStreamByteStream = responseBodyBody.byteStream();
                    }
                    try {
                        byte[] bArrKWHzl = yFB.KWHzl(inputStreamByteStream);
                        yFA.copydefault(inputStreamByteStream, r15);
                        java.lang.String path = url.getPath();
                        Intrinsics.checkNotNullExpressionValue(path, "");
                        if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) path, (java.lang.CharSequence) "simulator/mobile/login", false, 2, (java.lang.Object) r15)) {
                            return bArrKWHzl;
                        }
                        JSONObject jSONObject = new JSONObject(new java.lang.String(bArrKWHzl, Charsets.UTF_8));
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        java.util.Iterator<T> it = responseExecute.headers().values(HttpHeaders.SET_COOKIE).iterator();
                        while (it.hasNext()) {
                            sb.append((java.lang.String) it.next());
                            sb.append(";");
                        }
                        jSONObject.put(HttpHeaders.SET_COOKIE, sb.toString());
                        java.lang.String string = jSONObject.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        byte[] bytes = string.getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "");
                        return bytes;
                    } finally {
                    }
                } else {
                    pUU.copydefault("DataFinderTester", "httpClient request " + responseExecute.code() + " " + responseExecute.message());
                    throw new RangersHttpException(responseExecute.code(), responseExecute.message());
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        }
    }

    public final void AEQbTJ(@NotNull InitConfig initConfig, @NotNull OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(initConfig, "");
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        initConfig.setNetworkClient(new Application(okHttpClient));
    }

    public final java.net.URL OLrzqt(@NotNull java.net.URL url, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.lang.Object obj;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(url, "");
        if (map != null) {
            try {
                obj = map.get("request_type");
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("DataFinderTester", "Failed to update URL: " + e.getMessage(), e);
                return url;
            }
        } else {
            obj = null;
        }
        INetworkClientV2.RequestType requestType = obj instanceof INetworkClientV2.RequestType ? (INetworkClientV2.RequestType) obj : null;
        java.lang.String str2 = (requestType != null && ActionBar.copydefault[requestType.ordinal()] == 1) ? "/priapi/dt" : "/priapi/df";
        java.lang.String path = url.getPath();
        if (path == null) {
            path = "/";
        }
        java.lang.String str3 = str2 + path;
        java.lang.String query = url.getQuery();
        if (query != null) {
            java.lang.String str4 = "?" + query;
            if (str4 != null) {
                str = str4;
            }
        }
        return new java.net.URL(url.getProtocol(), url.getHost(), url.getPort(), str3 + str);
    }
}
