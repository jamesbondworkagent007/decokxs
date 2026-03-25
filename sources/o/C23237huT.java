package o;

import com.okinc.business.dex.trade.core.domain.model.V6BroadcastRequest;
import com.okinc.business.dex.trade.core.domain.model.V6BroadcastResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataRequest;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteResponseData;
import com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig;
import com.okinc.business.dex.trade.core.domain.model.common.QuoteExt;
import com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig;
import com.okinc.business.dexlogic.bean.AddressCheckVo;
import com.okinc.business.dexlogic.bean.ApproveResultInfo;
import com.okinc.business.dexlogic.bean.ApproveUnsignedData;
import com.okinc.business.dexlogic.bean.BlackListTypes;
import com.okinc.business.dexlogic.bean.BridgeApproveInfoReq;
import com.okinc.business.dexlogic.bean.BridgeRedeemBroadcastReq;
import com.okinc.business.dexlogic.bean.BridgeRedeemBroadcastResponse;
import com.okinc.business.dexlogic.bean.BridgeRedeemCallDataReq;
import com.okinc.business.dexlogic.bean.BridgeRedeemCallDataResponse;
import com.okinc.business.dexlogic.bean.CheckContinueBean;
import com.okinc.business.dexlogic.bean.CloseAccountBean;
import com.okinc.business.dexlogic.bean.CrossChainBridgeRulesData;
import com.okinc.business.dexlogic.bean.CrossChainBridgeRulesRequest;
import com.okinc.business.dexlogic.bean.DeFiPlatformTokenApprovalInfo;
import com.okinc.business.dexlogic.bean.DefiMultiSwapOrderInfoReq;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.DexMultiTokenDetailReq;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.ExtendOrderBroadcast;
import com.okinc.business.dexlogic.bean.IntentBridgeQuoteCallData;
import com.okinc.business.dexlogic.bean.IntentBridgeQuoteCallDataReq;
import com.okinc.business.dexlogic.bean.IntentQuoteCallData;
import com.okinc.business.dexlogic.bean.LiquidityListItem;
import com.okinc.business.dexlogic.bean.MemeTokenInfo;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.bean.QuoteCallData;
import com.okinc.business.dexlogic.bean.QuoteCallDataReq;
import com.okinc.business.dexlogic.bean.QuotePriceReq;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.RepeatOrderRequest;
import com.okinc.business.dexlogic.bean.RepeatOrderResponse;
import com.okinc.business.dexlogic.bean.SaveIntentBridgeOrderData;
import com.okinc.business.dexlogic.bean.SaveIntentOrderData;
import com.okinc.business.dexlogic.bean.SelfSwapStatus;
import com.okinc.business.dexlogic.bean.SlippageConfigVo;
import com.okinc.business.dexlogic.bean.SwapApproveInfoReq;
import com.okinc.business.dexlogic.bean.SwapBridgeDAppInfo;
import com.okinc.business.dexlogic.bean.SwapOrderInfoReq;
import com.okinc.business.dexlogic.bean.TokenCheckInfo;
import com.okinc.business.dexlogic.bean.TradeMode;
import com.okinc.business.dexlogic.bean.UnsignedSwapData;
import com.okinc.business.dexlogic.bean.intent.SaveIntentData;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import o.InterfaceC23234huQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.huT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23237huT {
    @yCM
    public C23237huT() {
    }

    public final InterfaceC23234huQ OLrzqt() {
        return InterfaceC23234huQ.Companion.EZpvd(C23222huE.AEQbTJ);
    }

    public final <T> java.util.Map<java.lang.String, java.lang.String> KWHzl(SerializationStrategy<? super T> serializationStrategy, T t) {
        C33489mxS c33489mxS = C33489mxS.KWHzl;
        java.lang.String strKWHzl = c33489mxS.KWHzl(serializationStrategy, t);
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        return new java.util.HashMap((java.util.Map) c33489mxS.OLrzqt((DeserializationStrategy) BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(c56529yIt), BuiltinSerializersKt.serializer(c56529yIt)), strKWHzl));
    }

    public final AbstractC58185ywX<ResponseData<QuotePriceRes>> copydefault(@NotNull java.lang.String str, @NotNull QuotePriceReq quotePriceReq) {
        java.lang.String slippage;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(quotePriceReq, "");
        java.lang.String strOLrzqt = C24695iig.OLrzqt(str);
        java.lang.String userWalletAddress = quotePriceReq.getUserWalletAddress();
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Integer.valueOf(TradeMode.SwapMode.getType()));
        java.lang.String maxSlippage = quotePriceReq.getMaxSlippage();
        if (SlippageMode.Companion.EZpvd(C33129mqd.AhwBna(quotePriceReq.getSlippageType())) == SlippageMode.Fixed) {
            slippage = quotePriceReq.getSlippage();
            if (slippage == null) {
                slippage = "";
            }
        } else {
            slippage = null;
        }
        SlippageConfig slippageConfig = new SlippageConfig(maxSlippage, slippage, quotePriceReq.getSlippageType());
        java.util.List<java.lang.String> defiPlatformIds = quotePriceReq.getDefiPlatformIds();
        LiquidityConfig liquidityConfig = new LiquidityConfig(strOLrzqt, (java.lang.String) null, defiPlatformIds != null ? CollectionsKt___CollectionsKt.joinToString$default(defiPlatformIds, ",", null, null, 0, null, null, 62, null) : null, 2, (DefaultConstructorMarker) null);
        QuoteExt quoteExt = C33129mqd.OLrzqt((java.lang.CharSequence) quotePriceReq.getRefCode()) ? new QuoteExt(quotePriceReq.getRefCode(), quotePriceReq.getReferralCommissionJsVersion(), (java.lang.Boolean) null, (java.lang.String) null, 12, (DefaultConstructorMarker) null) : null;
        java.lang.String chainId = quotePriceReq.getChainId();
        java.lang.String fromTokenAddress = quotePriceReq.getFromTokenAddress();
        if (fromTokenAddress == null) {
            fromTokenAddress = "";
        }
        java.lang.String toTokenAddress = quotePriceReq.getToTokenAddress();
        AbstractC58185ywX<ResponseData<V6QuoteResponseData>> abstractC58185ywXAEQbTJ = AEQbTJ(new V6QuoteRequest(userWalletAddress, strGEmmrt, slippageConfig, liquidityConfig, quoteExt, chainId, fromTokenAddress, toTokenAddress == null ? "" : toTokenAddress, quotePriceReq.getAmount(), quotePriceReq.getAccountInfo()));
        final Function1 function1 = new Function1() { // from class: o.huR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23237huT.KWHzl((ResponseData) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.huU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C23237huT.OLrzqt(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.huS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23237huT.AEQbTJ((ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<QuotePriceRes>> abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ2.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.huV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C23237huT.EZpvd(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final ResponseData OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData KWHzl(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        QuotePriceRes quotePriceResAEQbTJ = gYM.EZpvd.AEQbTJ((V6QuoteResponseData) responseData.getData());
        return new ResponseData(0, null, null, null, null, null, 63, null).copy(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), responseData.getErrorMsg(), quotePriceResAEQbTJ, responseData.getError_code());
    }

    public static final InterfaceC60096zvd EZpvd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return AbstractC58185ywX.KWHzl(responseData);
    }

    public final AbstractC58185ywX<ResponseData<QuotePriceRes>> copydefault(@NotNull QuotePriceReq quotePriceReq) {
        Intrinsics.checkNotNullParameter(quotePriceReq, "");
        java.util.HashMap map = new java.util.HashMap();
        map.put("chainId", quotePriceReq.getChainId());
        map.put("toChainId", quotePriceReq.getToChainId());
        map.put(OtcExtraKeys.AMOUNT, quotePriceReq.getAmount());
        java.lang.String slippage = quotePriceReq.getSlippage();
        if (slippage != null) {
            map.put("slippage", slippage);
        }
        map.put("slippageType", quotePriceReq.getSlippageType());
        map.put("gasLevel", quotePriceReq.getGasLevel());
        map.put("pmm", quotePriceReq.getPmm());
        java.lang.String userWalletAddress = quotePriceReq.getUserWalletAddress();
        if (userWalletAddress != null) {
            map.put("userWalletAddress", userWalletAddress);
        }
        java.lang.String fromTokenAddress = quotePriceReq.getFromTokenAddress();
        if (fromTokenAddress != null) {
            map.put("fromTokenAddress", fromTokenAddress);
        }
        java.lang.String toTokenAddress = quotePriceReq.getToTokenAddress();
        if (toTokenAddress != null) {
            map.put("toTokenAddress", toTokenAddress);
        }
        java.lang.String quoteBizType = quotePriceReq.getQuoteBizType();
        if (quoteBizType != null) {
            map.put("quoteBizType", quoteBizType);
        }
        java.lang.String receiveWalletAddress = quotePriceReq.getReceiveWalletAddress();
        if (receiveWalletAddress != null) {
            map.put("receiveWalletAddress", receiveWalletAddress);
        }
        java.lang.String fromTokenDecimal = quotePriceReq.getFromTokenDecimal();
        if (fromTokenDecimal.length() <= 0) {
            fromTokenDecimal = null;
        }
        if (fromTokenDecimal != null) {
            map.put("fromTokenDecimal", fromTokenDecimal);
        }
        java.lang.String toTokenDecimal = quotePriceReq.getToTokenDecimal();
        if (toTokenDecimal.length() <= 0) {
            toTokenDecimal = null;
        }
        if (toTokenDecimal != null) {
            map.put("toTokenDecimal", toTokenDecimal);
        }
        java.util.List<java.lang.String> dexIds = quotePriceReq.getDexIds();
        if (dexIds != null) {
            java.util.List<java.lang.String> list = dexIds.isEmpty() ^ true ? dexIds : null;
            if (list != null) {
                map.put("dexIds", CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null));
            }
        }
        java.util.List<java.lang.String> forbiddenBridgeTypes = quotePriceReq.getForbiddenBridgeTypes();
        if (forbiddenBridgeTypes != null) {
            java.util.List<java.lang.String> list2 = forbiddenBridgeTypes.isEmpty() ^ true ? forbiddenBridgeTypes : null;
            if (list2 != null) {
                map.put("forbiddenBridgeTypes", CollectionsKt___CollectionsKt.joinToString$default(list2, ",", null, null, 0, null, null, 62, null));
            }
        }
        return C33024moe.KWHzl((AbstractC58185ywX) OLrzqt().OLrzqt(map));
    }

    public static /* synthetic */ AbstractC58185ywX getBatchTokenApproveAllowanceStatus$default(C23237huT c23237huT, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str5 = "";
        }
        return c23237huT.OLrzqt(str, str2, str3, str4, str5);
    }

    public final AbstractC58185ywX<ResponseData<java.util.Map<java.lang.String, DeFiPlatformTokenApprovalInfo>>> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return C33024moe.KWHzl((AbstractC58185ywX) OLrzqt().copydefault(str2, str, str3, str4, str5));
    }

    public static /* synthetic */ AbstractC58185ywX getApproveUnsignedData$default(C23237huT c23237huT, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            str6 = null;
        }
        return c23237huT.AEQbTJ(str, str2, str3, str4, str5, str6);
    }

    public final AbstractC58185ywX<ApproveUnsignedData> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return C23223huF.EZpvd(OLrzqt().KWHzl(str, str2, str3, str4, str5, str6));
    }

    public static /* synthetic */ AbstractC58185ywX getBridgeApproveUnsignedData$default(C23237huT c23237huT, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str5 = null;
        }
        return c23237huT.EZpvd(str, str2, str3, str4, str5);
    }

    public final AbstractC58185ywX<ApproveUnsignedData> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return C23223huF.EZpvd(OLrzqt().KWHzl(str, str2, str3, str4, str5));
    }

    public final AbstractC58185ywX<ResponseData<OrderDetailBean>> copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33024moe.KWHzl((AbstractC58185ywX) OLrzqt().KWHzl(str));
    }

    public final AbstractC58185ywX<ResponseData<OrderDetailBean>> OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33024moe.KWHzl((AbstractC58185ywX) OLrzqt().EZpvd(str));
    }

    public final AbstractC58185ywX<ResponseData<BridgeRedeemCallDataResponse>> AEQbTJ(@NotNull BridgeRedeemCallDataReq bridgeRedeemCallDataReq) {
        Intrinsics.checkNotNullParameter(bridgeRedeemCallDataReq, "");
        return C33024moe.KWHzl((AbstractC58185ywX) OLrzqt().copydefault(bridgeRedeemCallDataReq));
    }

    public final AbstractC58185ywX<ResponseData<BridgeRedeemBroadcastResponse>> AEQbTJ(@NotNull BridgeRedeemBroadcastReq bridgeRedeemBroadcastReq) {
        Intrinsics.checkNotNullParameter(bridgeRedeemBroadcastReq, "");
        return C33024moe.KWHzl((AbstractC58185ywX) OLrzqt().copydefault(bridgeRedeemBroadcastReq));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<DexMultiTokenInfoBean>>> AEQbTJ(@NotNull DexMultiTokenDetailReq dexMultiTokenDetailReq) {
        Intrinsics.checkNotNullParameter(dexMultiTokenDetailReq, "");
        return C33024moe.KWHzl((AbstractC58185ywX) OLrzqt().AEQbTJ(dexMultiTokenDetailReq));
    }

    public final AbstractC58185ywX<ResponseData<DexMultiTokenInfoBean>> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return C33024moe.KWHzl((AbstractC58185ywX) OLrzqt().OLrzqt(str, str2, str3, str4, str5));
    }

    public final AbstractC58185ywX<ResponseData<RepeatOrderResponse>> KWHzl(@NotNull RepeatOrderRequest repeatOrderRequest) {
        Intrinsics.checkNotNullParameter(repeatOrderRequest, "");
        return C33024moe.KWHzl((AbstractC58185ywX) OLrzqt().copydefault(KWHzl(RepeatOrderRequest.Companion.serializer(), repeatOrderRequest)));
    }

    public final AbstractC58185ywX<ResponseData<CrossChainBridgeRulesData>> KWHzl(@NotNull CrossChainBridgeRulesRequest crossChainBridgeRulesRequest) {
        Intrinsics.checkNotNullParameter(crossChainBridgeRulesRequest, "");
        return C33024moe.KWHzl((AbstractC58185ywX) OLrzqt().AEQbTJ(crossChainBridgeRulesRequest));
    }

    public final AbstractC58185ywX<ResponseData<TokenCheckInfo>> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return C33024moe.KWHzl((AbstractC58185ywX) OLrzqt().EZpvd(str, str3, str2, str4, (java.lang.String) null, str5));
    }

    public final AbstractC58185ywX<ResponseData<TokenCheckInfo>> KWHzl(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33024moe.KWHzl((AbstractC58185ywX) OLrzqt().EZpvd(str, str2, str3, str4, str5));
    }

    public final AbstractC58185ywX<ResponseData<UnsignedSwapData>> copydefault(@NotNull DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReq, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(defiMultiSwapOrderInfoReq, "");
        Intrinsics.checkNotNullParameter(str, "");
        return C33024moe.KWHzl(InterfaceC23234huQ.Application.getBridgeCallData$default(OLrzqt(), defiMultiSwapOrderInfoReq, str, null, 4, null));
    }

    public final AbstractC58185ywX<ResponseData<QuoteCallData>> EZpvd(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull QuoteCallDataReq quoteCallDataReq, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(quoteCallDataReq, "");
        Intrinsics.checkNotNullParameter(str, "");
        return C33024moe.KWHzl(InterfaceC23234huQ.Application.getBridgeQuoteOrCallData$default(OLrzqt(), map, quoteCallDataReq, str, null, 8, null));
    }

    public final AbstractC58185ywX<ResponseData<IntentBridgeQuoteCallData>> EZpvd(@NotNull IntentBridgeQuoteCallDataReq intentBridgeQuoteCallDataReq) {
        Intrinsics.checkNotNullParameter(intentBridgeQuoteCallDataReq, "");
        return C33024moe.KWHzl((AbstractC58185ywX) OLrzqt().OLrzqt(intentBridgeQuoteCallDataReq.getBridgeId(), intentBridgeQuoteCallDataReq.getSlippage(), intentBridgeQuoteCallDataReq.getToChainId(), intentBridgeQuoteCallDataReq.getReceiveWalletAddress(), intentBridgeQuoteCallDataReq.getUserWalletAddress(), intentBridgeQuoteCallDataReq.getChainId(), intentBridgeQuoteCallDataReq.getFromTokenAddress(), intentBridgeQuoteCallDataReq.getToTokenAddress(), intentBridgeQuoteCallDataReq.getAmount()));
    }

    public final AbstractC58185ywX<ResponseData<IntentQuoteCallData>> AEQbTJ(@NotNull DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReq) {
        Intrinsics.checkNotNullParameter(defiMultiSwapOrderInfoReq, "");
        InterfaceC23234huQ interfaceC23234huQOLrzqt = OLrzqt();
        java.lang.String chainId = defiMultiSwapOrderInfoReq.getChainId();
        java.lang.String toChainId = defiMultiSwapOrderInfoReq.getToChainId();
        java.lang.String userWalletAddress = defiMultiSwapOrderInfoReq.getUserWalletAddress();
        java.lang.String customSlippage = defiMultiSwapOrderInfoReq.getCustomSlippage();
        DexAutoSlippageInfoParam autoSlippageInfo = defiMultiSwapOrderInfoReq.getAutoSlippageInfo();
        java.lang.String autoTotalSlippage = autoSlippageInfo != null ? autoSlippageInfo.getAutoTotalSlippage() : null;
        return C33024moe.KWHzl((AbstractC58185ywX) interfaceC23234huQOLrzqt.KWHzl(chainId, toChainId, userWalletAddress, defiMultiSwapOrderInfoReq.getFromTokenAddress(), defiMultiSwapOrderInfoReq.getToTokenAddress(), defiMultiSwapOrderInfoReq.getFromAmount(), (customSlippage == null || customSlippage.length() == 0) ? autoTotalSlippage != null ? autoTotalSlippage : "" : customSlippage, defiMultiSwapOrderInfoReq.getDeFiPlatformId()));
    }

    public final AbstractC58185ywX<ResponseData<java.lang.Object>> AEQbTJ(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull SwapOrderInfoReq swapOrderInfoReq) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(swapOrderInfoReq, "");
        return C33024moe.KWHzl(InterfaceC23234huQ.Application.bridgeSaveOrderBroadCast$default(OLrzqt(), map, swapOrderInfoReq, null, 4, null));
    }

    public final AbstractC58185ywX<ResponseData<SaveIntentData>> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C33024moe.KWHzl((AbstractC58185ywX) OLrzqt().copydefault(new SaveIntentOrderData(str2, str, str3, str4, i, null)));
    }

    public final AbstractC58185ywX<ResponseData<SaveIntentData>> copydefault(@NotNull SaveIntentBridgeOrderData saveIntentBridgeOrderData) {
        Intrinsics.checkNotNullParameter(saveIntentBridgeOrderData, "");
        return C33024moe.KWHzl((AbstractC58185ywX) OLrzqt().AEQbTJ(saveIntentBridgeOrderData));
    }

    public final AbstractC58185ywX<ResponseData<ApproveResultInfo>> KWHzl(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull SwapApproveInfoReq swapApproveInfoReq) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(swapApproveInfoReq, "");
        return C33024moe.KWHzl(InterfaceC23234huQ.Application.saveApproveBroadCast$default(OLrzqt(), map, swapApproveInfoReq, null, 4, null));
    }

    public final AbstractC58185ywX<ResponseData<ApproveResultInfo>> OLrzqt(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull BridgeApproveInfoReq bridgeApproveInfoReq) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(bridgeApproveInfoReq, "");
        return C33024moe.KWHzl(InterfaceC23234huQ.Application.saveBridgeApproveBroadCast$default(OLrzqt(), map, bridgeApproveInfoReq, null, 4, null));
    }

    public final AbstractC58185ywX<ResponseData<AddressCheckVo>> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33024moe.KWHzl((AbstractC58185ywX) OLrzqt().EZpvd(str, str2));
    }

    public final AbstractC58185ywX<ResponseData<CloseAccountBean>> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33024moe.KWHzl((AbstractC58185ywX) OLrzqt().AEQbTJ(str, str2));
    }

    public final AbstractC58185ywX<ResponseData<java.lang.Object>> OLrzqt(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull ExtendOrderBroadcast extendOrderBroadcast) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(extendOrderBroadcast, "");
        return C33024moe.KWHzl((AbstractC58185ywX) OLrzqt().copydefault(map, extendOrderBroadcast));
    }

    public final AbstractC58185ywX<ResponseData<SelfSwapStatus>> EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33024moe.KWHzl((AbstractC58185ywX) OLrzqt().copydefault(str));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<SlippageConfigVo>>> EZpvd() {
        return C33024moe.KWHzl((AbstractC58185ywX) OLrzqt().AEQbTJ());
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<LiquidityListItem>>> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33024moe.KWHzl((AbstractC58185ywX) OLrzqt().AEQbTJ(str));
    }

    public final AbstractC58185ywX<ResponseData<BlackListTypes>> copydefault(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return OLrzqt().copydefault(str, str2);
    }

    public final AbstractC58185ywX<ResponseData<CheckContinueBean>> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return OLrzqt().OLrzqt(str, str2, str3, str4);
    }

    public final AbstractC58185ywX<ResponseData<TokenCheckInfo>> EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        return C33024moe.KWHzl((AbstractC58185ywX) OLrzqt().OLrzqt(str, str2, str3, str4, str5, str6));
    }

    public final AbstractC58185ywX<ResponseData<TokenCheckInfo>> djBIcL(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        InterfaceC23234huQ interfaceC23234huQOLrzqt = OLrzqt();
        if (str == null) {
            str = "";
        }
        return C33024moe.KWHzl((AbstractC58185ywX) interfaceC23234huQOLrzqt.EZpvd(str, str2, str3, str4, str5));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<SwapBridgeDAppInfo>>> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return C33024moe.KWHzl((AbstractC58185ywX) OLrzqt().EZpvd(str, str2, str3, str4));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<SwapBridgeDAppInfo>>> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return C33024moe.KWHzl((AbstractC58185ywX) OLrzqt().AEQbTJ(str, str2, str3, str4));
    }

    public final AbstractC58185ywX<ResponseData<MemeTokenInfo>> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33024moe.KWHzl((AbstractC58185ywX) OLrzqt().OLrzqt(str, str2));
    }

    public final AbstractC58185ywX<ResponseData<V6CalldataResponseData>> copydefault(@NotNull V6CalldataRequest v6CalldataRequest) {
        Intrinsics.checkNotNullParameter(v6CalldataRequest, "");
        return C33024moe.KWHzl((AbstractC58185ywX) OLrzqt().EZpvd(v6CalldataRequest));
    }

    public final AbstractC58185ywX<ResponseData<V6QuoteAndCalldataResponseData>> OLrzqt(@NotNull V6QuoteAndCalldataRequest v6QuoteAndCalldataRequest) {
        Intrinsics.checkNotNullParameter(v6QuoteAndCalldataRequest, "");
        return C33024moe.KWHzl((AbstractC58185ywX) OLrzqt().OLrzqt(v6QuoteAndCalldataRequest));
    }

    public final AbstractC58185ywX<ResponseData<V6BroadcastResponseData>> EZpvd(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull V6BroadcastRequest v6BroadcastRequest) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(v6BroadcastRequest, "");
        return C33024moe.KWHzl((AbstractC58185ywX) OLrzqt().KWHzl(map, v6BroadcastRequest));
    }

    public final AbstractC58185ywX<ResponseData<V6QuoteResponseData>> AEQbTJ(@NotNull V6QuoteRequest v6QuoteRequest) {
        Intrinsics.checkNotNullParameter(v6QuoteRequest, "");
        return C33024moe.KWHzl((AbstractC58185ywX) OLrzqt().copydefault(v6QuoteRequest));
    }
}
