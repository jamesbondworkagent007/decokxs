package com.okinc.business.market.home.favorites;

import com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27807kEa;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27808kEb;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketFavQuoteFragment$onVisible$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MarketFavQuoteFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketFavQuoteFragment$onVisible$2$1(MarketFavQuoteFragment marketFavQuoteFragment, Continuation<? super MarketFavQuoteFragment$onVisible$2$1> continuation) {
        super(2, continuation);
        this.this$0 = marketFavQuoteFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketFavQuoteFragment$onVisible$2$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketFavQuoteFragment$onVisible$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC27808kEb interfaceC27808kEbEZpvd;
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            interfaceC27808kEbEZpvd = C27807kEa.EZpvd(this.this$0);
            if (interfaceC27808kEbEZpvd != null) {
                MarketHomeV2ViewModel marketHomeV2ViewModelEjfBZ = this.this$0.ejfBZ();
                this.L$0 = interfaceC27808kEbEZpvd;
                this.L$1 = "favorite";
                this.label = 1;
                obj = marketHomeV2ViewModelEjfBZ.AEQbTJ(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                str = "favorite";
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (String) this.L$1;
        interfaceC27808kEbEZpvd = (InterfaceC27808kEb) this.L$0;
        C56391yDq.AEQbTJ(obj);
        interfaceC27808kEbEZpvd.copydefault(str, (String) obj);
        return Unit.INSTANCE;
    }
}
