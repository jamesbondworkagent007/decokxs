package o;

import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo;
import com.okinc.business.invest_biz.data.bean.response.InvestedToken;
import com.okinc.business.invest_biz.data.contants.ProductType;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iDX {
    @yCM
    public iDX() {
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<C27370jts> OLrzqt(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<InvestedToken> list) {
        boolean z;
        java.lang.String str3;
        java.lang.String coinAmount;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (InvestedToken investedToken : list) {
            java.lang.String strDbNXlk = investedToken.DbNXlk();
            long jIsConnected = investedToken.isConnected();
            java.lang.String strIwGUEr = investedToken.iwGUEr();
            C27586jxw c27586jxw = C27586jxw.OLrzqt;
            BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(investedToken.iwGUEr());
            CurrencyDisplayStyle currencyDisplayStyle = CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX;
            java.lang.String strKWHzl = c27586jxw.KWHzl(bigDecimalEZpvd, (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : DisplaySign.EXCEPT_ZERO, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : currencyDisplayStyle, (46 & 32) != 0 ? RoundingMode.DOWN : null);
            java.lang.String fieldNames = investedToken.getFieldNames();
            java.lang.String strKWHzl2 = c27586jxw.KWHzl(C33129mqd.EZpvd(investedToken.getFieldNames()), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : null, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : currencyDisplayStyle, (46 & 32) != 0 ? RoundingMode.DOWN : null);
            if (investedToken.fJNWhG() == ProductType.Pool || investedToken.fJNWhG() == ProductType.Farm || !C33129mqd.KWHzl((java.util.Collection) investedToken.getNewProxyInstance()) || investedToken.getNewProxyInstance().size() != 1) {
                z = false;
            } else {
                InvestBaseDefiTokenInfo investBaseDefiTokenInfo = (InvestBaseDefiTokenInfo) CollectionsKt___CollectionsKt.firstOrNull(investedToken.getNewProxyInstance());
                if (C33129mqd.OLrzqt((java.lang.CharSequence) (investBaseDefiTokenInfo != null ? investBaseDefiTokenInfo.getCoinAmount() : null))) {
                    z = true;
                }
            }
            InvestBaseDefiTokenInfo investBaseDefiTokenInfo2 = (InvestBaseDefiTokenInfo) CollectionsKt___CollectionsKt.firstOrNull(investedToken.getNewProxyInstance());
            if (investBaseDefiTokenInfo2 != null) {
                java.lang.String strLocalizeCryptoAmount$default = C27586jxw.localizeCryptoAmount$default(c27586jxw, C33129mqd.EZpvd(investBaseDefiTokenInfo2.getCoinAmount()), 0, c27586jxw.OLrzqt(java.lang.Long.valueOf(j), investBaseDefiTokenInfo2.getTokenAddress()), null, null, null, 58, null);
                str3 = strLocalizeCryptoAmount$default == null ? "" : strLocalizeCryptoAmount$default;
            }
            InvestBaseDefiTokenInfo investBaseDefiTokenInfo3 = (InvestBaseDefiTokenInfo) CollectionsKt___CollectionsKt.firstOrNull(investedToken.getNewProxyInstance());
            java.util.ArrayList arrayList2 = arrayList;
            arrayList2.add(new C27370jts(strDbNXlk, jIsConnected, strKWHzl, strIwGUEr, 0, fieldNames, strKWHzl2, str3, (investBaseDefiTokenInfo3 == null || (coinAmount = investBaseDefiTokenInfo3.getCoinAmount()) == null) ? "" : coinAmount, z, investedToken.values(), investedToken, str, str2, j, c27586jxw.AEQbTJ(C33129mqd.EZpvd(investedToken.valueOf()), (38 & 2) != 0 ? 0 : 0, (38 & 4) != 0 ? 2 : 0, (38 & 8) == 0, (38 & 16) != 0 ? DisplaySign.EXCEPT_ZERO : DisplaySign.AUTO, (38 & 32) != 0 ? RoundingMode.DOWN : null), C33129mqd.OLrzqt((java.lang.CharSequence) investedToken.valueOf()) && C33129mqd.AEQbTJ(investedToken.valueOf(), "0"), 16, null));
            arrayList = arrayList2;
        }
        return arrayList;
    }
}
