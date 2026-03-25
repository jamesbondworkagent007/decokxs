package com.okinc.im.imui.messageV2.view;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C44460sQq;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes16.dex */
public final class MessageListMainViewModel$groupEventListener$1$onGroupDelete$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C44460sQq $event;
    int label;
    final /* synthetic */ MessageListMainViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListMainViewModel$groupEventListener$1$onGroupDelete$1(C44460sQq c44460sQq, MessageListMainViewModel messageListMainViewModel, Continuation<? super MessageListMainViewModel$groupEventListener$1$onGroupDelete$1> continuation) {
        super(2, continuation);
        this.$event = c44460sQq;
        this.this$0 = messageListMainViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageListMainViewModel$groupEventListener$1$onGroupDelete$1(this.$event, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageListMainViewModel$groupEventListener$1$onGroupDelete$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.EZpvd("MessageListMainViewModel", "onGroupDelete->ID:" + this.$event.AEQbTJ());
            OKConversation value = this.this$0.valueOf().getValue();
            if (value != null) {
                C44460sQq c44460sQq = this.$event;
                MessageListMainViewModel messageListMainViewModel = this.this$0;
                if (value.getConversationType() == OKConversationType.GROUP && Intrinsics.EZpvd((Object) value.getTargetId(), (Object) c44460sQq.AEQbTJ())) {
                    pUU.EZpvd("MessageListMainViewModel", "current group deleted:" + c44460sQq.AEQbTJ());
                    messageListMainViewModel.copydefault.setValue(new C32989mnw(Unit.INSTANCE));
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
