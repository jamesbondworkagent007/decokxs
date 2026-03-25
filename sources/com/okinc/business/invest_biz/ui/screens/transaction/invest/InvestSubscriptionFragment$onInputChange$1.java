package com.okinc.business.invest_biz.ui.screens.transaction.invest;

import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C26640jgD;
import o.C56391yDq;
import o.C56442yFn;
import o.iXB;

/* JADX INFO: loaded from: classes15.dex */
public final class InvestSubscriptionFragment$onInputChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InvestTokenWithAmount $currentToken;
    final /* synthetic */ String $newInput;
    int label;
    final /* synthetic */ C26640jgD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestSubscriptionFragment$onInputChange$1(String str, InvestTokenWithAmount investTokenWithAmount, C26640jgD c26640jgD, Continuation<? super InvestSubscriptionFragment$onInputChange$1> continuation) {
        super(2, continuation);
        this.$newInput = str;
        this.$currentToken = investTokenWithAmount;
        this.this$0 = c26640jgD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestSubscriptionFragment$onInputChange$1(this.$newInput, this.$currentToken, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestSubscriptionFragment$onInputChange$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            iXB ixb = new iXB(this.$newInput, this.$currentToken, null, null, null, null, 0L, null, 0, false, false, false, 4092, null);
            MutableSharedFlow mutableSharedFlow = this.this$0.isConnected;
            this.label = 1;
            if (mutableSharedFlow.emit(ixb, this) == objCopydefault) {
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
