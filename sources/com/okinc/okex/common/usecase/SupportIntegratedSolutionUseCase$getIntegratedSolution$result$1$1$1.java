package com.okinc.okex.common.usecase;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.center.bean.IntegratedSolutionResponse;
import com.okinc.okex.center.bean.enums.IntegratedSolutionPageType;
import com.okinc.okex.center.bean.enums.TransactionType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C45352soF;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44921sfz;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportIntegratedSolutionUseCase$getIntegratedSolution$result$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<IntegratedSolutionResponse>>, Object> {
    final /* synthetic */ String $id;
    final /* synthetic */ C45352soF $this_runOrErrorResponse;
    final /* synthetic */ TransactionType $transactionType;
    final /* synthetic */ IntegratedSolutionPageType $type;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportIntegratedSolutionUseCase$getIntegratedSolution$result$1$1$1(C45352soF c45352soF, IntegratedSolutionPageType integratedSolutionPageType, TransactionType transactionType, String str, Continuation<? super SupportIntegratedSolutionUseCase$getIntegratedSolution$result$1$1$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = c45352soF;
        this.$type = integratedSolutionPageType;
        this.$transactionType = transactionType;
        this.$id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportIntegratedSolutionUseCase$getIntegratedSolution$result$1$1$1(this.$this_runOrErrorResponse, this.$type, this.$transactionType, this.$id, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<IntegratedSolutionResponse>> continuation) {
        return ((SupportIntegratedSolutionUseCase$getIntegratedSolution$result$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC44921sfz interfaceC44921sfz = this.$this_runOrErrorResponse.KWHzl;
            IntegratedSolutionPageType integratedSolutionPageType = this.$type;
            TransactionType transactionType = this.$transactionType;
            String str = this.$id;
            this.label = 1;
            obj = interfaceC44921sfz.copydefault(integratedSolutionPageType, transactionType, str, this);
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
