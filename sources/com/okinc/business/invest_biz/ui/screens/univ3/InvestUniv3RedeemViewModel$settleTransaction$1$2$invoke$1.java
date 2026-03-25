package com.okinc.business.invest_biz.ui.screens.univ3;

import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.iXD;

/* JADX INFO: loaded from: classes18.dex */
public final class InvestUniv3RedeemViewModel$settleTransaction$1$2$invoke$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ InvestUniv3RedeemViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3RedeemViewModel$settleTransaction$1$2$invoke$1(InvestUniv3RedeemViewModel investUniv3RedeemViewModel, Continuation<? super InvestUniv3RedeemViewModel$settleTransaction$1$2$invoke$1> continuation) {
        super(2, continuation);
        this.this$0 = investUniv3RedeemViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3RedeemViewModel$settleTransaction$1$2$invoke$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUniv3RedeemViewModel$settleTransaction$1$2$invoke$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow = this.this$0.KWHzl;
            iXD.TaskDescription taskDescription = new iXD.TaskDescription(new OKServerException(0, "Transaction Cancelled", null, null, 13, null), null, 2, null);
            this.label = 1;
            if (mutableSharedFlow.emit(taskDescription, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.fJNWhG().setValue(C56443yFo.KWHzl(true));
        return Unit.INSTANCE;
    }
}
