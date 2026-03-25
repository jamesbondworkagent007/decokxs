package com.okinc.find_ui.ranking.dex.viewmodel;

import com.okinc.find_ui.ranking.dex.viewmodel.MarketHomeDexViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.flow.FlowCollector;
import o.C34964nmQ;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC41655qus;
import o.InterfaceC49371unL;
import o.pUU;
import o.yHO;
import uniffi.ok_future_utils.OkffiException;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketHomeDexViewModel$subscribeData$2$3$2 extends SuspendLambda implements yHO<FlowCollector<? super List<? extends InterfaceC41655qus>>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarketHomeDexViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeDexViewModel$subscribeData$2$3$2(MarketHomeDexViewModel marketHomeDexViewModel, Continuation<? super MarketHomeDexViewModel$subscribeData$2$3$2> continuation) {
        super(3, continuation);
        this.this$0 = marketHomeDexViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super List<? extends InterfaceC41655qus>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        MarketHomeDexViewModel$subscribeData$2$3$2 marketHomeDexViewModel$subscribeData$2$3$2 = new MarketHomeDexViewModel$subscribeData$2$3$2(this.this$0, continuation);
        marketHomeDexViewModel$subscribeData$2$3$2.L$0 = th;
        return marketHomeDexViewModel$subscribeData$2$3$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Throwable th = (Throwable) this.L$0;
            if (th instanceof OkffiException) {
                pUU.AEQbTJ("MarketHomeDexViewModel", "subscribe dex vos failed by mobile40", th);
                MarketHomeDexViewModel marketHomeDexViewModel = this.this$0;
                AnonymousClass1 anonymousClass1 = new MutablePropertyReference1Impl() { // from class: com.okinc.find_ui.ranking.dex.viewmodel.MarketHomeDexViewModel$subscribeData$2$3$2.1
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj2) {
                        return ((MarketHomeDexViewModel.StateListAnimator) obj2).OLrzqt();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj2, Object obj3) {
                        ((MarketHomeDexViewModel.StateListAnimator) obj2).AEQbTJ((InterfaceC49371unL<? extends List<C34964nmQ>>) obj3);
                    }
                };
                InterfaceC49371unL.Application application = new InterfaceC49371unL.Application(th, null, 2, null);
                this.label = 1;
                if (marketHomeDexViewModel.KWHzl(anonymousClass1, application, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                pUU.AEQbTJ("MarketHomeDexViewModel", "subscribe dex vos completed.", th);
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
