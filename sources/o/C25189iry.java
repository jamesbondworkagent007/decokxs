package o;

import androidx.collection.ArrayMapKt;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DefiMultiSwapOrderInfoReq;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.SwapOrderInfoReq;
import com.okinc.business.dexlogic.bean.TransactionBean;
import com.okinc.business.dexlogic.bean.UpdateMultiOrderInfo;
import com.okinc.business.dexlogic.error.OrderParamJsonParsingError;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.InterfaceC9736bbH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iry, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25189iry {
    public static final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.ReportDrawnKt, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("network", str)));
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.hvn.e$default(o.hvn, java.lang.String, java.lang.Object, java.lang.Throwable, int, java.lang.Object):void */
    public static final java.util.ArrayList<UpdateMultiOrderInfo> EZpvd(@NotNull java.lang.String str, @NotNull JsonObject jsonObject, boolean z, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        java.util.ArrayList<UpdateMultiOrderInfo> arrayList = new java.util.ArrayList<>();
        try {
            JsonArray asJsonArray = jsonObject.getAsJsonArray("transactionHash");
            JsonArray asJsonArray2 = jsonObject.getAsJsonArray("walletTxData");
            JsonArray asJsonArray3 = jsonObject.getAsJsonArray("bizId");
            int size = asJsonArray.size();
            for (int i = 0; i < size; i++) {
                java.lang.String str3 = str2 == null ? "" : str2;
                java.lang.String asString = asJsonArray.get(i).getAsString();
                Intrinsics.checkNotNullExpressionValue(asString, "");
                arrayList.add(new UpdateMultiOrderInfo(str3, asString, asJsonArray2.get(i).getAsJsonObject(), asJsonArray3.get(i).getAsJsonArray(), null, 16, null));
            }
            if (arrayList.isEmpty()) {
                EZpvd(copydefault(str, z) + arrayList.size() + "->");
            }
        } catch (java.lang.Exception e) {
            EZpvd(copydefault(str, z));
            C23310hvn.e$default(C23310hvn.copydefault, "TradeConfirmHandle", android.util.Log.getStackTraceString(e), null, 4, null);
        }
        return arrayList;
    }

    public static final kotlin.Pair<JsonObject, java.lang.String> EZpvd(@NotNull java.lang.String str, @NotNull JsonObject jsonObject, boolean z) {
        java.lang.String asString = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        JsonObject asJsonObject = null;
        try {
            asJsonObject = jsonObject.getAsJsonObject("walletTxData");
            asString = jsonObject.get("transactionHash").getAsString();
            if (asJsonObject == null || asString.length() == 0) {
                EZpvd(copydefault(str, z) + "walletTxData=" + asJsonObject + "->transactionHash=" + asString + "->");
            }
        } catch (java.lang.Exception e) {
            EZpvd(copydefault(str, z));
            C23310hvn.e$default(C23310hvn.copydefault, "TradeConfirmHandle", android.util.Log.getStackTraceString(e), null, 4, null);
        }
        return C56390yDp.OLrzqt(asJsonObject, asString);
    }

    public static final java.lang.String KWHzl(@NotNull QuotePriceRes quotePriceRes) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        return C23313hvq.valueOf(quotePriceRes.minimumReceived(), 0) ? "--" : C23271hvA.getShowData$default(C23271hvA.copydefault, quotePriceRes.minimumReceived(), false, RoundingMode.DOWN, false, false, 26, null);
    }

    public static final C54845xXl KWHzl(@NotNull QuotePriceRes quotePriceRes, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(str, "");
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFromToken = quotePriceRes.fromToken();
        DexMultiTokenInfoBean token = quotePriceRes.toToken();
        boolean zValueOf = C23313hvq.valueOf(quotePriceRes.receiveAmount(), 0);
        C54845xXl c54845xXl = new C54845xXl("1", dexMultiTokenInfoBeanFromToken.getTokenSymbol(), zValueOf ? "--" : C23271hvA.getShowData$default(C23271hvA.copydefault, C23313hvq.divCheckS$default(quotePriceRes.receiveAmount(), quotePriceRes.getFromTokenAmount(false), java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null), false, null, false, false, 30, null), token.getTokenSymbol());
        C22380heK c22380heK = C22380heK.OLrzqt;
        c22380heK.copydefault(str).fARcdN().KWHzl(false, c54845xXl);
        c22380heK.copydefault(str).fARcdN().KWHzl(true, new C54845xXl("1", token.getTokenSymbol(), zValueOf ? "--" : C23271hvA.getShowData$default(C23271hvA.copydefault, C23313hvq.divCheckS$default(quotePriceRes.getFromTokenAmount(false), quotePriceRes.receiveAmount(), java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null), false, null, false, false, 30, null), dexMultiTokenInfoBeanFromToken.getTokenSymbol()));
        return c54845xXl;
    }

    public static final java.lang.String AEQbTJ(boolean z, @NotNull QuotePriceRes quotePriceRes) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        if (z) {
            return C23271hvA.getSwapFormatAmount$default(C23271hvA.copydefault, quotePriceRes.inputToTokenAmount(), null, 2, null);
        }
        return C23271hvA.getSwapFormatAmount$default(C23271hvA.copydefault, quotePriceRes.receiveAmount(), null, 2, null);
    }

    public static final java.lang.String KWHzl(boolean z, @NotNull QuotePriceRes quotePriceRes) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        java.lang.String strInputToTokenPrice = z ? quotePriceRes.inputToTokenPrice() : quotePriceRes.toTokenPrice();
        return C33129mqd.OLrzqt((java.lang.CharSequence) strInputToTokenPrice) ? C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, strInputToTokenPrice, false, false, RoundingMode.DOWN, false, 22, null) : "";
    }

    public static final java.lang.String OLrzqt(boolean z, @NotNull QuotePriceRes quotePriceRes) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        if (z) {
            return C23271hvA.getSwapFormatAmount$default(C23271hvA.copydefault, quotePriceRes.payAmount(), null, 2, null);
        }
        return C23271hvA.getSwapFormatAmount$default(C23271hvA.copydefault, quotePriceRes.getCommonDexInfo().getFromTokenAmount(), null, 2, null);
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.OLrzqt((java.lang.CharSequence) str) ? C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, str, false, false, RoundingMode.DOWN, false, 22, null) : "";
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AEQbTJ(@NotNull ResponseData<java.lang.Object> responseData, @NotNull final java.lang.String str, @NotNull final QuotePriceRes quotePriceRes, @NotNull final SwapOrderInfoReq swapOrderInfoReq, @NotNull java.lang.String str2, @NotNull final AbstractC22977hpY abstractC22977hpY, boolean z, InterfaceC9734bbF interfaceC9734bbF) {
        java.lang.String str3;
        java.lang.String strOLrzqt;
        kotlin.Pair pairOLrzqt;
        java.lang.String bridgeSelection;
        InterfaceC9731bbC interfaceC9731bbCEZpvd;
        java.lang.String spSlipPage;
        java.lang.String balanceBracket;
        java.lang.String string;
        java.lang.Object obj;
        Intrinsics.checkNotNullParameter(responseData, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(swapOrderInfoReq, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(abstractC22977hpY, "");
        try {
            java.lang.Object data = responseData.getData();
            java.util.Map map = data instanceof java.util.Map ? (java.util.Map) data : null;
            java.lang.Object obj2 = map != null ? map.get("saveOrderResult") : null;
            java.util.Map map2 = obj2 instanceof java.util.Map ? (java.util.Map) obj2 : null;
            java.lang.Object obj3 = map2 != null ? map2.get("data") : null;
            java.util.Map map3 = obj3 instanceof java.util.Map ? (java.util.Map) obj3 : null;
            if (map3 == null || (obj = map3.get("orderId")) == null) {
                string = "";
                str3 = string;
            } else {
                string = obj.toString();
                if (string == null) {
                }
                str3 = string;
            }
        } catch (java.lang.Exception unused) {
            str3 = "";
        }
        C22380heK c22380heK = C22380heK.OLrzqt;
        java.lang.String strOLrzqt2 = c22380heK.copydefault(str2).OLrzqt(z).OLrzqt();
        if (strOLrzqt2.length() == 0) {
            strOLrzqt2 = DexTrackEventParameter.AEQbTJ.OLrzqt(str2);
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFromToken = quotePriceRes.fromToken();
        DexMultiTokenInfoBean token = quotePriceRes.toToken();
        final java.lang.String originContractAddress = dexMultiTokenInfoBeanFromToken.getOriginContractAddress();
        final java.lang.String newFromTokenPrice = quotePriceRes.getNewFromTokenPrice();
        final java.lang.String originContractAddress2 = token.getOriginContractAddress();
        final java.lang.String tokenPrice = quotePriceRes.toTokenPrice();
        DexTrackEventParameter dexTrackEventParameter = DexTrackEventParameter.AEQbTJ;
        final java.lang.String strOLrzqt3 = dexTrackEventParameter.OLrzqt(quotePriceRes.isSingle());
        TransactionBean transactionBeanFJNWhG = abstractC22977hpY.fJNWhG();
        java.lang.String str4 = (transactionBeanFJNWhG == null || (balanceBracket = transactionBeanFJNWhG.getBalanceBracket()) == null) ? "" : balanceBracket;
        TransactionBean transactionBeanFJNWhG2 = abstractC22977hpY.fJNWhG();
        boolean zIsCustomSlippage = transactionBeanFJNWhG2 != null ? transactionBeanFJNWhG2.isCustomSlippage() : false;
        TransactionBean transactionBeanFJNWhG3 = abstractC22977hpY.fJNWhG();
        final java.lang.String strCopydefault = dexTrackEventParameter.copydefault(zIsCustomSlippage, (transactionBeanFJNWhG3 == null || (spSlipPage = transactionBeanFJNWhG3.getSpSlipPage()) == null) ? "" : spSlipPage);
        InterfaceC9752bbX value = abstractC22977hpY.fIwbmz().getValue();
        InterfaceC9749bbU interfaceC9749bbU = value instanceof InterfaceC9749bbU ? (InterfaceC9749bbU) value : null;
        java.lang.String strAEQbTJ = C23301hve.AEQbTJ(interfaceC9749bbU != null ? interfaceC9749bbU.copydefault() : 32);
        if (value == null || (interfaceC9731bbCEZpvd = value.EZpvd()) == null || (strOLrzqt = interfaceC9731bbCEZpvd.OLrzqt()) == null) {
            strOLrzqt = "";
        }
        final java.lang.String strCopydefault2 = dexTrackEventParameter.copydefault(strAEQbTJ, strOLrzqt);
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = c22380heK.copydefault(str2).fARcdN().AEQbTJ();
        InterfaceC9736bbH interfaceC9736bbH = interfaceC9734bbF instanceof InterfaceC9736bbH ? (InterfaceC9736bbH) interfaceC9734bbF : null;
        if (interfaceC9738bbJAEQbTJ != null && interfaceC9738bbJAEQbTJ.getFieldNames() && interfaceC9736bbH != null && interfaceC9736bbH.w_()) {
            java.lang.String strCopydefault3 = interfaceC9736bbH.copydefault(0, true);
            if (Intrinsics.EZpvd((java.lang.Object) InterfaceC9736bbH.StateListAnimator.getApproveAmount$default(interfaceC9736bbH, 0, false, 2, null), (java.lang.Object) "115792089237316195423570985008687907853269984665640564039457584007913129639935")) {
                pairOLrzqt = C56390yDp.OLrzqt("unlimited", "None");
            } else {
                pairOLrzqt = C56390yDp.OLrzqt("custom", strCopydefault3);
            }
        } else {
            pairOLrzqt = C56390yDp.OLrzqt("", "");
        }
        java.lang.String strEZpvd = (quotePriceRes.isSingle() && C22372heC.AEQbTJ(str2)) ? C24695iig.EZpvd(str2, z) : "";
        TransactionBean transactionBeanFJNWhG4 = abstractC22977hpY.fJNWhG();
        if (transactionBeanFJNWhG4 == null || (bridgeSelection = transactionBeanFJNWhG4.getBridgeSelection()) == null) {
            bridgeSelection = "";
        }
        final java.lang.String str5 = str3;
        final java.lang.String str6 = strOLrzqt2;
        final java.lang.String str7 = str4;
        final java.lang.String str8 = strEZpvd;
        final java.lang.String str9 = bridgeSelection;
        final kotlin.Pair pair = pairOLrzqt;
        C32866mlf.KWHzl("DEXSwap_Btm_Button_Click", (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.irz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj4) {
                return C25189iry.KWHzl(str5, quotePriceRes, swapOrderInfoReq, str6, originContractAddress, newFromTokenPrice, originContractAddress2, tokenPrice, strOLrzqt3, str7, strCopydefault, str8, str9, strCopydefault2, pair, abstractC22977hpY, (EventParamsList) obj4);
            }
        });
        C32866mlf.KWHzl("app_swap_save_order_interaction", (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.irB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj4) {
                return C25189iry.KWHzl(str, (EventParamsList) obj4);
            }
        });
    }

    public static final Unit KWHzl(java.lang.String str, QuotePriceRes quotePriceRes, SwapOrderInfoReq swapOrderInfoReq, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, kotlin.Pair pair, AbstractC22977hpY abstractC22977hpY, EventParamsList eventParamsList) {
        java.lang.String fromAmount;
        java.lang.String toAmount;
        java.util.List<DeFiPlatformForSwap> defiPlatformInfoList;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(OtcExtraKeys.ORDER_ID, str, false);
        java.lang.String tokenSymbol = quotePriceRes.fromToken().getTokenSymbol();
        if (tokenSymbol == null) {
            tokenSymbol = "";
        }
        eventParamsList.put("pay_symbol", tokenSymbol, false);
        DefiMultiSwapOrderInfoReq dexMultiMetaSaveOrderParam = swapOrderInfoReq.getDexMultiMetaSaveOrderParam();
        if (dexMultiMetaSaveOrderParam == null || (fromAmount = dexMultiMetaSaveOrderParam.getFromAmount()) == null) {
            fromAmount = "";
        }
        eventParamsList.put("pay_amount", fromAmount, false);
        java.lang.String tokenSymbol2 = quotePriceRes.toToken().getTokenSymbol();
        if (tokenSymbol2 == null) {
            tokenSymbol2 = "";
        }
        eventParamsList.put("receive_symbol", tokenSymbol2, false);
        DefiMultiSwapOrderInfoReq dexMultiMetaSaveOrderParam2 = swapOrderInfoReq.getDexMultiMetaSaveOrderParam();
        if (dexMultiMetaSaveOrderParam2 == null || (toAmount = dexMultiMetaSaveOrderParam2.getToAmount()) == null) {
            toAmount = "";
        }
        eventParamsList.put("receive_amount", toAmount, false);
        eventParamsList.put("source", str2, false);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, Web3SecurityTrackEvent.VALUE_CONFIRM, false);
        eventParamsList.put("business_type", "swap", true);
        eventParamsList.put("activity_name", "", true);
        eventParamsList.put("from_token_address", str3, true);
        eventParamsList.put("from_amount_usdt", str4, true);
        eventParamsList.put("to_token_address", str5, true);
        eventParamsList.put("to_amount_usdt", str6, true);
        eventParamsList.put("swap_type", str7, true);
        eventParamsList.put("balance_bracket", str8, true);
        eventParamsList.put("slippage", str9, true);
        eventParamsList.put("liquidity_source", str10, true);
        eventParamsList.put("bridge_selection", str11, true);
        eventParamsList.put("network_fee_details", str12, true);
        eventParamsList.put("authorize_amount", DexTrackEventParameter.AEQbTJ.AEQbTJ((java.lang.String) pair.getFirst(), (java.lang.String) pair.getSecond()), true);
        DeFiPlatformForSwap selectedDeFiPlatform = quotePriceRes.getSelectedDeFiPlatform();
        if (selectedDeFiPlatform != null) {
            QuotePriceRes quotePriceResAkhnZx = abstractC22977hpY.AkhnZx();
            java.lang.Integer numValueOf = (quotePriceResAkhnZx == null || (defiPlatformInfoList = quotePriceResAkhnZx.getDefiPlatformInfoList()) == null) ? null : java.lang.Integer.valueOf(defiPlatformInfoList.indexOf(selectedDeFiPlatform));
            int iIntValue = numValueOf != null ? numValueOf.intValue() + 1 : -1;
            java.lang.String name = selectedDeFiPlatform.getName();
            EventParamsList.put$default(eventParamsList, "provider_name", name != null ? name : "", false, 4, null);
            EventParamsList.put$default(eventParamsList, "best_price", (numValueOf != null && numValueOf.intValue() == 0) ? "yes" : "no", false, 4, null);
            java.lang.String reducePercent = selectedDeFiPlatform.getReducePercent();
            if (reducePercent != null) {
                EventParamsList.put$default(eventParamsList, "price_difference", C23311hvo.formatPercent$default(reducePercent, false, 0, 0, null, null, 30, null), false, 4, null);
            }
            EventParamsList.put$default(eventParamsList, "price_ranking", java.lang.String.valueOf(iIntValue), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("user_address", str, false);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C6777aVl.Companion.EZpvd(new OrderParamJsonParsingError(str));
    }

    public static final java.lang.String copydefault(java.lang.String str, boolean z) {
        InterfaceC22824hme interfaceC22824hmeOLrzqt = C22380heK.OLrzqt.copydefault(str).OLrzqt(z);
        DexMultiTokenInfoBean value = interfaceC22824hmeOLrzqt.KWHzl().getValue();
        java.lang.String chainId = value != null ? value.getChainId() : null;
        DexMultiTokenInfoBean value2 = interfaceC22824hmeOLrzqt.KWHzl().getValue();
        java.lang.String originContractAddress = value2 != null ? value2.getOriginContractAddress() : null;
        DexMultiTokenInfoBean value3 = interfaceC22824hmeOLrzqt.EZpvd().getValue();
        java.lang.String chainId2 = value3 != null ? value3.getChainId() : null;
        DexMultiTokenInfoBean value4 = interfaceC22824hmeOLrzqt.EZpvd().getValue();
        return "dex wallet json parsing exception:fromChainId=" + chainId + "->fromAddress=" + originContractAddress + "->toChainId=" + chainId2 + "->toAddress=" + (value4 != null ? value4.getOriginContractAddress() : null) + "->";
    }

    public static final void AEQbTJ(java.lang.String str) {
        if (str == null || str.length() == 0) {
            C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C23274hvD.Fragment.UscePu), 0, 1, (java.lang.Object) null);
        } else {
            C55326xho.toastWithFailedIcon$default(str, 0, 1, (java.lang.Object) null);
        }
    }
}
