package o;

import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesAddCryptosToGroupPayload;
import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesCryptoPayload;
import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupPo;
import com.okinc.business.market.features.favorites.editing.domain.crypto.AddMarketFavoritesCryptosToGroupsUseCase$onExecute$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jSp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26118jSp extends AbstractC49400uno<kotlin.Pair<? extends java.util.List<? extends MarketFavoritesGroupPo.FavoritesPo>, ? extends java.util.List<? extends C26169jUm>>, kotlin.Pair<? extends java.util.List<? extends java.lang.String>, ? extends java.util.List<? extends java.lang.String>>> {
    public final CoroutineDispatcher AEQbTJ;
    public final C26117jSo KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @yCM
    public C26118jSp(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C26117jSo c26117jSo) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c26117jSo, "");
        this.AEQbTJ = coroutineDispatcher;
        this.KWHzl = c26117jSo;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull kotlin.Pair<? extends java.util.List<MarketFavoritesGroupPo.FavoritesPo>, ? extends java.util.List<C26169jUm>> pair, @NotNull Continuation<? super kotlin.Pair<? extends java.util.List<java.lang.String>, ? extends java.util.List<java.lang.String>>> continuation) throws java.lang.Throwable {
        AddMarketFavoritesCryptosToGroupsUseCase$onExecute$1 addMarketFavoritesCryptosToGroupsUseCase$onExecute$1;
        java.util.List<MarketFavoritesGroupPo.FavoritesPo> list;
        java.util.List<C26169jUm> list2;
        if (continuation instanceof AddMarketFavoritesCryptosToGroupsUseCase$onExecute$1) {
            addMarketFavoritesCryptosToGroupsUseCase$onExecute$1 = (AddMarketFavoritesCryptosToGroupsUseCase$onExecute$1) continuation;
            int i = addMarketFavoritesCryptosToGroupsUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                addMarketFavoritesCryptosToGroupsUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                addMarketFavoritesCryptosToGroupsUseCase$onExecute$1 = new AddMarketFavoritesCryptosToGroupsUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = addMarketFavoritesCryptosToGroupsUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = addMarketFavoritesCryptosToGroupsUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.List<MarketFavoritesGroupPo.FavoritesPo> first = pair.getFirst();
            java.util.List<C26169jUm> second = pair.getSecond();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(first, 10));
            for (MarketFavoritesGroupPo.FavoritesPo favoritesPo : first) {
                arrayList.add(new MarketFavoritesCryptoPayload(0, favoritesPo.getInstId(), favoritesPo.getInstType(), favoritesPo.getAlias(), favoritesPo.getExpTime(), favoritesPo.getChainId(), favoritesPo.getTokenContractAddress()));
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(second, 10));
            java.util.Iterator<T> it = second.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C26169jUm) it.next()).AEQbTJ().getGroupName());
            }
            MarketFavoritesAddCryptosToGroupPayload marketFavoritesAddCryptosToGroupPayload = new MarketFavoritesAddCryptosToGroupPayload(arrayList2, arrayList);
            C26117jSo c26117jSo = this.KWHzl;
            addMarketFavoritesCryptosToGroupsUseCase$onExecute$1.L$0 = first;
            addMarketFavoritesCryptosToGroupsUseCase$onExecute$1.L$1 = second;
            addMarketFavoritesCryptosToGroupsUseCase$onExecute$1.label = 1;
            if (c26117jSo.EZpvd(marketFavoritesAddCryptosToGroupPayload, addMarketFavoritesCryptosToGroupsUseCase$onExecute$1) == objCopydefault) {
                return objCopydefault;
            }
            list = first;
            list2 = second;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (java.util.List) addMarketFavoritesCryptosToGroupsUseCase$onExecute$1.L$1;
            list = (java.util.List) addMarketFavoritesCryptosToGroupsUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((MarketFavoritesGroupPo.FavoritesPo) it2.next()).getInstId());
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
        java.util.Iterator<T> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((C26169jUm) it3.next()).AEQbTJ().getGroupName());
        }
        return C56390yDp.OLrzqt(arrayList3, arrayList4);
    }
}
