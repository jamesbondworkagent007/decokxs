package o;

import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesCryptoPayload;
import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesCryptosInGroupPayload;
import com.okinc.business.market.features.favorites.editing.domain.crypto.RemoveMarketFavoritesCryptosFromGroupUseCase$onExecute$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jSr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26120jSr extends AbstractC49400uno<kotlin.Pair<? extends java.lang.String, ? extends java.util.List<? extends C26175jUs>>, kotlin.Pair<? extends java.lang.String, ? extends java.util.List<? extends C26175jUs>>> {
    public final C26117jSo EZpvd;
    public final CoroutineDispatcher copydefault;
    private static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((kotlin.Pair<java.lang.String, ? extends java.util.List<C26175jUs>>) obj, (Continuation<? super kotlin.Pair<java.lang.String, ? extends java.util.List<C26175jUs>>>) continuation);
    }

    @yCM
    public C26120jSr(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C26117jSo c26117jSo) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c26117jSo, "");
        this.copydefault = coroutineDispatcher;
        this.EZpvd = c26117jSo;
    }

    /* JADX INFO: renamed from: o.jSr$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jSr.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull kotlin.Pair<java.lang.String, ? extends java.util.List<C26175jUs>> pair, @NotNull Continuation<? super kotlin.Pair<java.lang.String, ? extends java.util.List<C26175jUs>>> continuation) throws java.lang.Throwable {
        RemoveMarketFavoritesCryptosFromGroupUseCase$onExecute$1 removeMarketFavoritesCryptosFromGroupUseCase$onExecute$1;
        if (continuation instanceof RemoveMarketFavoritesCryptosFromGroupUseCase$onExecute$1) {
            removeMarketFavoritesCryptosFromGroupUseCase$onExecute$1 = (RemoveMarketFavoritesCryptosFromGroupUseCase$onExecute$1) continuation;
            int i = removeMarketFavoritesCryptosFromGroupUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                removeMarketFavoritesCryptosFromGroupUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                removeMarketFavoritesCryptosFromGroupUseCase$onExecute$1 = new RemoveMarketFavoritesCryptosFromGroupUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = removeMarketFavoritesCryptosFromGroupUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = removeMarketFavoritesCryptosFromGroupUseCase$onExecute$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.Pair pair2 = (kotlin.Pair) removeMarketFavoritesCryptosFromGroupUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            return pair2;
        }
        C56391yDq.AEQbTJ(obj);
        java.lang.String first = pair.getFirst();
        if (first == null) {
            first = "ALL";
        }
        java.util.List<C26175jUs> second = pair.getSecond();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(second, 10));
        for (C26175jUs c26175jUs : second) {
            arrayList.add(new MarketFavoritesCryptoPayload(1, c26175jUs.AEQbTJ().getInstId(), c26175jUs.AEQbTJ().getInstType(), c26175jUs.AEQbTJ().getAlias(), c26175jUs.AEQbTJ().getExpTime(), c26175jUs.AEQbTJ().getChainId(), c26175jUs.AEQbTJ().getTokenContractAddress()));
        }
        MarketFavoritesCryptosInGroupPayload marketFavoritesCryptosInGroupPayload = new MarketFavoritesCryptosInGroupPayload(first, arrayList);
        C26117jSo c26117jSo = this.EZpvd;
        removeMarketFavoritesCryptosFromGroupUseCase$onExecute$1.L$0 = pair;
        removeMarketFavoritesCryptosFromGroupUseCase$onExecute$1.label = 1;
        return c26117jSo.KWHzl(marketFavoritesCryptosInGroupPayload, removeMarketFavoritesCryptosFromGroupUseCase$onExecute$1) == objCopydefault ? objCopydefault : pair;
    }
}
