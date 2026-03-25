package com.okinc.oklive.app.domain;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.oklive.app.data.LiveStreamStatus;
import com.okinc.oklive.app.data.model.remote.LivestreamStatusResponse;
import com.okinc.oklive.app.data.repository.remote.LivestreamService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.sTB;
import o.sTS;

/* JADX INFO: loaded from: classes10.dex */
public final class LivestreamInfoImpl$getLivestreamStatus$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super sTB>, Object> {
    final /* synthetic */ String $shareCode;
    int label;
    final /* synthetic */ sTS this$0;

    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[LiveStreamStatus.values().length];
            try {
                iArr[LiveStreamStatus.LIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LiveStreamStatus.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LiveStreamStatus.ENDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamInfoImpl$getLivestreamStatus$2(String str, sTS sts, Continuation<? super LivestreamInfoImpl$getLivestreamStatus$2> continuation) {
        super(2, continuation);
        this.$shareCode = str;
        this.this$0 = sts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LivestreamInfoImpl$getLivestreamStatus$2(this.$shareCode, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super sTB> continuation) {
        return ((LivestreamInfoImpl$getLivestreamStatus$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object application;
        LiveStreamStatus status;
        LiveStreamStatus status2;
        String channelId;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.EZpvd("LivestreamInfoImpl", "Fetching livestream status for shareCode: " + this.$shareCode);
                LivestreamService livestreamService = this.this$0.AEQbTJ;
                String str = this.$shareCode;
                this.label = 1;
                obj = livestreamService.getLivestreamStatus(str, this);
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
                LivestreamStatusResponse livestreamStatusResponse = (LivestreamStatusResponse) responseData.getData();
                LiveStreamStatus status3 = livestreamStatusResponse != null ? livestreamStatusResponse.getStatus() : null;
                int i2 = status3 == null ? -1 : Application.KWHzl[status3.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    pUU.EZpvd("LivestreamInfoImpl", "Stream is scheduled/live - ready for viewing");
                } else if (i2 == 3) {
                    if (Intrinsics.EZpvd(livestreamStatusResponse.getAllowRecording(), C56443yFo.KWHzl(true))) {
                        pUU.EZpvd("LivestreamInfoImpl", "Stream ended with recording available");
                    } else {
                        pUU.EZpvd("LivestreamInfoImpl", "Stream ended without recording");
                    }
                } else {
                    pUU.valueOf("LivestreamInfoImpl", "Stream has unexpected status: " + (livestreamStatusResponse != null ? livestreamStatusResponse.getStatus() : null));
                }
                sTS sts = this.this$0;
                String str2 = this.$shareCode;
                if (livestreamStatusResponse == null || (status = livestreamStatusResponse.getStatus()) == null) {
                    status = LiveStreamStatus.UNKNOWN;
                }
                sts.EZpvd(str2, status, true);
                boolean zEZpvd = livestreamStatusResponse != null ? Intrinsics.EZpvd(livestreamStatusResponse.getAllowRecording(), C56443yFo.KWHzl(true)) : false;
                if (livestreamStatusResponse == null || (status2 = livestreamStatusResponse.getStatus()) == null) {
                    status2 = LiveStreamStatus.UNKNOWN;
                }
                if (livestreamStatusResponse == null || (channelId = livestreamStatusResponse.getChannelId()) == null) {
                    channelId = "";
                }
                return new sTB.TaskDescription(channelId, status2, zEZpvd);
            }
            String str3 = "API error: code=" + responseData.getCode() + ", msg=" + responseData.getMsg();
            pUU.copydefault("LivestreamInfoImpl", str3);
            this.this$0.EZpvd(this.$shareCode, LiveStreamStatus.UNKNOWN, false);
            return new sTB.Activity(responseData.getCode(), new RuntimeException(str3), responseData.getMsg());
        } catch (Exception e) {
            pUU.AEQbTJ("LivestreamInfoImpl", "Exception getting livestream status", e);
            this.this$0.EZpvd(this.$shareCode, LiveStreamStatus.UNKNOWN, false);
            String message = e.getMessage();
            if (message != null && StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "User not logged in", false, 2, (Object) null)) {
                application = sTB.StateListAnimator.EZpvd;
            } else {
                String message2 = e.getMessage();
                if (message2 != null && StringsKt__StringsKt.contains$default((CharSequence) message2, (CharSequence) "404", false, 2, (Object) null)) {
                    application = new sTB.Application(this.$shareCode);
                } else {
                    return new sTB.Activity(-1, e, e.getMessage());
                }
            }
            return application;
        }
    }
}
