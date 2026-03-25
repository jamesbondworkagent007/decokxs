package com.okinc.find_ui.ranking.percentchange;

import com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C27807kEa;
import o.C35022nnV;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27808kEb;

/* JADX INFO: loaded from: classes15.dex */
public final class MarketHomeUpRankingFragmentV2$onVisible$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C35022nnV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeUpRankingFragmentV2$onVisible$1$1(C35022nnV c35022nnV, Continuation<? super MarketHomeUpRankingFragmentV2$onVisible$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c35022nnV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketHomeUpRankingFragmentV2$onVisible$1$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketHomeUpRankingFragmentV2$onVisible$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MarketHomeV2ViewModel marketHomeV2ViewModelSSMYrx = this.this$0.sSMYrx();
            this.label = 1;
            obj = marketHomeV2ViewModelSSMYrx.KWHzl(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (Intrinsics.EZpvd(obj, (Object) "SPOT")) {
            InterfaceC27808kEb interfaceC27808kEbEZpvd = C27807kEa.EZpvd(this.this$0);
            if (interfaceC27808kEbEZpvd != null) {
                interfaceC27808kEbEZpvd.copydefault("gainers", "spot");
            }
        } else {
            InterfaceC27808kEb interfaceC27808kEbEZpvd2 = C27807kEa.EZpvd(this.this$0);
            if (interfaceC27808kEbEZpvd2 != null) {
                interfaceC27808kEbEZpvd2.copydefault("gainers", "futures");
            }
        }
        return Unit.INSTANCE;
    }
}
