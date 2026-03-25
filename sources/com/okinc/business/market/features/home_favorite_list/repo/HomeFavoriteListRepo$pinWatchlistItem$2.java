package com.okinc.business.market.features.home_favorite_list.repo;

import com.okinc.business.market.data.model.watchlist.PinTokenToTopRequest;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C28424kaX;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27595jyE;

/* JADX INFO: loaded from: classes7.dex */
public final class HomeFavoriteListRepo$pinWatchlistItem$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<Boolean>>, Object> {
    final /* synthetic */ PinTokenToTopRequest $request;
    int label;
    final /* synthetic */ C28424kaX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFavoriteListRepo$pinWatchlistItem$2(C28424kaX c28424kaX, PinTokenToTopRequest pinTokenToTopRequest, Continuation<? super HomeFavoriteListRepo$pinWatchlistItem$2> continuation) {
        super(1, continuation);
        this.this$0 = c28424kaX;
        this.$request = pinTokenToTopRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new HomeFavoriteListRepo$pinWatchlistItem$2(this.this$0, this.$request, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<Boolean>> continuation) {
        return ((HomeFavoriteListRepo$pinWatchlistItem$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC27595jyE interfaceC27595jyE = this.this$0.AEQbTJ;
            PinTokenToTopRequest pinTokenToTopRequest = this.$request;
            this.label = 1;
            obj = interfaceC27595jyE.KWHzl(pinTokenToTopRequest, this);
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
