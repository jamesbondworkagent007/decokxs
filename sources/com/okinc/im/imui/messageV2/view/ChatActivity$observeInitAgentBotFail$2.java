package com.okinc.im.imui.messageV2.view;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ActivityC36573odX;
import o.C37716ozA;
import o.C56391yDq;
import o.C56442yFn;
import o.ViewOnClickListenerC54939xaY;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class ChatActivity$observeInitAgentBotFail$2 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC36573odX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatActivity$observeInitAgentBotFail$2(ActivityC36573odX activityC36573odX, Continuation<? super ChatActivity$observeInitAgentBotFail$2> continuation) {
        super(2, continuation);
        this.this$0 = activityC36573odX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatActivity$observeInitAgentBotFail$2 chatActivity$observeInitAgentBotFail$2 = new ChatActivity$observeInitAgentBotFail$2(this.this$0, continuation);
        chatActivity$observeInitAgentBotFail$2.L$0 = obj;
        return chatActivity$observeInitAgentBotFail$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((ChatActivity$observeInitAgentBotFail$2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("ChatActivity", "initAgentBotFail update: " + ((Unit) this.L$0));
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.this$0.OLrzqt;
            if (viewOnClickListenerC54939xaY != null) {
                viewOnClickListenerC54939xaY.dismiss();
            }
            ActivityC36573odX activityC36573odX = this.this$0;
            activityC36573odX.OLrzqt = C37716ozA.EZpvd(activityC36573odX);
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = this.this$0.OLrzqt;
            if (viewOnClickListenerC54939xaY2 != null) {
                viewOnClickListenerC54939xaY2.show();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
