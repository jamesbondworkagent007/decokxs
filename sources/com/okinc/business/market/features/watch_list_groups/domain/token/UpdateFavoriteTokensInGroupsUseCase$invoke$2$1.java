package com.okinc.business.market.features.watch_list_groups.domain.token;

import com.okinc.business.market.data.model.watchlist.FavoriteAction;
import com.okinc.business.market.features.group.domain.CommonGroupData;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C27770kCs;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28415kaO;

/* JADX INFO: loaded from: classes7.dex */
public final class UpdateFavoriteTokensInGroupsUseCase$invoke$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InterfaceC28415kaO>, Object> {
    final /* synthetic */ FavoriteAction $action;
    final /* synthetic */ List<Integer> $addedGroupIds;
    final /* synthetic */ List<Integer> $removedGroupIds;
    final /* synthetic */ List<HomeToken> $tokens;
    final /* synthetic */ List<CommonGroupData> $watchlistGroups;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C27770kCs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateFavoriteTokensInGroupsUseCase$invoke$2$1(List<HomeToken> list, List<Integer> list2, FavoriteAction favoriteAction, C27770kCs c27770kCs, List<CommonGroupData> list3, List<Integer> list4, Continuation<? super UpdateFavoriteTokensInGroupsUseCase$invoke$2$1> continuation) {
        super(2, continuation);
        this.$tokens = list;
        this.$addedGroupIds = list2;
        this.$action = favoriteAction;
        this.this$0 = c27770kCs;
        this.$watchlistGroups = list3;
        this.$removedGroupIds = list4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UpdateFavoriteTokensInGroupsUseCase$invoke$2$1 updateFavoriteTokensInGroupsUseCase$invoke$2$1 = new UpdateFavoriteTokensInGroupsUseCase$invoke$2$1(this.$tokens, this.$addedGroupIds, this.$action, this.this$0, this.$watchlistGroups, this.$removedGroupIds, continuation);
        updateFavoriteTokensInGroupsUseCase$invoke$2$1.L$0 = obj;
        return updateFavoriteTokensInGroupsUseCase$invoke$2$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InterfaceC28415kaO> continuation) {
        return ((UpdateFavoriteTokensInGroupsUseCase$invoke$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Deferred deferredAsync$default;
        Object objAwait;
        Object objAwait2;
        InterfaceC28415kaO interfaceC28415kaO;
        boolean z;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new UpdateFavoriteTokensInGroupsUseCase$invoke$2$1$addToFavoriteDeferred$1(this.$addedGroupIds, this.$action, this.this$0, this.$tokens, this.$watchlistGroups, null), 3, null);
            deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new UpdateFavoriteTokensInGroupsUseCase$invoke$2$1$removeFavoriteDeferred$1(this.$removedGroupIds, this.$action, this.this$0, this.$tokens, this.$watchlistGroups, null), 3, null);
            this.L$0 = deferredAsync$default;
            this.label = 1;
            objAwait = deferredAsync$default2.await(this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC28415kaO = (InterfaceC28415kaO) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAwait2 = obj;
                InterfaceC28415kaO interfaceC28415kaO2 = (InterfaceC28415kaO) objAwait2;
                z = interfaceC28415kaO instanceof InterfaceC28415kaO.ActionBar;
                if (!z && (interfaceC28415kaO2 instanceof InterfaceC28415kaO.LoaderManager) && ((InterfaceC28415kaO.ActionBar) interfaceC28415kaO).copydefault().size() > 1) {
                    return new InterfaceC28415kaO.Fragment(this.$tokens);
                }
                if (z && !(interfaceC28415kaO instanceof InterfaceC28415kaO.Application)) {
                    return interfaceC28415kaO2 instanceof InterfaceC28415kaO.LoaderManager ? interfaceC28415kaO2 : InterfaceC28415kaO.TaskDescription.AEQbTJ;
                }
            }
            deferredAsync$default = (Deferred) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objAwait = obj;
        }
        InterfaceC28415kaO interfaceC28415kaO3 = (InterfaceC28415kaO) objAwait;
        this.L$0 = interfaceC28415kaO3;
        this.label = 2;
        objAwait2 = deferredAsync$default.await(this);
        if (objAwait2 == objCopydefault) {
            return objCopydefault;
        }
        interfaceC28415kaO = interfaceC28415kaO3;
        InterfaceC28415kaO interfaceC28415kaO22 = (InterfaceC28415kaO) objAwait2;
        z = interfaceC28415kaO instanceof InterfaceC28415kaO.ActionBar;
        if (!z) {
        }
        return z ? interfaceC28415kaO : interfaceC28415kaO;
    }
}
