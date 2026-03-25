package com.okinc.business.market.features.favorites.editing.ui.viewmodel;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C26127jSy;
import o.C26170jUn;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketFavoritesGroupViewModel$requestRearrangeGroupListOrder$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ List<C26170jUn> $groupList;
    int label;
    final /* synthetic */ MarketFavoritesGroupViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketFavoritesGroupViewModel$requestRearrangeGroupListOrder$2(MarketFavoritesGroupViewModel marketFavoritesGroupViewModel, List<C26170jUn> list, Continuation<? super MarketFavoritesGroupViewModel$requestRearrangeGroupListOrder$2> continuation) {
        super(1, continuation);
        this.this$0 = marketFavoritesGroupViewModel;
        this.$groupList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MarketFavoritesGroupViewModel$requestRearrangeGroupListOrder$2(this.this$0, this.$groupList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((MarketFavoritesGroupViewModel$requestRearrangeGroupListOrder$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C26127jSy c26127jSy = this.this$0.KWHzl;
            List<C26170jUn> list = this.$groupList;
            this.label = 1;
            if (c26127jSy.EZpvd(list, (Continuation) this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
