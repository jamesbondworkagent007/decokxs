package com.okinc.business.market.features.favorites.editing.ui.viewmodel;

import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupPo;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C26118jSp;
import o.C26169jUm;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketFavoritesListViewModel$requestAddCryptosToGroups$2 extends SuspendLambda implements Function1<Continuation<? super Pair<? extends List<? extends String>, ? extends List<? extends String>>>, Object> {
    final /* synthetic */ List<MarketFavoritesGroupPo.FavoritesPo> $cryptoList;
    final /* synthetic */ List<C26169jUm> $groupList;
    int label;
    final /* synthetic */ MarketFavoritesListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketFavoritesListViewModel$requestAddCryptosToGroups$2(MarketFavoritesListViewModel marketFavoritesListViewModel, List<MarketFavoritesGroupPo.FavoritesPo> list, List<C26169jUm> list2, Continuation<? super MarketFavoritesListViewModel$requestAddCryptosToGroups$2> continuation) {
        super(1, continuation);
        this.this$0 = marketFavoritesListViewModel;
        this.$cryptoList = list;
        this.$groupList = list2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MarketFavoritesListViewModel$requestAddCryptosToGroups$2(this.this$0, this.$cryptoList, this.$groupList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Pair<? extends List<? extends String>, ? extends List<? extends String>>> continuation) {
        return invoke2((Continuation<? super Pair<? extends List<String>, ? extends List<String>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super Pair<? extends List<String>, ? extends List<String>>> continuation) {
        return ((MarketFavoritesListViewModel$requestAddCryptosToGroups$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C26118jSp c26118jSp = this.this$0.EZpvd;
            Pair pairOLrzqt = C56390yDp.OLrzqt(this.$cryptoList, this.$groupList);
            this.label = 1;
            obj = c26118jSp.EZpvd(pairOLrzqt, (Continuation) this);
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
