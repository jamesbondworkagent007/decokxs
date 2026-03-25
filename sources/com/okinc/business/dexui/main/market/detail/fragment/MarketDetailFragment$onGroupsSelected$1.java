package com.okinc.business.dexui.main.market.detail.fragment;

import com.okinc.business.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.business.market.data.model.watchlist.FavoriteAction;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes15.dex */
public final class MarketDetailFragment$onGroupsSelected$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Pair<List<Integer>, List<Integer>> $newSelectionsChanges;
    final /* synthetic */ List<HomeToken> $tokens;
    int label;
    final /* synthetic */ MarketDetailFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.Pair<? extends java.util.List<java.lang.Integer>, ? extends java.util.List<java.lang.Integer>> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MarketDetailFragment$onGroupsSelected$1(Pair<? extends List<Integer>, ? extends List<Integer>> pair, MarketDetailFragment marketDetailFragment, List<HomeToken> list, Continuation<? super MarketDetailFragment$onGroupsSelected$1> continuation) {
        super(2, continuation);
        this.$newSelectionsChanges = pair;
        this.this$0 = marketDetailFragment;
        this.$tokens = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketDetailFragment$onGroupsSelected$1(this.$newSelectionsChanges, this.this$0, this.$tokens, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketDetailFragment$onGroupsSelected$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Pair<List<Integer>, List<Integer>> pair = this.$newSelectionsChanges;
            List<Integer> listComponent1 = pair.component1();
            List<Integer> listComponent2 = pair.component2();
            MarketCoinDetailViewModel marketCoinDetailViewModelIwGUEr = this.this$0.iwGUEr();
            FavoriteAction favoriteAction = FavoriteAction.UpdateWatchList;
            List<HomeToken> list = this.$tokens;
            this.label = 1;
            objOLrzqt = marketCoinDetailViewModelIwGUEr.OLrzqt(favoriteAction, list, listComponent1, listComponent2, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        this.this$0.OLrzqt(objOLrzqt);
        return Unit.INSTANCE;
    }
}
