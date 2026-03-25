package o;

import com.okinc.market.discover.features.filter.data.model.CoinRequest;
import com.okinc.market.discover.features.filter.data.model.FilterCoinVo;
import com.okinc.market.discover.features.filter.domian.usecase.GetAllCoinsUseCase$onExecute$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pYo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38432pYo extends AbstractC49400uno<CoinRequest, FilterCoinVo> {
    public java.util.List<FilterCoinVo.Coin> AEQbTJ;
    public final C38430pYm EZpvd;
    public java.util.List<FilterCoinVo.Coin> KWHzl;
    public final CoroutineDispatcher OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @yCM
    public C38432pYo(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C38430pYm c38430pYm) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c38430pYm, "");
        this.OLrzqt = coroutineDispatcher;
        this.EZpvd = c38430pYm;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull CoinRequest coinRequest, @NotNull Continuation<? super FilterCoinVo> continuation) {
        return BuildersKt.withContext(AEQbTJ(), new GetAllCoinsUseCase$onExecute$2(coinRequest, this, null), continuation);
    }
}
