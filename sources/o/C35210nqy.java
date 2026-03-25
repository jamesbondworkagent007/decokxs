package o;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.okinc.core.util.SPUtils;
import com.okinc.gray.remoteconfig.GrayConfigJsonMap;
import com.okinc.gray.remoteconfig.RemoteConfigGrayManager$notifyWhenStrategyUpdated$1$1;
import com.okinc.gray.remoteconfig.RemoteGrayConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nqy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35210nqy {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public volatile boolean AYXKKw;
    public volatile boolean AhwBna;
    public RemoteGrayConfig fetchVPNInfo = new RemoteGrayConfig();
    public final java.util.Map<java.lang.String, java.lang.Boolean> valueOf = new ConcurrentHashMap();
    public final java.util.Map<java.lang.String, InterfaceC35209nqx> OLrzqt = new ConcurrentHashMap();
    public final java.util.Map<java.lang.String, java.lang.Boolean> djBIcL = new ConcurrentHashMap();
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.nqz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C35210nqy.KWHzl();
        }
    });
    public final android.os.Handler EZpvd = new android.os.Handler(valueOf().getLooper());
    public final C35161nqB AEQbTJ = new C35161nqB(null, 1, null);
    public final CountDownLatch gEmmrt = new CountDownLatch(1);

    public static final android.os.HandlerThread KWHzl() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("RemoteConfigGrayManager");
        handlerThread.start();
        return handlerThread;
    }

    public final android.os.HandlerThread valueOf() {
        return (android.os.HandlerThread) this.copydefault.getValue();
    }

    public final void AhwBna() {
        this.EZpvd.post(new java.lang.Runnable() { // from class: o.nqw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C35210nqy.copydefault(this.copydefault);
            }
        });
    }

    public static final void copydefault(C35210nqy c35210nqy) {
        C48801ucY.AEQbTJ.copydefault(C32979mnm.EZpvd.OLrzqt());
        C48787ucK.AEQbTJ.AEQbTJ("grayConfig", c35210nqy.new TaskDescription());
        c35210nqy.fetchVPNInfo();
        c35210nqy.AhwBna = SPUtils.getBoolean("sp_key_pandora_control_gray", false, "OKABTestConfig");
        c35210nqy.OLrzqt();
        c35210nqy.AYXKKw = true;
        pUU.KWHzl("RemoteConfigGrayManager", "OKGrayManager init " + c35210nqy.fetchVPNInfo + ", isPandoraControl : " + c35210nqy.AhwBna);
        c35210nqy.gEmmrt.countDown();
    }

    /* JADX INFO: renamed from: o.nqy$TaskDescription */
    public static final class TaskDescription implements InterfaceC48788ucL {
        public TaskDescription() {
        }

        @Override // o.InterfaceC48788ucL
        public void onStrategyUpdated() {
            C35210nqy.this.AYXKKw();
        }
    }

    public final boolean valueOf(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault(str);
        return AEQbTJ(str);
    }

    public final boolean AEQbTJ(java.lang.String str) throws java.lang.InterruptedException {
        boolean zOLrzqt = OLrzqt(str);
        this.valueOf.put(str, java.lang.Boolean.valueOf(zOLrzqt));
        return zOLrzqt;
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull InterfaceC35209nqx interfaceC35209nqx) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC35209nqx, "");
        this.OLrzqt.put(str, interfaceC35209nqx);
    }

    public final void fetchVPNInfo() {
        this.fetchVPNInfo.clear();
        GrayConfigJsonMap grayConfigJsonMap = (GrayConfigJsonMap) C48787ucK.AEQbTJ.EZpvd("grayConfig", GrayConfigJsonMap.class);
        if (grayConfigJsonMap != null) {
            for (Map.Entry<java.lang.String, JsonObject> entry : grayConfigJsonMap.entrySet()) {
                AEQbTJ(entry.getKey(), entry.getValue());
                if (!this.djBIcL.containsKey(entry.getKey())) {
                    this.djBIcL.put(entry.getKey(), java.lang.Boolean.FALSE);
                }
            }
        }
        this.AEQbTJ.EZpvd(this.fetchVPNInfo.size());
    }

    public final void AEQbTJ(java.lang.String str, JsonObject jsonObject) {
        JsonElement jsonElement = jsonObject.get("percent");
        int asInt = jsonElement != null ? jsonElement.getAsInt() : 0;
        try {
            JsonArray asJsonArray = jsonObject.getAsJsonArray("config");
            if (asJsonArray != null) {
                for (JsonElement jsonElement2 : asJsonArray) {
                    JsonElement jsonElement3 = jsonElement2.getAsJsonObject().get("versionRange");
                    java.lang.String asString = jsonElement3 != null ? jsonElement3.getAsString() : "";
                    java.lang.String strValueOf = C34703nhO.valueOf(C32979mnm.EZpvd.OLrzqt());
                    Intrinsics.checkNotNullExpressionValue(strValueOf, "");
                    if (C48785ucI.isInterval$default(strValueOf, asString, false, 4, null)) {
                        JsonElement jsonElement4 = jsonElement2.getAsJsonObject().get("percent");
                        asInt = jsonElement4 != null ? jsonElement4.getAsInt() : 0;
                    }
                }
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            pUU.valueOf("RemoteConfigGrayManager", "internalBuildGrayConfig exception : " + Unit.INSTANCE);
        }
        this.fetchVPNInfo.put(str, new C35207nqv(asInt));
    }

    public final void AYXKKw() {
        this.EZpvd.post(new java.lang.Runnable() { // from class: o.nqE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C35210nqy.djBIcL(this.EZpvd);
            }
        });
    }

    public static final void djBIcL(C35210nqy c35210nqy) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        c35210nqy.fetchVPNInfo();
        int size = c35210nqy.fetchVPNInfo.size();
        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
        pUU.KWHzl("RemoteConfigGrayManager", "notifyWhenStrategyUpdated size " + size + " cost time: " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + ": " + c35210nqy.fetchVPNInfo);
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new RemoteConfigGrayManager$notifyWhenStrategyUpdated$1$1(c35210nqy, null), 2, null);
    }

    public final void OLrzqt(java.lang.String str, InterfaceC35209nqx interfaceC35209nqx) throws java.lang.InterruptedException {
        boolean zOLrzqt = OLrzqt(str);
        if (Intrinsics.EZpvd(this.valueOf.get(str), java.lang.Boolean.valueOf(zOLrzqt))) {
            return;
        }
        interfaceC35209nqx.AEQbTJ(zOLrzqt);
        this.valueOf.put(str, java.lang.Boolean.valueOf(zOLrzqt));
    }

    public final int KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = "sp_key_gray_random_" + str;
        java.lang.Integer numValueOf = SPUtils.getInt(str2, -1, "OKABTestConfig");
        if (numValueOf != null && numValueOf.intValue() == -1) {
            numValueOf = java.lang.Integer.valueOf(AEQbTJ());
            SPUtils.put(str2, numValueOf, "OKABTestConfig");
        }
        Intrinsics.copydefault(numValueOf);
        return numValueOf.intValue();
    }

    public final int AEQbTJ() {
        return new java.security.SecureRandom().nextInt(100);
    }

    public final boolean OLrzqt(java.lang.String str) throws java.lang.InterruptedException {
        if (this.AhwBna) {
            java.lang.Boolean bool = this.djBIcL.get(str);
            pUU.KWHzl("RemoteConfigGrayManager", "key : " + str + " will use Pandora control config, result: " + bool);
            return Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE);
        }
        int iKWHzl = KWHzl(str);
        int iEZpvd = EZpvd(str);
        return iEZpvd >= 0 && iKWHzl < iEZpvd;
    }

    public final int EZpvd(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault(str);
        C35207nqv c35207nqv = (C35207nqv) this.fetchVPNInfo.get((java.lang.Object) str);
        if (c35207nqv != null) {
            return c35207nqv.AEQbTJ();
        }
        return -1;
    }

    public final java.util.Set<java.lang.String> EZpvd() throws java.lang.InterruptedException {
        copydefault("get all keys");
        java.util.Set<java.lang.String> setKeySet = this.fetchVPNInfo.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "");
        return setKeySet;
    }

    public final void OLrzqt() {
        try {
            java.lang.String string = SPUtils.getString("sp_key_pandora_gray_config", "", "OKABTestConfig");
            if (C33129mqd.OLrzqt((java.lang.CharSequence) string)) {
                Intrinsics.copydefault((java.lang.Object) string);
                JsonObject jsonObjectOLrzqt = C33490mxT.OLrzqt(string);
                if (jsonObjectOLrzqt == null) {
                    return;
                }
                java.util.Set<java.lang.String> setKeySet = jsonObjectOLrzqt.keySet();
                Intrinsics.checkNotNullExpressionValue(setKeySet, "");
                for (java.lang.String str : setKeySet) {
                    this.djBIcL.put(str, java.lang.Boolean.valueOf(jsonObjectOLrzqt.get(str).getAsBoolean()));
                }
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            pUU.valueOf("RemoteConfigGrayManager", "buildPandoraConfigMap exception : " + Unit.INSTANCE);
        }
    }

    public final boolean djBIcL() throws java.lang.InterruptedException {
        checkInit$default(this, null, 1, null);
        return this.AhwBna;
    }

    public final void OLrzqt(boolean z) {
        checkInit$default(this, null, 1, null);
        this.AhwBna = z;
        SPUtils.put("sp_key_pandora_control_gray", java.lang.Boolean.valueOf(z), "OKABTestConfig");
    }

    public final java.util.Map<java.lang.String, java.lang.Boolean> gEmmrt() throws java.lang.InterruptedException {
        checkInit$default(this, null, 1, null);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(this.djBIcL);
        return concurrentHashMap;
    }

    public final void OLrzqt(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        checkInit$default(this, null, 1, null);
        pUU.KWHzl("RemoteConfigGrayManager", "set pandora config " + str + " : " + z);
        this.djBIcL.put(str, java.lang.Boolean.valueOf(z));
        SPUtils.put("sp_key_pandora_gray_config", this.djBIcL, "OKABTestConfig");
        InterfaceC35209nqx interfaceC35209nqx = this.OLrzqt.get(str);
        if (interfaceC35209nqx != null) {
            OLrzqt(str, interfaceC35209nqx);
        }
    }

    public static /* synthetic */ void checkInit$default(C35210nqy c35210nqy, java.lang.String str, int i, java.lang.Object obj) throws java.lang.InterruptedException {
        if ((i & 1) != 0) {
            str = "";
        }
        c35210nqy.copydefault(str);
    }

    public final void copydefault(java.lang.String str) throws java.lang.InterruptedException {
        if (!this.AYXKKw) {
            pUU.AEQbTJ("RemoteConfigGrayManager", "is not init, await " + str, new java.lang.Throwable());
            this.gEmmrt.await(300L, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        if (this.AYXKKw) {
            return;
        }
        pUU.AEQbTJ("RemoteConfigGrayManager", "still not init, get " + str, new java.lang.Throwable());
    }

    public final void DbNXlk() {
        valueOf().quitSafely();
    }

    /* JADX INFO: renamed from: o.nqy$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nqy.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
