package o;

import com.okinc.business.dexlogic.main.swap.ws.bean.MarketTxWsInfoItemBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kWC {
    public C23258huo copydefault;

    @yCM
    public kWC() {
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C23258huo c23258huo = this.copydefault;
        if (c23258huo != null) {
            c23258huo.OLrzqt();
        }
        C23258huo c23258huo2 = new C23258huo(str, str2, str3);
        this.copydefault = c23258huo2;
        c23258huo2.KWHzl(true);
    }

    public final void AEQbTJ() {
        C23258huo c23258huo = this.copydefault;
        if (c23258huo != null) {
            c23258huo.OLrzqt();
        }
    }

    public final void EZpvd(@NotNull Function1<? super MarketTxWsInfoItemBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        C23258huo c23258huo = this.copydefault;
        if (c23258huo != null) {
            c23258huo.EZpvd(function1);
        }
    }
}
