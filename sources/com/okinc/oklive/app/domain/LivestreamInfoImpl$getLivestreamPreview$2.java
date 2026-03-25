package com.okinc.oklive.app.domain;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.oklive.app.data.model.remote.LivestreamInfoResponse;
import com.okinc.oklive.app.data.model.remote.LivestreamPreviewRequest;
import com.okinc.oklive.app.data.repository.remote.LivestreamService;
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
public final class LivestreamInfoImpl$getLivestreamPreview$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LivestreamInfoResponse>, Object> {
    final /* synthetic */ long $uid;
    int label;
    final /* synthetic */ sTS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamInfoImpl$getLivestreamPreview$2(long j, sTS sts, Continuation<? super LivestreamInfoImpl$getLivestreamPreview$2> continuation) {
        super(2, continuation);
        this.$uid = j;
        this.this$0 = sts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LivestreamInfoImpl$getLivestreamPreview$2(this.$uid, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LivestreamInfoResponse> continuation) {
        return ((LivestreamInfoImpl$getLivestreamPreview$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ResponseData responseData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.EZpvd("LivestreamInfoImpl", "Fetching livestream preview for uid: " + this.$uid);
                LivestreamPreviewRequest livestreamPreviewRequest = new LivestreamPreviewRequest(this.$uid);
                LivestreamService livestreamService = this.this$0.AEQbTJ;
                this.label = 1;
                obj = livestreamService.getLivestreamPreview(livestreamPreviewRequest, this);
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
            pUU.AEQbTJ("LivestreamInfoImpl", "Failed to fetch livestream preview for uid: " + this.$uid, e);
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            pUU.EZpvd("LivestreamInfoImpl", "Livestream preview fetched successfully for uid: " + this.$uid);
            return (LivestreamInfoResponse) responseData.getData();
        }
        pUU.valueOf("LivestreamInfoImpl", "No livestream preview available for uid: " + this.$uid + ", code: " + responseData.getCode());
        return null;
    }
}
