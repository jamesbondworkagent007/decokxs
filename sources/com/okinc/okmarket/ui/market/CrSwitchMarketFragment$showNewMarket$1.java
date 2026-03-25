package com.okinc.okmarket.ui.market;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C46738tco;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes24.dex */
public final class CrSwitchMarketFragment$showNewMarket$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C46738tco this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrSwitchMarketFragment$showNewMarket$1(C46738tco c46738tco, Continuation<? super CrSwitchMarketFragment$showNewMarket$1> continuation) {
        super(2, continuation);
        this.this$0 = c46738tco;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CrSwitchMarketFragment$showNewMarket$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CrSwitchMarketFragment$showNewMarket$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.EZpvd(this.this$0.getTAG(), "showNewMarket() called");
            if (this.this$0.isDetached() || this.this$0.isRemoving() || this.this$0.getContext() == null || this.this$0.AhwBna()) {
                return Unit.INSTANCE;
            }
            pUU.EZpvd(this.this$0.getTAG(), "showNewMarket() hasDisplayed " + this.this$0.AhwBna());
            C46738tco c46738tco = this.this$0;
            this.label = 1;
            if (c46738tco.EZpvd((Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.OLrzqt(true);
        return Unit.INSTANCE;
    }
}
