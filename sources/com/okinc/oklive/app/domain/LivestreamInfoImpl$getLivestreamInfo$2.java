package com.okinc.oklive.app.domain;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.oklive.app.data.model.remote.LivestreamInfoResponse;
import com.okinc.oklive.app.data.model.remote.LivestreamOwner;
import com.okinc.oklive.app.data.repository.remote.LivestreamService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44542sTu;
import o.C44547sTz;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.sTA;
import o.sTS;

/* JADX INFO: loaded from: classes10.dex */
public final class LivestreamInfoImpl$getLivestreamInfo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super sTA>, Object> {
    final /* synthetic */ String $channelId;
    Object L$0;
    int label;
    final /* synthetic */ sTS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamInfoImpl$getLivestreamInfo$2(String str, sTS sts, Continuation<? super LivestreamInfoImpl$getLivestreamInfo$2> continuation) {
        super(2, continuation);
        this.$channelId = str;
        this.this$0 = sts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LivestreamInfoImpl$getLivestreamInfo$2(this.$channelId, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super sTA> continuation) {
        return ((LivestreamInfoImpl$getLivestreamInfo$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sTA.Activity activity;
        LivestreamInfoResponse livestreamInfoResponse;
        LivestreamOwner owner;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.EZpvd("LivestreamInfoImpl", "Fetching livestream info for channelId: " + this.$channelId);
                LivestreamService livestreamService = this.this$0.AEQbTJ;
                String str = this.$channelId;
                String strAEQbTJ = C44542sTu.AEQbTJ();
                this.label = 1;
                obj = livestreamService.getLivestreamInfo(str, strAEQbTJ, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    livestreamInfoResponse = (LivestreamInfoResponse) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    this.this$0.OLrzqt(livestreamInfoResponse);
                    pUU.EZpvd("LivestreamInfoImpl", "Livestream summary: " + C44547sTz.KWHzl.EZpvd(livestreamInfoResponse));
                    return new sTA.TaskDescription(livestreamInfoResponse);
                }
                C56391yDq.AEQbTJ(obj);
            }
            ResponseData responseData = (ResponseData) obj;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                LivestreamInfoResponse livestreamInfoResponse2 = (LivestreamInfoResponse) responseData.getData();
                pUU.EZpvd("LivestreamInfoImpl", "Successfully fetched livestream info for channel: " + (livestreamInfoResponse2 != null ? livestreamInfoResponse2.getTitle() : null));
                if (livestreamInfoResponse2 != null && (owner = livestreamInfoResponse2.getOwner()) != null) {
                    pUU.EZpvd("LivestreamInfoImpl", "Livestream owner: " + owner.getNickname() + " (UID: " + owner.getUserUid() + ")");
                }
                pUU.EZpvd("LivestreamInfoImpl", "Stream status: " + (livestreamInfoResponse2 != null ? livestreamInfoResponse2.getStatus() : null) + ", Current viewers: " + (livestreamInfoResponse2 != null ? livestreamInfoResponse2.getCurrentViews() : null));
                C44547sTz c44547sTz = C44547sTz.KWHzl;
                LivestreamInfoResponse livestreamInfoResponseKWHzl = c44547sTz.KWHzl(livestreamInfoResponse2);
                if (livestreamInfoResponseKWHzl != null && c44547sTz.OLrzqt(livestreamInfoResponseKWHzl)) {
                    sTS sts = this.this$0;
                    this.L$0 = livestreamInfoResponseKWHzl;
                    this.label = 2;
                    if (sts.EZpvd(livestreamInfoResponseKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    livestreamInfoResponse = livestreamInfoResponseKWHzl;
                    this.this$0.OLrzqt(livestreamInfoResponse);
                    pUU.EZpvd("LivestreamInfoImpl", "Livestream summary: " + C44547sTz.KWHzl.EZpvd(livestreamInfoResponse));
                    return new sTA.TaskDescription(livestreamInfoResponse);
                }
                pUU.copydefault("LivestreamInfoImpl", "Invalid livestream info received for channelId: " + this.$channelId);
                this.this$0.KWHzl(this.$channelId, -1, "Invalid livestream info");
                activity = new sTA.Activity(-1, new IllegalStateException("Invalid livestream info"), "Received incomplete livestream information");
            } else {
                String str2 = "API error: code=" + responseData.getCode() + ", msg=" + responseData.getMsg();
                pUU.copydefault("LivestreamInfoImpl", str2);
                sTS sts2 = this.this$0;
                String str3 = this.$channelId;
                int code = responseData.getCode();
                String msg = responseData.getMsg();
                if (msg == null) {
                    msg = "Unknown error";
                }
                sts2.KWHzl(str3, code, msg);
                activity = new sTA.Activity(responseData.getCode(), new RuntimeException(str2), responseData.getMsg());
            }
            return activity;
        } catch (Exception e) {
            pUU.AEQbTJ("LivestreamInfoImpl", "Exception getting livestream info", e);
            if (e instanceof OKServerException) {
                return new sTA.Activity(((OKServerException) e).getCode(), null, e.getMessage(), 2, null);
            }
            sTS sts3 = this.this$0;
            String str4 = this.$channelId;
            String message = e.getMessage();
            sts3.KWHzl(str4, -1, message != null ? message : "Unknown error");
            return new sTA.Activity(-1, e, e.getMessage());
        }
    }
}
