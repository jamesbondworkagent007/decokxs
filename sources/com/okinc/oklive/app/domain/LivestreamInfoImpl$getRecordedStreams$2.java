package com.okinc.oklive.app.domain;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.oklive.app.data.repository.remote.LivestreamService;
import com.okinc.oklive.app.data.repository.remote.RecordedStreamsRequest;
import com.okinc.oklive.app.data.repository.remote.RecordedStreamsResponse;
import com.okinc.oklive.app.data.repository.remote.RecordingInfoResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.sTS;

/* JADX INFO: loaded from: classes10.dex */
public final class LivestreamInfoImpl$getRecordedStreams$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RecordedStreamsResponse>, Object> {
    final /* synthetic */ int $pageIndex;
    final /* synthetic */ int $pageSize;
    final /* synthetic */ long $uid;
    int label;
    final /* synthetic */ sTS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamInfoImpl$getRecordedStreams$2(long j, int i, int i2, sTS sts, Continuation<? super LivestreamInfoImpl$getRecordedStreams$2> continuation) {
        super(2, continuation);
        this.$uid = j;
        this.$pageIndex = i;
        this.$pageSize = i2;
        this.this$0 = sts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LivestreamInfoImpl$getRecordedStreams$2(this.$uid, this.$pageIndex, this.$pageSize, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RecordedStreamsResponse> continuation) {
        return ((LivestreamInfoImpl$getRecordedStreams$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ResponseData responseData;
        List<RecordingInfoResponse> items;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.EZpvd("LivestreamInfoImpl", "Fetching recorded streams for uid: " + this.$uid + ", page: " + this.$pageIndex + ", size: " + this.$pageSize);
                RecordedStreamsRequest recordedStreamsRequest = new RecordedStreamsRequest(this.$uid, false, this.$pageIndex, this.$pageSize, 2, null);
                LivestreamService livestreamService = this.this$0.AEQbTJ;
                this.label = 1;
                obj = livestreamService.getRecordedStreams(recordedStreamsRequest, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            responseData = (ResponseData) obj;
        } catch (Exception e) {
            pUU.AEQbTJ("LivestreamInfoImpl", "Exception in getRecordedStreams for uid: " + this.$uid, e);
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            RecordedStreamsResponse recordedStreamsResponse = (RecordedStreamsResponse) responseData.getData();
            pUU.EZpvd("LivestreamInfoImpl", "Successfully fetched " + ((recordedStreamsResponse == null || (items = recordedStreamsResponse.getItems()) == null) ? 0 : items.size()) + " recordings");
            return (RecordedStreamsResponse) responseData.getData();
        }
        pUU.copydefault("LivestreamInfoImpl", "API error: code=" + responseData.getCode() + ", msg=" + responseData.getMsg());
        return null;
    }
}
