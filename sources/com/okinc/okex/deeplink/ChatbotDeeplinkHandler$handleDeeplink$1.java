package com.okinc.okex.deeplink;

import android.content.Context;
import com.okinc.biz.bean.ChatBotRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C45193slF;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class ChatbotDeeplinkHandler$handleDeeplink$1 extends SuspendLambda implements Function2<Context, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChatBotRequest $request;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatbotDeeplinkHandler$handleDeeplink$1(ChatBotRequest chatBotRequest, Continuation<? super ChatbotDeeplinkHandler$handleDeeplink$1> continuation) {
        super(2, continuation);
        this.$request = chatBotRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatbotDeeplinkHandler$handleDeeplink$1 chatbotDeeplinkHandler$handleDeeplink$1 = new ChatbotDeeplinkHandler$handleDeeplink$1(this.$request, continuation);
        chatbotDeeplinkHandler$handleDeeplink$1.L$0 = obj;
        return chatbotDeeplinkHandler$handleDeeplink$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Context context, Continuation<? super Unit> continuation) {
        return ((ChatbotDeeplinkHandler$handleDeeplink$1) create(context, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Context context = (Context) this.L$0;
            C45193slF c45193slF = C45193slF.copydefault;
            ChatBotRequest chatBotRequest = this.$request;
            this.label = 1;
            if (c45193slF.EZpvd(context, chatBotRequest, this) == objCopydefault) {
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
