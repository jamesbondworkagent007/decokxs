package o;

import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iEo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23659iEo {
    @yCM
    public C23659iEo() {
    }

    public static /* synthetic */ C27294jsV invoke$default(C23659iEo c23659iEo, InvestUserRewardElementInfo investUserRewardElementInfo, boolean z, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        return c23659iEo.KWHzl(investUserRewardElementInfo, z, l);
    }

    public final C27294jsV KWHzl(@NotNull InvestUserRewardElementInfo investUserRewardElementInfo, boolean z, java.lang.Long l) {
        java.util.List listAhwBna;
        Intrinsics.checkNotNullParameter(investUserRewardElementInfo, "");
        java.lang.String tokenLogo = investUserRewardElementInfo.getTokenLogo();
        if (tokenLogo == null || (listAhwBna = C56402yEa.EZpvd(tokenLogo)) == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.List list = listAhwBna;
        java.lang.String tokenSymbol = investUserRewardElementInfo.getTokenSymbol();
        java.lang.String str = tokenSymbol == null ? "" : tokenSymbol;
        java.lang.String coinAmount = investUserRewardElementInfo.getCoinAmount();
        java.lang.String str2 = coinAmount == null ? "--" : coinAmount;
        java.lang.String currencyAmount = investUserRewardElementInfo.getCurrencyAmount();
        return new C27294jsV(list, str, str2, currencyAmount == null ? "--" : currencyAmount, z, null, null, null, l, investUserRewardElementInfo.getTokenAddress(), 224, null);
    }
}
