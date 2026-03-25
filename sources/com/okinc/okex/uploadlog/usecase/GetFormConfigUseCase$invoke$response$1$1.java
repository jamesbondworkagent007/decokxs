package com.okinc.okex.uploadlog.usecase;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.uploadlog.bean.TicketFormResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44085sCu;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC45301snH;

/* JADX INFO: loaded from: classes10.dex */
public final class GetFormConfigUseCase$invoke$response$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<TicketFormResponse>>, Object> {
    final /* synthetic */ String $formId;
    final /* synthetic */ C44085sCu $this_runOrErrorResponse;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFormConfigUseCase$invoke$response$1$1(C44085sCu c44085sCu, String str, Continuation<? super GetFormConfigUseCase$invoke$response$1$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = c44085sCu;
        this.$formId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetFormConfigUseCase$invoke$response$1$1(this.$this_runOrErrorResponse, this.$formId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<TicketFormResponse>> continuation) {
        return ((GetFormConfigUseCase$invoke$response$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC45301snH interfaceC45301snH = this.$this_runOrErrorResponse.KWHzl;
            String str = this.$formId;
            this.label = 1;
            obj = InterfaceC45301snH.Application.getAssistantTicketForm$default(interfaceC45301snH, str, null, null, this, 6, null);
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
