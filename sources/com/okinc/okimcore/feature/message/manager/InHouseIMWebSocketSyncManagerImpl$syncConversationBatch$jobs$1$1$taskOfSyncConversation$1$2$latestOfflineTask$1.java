package com.okinc.okimcore.feature.message.manager;

import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationSimpleInfoEntity;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C44124sEe;
import o.C44157sFk;
import o.C44302sKu;
import o.C44482sRl;
import o.C56379yDe;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.sRX;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$latestOfflineTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends C44302sKu.ActionBar>>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ List<InHouseIMConversationSimpleInfoEntity> $conversationIdBatch;
    final /* synthetic */ long $remoteMaxSeq;
    final /* synthetic */ long $timeCostRetrieveRemoteSeq;
    final /* synthetic */ long $timeCostWaitWebSocketConnected;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44302sKu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$latestOfflineTask$1(C44302sKu c44302sKu, String str, long j, long j2, long j3, List<InHouseIMConversationSimpleInfoEntity> list, Continuation<? super InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$latestOfflineTask$1> continuation) {
        super(2, continuation);
        this.this$0 = c44302sKu;
        this.$channelId = str;
        this.$remoteMaxSeq = j;
        this.$timeCostWaitWebSocketConnected = j2;
        this.$timeCostRetrieveRemoteSeq = j3;
        this.$conversationIdBatch = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$latestOfflineTask$1 inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$latestOfflineTask$1 = new InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$latestOfflineTask$1(this.this$0, this.$channelId, this.$remoteMaxSeq, this.$timeCostWaitWebSocketConnected, this.$timeCostRetrieveRemoteSeq, this.$conversationIdBatch, continuation);
        inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$latestOfflineTask$1.L$0 = obj;
        return inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$latestOfflineTask$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends C44302sKu.ActionBar>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<C44302sKu.ActionBar>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<C44302sKu.ActionBar>> continuation) {
        return ((InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$latestOfflineTask$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object next;
        Object objWithRetry$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C44302sKu c44302sKu = this.this$0;
            String str = this.$channelId;
            long j = this.$remoteMaxSeq;
            Result.Application application2 = Result.Companion;
            InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$latestOfflineTask$1$1$1 inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$latestOfflineTask$1$1$1 = new InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$latestOfflineTask$1$1$1(c44302sKu, str, j, null);
            this.label = 1;
            objWithRetry$default = C44157sFk.withRetry$default(3, 0L, inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1$taskOfSyncConversation$1$2$latestOfflineTask$1$1$1, this, 2, null);
            if (objWithRetry$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objM7377constructorimpl = this.L$0;
                C56391yDq.AEQbTJ(obj);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
            objWithRetry$default = obj;
        }
        objM7377constructorimpl = Result.m7377constructorimpl((C44302sKu.ActionBar) objWithRetry$default);
        String str2 = this.$channelId;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44124sEe.AEQbTJ("sync => failed to sync", thM7380exceptionOrNullimpl, str2);
            sRX.OLrzqt.KWHzl(str2, C56379yDe.AEQbTJ(thM7380exceptionOrNullimpl));
        }
        String str3 = this.$channelId;
        long j2 = this.$timeCostWaitWebSocketConnected;
        long j3 = this.$timeCostRetrieveRemoteSeq;
        List<InHouseIMConversationSimpleInfoEntity> list = this.$conversationIdBatch;
        C44302sKu c44302sKu2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            C44302sKu.ActionBar actionBar = (C44302sKu.ActionBar) objM7377constructorimpl;
            sRX.OLrzqt.copydefault(str3, j2, j3, actionBar.OLrzqt(), actionBar.KWHzl(), actionBar.EZpvd(), actionBar.copydefault(), actionBar.AEQbTJ());
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((InHouseIMConversationSimpleInfoEntity) next).getChannelId(), (Object) str3)) {
                    break;
                }
            }
            InHouseIMConversationSimpleInfoEntity inHouseIMConversationSimpleInfoEntity = (InHouseIMConversationSimpleInfoEntity) next;
            if (inHouseIMConversationSimpleInfoEntity != null) {
                C44482sRl c44482sRlFetchVPNInfo = c44302sKu2.fetchVPNInfo();
                List<InHouseIMConversationSimpleInfoEntity> listEZpvd = C56402yEa.EZpvd(inHouseIMConversationSimpleInfoEntity);
                this.L$0 = objM7377constructorimpl;
                this.label = 2;
                if (c44482sRlFetchVPNInfo.OLrzqt(listEZpvd, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
