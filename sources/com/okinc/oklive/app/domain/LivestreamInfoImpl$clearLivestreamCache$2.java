package com.okinc.oklive.app.domain;

import com.okinc.oklive.app.data.model.remote.LivestreamInfoResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.sTS;

/* JADX INFO: loaded from: classes10.dex */
public final class LivestreamInfoImpl$clearLivestreamCache$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MutableStateFlow<LivestreamInfoResponse>>, Object> {
    final /* synthetic */ String $channelId;
    int label;
    final /* synthetic */ sTS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamInfoImpl$clearLivestreamCache$2(String str, sTS sts, Continuation<? super LivestreamInfoImpl$clearLivestreamCache$2> continuation) {
        super(2, continuation);
        this.$channelId = str;
        this.this$0 = sts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LivestreamInfoImpl$clearLivestreamCache$2(this.$channelId, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MutableStateFlow<LivestreamInfoResponse>> continuation) {
        return ((LivestreamInfoImpl$clearLivestreamCache$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.EZpvd("LivestreamInfoImpl", "Clearing cache for channel: " + this.$channelId);
            MutableStateFlow mutableStateFlow = (MutableStateFlow) this.this$0.copydefault.get(this.$channelId);
            if (mutableStateFlow != null) {
                mutableStateFlow.setValue(null);
            }
            return this.this$0.copydefault.remove(this.$channelId);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
