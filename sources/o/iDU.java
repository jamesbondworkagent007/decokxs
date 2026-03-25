package o;

import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo;
import com.okinc.business.invest_biz.data.bean.response.InvestedToken;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iDU {
    @yCM
    public iDU() {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<C27368jtq> AEQbTJ(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<InvestedToken> list) {
        java.lang.String str3;
        java.lang.String coinAmount;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (InvestedToken investedToken : list) {
            java.lang.String strDbNXlk = investedToken.DbNXlk();
            long jIsConnected = investedToken.isConnected();
            C27586jxw c27586jxw = C27586jxw.OLrzqt;
            BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(investedToken.iwGUEr());
            CurrencyDisplayStyle currencyDisplayStyle = CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX;
            java.lang.String strKWHzl = c27586jxw.KWHzl(bigDecimalEZpvd, (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : DisplaySign.EXCEPT_ZERO, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : currencyDisplayStyle, (46 & 32) != 0 ? RoundingMode.DOWN : null);
            java.lang.String strIwGUEr = investedToken.iwGUEr();
            java.lang.String fieldNames = investedToken.getFieldNames();
            java.lang.String strKWHzl2 = c27586jxw.KWHzl(C33129mqd.EZpvd(investedToken.getFieldNames()), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : null, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : currencyDisplayStyle, (46 & 32) != 0 ? RoundingMode.DOWN : null);
            InvestBaseDefiTokenInfo investBaseDefiTokenInfo = (InvestBaseDefiTokenInfo) CollectionsKt___CollectionsKt.firstOrNull(investedToken.getNewProxyInstance());
            java.lang.String str4 = (investBaseDefiTokenInfo == null || (coinAmount = investBaseDefiTokenInfo.getCoinAmount()) == null) ? "" : coinAmount;
            InvestBaseDefiTokenInfo investBaseDefiTokenInfo2 = (InvestBaseDefiTokenInfo) CollectionsKt___CollectionsKt.firstOrNull(investedToken.getNewProxyInstance());
            if (investBaseDefiTokenInfo2 != null) {
                java.lang.String strLocalizeCryptoAmount$default = C27586jxw.localizeCryptoAmount$default(c27586jxw, C33129mqd.EZpvd(investBaseDefiTokenInfo2.getCoinAmount()), 0, c27586jxw.OLrzqt(java.lang.Long.valueOf(j), investBaseDefiTokenInfo2.getTokenAddress()), null, null, null, 58, null);
                str3 = strLocalizeCryptoAmount$default == null ? "" : strLocalizeCryptoAmount$default;
            }
            java.util.ArrayList arrayList2 = arrayList;
            arrayList2.add(new C27368jtq(strDbNXlk, jIsConnected, strKWHzl, strIwGUEr, 0, fieldNames, strKWHzl2, str3, str4, investedToken.AhwBna(), investedToken, str, str2, j, 16, null));
            arrayList = arrayList2;
        }
        return arrayList;
    }
}
