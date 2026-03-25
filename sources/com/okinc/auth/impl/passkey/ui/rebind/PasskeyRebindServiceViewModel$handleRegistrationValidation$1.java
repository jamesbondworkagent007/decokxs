package com.okinc.auth.impl.passkey.ui.rebind;

import com.okinc.auth.impl.passkey.model.PasskeyRebindFinishResponse;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyRebindServiceViewModel$handleRegistrationValidation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Object $response;
    Object L$0;
    int label;
    final /* synthetic */ PasskeyRebindServiceViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyRebindServiceViewModel$handleRegistrationValidation$1(Object obj, PasskeyRebindServiceViewModel passkeyRebindServiceViewModel, Continuation<? super PasskeyRebindServiceViewModel$handleRegistrationValidation$1> continuation) {
        super(2, continuation);
        this.$response = obj;
        this.this$0 = passkeyRebindServiceViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyRebindServiceViewModel$handleRegistrationValidation$1(this.$response, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyRebindServiceViewModel$handleRegistrationValidation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            obj2 = this.$response;
            PasskeyRebindServiceViewModel passkeyRebindServiceViewModel = this.this$0;
            if (Result.m7384isSuccessimpl(obj2)) {
                PasskeyRebindFinishResponse passkeyRebindFinishResponse = (PasskeyRebindFinishResponse) obj2;
                MutableSharedFlow mutableSharedFlow = passkeyRebindServiceViewModel.isConnected;
                String strCopydefault = passkeyRebindFinishResponse != null ? passkeyRebindFinishResponse.copydefault() : null;
                if (strCopydefault == null) {
                    strCopydefault = "";
                }
                String strAEQbTJ = passkeyRebindFinishResponse != null ? passkeyRebindFinishResponse.AEQbTJ() : null;
                if (strAEQbTJ == null) {
                    strAEQbTJ = "";
                }
                Pair pairOLrzqt = C56390yDp.OLrzqt(strCopydefault, strAEQbTJ);
                this.L$0 = obj2;
                this.label = 1;
                if (mutableSharedFlow.emit(pairOLrzqt, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            obj2 = this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        PasskeyRebindServiceViewModel passkeyRebindServiceViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
        if (thM7380exceptionOrNullimpl != null) {
            MutableSharedFlow mutableSharedFlow2 = passkeyRebindServiceViewModel2.ejfBZ;
            String message = thM7380exceptionOrNullimpl.getMessage();
            String str = message != null ? message : "";
            this.L$0 = obj2;
            this.label = 2;
            if (mutableSharedFlow2.emit(str, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
