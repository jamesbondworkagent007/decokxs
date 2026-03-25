package o;

import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iYX {
    @yCM
    public iYX() {
    }

    public final C27326jtA EZpvd(@NotNull java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        C27586jxw c27586jxw = C27586jxw.OLrzqt;
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(str);
        CurrencyDisplayStyle currencyDisplayStyle = CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX;
        java.lang.String strKWHzl = c27586jxw.KWHzl(bigDecimalEZpvd, (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : null, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : currencyDisplayStyle, (46 & 32) != 0 ? RoundingMode.DOWN : null);
        BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(str2);
        DisplaySign displaySign = DisplaySign.EXCEPT_ZERO;
        return new C27326jtA(strKWHzl, c27586jxw.KWHzl(bigDecimalEZpvd2, (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : displaySign, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : currencyDisplayStyle, (46 & 32) != 0 ? RoundingMode.DOWN : null), str2, z, null, c27586jxw.KWHzl(C33129mqd.EZpvd(str3), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : displaySign, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : currencyDisplayStyle, (46 & 32) != 0 ? RoundingMode.DOWN : null), str3, z2, 16, null);
    }
}
