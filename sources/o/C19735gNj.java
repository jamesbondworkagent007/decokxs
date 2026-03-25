package o;

import com.okinc.business.dex.tee.domain.model.SellRule;
import com.okinc.business.dex.tee.domain.model.SignAndBroadcastParams;
import com.okinc.business.dex.tee.domain.model.StrategyType;
import com.okinc.business.dex.tee.domain.model.TeeMarketPlaceOrderParams;
import com.okinc.business.dex.tee.domain.model.TpslConfig;
import com.okinc.business.dex.tee.domain.model.TransactionIntentData;
import com.okinc.business.dex.tee.domain.model.WalletAuthParam;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gNj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19735gNj {
    public final gLS copydefault;

    @yCM
    public C19735gNj(@NotNull gLS gls) {
        Intrinsics.checkNotNullParameter(gls, "");
        this.copydefault = gls;
    }

    public final TransactionIntentData EZpvd(@NotNull TeeMarketPlaceOrderParams teeMarketPlaceOrderParams, long j, long j2) {
        Intrinsics.checkNotNullParameter(teeMarketPlaceOrderParams, "");
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(this.copydefault.EZpvd(teeMarketPlaceOrderParams.getAmount(), C33129mqd.AhwBna(teeMarketPlaceOrderParams.getFromTokenDecimals())));
        java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(this.copydefault.EZpvd(teeMarketPlaceOrderParams.getMinimumReceived(), C33129mqd.AhwBna(teeMarketPlaceOrderParams.getToTokenDecimals())));
        pUU.KWHzl("mapToIntentData", "fromAmount =" + teeMarketPlaceOrderParams.getAmount() + "  fromTokenDecimals=" + teeMarketPlaceOrderParams.getFromTokenDecimals() + "  minimumReceived= " + teeMarketPlaceOrderParams.getMinimumReceived() + "  toTokenDecimals= " + teeMarketPlaceOrderParams.getToTokenDecimals() + "   fromAmt" + strGEmmrt + "    minimum=" + strGEmmrt2 + "  referralCode " + teeMarketPlaceOrderParams.getRefParam().getRefCode() + "  referralAddress" + teeMarketPlaceOrderParams.getRefParam().getRefAddress());
        java.lang.String chainId = teeMarketPlaceOrderParams.getChainId();
        StrategyType strategyType = teeMarketPlaceOrderParams.getStrategyType();
        java.lang.String walletAddress = teeMarketPlaceOrderParams.getWalletAddress();
        C31195lpT c31195lpT = C31195lpT.AEQbTJ;
        return new TransactionIntentData(chainId, strategyType, walletAddress, c31195lpT.EZpvd(j), c31195lpT.EZpvd(j2), teeMarketPlaceOrderParams.getFromTokenAddress(), teeMarketPlaceOrderParams.getToTokenAddress(), strGEmmrt, strGEmmrt2, teeMarketPlaceOrderParams.getRefParam().getRefAddress(), teeMarketPlaceOrderParams.getRefParam().getRefCode(), java.lang.String.valueOf(j));
    }

    public final SignAndBroadcastParams KWHzl(@NotNull TeeMarketPlaceOrderParams teeMarketPlaceOrderParams, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z) {
        TpslConfig tpslConfigCopy$default;
        Intrinsics.checkNotNullParameter(teeMarketPlaceOrderParams, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.lang.String maxSlippage = teeMarketPlaceOrderParams.getMaxSlippage();
        java.lang.String priorityFeeType = teeMarketPlaceOrderParams.getPriorityFeeType();
        java.lang.String priorityFee = teeMarketPlaceOrderParams.getPriorityFee();
        java.lang.String routerModeType = teeMarketPlaceOrderParams.getRouterModeType();
        TpslConfig tpslConfig = teeMarketPlaceOrderParams.getTpslConfig();
        if (tpslConfig != null) {
            SellRule sellRule = teeMarketPlaceOrderParams.getTpslConfig().getSellRule();
            tpslConfigCopy$default = TpslConfig.copy$default(tpslConfig, sellRule != null ? SellRule.copy$default(sellRule, str, null, null, 6, null) : null, null, null, 6, null);
        } else {
            tpslConfigCopy$default = null;
        }
        return new SignAndBroadcastParams(maxSlippage, priorityFeeType, priorityFee, routerModeType, tpslConfigCopy$default, teeMarketPlaceOrderParams.getOrderSource(), new WalletAuthParam(str2, str3, teeMarketPlaceOrderParams.getAccountId(), teeMarketPlaceOrderParams.getWalletAddress(), teeMarketPlaceOrderParams.getTeeId(), teeMarketPlaceOrderParams.getChainId(), teeMarketPlaceOrderParams.getStrategyType().getCommand()), teeMarketPlaceOrderParams.getGasPrice(), teeMarketPlaceOrderParams.getEnableJito(), teeMarketPlaceOrderParams.getGasUsed(), teeMarketPlaceOrderParams.getMevInfo(), teeMarketPlaceOrderParams.getServiceFeeInfo(), teeMarketPlaceOrderParams.getTradeMode().getType(), teeMarketPlaceOrderParams.getTraceData(), teeMarketPlaceOrderParams.getDirection(), teeMarketPlaceOrderParams.getChainId(), teeMarketPlaceOrderParams.getFromTokenAddress(), teeMarketPlaceOrderParams.getToTokenAddress(), teeMarketPlaceOrderParams.getAmount(), teeMarketPlaceOrderParams.getSlippageType(), teeMarketPlaceOrderParams.getSlippage(), teeMarketPlaceOrderParams.getUserWalletAddress(), teeMarketPlaceOrderParams.getAccountId(), teeMarketPlaceOrderParams.getToAmount(), (java.util.List) null, z, teeMarketPlaceOrderParams.getQuoteId(), 16777216, (DefaultConstructorMarker) null);
    }
}
