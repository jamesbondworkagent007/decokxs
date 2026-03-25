package o;

import com.okinc.business.dex.trade.core.domain.usecase.QuoteAndCalldataV6Handler$poll$1;
import com.okinc.business.dex.trade.core.domain.usecase.QuoteAndCalldataV6Handler$poll$2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.gYS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gYW implements gYU {
    public final gYO copydefault;

    public gYW(@NotNull gYO gyo) {
        Intrinsics.checkNotNullParameter(gyo, "");
        this.copydefault = gyo;
    }

    @Override // o.gYU
    public Flow<gYP> AEQbTJ(@NotNull gYS gys, long j) {
        Intrinsics.checkNotNullParameter(gys, "");
        if (!(gys instanceof gYS.Application)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (((gYS.Application) gys).KWHzl()) {
            return gYY.EZpvd(j, new QuoteAndCalldataV6Handler$poll$1(this, gys, null));
        }
        return FlowKt.flow(new QuoteAndCalldataV6Handler$poll$2(this, gys, null));
    }
}
