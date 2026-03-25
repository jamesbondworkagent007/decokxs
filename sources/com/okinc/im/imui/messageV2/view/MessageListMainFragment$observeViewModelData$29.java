package com.okinc.im.imui.messageV2.view;

import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C36609oeG;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class MessageListMainFragment$observeViewModelData$29 extends SuspendLambda implements yHO<CoroutineScope, GroupInfo, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C36609oeG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListMainFragment$observeViewModelData$29(C36609oeG c36609oeG, Continuation<? super MessageListMainFragment$observeViewModelData$29> continuation) {
        super(3, continuation);
        this.this$0 = c36609oeG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, GroupInfo groupInfo, Continuation<? super Unit> continuation) {
        MessageListMainFragment$observeViewModelData$29 messageListMainFragment$observeViewModelData$29 = new MessageListMainFragment$observeViewModelData$29(this.this$0, continuation);
        messageListMainFragment$observeViewModelData$29.L$0 = groupInfo;
        return messageListMainFragment$observeViewModelData$29.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            GroupInfo groupInfo = (GroupInfo) this.L$0;
            this.this$0.DbNXlk().copydefault(groupInfo.getGroupId(), groupInfo.getType());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
