package com.okinc.im.imui.messageV2.view.messagelist;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.okimcore.model.im.OKMessage;
import java.io.File;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C44169sFw;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListViewModel$retryDownloadAndPlayAudio$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ OKMessage $message;
    int label;
    final /* synthetic */ MessageListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListViewModel$retryDownloadAndPlayAudio$1(MessageListViewModel messageListViewModel, OKMessage oKMessage, Continuation<? super MessageListViewModel$retryDownloadAndPlayAudio$1> continuation) {
        super(1, continuation);
        this.this$0 = messageListViewModel;
        this.$message = oKMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MessageListViewModel$retryDownloadAndPlayAudio$1(this.this$0, this.$message, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((MessageListViewModel$retryDownloadAndPlayAudio$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Unit unit;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            MessageListViewModel messageListViewModel = this.this$0;
            OKMessage oKMessage = this.$message;
            try {
                Result.Application application = Result.Companion;
                if (messageListViewModel.AkhnZx != null) {
                    File fileKWHzl = C44169sFw.KWHzl(oKMessage, messageListViewModel.values);
                    pUU.KWHzl("MessageListViewModel", "[" + oKMessage.getTargetId() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + oKMessage.getSeq() + "] retryAudio cacheFile" + fileKWHzl);
                    if (fileKWHzl != null && fileKWHzl.exists()) {
                        fileKWHzl.delete();
                    }
                    pUU.KWHzl("MessageListViewModel", "[" + oKMessage.getTargetId() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + oKMessage.getSeq() + "] retryPlayAudio");
                    messageListViewModel.OLrzqt(oKMessage);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                Result.m7377constructorimpl(unit);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
