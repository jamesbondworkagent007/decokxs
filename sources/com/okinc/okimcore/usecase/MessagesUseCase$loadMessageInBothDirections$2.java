package com.okinc.okimcore.usecase;

import com.ibm.icu.text.DateFormat;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C44124sEe;
import o.C44502sSe;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class MessagesUseCase$loadMessageInBothDirections$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Boolean $asc;
    final /* synthetic */ String $channelId;
    final /* synthetic */ CoroutineDispatcher $dispatcher;
    final /* synthetic */ long $messageSeq;
    final /* synthetic */ boolean $needToGetNextUnread;
    final /* synthetic */ long $remoteMaxSeq;
    final /* synthetic */ long $size;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44502sSe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesUseCase$loadMessageInBothDirections$2(boolean z, C44502sSe c44502sSe, String str, long j, long j2, long j3, CoroutineDispatcher coroutineDispatcher, Boolean bool, Continuation<? super MessagesUseCase$loadMessageInBothDirections$2> continuation) {
        super(2, continuation);
        this.$needToGetNextUnread = z;
        this.this$0 = c44502sSe;
        this.$channelId = str;
        this.$messageSeq = j;
        this.$remoteMaxSeq = j2;
        this.$size = j3;
        this.$dispatcher = coroutineDispatcher;
        this.$asc = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MessagesUseCase$loadMessageInBothDirections$2 messagesUseCase$loadMessageInBothDirections$2 = new MessagesUseCase$loadMessageInBothDirections$2(this.$needToGetNextUnread, this.this$0, this.$channelId, this.$messageSeq, this.$remoteMaxSeq, this.$size, this.$dispatcher, this.$asc, continuation);
        messagesUseCase$loadMessageInBothDirections$2.L$0 = obj;
        return messagesUseCase$loadMessageInBothDirections$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessagesUseCase$loadMessageInBothDirections$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0145  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineScope coroutineScope;
        long jCurrentTimeMillis;
        long jLongValue;
        Object objEZpvd;
        String str;
        long j;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            jCurrentTimeMillis = System.currentTimeMillis();
            if (this.$needToGetNextUnread) {
                C44502sSe c44502sSe = this.this$0;
                String str2 = this.$channelId;
                long j2 = this.$messageSeq;
                this.L$0 = coroutineScope;
                this.J$0 = jCurrentTimeMillis;
                this.label = 1;
                objEZpvd = c44502sSe.EZpvd(str2, j2, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                jLongValue = this.$messageSeq;
                CoroutineScope coroutineScope2 = coroutineScope;
                C44124sEe.imLogSync$default("loadMessageInBothDirections => targetSeq: " + jLongValue + ", timeCost: " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms, ", null, this.$channelId, 2, null);
                long j3 = (this.$remoteMaxSeq - ((long) 200)) + this.$size;
                if (1 > jLongValue && jLongValue < j3) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    CoroutineDispatcher coroutineDispatcherAEQbTJ = this.$dispatcher;
                    if (coroutineDispatcherAEQbTJ == null) {
                        coroutineDispatcherAEQbTJ = this.this$0.AEQbTJ();
                    }
                    Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope2, coroutineDispatcherAEQbTJ, null, new MessagesUseCase$loadMessageInBothDirections$2$topDeferred$1(this.this$0, this.$channelId, jLongValue, this.$size, this.$asc, null), 2, null);
                    CoroutineDispatcher coroutineDispatcherAEQbTJ2 = this.$dispatcher;
                    if (coroutineDispatcherAEQbTJ2 == null) {
                        coroutineDispatcherAEQbTJ2 = this.this$0.AEQbTJ();
                    }
                    Deferred[] deferredArr = {deferredAsync$default, BuildersKt__Builders_commonKt.async$default(coroutineScope2, coroutineDispatcherAEQbTJ2, null, new MessagesUseCase$loadMessageInBothDirections$2$bottomDeferred$1(this.this$0, this.$channelId, jLongValue, this.$size, this.$asc, null), 2, null)};
                    this.L$0 = null;
                    this.J$0 = jCurrentTimeMillis2;
                    this.label = 2;
                    if (AwaitKt.awaitAll(deferredArr, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    j = jCurrentTimeMillis2;
                    C44124sEe.imLogSync$default("loadMessageInBothDirections => offline sync task completed, timeCost: " + (System.currentTimeMillis() - j) + DateFormat.MINUTE_SECOND, null, this.$channelId, 2, null);
                    return Unit.INSTANCE;
                }
                if (jLongValue >= 0) {
                    str = "loadMessageInBothDirections => targetSeq is negative, no unread messages found, targetSeq: " + jLongValue;
                } else {
                    str = "loadMessageInBothDirections => targetSeq is not in range, no need to sync these messages, targetSeq: " + jLongValue + ", needToSyncUnreadMaxSeq: " + j3;
                }
                C44124sEe.imLogSync$default(str, null, this.$channelId, 2, null);
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.J$0;
                C56391yDq.AEQbTJ(obj);
                C44124sEe.imLogSync$default("loadMessageInBothDirections => offline sync task completed, timeCost: " + (System.currentTimeMillis() - j) + DateFormat.MINUTE_SECOND, null, this.$channelId, 2, null);
                return Unit.INSTANCE;
            }
            long j4 = this.J$0;
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            jCurrentTimeMillis = j4;
            objEZpvd = obj;
        }
        jLongValue = ((Number) objEZpvd).longValue();
        CoroutineScope coroutineScope22 = coroutineScope;
        C44124sEe.imLogSync$default("loadMessageInBothDirections => targetSeq: " + jLongValue + ", timeCost: " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms, ", null, this.$channelId, 2, null);
        long j32 = (this.$remoteMaxSeq - ((long) 200)) + this.$size;
        if (1 > jLongValue) {
        }
        if (jLongValue >= 0) {
        }
        C44124sEe.imLogSync$default(str, null, this.$channelId, 2, null);
        return Unit.INSTANCE;
    }
}
