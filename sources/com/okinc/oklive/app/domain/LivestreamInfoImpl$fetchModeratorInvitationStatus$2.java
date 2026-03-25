package com.okinc.oklive.app.domain;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.oklive.app.data.repository.remote.LiveStreamStatusModelResponse;
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
public final class LivestreamInfoImpl$fetchModeratorInvitationStatus$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LiveStreamStatusModelResponse>, Object> {
    final /* synthetic */ String $channelId;
    int label;
    final /* synthetic */ sTS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamInfoImpl$fetchModeratorInvitationStatus$2(String str, sTS sts, Continuation<? super LivestreamInfoImpl$fetchModeratorInvitationStatus$2> continuation) {
        super(2, continuation);
        this.$channelId = str;
        this.this$0 = sts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LivestreamInfoImpl$fetchModeratorInvitationStatus$2(this.$channelId, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LiveStreamStatusModelResponse> continuation) {
        return ((LivestreamInfoImpl$fetchModeratorInvitationStatus$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ResponseData responseData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.EZpvd("LivestreamInfoImpl", "Fetching ModeratorInvitationStatus for channelId: " + this.$channelId);
                LivestreamService livestreamService = this.this$0.AEQbTJ;
                String str = this.$channelId;
                this.label = 1;
                obj = livestreamService.fetchModeratorInvitationStatus(str, this);
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
            pUU.AEQbTJ("LivestreamInfoImpl", "Exception in fetchModeratorInvitationStatus for channelId: " + this.$channelId, e);
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            pUU.EZpvd("LivestreamInfoImpl", "Successfully fetched ModeratorInvitationStatus");
            return (LiveStreamStatusModelResponse) responseData.getData();
        }
        pUU.copydefault("LivestreamInfoImpl", "API error: code=" + responseData.getCode() + ", msg=" + responseData.getMsg());
        return null;
    }
}
