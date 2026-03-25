package com.okinc.im.imui.messageV2.view;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ActivityC36573odX;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class ChatActivity$observeToolbarMemberCount$2 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC36573odX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatActivity$observeToolbarMemberCount$2(ActivityC36573odX activityC36573odX, Continuation<? super ChatActivity$observeToolbarMemberCount$2> continuation) {
        super(2, continuation);
        this.this$0 = activityC36573odX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatActivity$observeToolbarMemberCount$2 chatActivity$observeToolbarMemberCount$2 = new ChatActivity$observeToolbarMemberCount$2(this.this$0, continuation);
        chatActivity$observeToolbarMemberCount$2.L$0 = obj;
        return chatActivity$observeToolbarMemberCount$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, Continuation<? super Unit> continuation) {
        return ((ChatActivity$observeToolbarMemberCount$2) create(num, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Integer num = (Integer) this.L$0;
            pUU.KWHzl("ChatActivity", "toolBarMemberCount update: " + num);
            if (!this.this$0.OLrzqt().AubY().getValue().booleanValue()) {
                this.this$0.KWHzl(num);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
