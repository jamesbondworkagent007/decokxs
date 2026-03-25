package o;

import com.okinc.market.discover.features.filter.data.model.FilterCoinVo;
import com.okinc.market.discover.features.filter.data.model.TokenGroupVo;
import com.okinc.market.discover.features.filter.domian.usecase.CustomFilterUseCase$onExecute$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pYk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38428pYk extends AbstractC49400uno<kotlin.Pair<? extends TokenGroupVo, ? extends java.util.List<? extends FilterCoinVo.Coin>>, TokenGroupVo> {
    public final C38430pYm AEQbTJ;
    public final CoroutineDispatcher EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public C38428pYk(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C38430pYm c38430pYm) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c38430pYm, "");
        this.EZpvd = coroutineDispatcher;
        this.AEQbTJ = c38430pYm;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull kotlin.Pair<TokenGroupVo, ? extends java.util.List<FilterCoinVo.Coin>> pair, @NotNull Continuation<? super TokenGroupVo> continuation) {
        return BuildersKt.withContext(AEQbTJ(), new CustomFilterUseCase$onExecute$2(pair, this, null), continuation);
    }
}
