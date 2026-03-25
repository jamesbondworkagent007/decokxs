package com.okinc.okmarket.viewmodel;

import com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketHomeV2ViewModel$loadGroupData$1$3$2 extends SuspendLambda implements yHO<FlowCollector<? super MarketHomeV2ViewModel.TaskDescription>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ Unit $it;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarketHomeV2ViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeV2ViewModel$loadGroupData$1$3$2(Unit unit, MarketHomeV2ViewModel marketHomeV2ViewModel, Continuation<? super MarketHomeV2ViewModel$loadGroupData$1$3$2> continuation) {
        super(3, continuation);
        this.$it = unit;
        this.this$0 = marketHomeV2ViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super MarketHomeV2ViewModel.TaskDescription> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        MarketHomeV2ViewModel$loadGroupData$1$3$2 marketHomeV2ViewModel$loadGroupData$1$3$2 = new MarketHomeV2ViewModel$loadGroupData$1$3$2(this.$it, this.this$0, continuation);
        marketHomeV2ViewModel$loadGroupData$1$3$2.L$0 = th;
        return marketHomeV2ViewModel$loadGroupData$1$3$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Throwable th = (Throwable) this.L$0;
            if (th instanceof CancellationException) {
                pUU.KWHzl("MarketHomeV2ViewModel", "loadGroupData watchBizRep flow error has cached " + this.$it);
                return Unit.INSTANCE;
            }
            pUU.KWHzl("MarketHomeV2ViewModel", "loadGroupData watchBizRep flow error " + this.$it);
            MarketHomeV2ViewModel marketHomeV2ViewModel = this.this$0;
            AnonymousClass1 anonymousClass1 = new MutablePropertyReference1Impl() { // from class: com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel$loadGroupData$1$3$2.1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((MarketHomeV2ViewModel.ActionBar) obj2).KWHzl();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((MarketHomeV2ViewModel.ActionBar) obj2).KWHzl((InterfaceC49371unL) obj3);
                }
            };
            InterfaceC49371unL.Application application = new InterfaceC49371unL.Application(th, null, 2, null);
            this.label = 1;
            if (marketHomeV2ViewModel.KWHzl(anonymousClass1, application, this) == objCopydefault) {
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
