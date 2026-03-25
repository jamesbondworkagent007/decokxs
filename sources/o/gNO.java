package o;

import com.okinc.business.dexlogic.bean.QuotePriceRes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gNO {
    public final gNS KWHzl;

    @yCM
    public gNO(@NotNull gNS gns) {
        Intrinsics.checkNotNullParameter(gns, "");
        this.KWHzl = gns;
    }

    public final C30457lbX EZpvd(@NotNull QuotePriceRes quotePriceRes, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.KWHzl.OLrzqt(quotePriceRes, str, str2);
    }
}
