package o;

import com.okinc.dexkline.market.data.constant.Currency;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ngD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34652ngD {
    public static final C34652ngD KWHzl = new C34652ngD();

    private C34652ngD() {
    }

    public final boolean EZpvd() {
        return mRJ.AEQbTJ.EZpvd().getCurrencyId() == Currency.Usd.getId();
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (EZpvd() || str.length() == 0) ? str : mRE.mulCheckS$default(str, java.lang.Double.valueOf(mRJ.AEQbTJ.EZpvd().getUsdToThisRate()), null, null, null, 14, null);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (EZpvd() || str.length() == 0) ? str : mRE.divCheckS$default(str, java.lang.Double.valueOf(mRJ.AEQbTJ.EZpvd().getUsdToThisRate()), null, null, null, 14, null);
    }
}
