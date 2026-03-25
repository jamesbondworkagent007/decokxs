package o;

import com.okinc.business.dex.trade.core.domain.usecase.QuoteV6FirstHandler$poll$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import o.gYS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gYV implements gYU {
    public final gYO EZpvd;

    public gYV(@NotNull gYO gyo) {
        Intrinsics.checkNotNullParameter(gyo, "");
        this.EZpvd = gyo;
    }

    @Override // o.gYU
    public Flow<gYP> AEQbTJ(@NotNull gYS gys, long j) {
        Intrinsics.checkNotNullParameter(gys, "");
        if (gys instanceof gYS.Activity) {
            return gYY.EZpvd(j, new QuoteV6FirstHandler$poll$1(this, gys, null));
        }
        throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
    }
}
