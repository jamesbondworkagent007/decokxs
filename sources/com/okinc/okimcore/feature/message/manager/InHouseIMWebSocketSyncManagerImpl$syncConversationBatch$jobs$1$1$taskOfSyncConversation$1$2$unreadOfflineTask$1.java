package com.okinc.okimcore.feature.message.manager;

import com.okinc.okimcore.model.room.inhouseim.InHouseIMServerConversationEntity;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44124sEe;
import o.C44157sFk;
import o.C44302sKu;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$unreadOfflineTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ InHouseIMServerConversationEntity $conversationEntity;
    final /* synthetic */ long $remoteMaxSeq;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44302sKu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$unreadOfflineTask$1(String str, InHouseIMServerConversationEntity inHouseIMServerConversationEntity, C44302sKu c44302sKu, long j, Continuation<? super InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$unreadOfflineTask$1> continuation) {
        super(2, continuation);
        this.$channelId = str;
        this.$conversationEntity = inHouseIMServerConversationEntity;
        this.this$0 = c44302sKu;
        this.$remoteMaxSeq = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$unreadOfflineTask$1 inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$unreadOfflineTask$1 = new InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$unreadOfflineTask$1(this.$channelId, this.$conversationEntity, this.this$0, this.$remoteMaxSeq, continuation);
        inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$unreadOfflineTask$1.L$0 = obj;
        return inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$unreadOfflineTask$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
        return ((InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$unreadOfflineTask$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String str2;
        InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$unreadOfflineTask$1$1$1$1 inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$unreadOfflineTask$1$1$1$1;
        String str3;
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("unreadOfflineTask", "lastReadMsgSeq of channelId(" + this.$channelId + ") is " + this.$conversationEntity.getLastReadMsgSeq());
            Long lastReadMsgSeq = this.$conversationEntity.getLastReadMsgSeq();
            if (lastReadMsgSeq == null) {
                return null;
            }
            C44302sKu c44302sKu = this.this$0;
            String str4 = this.$channelId;
            long j = this.$remoteMaxSeq;
            long jLongValue = lastReadMsgSeq.longValue();
            try {
                Result.Application application = Result.Companion;
                inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$unreadOfflineTask$1$1$1$1 = new InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$unreadOfflineTask$1$1$1$1(c44302sKu, str4, jLongValue, j, null);
                this.L$0 = str4;
                this.label = 1;
                str = str4;
            } catch (Throwable th) {
                th = th;
                str = str4;
            }
            try {
                if (C44157sFk.withRetry$default(3, 0L, inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$unreadOfflineTask$1$1$1$1, this, 2, null) == objCopydefault) {
                    return objCopydefault;
                }
                str3 = str;
            } catch (Throwable th2) {
                th = th2;
                str2 = str;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                str3 = str2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (String) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (Throwable th3) {
                th = th3;
                str2 = str3;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                str3 = str2;
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44124sEe.AEQbTJ("sync => failed to sync unreadOfflineTask", thM7380exceptionOrNullimpl, str3);
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
