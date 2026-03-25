package com.okinc.im.imui.messageV2.view.messagelist;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C35233nrU;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class MessageListFragment$observeGroupCallParticipation$1 extends SuspendLambda implements yHO<CoroutineScope, C35233nrU, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MessageListFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListFragment$observeGroupCallParticipation$1(MessageListFragment messageListFragment, Continuation<? super MessageListFragment$observeGroupCallParticipation$1> continuation) {
        super(3, continuation);
        this.this$0 = messageListFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, C35233nrU c35233nrU, Continuation<? super Unit> continuation) {
        MessageListFragment$observeGroupCallParticipation$1 messageListFragment$observeGroupCallParticipation$1 = new MessageListFragment$observeGroupCallParticipation$1(this.this$0, continuation);
        messageListFragment$observeGroupCallParticipation$1.L$0 = c35233nrU;
        return messageListFragment$observeGroupCallParticipation$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C35233nrU c35233nrU = (C35233nrU) this.L$0;
            Long lKWHzl = c35233nrU != null ? C56443yFo.KWHzl(c35233nrU.AEQbTJ()) : null;
            if (!Intrinsics.EZpvd(this.this$0.fetchVPNInfo, lKWHzl)) {
                this.this$0.fetchVPNInfo = lKWHzl;
                this.this$0.DbNXlk();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
