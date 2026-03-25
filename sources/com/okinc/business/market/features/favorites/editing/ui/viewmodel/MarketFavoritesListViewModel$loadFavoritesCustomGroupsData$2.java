package com.okinc.business.market.features.favorites.editing.ui.viewmodel;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C26122jSt;
import o.C26169jUm;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketFavoritesListViewModel$loadFavoritesCustomGroupsData$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends C26169jUm>>, Object> {
    final /* synthetic */ String $currentGroupName;
    int label;
    final /* synthetic */ MarketFavoritesListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketFavoritesListViewModel$loadFavoritesCustomGroupsData$2(MarketFavoritesListViewModel marketFavoritesListViewModel, String str, Continuation<? super MarketFavoritesListViewModel$loadFavoritesCustomGroupsData$2> continuation) {
        super(1, continuation);
        this.this$0 = marketFavoritesListViewModel;
        this.$currentGroupName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MarketFavoritesListViewModel$loadFavoritesCustomGroupsData$2(this.this$0, this.$currentGroupName, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends C26169jUm>> continuation) {
        return invoke2((Continuation<? super List<C26169jUm>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super List<C26169jUm>> continuation) {
        return ((MarketFavoritesListViewModel$loadFavoritesCustomGroupsData$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C26122jSt c26122jSt = this.this$0.copydefault;
            String str = this.$currentGroupName;
            this.label = 1;
            obj = c26122jSt.EZpvd(str, (Continuation) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
