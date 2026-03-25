package o;

import com.okinc.business.market.data.constant.Currency;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lpP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31191lpP {
    public static final C31191lpP copydefault = new C31191lpP();

    private C31191lpP() {
    }

    public final boolean KWHzl() {
        return C23272hvB.KWHzl.OLrzqt().getCurrencyId() == Currency.Usd.getId();
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (KWHzl() || str.length() == 0) ? str : C23313hvq.mulCheckS$default(str, java.lang.Double.valueOf(C23272hvB.KWHzl.OLrzqt().getUsdToThisRate()), null, null, null, 14, null);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (KWHzl() || str.length() == 0) ? str : C23313hvq.divCheckS$default(str, java.lang.Double.valueOf(C23272hvB.KWHzl.OLrzqt().getUsdToThisRate()), null, null, null, 14, null);
    }
}
