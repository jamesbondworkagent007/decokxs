package com.okinc.business.dexlogic.main.swap.trade.status.helper;

import android.app.Application;
import androidx.collection.ArrayMap;
import androidx.collection.ArrayMapKt;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.business.dexlogic.bean.MemeSimpleDexData;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ChildOrder;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.TradeState;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.WsHandle;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23168htD;
import o.C23243huZ;
import o.C23256hum;
import o.C23262hus;
import o.C23271hvA;
import o.C23274hvD;
import o.C32979mnm;
import o.C33050mpD;
import o.C33069mpW;
import o.C33070mpX;
import o.C56390yDp;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class WsHandle {
    public static final int $stable = 8;
    private C23168htD dexWsClient;
    private final MutableLiveData<TradeState> innerTradeState;
    private final C23256hum mTypeFivePushHandleStrategy;
    private C23262hus mTypeOnePushHandleStrategy;
    private Object mainWallet;
    private final MutableLiveData<MemeSimpleDexData> memeSimpleTradeState;
    private final String sourceType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<TradeState> getInnerTradeState() {
        return this.innerTradeState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<MemeSimpleDexData> getMemeSimpleTradeState() {
        return this.memeSimpleTradeState;
    }

    public WsHandle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sourceType = str;
        this.innerTradeState = new MutableLiveData<>();
        this.memeSimpleTradeState = new MutableLiveData<>();
        this.mTypeOnePushHandleStrategy = new C23262hus();
        this.mTypeFivePushHandleStrategy = new C23256hum();
        this.dexWsClient = new C23168htD(str, new Function1() { // from class: o.hpo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WsHandle.dexWsClient$lambda$2(this.KWHzl, (java.lang.String) obj);
            }
        });
        this.mainWallet = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dexWsClient$lambda$2(final WsHandle wsHandle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String strOptString = new JSONObject(str).optString("type");
        if (Intrinsics.EZpvd((Object) strOptString, (Object) "1")) {
            wsHandle.mTypeOnePushHandleStrategy.copydefault(str, new Function1() { // from class: o.hpm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return WsHandle.dexWsClient$lambda$2$lambda$0(this.OLrzqt, (TradeState) obj);
                }
            });
        } else if (Intrinsics.EZpvd((Object) strOptString, (Object) "5")) {
            wsHandle.mTypeFivePushHandleStrategy.copydefault(str, new Function1() { // from class: o.hpq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return WsHandle.dexWsClient$lambda$2$lambda$1(this.OLrzqt, (MemeSimpleDexData) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dexWsClient$lambda$2$lambda$0(WsHandle wsHandle, TradeState tradeState) {
        Intrinsics.checkNotNullParameter(tradeState, "");
        wsHandle.innerTradeState.setValue(tradeState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dexWsClient$lambda$2$lambda$1(WsHandle wsHandle, MemeSimpleDexData memeSimpleDexData) {
        Intrinsics.checkNotNullParameter(memeSimpleDexData, "");
        wsHandle.memeSimpleTradeState.postValue(memeSimpleDexData);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [78=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Pair<String, String> getWsShowData(@NotNull TradeState tradeState) {
        Intrinsics.checkNotNullParameter(tradeState, "");
        String type = tradeState.getType();
        switch (type.hashCode()) {
            case -1756244349:
                if (type.equals("Unwrap")) {
                    return getOrderInfoPair(tradeState, tradeState.getExploreUrl(), "Unwrap");
                }
                break;
            case -793050291:
                if (type.equals("approve")) {
                    if (tradeState.successTx()) {
                        return C56390yDp.OLrzqt(tradeState.getExploreUrl(), C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.createSession, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("token", tradeState.getFromTokenSymbol()))));
                    }
                    if (tradeState.cancelApproveSuccess()) {
                        return C56390yDp.OLrzqt(tradeState.getExploreUrl(), C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.BackHandlerKtBackHandlerbackCallback11, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("ccy", tradeState.getFromTokenSymbol()))));
                    }
                    if (tradeState.cancelApproveFail()) {
                        return C56390yDp.OLrzqt(tradeState.getExploreUrl(), C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.ComponentActivityKt, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("ccy", tradeState.getFromTokenSymbol()))));
                    }
                    return C56390yDp.OLrzqt(tradeState.getExploreUrl(), C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.verifyToken, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("token", tradeState.getFromTokenSymbol()))));
                }
                break;
            case 110621028:
                if (type.equals(ExtJson.BRC20TYPE_TRADE)) {
                    if (Intrinsics.EZpvd((Object) tradeState.getSwapTradeType(), (Object) "1") || tradeState.isDefaultSwapType()) {
                        return getOrderInfoPair$default(this, tradeState, tradeState.getExploreUrl(), null, 4, null);
                    }
                    if (Intrinsics.EZpvd((Object) tradeState.getSwapTradeType(), (Object) "7")) {
                        if (tradeState.isMemeTimeOut()) {
                            return C56390yDp.OLrzqt("", C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.setSubscription, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("num", C23271hvA.formatTokenCode$default(C23271hvA.copydefault, tradeState.getFromAmount(), true, null, false, null, null, 30, null)), C56390yDp.OLrzqt("token1", tradeState.getFromTokenSymbol()), C56390yDp.OLrzqt("token2", tradeState.getToTokenSymbol()))));
                        }
                        if (!tradeState.getAssetDelay()) {
                            return getOrderInfoPair$default(this, tradeState, tradeState.getExploreUrl(), null, 4, null);
                        }
                        ChildOrder fromChildOrder = tradeState.getFromChildOrder();
                        Intrinsics.copydefault(fromChildOrder);
                        String exploreUrl = fromChildOrder.getExploreUrl();
                        Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
                        int i = C23274hvD.Fragment.setDescription;
                        C23271hvA c23271hvA = C23271hvA.copydefault;
                        return C56390yDp.OLrzqt(exploreUrl, C33069mpW.KWHzl(applicationOLrzqt, i, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("num1", C23271hvA.formatTokenCode$default(c23271hvA, tradeState.getFromAmount(), true, null, false, null, null, 30, null)), C56390yDp.OLrzqt("token1", tradeState.getFromTokenSymbol()), C56390yDp.OLrzqt("num2", C23271hvA.formatTokenCode$default(c23271hvA, tradeState.getToAmount(), true, null, false, null, null, 30, null)), C56390yDp.OLrzqt("token2", tradeState.getToTokenSymbol()))));
                    }
                    if (isFitChildOrderTerminalState(tradeState.getToChildOrder())) {
                        ChildOrder toChildOrder = tradeState.getToChildOrder();
                        Intrinsics.copydefault(toChildOrder);
                        return getOrderInfoPair$default(this, tradeState, toChildOrder.getExploreUrl(), null, 4, null);
                    }
                    if (isFitChildOrderTerminalState(tradeState.getBridgeChildOrder())) {
                        ChildOrder bridgeChildOrder = tradeState.getBridgeChildOrder();
                        Intrinsics.copydefault(bridgeChildOrder);
                        return getOrderInfoPair$default(this, tradeState, bridgeChildOrder.getExploreUrl(), null, 4, null);
                    }
                    if (!isFitChildOrderTerminalState(tradeState.getFromChildOrder())) {
                        return C56390yDp.OLrzqt("", C33070mpX.AYXKKw(C23274hvD.Fragment.tIwhY));
                    }
                    ChildOrder fromChildOrder2 = tradeState.getFromChildOrder();
                    Intrinsics.copydefault(fromChildOrder2);
                    return getOrderInfoPair$default(this, tradeState, fromChildOrder2.getExploreUrl(), null, 4, null);
                }
                break;
            case 331764763:
                if (type.equals("gasStation")) {
                    return getOrderInfoPair(tradeState, tradeState.getExploreUrl(), "gasStation");
                }
                break;
        }
        return C56390yDp.OLrzqt("", "");
    }

    public static /* synthetic */ Pair getOrderInfoPair$default(WsHandle wsHandle, TradeState tradeState, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        return wsHandle.getOrderInfoPair(tradeState, str, str2);
    }

    private final Pair<String, String> getOrderInfoPair(TradeState tradeState, String str, String str2) {
        if (tradeState.successTx()) {
            ArrayMap<String, String> messagePair = getMessagePair(tradeState);
            if (Intrinsics.EZpvd((Object) str2, (Object) "Unwrap")) {
                return C56390yDp.OLrzqt(str, C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.zAEkPU, messagePair));
            }
            C23243huZ.OLrzqt(DexTrackEventParameter.TxStatus.SUCCESS.getStatus());
            return C56390yDp.OLrzqt(str, C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.OnBackPressedDispatcher2, getMessagePairNew(tradeState)));
        }
        if (tradeState.canceledTx()) {
            return C56390yDp.OLrzqt("", C33070mpX.AYXKKw(C23274hvD.Fragment.getQueueTitle));
        }
        if (tradeState.isBridgeClaimTx()) {
            return C56390yDp.OLrzqt("", "");
        }
        if (Intrinsics.EZpvd((Object) str2, (Object) "Unwrap")) {
            return C56390yDp.OLrzqt(str, C33070mpX.AYXKKw(C23274hvD.Fragment.zKcAg));
        }
        if (Intrinsics.EZpvd((Object) str2, (Object) "gasStation")) {
            return C56390yDp.OLrzqt(str, C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.IKQXqd, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("nativeToken", tradeState.getToTokenSymbol()))));
        }
        C23243huZ.OLrzqt(DexTrackEventParameter.TxStatus.FAILURE.getStatus());
        return C56390yDp.OLrzqt(str, C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.OnBackPressedDispatcher, getFailMessagePair(tradeState)));
    }

    private final ArrayMap<String, String> getMessagePair(TradeState tradeState) {
        String fromTokenSymbol = tradeState.getFromTokenSymbol();
        String toTokenSymbol = tradeState.getToTokenSymbol();
        C23271hvA c23271hvA = C23271hvA.copydefault;
        return ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("fromBalance", C23271hvA.formatTokenCode$default(c23271hvA, tradeState.getFromAmount(), true, null, false, fromTokenSymbol, null, 22, null)), C56390yDp.OLrzqt("toBalance", C23271hvA.formatTokenCode$default(c23271hvA, tradeState.getToAmount(), true, null, false, toTokenSymbol, null, 22, null)));
    }

    private final ArrayMap<String, String> getMessagePairNew(TradeState tradeState) {
        C23271hvA c23271hvA = C23271hvA.copydefault;
        return ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("fromCount", C23271hvA.formatTokenCode$default(c23271hvA, tradeState.getFromAmount(), true, null, false, null, null, 30, null)), C56390yDp.OLrzqt("fromToken", tradeState.getFromTokenSymbol()), C56390yDp.OLrzqt("toCount", C23271hvA.formatTokenCode$default(c23271hvA, tradeState.getToAmount(), true, null, false, null, null, 30, null)), C56390yDp.OLrzqt("toToken", tradeState.getToTokenSymbol()));
    }

    private final ArrayMap<String, String> getFailMessagePair(TradeState tradeState) {
        return ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("fromCount", C23271hvA.formatTokenCode$default(C23271hvA.copydefault, tradeState.getFromAmount(), true, null, false, null, null, 30, null)), C56390yDp.OLrzqt("fromToken", tradeState.getFromTokenSymbol()), C56390yDp.OLrzqt("toToken", tradeState.getToTokenSymbol()));
    }

    private final boolean isFitChildOrderTerminalState(ChildOrder childOrder) {
        return childOrder != null && (Intrinsics.EZpvd((Object) childOrder.getStatus(), (Object) "1") || Intrinsics.EZpvd((Object) childOrder.getStatus(), (Object) MultiTransferSignData.DEFAULT_INTERVAL));
    }

    public final void unSubWs() {
        this.dexWsClient.copydefault();
    }

    public final void subWs() {
        this.dexWsClient.OLrzqt();
    }

    public final void releaseData() {
        unSubWs();
        C33050mpD.OLrzqt(this.mainWallet);
    }
}
