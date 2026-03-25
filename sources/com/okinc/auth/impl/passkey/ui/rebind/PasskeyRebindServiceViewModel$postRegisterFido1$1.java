package com.okinc.auth.impl.passkey.ui.rebind;

import com.okinc.auth.impl.passkey.model.PasskeyRebindFinishResponse;
import com.okinc.auth.impl.passkey.model.RegistrationFinishBody;
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
import o.C5909aFP;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyRebindServiceViewModel$postRegisterFido1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RegistrationFinishBody $body;
    Object L$0;
    int label;
    final /* synthetic */ PasskeyRebindServiceViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyRebindServiceViewModel$postRegisterFido1$1(PasskeyRebindServiceViewModel passkeyRebindServiceViewModel, RegistrationFinishBody registrationFinishBody, Continuation<? super PasskeyRebindServiceViewModel$postRegisterFido1$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeyRebindServiceViewModel;
        this.$body = registrationFinishBody;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyRebindServiceViewModel$postRegisterFido1$1(this.this$0, this.$body, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyRebindServiceViewModel$postRegisterFido1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C5909aFP c5909aFP = this.this$0.AuCTelauCTel;
            RegistrationFinishBody registrationFinishBody = this.$body;
            String str = (String) this.this$0.AuCTel.getValue();
            if (str == null) {
                str = "";
            }
            int iGEmmrt = this.this$0.gEmmrt();
            this.label = 1;
            objEZpvd = c5909aFP.EZpvd(registrationFinishBody, str, iGEmmrt, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                PasskeyRebindServiceViewModel passkeyRebindServiceViewModel = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableSharedFlow mutableSharedFlow = passkeyRebindServiceViewModel.ejfBZ;
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    String str2 = message != null ? message : "";
                    this.L$0 = obj2;
                    this.label = 3;
                    if (mutableSharedFlow.emit(str2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        obj2 = objEZpvd;
        PasskeyRebindServiceViewModel passkeyRebindServiceViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(obj2)) {
            PasskeyRebindFinishResponse passkeyRebindFinishResponse = (PasskeyRebindFinishResponse) obj2;
            MutableSharedFlow mutableSharedFlow2 = passkeyRebindServiceViewModel2.isConnected;
            String strCopydefault = passkeyRebindFinishResponse.copydefault();
            if (strCopydefault == null) {
                strCopydefault = "";
            }
            String strAEQbTJ = passkeyRebindFinishResponse.AEQbTJ();
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            Pair pairOLrzqt = C56390yDp.OLrzqt(strCopydefault, strAEQbTJ);
            this.L$0 = obj2;
            this.label = 2;
            if (mutableSharedFlow2.emit(pairOLrzqt, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        PasskeyRebindServiceViewModel passkeyRebindServiceViewModel3 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
