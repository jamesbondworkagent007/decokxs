package com.okinc.business.trade.features.home.ui.cefi.placeorder.strategy;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C21668hHx;
import o.C30798lhu;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC30792lho;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedStrategyManager$initUI$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C21668hHx $binding;
    int label;
    final /* synthetic */ C30798lhu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedStrategyManager$initUI$1(C30798lhu c30798lhu, C21668hHx c21668hHx, Continuation<? super AdvancedStrategyManager$initUI$1> continuation) {
        super(2, continuation);
        this.this$0 = c30798lhu;
        this.$binding = c21668hHx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedStrategyManager$initUI$1(this.this$0, this.$binding, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedStrategyManager$initUI$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC30792lho interfaceC30792lho = (InterfaceC30792lho) this.this$0.EZpvd.getValue();
            C21668hHx c21668hHx = this.$binding;
            this.label = 1;
            if (interfaceC30792lho.EZpvd(c21668hHx, this) == objCopydefault) {
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
