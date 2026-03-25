package com.okinc.business.invest_biz.ui.screens.univ3.zap;

import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestUniv3ZapViewModel$getZapInitialData$result$1$multiDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InvestUniv3SubscribeInfo>, Object> {
    int label;
    final /* synthetic */ InvestUniv3ZapViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3ZapViewModel$getZapInitialData$result$1$multiDeferred$1(InvestUniv3ZapViewModel investUniv3ZapViewModel, Continuation<? super InvestUniv3ZapViewModel$getZapInitialData$result$1$multiDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = investUniv3ZapViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3ZapViewModel$getZapInitialData$result$1$multiDeferred$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InvestUniv3SubscribeInfo> continuation) {
        return ((InvestUniv3ZapViewModel$getZapInitialData$result$1$multiDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InvestUniv3ZapViewModel investUniv3ZapViewModel = this.this$0;
            this.label = 1;
            obj = investUniv3ZapViewModel.KWHzl(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
