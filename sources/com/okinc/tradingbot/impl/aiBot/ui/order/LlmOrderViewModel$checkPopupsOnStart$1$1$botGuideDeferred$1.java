package com.okinc.tradingbot.impl.aiBot.ui.order;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.uCU;

/* JADX INFO: loaded from: classes19.dex */
public final class LlmOrderViewModel$checkPopupsOnStart$1$1$botGuideDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super uCU.Application>, Object> {
    int label;
    final /* synthetic */ LlmOrderViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LlmOrderViewModel$checkPopupsOnStart$1$1$botGuideDeferred$1(LlmOrderViewModel llmOrderViewModel, Continuation<? super LlmOrderViewModel$checkPopupsOnStart$1$1$botGuideDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = llmOrderViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LlmOrderViewModel$checkPopupsOnStart$1$1$botGuideDeferred$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super uCU.Application> continuation) {
        return ((LlmOrderViewModel$checkPopupsOnStart$1$1$botGuideDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            uCU ucu = this.this$0.isConnected;
            Unit unit = Unit.INSTANCE;
            this.label = 1;
            obj = ucu.KWHzl(unit, (Continuation) this);
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
