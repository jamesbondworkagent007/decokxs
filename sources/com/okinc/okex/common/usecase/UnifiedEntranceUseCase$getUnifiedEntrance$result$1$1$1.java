package com.okinc.okex.common.usecase;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.common.bean.UnifiedEntranceRequest;
import com.okinc.okex.common.bean.UnifiedEntranceResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C45354soH;
import o.C56391yDq;
import o.C56442yFn;
import o.C6811aWS;
import o.InterfaceC45301snH;

/* JADX INFO: loaded from: classes10.dex */
public final class UnifiedEntranceUseCase$getUnifiedEntrance$result$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<UnifiedEntranceResponse>>, Object> {
    final /* synthetic */ C6811aWS $request;
    final /* synthetic */ C45354soH $this_runOrErrorResponse;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedEntranceUseCase$getUnifiedEntrance$result$1$1$1(C45354soH c45354soH, C6811aWS c6811aWS, Continuation<? super UnifiedEntranceUseCase$getUnifiedEntrance$result$1$1$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = c45354soH;
        this.$request = c6811aWS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnifiedEntranceUseCase$getUnifiedEntrance$result$1$1$1(this.$this_runOrErrorResponse, this.$request, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<UnifiedEntranceResponse>> continuation) {
        return ((UnifiedEntranceUseCase$getUnifiedEntrance$result$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC45301snH interfaceC45301snH = this.$this_runOrErrorResponse.AEQbTJ;
            UnifiedEntranceRequest unifiedEntranceRequest = new UnifiedEntranceRequest(this.$request.KWHzl(), this.$request.OLrzqt());
            this.label = 1;
            obj = interfaceC45301snH.copydefault(unifiedEntranceRequest, this);
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
