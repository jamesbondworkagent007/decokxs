package com.okinc.im.usecase.message;

import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.im.imui.messageV2.model.SendMessageRequest;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35821oEy;
import o.C35822oEz;
import o.C56391yDq;
import o.C56442yFn;
import o.oEB;
import o.oEF;

/* JADX INFO: loaded from: classes8.dex */
public final class SendOkMessageBySendMessageRequestUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super OKMessage>, Object> {
    final /* synthetic */ OKMessage $message;
    final /* synthetic */ SendMessageRequest $request;
    int label;
    final /* synthetic */ oEB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendOkMessageBySendMessageRequestUseCase$execute$2(SendMessageRequest sendMessageRequest, oEB oeb, OKMessage oKMessage, Continuation<? super SendOkMessageBySendMessageRequestUseCase$execute$2> continuation) {
        super(2, continuation);
        this.$request = sendMessageRequest;
        this.this$0 = oeb;
        this.$message = oKMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SendOkMessageBySendMessageRequestUseCase$execute$2(this.$request, this.this$0, this.$message, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OKMessage> continuation) {
        return ((SendOkMessageBySendMessageRequestUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                return (OKMessage) obj;
            }
            if (i == 2) {
                C56391yDq.AEQbTJ(obj);
                return (OKMessage) obj;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return (OKMessage) obj;
        }
        C56391yDq.AEQbTJ(obj);
        SendMessageRequestParam sendMessageRequestParamCopydefault = this.$request.copydefault();
        if (sendMessageRequestParamCopydefault instanceof SendMessageRequestParam.Text) {
            C35821oEy c35821oEy = this.this$0.KWHzl;
            OKMessage oKMessage = this.$message;
            this.label = 1;
            obj = c35821oEy.EZpvd(oKMessage, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            return (OKMessage) obj;
        }
        if (sendMessageRequestParamCopydefault instanceof SendMessageRequestParam.Sticker) {
            oEF oef = this.this$0.AEQbTJ;
            OKMessage oKMessage2 = this.$message;
            this.label = 2;
            obj = oef.AEQbTJ(oKMessage2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            return (OKMessage) obj;
        }
        if ((sendMessageRequestParamCopydefault instanceof SendMessageRequestParam.ImageOrGif) || (sendMessageRequestParamCopydefault instanceof SendMessageRequestParam.Voice) || (sendMessageRequestParamCopydefault instanceof SendMessageRequestParam.Video) || (sendMessageRequestParamCopydefault instanceof SendMessageRequestParam.File)) {
            C35822oEz c35822oEz = this.this$0.EZpvd;
            OKMessage oKMessage3 = this.$message;
            this.label = 3;
            obj = c35822oEz.copydefault(oKMessage3, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            return (OKMessage) obj;
        }
        throw new NoWhenBranchMatchedException();
    }
}
