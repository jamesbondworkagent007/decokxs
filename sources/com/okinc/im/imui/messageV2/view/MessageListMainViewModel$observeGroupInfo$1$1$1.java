package com.okinc.im.imui.messageV2.view;

import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class MessageListMainViewModel$observeGroupInfo$1$1$1 extends SuspendLambda implements Function2<GroupInfo, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MessageListMainViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListMainViewModel$observeGroupInfo$1$1$1(MessageListMainViewModel messageListMainViewModel, Continuation<? super MessageListMainViewModel$observeGroupInfo$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = messageListMainViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MessageListMainViewModel$observeGroupInfo$1$1$1 messageListMainViewModel$observeGroupInfo$1$1$1 = new MessageListMainViewModel$observeGroupInfo$1$1$1(this.this$0, continuation);
        messageListMainViewModel$observeGroupInfo$1$1$1.L$0 = obj;
        return messageListMainViewModel$observeGroupInfo$1$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GroupInfo groupInfo, Continuation<? super Unit> continuation) {
        return ((MessageListMainViewModel$observeGroupInfo$1$1$1) create(groupInfo, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean zEZpvd = this.this$0.EZpvd((GroupInfo) this.L$0);
            if (this.this$0.wlaJM && !zEZpvd) {
                this.this$0.AYXKKw().tryEmit(Unit.INSTANCE);
            }
            this.this$0.wlaJM = zEZpvd;
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
