package o;

import com.amplifyframework.ui.liveness.camera.LivenessCoordinator;
import com.okinc.business.dex.tee.domain.model.StrategyType;
import com.okinc.business.dex.tee.domain.model.TransactionIntentData;
import com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingStrategy;
import com.okinc.wallet.api.bean.ReferralInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gSn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19874gSn {
    public final kYC AEQbTJ;
    public final InterfaceC23209hts EZpvd;

    @yCM
    public C19874gSn(@NotNull InterfaceC23209hts interfaceC23209hts, @NotNull kYC kyc) {
        Intrinsics.checkNotNullParameter(interfaceC23209hts, "");
        Intrinsics.checkNotNullParameter(kyc, "");
        this.EZpvd = interfaceC23209hts;
        this.AEQbTJ = kyc;
    }

    public final TransactionIntentData KWHzl(@NotNull CopyTradingStrategy copyTradingStrategy, long j, long j2) {
        Intrinsics.checkNotNullParameter(copyTradingStrategy, "");
        ReferralInfo referralInfoEZpvd = this.EZpvd.EZpvd(this.AEQbTJ.KWHzl(), copyTradingStrategy.getChainId());
        java.lang.String chainId = copyTradingStrategy.getChainId();
        StrategyType strategyType = StrategyType.StrategyCopyTrade;
        java.lang.String userWalletAddress = copyTradingStrategy.getUserWalletAddress();
        C31195lpT c31195lpT = C31195lpT.AEQbTJ;
        java.lang.String strEZpvd = c31195lpT.EZpvd(j);
        java.lang.String strEZpvd2 = c31195lpT.EZpvd(j2);
        java.lang.String referralAddress = referralInfoEZpvd != null ? referralInfoEZpvd.getReferralAddress() : null;
        java.lang.String str = referralAddress == null ? "" : referralAddress;
        java.lang.String referralCode = referralInfoEZpvd != null ? referralInfoEZpvd.getReferralCode() : null;
        return new TransactionIntentData(chainId, strategyType, userWalletAddress, strEZpvd, strEZpvd2, null, null, null, null, str, referralCode == null ? "" : referralCode, java.lang.String.valueOf(j), LivenessCoordinator.TARGET_WIDTH, null);
    }
}
