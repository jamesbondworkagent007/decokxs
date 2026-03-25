package com.okinc.okex.center.ui;

import com.okinc.biz.bean.ChatBotRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C45193slF;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportIntegratedSolutionSimpleActivity$onChatbotClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChatBotRequest $request;
    int label;
    final /* synthetic */ SupportIntegratedSolutionSimpleActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportIntegratedSolutionSimpleActivity$onChatbotClicked$1(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity, ChatBotRequest chatBotRequest, Continuation<? super SupportIntegratedSolutionSimpleActivity$onChatbotClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = supportIntegratedSolutionSimpleActivity;
        this.$request = chatBotRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportIntegratedSolutionSimpleActivity$onChatbotClicked$1(this.this$0, this.$request, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportIntegratedSolutionSimpleActivity$onChatbotClicked$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C45193slF c45193slF = C45193slF.copydefault;
            SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity = this.this$0;
            ChatBotRequest chatBotRequest = this.$request;
            this.label = 1;
            if (c45193slF.EZpvd(supportIntegratedSolutionSimpleActivity, chatBotRequest, this) == objCopydefault) {
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
