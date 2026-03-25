package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ChildOrder;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.TradeState;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.hkx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22737hkx {
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<DexMultiChildOrderInfoVo> AEQbTJ(@NotNull java.util.List<DexMultiChildOrderInfoVo> list, @NotNull TradeState tradeState, @NotNull MutableLiveData<OrderDetailBean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(tradeState, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        if (tradeState.getTransactionHash().length() == 0) {
            return list;
        }
        OrderDetailBean value = mutableLiveData.getValue();
        if (C22420hey.KWHzl(tradeState.getSwapTradeType())) {
            AEQbTJ(value, tradeState);
            OLrzqt(list, tradeState);
            mutableLiveData.postValue(value);
            return list;
        }
        EZpvd(value, tradeState);
        mutableLiveData.postValue(value);
        if (Intrinsics.EZpvd((java.lang.Object) tradeState.getType(), (java.lang.Object) "Unwrap")) {
            if (Intrinsics.EZpvd((java.lang.Object) tradeState.getStatus(), (java.lang.Object) "1")) {
                for (DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo : list) {
                    AEQbTJ(dexMultiChildOrderInfoVo, tradeState.getFromChildOrder());
                    AEQbTJ(dexMultiChildOrderInfoVo, tradeState.getBridgeChildOrder());
                    AEQbTJ(dexMultiChildOrderInfoVo, tradeState.getToChildOrder());
                }
            }
            return list;
        }
        for (DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2 : list) {
            KWHzl(dexMultiChildOrderInfoVo2, tradeState, tradeState.getFromChildOrder());
            KWHzl(dexMultiChildOrderInfoVo2, tradeState, tradeState.getBridgeChildOrder());
            KWHzl(dexMultiChildOrderInfoVo2, tradeState, tradeState.getToChildOrder());
        }
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo3 = (DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.wlaJM(list);
        if (dexMultiChildOrderInfoVo3 != null) {
            if (value != null) {
                boolean z = value.isDiscountGasStation();
                dexMultiChildOrderInfoVo3.setDiscountGasStation(z);
                dexMultiChildOrderInfoVo3.setGasStationActivityReward(tradeState.getGasStationActivityReward());
            }
        }
        return list;
    }

    public final void KWHzl(DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, TradeState tradeState, ChildOrder childOrder) {
        if (childOrder == null || !Intrinsics.EZpvd((java.lang.Object) dexMultiChildOrderInfoVo.getChildOrderId(), (java.lang.Object) childOrder.getChildOrderId())) {
            return;
        }
        dexMultiChildOrderInfoVo.setFromAmountIn(childOrder.getFromAmount());
        dexMultiChildOrderInfoVo.setToAmountOut(childOrder.getToAmount());
        dexMultiChildOrderInfoVo.setStatus(childOrder.getStatus());
        dexMultiChildOrderInfoVo.setMainStatus(tradeState.getStatus());
        dexMultiChildOrderInfoVo.setToastType(childOrder.getToastType());
        dexMultiChildOrderInfoVo.setToastGuideUrl(childOrder.getToastGuideUrl());
        dexMultiChildOrderInfoVo.setExploreUrl(childOrder.getExploreUrl());
        dexMultiChildOrderInfoVo.setOrderFailReason(childOrder.getOrderFailReason());
        dexMultiChildOrderInfoVo.setFromTokenSymbol(childOrder.getFromTokenSymbol());
        dexMultiChildOrderInfoVo.setToTokenSymbol(childOrder.getToTokenSymbol());
        dexMultiChildOrderInfoVo.setOriginalTokenSymbol(childOrder.getOriginalTokenSymbol());
        dexMultiChildOrderInfoVo.setExtendStatus(childOrder.getExtendStatus());
        dexMultiChildOrderInfoVo.setTransactionHash(childOrder.getTransactionHash());
        dexMultiChildOrderInfoVo.setShowSpeedUp(childOrder.isShowSpeedUp());
        dexMultiChildOrderInfoVo.setShowCancel(childOrder.isShowCancel());
        dexMultiChildOrderInfoVo.setShowSpeedUpCancel(childOrder.isShowSpeedUpCancel());
        if (C33129mqd.OLrzqt((java.lang.CharSequence) childOrder.getToTokenIcon())) {
            dexMultiChildOrderInfoVo.setToTokenIcon(childOrder.getToTokenIcon());
        }
        dexMultiChildOrderInfoVo.setRefundAmount(childOrder.getRefundAmount());
        dexMultiChildOrderInfoVo.setErrorCode(childOrder.getErrorCode());
        dexMultiChildOrderInfoVo.setRefundSymbol(childOrder.getRefundSymbol());
        dexMultiChildOrderInfoVo.setRefundChain(childOrder.getRefundChain());
        if (childOrder.getDexBridgeShadowTokenPairInfoVo() != null) {
            dexMultiChildOrderInfoVo.setDexBridgeShadowTokenPairInfoVo(childOrder.getDexBridgeShadowTokenPairInfoVo());
        }
    }

    public final void AEQbTJ(DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, ChildOrder childOrder) {
        if (childOrder == null || !Intrinsics.EZpvd((java.lang.Object) dexMultiChildOrderInfoVo.getChildOrderId(), (java.lang.Object) childOrder.getChildOrderId())) {
            return;
        }
        dexMultiChildOrderInfoVo.setExtendStatus(childOrder.getExtendStatus());
    }

    public final void EZpvd(OrderDetailBean orderDetailBean, TradeState tradeState) {
        if (orderDetailBean != null) {
            orderDetailBean.setToAmount(tradeState.getToAmount());
            orderDetailBean.setNetworkFee(tradeState.getNetworkFee());
            orderDetailBean.setStatus(tradeState.getStatus());
            orderDetailBean.setOtherFees(tradeState.getOtherFees());
            orderDetailBean.setTransactionHash(tradeState.getTransactionHash());
            if (tradeState.isUpdateOrderInfo()) {
                orderDetailBean.setReceiveTokenStatus(tradeState.getReceiveTokenStatus());
                orderDetailBean.setReceiveTokenTxHash(tradeState.getReceiveTokenTxHash());
                orderDetailBean.setReceiveTokenAmount(tradeState.getReceiveTokenAmount());
                orderDetailBean.setReceiveTokenSymbol(tradeState.getReceiveTokenSymbol());
                orderDetailBean.setReceiveTokenExploreUrl(tradeState.getReceiveTokenExploreUrl());
                orderDetailBean.setForRefuelFromAmount(tradeState.getForRefuelFromAmount());
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) tradeState.getToSwapFee())) {
                orderDetailBean.setToSwapFee(tradeState.getToSwapFee());
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) tradeState.getBridgeFee())) {
                orderDetailBean.setBridgeFee(tradeState.getBridgeFee());
            }
            orderDetailBean.setAbnormalStatus(tradeState.getAbnormalStatus());
            orderDetailBean.setPrice(tradeState.getPrice());
            orderDetailBean.setFreeGas(tradeState.getFreeGas());
            orderDetailBean.setFromGasTokenPriceUsd(tradeState.getFromGasTokenPriceUsd());
            orderDetailBean.setToGasTokenPriceUsd(tradeState.getToGasTokenPriceUsd());
            orderDetailBean.setNativeTokenSymbol(tradeState.getNativeTokenSymbol());
            orderDetailBean.setGasStationActivityReward(tradeState.getGasStationActivityReward());
            orderDetailBean.setBridgeFeeUsd(tradeState.getBridgeFeeUsd());
            orderDetailBean.setEstimateBridgeFeeAmount(tradeState.getEstimateBridgeFeeAmount());
            orderDetailBean.setEstimateBridgeFeeAmountUsd(tradeState.getEstimateBridgeFeeAmountUsd());
            if (C33129mqd.OLrzqt((java.lang.CharSequence) tradeState.getOrderCompletionTime())) {
                orderDetailBean.setOrderCompletionTime(tradeState.getOrderCompletionTime());
            }
            orderDetailBean.setDexGasStationFeeDetailVO(tradeState.getDexGasStationFeeDetailVO());
            orderDetailBean.setMemeTimeOut(tradeState.isMemeTimeOut());
            orderDetailBean.setAssetDelay(tradeState.getAssetDelay());
            if (tradeState.getAssetDelayTime().length() > 0) {
                orderDetailBean.setAssetDelayTime(tradeState.getAssetDelayTime());
            }
        }
    }

    public final void AEQbTJ(OrderDetailBean orderDetailBean, TradeState tradeState) {
        if (orderDetailBean != null) {
            orderDetailBean.setToAmount(tradeState.getToAmount());
            orderDetailBean.setStatus(tradeState.getStatus());
            orderDetailBean.setTransactionHash(tradeState.getTransactionHash());
            orderDetailBean.setServiceFee(tradeState.getServiceFee());
            orderDetailBean.setServiceFeeUsd(tradeState.getServiceFeeUsd());
            orderDetailBean.setServiceFeeTokenSymbol(tradeState.getServiceFeeTokenSymbol());
            orderDetailBean.setServiceFeeRate(tradeState.getServiceFeeRate());
            orderDetailBean.setWillNeedManualClaim(tradeState.getWillNeedManualClaim());
        }
    }

    public final void OLrzqt(java.util.List<DexMultiChildOrderInfoVo> list, TradeState tradeState) {
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo = (DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.AubY(list);
        dexMultiChildOrderInfoVo.setToAmountOut(tradeState.getToAmount());
        dexMultiChildOrderInfoVo.setMark(tradeState.successTx() ? Marker.ANY_NON_NULL_MARKER : "");
        dexMultiChildOrderInfoVo.setStatus(tradeState.getStatus());
        dexMultiChildOrderInfoVo.setMainStatus(tradeState.getStatus());
        dexMultiChildOrderInfoVo.setToTokenSymbol(tradeState.getToTokenSymbol());
        dexMultiChildOrderInfoVo.setToTokenIcon(tradeState.getToTokenIcon());
        dexMultiChildOrderInfoVo.setMark("");
        dexMultiChildOrderInfoVo.setShowArrow(false);
    }
}
