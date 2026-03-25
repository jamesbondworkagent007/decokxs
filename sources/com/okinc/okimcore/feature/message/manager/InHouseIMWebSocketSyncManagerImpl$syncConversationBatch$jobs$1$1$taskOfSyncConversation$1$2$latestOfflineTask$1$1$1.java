package com.okinc.okimcore.feature.message.manager;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C44302sKu;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$latestOfflineTask$1$1$1 extends SuspendLambda implements Function1<Continuation<? super C44302sKu.ActionBar>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ long $remoteMaxSeq;
    int label;
    final /* synthetic */ C44302sKu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$latestOfflineTask$1$1$1(C44302sKu c44302sKu, String str, long j, Continuation<? super InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$latestOfflineTask$1$1$1> continuation) {
        super(1, continuation);
        this.this$0 = c44302sKu;
        this.$channelId = str;
        this.$remoteMaxSeq = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$latestOfflineTask$1$1$1(this.this$0, this.$channelId, this.$remoteMaxSeq, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super C44302sKu.ActionBar> continuation) {
        return ((InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$latestOfflineTask$1$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C44302sKu c44302sKu = this.this$0;
            String str = this.$channelId;
            long j = this.$remoteMaxSeq;
            this.label = 1;
            obj = c44302sKu.AEQbTJ(str, j, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
