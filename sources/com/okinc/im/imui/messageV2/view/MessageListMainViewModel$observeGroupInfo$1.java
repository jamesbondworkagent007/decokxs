package com.okinc.im.imui.messageV2.view;

import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class MessageListMainViewModel$observeGroupInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    int label;
    final /* synthetic */ MessageListMainViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListMainViewModel$observeGroupInfo$1(String str, MessageListMainViewModel messageListMainViewModel, Continuation<? super MessageListMainViewModel$observeGroupInfo$1> continuation) {
        super(2, continuation);
        this.$channelId = str;
        this.this$0 = messageListMainViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageListMainViewModel$observeGroupInfo$1(this.$channelId, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageListMainViewModel$observeGroupInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = this.$channelId;
            if (str != null) {
                MessageListMainViewModel messageListMainViewModel = this.this$0;
                Flow<GroupInfo> flowAEQbTJ = messageListMainViewModel.ffGIBT.AEQbTJ(str);
                MessageListMainViewModel$observeGroupInfo$1$1$1 messageListMainViewModel$observeGroupInfo$1$1$1 = new MessageListMainViewModel$observeGroupInfo$1$1$1(messageListMainViewModel, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowAEQbTJ, messageListMainViewModel$observeGroupInfo$1$1$1, this) == objCopydefault) {
                    return objCopydefault;
                }
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
