package com.okinc.auth.impl.passkey.ui.resetremove.selection;

import com.okinc.auth.impl.passkey.model.GetAuthenticatorListResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC32955mnO;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHO;

/* JADX INFO: loaded from: classes3.dex */
public final class BatchResetRemovePasskeyViewModel$refreshAuthenticatorList$3 extends SuspendLambda implements yHO<FlowCollector<? super AbstractC32955mnO<GetAuthenticatorListResponse>>, Throwable, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BatchResetRemovePasskeyViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatchResetRemovePasskeyViewModel$refreshAuthenticatorList$3(BatchResetRemovePasskeyViewModel batchResetRemovePasskeyViewModel, Continuation<? super BatchResetRemovePasskeyViewModel$refreshAuthenticatorList$3> continuation) {
        super(3, continuation);
        this.this$0 = batchResetRemovePasskeyViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super AbstractC32955mnO<GetAuthenticatorListResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return new BatchResetRemovePasskeyViewModel$refreshAuthenticatorList$3(this.this$0, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow = this.this$0.AEQbTJ;
            Boolean boolKWHzl = C56443yFo.KWHzl(false);
            this.label = 1;
            if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
