package o;

import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesCryptoPayload;
import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesCryptosInGroupPayload;
import com.okinc.business.market.features.favorites.editing.domain.crypto.RearrangeMarketFavoritesCryptosInGroupUseCase$onExecute$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jSq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26119jSq extends AbstractC49400uno<kotlin.Pair<? extends java.lang.String, ? extends java.util.List<? extends C26175jUs>>, Unit> {
    public final CoroutineDispatcher EZpvd;
    public final C26117jSo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public C26119jSq(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C26117jSo c26117jSo) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c26117jSo, "");
        this.EZpvd = coroutineDispatcher;
        this.copydefault = c26117jSo;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull kotlin.Pair<java.lang.String, ? extends java.util.List<C26175jUs>> pair, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        RearrangeMarketFavoritesCryptosInGroupUseCase$onExecute$1 rearrangeMarketFavoritesCryptosInGroupUseCase$onExecute$1;
        if (continuation instanceof RearrangeMarketFavoritesCryptosInGroupUseCase$onExecute$1) {
            rearrangeMarketFavoritesCryptosInGroupUseCase$onExecute$1 = (RearrangeMarketFavoritesCryptosInGroupUseCase$onExecute$1) continuation;
            int i = rearrangeMarketFavoritesCryptosInGroupUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rearrangeMarketFavoritesCryptosInGroupUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                rearrangeMarketFavoritesCryptosInGroupUseCase$onExecute$1 = new RearrangeMarketFavoritesCryptosInGroupUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = rearrangeMarketFavoritesCryptosInGroupUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = rearrangeMarketFavoritesCryptosInGroupUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.lang.String first = pair.getFirst();
            java.util.List<C26175jUs> second = pair.getSecond();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(second, 10));
            for (C26175jUs c26175jUs : second) {
                arrayList.add(new MarketFavoritesCryptoPayload(2, c26175jUs.AEQbTJ().getInstId(), c26175jUs.AEQbTJ().getInstType(), c26175jUs.AEQbTJ().getAlias(), c26175jUs.AEQbTJ().getExpTime(), c26175jUs.AEQbTJ().getChainId(), c26175jUs.AEQbTJ().getTokenContractAddress()));
            }
            if (first == null) {
                first = "";
            }
            MarketFavoritesCryptosInGroupPayload marketFavoritesCryptosInGroupPayload = new MarketFavoritesCryptosInGroupPayload(first, arrayList);
            C26117jSo c26117jSo = this.copydefault;
            rearrangeMarketFavoritesCryptosInGroupUseCase$onExecute$1.label = 1;
            if (c26117jSo.OLrzqt(marketFavoritesCryptosInGroupPayload, rearrangeMarketFavoritesCryptosInGroupUseCase$onExecute$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
