package o;

import com.google.gson.JsonObject;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.DexAssets;
import com.okinc.unify_trade.biz.subscribe.DexAssetsResponse;
import com.okinc.unify_trade.core.ws.TradeSingleDexAssetsWsTask$loadDexAsset$1;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xGm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54386xGm extends xGQ<DexAssets> {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final CoroutineScope AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.util.List<AbstractC55738xpc> AhwBna;
    public DexAssets KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final LinkedBlockingDeque<java.lang.String> copydefault;
    public AbstractC55738xpc djBIcL;
    public AbstractC57556yke gEmmrt;
    public JsonObject valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String djBIcL() {
        return "request http success";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String valueOf() {
        return "release";
    }

    @Override // o.xGQ
    public boolean AhwBna() {
        return true;
    }

    public C54386xGm(@NotNull java.lang.String str, AbstractC55738xpc abstractC55738xpc) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
        this.djBIcL = abstractC55738xpc;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.AhwBna = arrayList;
        this.copydefault = new LinkedBlockingDeque<>();
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.xGs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54386xGm.fetchVPNInfo();
            }
        });
        this.AEQbTJ = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getMain().getImmediate()).plus(new CoroutineName("TradeSingleDexAssetsWsTask")));
        gEmmrt();
        arrayList.add(this.djBIcL);
    }

    /* JADX INFO: renamed from: o.xGm$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xGm.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void KWHzl(@NotNull Function0<java.lang.String> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            pUU.KWHzl("TradeSingleDexAssetsWsTask", function0.invoke());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xHF isConnected() {
        return (xHF) this.OLrzqt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xHF fetchVPNInfo() {
        return ((xHI) C58114yvF.OLrzqt(C43246rlf.OLrzqt.valueOf(), xHI.class)).DQzvGNdrmXxudrmXxu();
    }

    public final void gEmmrt() {
        if (C55697xoo.OLrzqt.isConnected()) {
            BuildersKt__Builders_commonKt.launch$default(this.AEQbTJ, null, null, new TradeSingleDexAssetsWsTask$loadDexAsset$1(this, null), 3, null);
        }
    }

    public static final java.lang.String copydefault(ResponseData responseData) {
        return "request http fail. message:" + responseData.getMsg() + " code:" + responseData.getCode();
    }

    private final void fIwbmz() {
        JsonObject jsonObject = new JsonObject();
        this.valueOf = jsonObject;
        jsonObject.addProperty("limit", "1");
        JsonObject jsonObject2 = this.valueOf;
        if (jsonObject2 != null) {
            AbstractC55738xpc abstractC55738xpc = this.djBIcL;
            jsonObject2.addProperty("chainIndex", abstractC55738xpc != null ? abstractC55738xpc.KWHzl() : null);
        }
        JsonObject jsonObject3 = this.valueOf;
        if (jsonObject3 != null) {
            AbstractC55738xpc abstractC55738xpc2 = this.djBIcL;
            jsonObject3.addProperty("tokenAddress", abstractC55738xpc2 != null ? abstractC55738xpc2.OLrzqt() : null);
        }
        JsonObject jsonObject4 = this.valueOf;
        if (jsonObject4 != null) {
            jsonObject4.addProperty("hideSmallBalance", "0");
        }
        WsArgV5 wsArgV5 = new WsArgV5("trade-dex-asset", null, null, null, null, null, null, this.valueOf, WebSocketProtocol.PAYLOAD_SHORT, null);
        Companion.KWHzl(new Function0() { // from class: o.xGt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54386xGm.KWHzl(this.KWHzl);
            }
        });
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, "trade-dex-asset", wsArgV5, (Function1) null, 4, (java.lang.Object) null);
        this.gEmmrt = wsListener$default;
        if (wsListener$default != null) {
            wsListener$default.AhwBna();
        }
        KWHzl(700L);
    }

    public static final java.lang.String KWHzl(C54386xGm c54386xGm) {
        return "subSocketTask extra:" + c54386xGm.valueOf;
    }

    public final void AEQbTJ(@NotNull AbstractC55738xpc abstractC55738xpc) {
        Intrinsics.checkNotNullParameter(abstractC55738xpc, "");
        DexAssets dexAssets = this.KWHzl;
        if (dexAssets != null) {
            abstractC55738xpc.AEQbTJ(dexAssets, "WebSocket", java.lang.Boolean.TRUE);
        }
        this.AhwBna.add(abstractC55738xpc);
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Companion.KWHzl(new Function0() { // from class: o.xGu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54386xGm.OLrzqt(str);
            }
        });
        OLrzqt(true);
        this.copydefault.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String OLrzqt(java.lang.String str) {
        return "onMessage:" + str;
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: DbNXlk, reason: merged with bridge method [inline-methods] */
    public DexAssets bD_() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!this.copydefault.isEmpty()) {
            arrayList.add(this.copydefault.take());
        }
        java.util.Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            java.util.List<DexAssets> listAEQbTJ = DexAssetsResponse.Companion.AEQbTJ((java.lang.String) next);
            DexAssets dexAssets = null;
            java.lang.Object obj = null;
            if (listAEQbTJ != null) {
                java.util.Iterator<T> it2 = listAEQbTJ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    java.lang.Object next2 = it2.next();
                    DexAssets dexAssets2 = (DexAssets) next2;
                    java.lang.String chainIndex = dexAssets2 != null ? dexAssets2.getChainIndex() : null;
                    AbstractC55738xpc abstractC55738xpc = this.djBIcL;
                    if (Intrinsics.EZpvd((java.lang.Object) chainIndex, (java.lang.Object) (abstractC55738xpc != null ? abstractC55738xpc.KWHzl() : null))) {
                        java.lang.String tokenAddress = dexAssets2 != null ? dexAssets2.getTokenAddress() : null;
                        AbstractC55738xpc abstractC55738xpc2 = this.djBIcL;
                        if (Intrinsics.EZpvd((java.lang.Object) tokenAddress, (java.lang.Object) (abstractC55738xpc2 != null ? abstractC55738xpc2.OLrzqt() : null))) {
                            obj = next2;
                            break;
                        }
                    }
                }
                dexAssets = (DexAssets) obj;
            }
            this.KWHzl = dexAssets;
        }
        Companion.KWHzl(new Function0() { // from class: o.xGA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54386xGm.djBIcL(this.copydefault);
            }
        });
        DexAssets dexAssets3 = this.KWHzl;
        return dexAssets3 == null ? new DexAssets(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435455, null) : dexAssets3;
    }

    public static final java.lang.String djBIcL(C54386xGm c54386xGm) {
        return "wsDataConvert:" + c54386xGm.KWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.xGQ
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull final DexAssets dexAssets) {
        Intrinsics.checkNotNullParameter(dexAssets, "");
        Companion.KWHzl(new Function0() { // from class: o.xGv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54386xGm.EZpvd(dexAssets);
            }
        });
        for (AbstractC55738xpc abstractC55738xpc : this.AhwBna) {
            if (abstractC55738xpc != null) {
                abstractC55738xpc.AEQbTJ(dexAssets, "WebSocket", java.lang.Boolean.TRUE);
            }
        }
    }

    public static final java.lang.String EZpvd(DexAssets dexAssets) {
        return "sendWsResult:" + dexAssets;
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj != null && (obj instanceof AbstractC55738xpc)) {
            java.util.Iterator<AbstractC55738xpc> it = this.AhwBna.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                AbstractC55738xpc next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) (next != null ? next.AhwBna() : null), (java.lang.Object) ((AbstractC55738xpc) obj).AhwBna())) {
                    break;
                }
                i++;
            }
            if (i != -1 && Intrinsics.EZpvd(this.AhwBna.remove(i), this.djBIcL)) {
                this.djBIcL = null;
            }
            if (this.AhwBna.size() == 0) {
                values();
                return true;
            }
        }
        return false;
    }

    public final void values() {
        Companion.KWHzl(new Function0() { // from class: o.xGx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54386xGm.valueOf();
            }
        });
        C54407xHg.Companion.EZpvd("trade-dex-asset", this.gEmmrt);
        AbstractC57556yke abstractC57556yke = this.gEmmrt;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        this.gEmmrt = null;
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        this.valueOf = null;
        CoroutineScopeKt.cancel$default(this.AEQbTJ, null, 1, null);
    }

    public final void EZpvd(final ResponseData<java.util.List<DexAssets>> responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.util.List<DexAssets> data = responseData.getData();
            if ((data != null ? (DexAssets) CollectionsKt___CollectionsKt.firstOrNull(data) : null) != null) {
                Companion.KWHzl(new Function0() { // from class: o.xGo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C54386xGm.djBIcL();
                    }
                });
                java.util.List<DexAssets> data2 = responseData.getData();
                DexAssets dexAssets = data2 != null ? (DexAssets) CollectionsKt___CollectionsKt.firstOrNull(data2) : null;
                this.KWHzl = dexAssets;
                AbstractC55738xpc abstractC55738xpc = this.djBIcL;
                if (abstractC55738xpc != null) {
                    if (dexAssets == null) {
                        dexAssets = new DexAssets(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435455, null);
                    }
                    abstractC55738xpc.AEQbTJ(dexAssets, "http", java.lang.Boolean.TRUE);
                }
                fIwbmz();
                return;
            }
        }
        Companion.KWHzl(new Function0() { // from class: o.xGr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54386xGm.copydefault(responseData);
            }
        });
        AbstractC55738xpc abstractC55738xpc2 = this.djBIcL;
        if (abstractC55738xpc2 != null) {
            abstractC55738xpc2.AEQbTJ(new DexAssets(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435455, null), "http", java.lang.Boolean.FALSE);
        }
    }
}
