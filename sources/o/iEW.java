package o;

import com.okinc.business.invest_biz.data.bean.InvestTokenWithMarketCap;
import com.okinc.business.invest_biz.data.bean.InvestUnderlyingToken;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iEW {
    @yCM
    public iEW() {
    }

    public static /* synthetic */ C23623iDf invoke$default(iEW iew, InvestUnderlyingToken investUnderlyingToken, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        return iew.OLrzqt(investUnderlyingToken, l);
    }

    public final C23623iDf OLrzqt(@NotNull InvestUnderlyingToken investUnderlyingToken, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(investUnderlyingToken, "");
        return new C23623iDf(investUnderlyingToken.getTokenSymbol(), investUnderlyingToken.getTokenName(), investUnderlyingToken.getTokenLogo(), investUnderlyingToken.isBaseToken(), new C23631iDn(l != null ? l.longValue() : investUnderlyingToken.getChainId(), investUnderlyingToken.getNetwork(), investUnderlyingToken.getTokenAddress()), new C23630iDm("", "", investUnderlyingToken.getTokenPrecision()), false, 64, null);
    }

    public static /* synthetic */ C23623iDf invoke$default(iEW iew, InvestTokenWithMarketCap investTokenWithMarketCap, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        return iew.OLrzqt(investTokenWithMarketCap, l);
    }

    public final C23623iDf OLrzqt(@NotNull InvestTokenWithMarketCap investTokenWithMarketCap, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(investTokenWithMarketCap, "");
        return new C23623iDf(investTokenWithMarketCap.getTokenSymbol(), investTokenWithMarketCap.getTokenName(), investTokenWithMarketCap.getTokenLogo(), investTokenWithMarketCap.isBaseToken(), new C23631iDn(l != null ? l.longValue() : investTokenWithMarketCap.getChainId(), investTokenWithMarketCap.getNetwork(), investTokenWithMarketCap.getTokenAddress()), new C23630iDm(investTokenWithMarketCap.getMarketCap(), investTokenWithMarketCap.getPrice(), investTokenWithMarketCap.getTokenPrecision()), false, 64, null);
    }
}
