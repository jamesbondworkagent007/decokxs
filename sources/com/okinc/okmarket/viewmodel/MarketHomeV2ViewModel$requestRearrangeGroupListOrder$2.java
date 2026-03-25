package com.okinc.okmarket.viewmodel;

import com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketHomeV2ViewModel$requestRearrangeGroupListOrder$2 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MarketHomeV2ViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeV2ViewModel$requestRearrangeGroupListOrder$2(MarketHomeV2ViewModel marketHomeV2ViewModel, Continuation<? super MarketHomeV2ViewModel$requestRearrangeGroupListOrder$2> continuation) {
        super(2, continuation);
        this.this$0 = marketHomeV2ViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketHomeV2ViewModel$requestRearrangeGroupListOrder$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((MarketHomeV2ViewModel$requestRearrangeGroupListOrder$2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("MarketHomeV2ViewModel", "loadGroupData from requestRearrangeGroupListOrder");
            MarketHomeV2ViewModel.loadGroupData$default(this.this$0, false, 1, null);
            MarketHomeV2ViewModel marketHomeV2ViewModel = this.this$0;
            AnonymousClass1 anonymousClass1 = new MutablePropertyReference1Impl() { // from class: com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel$requestRearrangeGroupListOrder$2.1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((MarketHomeV2ViewModel.ActionBar) obj2).EZpvd();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((MarketHomeV2ViewModel.ActionBar) obj2).AEQbTJ((InterfaceC49371unL<Unit>) obj3);
                }
            };
            InterfaceC49371unL.StateListAnimator stateListAnimator = new InterfaceC49371unL.StateListAnimator(null, 1, null);
            this.label = 1;
            if (marketHomeV2ViewModel.KWHzl(anonymousClass1, stateListAnimator, this) == objCopydefault) {
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
