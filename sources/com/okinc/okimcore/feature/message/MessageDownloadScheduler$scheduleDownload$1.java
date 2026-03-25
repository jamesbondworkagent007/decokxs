package com.okinc.okimcore.feature.message;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56379yDe;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.sJY;

/* JADX INFO: loaded from: classes10.dex */
public final class MessageDownloadScheduler$scheduleDownload$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $asc;
    final /* synthetic */ String $channelId;
    final /* synthetic */ long $fromSeq;
    final /* synthetic */ long $startSequence;
    final /* synthetic */ Long $toSeq;
    final /* synthetic */ long $total;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ sJY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageDownloadScheduler$scheduleDownload$1(sJY sjy, String str, long j, Long l, long j2, boolean z, long j3, Continuation<? super MessageDownloadScheduler$scheduleDownload$1> continuation) {
        super(2, continuation);
        this.this$0 = sjy;
        this.$channelId = str;
        this.$fromSeq = j;
        this.$toSeq = l;
        this.$total = j2;
        this.$asc = z;
        this.$startSequence = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MessageDownloadScheduler$scheduleDownload$1 messageDownloadScheduler$scheduleDownload$1 = new MessageDownloadScheduler$scheduleDownload$1(this.this$0, this.$channelId, this.$fromSeq, this.$toSeq, this.$total, this.$asc, this.$startSequence, continuation);
        messageDownloadScheduler$scheduleDownload$1.L$0 = obj;
        return messageDownloadScheduler$scheduleDownload$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageDownloadScheduler$scheduleDownload$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String str;
        long jMax;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        int i2 = 1;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                sJY sjy = this.this$0;
                String str2 = this.$channelId;
                long j = this.$fromSeq;
                Long l = this.$toSeq;
                long j2 = this.$total;
                boolean z = this.$asc;
                long j3 = this.$startSequence;
                Result.Application application = Result.Companion;
                if (l != null) {
                    jMax = l.longValue();
                    str = str2;
                } else {
                    str = str2;
                    jMax = Math.max(j - ((long) ((int) j2)), 0L);
                    i2 = 1;
                }
                this.label = i2;
                if (sjy.EZpvd(str, j, j, jMax, j2, z, j3, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        String str3 = this.$channelId;
        long j4 = this.$fromSeq;
        long j5 = this.$startSequence;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.KWHzl("MessageDownloadScheduler", "scheduleDownload: [" + str3 + " " + j4 + "-" + j5 + "] failure:" + C56379yDe.AEQbTJ(thM7380exceptionOrNullimpl));
        }
        return Unit.INSTANCE;
    }
}
