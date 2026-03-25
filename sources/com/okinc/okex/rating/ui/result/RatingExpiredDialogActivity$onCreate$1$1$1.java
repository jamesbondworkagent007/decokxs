package com.okinc.okex.rating.ui.result;

import com.okinc.biz.bean.ChatBotRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC45832syy;
import o.C45193slF;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class RatingExpiredDialogActivity$onCreate$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChatBotRequest $chatbotRequest;
    int label;
    final /* synthetic */ ActivityC45832syy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingExpiredDialogActivity$onCreate$1$1$1(ActivityC45832syy activityC45832syy, ChatBotRequest chatBotRequest, Continuation<? super RatingExpiredDialogActivity$onCreate$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC45832syy;
        this.$chatbotRequest = chatBotRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RatingExpiredDialogActivity$onCreate$1$1$1(this.this$0, this.$chatbotRequest, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RatingExpiredDialogActivity$onCreate$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C45193slF c45193slF = C45193slF.copydefault;
            ActivityC45832syy activityC45832syy = this.this$0;
            ChatBotRequest chatBotRequest = this.$chatbotRequest;
            this.label = 1;
            if (c45193slF.EZpvd(activityC45832syy, chatBotRequest, this) == objCopydefault) {
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
