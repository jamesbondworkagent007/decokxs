package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.InputDeviceCompat;
import com.okinc.business.dexlogic.bean.CrossChainBridgeRulesRequest;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexQuoteBridgeVO;
import com.okinc.business.dexlogic.bean.PathSelectionRouterItem;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.RepeatSubOrderRequest;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import com.okinc.wallet.api.WalletDexService;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hrW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23081hrW {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public TradeInputGroup AEQbTJ;
    public boolean EZpvd;
    public final C22823hmd KWHzl;
    public QuotePriceRes copydefault;
    public java.lang.Object djBIcL;
    public final AbstractC23101hrq gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull QuotePriceRes quotePriceRes) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        this.copydefault = quotePriceRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuotePriceRes KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22823hmd OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull TradeInputGroup tradeInputGroup) {
        Intrinsics.checkNotNullParameter(tradeInputGroup, "");
        this.AEQbTJ = tradeInputGroup;
    }

    public C23081hrW(@NotNull C22823hmd c22823hmd, @NotNull AbstractC23101hrq abstractC23101hrq) {
        Intrinsics.checkNotNullParameter(c22823hmd, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        this.KWHzl = c22823hmd;
        this.gEmmrt = abstractC23101hrq;
        this.djBIcL = new java.lang.Object();
        this.EZpvd = true;
    }

    /* JADX INFO: renamed from: o.hrW$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hrW.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final java.lang.String EZpvd(@NotNull QuotePriceRes quotePriceRes) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        if (this.gEmmrt.fdOvFl()) {
            WalletDexService.FeeInfo value = this.gEmmrt.RlQdEF().getBtcFreeGasLiveData().getValue();
            java.lang.String feeCurrencyValue = value != null ? value.getFeeCurrencyValue() : null;
            return feeCurrencyValue == null ? "" : feeCurrencyValue;
        }
        if (quotePriceRes.isSingle()) {
            return quotePriceRes.quoteNetWorkFeeOfMoney();
        }
        return quotePriceRes.fromSwapFeeUsd();
    }

    public final boolean copydefault(@NotNull QuotePriceRes quotePriceRes) {
        WalletDexService.FeeInfo value;
        java.lang.String feeCurrencyValue;
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        return !this.gEmmrt.fdOvFl() ? !quotePriceRes.isSingle() ? quotePriceRes.fromSwapFeeUsd().length() == 0 : quotePriceRes.quoteNetWorkFeeOfMoney().length() == 0 : (value = this.gEmmrt.RlQdEF().getBtcFreeGasLiveData().getValue()) == null || (feeCurrencyValue = value.getFeeCurrencyValue()) == null || feeCurrencyValue.length() != 0;
    }

    public final java.lang.String EZpvd(@NotNull QuotePriceRes quotePriceRes, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (this.gEmmrt.getNewProxyInstance() != null) {
            return AEQbTJ(EZpvd(quotePriceRes), str, z);
        }
        return OLrzqt(str, z);
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2, boolean z) {
        if (C23313hvq.OLrzqt(str, 0)) {
            java.lang.String showDataWithPrefix$default = C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, str, false, false, RoundingMode.DOWN, false, 20, null);
            return (z ? "≈" : "") + showDataWithPrefix$default;
        }
        return getDefaultGasFee$default(this, str2, false, 2, null);
    }

    public static /* synthetic */ java.lang.String getDefaultGasFee$default(C23081hrW c23081hrW, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c23081hrW.OLrzqt(str, z);
    }

    public final java.lang.String OLrzqt(java.lang.String str, boolean z) {
        return (z ? "≈" : "") + C23272hvB.KWHzl.OLrzqt().getSymbol() + "0";
    }

    public final boolean EZpvd() {
        return (this.AEQbTJ != null) & (this.copydefault != null) & (this.gEmmrt.getNewProxyInstance() != null);
    }

    public static /* synthetic */ C23077hrS getLabelData$default(C23081hrW c23081hrW, TradeInputGroup tradeInputGroup, QuotePriceRes quotePriceRes, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = " ";
        }
        return c23081hrW.AEQbTJ(tradeInputGroup, quotePriceRes, str);
    }

    public final C23077hrS AEQbTJ(@NotNull TradeInputGroup tradeInputGroup, @NotNull QuotePriceRes quotePriceRes, @NotNull java.lang.String str) {
        java.lang.String strDivCheckS$default;
        java.lang.String str2;
        kotlin.Pair pairOLrzqt;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        Intrinsics.checkNotNullParameter(tradeInputGroup, "");
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(str, "");
        DexMultiTokenInfoBean data = tradeInputGroup.getFromData().getData().getCoinData().getData();
        DexMultiTokenInfoBean data2 = tradeInputGroup.getToData().getData().getCoinData().getData();
        boolean zValueOf = C23313hvq.valueOf(quotePriceRes.receiveAmount(), 0);
        java.lang.String strDivCheckS$default2 = C23313hvq.divCheckS$default(quotePriceRes.getCommonDexInfo().getFromTokenPrice(), quotePriceRes.getCommonDexInfo().getFromTokenAmount(), null, null, null, 14, null);
        if (quotePriceRes.isBridge()) {
            java.lang.String tokenPrice = quotePriceRes.toTokenPrice();
            PathSelectionRouterItem selectRouterItem$default = QuotePriceRes.getSelectRouterItem$default(quotePriceRes, null, 1, null);
            strDivCheckS$default = C23313hvq.divCheckS$default(tokenPrice, selectRouterItem$default != null ? selectRouterItem$default.getReceiveAmount() : null, null, null, null, 14, null);
        } else {
            java.lang.String tokenPrice2 = quotePriceRes.toTokenPrice();
            DeFiPlatformForSwap selectedDeFiPlatform = quotePriceRes.getSelectedDeFiPlatform();
            strDivCheckS$default = C23313hvq.divCheckS$default(tokenPrice2, selectedDeFiPlatform != null ? selectedDeFiPlatform.getReceiveAmount() : null, null, null, null, 14, null);
        }
        java.lang.String str6 = strDivCheckS$default;
        C43246rlf c43246rlf = C43246rlf.OLrzqt;
        if (C55296xhK.OLrzqt(c43246rlf.valueOf())) {
            if (this.EZpvd) {
                java.lang.String strDivCheckS$default3 = C23313hvq.divCheckS$default(quotePriceRes.receiveAmount(), tradeInputGroup.getFromData().getData().getEditData().getData(), java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
                java.lang.String strAEQbTJ = C23322hvz.AEQbTJ(strDivCheckS$default3);
                java.lang.String strOLrzqt = OLrzqt(C23313hvq.mulCheckS$default(str6, strDivCheckS$default3, null, null, null, 14, null));
                if (zValueOf) {
                    java.lang.String strOLrzqt2 = C23319hvw.OLrzqt(data2 != null ? data2.getTokenSymbol() : null);
                    str5 = strOLrzqt2 + " --" + str + "≈" + str + C23319hvw.OLrzqt(data != null ? data.getTokenSymbol() : null) + " 1";
                } else {
                    java.lang.String strOLrzqt3 = C23319hvw.OLrzqt(data2 != null ? data2.getTokenSymbol() : null);
                    str5 = strOLrzqt3 + str + strAEQbTJ + str + "≈" + str + C23319hvw.OLrzqt(data != null ? data.getTokenSymbol() : null) + " 1";
                }
                pairOLrzqt = C56390yDp.OLrzqt(str5, strOLrzqt);
            } else {
                java.lang.String strDivCheckS$default4 = C23313hvq.divCheckS$default(tradeInputGroup.getFromData().getData().getEditData().getData(), quotePriceRes.receiveAmount(), java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
                java.lang.String strAEQbTJ2 = C23322hvz.AEQbTJ(strDivCheckS$default4);
                java.lang.String strOLrzqt4 = OLrzqt(C23313hvq.mulCheckS$default(strDivCheckS$default2, strDivCheckS$default4, null, null, null, 14, null));
                if (zValueOf) {
                    java.lang.String strOLrzqt5 = C23319hvw.OLrzqt(data != null ? data.getTokenSymbol() : null);
                    str4 = strOLrzqt5 + " --" + str + "≈" + str + C23319hvw.OLrzqt(data2 != null ? data2.getTokenSymbol() : null) + " 1";
                } else {
                    java.lang.String strOLrzqt6 = C23319hvw.OLrzqt(data != null ? data.getTokenSymbol() : null);
                    str4 = strOLrzqt6 + str + strAEQbTJ2 + str + "≈" + str + C23319hvw.OLrzqt(data2 != null ? data2.getTokenSymbol() : null) + " 1";
                }
                pairOLrzqt = C56390yDp.OLrzqt(str4, strOLrzqt4);
            }
        } else if (this.EZpvd) {
            java.lang.String strDivCheckS$default5 = C23313hvq.divCheckS$default(quotePriceRes.receiveAmount(), tradeInputGroup.getFromData().getData().getEditData().getData(), java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
            java.lang.String strAEQbTJ3 = C23322hvz.AEQbTJ(strDivCheckS$default5);
            java.lang.String strOLrzqt7 = OLrzqt(C23313hvq.mulCheckS$default(str6, strDivCheckS$default5, null, null, null, 14, null));
            if (zValueOf) {
                java.lang.String strOLrzqt8 = C23319hvw.OLrzqt(data != null ? data.getTokenSymbol() : null);
                str3 = "1 " + strOLrzqt8 + str + "≈" + str + "--" + C23319hvw.OLrzqt(data2 != null ? data2.getTokenSymbol() : null);
            } else {
                java.lang.String strOLrzqt9 = C23319hvw.OLrzqt(data != null ? data.getTokenSymbol() : null);
                str3 = "1 " + strOLrzqt9 + str + "≈" + str + strAEQbTJ3 + " " + C23319hvw.OLrzqt(data2 != null ? data2.getTokenSymbol() : null);
            }
            pairOLrzqt = C56390yDp.OLrzqt(str3, strOLrzqt7);
        } else {
            java.lang.String strDivCheckS$default6 = C23313hvq.divCheckS$default(tradeInputGroup.getFromData().getData().getEditData().getData(), quotePriceRes.receiveAmount(), java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
            java.lang.String strAEQbTJ4 = C23322hvz.AEQbTJ(strDivCheckS$default6);
            java.lang.String strOLrzqt10 = OLrzqt(C23313hvq.mulCheckS$default(strDivCheckS$default2, strDivCheckS$default6, null, null, null, 14, null));
            if (zValueOf) {
                java.lang.String strOLrzqt11 = C23319hvw.OLrzqt(data2 != null ? data2.getTokenSymbol() : null);
                str2 = "1 " + strOLrzqt11 + str + "≈" + str + "--" + C23319hvw.OLrzqt(data != null ? data.getTokenSymbol() : null);
            } else {
                java.lang.String strOLrzqt12 = C23319hvw.OLrzqt(data2 != null ? data2.getTokenSymbol() : null);
                str2 = "1 " + strOLrzqt12 + str + "≈" + str + strAEQbTJ4 + " " + C23319hvw.OLrzqt(data != null ? data.getTokenSymbol() : null);
            }
            pairOLrzqt = C56390yDp.OLrzqt(str2, strOLrzqt10);
        }
        return new C23077hrS((java.lang.String) pairOLrzqt.component1(), (java.lang.String) pairOLrzqt.component2(), C55296xhK.OLrzqt(c43246rlf.valueOf()));
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str) || !C23313hvq.OLrzqt(str, 0)) {
            return "";
        }
        return "(" + C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, true, null, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_POSITION_TYPE, null) + ")";
    }

    public final int copydefault() {
        if (this.gEmmrt.getNewProxyInstance() != null) {
            java.lang.String strOLrzqt = this.KWHzl.OLrzqt();
            if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "0")) {
                return 3;
            }
            if (!Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "1")) {
                return 1;
            }
        }
        return 2;
    }

    public final RepeatSubOrderRequest OLrzqt(@NotNull QuotePriceRes quotePriceRes) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        if (!EZpvd()) {
            return null;
        }
        TradeInputGroup tradeInputGroup = this.AEQbTJ;
        Intrinsics.copydefault(tradeInputGroup);
        DexMultiTokenInfoBean data = tradeInputGroup.getFromData().getData().getCoinData().getData();
        TradeInputGroup tradeInputGroup2 = this.AEQbTJ;
        Intrinsics.copydefault(tradeInputGroup2);
        DexMultiTokenInfoBean data2 = tradeInputGroup2.getToData().getData().getCoinData().getData();
        java.lang.String chainId = data != null ? data.getChainId() : null;
        java.lang.String str = chainId == null ? "" : chainId;
        java.lang.String originContractAddress = data != null ? data.getOriginContractAddress() : null;
        java.lang.String str2 = originContractAddress == null ? "" : originContractAddress;
        TradeInputGroup tradeInputGroup3 = this.AEQbTJ;
        Intrinsics.copydefault(tradeInputGroup3);
        java.lang.String strOLrzqt = C23311hvo.OLrzqt(tradeInputGroup3.getFromData().getData().getEditData().getData());
        java.lang.String originContractAddress2 = data2 != null ? data2.getOriginContractAddress() : null;
        return new RepeatSubOrderRequest(str, str2, strOLrzqt, originContractAddress2 == null ? "" : originContractAddress2, EZpvd(quotePriceRes));
    }

    public final CrossChainBridgeRulesRequest KWHzl(@NotNull QuotePriceRes quotePriceRes) {
        java.lang.String bridgeId;
        DexQuoteBridgeVO bridge;
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        if (!EZpvd()) {
            return null;
        }
        TradeInputGroup tradeInputGroup = this.AEQbTJ;
        Intrinsics.copydefault(tradeInputGroup);
        DexMultiTokenInfoBean data = tradeInputGroup.getFromData().getData().getCoinData().getData();
        TradeInputGroup tradeInputGroup2 = this.AEQbTJ;
        Intrinsics.copydefault(tradeInputGroup2);
        DexMultiTokenInfoBean data2 = tradeInputGroup2.getToData().getData().getCoinData().getData();
        java.lang.String chainId = data != null ? data.getChainId() : null;
        java.lang.String str = chainId == null ? "" : chainId;
        java.lang.String chainId2 = data2 != null ? data2.getChainId() : null;
        java.lang.String str2 = chainId2 == null ? "" : chainId2;
        java.lang.String originContractAddress = data != null ? data.getOriginContractAddress() : null;
        java.lang.String str3 = originContractAddress == null ? "" : originContractAddress;
        TradeInputGroup tradeInputGroup3 = this.AEQbTJ;
        Intrinsics.copydefault(tradeInputGroup3);
        java.lang.String strOLrzqt = C23311hvo.OLrzqt(tradeInputGroup3.getFromData().getData().getEditData().getData());
        java.lang.String originContractAddress2 = data2 != null ? data2.getOriginContractAddress() : null;
        java.lang.String str4 = originContractAddress2 == null ? "" : originContractAddress2;
        if (quotePriceRes.isCrossSwap()) {
            PathSelectionRouterItem selectRouterItem$default = QuotePriceRes.getSelectRouterItem$default(quotePriceRes, null, 1, null);
            if (selectRouterItem$default == null || (bridge = selectRouterItem$default.getBridge()) == null || (bridgeId = bridge.getBridgeId()) == null) {
                bridgeId = "3";
            }
        } else {
            bridgeId = "single_chain";
        }
        java.lang.String strEZpvd = EZpvd(quotePriceRes);
        float fDjBIcL = C33129mqd.djBIcL(strOLrzqt);
        float fDjBIcL2 = C33129mqd.djBIcL(strEZpvd);
        int iAhwBna = C33129mqd.AhwBna(bridgeId);
        java.lang.String strKWHzl = this.gEmmrt.finit().KWHzl();
        return new CrossChainBridgeRulesRequest((java.lang.String) null, fDjBIcL, iAhwBna, str, fDjBIcL2, str3, strKWHzl == null ? "" : strKWHzl, str2, str4, (java.lang.String) null, InputDeviceCompat.SOURCE_DPAD, (DefaultConstructorMarker) null);
    }

    public final void djBIcL() {
        C33050mpD.OLrzqt(this.djBIcL);
    }
}
