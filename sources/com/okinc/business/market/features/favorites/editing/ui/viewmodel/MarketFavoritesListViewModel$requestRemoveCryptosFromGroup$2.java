package com.okinc.business.market.features.favorites.editing.ui.viewmodel;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C26120jSr;
import o.C26175jUs;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketFavoritesListViewModel$requestRemoveCryptosFromGroup$2 extends SuspendLambda implements Function1<Continuation<? super Pair<? extends String, ? extends List<? extends C26175jUs>>>, Object> {
    final /* synthetic */ List<C26175jUs> $cryptoList;
    final /* synthetic */ String $groupName;
    int label;
    final /* synthetic */ MarketFavoritesListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketFavoritesListViewModel$requestRemoveCryptosFromGroup$2(MarketFavoritesListViewModel marketFavoritesListViewModel, String str, List<C26175jUs> list, Continuation<? super MarketFavoritesListViewModel$requestRemoveCryptosFromGroup$2> continuation) {
        super(1, continuation);
        this.this$0 = marketFavoritesListViewModel;
        this.$groupName = str;
        this.$cryptoList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MarketFavoritesListViewModel$requestRemoveCryptosFromGroup$2(this.this$0, this.$groupName, this.$cryptoList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Pair<? extends String, ? extends List<? extends C26175jUs>>> continuation) {
        return invoke2((Continuation<? super Pair<String, ? extends List<C26175jUs>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super Pair<String, ? extends List<C26175jUs>>> continuation) {
        return ((MarketFavoritesListViewModel$requestRemoveCryptosFromGroup$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C26120jSr c26120jSr = this.this$0.AEQbTJ;
            Pair pairOLrzqt = C56390yDp.OLrzqt(this.$groupName, this.$cryptoList);
            this.label = 1;
            obj = c26120jSr.EZpvd(pairOLrzqt, (Continuation) this);
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
