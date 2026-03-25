package com.okinc.okimcore.feature.message.manager;

import com.okinc.okimcore.feature.conversation.listener.RefreshEvent;
import com.okinc.okimcore.model.im.OKConversation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44124sEe;
import o.C44302sKu;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $id;
    final /* synthetic */ OKConversation $okConversation;
    int label;
    final /* synthetic */ C44302sKu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$2(C44302sKu c44302sKu, OKConversation oKConversation, String str, Continuation<? super InHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$2> continuation) {
        super(2, continuation);
        this.this$0 = c44302sKu;
        this.$okConversation = oKConversation;
        this.$id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$2(this.this$0, this.$okConversation, this.$id, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.AhwBna.KWHzl(RefreshEvent.EVENT_INBOUND, this.$okConversation);
            C44124sEe.imLogSync$default("insert incoming message => requested refresh conversation[" + this.$okConversation.getTargetId() + "]", null, this.$id, 2, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
