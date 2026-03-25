package com.okinc.okex.uploadlog.usecase;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.uploadlog.bean.TicketAttachmentResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44086sCv;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC45301snH;
import okhttp3.MultipartBody;

/* JADX INFO: loaded from: classes10.dex */
public final class UploadAttachmentUseCase$uploadFile$result$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<TicketAttachmentResponse>>, Object> {
    final /* synthetic */ MultipartBody.Part $filePart;
    final /* synthetic */ C44086sCv $this_runOrErrorResponse;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadAttachmentUseCase$uploadFile$result$1$1$1(C44086sCv c44086sCv, MultipartBody.Part part, Continuation<? super UploadAttachmentUseCase$uploadFile$result$1$1$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = c44086sCv;
        this.$filePart = part;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UploadAttachmentUseCase$uploadFile$result$1$1$1(this.$this_runOrErrorResponse, this.$filePart, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<TicketAttachmentResponse>> continuation) {
        return ((UploadAttachmentUseCase$uploadFile$result$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC45301snH interfaceC45301snH = this.$this_runOrErrorResponse.AEQbTJ;
            MultipartBody.Part part = this.$filePart;
            this.label = 1;
            obj = InterfaceC45301snH.Application.uploadAssistantTicketAttachment$default(interfaceC45301snH, 0, 0, part, this, 3, null);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
