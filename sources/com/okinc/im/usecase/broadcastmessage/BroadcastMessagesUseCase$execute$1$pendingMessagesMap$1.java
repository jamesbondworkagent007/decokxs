package com.okinc.im.usecase.broadcastmessage;

import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC35761oCs;
import o.C35762oCt;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class BroadcastMessagesUseCase$execute$1$pendingMessagesMap$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Pair<? extends SendMessageRequestParam, ? extends AbstractC35761oCs.TaskDescription>>>, Object> {
    final /* synthetic */ long $broadcastChannelId;
    final /* synthetic */ List<SendMessageRequestParam> $params;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C35762oCt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.okinc.im.config.serviceprovider.SendMessageRequestParam> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BroadcastMessagesUseCase$execute$1$pendingMessagesMap$1(List<? extends SendMessageRequestParam> list, C35762oCt c35762oCt, long j, Continuation<? super BroadcastMessagesUseCase$execute$1$pendingMessagesMap$1> continuation) {
        super(2, continuation);
        this.$params = list;
        this.this$0 = c35762oCt;
        this.$broadcastChannelId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BroadcastMessagesUseCase$execute$1$pendingMessagesMap$1 broadcastMessagesUseCase$execute$1$pendingMessagesMap$1 = new BroadcastMessagesUseCase$execute$1$pendingMessagesMap$1(this.$params, this.this$0, this.$broadcastChannelId, continuation);
        broadcastMessagesUseCase$execute$1$pendingMessagesMap$1.L$0 = obj;
        return broadcastMessagesUseCase$execute$1$pendingMessagesMap$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Pair<? extends SendMessageRequestParam, ? extends AbstractC35761oCs.TaskDescription>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<? extends Pair<? extends SendMessageRequestParam, AbstractC35761oCs.TaskDescription>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<? extends Pair<? extends SendMessageRequestParam, AbstractC35761oCs.TaskDescription>>> continuation) {
        return ((BroadcastMessagesUseCase$execute$1$pendingMessagesMap$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        List<SendMessageRequestParam> list = this.$params;
        C35762oCt c35762oCt = this.this$0;
        long j = this.$broadcastChannelId;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, c35762oCt.EZpvd, null, new BroadcastMessagesUseCase$execute$1$pendingMessagesMap$1$1$1(c35762oCt, j, (SendMessageRequestParam) it.next(), null), 2, null));
        }
        this.label = 1;
        Object objAwaitAll = AwaitKt.awaitAll(arrayList, this);
        return objAwaitAll == objCopydefault ? objCopydefault : objAwaitAll;
    }
}
