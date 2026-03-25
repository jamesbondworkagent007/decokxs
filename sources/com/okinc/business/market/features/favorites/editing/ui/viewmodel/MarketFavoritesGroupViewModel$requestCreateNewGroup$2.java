package com.okinc.business.market.features.favorites.editing.ui.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C26121jSs;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketFavoritesGroupViewModel$requestCreateNewGroup$2 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
    final /* synthetic */ String $groupName;
    int label;
    final /* synthetic */ MarketFavoritesGroupViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketFavoritesGroupViewModel$requestCreateNewGroup$2(MarketFavoritesGroupViewModel marketFavoritesGroupViewModel, String str, Continuation<? super MarketFavoritesGroupViewModel$requestCreateNewGroup$2> continuation) {
        super(1, continuation);
        this.this$0 = marketFavoritesGroupViewModel;
        this.$groupName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MarketFavoritesGroupViewModel$requestCreateNewGroup$2(this.this$0, this.$groupName, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super String> continuation) {
        return ((MarketFavoritesGroupViewModel$requestCreateNewGroup$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C26121jSs c26121jSs = this.this$0.AEQbTJ;
            String str = this.$groupName;
            this.label = 1;
            obj = c26121jSs.EZpvd(str, (Continuation) this);
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
