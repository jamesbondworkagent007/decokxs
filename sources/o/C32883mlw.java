package o;

import com.amplitude.common.Logger;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.amplitude.AmplitudeHttpClientProxy;
import com.okinc.components.track.amplitude.AmplitudeLogProxy;
import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.components.track.amplitude.AmplitudeTracker$SkylabExperiment$reportSkylabRequest$1;
import com.okinc.components.track.amplitude.AmplitudeTracker$setupCustomUserId$1;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.dns.DohTypeEnum;
import com.okinc.network.okg.log.NetEventLogListener;
import com.okinc.network.proxy.SafeProxySelector;
import com.okinc.okuser.data.User;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.C32883mlw;
import o.C32935mmv;
import o.LF;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mlw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32883mlw extends AbstractC32806mkY implements InterfaceC54816xWj {
    public static volatile C32883mlw copydefault;
    public final OkHttpClient AYXKKw;
    public final java.util.Map<AmplitudeName, java.lang.String> AhwBna;
    public java.util.Map<java.lang.String, java.lang.String> AkhnZx;
    public final InterfaceC47278tmy DbNXlk;
    public final java.util.Map<AmplitudeName, java.lang.String> EZpvd;
    public final java.util.Map<AmplitudeName, C5214Jc> OLrzqt;
    public boolean djBIcL;
    public final java.util.Map<AmplitudeName, Activity> fetchVPNInfo;
    public final CoroutineScope gEmmrt;
    public final C32967mna isConnected;
    public final android.app.Application valueOf;
    public final C32971mne values;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public static final java.lang.String AEQbTJ = "Amplitude";

    /* JADX INFO: renamed from: o.mlw$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AmplitudeName.values().length];
            try {
                iArr[AmplitudeName.CEFI.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AmplitudeName.WEB3.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32806mkY, o.InterfaceC32874mln
    public void AEQbTJ(@NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.AkhnZx = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54816xWj
    public void KWHzl() {
        this.djBIcL = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32806mkY
    public void KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
    }

    public /* synthetic */ C32883mlw(android.content.Context context, CoroutineDispatcher coroutineDispatcher, java.util.Map map, java.util.Map map2, OkHttpClient okHttpClient, InterfaceC47278tmy interfaceC47278tmy, C32967mna c32967mna, int i, DefaultConstructorMarker defaultConstructorMarker) {
        C32967mna c32967mna2;
        CoroutineDispatcher io2 = (i & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher;
        InterfaceC47278tmy interfaceC47278tmyAwvSrB = (i & 32) != 0 ? C43292rmY.OLrzqt.AwvSrB() : interfaceC47278tmy;
        if ((i & 64) != 0) {
            c32967mna2 = new C32967mna(interfaceC47278tmyAwvSrB, null, 2, 0 == true ? 1 : 0);
        } else {
            c32967mna2 = c32967mna;
        }
        this(context, io2, map, map2, okHttpClient, interfaceC47278tmyAwvSrB, c32967mna2);
    }

    public C32883mlw(@NotNull android.content.Context context, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull java.util.Map<AmplitudeName, java.lang.String> map, @NotNull java.util.Map<AmplitudeName, java.lang.String> map2, @NotNull OkHttpClient okHttpClient, @NotNull InterfaceC47278tmy interfaceC47278tmy, @NotNull C32967mna c32967mna) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        Intrinsics.checkNotNullParameter(c32967mna, "");
        this.AhwBna = map;
        this.EZpvd = map2;
        this.AYXKKw = okHttpClient;
        this.DbNXlk = interfaceC47278tmy;
        this.isConnected = c32967mna;
        this.AkhnZx = C56424yEw.KWHzl();
        this.OLrzqt = new LinkedHashMap();
        this.fetchVPNInfo = new LinkedHashMap();
        android.content.Context applicationContext = context.getApplicationContext();
        Intrinsics.copydefault(applicationContext, "");
        this.valueOf = (android.app.Application) applicationContext;
        this.gEmmrt = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
        this.values = new C32971mne(interfaceC47278tmy, null, 2, 0 == true ? 1 : 0);
    }

    @Override // o.InterfaceC32874mln
    public TrackChannel fJNWhG() {
        return TrackChannel.Amplitude;
    }

    public final void gEmmrt() {
        valueOf();
        djBIcL();
        AhwBna();
        AkhnZx();
        DbNXlk();
        C32935mmv.KWHzl.KWHzl(new ActionBar());
        C54819xWm.KWHzl().AEQbTJ(this);
    }

    /* JADX INFO: renamed from: o.mlw$ActionBar */
    public static final class ActionBar implements C32935mmv.Application {
        public ActionBar() {
        }

        @Override // o.C32935mmv.Application
        public void EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C32883mlw.this.KWHzl(str, str2, str3);
            C32883mlw.this.values();
        }

        @Override // o.C32935mmv.Application
        public void copydefault(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            C32883mlw.this.values();
        }
    }

    @Override // o.InterfaceC54816xWj
    public void copydefault() {
        super.copydefault();
        if (this.djBIcL) {
            for (AmplitudeName amplitudeName : AmplitudeName.values()) {
                EZpvd(amplitudeName).EZpvd();
            }
            this.djBIcL = false;
        }
    }

    public final void valueOf() {
        for (AmplitudeName amplitudeName : AmplitudeName.values()) {
            AEQbTJ(amplitudeName);
        }
    }

    public final void AhwBna() {
        for (AmplitudeName amplitudeName : AmplitudeName.values()) {
            EZpvd(amplitudeName);
        }
    }

    public final void djBIcL() {
        final C5214Jc c5214JcAEQbTJ = AEQbTJ(AmplitudeName.CEFI);
        C32864mld.OLrzqt.OLrzqt(new Function0() { // from class: o.mlD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32883mlw.EZpvd(c5214JcAEQbTJ);
            }
        });
    }

    public static final java.lang.String EZpvd(C5214Jc c5214Jc) {
        return c5214Jc.AhwBna();
    }

    public static final Activity AEQbTJ(Function1 function1, java.lang.Object obj) {
        return (Activity) function1.invoke(obj);
    }

    public final Activity EZpvd(final AmplitudeName amplitudeName) {
        java.util.Map<AmplitudeName, Activity> map = this.fetchVPNInfo;
        final Function1 function1 = new Function1() { // from class: o.mlx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32883mlw.AEQbTJ(this.copydefault, amplitudeName, (AmplitudeName) obj);
            }
        };
        Activity activityComputeIfAbsent = map.computeIfAbsent(amplitudeName, new java.util.function.Function() { // from class: o.mlv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return C32883mlw.AEQbTJ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityComputeIfAbsent, "");
        return activityComputeIfAbsent;
    }

    public static final Activity AEQbTJ(C32883mlw c32883mlw, AmplitudeName amplitudeName, AmplitudeName amplitudeName2) {
        Intrinsics.checkNotNullParameter(amplitudeName2, "");
        return new Activity(c32883mlw, amplitudeName);
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "language") || Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) str3)) {
            return;
        }
        for (AmplitudeName amplitudeName : AmplitudeName.values()) {
            EZpvd(amplitudeName).KWHzl(str2);
        }
    }

    public final void values() {
        final java.util.Map<java.lang.String, java.lang.String> mapEZpvd = C32935mmv.KWHzl.EZpvd();
        Companion.KWHzl((Function0<java.lang.String>) new Function0() { // from class: o.mlC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32883mlw.OLrzqt(mapEZpvd);
            }
        });
        java.lang.String strKWHzl = C32924mmk.KWHzl.KWHzl(mapEZpvd);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strKWHzl)) {
            JZ.identify$default(AEQbTJ(AmplitudeName.CEFI), C56423yEv.EZpvd(C56390yDp.OLrzqt("app_mode_realtime_okx", strKWHzl)), (C5247Kj) null, 2, (java.lang.Object) null);
        }
    }

    public static final java.lang.String OLrzqt(java.util.Map map) {
        return "updateAppMode->" + map;
    }

    public final Job AkhnZx() {
        return BuildersKt__Builders_commonKt.launch$default(this.gEmmrt, null, null, new AmplitudeTracker$setupCustomUserId$1(this, null), 3, null);
    }

    public final void AYXKKw() {
        pUU.EZpvd(AEQbTJ, "onUserTkUpdated");
        final java.lang.String strOLrzqt = OLrzqt();
        AmplitudeName amplitudeName = AmplitudeName.CEFI;
        AEQbTJ(amplitudeName).AEQbTJ(strOLrzqt);
        EZpvd(amplitudeName).copydefault(strOLrzqt);
        Companion.KWHzl((Function0<java.lang.String>) new Function0() { // from class: o.mly
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32883mlw.EZpvd(strOLrzqt);
            }
        });
    }

    public static final java.lang.String EZpvd(java.lang.String str) {
        return "setupUserId -> newValue:" + str;
    }

    public final kotlin.Pair<AmplitudeName, C5214Jc> copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AmplitudeName amplitudeNameAEQbTJ = AmplitudeName.Companion.AEQbTJ(this.AkhnZx.get(str));
        return amplitudeNameAEQbTJ == null ? C56390yDp.OLrzqt(null, null) : C56390yDp.OLrzqt(amplitudeNameAEQbTJ, AEQbTJ(amplitudeNameAEQbTJ));
    }

    public static final C5214Jc EZpvd(Function1 function1, java.lang.Object obj) {
        return (C5214Jc) function1.invoke(obj);
    }

    public final C5214Jc AEQbTJ(@NotNull final AmplitudeName amplitudeName) {
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        java.util.Map<AmplitudeName, C5214Jc> map = this.OLrzqt;
        final Function1 function1 = new Function1() { // from class: o.mlz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32883mlw.KWHzl(this.copydefault, amplitudeName, (AmplitudeName) obj);
            }
        };
        C5214Jc c5214JcComputeIfAbsent = map.computeIfAbsent(amplitudeName, new java.util.function.Function() { // from class: o.mlA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return C32883mlw.EZpvd(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(c5214JcComputeIfAbsent, "");
        return c5214JcComputeIfAbsent;
    }

    public static final C5214Jc KWHzl(C32883mlw c32883mlw, AmplitudeName amplitudeName, AmplitudeName amplitudeName2) {
        Triple triple;
        Intrinsics.checkNotNullParameter(amplitudeName2, "");
        java.lang.String str = c32883mlw.AhwBna.get(amplitudeName);
        if (str == null || str.length() == 0) {
            throw new java.lang.IllegalArgumentException("Amplitude apiKey is null or empty");
        }
        int i = Application.EZpvd[amplitudeName.ordinal()];
        if (i == 1) {
            triple = new Triple(new C5216Je(str, c32883mlw.valueOf, 0, 0, null, false, null, null, null, null, null, 0, false, null, null, null, null, false, false, false, null, false, false, false, 0L, yEE.copydefault(), 0L, null, null, false, null, null, null, null, -33554436, 3, null), c32883mlw.OLrzqt(), xVW.copydefault());
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            java.lang.String strCopydefault = xVW.copydefault();
            triple = new Triple(new C5216Je(str, c32883mlw.valueOf, 0, 0, null, false, null, null, null, null, null, 0, false, null, null, null, null, false, false, false, null, false, false, false, 0L, yEE.copydefault(), 0L, null, null, false, null, null, null, null, -33554436, 3, null), strCopydefault, strCopydefault);
        }
        C5216Je c5216Je = (C5216Je) triple.component1();
        java.lang.String str2 = (java.lang.String) triple.component2();
        java.lang.String str3 = (java.lang.String) triple.component3();
        c5216Je.copydefault(true);
        c5216Je.KWHzl(C32864mld.OLrzqt.AEQbTJ());
        c5216Je.KWHzl(amplitudeName.getAmplitude());
        c5216Je.KWHzl(new AmplitudeLogProxy(Logger.LogMode.INFO));
        c5216Je.EZpvd(new AmplitudeHttpClientProxy(c5216Je, c32883mlw.AYXKKw));
        C5214Jc c5214Jc = new C5214Jc(c5216Je);
        if (str2 != null && str2.length() != 0) {
            c5214Jc.AEQbTJ(str2);
        }
        if (str3 != null && str3.length() != 0) {
            c5214Jc.OLrzqt(str3);
        }
        return c5214Jc;
    }

    @Override // o.InterfaceC32874mln
    public void onEvent(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        onEventInternal$default(this, str, null, 2, null);
    }

    @Override // o.InterfaceC32874mln
    public void copydefault(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        AEQbTJ(str, map);
    }

    @Override // o.InterfaceC32874mln
    public void copydefault(@NotNull java.lang.String str, @NotNull EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EventParam eventParam : eventParamsList) {
            linkedHashMap.put(eventParam.copydefault(), eventParam.KWHzl());
        }
        AEQbTJ(str, linkedHashMap);
    }

    public final void DbNXlk() {
        Function0<JsonObject> function0DjBIcL = C32864mld.OLrzqt.djBIcL();
        JsonObject jsonObjectInvoke = function0DjBIcL != null ? function0DjBIcL.invoke() : null;
        JsonElement jsonElement = jsonObjectInvoke != null ? jsonObjectInvoke.get("analytics2ServerUrl") : null;
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        final java.lang.String asString = jsonPrimitive != null ? jsonPrimitive.getAsString() : null;
        JsonElement jsonElement2 = jsonObjectInvoke != null ? jsonObjectInvoke.get("amplitudeExperimentServerUrl") : null;
        JsonPrimitive jsonPrimitive2 = jsonElement2 instanceof JsonPrimitive ? (JsonPrimitive) jsonElement2 : null;
        final java.lang.String asString2 = jsonPrimitive2 != null ? jsonPrimitive2.getAsString() : null;
        Companion.KWHzl((Function0<java.lang.String>) new Function0() { // from class: o.mlu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32883mlw.copydefault(asString, asString2);
            }
        });
        if ((asString != null ? HttpUrl.Companion.parse(asString) : null) != null) {
            java.util.Iterator<Map.Entry<AmplitudeName, C5214Jc>> it = this.OLrzqt.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().djBIcL().AEQbTJ(asString);
            }
        }
        HttpUrl httpUrl = asString2 != null ? HttpUrl.Companion.parse(asString2) : null;
        if (httpUrl != null) {
            java.util.Iterator<Map.Entry<AmplitudeName, Activity>> it2 = this.fetchVPNInfo.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue().KWHzl(httpUrl);
            }
        }
    }

    public static final java.lang.String copydefault(java.lang.String str, java.lang.String str2) {
        return "updateAmplitudeServerUrl, ampServerUrl: " + str + " skylabServerUrl: " + str2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mlw */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onEventInternal$default(C32883mlw c32883mlw, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        c32883mlw.AEQbTJ(str, (java.util.Map<java.lang.String, java.lang.String>) map);
    }

    public final void AEQbTJ(final java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.Pair<AmplitudeName, C5214Jc> pairCopydefault = copydefault(str);
        final AmplitudeName amplitudeNameComponent1 = pairCopydefault.component1();
        C5214Jc c5214JcComponent2 = pairCopydefault.component2();
        this.isConnected.AEQbTJ(amplitudeNameComponent1, c5214JcComponent2, str);
        if (amplitudeNameComponent1 == null || c5214JcComponent2 == null) {
            return;
        }
        if (map == null) {
            JZ.track$default(c5214JcComponent2, str, (java.util.Map) null, (C5247Kj) null, 6, (java.lang.Object) null);
        } else {
            JZ.track$default(c5214JcComponent2, str, map, (C5247Kj) null, 4, (java.lang.Object) null);
        }
        Companion.KWHzl((Function0<java.lang.String>) new Function0() { // from class: o.mlB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32883mlw.EZpvd(str, amplitudeNameComponent1);
            }
        });
    }

    public static final java.lang.String EZpvd(java.lang.String str, AmplitudeName amplitudeName) {
        return "onEvent():" + str + ", instance: " + amplitudeName;
    }

    public final java.lang.String OLrzqt() {
        User userOLrzqt = this.DbNXlk.OLrzqt();
        if (userOLrzqt != null) {
            return userOLrzqt.getTk();
        }
        return null;
    }

    /* JADX INFO: renamed from: o.mlw$Activity */
    public final class Activity {
        public static int AEQbTJ;
        public static int AYXKKw;
        public LF EZpvd;
        public final AmplitudeName KWHzl;
        public final /* synthetic */ C32883mlw OLrzqt;
        public LI copydefault;

        /* JADX INFO: renamed from: o.mlw$Activity$TaskDescription */
        public final /* synthetic */ class TaskDescription {
            public static final /* synthetic */ int[] KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[AmplitudeName.values().length];
                try {
                    iArr[AmplitudeName.CEFI.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[AmplitudeName.WEB3.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                KWHzl = iArr;
            }
        }

        public Activity(@NotNull C32883mlw c32883mlw, AmplitudeName amplitudeName) {
            Intrinsics.checkNotNullParameter(amplitudeName, "");
            this.OLrzqt = c32883mlw;
            this.KWHzl = amplitudeName;
            Function0<JsonObject> function0DjBIcL = C32864mld.OLrzqt.djBIcL();
            JsonObject jsonObjectInvoke = function0DjBIcL != null ? function0DjBIcL.invoke() : null;
            JsonElement jsonElement = jsonObjectInvoke != null ? jsonObjectInvoke.get("amplitudeExperimentServerUrl") : null;
            JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
            java.lang.String asString = jsonPrimitive != null ? jsonPrimitive.getAsString() : null;
            LG lgEZpvd = LG.Companion.AEQbTJ().OLrzqt(amplitudeName.getSkylab()).OLrzqt(false).EZpvd(false).KWHzl((asString != null ? HttpUrl.Companion.parse(asString) : null) == null ? "https://api2.lab.amplitude.com/" : asString).EZpvd();
            final long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            android.app.Application application = c32883mlw.valueOf;
            java.lang.String str = (java.lang.String) c32883mlw.EZpvd.get(amplitudeName);
            this.copydefault = LB.KWHzl(application, str != null ? str : "", lgEZpvd);
            C32905mmR c32905mmR = C32905mmR.EZpvd;
            c32905mmR.OLrzqt().put(amplitudeName.getSkylab(), this.copydefault);
            c32905mmR.EZpvd(amplitudeName);
            C32883mlw.Companion.KWHzl((Function0<java.lang.String>) new Function0() { // from class: o.mlI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C32883mlw.Activity.OLrzqt(jCurrentTimeMillis);
                }
            });
            LF.TaskDescription taskDescriptionCopydefault = LF.Companion.copydefault();
            int i = TaskDescription.KWHzl[amplitudeName.ordinal()];
            if (i == 1) {
                taskDescriptionCopydefault.copydefault(xVW.copydefault()).fetchVPNInfo(c32883mlw.OLrzqt());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                java.lang.String strCopydefault = xVW.copydefault();
                taskDescriptionCopydefault.copydefault(strCopydefault).fetchVPNInfo(strCopydefault);
            }
            LF lfOLrzqt = taskDescriptionCopydefault.OLrzqt();
            this.EZpvd = lfOLrzqt;
            OLrzqt(lfOLrzqt);
        }

        public static final java.lang.String OLrzqt(long j) {
            return "initializeWithAmplitudeAnalytics:" + (java.lang.System.currentTimeMillis() - j);
        }

        public final void EZpvd() {
            KWHzl(this.copydefault.KWHzl(this.EZpvd));
        }

        public final void OLrzqt(LF lf) {
            if (C43308rmo.KWHzl(this.OLrzqt.valueOf)) {
                this.EZpvd = lf;
                KWHzl(this.copydefault.KWHzl(lf));
            }
        }

        public final Job KWHzl(Future<LI> future) {
            return BuildersKt__Builders_commonKt.launch$default(this.OLrzqt.gEmmrt, null, null, new AmplitudeTracker$SkylabExperiment$reportSkylabRequest$1(future, this.OLrzqt, this, null), 3, null);
        }

        public final void KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            OLrzqt(this.EZpvd.AEQbTJ().djBIcL(str).OLrzqt());
        }

        public final void copydefault(java.lang.String str) {
            OLrzqt(this.EZpvd.AEQbTJ().fetchVPNInfo(str).OLrzqt());
        }

        public final void KWHzl(@NotNull HttpUrl httpUrl) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException {
            Intrinsics.checkNotNullParameter(httpUrl, "");
            if (Intrinsics.EZpvd(httpUrl, LL.AEQbTJ(this.copydefault))) {
                return;
            }
            LL.OLrzqt(this.copydefault, httpUrl);
            OLrzqt(this.EZpvd);
        }

        public static int KWHzl() {
            int i = AEQbTJ;
            int i2 = i % 5935805;
            AEQbTJ = i + 1;
            if (i2 != 0) {
                return AYXKKw;
            }
            int iMyUid = android.os.Process.myUid();
            AYXKKw = iMyUid;
            return iMyUid;
        }
    }

    /* JADX INFO: renamed from: o.mlw$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mlw.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void KWHzl(Function0<java.lang.String> function0) {
        }

        private TaskDescription() {
        }

        public final C32883mlw KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            if (C32883mlw.copydefault == null) {
                synchronized (this) {
                    if (C32883mlw.copydefault == null) {
                        C32864mld c32864mld = C32864mld.OLrzqt;
                        java.util.Map<AmplitudeName, java.lang.String> mapEZpvd = c32864mld.EZpvd();
                        java.util.Map<AmplitudeName, java.lang.String> mapCopydefault = c32864mld.copydefault();
                        if (mapEZpvd.isEmpty() || mapCopydefault.isEmpty()) {
                            pUU.valueOf("track", "Amplitude Key is empty, unable init SDK");
                        } else {
                            OkHttpClient.Builder builder = new OkHttpClient.Builder();
                            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                            OkHttpClient.Builder builderAddInterceptor = builder.readTimeout(90L, timeUnit).connectTimeout(90L, timeUnit).addInterceptor(new C32878mlr());
                            DohTypeEnum dohTypeEnum = DohTypeEnum.HTTP;
                            OkHttpClient okHttpClientBuild = builderAddInterceptor.addInterceptor(new C43334rnN(dohTypeEnum)).addInterceptor(new C43421rov()).addInterceptor(new C6886aXo()).eventListenerFactory(NetEventLogListener.Companion.OLrzqt(context, NetEventLogListener.Companion.RequestType.NATIVE)).dns(new C43337rnQ(dohTypeEnum)).proxySelector(new SafeProxySelector(null, 1, null)).build();
                            TaskDescription taskDescription = C32883mlw.Companion;
                            C32883mlw c32883mlw = new C32883mlw(context, null, mapEZpvd, mapCopydefault, okHttpClientBuild, null, null, 98, null);
                            c32883mlw.gEmmrt();
                            C32883mlw.copydefault = c32883mlw;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            return C32883mlw.copydefault;
        }
    }
}
