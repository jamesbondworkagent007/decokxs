package o;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.okinc.components.track.TrackChannel;
import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.remote.config.OKExAlertConfigBean;
import com.okinc.remote.config.RemoteConfigManager$getValidStrategy$1$1;
import com.okinc.remote.config.RemoteConfigManager$initStrategyMap$1$1;
import com.okinc.remote.config.StrategyData;
import com.okinc.remote.config.SwapSwitchRequest;
import com.okinc.remote.config.SwapSwitchResponse;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ucK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48787ucK implements InterfaceC48786ucJ, InterfaceC54816xWj {
    public static final C48787ucK AEQbTJ;
    public static final java.util.HashMap<java.lang.String, java.util.ArrayList<InterfaceC48788ucL>> AYXKKw;
    public static final java.util.ArrayList<InterfaceC48788ucL> AhwBna;
    public static ConcurrentHashMap<java.lang.String, JsonObject> DbNXlk;
    public static final InterfaceC56387yDm EZpvd;
    public static final int KWHzl;
    public static final AtomicBoolean OLrzqt;
    public static boolean copydefault;
    public static boolean djBIcL;
    public static final ConcurrentHashMap<java.lang.String, JsonObject> fetchVPNInfo;
    public static boolean gEmmrt;
    public static final C48862udg isConnected;
    public static java.lang.String valueOf;
    public static final InterfaceC56387yDm values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.Integer copydefault(java.lang.Throwable th, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(num, "");
        return num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54816xWj
    public void KWHzl() {
        copydefault = true;
    }

    private C48787ucK() {
    }

    static {
        C48787ucK c48787ucK = new C48787ucK();
        AEQbTJ = c48787ucK;
        valueOf = "";
        djBIcL = SPUtils.getBoolean("debug_url_config", false, "app_config");
        gEmmrt = SPUtils.getBoolean("strategy_test_environment_switch", false);
        DbNXlk = new ConcurrentHashMap<>();
        fetchVPNInfo = new ConcurrentHashMap<>();
        AYXKKw = new java.util.HashMap<>();
        AhwBna = new java.util.ArrayList<>(0);
        OLrzqt = new AtomicBoolean(true);
        isConnected = new C48862udg(null, 1, 0 == true ? 1 : 0);
        values = C56392yDr.copydefault(new Function0() { // from class: o.ucR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48787ucK.AYXKKw();
            }
        });
        EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.ucN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48787ucK.djBIcL();
            }
        });
        C54819xWm.KWHzl().AEQbTJ(c48787ucK);
        KWHzl = 8;
    }

    public static final InterfaceC48802ucZ AYXKKw() {
        return InterfaceC48802ucZ.Companion.copydefault();
    }

    public final InterfaceC48802ucZ values() {
        return (InterfaceC48802ucZ) values.getValue();
    }

    public static final CoroutineScope djBIcL() {
        return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null));
    }

    public final CoroutineScope gEmmrt() {
        return (CoroutineScope) EZpvd.getValue();
    }

    public void AEQbTJ(@NotNull java.lang.String str, @NotNull InterfaceC48788ucL interfaceC48788ucL) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC48788ucL, "");
        java.util.HashMap<java.lang.String, java.util.ArrayList<InterfaceC48788ucL>> map = AYXKKw;
        java.util.ArrayList<InterfaceC48788ucL> arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList<>();
            map.put(str, arrayList);
        }
        arrayList.add(interfaceC48788ucL);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ucK */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadStrategy$default(C48787ucK c48787ucK, android.content.Context context, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        c48787ucK.EZpvd(context, (Function1<? super java.lang.Boolean, Unit>) function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    public final void EZpvd(@NotNull final android.content.Context context, final Function1<? super java.lang.Boolean, Unit> function1) {
        AbstractC58185ywX<ResponseData<SwapSwitchResponse>> abstractC58185ywXCopydefault;
        AbstractC58185ywX<ResponseData<SwapSwitchResponse>> abstractC58185ywXOLrzqt;
        Intrinsics.checkNotNullParameter(context, "");
        AbstractC58185ywX<ResponseData<SwapSwitchResponse>> abstractC58185ywXAYXKKw = null;
        C32866mlf.onEvent$default("cc_request_data ", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = C34703nhO.KWHzl(context);
        KWHzl(context);
        InterfaceC48802ucZ interfaceC48802ucZValues = values();
        T t = objectRef.element;
        Intrinsics.checkNotNullExpressionValue(t, "");
        AbstractC58185ywX<ResponseData<SwapSwitchResponse>> abstractC58185ywXOLrzqt2 = interfaceC48802ucZValues.OLrzqt(new SwapSwitchRequest((java.lang.String) t));
        if (function1 == null) {
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = true;
            if (abstractC58185ywXOLrzqt2 != null) {
                final Function1 function12 = new Function1() { // from class: o.ucQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C48787ucK.OLrzqt(booleanRef, context, (java.lang.Throwable) obj);
                    }
                };
                AbstractC58185ywX<ResponseData<SwapSwitchResponse>> abstractC58185ywXOLrzqt3 = abstractC58185ywXOLrzqt2.OLrzqt(new InterfaceC58227yxM() { // from class: o.ucP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C48787ucK.AEQbTJ(function12, obj);
                    }
                });
                if (abstractC58185ywXOLrzqt3 != null) {
                    final Function1 function13 = new Function1() { // from class: o.ucW
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C48787ucK.copydefault((AbstractC58185ywX) obj);
                        }
                    };
                    abstractC58185ywXAYXKKw = abstractC58185ywXOLrzqt3.AYXKKw(new InterfaceC58229yxO() { // from class: o.ucV
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58229yxO
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return C48787ucK.valueOf(function13, obj);
                        }
                    });
                }
            }
        } else {
            abstractC58185ywXAYXKKw = abstractC58185ywXOLrzqt2;
        }
        AtomicBoolean atomicBoolean = OLrzqt;
        long j = atomicBoolean.get() ? 5L : 0L;
        atomicBoolean.set(false);
        if (abstractC58185ywXAYXKKw == null || (abstractC58185ywXCopydefault = abstractC58185ywXAYXKKw.copydefault(yBP.AEQbTJ())) == null || (abstractC58185ywXOLrzqt = abstractC58185ywXCopydefault.OLrzqt(j, java.util.concurrent.TimeUnit.SECONDS)) == null) {
            return;
        }
        yBI.KWHzl(abstractC58185ywXOLrzqt, new Function1() { // from class: o.ucT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48787ucK.EZpvd(context, function1, (java.lang.Throwable) obj);
            }
        }, new Function0() { // from class: o.ucU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48787ucK.valueOf();
            }
        }, new Function1() { // from class: o.ucS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48787ucK.EZpvd(objectRef, context, function1, (ResponseData) obj);
            }
        });
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Ref.BooleanRef booleanRef, android.content.Context context, java.lang.Throwable th) {
        if (booleanRef.element) {
            booleanRef.element = false;
            getValidStrategy$default(AEQbTJ, context, false, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final java.lang.Integer copydefault(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (java.lang.Integer) function2.invoke(obj, obj2);
    }

    public static final InterfaceC60096zvd copydefault(AbstractC58185ywX abstractC58185ywX) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        AbstractC58185ywX<java.lang.Integer> abstractC58185ywXOLrzqt = AbstractC58185ywX.OLrzqt(1, 3);
        final Function2 function2 = new Function2() { // from class: o.ucX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C48787ucK.copydefault((java.lang.Throwable) obj, (java.lang.Integer) obj2);
            }
        };
        AbstractC58185ywX abstractC58185ywXCopydefault = abstractC58185ywX.copydefault(abstractC58185ywXOLrzqt, new InterfaceC58223yxI() { // from class: o.uda
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C48787ucK.copydefault(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.udb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48787ucK.OLrzqt((java.lang.Integer) obj);
            }
        };
        return abstractC58185ywXCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.ucO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C48787ucK.copydefault(function1, obj);
            }
        });
    }

    public static final InterfaceC60096zvd copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return AbstractC58185ywX.KWHzl(num.intValue(), java.util.concurrent.TimeUnit.MINUTES);
    }

    public static final Unit EZpvd(android.content.Context context, Function1 function1, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        getValidStrategy$default(AEQbTJ, context, false, 2, null);
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(Ref.ObjectRef objectRef, android.content.Context context, Function1 function1, ResponseData responseData) {
        T t = objectRef.element;
        SwapSwitchResponse swapSwitchResponse = (SwapSwitchResponse) responseData.getData();
        if (Intrinsics.EZpvd((java.lang.Object) t, (java.lang.Object) (swapSwitchResponse != null ? swapSwitchResponse.getBundleId() : null))) {
            C44759scw c44759scwAEQbTJ = C44759scw.AEQbTJ();
            SwapSwitchResponse swapSwitchResponse2 = (SwapSwitchResponse) responseData.getData();
            java.lang.String strKWHzl = c44759scwAEQbTJ.KWHzl(swapSwitchResponse2 != null ? swapSwitchResponse2.getInfo() : null);
            valueOf = strKWHzl;
            SPUtils.put("key_remote_config", strKWHzl, "RemoteConfigManager");
            pUU.EZpvd("RemoteConfigManager", "responseInfo:" + valueOf);
            getValidStrategy$default(AEQbTJ, context, false, 2, null);
            if (function1 != null) {
                function1.invoke(java.lang.Boolean.TRUE);
            }
        } else if (function1 != null) {
            function1.invoke(java.lang.Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf() {
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (DbNXlk.isEmpty() || valueOf.length() == 0) {
            java.lang.String string = SPUtils.getString("key_remote_config", "", "RemoteConfigManager");
            valueOf = string;
            pUU.EZpvd("RemoteConfigManager", "cacheInfo:" + string);
            OLrzqt(context, false);
        }
    }

    public static /* synthetic */ void getValidStrategy$default(C48787ucK c48787ucK, android.content.Context context, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        c48787ucK.OLrzqt(context, z);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ucI.isInterval$default(java.lang.String, java.lang.String, boolean, int, java.lang.Object):boolean */
    public final void OLrzqt(android.content.Context context, boolean z) {
        try {
            OKExAlertConfigBean oKExAlertConfigBean = (OKExAlertConfigBean) C48827ucy.parseObject$default(C48827ucy.KWHzl, valueOf, OKExAlertConfigBean.class, 0L, 4, null);
            if (oKExAlertConfigBean == null) {
                pUU.valueOf("RemoteConfigManager", "info is empty");
                return;
            }
            java.util.ArrayList<StrategyData> datas = oKExAlertConfigBean.getDatas();
            if (datas.size() > 0) {
                int size = datas.size();
                for (int i = 0; i < size; i++) {
                    StrategyData strategyData = datas.get(i);
                    Intrinsics.checkNotNullExpressionValue(strategyData, "");
                    StrategyData strategyData2 = strategyData;
                    if (strategyData2.getValid().getVersionRange().length() == 0 && strategyData2.getValid().getTimeRange().length() > 0) {
                        if (C48785ucI.copydefault(java.lang.String.valueOf(java.lang.System.currentTimeMillis()), strategyData2.getValid().getTimeRange(), true)) {
                            AEQbTJ(strategyData2, z);
                        }
                    } else if (strategyData2.getValid().getVersionRange().length() > 0 && strategyData2.getValid().getTimeRange().length() == 0) {
                        java.lang.String strValueOf = C34703nhO.valueOf(context);
                        Intrinsics.checkNotNullExpressionValue(strValueOf, "");
                        if (C48785ucI.isInterval$default(strValueOf, strategyData2.getValid().getVersionRange(), false, 4, null)) {
                            AEQbTJ(strategyData2, z);
                        }
                    } else if (strategyData2.getValid().getVersionRange().length() > 0 && strategyData2.getValid().getTimeRange().length() > 0) {
                        java.lang.String strValueOf2 = C34703nhO.valueOf(context);
                        Intrinsics.checkNotNullExpressionValue(strValueOf2, "");
                        if (C48785ucI.isInterval$default(strValueOf2, strategyData2.getValid().getVersionRange(), false, 4, null) && C48785ucI.copydefault(java.lang.String.valueOf(java.lang.System.currentTimeMillis()), strategyData2.getValid().getTimeRange(), true)) {
                            AEQbTJ(strategyData2, z);
                        }
                    } else {
                        AEQbTJ(strategyData2, z);
                    }
                }
            }
            DbNXlk.clear();
            ConcurrentHashMap<java.lang.String, JsonObject> concurrentHashMap = DbNXlk;
            ConcurrentHashMap<java.lang.String, JsonObject> concurrentHashMap2 = fetchVPNInfo;
            concurrentHashMap.putAll(concurrentHashMap2);
            concurrentHashMap2.clear();
            isConnected.copydefault(DbNXlk.size());
            if (z) {
                java.util.Iterator<T> it = AhwBna.iterator();
                while (it.hasNext()) {
                    BuildersKt__Builders_commonKt.launch$default(AEQbTJ.gEmmrt(), Dispatchers.getMain(), null, new RemoteConfigManager$getValidStrategy$1$1((InterfaceC48788ucL) it.next(), null), 2, null);
                }
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("RemoteConfigManager", e);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ucy.parseObject$default(o.ucy, java.lang.String, java.lang.Class, long, int, java.lang.Object):java.lang.Object */
    public final void AEQbTJ(StrategyData strategyData, boolean z) {
        JsonObject jsonObject = (JsonObject) C48827ucy.parseObject$default(C48827ucy.KWHzl, C33488mxR.EZpvd(strategyData.getStrategy()), JsonObject.class, 0L, 4, null);
        if (jsonObject == null) {
            return;
        }
        for (java.lang.String str : jsonObject.keySet()) {
            JsonElement jsonElement = jsonObject.get(str);
            if (jsonElement instanceof JsonObject) {
                fetchVPNInfo.put(str, (JsonObject) jsonElement);
                if (z) {
                    DbNXlk.put(str, (JsonObject) jsonElement);
                    java.util.ArrayList<InterfaceC48788ucL> arrayList = AYXKKw.get(str);
                    if (arrayList != null) {
                        java.util.Iterator<T> it = arrayList.iterator();
                        while (it.hasNext()) {
                            BuildersKt__Builders_commonKt.launch$default(AEQbTJ.gEmmrt(), Dispatchers.getMain(), null, new RemoteConfigManager$initStrategyMap$1$1((InterfaceC48788ucL) it.next(), null), 2, null);
                        }
                    }
                }
            }
        }
    }

    public boolean copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            JsonElement jsonElementEZpvd = EZpvd(str);
            return jsonElementEZpvd != null ? jsonElementEZpvd.getAsBoolean() : z;
        } catch (java.lang.Exception unused) {
            return z;
        }
    }

    public int AEQbTJ(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            JsonElement jsonElementEZpvd = EZpvd(str);
            return jsonElementEZpvd != null ? jsonElementEZpvd.getAsInt() : i;
        } catch (java.lang.Exception unused) {
            return i;
        }
    }

    public long OLrzqt(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            JsonElement jsonElementEZpvd = EZpvd(str);
            return jsonElementEZpvd != null ? jsonElementEZpvd.getAsLong() : j;
        } catch (java.lang.Exception unused) {
            return j;
        }
    }

    public java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            JsonElement jsonElementEZpvd = EZpvd(str);
            if (jsonElementEZpvd == null) {
                return str2;
            }
            java.lang.String asString = jsonElementEZpvd.getAsString();
            return asString == null ? str2 : asString;
        } catch (java.lang.Exception unused) {
            return str2;
        }
    }

    public final JsonElement EZpvd(java.lang.String str) {
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{JwtUtilsKt.JWT_DELIMITER}, false, 0, 6, (java.lang.Object) null);
        if (listSplit$default.isEmpty() || listSplit$default.size() < 2) {
            return null;
        }
        return OLrzqt(DbNXlk.get(listSplit$default.get(0)), listSplit$default.subList(1, listSplit$default.size()));
    }

    @Override // o.InterfaceC48786ucJ
    public JsonObject AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return DbNXlk.get(str);
    }

    public <T> T EZpvd(@NotNull java.lang.String str, @NotNull java.lang.Class<T> cls) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cls, "");
        try {
            JsonObject jsonObjectAEQbTJ = AEQbTJ(str);
            java.lang.String string = jsonObjectAEQbTJ != null ? jsonObjectAEQbTJ.toString() : null;
            if (string != null) {
                return (T) C48827ucy.parseObject$default(C48827ucy.KWHzl, string, cls, 0L, 4, null);
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final JsonElement OLrzqt(JsonObject jsonObject, java.util.List<java.lang.String> list) {
        if (!list.isEmpty() && jsonObject != null) {
            JsonElement jsonElement = jsonObject.get(list.get(0));
            if (list.size() == 1) {
                return jsonElement;
            }
            if (jsonElement instanceof JsonObject) {
                return OLrzqt((JsonObject) jsonElement, list.subList(1, list.size()));
            }
        }
        return null;
    }

    @Override // o.InterfaceC54816xWj
    public void copydefault() {
        if (copydefault) {
            loadStrategy$default(this, C43246rlf.OLrzqt.valueOf(), null, 2, null);
            copydefault = false;
        }
    }

    public final void DbNXlk() {
        C48827ucy.KWHzl.copydefault();
    }
}
