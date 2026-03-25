package o;

import com.okinc.business.dex.tee.domain.model.CreateOrderParams;
import com.okinc.business.dex.tee.domain.model.StrategyType;
import com.okinc.business.dex.tee.domain.model.TeeLimitPlaceOrderParams;
import com.okinc.business.dex.tee.domain.model.TransactionIntentData;
import com.okinc.business.dex.tee.domain.model.VerifySignInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gNl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19737gNl {
    public final gLS EZpvd;

    @yCM
    public C19737gNl(@NotNull gLS gls) {
        Intrinsics.checkNotNullParameter(gls, "");
        this.EZpvd = gls;
    }

    public final TransactionIntentData OLrzqt(@NotNull TeeLimitPlaceOrderParams teeLimitPlaceOrderParams, long j, long j2) {
        Intrinsics.checkNotNullParameter(teeLimitPlaceOrderParams, "");
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(this.EZpvd.EZpvd(teeLimitPlaceOrderParams.getFromAmount(), C33129mqd.AhwBna(teeLimitPlaceOrderParams.getFromTokenDecimals())));
        java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(this.EZpvd.EZpvd(teeLimitPlaceOrderParams.getMinimumReceived(), C33129mqd.AhwBna(teeLimitPlaceOrderParams.getToTokenDecimals())));
        pUU.KWHzl("mapToIntentData", "fromAmount =" + teeLimitPlaceOrderParams.getFromAmount() + "  fromTokenDecimals=" + teeLimitPlaceOrderParams.getFromTokenDecimals() + "  minimumReceived= " + teeLimitPlaceOrderParams.getMinimumReceived() + "  toTokenDecimals= " + teeLimitPlaceOrderParams.getToTokenDecimals() + "   fromAmt" + strGEmmrt + "    minimum=" + strGEmmrt2);
        java.lang.String chainId = teeLimitPlaceOrderParams.getChainId();
        StrategyType strategyType = teeLimitPlaceOrderParams.getStrategyType();
        java.lang.String userWalletAddress = teeLimitPlaceOrderParams.getUserWalletAddress();
        C31195lpT c31195lpT = C31195lpT.AEQbTJ;
        return new TransactionIntentData(chainId, strategyType, userWalletAddress, c31195lpT.EZpvd(j), c31195lpT.EZpvd(j2), teeLimitPlaceOrderParams.getFromTokenAddress(), teeLimitPlaceOrderParams.getToTokenAddress(), strGEmmrt, strGEmmrt2, teeLimitPlaceOrderParams.getReferrerAddress(), teeLimitPlaceOrderParams.getReferralCode(), C33129mqd.gEmmrt(java.lang.Long.valueOf(j)));
    }

    public final CreateOrderParams KWHzl(@NotNull TeeLimitPlaceOrderParams teeLimitPlaceOrderParams, @NotNull java.lang.String str, @NotNull java.lang.String str2, long j) {
        Intrinsics.checkNotNullParameter(teeLimitPlaceOrderParams, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new CreateOrderParams(teeLimitPlaceOrderParams.getChainId(), teeLimitPlaceOrderParams.getUserWalletAddress(), teeLimitPlaceOrderParams.getRule(), teeLimitPlaceOrderParams.getPreset(), new VerifySignInfo(teeLimitPlaceOrderParams.getAccountId(), teeLimitPlaceOrderParams.getUserWalletAddress(), C33129mqd.valueOf(teeLimitPlaceOrderParams.getChainId()), teeLimitPlaceOrderParams.getTeeId(), str, str2), teeLimitPlaceOrderParams.getReferralCode(), teeLimitPlaceOrderParams.getSourceType(), teeLimitPlaceOrderParams.getStrategyDirection(), teeLimitPlaceOrderParams.getReferrerAddress(), C33129mqd.gEmmrt(java.lang.Long.valueOf(j)), (java.lang.String) null, teeLimitPlaceOrderParams.getServiceFeeInfo(), teeLimitPlaceOrderParams.getEstimateGasFee(), teeLimitPlaceOrderParams.getTeeSilentSignEnabled(), 1024, (DefaultConstructorMarker) null);
    }
}
