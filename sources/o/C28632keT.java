package o;

import com.okinc.business.market.features.meme.data.model.PrivateBuySignalWsData;
import com.okinc.business.market.features.meme.data.model.PublicBuySignalWsData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.keT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28632keT {
    public static final C28632keT AEQbTJ = new C28632keT();

    private C28632keT() {
    }

    public final C28636keX AEQbTJ(@NotNull PublicBuySignalWsData publicBuySignalWsData) {
        Intrinsics.checkNotNullParameter(publicBuySignalWsData, "");
        java.lang.String txHash = publicBuySignalWsData.getTxHash();
        java.lang.String walletAddress = publicBuySignalWsData.getWalletAddress();
        java.lang.String tokenAddress = publicBuySignalWsData.getTokenAddress();
        int tokenChainId = publicBuySignalWsData.getTokenChainId();
        double turnover = publicBuySignalWsData.getTurnover();
        return new C28636keX(txHash, walletAddress, tokenAddress, java.lang.String.valueOf(tokenChainId), java.lang.String.valueOf(turnover), false, publicBuySignalWsData.isKOL(), publicBuySignalWsData.isSmartMoney(), publicBuySignalWsData.getBlockTime());
    }

    public final C28636keX KWHzl(@NotNull PrivateBuySignalWsData privateBuySignalWsData) {
        Intrinsics.checkNotNullParameter(privateBuySignalWsData, "");
        return new C28636keX(privateBuySignalWsData.getTxHash(), privateBuySignalWsData.getWalletAddress(), privateBuySignalWsData.getTokenAddress(), privateBuySignalWsData.getTokenChainId(), privateBuySignalWsData.getTurnover(), true, privateBuySignalWsData.isKOL(), privateBuySignalWsData.isSmartMoney(), privateBuySignalWsData.getTradeTime());
    }
}
