package com.okinc.business.market.home.favorites;

import com.okinc.business.market.home.favorites.viewmodel.MarketFavChildViewModel;
import com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketFavQuoteFragment$requestData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $clue;
    Object L$0;
    int label;
    final /* synthetic */ MarketFavQuoteFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketFavQuoteFragment$requestData$1(MarketFavQuoteFragment marketFavQuoteFragment, String str, Continuation<? super MarketFavQuoteFragment$requestData$1> continuation) {
        super(2, continuation);
        this.this$0 = marketFavQuoteFragment;
        this.$clue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketFavQuoteFragment$requestData$1(this.this$0, this.$clue, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketFavQuoteFragment$requestData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MarketFavChildViewModel marketFavChildViewModelFIwbmz;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            marketFavChildViewModelFIwbmz = this.this$0.fIwbmz();
            MarketHomeV2ViewModel marketHomeV2ViewModelEjfBZ = this.this$0.ejfBZ();
            this.L$0 = marketFavChildViewModelFIwbmz;
            this.label = 1;
            obj = marketHomeV2ViewModelEjfBZ.AEQbTJ(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            marketFavChildViewModelFIwbmz = (MarketFavChildViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        String str = this.$clue;
        this.L$0 = null;
        this.label = 2;
        if (marketFavChildViewModelFIwbmz.AEQbTJ((String) obj, str, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
