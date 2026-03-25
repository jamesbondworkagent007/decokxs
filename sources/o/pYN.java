package o;

import com.okinc.market.discover.features.filter.data.model.FilterCoinVo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class pYN extends C40512qYp {
    public pYN(@NotNull pYE pye) {
        Intrinsics.checkNotNullParameter(pye, "");
        register(FilterCoinVo.Coin.class, new pYM(pye));
    }
}
