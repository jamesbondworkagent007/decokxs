package o;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.planet.biz_content.leaderboard.bean.SpotlightToken;
import com.okinc.planet.biz_content.leaderboard.ws.SpotlightPriceWsManager$emitPriceUpdate$1;
import com.okinc.websocket.connection.OKWsDoh;
import com.okinc.websocket.v5config.WsArgV5;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.InterfaceC9859bdY;

/* JADX INFO: renamed from: o.tvd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47730tvd {
    public final SharedFlow<java.util.Map<java.lang.String, java.lang.Object>> AhwBna;
    public final MutableSharedFlow<java.util.Map<java.lang.String, java.lang.Object>> EZpvd;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;
    public final CoroutineScope djBIcL = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getMain()));
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.tvb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C47730tvd.EZpvd();
        }
    });
    public final java.util.List<AbstractC57556yke> gEmmrt = Collections.synchronizedList(new java.util.ArrayList());
    public final java.util.List<AbstractC57556yke> OLrzqt = Collections.synchronizedList(new java.util.ArrayList());
    public final ConcurrentHashMap<java.lang.String, C47671tuX> valueOf = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<java.lang.String, C47670tuW> copydefault = new ConcurrentHashMap<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<java.util.Map<java.lang.String, java.lang.Object>> gEmmrt() {
        return this.AhwBna;
    }

    public C47730tvd() {
        MutableSharedFlow<java.util.Map<java.lang.String, java.lang.Object>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.AhwBna = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    /* JADX INFO: renamed from: o.tvd$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tvd.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final C57567ykp copydefault() {
        return (C57567ykp) this.KWHzl.getValue();
    }

    public static final C57567ykp EZpvd() {
        return new C57567ykp(new C57527ykB(C43292rmY.OLrzqt.zuBGHE() + "/ws/v5/ipublic", false, null, null, true, OKWsDoh.V5, 12, null));
    }

    public final void AEQbTJ(java.util.List<SpotlightToken> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AYXKKw();
        for (SpotlightToken spotlightToken : list) {
            java.lang.String type = spotlightToken.getType();
            if (type == null) {
                type = "cefi";
            }
            if (Intrinsics.EZpvd((java.lang.Object) type, (java.lang.Object) "cedefi")) {
                copydefault(spotlightToken);
            } else {
                KWHzl(spotlightToken);
            }
        }
    }

    public final void KWHzl(SpotlightToken spotlightToken) {
        java.lang.String instId = spotlightToken.getInstId();
        if (instId == null) {
            return;
        }
        java.lang.String instType = spotlightToken.getInstType();
        if (instType == null) {
            instType = "SPOT";
        }
        try {
            AbstractC57556yke abstractC57556ykeAEQbTJ = C57554ykc.Companion.AEQbTJ("tickers-3s", copydefault(), yDY.copydefault(new WsArgV5("tickers-3s", instId, null, instType, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null)), new Function2() { // from class: o.tvc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C47730tvd.copydefault(this.EZpvd, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
                }
            });
            abstractC57556ykeAEQbTJ.AhwBna();
            this.gEmmrt.add(abstractC57556ykeAEQbTJ);
            pUU.EZpvd("SpotlightPriceWs", "Subscribed to CEFI token: " + instId);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("SpotlightPriceWs", "Failed to subscribe CEFI token: " + instId, e);
        }
    }

    public static final Unit copydefault(C47730tvd c47730tvd, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        java.lang.Object payload = oKIncomingData.getPayload();
        c47730tvd.OLrzqt(payload instanceof java.lang.String ? (java.lang.String) payload : null);
        return Unit.INSTANCE;
    }

    public final void copydefault(SpotlightToken spotlightToken) {
        java.lang.String tokenContractAddress;
        java.lang.String chainId = spotlightToken.getChainId();
        if (chainId == null || (tokenContractAddress = spotlightToken.getTokenContractAddress()) == null) {
            return;
        }
        try {
            java.util.ArrayList<? extends InterfaceC57559ykh> arrayListCopydefault = yDY.copydefault(new WsArgV5ForWeb3("dex-market-v3", null, chainId, tokenContractAddress, null));
            InterfaceC9859bdY interfaceC9859bdY = (InterfaceC9859bdY) C43251rlk.OLrzqt(InterfaceC9859bdY.class);
            if (interfaceC9859bdY == null) {
                return;
            }
            AbstractC57556yke abstractC57556ykeAEQbTJ = C57554ykc.Companion.AEQbTJ("dex-market-v3", InterfaceC9859bdY.Application.walletPublicConnection$default(interfaceC9859bdY, false, 1, null), arrayListCopydefault, new Function2() { // from class: o.tve
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C47730tvd.EZpvd(this.AEQbTJ, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
                }
            });
            abstractC57556ykeAEQbTJ.AhwBna();
            this.OLrzqt.add(abstractC57556ykeAEQbTJ);
            pUU.EZpvd("SpotlightPriceWs", "Subscribed to CEDEFI token: " + chainId + "_" + tokenContractAddress);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("SpotlightPriceWs", "Failed to subscribe CEDEFI token: " + chainId + "_" + tokenContractAddress, e);
        }
    }

    public static final Unit EZpvd(C47730tvd c47730tvd, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        java.lang.Object payload = oKIncomingData.getPayload();
        c47730tvd.EZpvd(payload instanceof java.lang.String ? (java.lang.String) payload : null);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(java.lang.String str) {
        JsonObject asJsonObject;
        JsonElement jsonElement;
        java.lang.String asString;
        java.lang.String asString2;
        java.lang.String asString3;
        java.lang.String asString4;
        java.lang.String asString5;
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            JsonElement jsonElement2 = JsonParser.parseString(str).getAsJsonArray().get(0);
            if (jsonElement2 != null && (jsonElement = (asJsonObject = jsonElement2.getAsJsonObject()).get("instId")) != null && (asString = jsonElement.getAsString()) != null) {
                JsonElement jsonElement3 = asJsonObject.get("last");
                java.lang.Double dAuCTel = (jsonElement3 == null || (asString5 = jsonElement3.getAsString()) == null) ? null : C59443zhD.AuCTel(asString5);
                JsonElement jsonElement4 = asJsonObject.get("open24h");
                java.lang.Double dAuCTel2 = (jsonElement4 == null || (asString4 = jsonElement4.getAsString()) == null) ? null : C59443zhD.AuCTel(asString4);
                JsonElement jsonElement5 = asJsonObject.get("sodUtc0");
                java.lang.Double dAuCTel3 = (jsonElement5 == null || (asString3 = jsonElement5.getAsString()) == null) ? null : C59443zhD.AuCTel(asString3);
                JsonElement jsonElement6 = asJsonObject.get("sodUtc8");
                this.valueOf.put(asString, new C47671tuX(asString, dAuCTel, dAuCTel2, dAuCTel3, (jsonElement6 == null || (asString2 = jsonElement6.getAsString()) == null) ? null : C59443zhD.AuCTel(asString2)));
                OLrzqt();
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("SpotlightPriceWs", "Failed to parse CEFI response", e);
        }
    }

    public final void EZpvd(java.lang.String str) {
        JsonObject asJsonObject;
        JsonElement jsonElement;
        java.lang.String asString;
        JsonElement jsonElement2;
        java.lang.String asString2;
        java.lang.String asString3;
        java.lang.String asString4;
        java.lang.String asString5;
        java.lang.String asString6;
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            JsonElement jsonElement3 = JsonParser.parseString(str).getAsJsonArray().get(0);
            if (jsonElement3 != null && (jsonElement = (asJsonObject = jsonElement3.getAsJsonObject()).get("chainId")) != null && (asString = jsonElement.getAsString()) != null && (jsonElement2 = asJsonObject.get("tokenContractAddress")) != null && (asString2 = jsonElement2.getAsString()) != null) {
                java.lang.String str2 = asString + "_" + asString2;
                JsonElement jsonElement4 = asJsonObject.get(FirebaseAnalytics.Param.PRICE);
                java.lang.Double dAuCTel = (jsonElement4 == null || (asString6 = jsonElement4.getAsString()) == null) ? null : C59443zhD.AuCTel(asString6);
                JsonElement jsonElement5 = asJsonObject.get("changeUtc0");
                java.lang.Double dAuCTel2 = (jsonElement5 == null || (asString5 = jsonElement5.getAsString()) == null) ? null : C59443zhD.AuCTel(asString5);
                JsonElement jsonElement6 = asJsonObject.get("changeUtc8");
                java.lang.Double dAuCTel3 = (jsonElement6 == null || (asString4 = jsonElement6.getAsString()) == null) ? null : C59443zhD.AuCTel(asString4);
                JsonElement jsonElement7 = asJsonObject.get("change");
                this.copydefault.put(str2, new C47670tuW(str2, asString, asString2, dAuCTel, dAuCTel2, dAuCTel3, (jsonElement7 == null || (asString3 = jsonElement7.getAsString()) == null) ? null : C59443zhD.AuCTel(asString3)));
                OLrzqt();
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("SpotlightPriceWs", "Failed to parse CEDEFI response", e);
        }
    }

    public final void OLrzqt() {
        BuildersKt__Builders_commonKt.launch$default(this.djBIcL, null, null, new SpotlightPriceWsManager$emitPriceUpdate$1(new java.util.HashMap(this.valueOf), new java.util.HashMap(this.copydefault), this, null), 3, null);
    }

    public final void AYXKKw() {
        java.util.List<AbstractC57556yke> list = this.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(list, "");
        synchronized (list) {
            java.util.List<AbstractC57556yke> list2 = this.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(list2, "");
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                try {
                    ((AbstractC57556yke) it.next()).djBIcL();
                } catch (java.lang.Exception e) {
                    pUU.AEQbTJ("SpotlightPriceWs", "Failed to stop CEFI listener", e);
                }
            }
            this.gEmmrt.clear();
            Unit unit = Unit.INSTANCE;
        }
        java.util.List<AbstractC57556yke> list3 = this.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(list3, "");
        synchronized (list3) {
            java.util.List<AbstractC57556yke> list4 = this.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(list4, "");
            java.util.Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                try {
                    ((AbstractC57556yke) it2.next()).djBIcL();
                } catch (java.lang.Exception e2) {
                    pUU.AEQbTJ("SpotlightPriceWs", "Failed to stop CEDEFI listener", e2);
                }
            }
            this.OLrzqt.clear();
            Unit unit2 = Unit.INSTANCE;
        }
        this.valueOf.clear();
        this.copydefault.clear();
    }

    public final void AEQbTJ() {
        AYXKKw();
        CoroutineScopeKt.cancel$default(this.djBIcL, null, 1, null);
    }
}
