package o;

import com.okinc.market.discover.features.filter.data.model.FilterCoinPo;
import com.okinc.market.discover.features.filter.data.model.TokenGroupPo;
import com.okinc.market.discover.features.filter.data.model.UpdateCustomReq;
import com.okinc.market.discover.features.filter.data.repo.TokenFilterRepo$queryAllCoins$2;
import com.okinc.market.discover.features.filter.data.repo.TokenFilterRepo$queryTokenGroupInfo$2;
import com.okinc.market.discover.features.filter.data.repo.TokenFilterRepo$updateCustomFilter$2;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pYm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38430pYm {
    public final C38426pYi KWHzl;
    public final CoroutineDispatcher OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoroutineDispatcher EZpvd() {
        return this.OLrzqt;
    }

    @yCM
    public C38430pYm(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C38426pYi c38426pYi) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c38426pYi, "");
        this.OLrzqt = coroutineDispatcher;
        this.KWHzl = c38426pYi;
    }

    public final java.lang.Object OLrzqt(@NotNull Continuation<? super ResponseData<java.util.List<TokenGroupPo>>> continuation) {
        return BuildersKt.withContext(EZpvd(), new TokenFilterRepo$queryTokenGroupInfo$2(this, null), continuation);
    }

    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super ResponseData<java.util.List<FilterCoinPo>>> continuation) {
        return BuildersKt.withContext(EZpvd(), new TokenFilterRepo$queryAllCoins$2(this, null), continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull UpdateCustomReq updateCustomReq, @NotNull Continuation<? super ResponseData<java.util.List<Unit>>> continuation) {
        return BuildersKt.withContext(EZpvd(), new TokenFilterRepo$updateCustomFilter$2(this, updateCustomReq, null), continuation);
    }
}
