package o;

import com.okinc.business.dexlogic.main.limmitorder.bean.LimitCalResult;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitPairRateResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gND {
    public final gNE AEQbTJ;

    @yCM
    public gND(@NotNull gNE gne) {
        Intrinsics.checkNotNullParameter(gne, "");
        this.AEQbTJ = gne;
    }

    public final C30457lbX EZpvd(@NotNull LimitPairRateResponse limitPairRateResponse, LimitCalResult limitCalResult, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(limitPairRateResponse, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return this.AEQbTJ.AEQbTJ(limitPairRateResponse, limitCalResult, str, str2, str3, str4, str5);
    }
}
