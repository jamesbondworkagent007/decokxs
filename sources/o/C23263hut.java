package o;

import androidx.collection.ArrayMapKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.okinc.business.dexlogic.bean.MemeSimpleDexData;
import com.okinc.business.dexlogic.bean.TradeMode;
import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.TradeState;
import com.okinc.business.dexlogic.main.swap.trade.bean.BridgeClaimData;
import com.okinc.business.dexlogic.main.swap.trade.bean.MemeStateData;
import com.okinc.business.dexlogic.main.swap.trade.bean.RetryMemeParams;
import com.okinc.business.dexlogic.main.swap.trade.bean.StateData;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.WsHandle;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexlogic.track.enums.BusinessType;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC28108kPe;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.hut, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23263hut {
    public final Observer<TradeState> AEQbTJ;
    public final WsHandle AhwBna;
    public final MutableLiveData<java.lang.Boolean> EZpvd;
    public final android.os.Handler KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final Observer<MemeSimpleDexData> copydefault;
    public final MutableLiveData<java.lang.Boolean> gEmmrt;
    public final java.util.Set<java.lang.String> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C23263hut() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WsHandle AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> gEmmrt() {
        return this.gEmmrt;
    }

    public C23263hut(@NotNull WsHandle wsHandle) {
        Intrinsics.checkNotNullParameter(wsHandle, "");
        this.AhwBna = wsHandle;
        this.gEmmrt = new MutableLiveData<>();
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.huy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C23263hut.AEQbTJ();
            }
        });
        this.EZpvd = new MutableLiveData<>();
        this.KWHzl = new android.os.Handler(android.os.Looper.getMainLooper());
        this.valueOf = new LinkedHashSet();
        this.AEQbTJ = new Observer() { // from class: o.huz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C23263hut.EZpvd(this.OLrzqt, (TradeState) obj);
            }
        };
        this.copydefault = new Observer() { // from class: o.huw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C23263hut.OLrzqt(this.EZpvd, (MemeSimpleDexData) obj);
            }
        };
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.main.swap.trade.status.helper.WsHandle:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.dexlogic.main.swap.trade.status.helper.WsHandle:0x0008: CONSTRUCTOR ("default_trade") A[MD:(java.lang.String):void (m), WRAPPED] (LINE:48) call: com.okinc.business.dexlogic.main.swap.trade.status.helper.WsHandle.<init>(java.lang.String):void type: CONSTRUCTOR) : (r1v0 com.okinc.business.dexlogic.main.swap.trade.status.helper.WsHandle))
 A[MD:(com.okinc.business.dexlogic.main.swap.trade.status.helper.WsHandle):void (m)] (LINE:47) call: o.hut.<init>(com.okinc.business.dexlogic.main.swap.trade.status.helper.WsHandle):void type: THIS */
    public /* synthetic */ C23263hut(WsHandle wsHandle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new WsHandle("default_trade") : wsHandle);
    }

    public final C25383ivg EZpvd() {
        return (C25383ivg) this.OLrzqt.getValue();
    }

    public static final C25383ivg AEQbTJ() {
        return ((InterfaceC25384ivh) C58114yvF.OLrzqt(C32979mnm.EZpvd.OLrzqt(), InterfaceC25384ivh.class)).sSMYrx();
    }

    public static final void EZpvd(C23263hut c23263hut, TradeState tradeState) {
        java.lang.String str;
        java.lang.String string;
        BridgeClaimData.NotificationType notificationType;
        Intrinsics.checkNotNullParameter(tradeState, "");
        kotlin.Pair<java.lang.String, java.lang.String> wsShowData = c23263hut.AhwBna.getWsShowData(tradeState);
        java.lang.String first = wsShowData.getFirst();
        java.lang.String second = wsShowData.getSecond();
        boolean zEZpvd = C22822hmc.EZpvd(tradeState.getStatus());
        if (tradeState.isHideToast()) {
            return;
        }
        if (tradeState.isBridgeClaimTx()) {
            java.lang.String toChainName = tradeState.getToChainName();
            java.lang.String toTokenSymbol = tradeState.getToTokenSymbol();
            java.lang.String tokenCode$default = C23271hvA.formatTokenCode$default(C23271hvA.copydefault, tradeState.getToAmount(), true, null, false, null, null, 30, null);
            java.lang.String orderId = tradeState.getOrderId();
            java.lang.String userWalletAddress = tradeState.getUserWalletAddress();
            if (Intrinsics.EZpvd((java.lang.Object) tradeState.getStatus(), (java.lang.Object) "200")) {
                notificationType = BridgeClaimData.NotificationType.BRIDGE_READY_TO_CLAIM;
            } else if (tradeState.successTx()) {
                notificationType = BridgeClaimData.NotificationType.BRIDGE_CLAIM_SUCCESS;
            } else {
                notificationType = BridgeClaimData.NotificationType.BRIDGE_CLAIM_FAIL;
            }
            C25352ivB.EZpvd(new BridgeClaimData(toChainName, toTokenSymbol, tokenCode$default, orderId, userWalletAddress, notificationType));
        } else if (tradeState.isSubmittingToast()) {
            if (Intrinsics.EZpvd((java.lang.Object) tradeState.getType(), (java.lang.Object) "approve")) {
                c23263hut.KWHzl(tradeState);
                if (Intrinsics.EZpvd((java.lang.Object) tradeState.getStatus(), (java.lang.Object) "-6")) {
                    string = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.setContentdefault, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("ccy", tradeState.getFromTokenSymbol())));
                } else {
                    string = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.BackHandlerKtBackHandler11, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("ccy", tradeState.getFromTokenSymbol())));
                }
            } else {
                string = C32979mnm.EZpvd.OLrzqt().getString(C23274hvD.Fragment.hasEnabledCallbacks);
                Intrinsics.copydefault((java.lang.Object) string);
            }
            C25352ivB.KWHzl(new StateData(false, "", string, true, (java.lang.String) null, tradeState.getUserWalletAddress(), 0, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 8144, (DefaultConstructorMarker) null));
        } else if (tradeState.isTerminalButGasdropRecieve()) {
            if (Intrinsics.EZpvd((java.lang.Object) tradeState.getSwapTradeType(), (java.lang.Object) "1")) {
                C28110kPg c28110kPg = C28110kPg.KWHzl;
                java.lang.String chainId = tradeState.getChainId();
                java.lang.String chainName = tradeState.getChainName();
                java.lang.Integer tradeMode = tradeState.getTradeMode();
                int type = TradeMode.AdvancedMode.getType();
                if (tradeMode != null && tradeMode.intValue() == type) {
                    str = "advanced";
                } else {
                    str = (tradeMode != null && tradeMode.intValue() == TradeMode.MemeMode.getType()) ? TabTitleInfo.KEY_MEME : "swap";
                }
                java.lang.String str2 = str;
                java.lang.String strEZpvd = c28110kPg.EZpvd(tradeState.getTransactionHash());
                java.lang.String str3 = strEZpvd == null ? "" : strEZpvd;
                InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = C22380heK.OLrzqt.copydefault(tradeState.getSource()).fARcdN().AEQbTJ();
                c28110kPg.copydefault(new AbstractC28108kPe.Application(new C28109kPf(chainId, chainName, str2, "swap", str3, interfaceC9738bbJAEQbTJ != null && interfaceC9738bbJAEQbTJ.RJOkX()), tradeState.getTransactionHash()));
            }
            if (tradeState.needShowTerminalDialog()) {
                StateData stateData = new StateData(tradeState.successTx(), first, second, false, tradeState.getStatus(), tradeState.getUserWalletAddress(), 0, tradeState.orderHasSurplus(), tradeState.getSurplusAmount(), tradeState.getSurplusValueUSD(), tradeState.getOrderId(), tradeState.getFromTokenSymbol(), tradeState.getToTokenSymbol(), 72, (DefaultConstructorMarker) null);
                if (tradeState.isMemeOrderType()) {
                    if (tradeState.isTerminalState() && !c23263hut.valueOf.add(tradeState.getTransactionHash())) {
                        return;
                    }
                    C25383ivg c25383ivgEZpvd = c23263hut.EZpvd();
                    java.lang.String status = tradeState.getStatus();
                    boolean zSuccessTx = tradeState.successTx();
                    java.lang.String userWalletAddress2 = tradeState.getUserWalletAddress();
                    java.lang.String chainId2 = tradeState.getChainId();
                    java.lang.String fromTokenAddress = tradeState.getFromTokenAddress();
                    java.lang.String toTokenAddress = tradeState.getToTokenAddress();
                    java.lang.String slippage = tradeState.getSlippage();
                    java.lang.String str4 = slippage == null ? "" : slippage;
                    java.lang.String priorityFee = tradeState.getPriorityFee();
                    java.lang.String str5 = priorityFee == null ? "" : priorityFee;
                    java.lang.Boolean customPriorityFee = tradeState.getCustomPriorityFee();
                    boolean zBooleanValue = customPriorityFee != null ? customPriorityFee.booleanValue() : false;
                    java.lang.String fromAmount = tradeState.getFromAmount();
                    java.lang.String orderId2 = tradeState.getOrderId();
                    boolean enableJito = tradeState.getEnableJito();
                    java.lang.String gasPrice = tradeState.getGasPrice();
                    java.lang.String str6 = gasPrice == null ? "" : gasPrice;
                    java.lang.String priorityFeeType = tradeState.getPriorityFeeType();
                    c25383ivgEZpvd.OLrzqt(new MemeStateData(zSuccessTx, first, second, false, status, userWalletAddress2, new RetryMemeParams(chainId2, fromTokenAddress, toTokenAddress, str4, str5, str6, java.lang.Boolean.valueOf(zBooleanValue), fromAmount, orderId2, tradeState.getFromTokenSymbol(), enableJito, tradeState.getMevInfo(), tradeState.isMemeTimeOut(), tradeState.getRouterModeType(), priorityFeeType, tradeState.getCustomSlippage(), tradeState.getMaxSlippage(), tradeState.getSlippageType(), tradeState.getExchangeDirection()), 0, tradeState.orderHasSurplus(), tradeState.getSurplusAmount(), tradeState.getSurplusValueUSD(), tradeState.getOrderId(), tradeState.getFromTokenSymbol(), tradeState.getToTokenSymbol(), CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, (DefaultConstructorMarker) null));
                    c23263hut.KWHzl(tradeState);
                } else if (tradeState.isAdvancedOrderType() && Intrinsics.EZpvd((java.lang.Object) tradeState.getChainId(), (java.lang.Object) "501") && C22416heu.DbNXlk()) {
                    return;
                } else {
                    C25352ivB.KWHzl(stateData);
                }
            }
            if (tradeState.needRefreshApproveState()) {
                c23263hut.EZpvd.setValue(java.lang.Boolean.TRUE);
            }
        } else if (tradeState.isMemeModeTimeOutToast()) {
            if (!c23263hut.valueOf.add(tradeState.getTransactionHash())) {
                return;
            }
            C25383ivg c25383ivgEZpvd2 = c23263hut.EZpvd();
            java.lang.String status2 = tradeState.getStatus();
            boolean zSuccessTx2 = tradeState.successTx();
            java.lang.String userWalletAddress3 = tradeState.getUserWalletAddress();
            java.lang.String chainId3 = tradeState.getChainId();
            java.lang.String fromTokenAddress2 = tradeState.getFromTokenAddress();
            java.lang.String toTokenAddress2 = tradeState.getToTokenAddress();
            java.lang.String slippage2 = tradeState.getSlippage();
            java.lang.String str7 = slippage2 == null ? "" : slippage2;
            java.lang.String priorityFee2 = tradeState.getPriorityFee();
            java.lang.String str8 = priorityFee2 == null ? "" : priorityFee2;
            java.lang.String gasPrice2 = tradeState.getGasPrice();
            java.lang.String str9 = gasPrice2 == null ? "" : gasPrice2;
            c25383ivgEZpvd2.OLrzqt(new MemeStateData(zSuccessTx2, first, second, false, status2, userWalletAddress3, new RetryMemeParams(chainId3, fromTokenAddress2, toTokenAddress2, str7, str8, str9, tradeState.getCustomPriorityFee(), tradeState.getFromAmount(), tradeState.getOrderId(), tradeState.getFromTokenSymbol(), tradeState.getEnableJito(), tradeState.getMevInfo(), tradeState.isMemeTimeOut(), tradeState.getRouterModeType(), tradeState.getPriorityFeeType(), tradeState.getCustomSlippage(), tradeState.getMaxSlippage(), tradeState.getSlippageType(), tradeState.getExchangeDirection()), 0, tradeState.orderHasSurplus(), tradeState.getSurplusAmount(), tradeState.getSurplusValueUSD(), tradeState.getOrderId(), tradeState.getFromTokenSymbol(), tradeState.getToTokenSymbol(), CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, (DefaultConstructorMarker) null));
        }
        if (tradeState.isSolRedPoint() && zEZpvd) {
            c23263hut.gEmmrt.setValue(java.lang.Boolean.TRUE);
        }
    }

    public static final void OLrzqt(C23263hut c23263hut, MemeSimpleDexData memeSimpleDexData) {
        Intrinsics.checkNotNullParameter(memeSimpleDexData, "");
        if (c23263hut.valueOf.add(memeSimpleDexData.getTransactionHash())) {
            c23263hut.EZpvd().copydefault(memeSimpleDexData);
            c23263hut.AEQbTJ(memeSimpleDexData);
            C23243huZ.OLrzqt(DexTrackEventParameter.TxStatus.SUCCESS.getStatus());
        }
    }

    public final void AEQbTJ(MemeSimpleDexData memeSimpleDexData) {
        C22877hne.OLrzqt.copydefault(memeSimpleDexData.getChainId(), memeSimpleDexData.getTransactionHash(), BusinessType.MEME.getValue());
    }

    public final void KWHzl(TradeState tradeState) {
        if (tradeState.successTx()) {
            C22877hne.OLrzqt.AEQbTJ(tradeState.getChainId(), tradeState.getChainName(), tradeState.getTransactionHash(), BusinessType.MEME.getValue());
        }
    }

    public final void KWHzl() {
        this.AhwBna.subWs();
        if (!this.AhwBna.getInnerTradeState().hasActiveObservers()) {
            this.AhwBna.getInnerTradeState().observeForever(this.AEQbTJ);
        }
        if (this.AhwBna.getMemeSimpleTradeState().hasActiveObservers()) {
            return;
        }
        this.AhwBna.getMemeSimpleTradeState().observeForever(this.copydefault);
    }

    public final void valueOf() {
        this.AhwBna.releaseData();
        this.AhwBna.getInnerTradeState().removeObserver(this.AEQbTJ);
        this.AhwBna.getMemeSimpleTradeState().removeObserver(this.copydefault);
        this.KWHzl.removeCallbacksAndMessages(null);
        this.valueOf.clear();
    }
}
