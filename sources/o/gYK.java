package o;

import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BroadcastResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteResponseData;
import com.okinc.business.dex.trade.core.domain.model.common.MevConfig;
import com.okinc.business.dex.trade.core.domain.model.common.V6CallData;
import com.okinc.business.dexlogic.bean.CallData;
import com.okinc.business.dexlogic.bean.IntentBridgeQuoteCallData;
import com.okinc.business.dexlogic.bean.JitoData;
import com.okinc.business.dexlogic.bean.MergeCallData;
import com.okinc.business.dexlogic.bean.MergeQuoteCallData;
import com.okinc.business.dexlogic.bean.QuoteCallData;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.UnsignedSwapData;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class gYK {
    public static final gYK EZpvd = new gYK();

    private gYK() {
    }

    public final CallData AEQbTJ(V6CallData v6CallData) {
        if (v6CallData == null) {
            return new CallData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 32767, (DefaultConstructorMarker) null);
        }
        return new CallData(v6CallData.getFrom(), v6CallData.getTo(), v6CallData.getData(), v6CallData.getValue(), v6CallData.getGasPrice(), v6CallData.getGas(), v6CallData.getPriorityFee(), v6CallData.getSender(), v6CallData.getMemo(), v6CallData.getMemoPos(), v6CallData.getBridgeId(), v6CallData.getMaxFeePerGas(), v6CallData.getMaxPriorityFeePerGas(), (java.lang.String) null, false, 24576, (DefaultConstructorMarker) null);
    }

    public final MergeCallData OLrzqt(V6CalldataResponseData v6CalldataResponseData) {
        if (v6CalldataResponseData == null) {
            return new MergeCallData((UnsignedSwapData) null, 1, (DefaultConstructorMarker) null);
        }
        java.lang.String orderId = v6CalldataResponseData.getOrderId();
        java.lang.String str = orderId == null ? "" : orderId;
        CallData callDataAEQbTJ = AEQbTJ(v6CalldataResponseData.getCallData());
        java.lang.String unsignedTx = v6CalldataResponseData.getUnsignedTx();
        java.lang.String str2 = unsignedTx == null ? "" : unsignedTx;
        JitoData jitoData = v6CalldataResponseData.getJitoData();
        MevConfig mevConfig = v6CalldataResponseData.getMevConfig();
        boolean enableMev = mevConfig != null ? mevConfig.getEnableMev() : false;
        java.lang.Boolean hasReferralCommission = v6CalldataResponseData.getHasReferralCommission();
        return new MergeCallData(new UnsignedSwapData(str, callDataAEQbTJ, str2, "", null, "", null, null, jitoData, enableMev, hasReferralCommission != null ? hasReferralCommission.booleanValue() : false, v6CalldataResponseData.getMevConfig()));
    }

    public final MergeQuoteCallData OLrzqt(V6QuoteAndCalldataResponseData v6QuoteAndCalldataResponseData) {
        gYK gyk;
        V6CallData callData;
        java.lang.Boolean hasReferralCommission;
        MevConfig mevConfig;
        if (v6QuoteAndCalldataResponseData == null) {
            return new MergeQuoteCallData((QuoteCallData) null, (IntentBridgeQuoteCallData) null, 3, (DefaultConstructorMarker) null);
        }
        QuotePriceRes quotePriceResAEQbTJ = gYM.EZpvd.AEQbTJ(new V6QuoteResponseData(v6QuoteAndCalldataResponseData.getCommonDexInfo(), v6QuoteAndCalldataResponseData.getDefiPlatformInfoList(), v6QuoteAndCalldataResponseData.getNetworkFeeInfo(), null, 8, null));
        DefiPlatformInfo selectedDeFiPlatform = v6QuoteAndCalldataResponseData.getSelectedDeFiPlatform();
        V6CalldataResponseData transactionData = selectedDeFiPlatform != null ? selectedDeFiPlatform.getTransactionData() : null;
        MevConfig mevConfig2 = transactionData != null ? transactionData.getMevConfig() : null;
        java.lang.String orderId = transactionData != null ? transactionData.getOrderId() : null;
        java.lang.String str = orderId == null ? "" : orderId;
        if (transactionData != null) {
            callData = transactionData.getCallData();
            gyk = this;
        } else {
            gyk = this;
            callData = null;
        }
        CallData callDataAEQbTJ = gyk.AEQbTJ(callData);
        java.lang.String unsignedTx = transactionData != null ? transactionData.getUnsignedTx() : null;
        return new MergeQuoteCallData(new QuoteCallData(new UnsignedSwapData(str, callDataAEQbTJ, unsignedTx == null ? "" : unsignedTx, "", null, "", quotePriceResAEQbTJ, null, transactionData != null ? transactionData.getJitoData() : null, (transactionData == null || (mevConfig = transactionData.getMevConfig()) == null) ? false : mevConfig.getEnableMev(), (transactionData == null || (hasReferralCommission = transactionData.getHasReferralCommission()) == null) ? false : hasReferralCommission.booleanValue(), mevConfig2), quotePriceResAEQbTJ), (IntentBridgeQuoteCallData) null, 2, (DefaultConstructorMarker) null);
    }

    public final ResponseData<java.lang.String> EZpvd(@NotNull V6BroadcastResponseData v6BroadcastResponseData) {
        Intrinsics.checkNotNullParameter(v6BroadcastResponseData, "");
        int i = Intrinsics.EZpvd(v6BroadcastResponseData.isSuccess(), java.lang.Boolean.TRUE) ? 0 : -1;
        ResponseData responseData = new ResponseData(0, null, null, null, null, null, 63, null);
        java.lang.String transactionHash = v6BroadcastResponseData.getTransactionHash();
        return ResponseData.copy$default(responseData, i, "", null, null, transactionHash == null ? "" : transactionHash, null, 44, null);
    }
}
