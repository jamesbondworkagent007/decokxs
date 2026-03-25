package com.okinc.oklive.app.domain;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.oklive.app.data.repository.remote.LivestreamService;
import com.okinc.oklive.app.data.repository.remote.RecordingInfoResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44542sTu;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.sTS;

/* JADX INFO: loaded from: classes10.dex */
public final class LivestreamInfoImpl$getRecordingInfo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RecordingInfoResponse>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ String $shareCode;
    int label;
    final /* synthetic */ sTS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamInfoImpl$getRecordingInfo$2(String str, String str2, sTS sts, Continuation<? super LivestreamInfoImpl$getRecordingInfo$2> continuation) {
        super(2, continuation);
        this.$shareCode = str;
        this.$channelId = str2;
        this.this$0 = sts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LivestreamInfoImpl$getRecordingInfo$2(this.$shareCode, this.$channelId, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RecordingInfoResponse> continuation) {
        return ((LivestreamInfoImpl$getRecordingInfo$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.EZpvd("LivestreamInfoImpl", "Fetching recording info - shareCode: " + this.$shareCode + ", channelId: " + this.$channelId);
                LivestreamService livestreamService = this.this$0.AEQbTJ;
                String str = this.$shareCode;
                String str2 = this.$channelId;
                String strAEQbTJ = C44542sTu.AEQbTJ();
                this.label = 1;
                obj = livestreamService.getRecordingInfo(str, str2, strAEQbTJ, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            ResponseData responseData = (ResponseData) obj;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                RecordingInfoResponse recordingInfoResponse = (RecordingInfoResponse) responseData.getData();
                pUU.EZpvd("LivestreamInfoImpl", "Successfully fetched recording info - vid: " + (recordingInfoResponse != null ? recordingInfoResponse.getVid() : null));
                return (RecordingInfoResponse) responseData.getData();
            }
            pUU.copydefault("LivestreamInfoImpl", "API error: code=" + responseData.getCode() + ", msg=" + responseData.getMsg());
            return null;
        } catch (Exception e) {
            pUU.AEQbTJ("LivestreamInfoImpl", "Exception in getRecordingInfo for shareCode: " + this.$shareCode, e);
            return null;
        }
    }
}
