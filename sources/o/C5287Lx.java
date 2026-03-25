package o;

import androidx.work.WorkRequest;
import com.amplitude.experiment.BuildConfig;
import com.amplitude.experiment.DefaultExperimentClient$flags$1;
import com.amplitude.experiment.DefaultExperimentClient$poller$1;
import com.amplitude.experiment.ServerZone;
import com.amplitude.experiment.Source;
import com.amplitude.experiment.VariantSource;
import com.amplitude.experiment.evaluation.EvaluationFlag;
import com.amplitude.experiment.evaluation.EvaluationVariant;
import com.amplitude.experiment.util.FetchException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.Charsets;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import o.C5287Lx;
import o.C5298Mi;
import o.InterfaceC5306Mq;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.Lx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5287Lx implements LI {
    private final C5312Mw analyticsProvider;
    private final java.lang.String apiKey;
    private C5302Mm backoff;
    private final C5303Mn backoffConfig;
    private final java.lang.Object backoffLock;
    private final LG config;
    private final LY engine;
    private final ScheduledExecutorService executorService;
    private final long fetchBackoffTimeoutMillis;
    private final LM flagApi;
    private final C5298Mi<EvaluationFlag> flags;
    private final HttpUrl flagsServerUrl;
    private final OkHttpClient httpClient;
    private boolean isRunning;
    private final java.lang.Object isRunningLock;
    private final C5313Mx poller;
    private final HttpUrl serverUrl;
    private LF user;
    private LJ userProvider;
    private final MC userSessionExposureTracker;
    private final C5298Mi<LP> variants;

    /* JADX INFO: renamed from: o.Lx$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.LOCAL_STORAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[Source.INITIAL_VARIANTS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.LI
    public LJ AEQbTJ() {
        return this.userProvider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.LI
    public LF OLrzqt() {
        return this.user;
    }

    public C5287Lx(@NotNull java.lang.String str, @NotNull LG lg, @NotNull OkHttpClient okHttpClient, @NotNull InterfaceC5295Mf interfaceC5295Mf, @NotNull ScheduledExecutorService scheduledExecutorService) {
        HttpUrl httpUrl;
        HttpUrl httpUrl2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(lg, "");
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        Intrinsics.checkNotNullParameter(interfaceC5295Mf, "");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        this.apiKey = str;
        this.config = lg;
        this.httpClient = okHttpClient;
        this.executorService = scheduledExecutorService;
        this.engine = new LY(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        this.variants = C5297Mh.AEQbTJ(str, lg.AkhnZx, interfaceC5295Mf);
        this.flags = C5297Mh.EZpvd(str, lg.AkhnZx, interfaceC5295Mf, new DefaultExperimentClient$flags$1(this));
        scheduledExecutorService.execute(new java.lang.Runnable() { // from class: o.Ly
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C5287Lx.OLrzqt(this.EZpvd);
            }
        });
        scheduledExecutorService.execute(new java.lang.Runnable() { // from class: o.Lz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C5287Lx.EZpvd(this.KWHzl);
            }
        });
        this.backoffLock = new java.lang.Object();
        this.fetchBackoffTimeoutMillis = WorkRequest.MIN_BACKOFF_MILLIS;
        this.backoffConfig = new C5303Mn(8L, 500L, WorkRequest.MIN_BACKOFF_MILLIS, 1.5f);
        this.poller = new C5313Mx(scheduledExecutorService, new DefaultExperimentClient$poller$1(this), 60000L);
        if (Intrinsics.EZpvd((java.lang.Object) lg.DbNXlk, (java.lang.Object) "https://api.lab.amplitude.com/") && Intrinsics.EZpvd((java.lang.Object) lg.AYXKKw, (java.lang.Object) "https://flag.lab.amplitude.com/") && lg.fIwbmz == ServerZone.EU) {
            httpUrl = HttpUrl.Companion.get("https://api.lab.eu.amplitude.com/");
        } else {
            httpUrl = HttpUrl.Companion.get(lg.DbNXlk);
        }
        this.serverUrl = httpUrl;
        if (Intrinsics.EZpvd((java.lang.Object) lg.DbNXlk, (java.lang.Object) "https://api.lab.amplitude.com/") && Intrinsics.EZpvd((java.lang.Object) lg.AYXKKw, (java.lang.Object) "https://flag.lab.amplitude.com/") && lg.fIwbmz == ServerZone.EU) {
            httpUrl2 = HttpUrl.Companion.get("https://flag.lab.eu.amplitude.com/");
        } else {
            httpUrl2 = HttpUrl.Companion.get(lg.AYXKKw);
        }
        this.flagsServerUrl = httpUrl2;
        this.flagApi = new LM(str, httpUrl2, okHttpClient);
        this.userProvider = lg.ejfBZ;
        LR lr = lg.copydefault;
        this.analyticsProvider = lr != null ? new C5312Mw(lr) : null;
        LN ln = lg.KWHzl;
        this.userSessionExposureTracker = ln != null ? new MC(ln) : null;
        this.isRunningLock = new java.lang.Object();
    }

    public static final void OLrzqt(C5287Lx c5287Lx) {
        Intrinsics.checkNotNullParameter(c5287Lx, "");
        synchronized (c5287Lx.variants) {
            c5287Lx.variants.EZpvd();
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final void EZpvd(C5287Lx c5287Lx) {
        Intrinsics.checkNotNullParameter(c5287Lx, "");
        synchronized (c5287Lx.flags) {
            c5287Lx.flags.EZpvd();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // o.LI
    public Future<LI> EZpvd(LF lf) {
        synchronized (this.isRunningLock) {
            this.user = lf;
            if (this.isRunning) {
                FutureC5301Ml futureC5301Ml = new FutureC5301Ml(null, null, 3, null);
                futureC5301Ml.copydefault(this);
                return futureC5301Ml;
            }
            this.isRunning = true;
            if (this.config.values) {
                this.poller.OLrzqt();
            }
            Unit unit = Unit.INSTANCE;
            Future<LI> futureSubmit = this.executorService.submit(new Callable() { // from class: o.LC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return C5287Lx.valueOf(this.copydefault);
                }
            });
            Intrinsics.checkNotNullExpressionValue(futureSubmit, "");
            return futureSubmit;
        }
    }

    public static final LI valueOf(C5287Lx c5287Lx) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(c5287Lx, "");
        Future<java.util.Map<java.lang.String, EvaluationFlag>> futureEZpvd = c5287Lx.EZpvd();
        if (c5287Lx.config.gEmmrt) {
            LF lfAEQbTJ = c5287Lx.AEQbTJ(WorkRequest.MIN_BACKOFF_MILLIS);
            LG lg = c5287Lx.config;
            c5287Lx.copydefault(lfAEQbTJ, lg.valueOf, lg.fetchVPNInfo, null);
            futureEZpvd.get();
        } else {
            futureEZpvd.get();
        }
        return c5287Lx;
    }

    @Override // o.LI
    public Future<LI> KWHzl(LF lf) {
        return AEQbTJ(lf, (LK) null);
    }

    @Override // o.LI
    public Future<LI> AEQbTJ(LF lf, final LK lk) {
        if (lf == null) {
            lf = this.user;
        }
        this.user = lf;
        Future<LI> futureSubmit = this.executorService.submit(new Callable() { // from class: o.Lv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C5287Lx.OLrzqt(this.copydefault, lk);
            }
        });
        Intrinsics.checkNotNullExpressionValue(futureSubmit, "");
        return futureSubmit;
    }

    public static final LI OLrzqt(C5287Lx c5287Lx, LK lk) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(c5287Lx, "");
        LF lfAEQbTJ = c5287Lx.AEQbTJ(WorkRequest.MIN_BACKOFF_MILLIS);
        LG lg = c5287Lx.config;
        c5287Lx.copydefault(lfAEQbTJ, lg.valueOf, lg.fetchVPNInfo, lk);
        return c5287Lx;
    }

    @Override // o.LI
    public LP copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl(str, (LP) null);
    }

    @Override // o.LI
    public LP KWHzl(@NotNull java.lang.String str, LP lp) {
        Intrinsics.checkNotNullParameter(str, "");
        LS lsEZpvd = EZpvd(str, lp);
        if (this.config.OLrzqt) {
            KWHzl(str, lsEZpvd);
        }
        return lsEZpvd.OLrzqt();
    }

    @Override // o.LI
    public java.util.Map<java.lang.String, LP> copydefault() {
        LinkedHashMap linkedHashMap;
        java.util.Map mapEvaluate$default = evaluate$default(this, null, 1, null);
        synchronized (this.flags) {
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapEvaluate$default.entrySet()) {
                if (C5305Mp.OLrzqt(this.flags.EZpvd((java.lang.String) entry.getKey()))) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return C56424yEw.OLrzqt(C56424yEw.OLrzqt(gEmmrt(), djBIcL()), linkedHashMap);
    }

    public final void KWHzl(java.lang.String str, LS ls) {
        java.lang.String str2;
        KWHzl(str, ls.OLrzqt(), ls.copydefault());
        boolean zEZpvd = EZpvd(ls.copydefault());
        if (!zEZpvd || ls.KWHzl()) {
            java.lang.String str3 = ls.OLrzqt().EZpvd;
            java.util.Map<java.lang.String, java.lang.Object> map = ls.OLrzqt().KWHzl;
            if (zEZpvd || ls.OLrzqt().KWHzl()) {
                str2 = null;
            } else {
                str2 = ls.OLrzqt().copydefault;
                if (str2 == null) {
                    str2 = ls.OLrzqt().OLrzqt;
                }
            }
            LH lh = new LH(str, str2, str3, map);
            MC mc = this.userSessionExposureTracker;
            if (mc != null) {
                MC.track$default(mc, lh, null, 2, null);
            }
        }
    }

    public final void KWHzl(java.lang.String str, LP lp, VariantSource variantSource) {
        LQ lq = new LQ(KWHzl(), str, lp, variantSource);
        if (variantSource.isFallback() || lp.copydefault == null) {
            C5312Mw c5312Mw = this.analyticsProvider;
            if (c5312Mw != null) {
                c5312Mw.AEQbTJ(lq);
                return;
            }
            return;
        }
        C5312Mw c5312Mw2 = this.analyticsProvider;
        if (c5312Mw2 != null) {
            c5312Mw2.copydefault(lq);
        }
        C5312Mw c5312Mw3 = this.analyticsProvider;
        if (c5312Mw3 != null) {
            c5312Mw3.OLrzqt(lq);
        }
    }

    public final boolean EZpvd(VariantSource variantSource) {
        return variantSource == null || variantSource.isFallback();
    }

    public static /* synthetic */ LS resolveVariantAndSource$default(C5287Lx c5287Lx, java.lang.String str, LP lp, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            lp = null;
        }
        return c5287Lx.EZpvd(str, lp);
    }

    public final LS EZpvd(java.lang.String str, LP lp) {
        LS lsOLrzqt;
        EvaluationFlag evaluationFlagEZpvd;
        int i = TaskDescription.AEQbTJ[this.config.fJNWhG.ordinal()];
        if (i == 1) {
            lsOLrzqt = OLrzqt(str, lp);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            lsOLrzqt = AEQbTJ(str, lp);
        }
        synchronized (this.flags) {
            evaluationFlagEZpvd = this.flags.EZpvd(str);
        }
        return evaluationFlagEZpvd != null ? (C5305Mp.OLrzqt(evaluationFlagEZpvd) || lsOLrzqt.OLrzqt().EZpvd()) ? AEQbTJ(str, evaluationFlagEZpvd, lp) : lsOLrzqt : lsOLrzqt;
    }

    public final void copydefault(@NotNull LF lf, long j, boolean z, LK lk) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(lf, "");
        if (z) {
            AhwBna();
        }
        try {
            java.util.Map<java.lang.String, LP> map = KWHzl(lf, j, lk).get();
            Intrinsics.checkNotNullExpressionValue(map, "");
            EZpvd(map, lk);
        } catch (java.lang.Exception e) {
            if (z && copydefault(e)) {
                copydefault(lf, lk);
            }
            throw e;
        }
    }

    public final Future<java.util.Map<java.lang.String, LP>> KWHzl(LF lf, long j, LK lk) {
        if (lf.ejfBZ == null && lf.copydefault == null) {
            InterfaceC5306Mq.ActionBar.w$default(C5310Mu.copydefault, "user id and device id are null; amplitude may not resolve identity", null, 2, null);
        }
        C5310Mu.copydefault.KWHzl("Fetch variants for user: " + lf);
        ByteString.Companion companion = ByteString.Companion;
        java.lang.String strEZpvd = C5309Mt.EZpvd(lf);
        java.nio.charset.Charset charset = Charsets.UTF_8;
        byte[] bytes = strEZpvd.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        Request.Builder builderAddHeader = new Request.Builder().get().url(this.serverUrl.newBuilder().addPathSegments("sdk/v2/vardata").build()).addHeader("Authorization", "Api-Key " + this.apiKey).addHeader("X-Amp-Exp-User", ByteString.Companion.of$default(companion, bytes, 0, 0, 3, null).base64Url());
        java.util.List<java.lang.String> list = lk != null ? lk.OLrzqt : null;
        if (list != null && !list.isEmpty()) {
            java.lang.String string = new JSONArray((java.util.Collection) (lk != null ? lk.OLrzqt : null)).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            byte[] bytes2 = string.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes2, "");
            builderAddHeader.addHeader("X-Amp-Exp-Flag-Keys", ByteString.Companion.of$default(companion, bytes2, 0, 0, 3, null).base64());
        }
        Call callNewCall = this.httpClient.newCall(builderAddHeader.build());
        callNewCall.timeout().timeout(j, java.util.concurrent.TimeUnit.MILLISECONDS);
        FutureC5301Ml futureC5301Ml = new FutureC5301Ml(callNewCall, null, 2, null);
        callNewCall.enqueue(new Activity(futureC5301Ml));
        return futureC5301Ml;
    }

    /* JADX INFO: renamed from: o.Lx$Activity */
    public static final class Activity implements okhttp3.Callback {
        public final /* synthetic */ FutureC5301Ml<java.util.Map<java.lang.String, LP>> KWHzl;

        public Activity(FutureC5301Ml<java.util.Map<java.lang.String, LP>> futureC5301Ml) {
            this.KWHzl = futureC5301Ml;
        }

        @Override // okhttp3.Callback
        public void onResponse(@NotNull Call call, @NotNull Response response) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(response, "");
            try {
                C5310Mu.copydefault.KWHzl("Received fetch variants response: " + response);
                if (response.isSuccessful()) {
                    this.KWHzl.copydefault(C5287Lx.this.copydefault(response));
                } else {
                    throw new FetchException(response.code(), "fetch error response: " + response);
                }
            } catch (java.lang.Exception e) {
                this.KWHzl.OLrzqt(e);
            }
        }

        @Override // okhttp3.Callback
        public void onFailure(@NotNull Call call, @NotNull java.io.IOException iOException) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(iOException, "");
            this.KWHzl.OLrzqt(iOException);
        }
    }

    public final Future<java.util.Map<java.lang.String, EvaluationFlag>> EZpvd() {
        return this.flagApi.OLrzqt(new LO("experiment-android-client", BuildConfig.VERSION_NAME, null, this.config.valueOf, 4, null), new Function1<java.util.Map<java.lang.String, ? extends EvaluationFlag>, Unit>() { // from class: com.amplitude.experiment.DefaultExperimentClient$doFlags$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends EvaluationFlag> map) {
                invoke2((Map<String, EvaluationFlag>) map);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Map<String, EvaluationFlag> map) {
                Intrinsics.checkNotNullParameter(map, "");
                C5298Mi c5298Mi = this.this$0.flags;
                C5287Lx c5287Lx = this.this$0;
                synchronized (c5298Mi) {
                    c5287Lx.flags.OLrzqt();
                    c5287Lx.flags.EZpvd(map);
                    C5298Mi.store$default(c5287Lx.flags, null, 1, null);
                    c5287Lx.valueOf();
                    Unit unit = Unit.INSTANCE;
                }
            }
        });
    }

    public final void copydefault(final LF lf, final LK lk) {
        synchronized (this.backoffLock) {
            C5302Mm c5302Mm = this.backoff;
            if (c5302Mm != null) {
                c5302Mm.copydefault();
            }
            this.backoff = C5300Mk.OLrzqt(this.executorService, this.backoffConfig, new Function0<Unit>() { // from class: com.amplitude.experiment.DefaultExperimentClient$startRetries$1$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() throws Exception {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() throws Exception {
                    C5287Lx c5287Lx = this.this$0;
                    c5287Lx.copydefault(lf, c5287Lx.fetchBackoffTimeoutMillis, false, lk);
                }
            });
            Unit unit = Unit.INSTANCE;
        }
    }

    public final Unit AhwBna() {
        Unit unit;
        synchronized (this.backoffLock) {
            C5302Mm c5302Mm = this.backoff;
            if (c5302Mm != null) {
                c5302Mm.copydefault();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
        }
        return unit;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final java.util.Map<java.lang.String, LP> copydefault(Response response) throws java.io.IOException {
        java.lang.String strString;
        try {
            if (!response.isSuccessful()) {
                throw new java.io.IOException("fetch error response: " + response);
            }
            ResponseBody responseBodyBody = response.body();
            if (responseBodyBody == null || (strString = responseBodyBody.string()) == null) {
                strString = "";
            }
            JSONObject jSONObject = new JSONObject(strString);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "");
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                LP lpOLrzqt = C5315Mz.OLrzqt(jSONObject.getJSONObject(next));
                if (lpOLrzqt != null) {
                    Intrinsics.checkNotNullExpressionValue(next, "");
                    linkedHashMap.put(next, lpOLrzqt);
                }
            }
            yFA.copydefault(response, null);
            return linkedHashMap;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                yFA.copydefault(response, th);
                throw th2;
            }
        }
    }

    public final void EZpvd(java.util.Map<java.lang.String, LP> map, LK lk) {
        java.util.List arrayList;
        java.util.List<java.lang.String> list;
        java.util.List<java.lang.String> list2;
        if (lk == null || (list2 = lk.OLrzqt) == null || (arrayList = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list2)) == null) {
            arrayList = new java.util.ArrayList();
        }
        synchronized (this.variants) {
            if (lk != null) {
                try {
                    list = lk.OLrzqt;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            } else {
                list = null;
            }
            if (list == null) {
                this.variants.OLrzqt();
            }
            for (Map.Entry<java.lang.String, LP> entry : map.entrySet()) {
                this.variants.KWHzl(entry.getKey(), entry.getValue());
                arrayList.remove(entry.getKey());
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.variants.OLrzqt((java.lang.String) it.next());
            }
            C5298Mi.store$default(this.variants, null, 1, null);
            C5310Mu.copydefault.KWHzl("Stored variants: " + map);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final java.util.Map<java.lang.String, LP> djBIcL() {
        java.util.Map<java.lang.String, LP> mapKWHzl;
        int i = TaskDescription.AEQbTJ[this.config.fJNWhG.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.config.isConnected;
            }
            throw new NoWhenBranchMatchedException();
        }
        synchronized (this.variants) {
            mapKWHzl = this.variants.KWHzl();
        }
        return mapKWHzl;
    }

    public final java.util.Map<java.lang.String, LP> gEmmrt() {
        java.util.Map<java.lang.String, LP> mapKWHzl;
        int i = TaskDescription.AEQbTJ[this.config.fJNWhG.ordinal()];
        if (i == 1) {
            return this.config.isConnected;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        synchronized (this.variants) {
            mapKWHzl = this.variants.KWHzl();
        }
        return mapKWHzl;
    }

    public final LF KWHzl() {
        LF lf = this.user;
        if (lf == null) {
            lf = new LF();
        }
        LF lfOLrzqt = lf.AEQbTJ().AYXKKw("experiment-android-client/1.12.2").OLrzqt();
        LJ lj = this.config.ejfBZ;
        return C5309Mt.copydefault(lfOLrzqt, lj != null ? lj.AEQbTJ() : null);
    }

    public final LF AEQbTJ(long j) throws java.lang.IllegalStateException {
        LF lfAEQbTJ;
        LJ lj = this.userProvider;
        if (lj instanceof C5284Lu) {
            try {
                lfAEQbTJ = ((C5284Lu) lj).AEQbTJ(j);
            } catch (TimeoutException e) {
                throw new java.lang.IllegalStateException(e);
            }
        } else {
            lfAEQbTJ = lj != null ? lj.AEQbTJ() : null;
        }
        LF lf = this.user;
        if (lf == null) {
            lf = new LF();
        }
        return C5309Mt.copydefault(lf.AEQbTJ().AYXKKw("experiment-android-client/1.12.2").OLrzqt(), lfAEQbTJ);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.Lx */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.util.Map evaluate$default(C5287Lx c5287Lx, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            set = yEE.copydefault();
        }
        return c5287Lx.KWHzl((java.util.Set<java.lang.String>) set);
    }

    public final java.util.Map<java.lang.String, LP> KWHzl(java.util.Set<java.lang.String> set) {
        java.util.Map<java.lang.String, EvaluationFlag> mapKWHzl;
        LF lfKWHzl = KWHzl();
        try {
            synchronized (this.flags) {
                mapKWHzl = this.flags.KWHzl();
            }
            java.util.List<EvaluationFlag> listEZpvd = C5292Mc.EZpvd(mapKWHzl, set);
            java.util.Map<java.lang.String, EvaluationVariant> mapAEQbTJ = this.engine.AEQbTJ(C5309Mt.KWHzl(lfKWHzl), listEZpvd);
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(mapAEQbTJ.size()));
            java.util.Iterator<T> it = mapAEQbTJ.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), C5315Mz.AEQbTJ((EvaluationVariant) entry.getValue()));
            }
            return linkedHashMap;
        } catch (java.lang.Exception e) {
            C5310Mu.copydefault.AEQbTJ("Error during topological sort of flags", e);
            return C56424yEw.KWHzl();
        }
    }

    public static /* synthetic */ LS localEvaluationVariantAndSource$default(C5287Lx c5287Lx, java.lang.String str, EvaluationFlag evaluationFlag, LP lp, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            lp = null;
        }
        return c5287Lx.AEQbTJ(str, evaluationFlag, lp);
    }

    public final LS AEQbTJ(java.lang.String str, EvaluationFlag evaluationFlag, LP lp) {
        java.util.Map<java.lang.String, java.lang.Object> map;
        LS ls = new LS(null, null, false, 7, null);
        LP lp2 = KWHzl(yED.AEQbTJ(evaluationFlag.KWHzl())).get(str);
        VariantSource variantSource = VariantSource.LOCAL_EVALUATION;
        java.lang.Object obj = (lp2 == null || (map = lp2.KWHzl) == null) ? null : map.get("default");
        java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
        if (lp2 != null && !Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            return new LS(lp2, variantSource, false);
        }
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            ls = new LS(lp2, variantSource, true);
        }
        if (lp != null) {
            return new LS(lp, VariantSource.FALLBACK_INLINE, ls.KWHzl());
        }
        LP lp3 = this.config.isConnected.get(str);
        if (lp3 != null) {
            return new LS(lp3, VariantSource.SECONDARY_INITIAL_VARIANTS, ls.KWHzl());
        }
        LP lp4 = this.config.djBIcL;
        return !lp4.EZpvd() ? new LS(lp4, VariantSource.FALLBACK_CONFIG, ls.KWHzl()) : ls;
    }

    public final LS OLrzqt(java.lang.String str, LP lp) {
        LP lp2;
        java.util.Map<java.lang.String, java.lang.Object> map;
        LS ls = new LS(null, null, false, 7, null);
        synchronized (this.variants) {
            lp2 = this.variants.KWHzl().get(str);
        }
        java.lang.Object obj = (lp2 == null || (map = lp2.KWHzl) == null) ? null : map.get("default");
        java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
        if (lp2 != null && !Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            return new LS(lp2, VariantSource.LOCAL_STORAGE, false);
        }
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            ls = new LS(lp2, VariantSource.LOCAL_STORAGE, true);
        }
        if (lp != null) {
            return new LS(lp, VariantSource.FALLBACK_INLINE, ls.KWHzl());
        }
        LP lp3 = this.config.isConnected.get(str);
        if (lp3 != null) {
            return new LS(lp3, VariantSource.SECONDARY_INITIAL_VARIANTS, ls.KWHzl());
        }
        LP lp4 = this.config.djBIcL;
        return !lp4.EZpvd() ? new LS(lp4, VariantSource.FALLBACK_CONFIG, ls.KWHzl()) : ls;
    }

    public static /* synthetic */ LS initialVariantsVariantAndSource$default(C5287Lx c5287Lx, java.lang.String str, LP lp, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            lp = null;
        }
        return c5287Lx.AEQbTJ(str, lp);
    }

    public final LS AEQbTJ(java.lang.String str, LP lp) {
        LP lp2;
        java.util.Map<java.lang.String, java.lang.Object> map;
        LS ls = new LS(null, null, false, 7, null);
        LP lp3 = this.config.isConnected.get(str);
        if (lp3 != null) {
            return new LS(lp3, VariantSource.INITIAL_VARIANTS, false);
        }
        synchronized (this.variants) {
            lp2 = this.variants.KWHzl().get(str);
        }
        java.lang.Object obj = (lp2 == null || (map = lp2.KWHzl) == null) ? null : map.get("default");
        java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
        if (lp2 != null && !Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            return new LS(lp2, VariantSource.LOCAL_STORAGE, false);
        }
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            ls = new LS(lp2, VariantSource.LOCAL_STORAGE, true);
        }
        if (lp != null) {
            return new LS(lp, VariantSource.FALLBACK_INLINE, ls.KWHzl());
        }
        LP lp4 = this.config.djBIcL;
        return !lp4.EZpvd() ? new LS(lp4, VariantSource.FALLBACK_CONFIG, ls.KWHzl()) : ls;
    }

    public final void valueOf() {
        java.lang.String str = this.config.AhwBna;
        if (str != null) {
            Json json = LU.OLrzqt;
            for (EvaluationFlag evaluationFlag : (java.util.List) json.decodeFromString(SerializersKt.serializer(json.getSerializersModule(), C56524yIo.copydefault(java.util.List.class, KTypeProjection.copydefault.KWHzl(C56524yIo.copydefault(EvaluationFlag.class)))), str)) {
                if (this.flags.EZpvd(evaluationFlag.KWHzl()) == null) {
                    this.flags.KWHzl(evaluationFlag.KWHzl(), evaluationFlag);
                }
            }
        }
    }

    public final boolean copydefault(java.lang.Exception exc) {
        if ((exc instanceof ExecutionException) && (exc.getCause() instanceof FetchException)) {
            java.lang.Throwable cause = exc.getCause();
            Intrinsics.copydefault(cause, "");
            FetchException fetchException = (FetchException) cause;
            if (fetchException.getStatusCode() >= 400 && fetchException.getStatusCode() < 500 && fetchException.getStatusCode() != 429) {
                return false;
            }
        }
        return true;
    }
}
