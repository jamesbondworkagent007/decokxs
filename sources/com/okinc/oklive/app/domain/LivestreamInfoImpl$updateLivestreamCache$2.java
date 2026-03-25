package com.okinc.oklive.app.domain;

import com.okinc.oklive.app.data.model.remote.LivestreamInfoResponse;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.sTS;

/* JADX INFO: loaded from: classes10.dex */
public final class LivestreamInfoImpl$updateLivestreamCache$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LivestreamInfoResponse $livestreamInfo;
    int label;
    final /* synthetic */ sTS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamInfoImpl$updateLivestreamCache$2(LivestreamInfoResponse livestreamInfoResponse, sTS sts, Continuation<? super LivestreamInfoImpl$updateLivestreamCache$2> continuation) {
        super(2, continuation);
        this.$livestreamInfo = livestreamInfoResponse;
        this.this$0 = sts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LivestreamInfoImpl$updateLivestreamCache$2(this.$livestreamInfo, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LivestreamInfoImpl$updateLivestreamCache$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String channelId = this.$livestreamInfo.getChannelId();
            pUU.EZpvd("LivestreamInfoImpl", "Updating cache for channel: " + channelId);
            Map map = this.this$0.copydefault;
            Object objMutableStateFlow = map.get(channelId);
            if (objMutableStateFlow == null) {
                objMutableStateFlow = StateFlowKt.MutableStateFlow(null);
                map.put(channelId, objMutableStateFlow);
            }
            ((MutableStateFlow) objMutableStateFlow).setValue(this.$livestreamInfo);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
