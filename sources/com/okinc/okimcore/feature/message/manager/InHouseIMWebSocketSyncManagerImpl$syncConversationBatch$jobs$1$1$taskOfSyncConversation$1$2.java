package com.okinc.okimcore.feature.message.manager;

import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationSimpleInfoEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMServerConversationEntity;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C44302sKu;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Result<? extends Object>>>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ InHouseIMServerConversationEntity $conversationEntity;
    final /* synthetic */ List<InHouseIMConversationSimpleInfoEntity> $conversationIdBatch;
    final /* synthetic */ long $remoteMaxSeq;
    final /* synthetic */ long $timeCostRetrieveRemoteSeq;
    final /* synthetic */ long $timeCostWaitWebSocketConnected;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44302sKu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2(C44302sKu c44302sKu, String str, long j, long j2, long j3, List<InHouseIMConversationSimpleInfoEntity> list, InHouseIMServerConversationEntity inHouseIMServerConversationEntity, Continuation<? super InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2> continuation) {
        super(2, continuation);
        this.this$0 = c44302sKu;
        this.$channelId = str;
        this.$remoteMaxSeq = j;
        this.$timeCostWaitWebSocketConnected = j2;
        this.$timeCostRetrieveRemoteSeq = j3;
        this.$conversationIdBatch = list;
        this.$conversationEntity = inHouseIMServerConversationEntity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2 inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2 = new InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2(this.this$0, this.$channelId, this.$remoteMaxSeq, this.$timeCostWaitWebSocketConnected, this.$timeCostRetrieveRemoteSeq, this.$conversationIdBatch, this.$conversationEntity, continuation);
        inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2.L$0 = obj;
        return inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Result<? extends Object>>> continuation) {
        return ((InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return obj;
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        Deferred[] deferredArr = {BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$latestOfflineTask$1(this.this$0, this.$channelId, this.$remoteMaxSeq, this.$timeCostWaitWebSocketConnected, this.$timeCostRetrieveRemoteSeq, this.$conversationIdBatch, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$unreadOfflineTask$1(this.$channelId, this.$conversationEntity, this.this$0, this.$remoteMaxSeq, null), 3, null)};
        this.label = 1;
        Object objAwaitAll = AwaitKt.awaitAll(deferredArr, this);
        return objAwaitAll == objCopydefault ? objCopydefault : objAwaitAll;
    }
}
