package o;

import com.okinc.business.dexlogic.bean.ApproveResultInfo;
import com.okinc.business.dexlogic.bean.BridgeApproveInfoReq;
import com.okinc.business.dexlogic.bean.CloseAccountBean;
import com.okinc.business.dexlogic.bean.CrossChainBridgeRulesData;
import com.okinc.business.dexlogic.bean.CrossChainBridgeRulesRequest;
import com.okinc.business.dexlogic.bean.DefiMultiSwapOrderInfoReq;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.ExtendOrderBroadcast;
import com.okinc.business.dexlogic.bean.MergeCallData;
import com.okinc.business.dexlogic.bean.MergeQuoteCallData;
import com.okinc.business.dexlogic.bean.MergeQuoteCallDataReq;
import com.okinc.business.dexlogic.bean.RepeatOrderResponse;
import com.okinc.business.dexlogic.bean.RepeatSubOrderRequest;
import com.okinc.business.dexlogic.bean.SwapApproveInfoReq;
import com.okinc.business.dexlogic.bean.SwapOrderInfoReq;
import com.okinc.business.dexlogic.bean.intent.SaveIntentData;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatusGroup;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveSwapData;
import com.okinc.network.okg.response.ResponseData;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hkF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC22693hkF {
    java.lang.String AEQbTJ();

    AbstractC58185ywX<RepeatOrderResponse> AEQbTJ(@NotNull RepeatSubOrderRequest repeatSubOrderRequest, java.lang.Integer num);

    AbstractC58185ywX<ResponseData<CloseAccountBean>> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    AbstractC58185ywX<ResponseData<ApproveResultInfo>> AEQbTJ(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull SwapApproveInfoReq swapApproveInfoReq);

    void AEQbTJ(@NotNull gKW gkw);

    AbstractC58185ywX<ResponseData<SaveIntentData>> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11, @NotNull java.lang.String str12, @NotNull java.lang.String str13, java.lang.String str14);

    AbstractC58185ywX<ApproveSwapData> EZpvd(boolean z, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean2, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.Integer num, java.lang.Integer num2, @NotNull java.lang.String str4);

    AbstractC58185ywX<ResponseData<java.lang.Object>> KWHzl(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull SwapOrderInfoReq swapOrderInfoReq);

    AbstractC58185ywX<MergeCallData> KWHzl(boolean z, @NotNull DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReq, boolean z2, boolean z3);

    boolean KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, @NotNull java.lang.String str, java.lang.String str2);

    AbstractC58185ywX<CrossChainBridgeRulesData> OLrzqt(@NotNull CrossChainBridgeRulesRequest crossChainBridgeRulesRequest, java.lang.Integer num);

    AbstractC58185ywX<ResponseData<java.lang.Object>> OLrzqt(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull ExtendOrderBroadcast extendOrderBroadcast);

    void OLrzqt();

    java.lang.String copydefault();

    AbstractC58185ywX<ApproveStatusGroup> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull InterfaceC22824hme interfaceC22824hme, DexMultiTokenInfoBean dexMultiTokenInfoBean2, java.lang.String str3);

    AbstractC58185ywX<ResponseData<SaveIntentData>> copydefault(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, java.lang.String str4, int i);

    AbstractC58185ywX<ResponseData<ApproveResultInfo>> copydefault(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull BridgeApproveInfoReq bridgeApproveInfoReq);

    AbstractC58185ywX<ResponseData<MergeQuoteCallData>> copydefault(boolean z, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull MergeQuoteCallDataReq mergeQuoteCallDataReq, boolean z2);
}
