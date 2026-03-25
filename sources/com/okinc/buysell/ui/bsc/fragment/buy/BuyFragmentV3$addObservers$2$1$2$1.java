package com.okinc.buysell.ui.bsc.fragment.buy;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.lEN;

/* JADX INFO: loaded from: classes15.dex */
public final class BuyFragmentV3$addObservers$2$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BuyViewModel $this_apply;
    int label;
    final /* synthetic */ lEN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyFragmentV3$addObservers$2$1$2$1(BuyViewModel buyViewModel, lEN len, Continuation<? super BuyFragmentV3$addObservers$2$1$2$1> continuation) {
        super(2, continuation);
        this.$this_apply = buyViewModel;
        this.this$0 = len;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyFragmentV3$addObservers$2$1$2$1(this.$this_apply, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BuyFragmentV3$addObservers$2$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow<Boolean> mutableStateFlowHDKMBd = this.$this_apply.hDKMBd();
            Boolean boolKWHzl = C56443yFo.KWHzl(false);
            this.label = 1;
            if (mutableStateFlowHDKMBd.emit(boolKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (this.this$0.sSMYrx().RlQdEF()) {
            this.this$0.finit();
        } else {
            this.this$0.sSMYrx().fetchVPNInfo(true);
        }
        return Unit.INSTANCE;
    }
}
