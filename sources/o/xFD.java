package o;

import com.google.gson.JsonObject;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.DexAssets;
import com.okinc.unify_trade.biz.subscribe.DexAssetsResponse;
import com.okinc.unify_trade.core.ws.TradeDexAssetsWsTask$loadDexAssets$1;
import com.okinc.websocket.v5config.WsArgV5;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
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
import o.xHC;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xFD extends xGQ<DexAssetsResponse> {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.util.List<AbstractC55660xoD> AhwBna;
    public final LinkedBlockingDeque<java.lang.String> EZpvd;
    public final CoroutineScope OLrzqt;
    public AbstractC55660xoD copydefault;
    public DexAssetsResponse djBIcL;
    public AbstractC57556yke valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String gEmmrt() {
        return "release";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String valueOf() {
        return "request http success";
    }

    @Override // o.xGQ
    public boolean AhwBna() {
        return true;
    }

    public xFD(@NotNull java.lang.String str, AbstractC55660xoD abstractC55660xoD) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
        this.copydefault = abstractC55660xoD;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.AhwBna = arrayList;
        this.EZpvd = new LinkedBlockingDeque<>();
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.xFP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xFD.djBIcL();
            }
        });
        this.OLrzqt = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getMain().getImmediate()).plus(new CoroutineName("TradeDexAssetsWsTask")));
        isConnected();
        arrayList.add(this.copydefault);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xFD.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(@NotNull Function0<java.lang.String> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
        }

        private Application() {
        }

        public final void EZpvd(@NotNull Function0<java.lang.String> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            pUU.KWHzl("TradeDexAssetsWsTask", function0.invoke());
        }

        public final java.lang.String copydefault(@NotNull DexAssets dexAssets) {
            Intrinsics.checkNotNullParameter(dexAssets, "");
            return "symbol:" + dexAssets.getSymbol() + ",chainIndex:" + dexAssets.getChainIndex() + ",tokenAddress:" + dexAssets.getTokenAddress() + ",balance:" + dexAssets.getBalance() + ",balanceUsd:" + dexAssets.getBalanceUsd() + ",price:" + dexAssets.getPrice() + ",unrealizedProfit:" + dexAssets.getUnrealizedProfit() + ",unrealizedProfitPercentage:" + dexAssets.getUnrealizedProfitPercentage() + ",balanceTag:" + dexAssets.getBalanceTag() + ",riskLevel:" + dexAssets.getRiskLevel() + ",cefiSupport:" + dexAssets.getCefiSupport() + ",isPnlSupported:" + dexAssets.isPnlSupported();
        }

        public final java.lang.String EZpvd(@NotNull xHC.ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            return "symbol:" + actionBar.AuCTelauCTel() + ",chainIndex:" + actionBar.djBIcL() + ",tokenAddress:" + actionBar.wlaJM() + ",balance:" + actionBar.OLrzqt() + ",balanceUsd:" + actionBar.KWHzl() + ",price:" + actionBar.AkhnZx() + ",unrealizedProfit:" + actionBar.ejfBZ() + ",unrealizedProfitPercentage:" + actionBar.fARcdN() + ",riskLevel:" + actionBar.getFieldNames() + ",isPnlSupported:" + actionBar.zsXlph();
        }
    }

    public final xHF DbNXlk() {
        return (xHF) this.AEQbTJ.getValue();
    }

    public static final xHF djBIcL() {
        return ((xHI) C58114yvF.OLrzqt(C43246rlf.OLrzqt.valueOf(), xHI.class)).DQzvGNdrmXxudrmXxu();
    }

    public final void isConnected() {
        if (C55697xoo.OLrzqt.isConnected()) {
            BuildersKt__Builders_commonKt.launch$default(this.OLrzqt, null, null, new TradeDexAssetsWsTask$loadDexAssets$1(this, null), 3, null);
        }
    }

    public static final java.lang.String OLrzqt(ResponseData responseData) {
        return "request http fail. message:" + responseData.getMsg() + " code:" + responseData.getCode();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xGQ.getWsListener$default(o.xGQ, java.lang.String, com.okinc.websocket.v5config.WsArgV5, kotlin.jvm.functions.Function1, int, java.lang.Object):o.yke */
    private final void fARcdN() {
        final JsonObject jsonObject = new JsonObject();
        AbstractC55660xoD abstractC55660xoD = this.copydefault;
        jsonObject.addProperty("limit", abstractC55660xoD != null ? java.lang.Integer.valueOf(abstractC55660xoD.copydefault()) : null);
        AbstractC55660xoD abstractC55660xoD2 = this.copydefault;
        jsonObject.addProperty("chainIndex", abstractC55660xoD2 != null ? abstractC55660xoD2.KWHzl() : null);
        AbstractC55660xoD abstractC55660xoD3 = this.copydefault;
        jsonObject.addProperty("tokenAddress", abstractC55660xoD3 != null ? abstractC55660xoD3.djBIcL() : null);
        AbstractC55660xoD abstractC55660xoD4 = this.copydefault;
        jsonObject.addProperty("hideSmallBalance", (abstractC55660xoD4 == null || !abstractC55660xoD4.OLrzqt()) ? "0" : "1");
        WsArgV5 wsArgV5 = new WsArgV5("trade-dex-assets", null, null, null, null, null, null, jsonObject, WebSocketProtocol.PAYLOAD_SHORT, null);
        Companion.EZpvd(new Function0() { // from class: o.xFH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xFD.EZpvd(jsonObject);
            }
        });
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, "trade-dex-assets", wsArgV5, (Function1) null, 4, (java.lang.Object) null);
        this.valueOf = wsListener$default;
        if (wsListener$default != null) {
            wsListener$default.AhwBna();
        }
        KWHzl(700L);
    }

    public static final java.lang.String EZpvd(JsonObject jsonObject) {
        return "subSocketTask extra:" + jsonObject;
    }

    public final void copydefault(@NotNull AbstractC55660xoD abstractC55660xoD) {
        Intrinsics.checkNotNullParameter(abstractC55660xoD, "");
        DexAssetsResponse dexAssetsResponse = this.djBIcL;
        if (dexAssetsResponse != null) {
            abstractC55660xoD.AEQbTJ(dexAssetsResponse, "WebSocket", java.lang.Boolean.TRUE);
        }
        this.AhwBna.add(abstractC55660xoD);
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Companion.KWHzl(new Function0() { // from class: o.xFI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xFD.EZpvd(str);
            }
        });
        OLrzqt(true);
        this.EZpvd.add(str);
    }

    public static final java.lang.String EZpvd(java.lang.String str) {
        return "onMessage:" + str;
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
    public DexAssetsResponse bD_() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!this.EZpvd.isEmpty()) {
            arrayList.add(this.EZpvd.take());
        }
        java.util.Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            java.util.List<DexAssets> listAEQbTJ = DexAssetsResponse.Companion.AEQbTJ((java.lang.String) next);
            if (listAEQbTJ != null) {
                copydefault(CollectionsKt___CollectionsKt.QfsBiF(listAEQbTJ));
            }
        }
        Companion.KWHzl(new Function0() { // from class: o.xFM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xFD.OLrzqt(this.AEQbTJ);
            }
        });
        return this.djBIcL;
    }

    public static final java.lang.String OLrzqt(xFD xfd) {
        return "wsDataConvert:" + xfd.djBIcL;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(java.util.List<DexAssets> list) {
        DexAssetsResponse dexAssetsResponse = this.djBIcL;
        if (dexAssetsResponse == null) {
            return;
        }
        java.util.List<DexAssets> data = dexAssetsResponse.getData();
        if (data == null) {
            data = new java.util.ArrayList<>();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = data.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            DexAssets dexAssets = (DexAssets) it.next();
            kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(dexAssets != null ? dexAssets.getTokenAddress() : null, dexAssets != null ? dexAssets.getChainIndex() : null);
            if (pairOLrzqt != null) {
                arrayList.add(pairOLrzqt);
            }
        }
        java.util.Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
        for (java.lang.Object obj : list) {
            DexAssets dexAssets2 = (DexAssets) obj;
            linkedHashMap.put(C56390yDp.OLrzqt(dexAssets2.getTokenAddress(), dexAssets2.getChainIndex()), obj);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (DexAssets dexAssets3 : data) {
            if (dexAssets3 != null) {
                DexAssets dexAssets4 = (DexAssets) linkedHashMap.get(C56390yDp.OLrzqt(dexAssets3.getTokenAddress(), dexAssets3.getChainIndex()));
                if (dexAssets4 != null) {
                    dexAssets3 = C33129mqd.OLrzqt(dexAssets4.getBalance(), BigDecimal.ZERO) ? null : dexAssets4;
                }
            }
            if (dexAssets3 != null) {
                arrayList3.add(dexAssets3);
            }
        }
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList3);
        for (DexAssets dexAssets5 : list) {
            if (!setOqFWZa.contains(C56390yDp.OLrzqt(dexAssets5.getTokenAddress(), dexAssets5.getChainIndex()))) {
                arrayList2.add(dexAssets5);
            }
        }
        listFJNWhG.addAll(0, arrayList2);
        if (listFJNWhG.size() > 200) {
            listFJNWhG.subList(200, listFJNWhG.size()).clear();
        }
        java.util.List<DexAssets> data2 = dexAssetsResponse.getData();
        if (data2 != null) {
            data2.clear();
        }
        java.util.List<DexAssets> data3 = dexAssetsResponse.getData();
        if (data3 != null) {
            data3.addAll(listFJNWhG);
        }
        dexAssetsResponse.setTotalSize(java.lang.Integer.valueOf(listFJNWhG.size()));
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.xGQ
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull final DexAssetsResponse dexAssetsResponse) {
        Intrinsics.checkNotNullParameter(dexAssetsResponse, "");
        Companion.EZpvd(new Function0() { // from class: o.xFF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xFD.KWHzl(dexAssetsResponse);
            }
        });
        for (AbstractC55660xoD abstractC55660xoD : this.AhwBna) {
            if (abstractC55660xoD != null) {
                abstractC55660xoD.AEQbTJ(dexAssetsResponse, "WebSocket", java.lang.Boolean.TRUE);
            }
        }
    }

    public static final java.lang.String KWHzl(DexAssetsResponse dexAssetsResponse) {
        return "sendWsResult:" + dexAssetsResponse;
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj != null && (obj instanceof AbstractC55660xoD)) {
            java.util.Iterator<AbstractC55660xoD> it = this.AhwBna.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                AbstractC55660xoD next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) (next != null ? next.AhwBna() : null), (java.lang.Object) ((AbstractC55660xoD) obj).AhwBna())) {
                    break;
                }
                i++;
            }
            if (i != -1 && Intrinsics.EZpvd(this.AhwBna.remove(i), this.copydefault)) {
                this.copydefault = null;
            }
            if (this.AhwBna.size() == 0) {
                fetchVPNInfo();
                return true;
            }
        }
        return false;
    }

    public final void fetchVPNInfo() {
        Companion.EZpvd(new Function0() { // from class: o.xFJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xFD.gEmmrt();
            }
        });
        C54407xHg.Companion.EZpvd("trade-dex-assets", this.valueOf);
        AbstractC57556yke abstractC57556yke = this.valueOf;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        this.valueOf = null;
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        CoroutineScopeKt.cancel$default(this.OLrzqt, null, 1, null);
    }

    public final void EZpvd(final ResponseData<java.util.List<DexAssetsResponse>> responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.util.List<DexAssetsResponse> data = responseData.getData();
            if ((data != null ? (DexAssetsResponse) CollectionsKt___CollectionsKt.firstOrNull(data) : null) != null) {
                Companion.EZpvd(new Function0() { // from class: o.xFK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return xFD.valueOf();
                    }
                });
                java.util.List<DexAssetsResponse> data2 = responseData.getData();
                this.djBIcL = data2 != null ? (DexAssetsResponse) CollectionsKt___CollectionsKt.firstOrNull(data2) : null;
                AbstractC55660xoD abstractC55660xoD = this.copydefault;
                if (abstractC55660xoD != null) {
                    java.util.List<DexAssetsResponse> data3 = responseData.getData();
                    DexAssetsResponse dexAssetsResponse = data3 != null ? (DexAssetsResponse) CollectionsKt___CollectionsKt.firstOrNull(data3) : null;
                    Intrinsics.copydefault(dexAssetsResponse);
                    abstractC55660xoD.AEQbTJ(dexAssetsResponse, "http", java.lang.Boolean.TRUE);
                }
                fARcdN();
                return;
            }
        }
        Companion.EZpvd(new Function0() { // from class: o.xFL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xFD.OLrzqt(responseData);
            }
        });
        AbstractC55660xoD abstractC55660xoD2 = this.copydefault;
        if (abstractC55660xoD2 != null) {
            abstractC55660xoD2.AEQbTJ(new DexAssetsResponse(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null), "http", java.lang.Boolean.FALSE);
        }
    }
}
