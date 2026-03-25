package o;

import com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iDP {
    @yCM
    public iDP() {
    }

    public static /* synthetic */ C27294jsV invoke$default(iDP idp, InvestBaseDefiTokenInfo investBaseDefiTokenInfo, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        return idp.AEQbTJ(investBaseDefiTokenInfo, l);
    }

    public final C27294jsV AEQbTJ(@NotNull InvestBaseDefiTokenInfo investBaseDefiTokenInfo, java.lang.Long l) {
        java.util.List listAhwBna;
        Intrinsics.checkNotNullParameter(investBaseDefiTokenInfo, "");
        java.lang.String tokenLogo = investBaseDefiTokenInfo.getTokenLogo();
        if (tokenLogo == null || (listAhwBna = C56402yEa.EZpvd(tokenLogo)) == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.List list = listAhwBna;
        java.lang.String tokenSymbol = investBaseDefiTokenInfo.getTokenSymbol();
        java.lang.String str = tokenSymbol == null ? "" : tokenSymbol;
        java.lang.String coinAmount = investBaseDefiTokenInfo.getCoinAmount();
        java.lang.String str2 = coinAmount == null ? "--" : coinAmount;
        java.lang.String currencyAmount = investBaseDefiTokenInfo.getCurrencyAmount();
        return new C27294jsV(list, str, str2, currencyAmount == null ? "--" : currencyAmount, false, null, null, null, l, investBaseDefiTokenInfo.getTokenAddress(), 224, null);
    }
}
