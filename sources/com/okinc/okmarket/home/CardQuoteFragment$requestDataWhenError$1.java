package com.okinc.okmarket.home;

import com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;

/* JADX INFO: loaded from: classes10.dex */
public final class CardQuoteFragment$requestDataWhenError$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CardQuoteFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardQuoteFragment$requestDataWhenError$1(CardQuoteFragment cardQuoteFragment, Continuation<? super CardQuoteFragment$requestDataWhenError$1> continuation) {
        super(2, continuation);
        this.this$0 = cardQuoteFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CardQuoteFragment$requestDataWhenError$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CardQuoteFragment$requestDataWhenError$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CardQuoteFragment cardQuoteFragment = this.this$0;
            MarketHomeV2ViewModel marketHomeV2ViewModelAkhnZx = cardQuoteFragment.AkhnZx();
            this.label = 1;
            obj = cardQuoteFragment.OLrzqt(marketHomeV2ViewModelAkhnZx, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((MarketHomeV2ViewModel.ActionBar) obj).KWHzl() instanceof InterfaceC49371unL.Application) {
            CardQuoteFragment.requestGroupData$default(this.this$0, false, 1, null);
        }
        return Unit.INSTANCE;
    }
}
