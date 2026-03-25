package com.okinc.okimcore.feature.message;

import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMMessageListSequenceQuery;
import com.okinc.okimcore.model.im.inhouseim.ws.WSGetMsgBySeqList;
import com.okinc.okimcore.model.im.inhouseim.ws.WSMessageListResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C44489sRs;
import o.C56391yDq;
import o.C56442yFn;
import o.sJY;

/* JADX INFO: loaded from: classes10.dex */
public final class MessageDownloadScheduler$scheduleDownloadByBatch$messages$1 extends SuspendLambda implements Function1<Continuation<? super WSMessageListResponse>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ List<Long> $messageIds;
    int label;
    final /* synthetic */ sJY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageDownloadScheduler$scheduleDownloadByBatch$messages$1(sJY sjy, String str, List<Long> list, Continuation<? super MessageDownloadScheduler$scheduleDownloadByBatch$messages$1> continuation) {
        super(1, continuation);
        this.this$0 = sjy;
        this.$channelId = str;
        this.$messageIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MessageDownloadScheduler$scheduleDownloadByBatch$messages$1(this.this$0, this.$channelId, this.$messageIds, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super WSMessageListResponse> continuation) {
        return ((MessageDownloadScheduler$scheduleDownloadByBatch$messages$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C44489sRs c44489sRs = this.this$0.values;
            String str = this.$channelId;
            this.label = 1;
            if (c44489sRs.KWHzl(str, "MessageDownloadScheduler", this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C44489sRs c44489sRs2 = this.this$0.values;
        WSGetMsgBySeqList wSGetMsgBySeqList = new WSGetMsgBySeqList(new InHouseIMMessageListSequenceQuery(this.$channelId, this.$messageIds));
        this.label = 2;
        obj = c44489sRs2.copydefault(wSGetMsgBySeqList, (Continuation<? super WSMessageListResponse>) this);
        return obj == objCopydefault ? objCopydefault : obj;
    }
}
