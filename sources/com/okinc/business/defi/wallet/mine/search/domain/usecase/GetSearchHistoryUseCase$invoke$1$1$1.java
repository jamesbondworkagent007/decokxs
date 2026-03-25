package com.okinc.business.defi.wallet.mine.search.domain.usecase;

import com.okinc.business.defi.wallet.mine.search.data.model.DAppSearchHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C18911frO;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes5.dex */
public final class GetSearchHistoryUseCase$invoke$1$1$1 extends SuspendLambda implements yHO<List<? extends SearchHistoryItem>, List<? extends DAppSearchHistory>, Continuation<? super List<? extends SearchHistoryItem>>, Object> {
    final /* synthetic */ boolean $isDappEnabled;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ C18911frO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSearchHistoryUseCase$invoke$1$1$1(C18911frO c18911frO, boolean z, Continuation<? super GetSearchHistoryUseCase$invoke$1$1$1> continuation) {
        super(3, continuation);
        this.this$0 = c18911frO;
        this.$isDappEnabled = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(List<? extends SearchHistoryItem> list, List<? extends DAppSearchHistory> list2, Continuation<? super List<? extends SearchHistoryItem>> continuation) {
        return invoke2(list, (List<DAppSearchHistory>) list2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<? extends SearchHistoryItem> list, List<DAppSearchHistory> list2, Continuation<? super List<? extends SearchHistoryItem>> continuation) {
        GetSearchHistoryUseCase$invoke$1$1$1 getSearchHistoryUseCase$invoke$1$1$1 = new GetSearchHistoryUseCase$invoke$1$1$1(this.this$0, this.$isDappEnabled, continuation);
        getSearchHistoryUseCase$invoke$1$1$1.L$0 = list;
        getSearchHistoryUseCase$invoke$1$1$1.L$1 = list2;
        return getSearchHistoryUseCase$invoke$1$1$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return this.this$0.copydefault((List) this.L$0, (List) this.L$1, this.$isDappEnabled);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
