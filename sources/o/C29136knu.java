package o;

import com.okinc.business.market.data.model.position_pnl.LimitOrderBalanceData;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.knu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29136knu {
    public static final C29183koo EZpvd(@NotNull LimitOrderBalanceData limitOrderBalanceData) {
        Intrinsics.checkNotNullParameter(limitOrderBalanceData, "");
        return new C29183koo(limitOrderBalanceData.getCoinAmount(), limitOrderBalanceData.getCurrencyAmount(), null, null, OLrzqt(limitOrderBalanceData.getCoinAmount(), limitOrderBalanceData.getCurrencyAmount()), 12, null);
    }

    public static final boolean OLrzqt(java.lang.String str, java.lang.String str2) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str) && C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(str);
            BigDecimal bigDecimal = BigDecimal.ZERO;
            if (bigDecimalEZpvd.compareTo(bigDecimal) > 0 && C33129mqd.EZpvd(str2).compareTo(bigDecimal) > 0) {
                return true;
            }
        }
        return false;
    }

    public static final java.util.List<C29183koo> KWHzl(java.util.List<C9922bei> list) {
        if (list == null) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (C9922bei c9922bei : list) {
            java.lang.String strKWHzl = c9922bei.KWHzl();
            java.lang.String str = strKWHzl == null ? "" : strKWHzl;
            java.lang.String strAEQbTJ = c9922bei.AEQbTJ();
            arrayList.add(new C29183koo(str, strAEQbTJ == null ? "" : strAEQbTJ, C33129mqd.gEmmrt(c9922bei.copydefault()), C33129mqd.gEmmrt(c9922bei.OLrzqt()), OLrzqt(c9922bei.KWHzl(), c9922bei.AEQbTJ())));
        }
        return arrayList;
    }
}
