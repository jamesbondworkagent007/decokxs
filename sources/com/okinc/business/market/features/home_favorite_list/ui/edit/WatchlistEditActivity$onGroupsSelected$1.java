package com.okinc.business.market.features.home_favorite_list.ui.edit;

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
import o.ActivityC28461kbH;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchlistEditActivity$onGroupsSelected$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Pair<List<Integer>, List<Integer>> $newSelectionsChanges;
    final /* synthetic */ List<HomeToken> $tokens;
    int label;
    final /* synthetic */ ActivityC28461kbH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.Pair<? extends java.util.List<java.lang.Integer>, ? extends java.util.List<java.lang.Integer>> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WatchlistEditActivity$onGroupsSelected$1(Pair<? extends List<Integer>, ? extends List<Integer>> pair, ActivityC28461kbH activityC28461kbH, List<HomeToken> list, Continuation<? super WatchlistEditActivity$onGroupsSelected$1> continuation) {
        super(2, continuation);
        this.$newSelectionsChanges = pair;
        this.this$0 = activityC28461kbH;
        this.$tokens = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchlistEditActivity$onGroupsSelected$1(this.$newSelectionsChanges, this.this$0, this.$tokens, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WatchlistEditActivity$onGroupsSelected$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            WatchlistEditViewModel watchlistEditViewModelDjBIcL = this.this$0.djBIcL();
            FavoriteAction favoriteAction = FavoriteAction.UpdateWatchList;
            List<HomeToken> list = this.$tokens;
            this.label = 1;
            objOLrzqt = watchlistEditViewModelDjBIcL.OLrzqt(favoriteAction, list, listComponent1, listComponent2, this);
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
        this.this$0.KWHzl(objOLrzqt);
        return Unit.INSTANCE;
    }
}
