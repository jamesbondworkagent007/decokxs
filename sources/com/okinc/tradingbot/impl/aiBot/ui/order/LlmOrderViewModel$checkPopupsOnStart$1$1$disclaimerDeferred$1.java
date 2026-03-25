package com.okinc.tradingbot.impl.aiBot.ui.order;

import com.okinc.tradingbot.impl.aiBot.dto.LlmDisclaimerInfoDto;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.uCP;

/* JADX INFO: loaded from: classes19.dex */
public final class LlmOrderViewModel$checkPopupsOnStart$1$1$disclaimerDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends LlmDisclaimerInfoDto>>, Object> {
    int label;
    final /* synthetic */ LlmOrderViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LlmOrderViewModel$checkPopupsOnStart$1$1$disclaimerDeferred$1(LlmOrderViewModel llmOrderViewModel, Continuation<? super LlmOrderViewModel$checkPopupsOnStart$1$1$disclaimerDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = llmOrderViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LlmOrderViewModel$checkPopupsOnStart$1$1$disclaimerDeferred$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends LlmDisclaimerInfoDto>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<LlmDisclaimerInfoDto>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<LlmDisclaimerInfoDto>> continuation) {
        return ((LlmOrderViewModel$checkPopupsOnStart$1$1$disclaimerDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            uCP ucp = this.this$0.AkhnZx;
            this.label = 1;
            obj = ucp.KWHzl("ai_bot_create", this);
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
