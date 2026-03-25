package com.okinc.im.usecase.broadcastmessage;

import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC35761oCs;
import o.C33129mqd;
import o.C35762oCt;
import o.C35768oCz;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes23.dex */
public final class BroadcastMessagesUseCase$execute$1$pendingMessagesMap$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends SendMessageRequestParam, ? extends AbstractC35761oCs.TaskDescription>>, Object> {
    final /* synthetic */ long $broadcastChannelId;
    final /* synthetic */ SendMessageRequestParam $it;
    int label;
    final /* synthetic */ C35762oCt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastMessagesUseCase$execute$1$pendingMessagesMap$1$1$1(C35762oCt c35762oCt, long j, SendMessageRequestParam sendMessageRequestParam, Continuation<? super BroadcastMessagesUseCase$execute$1$pendingMessagesMap$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c35762oCt;
        this.$broadcastChannelId = j;
        this.$it = sendMessageRequestParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BroadcastMessagesUseCase$execute$1$pendingMessagesMap$1$1$1(this.this$0, this.$broadcastChannelId, this.$it, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends SendMessageRequestParam, ? extends AbstractC35761oCs.TaskDescription>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Pair<? extends SendMessageRequestParam, AbstractC35761oCs.TaskDescription>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Pair<? extends SendMessageRequestParam, AbstractC35761oCs.TaskDescription>> continuation) {
        return ((BroadcastMessagesUseCase$execute$1$pendingMessagesMap$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            long jValueOf = C33129mqd.valueOf(C56443yFo.AEQbTJ(this.this$0.KWHzl.incrementAndGet()));
            C35768oCz c35768oCz = this.this$0.AEQbTJ;
            long j = this.$broadcastChannelId;
            SendMessageRequestParam sendMessageRequestParam = this.$it;
            this.label = 1;
            obj = c35768oCz.OLrzqt(jValueOf, j, sendMessageRequestParam, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return C56390yDp.OLrzqt(this.$it, new AbstractC35761oCs.TaskDescription((OKMessage) obj));
    }
}
