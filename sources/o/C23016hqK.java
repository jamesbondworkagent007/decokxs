package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.dex.trade.core.domain.model.common.MevConfig;
import com.okinc.business.dex.trade.core.domain.model.common.TeeSaStatus;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DefiMultiSwapOrderInfoReq;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.DexCrossChainRouterParam;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexQuoteBridgeVO;
import com.okinc.business.dexlogic.bean.DexRouterList;
import com.okinc.business.dexlogic.bean.MergeCallData;
import com.okinc.business.dexlogic.bean.Permit2Data;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.SwapOrderInfoReq;
import com.okinc.business.dexlogic.bean.TraceData;
import com.okinc.business.dexlogic.bean.TradeMode;
import com.okinc.business.dexlogic.bean.TransactionBean;
import com.okinc.business.dexlogic.bean.UnsignedSwapData;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hqK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23016hqK {
    public static final C23016hqK copydefault = new C23016hqK();

    private C23016hqK() {
    }

    /* JADX DEBUG: Type inference failed for r0v14. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Triple<o.bbF, java.lang.String, java.lang.Object>> */
    public final AbstractC58185ywX<Triple<InterfaceC9734bbF, java.lang.String, java.lang.Object>> KWHzl(@NotNull final QuotePriceRes quotePriceRes, @NotNull final AbstractC22974hpV abstractC22974hpV, final boolean z, @NotNull final AbstractC22977hpY abstractC22977hpY, @NotNull final MergeCallData mergeCallData, final java.lang.String str, @NotNull final TeeSaStatus teeSaStatus) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(abstractC22974hpV, "");
        Intrinsics.checkNotNullParameter(abstractC22977hpY, "");
        Intrinsics.checkNotNullParameter(mergeCallData, "");
        Intrinsics.checkNotNullParameter(teeSaStatus, "");
        final InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = C22380heK.OLrzqt.copydefault(abstractC22977hpY.fetchVPNInfo()).fARcdN().AEQbTJ();
        java.lang.String strEZpvd = abstractC22977hpY.EZpvd(quotePriceRes.fromToken().getChainId(), interfaceC9738bbJAEQbTJ);
        java.lang.String strFetchVPNInfo = abstractC22977hpY.fetchVPNInfo();
        TransactionBean transactionBeanFJNWhG = abstractC22977hpY.fJNWhG();
        UnsignedSwapData unsingedCallData = mergeCallData.getUnsingedCallData();
        final DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReqBuildSwapCallData$default = buildSwapCallData$default(this, strFetchVPNInfo, quotePriceRes, z, strEZpvd, transactionBeanFJNWhG, str, null, unsingedCallData != null ? unsingedCallData.getMevConfig() : null, null, 320, null);
        if (interfaceC9738bbJAEQbTJ == null) {
            abstractC22977hpY.DbNXlk().setValue(java.lang.Boolean.FALSE);
            AbstractC58185ywX<Triple<InterfaceC9734bbF, java.lang.String, java.lang.Object>> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new java.lang.Exception());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            return abstractC58185ywXAEQbTJ;
        }
        AbstractC58185ywX<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> abstractC58185ywXEZpvd = abstractC22974hpV.AEQbTJ(quotePriceRes, mergeCallData, strEZpvd, interfaceC9738bbJAEQbTJ.DbNXlk(), new Function1() { // from class: o.hqJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23016hqK.copydefault(abstractC22977hpY, abstractC22974hpV, z, str, mergeCallData, quotePriceRes, defiMultiSwapOrderInfoReqBuildSwapCallData$default, interfaceC9738bbJAEQbTJ, teeSaStatus, (NewCallbackBean) obj);
            }
        }).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.hqQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23016hqK.EZpvd((java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> abstractC58185ywXDjBIcL = abstractC58185ywXEZpvd.djBIcL(new InterfaceC58229yxO() { // from class: o.hqR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C23016hqK.OLrzqt(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.hqS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23016hqK.copydefault(quotePriceRes, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXDjBIcL.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hqP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C23016hqK.EZpvd(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final AbstractC58185ywX copydefault(AbstractC22977hpY abstractC22977hpY, AbstractC22974hpV abstractC22974hpV, boolean z, java.lang.String str, MergeCallData mergeCallData, QuotePriceRes quotePriceRes, DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReq, InterfaceC9738bbJ interfaceC9738bbJ, TeeSaStatus teeSaStatus, NewCallbackBean newCallbackBean) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        QuotePriceRes value = abstractC22977hpY.hDKMBd().getValue();
        if (value == null) {
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(199999, null, null, null, null, null, 62, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        UnsignedSwapData unsingedCallData = mergeCallData.getUnsingedCallData();
        MevConfig mevConfig = unsingedCallData != null ? unsingedCallData.getMevConfig() : null;
        UnsignedSwapData unsingedCallData2 = mergeCallData.getUnsingedCallData();
        SwapOrderInfoReq swapOrderInfoReqOLrzqt = abstractC22974hpV.OLrzqt(value, newCallbackBean, z, str, mevConfig, unsingedCallData2 != null ? unsingedCallData2.getOrderId() : null);
        if (C25352ivB.copydefault(swapOrderInfoReqOLrzqt.getDexMultiMetaSaveOrderParam(), abstractC22977hpY.fetchVPNInfo(), quotePriceRes, defiMultiSwapOrderInfoReq)) {
            AbstractC58185ywX abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(200000, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
            return abstractC58185ywXKWHzl2;
        }
        if (z) {
            new C23214htx((xWP) C43251rlk.copydefault(xWP.class)).KWHzl(new kYB().KWHzl(), value.fromToken().getChainId());
        }
        return abstractC22974hpV.OLrzqt(abstractC22977hpY.EZpvd(value.fromToken().getChainId(), interfaceC9738bbJ), value, newCallbackBean, swapOrderInfoReqOLrzqt, z, mergeCallData.getUnsingedCallData(), value.fromToken().getChainName(), teeSaStatus);
    }

    public static final kotlin.Pair EZpvd(java.lang.Throwable th) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(th, "");
        throw new java.lang.Exception();
    }

    public static final Triple EZpvd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Triple) function1.invoke(obj);
    }

    public static final kotlin.Pair OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final Triple copydefault(QuotePriceRes quotePriceRes, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return new Triple(pair.getFirst(), pair.getSecond(), quotePriceRes);
    }

    public static /* synthetic */ DefiMultiSwapOrderInfoReq buildSwapCallData$default(C23016hqK c23016hqK, java.lang.String str, QuotePriceRes quotePriceRes, boolean z, java.lang.String str2, TransactionBean transactionBean, java.lang.String str3, java.lang.Boolean bool, MevConfig mevConfig, C23212htv c23212htv, int i, java.lang.Object obj) {
        return c23016hqK.AEQbTJ(str, quotePriceRes, z, str2, transactionBean, str3, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : mevConfig, (i & 256) != 0 ? c23016hqK.KWHzl() : c23212htv);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012c A[PHI: r26
  0x012c: PHI (r26v4 java.lang.String) = (r26v2 java.lang.String), (r26v11 java.lang.String) binds: [B:60:0x012a, B:55:0x011e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012f A[PHI: r26
  0x012f: PHI (r26v9 java.lang.String) = (r26v2 java.lang.String), (r26v11 java.lang.String) binds: [B:60:0x012a, B:55:0x011e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DefiMultiSwapOrderInfoReq AEQbTJ(@NotNull java.lang.String str, @NotNull QuotePriceRes quotePriceRes, boolean z, @NotNull java.lang.String str2, TransactionBean transactionBean, java.lang.String str3, java.lang.Boolean bool, MevConfig mevConfig, @NotNull C23212htv c23212htv) {
        java.lang.String fromCoinAmountBalance;
        java.lang.String str4;
        java.lang.String maxSlippage;
        java.lang.String spSlipPage;
        java.lang.String strAutoSlippage;
        java.lang.String str5;
        Permit2Data permit2Data;
        DeFiPlatformForSwap selectedDeFiPlatform;
        java.lang.String receiveWalletAddress;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(c23212htv, "");
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFromToken = quotePriceRes.fromToken();
        DexMultiTokenInfoBean token = quotePriceRes.toToken();
        java.lang.String chainId = dexMultiTokenInfoBeanFromToken.getChainId();
        java.lang.String chainId2 = token.getChainId();
        java.lang.String originContractAddress = dexMultiTokenInfoBeanFromToken.getOriginContractAddress();
        java.lang.String fromTokenAmount = quotePriceRes.getCommonDexInfo().getFromTokenAmount();
        java.lang.String originContractAddress2 = token.getOriginContractAddress();
        java.lang.String strReceiveAmount = quotePriceRes.receiveAmount();
        java.lang.String decimals = dexMultiTokenInfoBeanFromToken.getDecimals();
        java.util.ArrayList<DexRouterList> arrayListDexRouterList = quotePriceRes.dexRouterList();
        java.util.ArrayList<DexRouterList> arrayListOriginDexRouterList = quotePriceRes.originDexRouterList();
        java.lang.String quoteType = quotePriceRes.getCommonDexInfo().getQuoteType();
        java.lang.String strEstimateGasFee = quotePriceRes.estimateGasFee();
        java.lang.String decimals2 = token.getDecimals();
        DexCrossChainRouterParam dexCrossChainRouterParam = new DexCrossChainRouterParam(quotePriceRes.fromDexRouterList(), quotePriceRes.bridge(), quotePriceRes.toDexRouterToList(), quotePriceRes.originFromDexRouterList());
        if (dexMultiTokenInfoBeanFromToken.isMainChainCoin()) {
            if (transactionBean == null || (fromCoinAmountBalance = transactionBean.getFromCoinAmountBalance()) == null) {
                str4 = "";
            }
            C22380heK c22380heK = C22380heK.OLrzqt;
            C22397heb c22397hebDjBIcL = c22380heK.copydefault(str).OLrzqt(z).djBIcL();
            InterfaceC23194htd interfaceC23194htdFARcdN = c22380heK.copydefault(str).fARcdN();
            java.lang.String str6 = (transactionBean != null || (receiveWalletAddress = transactionBean.getReceiveWalletAddress()) == null) ? "" : receiveWalletAddress;
            DexQuoteBridgeVO dexQuoteBridgeVOBridge = quotePriceRes.bridge();
            java.lang.String bridgeId = dexQuoteBridgeVOBridge == null ? dexQuoteBridgeVOBridge.getBridgeId() : null;
            java.lang.String priorityFee = transactionBean == null ? transactionBean.getPriorityFee() : null;
            java.lang.Boolean customPriorityFee = transactionBean == null ? transactionBean.getCustomPriorityFee() : null;
            ServiceFeeInfo serviceFeeInfo = transactionBean == null ? transactionBean.getServiceFeeInfo() : null;
            if (transactionBean == null) {
                maxSlippage = null;
            } else {
                TransactionBean transactionBean2 = transactionBean.getSlippageMode() == SlippageMode.Dynamic ? transactionBean : null;
                if (transactionBean2 != null) {
                    maxSlippage = transactionBean2.getMaxSlippage();
                }
            }
            boolean z2 = (transactionBean == null ? transactionBean.getSlippageMode() : null) != SlippageMode.Dynamic;
            spSlipPage = transactionBean == null ? transactionBean.getSpSlipPage() : null;
            if (spSlipPage == null) {
                spSlipPage = "";
            }
            if (!quotePriceRes.isSingle()) {
                strAutoSlippage = z2 ? quotePriceRes.autoSlippage() : null;
                str5 = z2 ? null : spSlipPage;
            } else {
                strAutoSlippage = z2 ? quotePriceRes.autoSlippage() : spSlipPage;
                if (z2) {
                }
            }
            if (strAutoSlippage == null) {
                strAutoSlippage = "";
            }
            if (!quotePriceRes.isSingle()) {
                maxSlippage = null;
            }
            DexAutoSlippageInfoParam dexAutoSlippageInfoParamAutoSlippageInfo = quotePriceRes.autoSlippageInfo();
            java.lang.String strAEQbTJ = c22397hebDjBIcL == null ? c22397hebDjBIcL.AEQbTJ() : null;
            java.lang.String strKWHzl = c22397hebDjBIcL == null ? c22397hebDjBIcL.KWHzl() : null;
            java.lang.String strCopydefault = interfaceC23194htdFARcdN.copydefault();
            java.lang.String strAhwBna = interfaceC23194htdFARcdN.AhwBna();
            java.lang.String strMinimumReceived = quotePriceRes.minimumReceived();
            java.lang.String mevInfo = transactionBean == null ? transactionBean.getMevInfo() : null;
            java.lang.String str7 = mevInfo != null ? "" : mevInfo;
            boolean openMev = transactionBean == null ? transactionBean.getOpenMev() : false;
            java.lang.String defiPlatformId = (z || (selectedDeFiPlatform = quotePriceRes.getSelectedDeFiPlatform()) == null) ? null : selectedDeFiPlatform.getDefiPlatformId();
            DeFiPlatformForSwap selectedDeFiPlatform2 = quotePriceRes.getSelectedDeFiPlatform();
            java.lang.String unsignedTx = (selectedDeFiPlatform2 != null || (permit2Data = selectedDeFiPlatform2.getPermit2Data()) == null) ? null : permit2Data.getUnsignedTx();
            int tradeModeValue = transactionBean == null ? transactionBean.getTradeModeValue() : TradeMode.SwapMode.getType();
            java.lang.Boolean bool2 = !quotePriceRes.isSingle() ? null : bool;
            TraceData traceData = quotePriceRes.getTraceData();
            DeFiPlatformForSwap selectedDeFiPlatform3 = quotePriceRes.getSelectedDeFiPlatform();
            java.lang.String quoteData = selectedDeFiPlatform3 == null ? selectedDeFiPlatform3.getQuoteData() : null;
            return new DefiMultiSwapOrderInfoReq(chainId, originContractAddress, fromTokenAmount, originContractAddress2, strReceiveAmount, str2, strAutoSlippage, maxSlippage, decimals, (java.lang.Integer) 2, "", (java.util.ArrayList) arrayListDexRouterList, quoteType, strEstimateGasFee, decimals2, chainId2, (java.util.ArrayList) arrayListOriginDexRouterList, dexCrossChainRouterParam, "1", strMinimumReceived, str6, dexAutoSlippageInfoParamAutoSlippageInfo, str5, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, str4, strCopydefault, strAhwBna, (java.lang.String) null, str7, openMev, strAEQbTJ, strKWHzl, defiPlatformId, unsignedTx, str3, tradeModeValue, bool2, priorityFee, bridgeId, customPriorityFee, serviceFeeInfo, (java.lang.String) null, traceData, quoteData != null ? "" : quoteData, c23212htv.copydefault(chainId), transactionBean == null ? transactionBean.getPriorityFeeType() : null, transactionBean == null ? transactionBean.getGasPrice() : null, transactionBean == null ? transactionBean.getAccountInfo() : null, mevConfig, transactionBean == null ? transactionBean.getRouterModeType() : null, transactionBean == null ? transactionBean.getSlippageMode() : null, 595591168, 2048, (DefaultConstructorMarker) null);
        }
        fromCoinAmountBalance = "0";
        str4 = fromCoinAmountBalance;
        C22380heK c22380heK2 = C22380heK.OLrzqt;
        C22397heb c22397hebDjBIcL2 = c22380heK2.copydefault(str).OLrzqt(z).djBIcL();
        InterfaceC23194htd interfaceC23194htdFARcdN2 = c22380heK2.copydefault(str).fARcdN();
        if (transactionBean != null) {
        }
        DexQuoteBridgeVO dexQuoteBridgeVOBridge2 = quotePriceRes.bridge();
        if (dexQuoteBridgeVOBridge2 == null) {
        }
        if (transactionBean == null) {
        }
        if (transactionBean == null) {
        }
        if (transactionBean == null) {
        }
        if (transactionBean == null) {
        }
        if ((transactionBean == null ? transactionBean.getSlippageMode() : null) != SlippageMode.Dynamic) {
        }
        if (transactionBean == null) {
        }
        if (spSlipPage == null) {
        }
        if (!quotePriceRes.isSingle()) {
        }
        if (strAutoSlippage == null) {
        }
        if (!quotePriceRes.isSingle()) {
        }
        DexAutoSlippageInfoParam dexAutoSlippageInfoParamAutoSlippageInfo2 = quotePriceRes.autoSlippageInfo();
        if (c22397hebDjBIcL2 == null) {
        }
        if (c22397hebDjBIcL2 == null) {
        }
        java.lang.String strCopydefault2 = interfaceC23194htdFARcdN2.copydefault();
        java.lang.String strAhwBna2 = interfaceC23194htdFARcdN2.AhwBna();
        java.lang.String strMinimumReceived2 = quotePriceRes.minimumReceived();
        if (transactionBean == null) {
        }
        if (mevInfo != null) {
        }
        if (transactionBean == null) {
        }
        if (z) {
        }
        DeFiPlatformForSwap selectedDeFiPlatform22 = quotePriceRes.getSelectedDeFiPlatform();
        if (selectedDeFiPlatform22 != null) {
        }
        int tradeModeValue2 = transactionBean == null ? transactionBean.getTradeModeValue() : TradeMode.SwapMode.getType();
        if (!quotePriceRes.isSingle()) {
        }
        TraceData traceData2 = quotePriceRes.getTraceData();
        DeFiPlatformForSwap selectedDeFiPlatform32 = quotePriceRes.getSelectedDeFiPlatform();
        if (selectedDeFiPlatform32 == null) {
        }
        return new DefiMultiSwapOrderInfoReq(chainId, originContractAddress, fromTokenAmount, originContractAddress2, strReceiveAmount, str2, strAutoSlippage, maxSlippage, decimals, (java.lang.Integer) 2, "", (java.util.ArrayList) arrayListDexRouterList, quoteType, strEstimateGasFee, decimals2, chainId2, (java.util.ArrayList) arrayListOriginDexRouterList, dexCrossChainRouterParam, "1", strMinimumReceived2, str6, dexAutoSlippageInfoParamAutoSlippageInfo2, str5, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, str4, strCopydefault2, strAhwBna2, (java.lang.String) null, str7, openMev, strAEQbTJ, strKWHzl, defiPlatformId, unsignedTx, str3, tradeModeValue2, bool2, priorityFee, bridgeId, customPriorityFee, serviceFeeInfo, (java.lang.String) null, traceData2, quoteData != null ? "" : quoteData, c23212htv.copydefault(chainId), transactionBean == null ? transactionBean.getPriorityFeeType() : null, transactionBean == null ? transactionBean.getGasPrice() : null, transactionBean == null ? transactionBean.getAccountInfo() : null, mevConfig, transactionBean == null ? transactionBean.getRouterModeType() : null, transactionBean == null ? transactionBean.getSlippageMode() : null, 595591168, 2048, (DefaultConstructorMarker) null);
    }

    public final AbstractC58185ywX<MergeCallData> AEQbTJ(@NotNull java.lang.String str, @NotNull QuotePriceRes quotePriceRes, boolean z, @NotNull java.lang.String str2, TransactionBean transactionBean, java.lang.String str3, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReqBuildSwapCallData$default = buildSwapCallData$default(this, str, quotePriceRes, z, str2, transactionBean, str3, java.lang.Boolean.valueOf(z && transactionBean != null && transactionBean.getOpenMev() && Intrinsics.EZpvd((java.lang.Object) quotePriceRes.fromToken().getChainId(), (java.lang.Object) "501")), null, null, MLKEMEngine.KyberPolyBytes, null);
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = C22380heK.OLrzqt.copydefault(str).fARcdN().AEQbTJ();
        if (interfaceC9738bbJAEQbTJ == null) {
            function1.invoke(java.lang.Boolean.FALSE);
            C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.UscePu, 0, 1, (java.lang.Object) null);
            AbstractC58185ywX<MergeCallData> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new java.lang.Exception());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            return abstractC58185ywXAEQbTJ;
        }
        return C23020hqO.OLrzqt.AEQbTJ().copydefault(str, interfaceC9738bbJAEQbTJ.getFieldNames(), defiMultiSwapOrderInfoReqBuildSwapCallData$default, z, quotePriceRes.isPMM());
    }

    public final void KWHzl(@NotNull AbstractC22974hpV abstractC22974hpV, @NotNull Triple<? extends InterfaceC9734bbF, java.lang.String, ? extends java.lang.Object> triple, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(abstractC22974hpV, "");
        Intrinsics.checkNotNullParameter(triple, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        InterfaceC9734bbF first = triple.getFirst();
        if (first == null) {
            throw new java.lang.NullPointerException("ITransaction is null!");
        }
        abstractC22974hpV.EZpvd(first);
        java.lang.Object third = triple.getThird();
        QuotePriceRes quotePriceRes = third instanceof QuotePriceRes ? (QuotePriceRes) third : null;
        if (quotePriceRes != null) {
            abstractC22974hpV.AEQbTJ(quotePriceRes);
        }
        abstractC22974hpV.OLrzqt(first, lifecycleOwner);
        abstractC22974hpV.EZpvd(first, lifecycleOwner);
        abstractC22974hpV.valueOf().uzCIH().setValue(first.fetchVPNInfo());
    }

    public final C23212htv KWHzl() {
        return new C23212htv(new kYB(), new C23214htx((xWP) C43251rlk.copydefault(xWP.class)));
    }
}
