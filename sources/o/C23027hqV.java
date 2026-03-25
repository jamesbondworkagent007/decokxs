package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.dex.trade.core.domain.model.CalldataPermit2;
import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dex.trade.core.domain.model.Permit2Data;
import com.okinc.business.dex.trade.core.domain.model.SignedInfo;
import com.okinc.business.dex.trade.core.domain.model.UnsignedData;
import com.okinc.business.dex.trade.core.domain.model.V6BroadcastAccountInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BroadcastRequest;
import com.okinc.business.dex.trade.core.domain.model.V6BroadcastResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataRequest;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig;
import com.okinc.business.dex.trade.core.domain.model.common.MevConfig;
import com.okinc.business.dex.trade.core.domain.model.common.NetworkFee;
import com.okinc.business.dex.trade.core.domain.model.common.PreSetConfig;
import com.okinc.business.dex.trade.core.domain.model.common.QuoteExt;
import com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig;
import com.okinc.business.dex.trade.core.domain.model.common.TeeSaStatus;
import com.okinc.business.dex.trade.core.domain.model.common.V6CallData;
import com.okinc.business.dexlogic.bean.CallData;
import com.okinc.business.dexlogic.bean.DefiMultiSwapOrderInfoReq;
import com.okinc.business.dexlogic.bean.DexMultiMetaSaveOrderParam;
import com.okinc.business.dexlogic.bean.MergeCallData;
import com.okinc.business.dexlogic.bean.MergeQuoteCallData;
import com.okinc.business.dexlogic.bean.MergeQuoteCallDataReq;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.dexlogic.bean.QuoteCallData;
import com.okinc.business.dexlogic.bean.QuoteCallDataReq;
import com.okinc.business.dexlogic.bean.SwapOrderInfoReq;
import com.okinc.business.dexlogic.bean.TraceData;
import com.okinc.business.dexlogic.bean.UnsignedSwapData;
import com.okinc.business.dexlogic.bean.UpdateMultiOrderInfo;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC28108kPe;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hqV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23027hqV implements InterfaceC23025hqT {
    public static java.lang.String KWHzl;
    public static V6CallData OLrzqt;
    public static final C23027hqV copydefault = new C23027hqV();
    public static final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.hqU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C23027hqV.AEQbTJ();
        }
    });
    public static final int EZpvd = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V6CallData KWHzl() {
        return OLrzqt;
    }

    private C23027hqV() {
    }

    public static final C23237huT AEQbTJ() {
        return new C23237huT();
    }

    public final C23237huT EZpvd() {
        return (C23237huT) AEQbTJ.getValue();
    }

    public final V6CallData copydefault(CallData callData) {
        if (callData == null) {
            return null;
        }
        return new V6CallData(callData.getFrom(), callData.getTo(), callData.getData(), callData.getValue(), callData.getGasPrice(), callData.getGas(), callData.getPriorityFee(), callData.getSender(), callData.getMemo(), callData.getMemoPos(), callData.getBridgeId(), callData.getMaxFeePerGas(), callData.getMaxPriorityFeePerGas(), (java.lang.Long) null, (java.lang.String) null, 24576, (DefaultConstructorMarker) null);
    }

    public final void OLrzqt(CallData callData, java.lang.String str) {
        V6CallData v6CallDataCopydefault = copydefault(callData);
        if (v6CallDataCopydefault == null) {
            return;
        }
        OLrzqt = v6CallDataCopydefault;
        KWHzl = str;
    }

    /* JADX DEBUG: Type inference failed for r0v20. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.business.dexlogic.bean.MergeCallData> */
    @Override // o.InterfaceC23025hqT
    public AbstractC58185ywX<MergeCallData> copydefault(@NotNull java.lang.String str, boolean z, @NotNull DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReq, boolean z2, boolean z3) {
        NetworkFee networkFee;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(defiMultiSwapOrderInfoReq, "");
        if (!z2 || z3) {
            return C22380heK.OLrzqt.copydefault(str).DbNXlk().KWHzl(z, defiMultiSwapOrderInfoReq, z2, z3);
        }
        try {
            if (defiMultiSwapOrderInfoReq.getPriorityFeeType() == null) {
                networkFee = null;
            } else {
                PriorityFeeType priorityFeeTypeCopydefault = PriorityFeeType.Companion.copydefault(C33129mqd.AhwBna(defiMultiSwapOrderInfoReq.getPriorityFeeType()));
                networkFee = new NetworkFee(priorityFeeTypeCopydefault == PriorityFeeType.PriorityCustom ? defiMultiSwapOrderInfoReq.getPriorityFee() : null, C33129mqd.gEmmrt(java.lang.Integer.valueOf(priorityFeeTypeCopydefault.getValue())));
            }
            java.lang.String orderSource = defiMultiSwapOrderInfoReq.getOrderSource();
            java.lang.String maxSlippage = defiMultiSwapOrderInfoReq.getMaxSlippage();
            java.lang.String customSlippage = defiMultiSwapOrderInfoReq.getCustomSlippage();
            SlippageMode.Activity activity = SlippageMode.Companion;
            SlippageMode slippageMode = defiMultiSwapOrderInfoReq.getSlippageMode();
            SlippageConfig slippageConfig = new SlippageConfig(maxSlippage, customSlippage, C33129mqd.gEmmrt(java.lang.Integer.valueOf(activity.EZpvd(C33129mqd.AhwBna(slippageMode != null ? java.lang.Integer.valueOf(slippageMode.getType()) : null)).getType())));
            AccountInfo accountInfo = defiMultiSwapOrderInfoReq.getAccountInfo();
            PresetRouteType.TaskDescription taskDescription = PresetRouteType.Companion;
            PresetRouteType routerModeType = defiMultiSwapOrderInfoReq.getRouterModeType();
            java.lang.String value = routerModeType != null ? routerModeType.getValue() : null;
            if (value == null) {
                value = "";
            }
            PreSetConfig preSetConfig = new PreSetConfig(taskDescription.EZpvd(value).getValue());
            CalldataPermit2 calldataPermit2 = new CalldataPermit2(defiMultiSwapOrderInfoReq.getUnsignedTx(), defiMultiSwapOrderInfoReq.getSignature());
            java.lang.String userWalletAddress = defiMultiSwapOrderInfoReq.getUserWalletAddress();
            TraceData traceData = defiMultiSwapOrderInfoReq.getTraceData();
            java.lang.String quoteId = traceData != null ? traceData.getQuoteId() : null;
            AbstractC58185ywX<ResponseData<V6CalldataResponseData>> abstractC58185ywXCopydefault = EZpvd().copydefault(new V6CalldataRequest(null, false, orderSource, networkFee, slippageConfig, accountInfo, preSetConfig, calldataPermit2, userWalletAddress, quoteId == null ? "" : quoteId));
            final Function1 function1 = new Function1() { // from class: o.hqY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C23027hqV.KWHzl((ResponseData) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hra
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C23027hqV.AhwBna(function1, obj);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
            return abstractC58185ywXAEQbTJ;
        } catch (java.lang.Throwable th) {
            AbstractC58185ywX<MergeCallData> abstractC58185ywXAEQbTJ2 = AbstractC58185ywX.AEQbTJ(th);
            Intrinsics.copydefault(abstractC58185ywXAEQbTJ2);
            return abstractC58185ywXAEQbTJ2;
        }
    }

    public static final MergeCallData AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (MergeCallData) function1.invoke(obj);
    }

    public static final MergeCallData KWHzl(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        MergeCallData mergeCallDataOLrzqt = gYK.EZpvd.OLrzqt((V6CalldataResponseData) responseData.getData());
        C23027hqV c23027hqV = copydefault;
        UnsignedSwapData unsingedCallData = mergeCallDataOLrzqt.getUnsingedCallData();
        CallData callData = unsingedCallData != null ? unsingedCallData.getCallData() : null;
        UnsignedSwapData unsingedCallData2 = mergeCallDataOLrzqt.getUnsingedCallData();
        c23027hqV.OLrzqt(callData, unsingedCallData2 != null ? unsingedCallData2.getOrderId() : null);
        return mergeCallDataOLrzqt;
    }

    @Override // o.InterfaceC23025hqT
    public AbstractC58185ywX<ResponseData<MergeQuoteCallData>> OLrzqt(@NotNull java.lang.String str, boolean z, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull MergeQuoteCallDataReq mergeQuoteCallDataReq, boolean z2) {
        NetworkFee networkFee;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(mergeQuoteCallDataReq, "");
        if (!z2) {
            return C22380heK.OLrzqt.copydefault(str).DbNXlk().copydefault(z, map, mergeQuoteCallDataReq, z2);
        }
        try {
            final QuoteCallDataReq eoaQuoteCallDataReq = mergeQuoteCallDataReq.getEoaQuoteCallDataReq();
            DexMultiMetaSaveOrderParam dexMultiMetaSaveOrderParam = eoaQuoteCallDataReq.getDexMultiMetaSaveOrderParam();
            java.lang.String strOLrzqt = C24695iig.OLrzqt(str);
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(dexMultiMetaSaveOrderParam != null ? java.lang.Integer.valueOf(dexMultiMetaSaveOrderParam.getTradeMode()) : null);
            if (eoaQuoteCallDataReq.getPriorityFeeType() == null) {
                networkFee = null;
            } else {
                PriorityFeeType priorityFeeTypeCopydefault = PriorityFeeType.Companion.copydefault(C33129mqd.AhwBna(eoaQuoteCallDataReq.getPriorityFeeType()));
                networkFee = new NetworkFee(priorityFeeTypeCopydefault == PriorityFeeType.PriorityCustom ? eoaQuoteCallDataReq.getPriorityFee() : null, C33129mqd.gEmmrt(java.lang.Integer.valueOf(priorityFeeTypeCopydefault.getValue())));
            }
            LiquidityConfig liquidityConfig = new LiquidityConfig(strOLrzqt, (java.lang.String) null, eoaQuoteCallDataReq.getDefiPlatformId(), 2, (DefaultConstructorMarker) null);
            java.lang.String maxSlippage = dexMultiMetaSaveOrderParam != null ? dexMultiMetaSaveOrderParam.getMaxSlippage() : null;
            java.lang.String customSlippage = dexMultiMetaSaveOrderParam != null ? dexMultiMetaSaveOrderParam.getCustomSlippage() : null;
            SlippageMode.Activity activity = SlippageMode.Companion;
            SlippageMode slippageMode = eoaQuoteCallDataReq.getSlippageMode();
            SlippageConfig slippageConfig = new SlippageConfig(maxSlippage, customSlippage, C33129mqd.gEmmrt(java.lang.Integer.valueOf(activity.EZpvd(C33129mqd.AhwBna(slippageMode != null ? java.lang.Integer.valueOf(slippageMode.getType()) : null)).getType())));
            AccountInfo accountInfo = eoaQuoteCallDataReq.getAccountInfo();
            PresetRouteType.TaskDescription taskDescription = PresetRouteType.Companion;
            PresetRouteType routerModeType = eoaQuoteCallDataReq.getRouterModeType();
            java.lang.String value = routerModeType != null ? routerModeType.getValue() : null;
            if (value != null) {
                str2 = value;
            }
            PreSetConfig preSetConfig = new PreSetConfig(taskDescription.EZpvd(str2).getValue());
            final V6QuoteAndCalldataRequest v6QuoteAndCalldataRequest = new V6QuoteAndCalldataRequest(java.lang.Boolean.FALSE, slippageConfig, liquidityConfig, preSetConfig, C33129mqd.OLrzqt((java.lang.CharSequence) eoaQuoteCallDataReq.getRefCode()) ? new QuoteExt(eoaQuoteCallDataReq.getRefCode(), eoaQuoteCallDataReq.getReferralCommissionJsVersion(), (java.lang.Boolean) null, (java.lang.String) null, 12, (DefaultConstructorMarker) null) : null, strGEmmrt, AbstractC22421hez.Companion.KWHzl(), networkFee, eoaQuoteCallDataReq.getChainId(), eoaQuoteCallDataReq.getFromTokenAddress(), eoaQuoteCallDataReq.getToTokenAddress(), eoaQuoteCallDataReq.getAmount(), eoaQuoteCallDataReq.getUserWalletAddress(), null, accountInfo);
            AbstractC58185ywX<ResponseData<V6QuoteAndCalldataResponseData>> abstractC58185ywXOLrzqt = EZpvd().OLrzqt(v6QuoteAndCalldataRequest);
            final Function1 function1 = new Function1() { // from class: o.hre
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C23027hqV.KWHzl(v6QuoteAndCalldataRequest, eoaQuoteCallDataReq, (ResponseData) obj);
                }
            };
            AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.hqX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C23027hqV.gEmmrt(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.hrb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C23027hqV.OLrzqt((ResponseData) obj);
                }
            };
            AbstractC58185ywX<ResponseData<MergeQuoteCallData>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.hrc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C23027hqV.AYXKKw(function12, obj);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
            return abstractC58185ywXAEQbTJ;
        } catch (java.lang.Throwable th) {
            AbstractC58185ywX<ResponseData<MergeQuoteCallData>> abstractC58185ywXAEQbTJ2 = AbstractC58185ywX.AEQbTJ(th);
            Intrinsics.copydefault(abstractC58185ywXAEQbTJ2);
            return abstractC58185ywXAEQbTJ2;
        }
    }

    public static final InterfaceC60096zvd gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(V6QuoteAndCalldataRequest v6QuoteAndCalldataRequest, QuoteCallDataReq quoteCallDataReq, final ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        V6QuoteAndCalldataResponseData v6QuoteAndCalldataResponseData = (V6QuoteAndCalldataResponseData) responseData.getData();
        final DefiPlatformInfo selectedDeFiPlatform = v6QuoteAndCalldataResponseData != null ? v6QuoteAndCalldataResponseData.getSelectedDeFiPlatform() : null;
        if (selectedDeFiPlatform != null && selectedDeFiPlatform.getTransactionData() == null && selectedDeFiPlatform.getPermit2Data() == null) {
            NetworkFee networkFee = v6QuoteAndCalldataRequest.getNetworkFee();
            java.lang.String orderSource = v6QuoteAndCalldataRequest.getOrderSource();
            SlippageConfig slippageConfig = v6QuoteAndCalldataRequest.getSlippageConfig();
            AccountInfo accountInfo = v6QuoteAndCalldataRequest.getAccountInfo();
            PreSetConfig preSetConfig = v6QuoteAndCalldataRequest.getPreSetConfig();
            Permit2Data permit2Data = selectedDeFiPlatform.getPermit2Data();
            CalldataPermit2 calldataPermit2 = new CalldataPermit2(permit2Data != null ? permit2Data.getUnsignedTx() : null, quoteCallDataReq.getSignature());
            java.lang.String userWalletAddress = v6QuoteAndCalldataRequest.getUserWalletAddress();
            java.lang.String quoteId = selectedDeFiPlatform.getQuoteId();
            AbstractC58185ywX<ResponseData<V6CalldataResponseData>> abstractC58185ywXCopydefault = copydefault.EZpvd().copydefault(new V6CalldataRequest(null, false, orderSource, networkFee, slippageConfig, accountInfo, preSetConfig, calldataPermit2, userWalletAddress, quoteId == null ? "" : quoteId));
            final Function1 function1 = new Function1() { // from class: o.hqW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C23027hqV.AEQbTJ(selectedDeFiPlatform, responseData, (ResponseData) obj);
                }
            };
            return abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hqZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C23027hqV.valueOf(function1, obj);
                }
            }).AEQbTJ(responseData);
        }
        return AbstractC58185ywX.KWHzl(responseData);
    }

    public static final ResponseData valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData AEQbTJ(DefiPlatformInfo defiPlatformInfo, ResponseData responseData, ResponseData responseData2) {
        java.util.ArrayList arrayList;
        java.util.List<DefiPlatformInfo> defiPlatformInfoList;
        Intrinsics.checkNotNullParameter(responseData2, "");
        if (responseData2.getData() != null) {
            DefiPlatformInfo defiPlatformInfoCopy = defiPlatformInfo.copy((Integer.MAX_VALUE & 1) != 0 ? defiPlatformInfo.defiPlatformId : null, (Integer.MAX_VALUE & 2) != 0 ? defiPlatformInfo.name : null, (Integer.MAX_VALUE & 4) != 0 ? defiPlatformInfo.logo : null, (Integer.MAX_VALUE & 8) != 0 ? defiPlatformInfo.receiveAmount : null, (Integer.MAX_VALUE & 16) != 0 ? defiPlatformInfo.toTokenValue : null, (Integer.MAX_VALUE & 32) != 0 ? defiPlatformInfo.reducePercent : null, (Integer.MAX_VALUE & 64) != 0 ? defiPlatformInfo.warnPercent : null, (Integer.MAX_VALUE & 128) != 0 ? defiPlatformInfo.minimumReceived : null, (Integer.MAX_VALUE & 256) != 0 ? defiPlatformInfo.offlineType : null, (Integer.MAX_VALUE & 512) != 0 ? defiPlatformInfo.structureType : null, (Integer.MAX_VALUE & 1024) != 0 ? defiPlatformInfo.router : null, (Integer.MAX_VALUE & 2048) != 0 ? defiPlatformInfo.dexRouterList : null, (Integer.MAX_VALUE & 4096) != 0 ? defiPlatformInfo.slippage : null, (Integer.MAX_VALUE & 8192) != 0 ? defiPlatformInfo.quoteNetWorkFeeOfMoney : null, (Integer.MAX_VALUE & 16384) != 0 ? defiPlatformInfo.estimateGasFee : null, (Integer.MAX_VALUE & 32768) != 0 ? defiPlatformInfo.calldata : null, (Integer.MAX_VALUE & 65536) != 0 ? defiPlatformInfo.autoSlippageInfo : null, (Integer.MAX_VALUE & 131072) != 0 ? defiPlatformInfo.permit2Data : null, (Integer.MAX_VALUE & 262144) != 0 ? defiPlatformInfo.serviceFeeInfo : null, (Integer.MAX_VALUE & 524288) != 0 ? defiPlatformInfo.quoteData : null, (Integer.MAX_VALUE & 1048576) != 0 ? defiPlatformInfo.mevUnstableShowLevel : null, (Integer.MAX_VALUE & 2097152) != 0 ? defiPlatformInfo.quoteId : null, (Integer.MAX_VALUE & 4194304) != 0 ? defiPlatformInfo.expireTime : null, (Integer.MAX_VALUE & 8388608) != 0 ? defiPlatformInfo.showValueDiffWarn : false, (Integer.MAX_VALUE & 16777216) != 0 ? defiPlatformInfo.diffValue : null, (Integer.MAX_VALUE & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? defiPlatformInfo.diffPercent : null, (Integer.MAX_VALUE & 67108864) != 0 ? defiPlatformInfo.quoteDiffValThreshold : null, (Integer.MAX_VALUE & 134217728) != 0 ? defiPlatformInfo.quoteDiffPercentThreshold : null, (Integer.MAX_VALUE & 268435456) != 0 ? defiPlatformInfo.networkFeeOfNativeToken : null, (Integer.MAX_VALUE & 536870912) != 0 ? defiPlatformInfo.needApprove : null, (Integer.MAX_VALUE & 1073741824) != 0 ? defiPlatformInfo.isEnableMev : null, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? defiPlatformInfo.transactionData : (V6CalldataResponseData) responseData2.getData(), (7 & 1) != 0 ? defiPlatformInfo.isHasSaving : 0, (7 & 2) != 0 ? defiPlatformInfo.savingAmount : null, (7 & 4) != 0 ? defiPlatformInfo.savingValueUSD : null);
            V6QuoteAndCalldataResponseData v6QuoteAndCalldataResponseData = (V6QuoteAndCalldataResponseData) responseData.getData();
            if (v6QuoteAndCalldataResponseData == null || (defiPlatformInfoList = v6QuoteAndCalldataResponseData.getDefiPlatformInfoList()) == null) {
                arrayList = null;
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(defiPlatformInfoList, 10));
                for (DefiPlatformInfo defiPlatformInfo2 : defiPlatformInfoList) {
                    if (Intrinsics.EZpvd((java.lang.Object) defiPlatformInfo2.getDefiPlatformId(), (java.lang.Object) defiPlatformInfo.getDefiPlatformId())) {
                        defiPlatformInfo2 = defiPlatformInfoCopy;
                    }
                    arrayList2.add(defiPlatformInfo2);
                }
                arrayList = arrayList2;
            }
            V6QuoteAndCalldataResponseData v6QuoteAndCalldataResponseData2 = (V6QuoteAndCalldataResponseData) responseData.getData();
            return ResponseData.copy$default(responseData, 0, null, null, null, v6QuoteAndCalldataResponseData2 != null ? V6QuoteAndCalldataResponseData.copy$default(v6QuoteAndCalldataResponseData2, null, arrayList, null, null, 13, null) : null, null, 47, null);
        }
        Intrinsics.copydefault(responseData);
        return responseData;
    }

    public static final ResponseData AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData OLrzqt(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        MergeQuoteCallData mergeQuoteCallDataOLrzqt = gYK.EZpvd.OLrzqt((V6QuoteAndCalldataResponseData) responseData.getData());
        QuoteCallData quoteCallData = mergeQuoteCallDataOLrzqt.getQuoteCallData();
        UnsignedSwapData callDataResult = quoteCallData != null ? quoteCallData.getCallDataResult() : null;
        copydefault.OLrzqt(callDataResult != null ? callDataResult.getCallData() : null, callDataResult != null ? callDataResult.getOrderId() : null);
        return ResponseData.copy$default(new ResponseData(0, null, null, null, null, null, 63, null), responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), null, mergeQuoteCallDataOLrzqt, responseData.getError_code(), 8, null);
    }

    /* JADX DEBUG: Type inference failed for r0v10. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    /* JADX DEBUG: Type inference failed for r0v22. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    @Override // o.InterfaceC23025hqT
    public AbstractC58185ywX<ResponseData<java.lang.String>> KWHzl(@NotNull java.lang.String str, @NotNull NewCallbackBean newCallbackBean, @NotNull final SwapOrderInfoReq swapOrderInfoReq, UnsignedSwapData unsignedSwapData, @NotNull final java.lang.String str2, @NotNull final TeeSaStatus teeSaStatus) {
        java.util.List<java.lang.String> mevSuppliers;
        java.util.List<java.lang.String> list;
        java.util.ArrayList arrayList;
        java.util.List<NewCallbackBean.DexCallbackBean.SignedInfo> signedInfoList;
        java.lang.String transactionHash;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        Intrinsics.checkNotNullParameter(swapOrderInfoReq, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(teeSaStatus, "");
        if (!swapOrderInfoReq.isSingleChain()) {
            AbstractC58185ywX<ResponseData<java.lang.Object>> abstractC58185ywXKWHzl = C22380heK.OLrzqt.copydefault(str).DbNXlk().KWHzl(newCallbackBean.getHeaderMap(), swapOrderInfoReq);
            final Function1 function1 = new Function1() { // from class: o.hrg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C23027hqV.gEmmrt((ResponseData) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hrd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C23027hqV.DbNXlk(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            return abstractC58185ywXAEQbTJ;
        }
        try {
            java.util.List listOLrzqt = C56402yEa.OLrzqt();
            UpdateMultiOrderInfo updateMultiOrderInfo = swapOrderInfoReq.getUpdateMultiOrderInfo();
            if (updateMultiOrderInfo != null && (transactionHash = updateMultiOrderInfo.getTransactionHash()) != null) {
                if (transactionHash.length() <= 0) {
                    transactionHash = null;
                }
                if (transactionHash != null) {
                    listOLrzqt.add(transactionHash);
                }
            }
            java.util.List<UpdateMultiOrderInfo> broadcastOrderInfos = swapOrderInfoReq.getBroadcastOrderInfos();
            if (broadcastOrderInfos != null) {
                java.util.Iterator<T> it = broadcastOrderInfos.iterator();
                while (it.hasNext()) {
                    java.lang.String transactionHash2 = ((UpdateMultiOrderInfo) it.next()).getTransactionHash();
                    if (transactionHash2.length() <= 0) {
                        transactionHash2 = null;
                    }
                    if (transactionHash2 != null) {
                        listOLrzqt.add(transactionHash2);
                    }
                }
            }
            java.util.List listFARcdN = C56402yEa.fARcdN(listOLrzqt);
            boolean z = true;
            if (!(!listFARcdN.isEmpty())) {
                listFARcdN = null;
            }
            DefiMultiSwapOrderInfoReq dexMultiMetaSaveOrderParam = swapOrderInfoReq.getDexMultiMetaSaveOrderParam();
            java.lang.String userWalletAddress = dexMultiMetaSaveOrderParam != null ? dexMultiMetaSaveOrderParam.getUserWalletAddress() : null;
            if (userWalletAddress == null) {
                userWalletAddress = "";
            }
            V6CallData v6CallDataKWHzl = KWHzl();
            if (userWalletAddress.length() != 0 && listFARcdN != null) {
                NewCallbackBean.DexCallbackBean dexCallbackBean = newCallbackBean.getDexCallbackBean();
                DefiMultiSwapOrderInfoReq dexMultiMetaSaveOrderParam2 = swapOrderInfoReq.getDexMultiMetaSaveOrderParam();
                if (Intrinsics.EZpvd((java.lang.Object) "501", (java.lang.Object) (dexMultiMetaSaveOrderParam2 != null ? dexMultiMetaSaveOrderParam2.getChainId() : null))) {
                    MevConfig mevConfig = swapOrderInfoReq.getDexMultiMetaSaveOrderParam().getMevConfig();
                    if (mevConfig != null) {
                        mevSuppliers = mevConfig.getMevSuppliers();
                        list = mevSuppliers;
                    }
                    list = null;
                } else {
                    if (dexCallbackBean != null) {
                        mevSuppliers = dexCallbackBean.getMevSuppliers();
                        list = mevSuppliers;
                    }
                    list = null;
                }
                pUU.KWHzl("V6SwapApiGateway", "signAuthType = " + newCallbackBean.getSignAuthType());
                java.lang.String nonce = dexCallbackBean != null ? dexCallbackBean.getNonce() : null;
                java.lang.String str3 = KWHzl;
                java.lang.String str4 = str3 == null ? "" : str3;
                DefiMultiSwapOrderInfoReq dexMultiMetaSaveOrderParam3 = swapOrderInfoReq.getDexMultiMetaSaveOrderParam();
                java.lang.String walletId = dexMultiMetaSaveOrderParam3 != null ? dexMultiMetaSaveOrderParam3.getWalletId() : null;
                java.lang.String str5 = walletId == null ? "" : walletId;
                V6CallData v6CallData = v6CallDataKWHzl == null ? new V6CallData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, 32767, (DefaultConstructorMarker) null) : v6CallDataKWHzl;
                UnsignedData unsignedData = new UnsignedData(unsignedSwapData != null ? unsignedSwapData.getUnsignedTx() : null, java.lang.Boolean.valueOf(unsignedSwapData != null ? unsignedSwapData.getHasReferralCommission() : false));
                if (newCallbackBean.getSignAuthType() != SignAuthType.SILENT) {
                    z = false;
                }
                V6BroadcastAccountInfo v6BroadcastAccountInfo = new V6BroadcastAccountInfo(teeSaStatus, z);
                if (dexCallbackBean == null || (signedInfoList = dexCallbackBean.getSignedInfoList()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(signedInfoList, 10));
                    for (java.util.Iterator it2 = signedInfoList.iterator(); it2.hasNext(); it2 = it2) {
                        NewCallbackBean.DexCallbackBean.SignedInfo signedInfo = (NewCallbackBean.DexCallbackBean.SignedInfo) it2.next();
                        arrayList.add(new SignedInfo(signedInfo.getTransactionHash(), signedInfo.getSignedTx()));
                    }
                }
                AbstractC58185ywX<ResponseData<V6BroadcastResponseData>> abstractC58185ywXEZpvd = EZpvd().EZpvd(newCallbackBean.getHeaderMap(), new V6BroadcastRequest(true, nonce, str4, str5, list, v6CallData, userWalletAddress, arrayList == null ? yDY.AhwBna() : arrayList, unsignedData, v6BroadcastAccountInfo));
                final Function1 function12 = new Function1() { // from class: o.hrh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C23027hqV.OLrzqt(swapOrderInfoReq, str2, teeSaStatus, (ResponseData) obj);
                    }
                };
                AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hrf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C23027hqV.AkhnZx(function12, obj);
                    }
                });
                Intrinsics.copydefault(abstractC58185ywXAEQbTJ2);
                return abstractC58185ywXAEQbTJ2;
            }
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXAEQbTJ3 = AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new java.lang.Exception("userWalletAddress= " + userWalletAddress + "  txHashes= " + listFARcdN));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ3, "");
            return abstractC58185ywXAEQbTJ3;
        } catch (java.lang.Throwable th) {
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXAEQbTJ4 = AbstractC58185ywX.AEQbTJ(th);
            Intrinsics.copydefault(abstractC58185ywXAEQbTJ4);
            return abstractC58185ywXAEQbTJ4;
        }
    }

    public static final ResponseData DbNXlk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData gEmmrt(ResponseData responseData) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(responseData, "");
        try {
            java.lang.Object data = responseData.getData();
            str = data instanceof java.lang.String ? (java.lang.String) data : null;
        } catch (java.lang.Exception unused) {
        }
        java.lang.String str2 = str == null ? "" : str;
        return ResponseData.copy$default(new ResponseData(0, null, null, null, null, null, 63, null), responseData.getCode(), responseData.getMsg(), null, null, str2, responseData.getError_code(), 12, null);
    }

    public static final ResponseData AkhnZx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData OLrzqt(SwapOrderInfoReq swapOrderInfoReq, java.lang.String str, TeeSaStatus teeSaStatus, ResponseData responseData) throws OKServerException {
        TraceData traceData;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() != 0 || responseData.getData() == null) {
            int code = responseData.getCode();
            java.lang.String msg = responseData.getMsg();
            if (msg.length() == 0) {
                msg = responseData.getDetailMsg();
                if (msg.length() == 0) {
                    msg = "Broadcast failed";
                }
            }
            throw new OKServerException(code, msg, null, null, 12, null);
        }
        V6BroadcastResponseData v6BroadcastResponseData = (V6BroadcastResponseData) responseData.getData();
        if (v6BroadcastResponseData == null || !Intrinsics.EZpvd(v6BroadcastResponseData.isSuccess(), java.lang.Boolean.TRUE)) {
            int code2 = responseData.getCode();
            java.lang.String msg2 = responseData.getMsg();
            if (msg2.length() == 0) {
                msg2 = C33070mpX.AYXKKw(C23274hvD.Fragment.getStarRating);
            }
            throw new OKServerException(code2, msg2, null, null, 12, null);
        }
        C28110kPg c28110kPg = C28110kPg.KWHzl;
        DefiMultiSwapOrderInfoReq dexMultiMetaSaveOrderParam = swapOrderInfoReq.getDexMultiMetaSaveOrderParam();
        java.lang.String chainId = dexMultiMetaSaveOrderParam != null ? dexMultiMetaSaveOrderParam.getChainId() : null;
        java.lang.String str2 = chainId == null ? "" : chainId;
        DefiMultiSwapOrderInfoReq dexMultiMetaSaveOrderParam2 = swapOrderInfoReq.getDexMultiMetaSaveOrderParam();
        java.lang.String quoteId = (dexMultiMetaSaveOrderParam2 == null || (traceData = dexMultiMetaSaveOrderParam2.getTraceData()) == null) ? null : traceData.getQuoteId();
        C28109kPf c28109kPf = new C28109kPf(str2, str, "swap", "swap", quoteId == null ? "" : quoteId, teeSaStatus == TeeSaStatus.TEE_ACTIVE);
        V6BroadcastResponseData v6BroadcastResponseData2 = (V6BroadcastResponseData) responseData.getData();
        java.lang.String transactionHash = v6BroadcastResponseData2 != null ? v6BroadcastResponseData2.getTransactionHash() : null;
        c28110kPg.copydefault(new AbstractC28108kPe.Activity(c28109kPf, transactionHash != null ? transactionHash : ""));
        gYK gyk = gYK.EZpvd;
        V6BroadcastResponseData v6BroadcastResponseData3 = (V6BroadcastResponseData) responseData.getData();
        if (v6BroadcastResponseData3 == null) {
            v6BroadcastResponseData3 = new V6BroadcastResponseData((java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, 7, (DefaultConstructorMarker) null);
        }
        return gyk.EZpvd(v6BroadcastResponseData3);
    }
}
