package com.amplifyframework.predictions.aws.http;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LivenessWebSocket$sendEventQueueChannel$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Channel<Job> $this_apply;
    Object L$0;
    Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivenessWebSocket$sendEventQueueChannel$1$1(Channel<Job> channel, Continuation<? super LivenessWebSocket$sendEventQueueChannel$1$1> continuation) {
        super(2, continuation);
        this.$this_apply = channel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new LivenessWebSocket$sendEventQueueChannel$1$1(this.$this_apply, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LivenessWebSocket$sendEventQueueChannel$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:7:0x0016, B:16:0x0037, B:19:0x0044, B:21:0x004c, B:24:0x005f, B:12:0x002a, B:15:0x0033), top: B:32:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #0 {all -> 0x0066, blocks: (B:7:0x0016, B:16:0x0037, B:19:0x0044, B:21:0x004c, B:24:0x005f, B:12:0x002a, B:15:0x0033), top: B:32:0x0008 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005c -> B:16:0x0037). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        ReceiveChannel receiveChannel;
        ChannelIterator it;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                receiveChannel = this.$this_apply;
                it = receiveChannel.iterator();
            } else if (i == 1) {
                it = (ChannelIterator) this.L$1;
                receiveChannel = (ReceiveChannel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (!((Boolean) obj).booleanValue()) {
                    Job job = (Job) it.next();
                    this.L$0 = receiveChannel;
                    this.L$1 = it;
                    this.label = 2;
                    if (job.join(this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    Unit unit = Unit.INSTANCE;
                    ChannelsKt.cancelConsumed(receiveChannel, null);
                    return unit;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (ChannelIterator) this.L$1;
                receiveChannel = (ReceiveChannel) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            this.L$0 = receiveChannel;
            this.L$1 = it;
            this.label = 1;
            obj = it.hasNext(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            if (!((Boolean) obj).booleanValue()) {
            }
        } finally {
        }
    }
}
