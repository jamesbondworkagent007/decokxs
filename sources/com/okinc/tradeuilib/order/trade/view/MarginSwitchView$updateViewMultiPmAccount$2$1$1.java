package com.okinc.tradeuilib.order.trade.view;

import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C49908uxS;
import o.C54589xNz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54581xNr;

/* JADX INFO: loaded from: classes19.dex */
public final class MarginSwitchView$updateViewMultiPmAccount$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BizInstrument $bizInstrument;
    int label;
    final /* synthetic */ C49908uxS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginSwitchView$updateViewMultiPmAccount$2$1$1(BizInstrument bizInstrument, C49908uxS c49908uxS, Continuation<? super MarginSwitchView$updateViewMultiPmAccount$2$1$1> continuation) {
        super(2, continuation);
        this.$bizInstrument = bizInstrument;
        this.this$0 = c49908uxS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarginSwitchView$updateViewMultiPmAccount$2$1$1(this.$bizInstrument, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarginSwitchView$updateViewMultiPmAccount$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null) {
                BizInstrument bizInstrument = this.$bizInstrument;
                this.label = 1;
                obj = interfaceC54581xNrOLrzqt.AEQbTJ(bizInstrument, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            C49908uxS c49908uxS = this.this$0;
            c49908uxS.copydefault(c49908uxS.AkhnZx, "SPOT");
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        C49908uxS c49908uxS2 = this.this$0;
        c49908uxS2.copydefault(c49908uxS2.AkhnZx, "SPOT");
        return Unit.INSTANCE;
    }
}
