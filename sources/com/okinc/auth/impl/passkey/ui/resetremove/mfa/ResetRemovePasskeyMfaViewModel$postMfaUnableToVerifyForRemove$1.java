package com.okinc.auth.impl.passkey.ui.resetremove.mfa;

import androidx.lifecycle.MutableLiveData;
import com.okinc.auth.api.passkey.InitiateMfaSessionResponse;
import com.okinc.auth.impl.passkey.model.PasskeyMfaInitialOperation;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5905aFL;
import o.C5922aFc;

/* JADX INFO: loaded from: classes3.dex */
public final class ResetRemovePasskeyMfaViewModel$postMfaUnableToVerifyForRemove$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ResetRemovePasskeyMfaViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetRemovePasskeyMfaViewModel$postMfaUnableToVerifyForRemove$1(ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel, Continuation<? super ResetRemovePasskeyMfaViewModel$postMfaUnableToVerifyForRemove$1> continuation) {
        super(2, continuation);
        this.this$0 = resetRemovePasskeyMfaViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ResetRemovePasskeyMfaViewModel$postMfaUnableToVerifyForRemove$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ResetRemovePasskeyMfaViewModel$postMfaUnableToVerifyForRemove$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.valueOf.setValue(C56443yFo.KWHzl(false));
            MutableSharedFlow mutableSharedFlow2 = this.this$0.AYXKKw;
            Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
            this.label = 1;
            if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    objKWHzl = ((Result) obj).m7386unboximpl();
                    mutableSharedFlow = this.this$0.AYXKKw;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.L$0 = objKWHzl;
                    this.label = 3;
                    if (mutableSharedFlow.emit(boolKWHzl, this) != objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = objKWHzl;
                    ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel = this.this$0;
                    if (Result.m7384isSuccessimpl(obj2)) {
                    }
                    ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel2 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel3 = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                    InitiateMfaSessionResponse initiateMfaSessionResponse = (InitiateMfaSessionResponse) obj2;
                    C5922aFc.log$default(C5922aFc.KWHzl, "[RESET/REMOVE]", null, ResetRemovePasskeyMfaViewModel.Companion.EZpvd() + " init mfa nextStep: " + (initiateMfaSessionResponse != null ? initiateMfaSessionResponse.getNextStep() : null), 2, null);
                    if (!Intrinsics.EZpvd((Object) (initiateMfaSessionResponse != null ? initiateMfaSessionResponse.getNextStep() : null), (Object) "MFA_VERIFICATION")) {
                        resetRemovePasskeyMfaViewModel3.djBIcL.setValue("postMfaUnableToVerifyForRemove mfaInitUseCase nextStep is " + (initiateMfaSessionResponse != null ? initiateMfaSessionResponse.getNextStep() : null));
                    } else {
                        String business = initiateMfaSessionResponse.getBusiness();
                        if (business == null) {
                            business = "";
                        }
                        resetRemovePasskeyMfaViewModel3.AEQbTJ(business);
                    }
                }
                ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel22 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    C5922aFc c5922aFc = C5922aFc.KWHzl;
                    String strEZpvd = ResetRemovePasskeyMfaViewModel.Companion.EZpvd();
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    C5922aFc.log$default(c5922aFc, "[RESET/REMOVE]", null, strEZpvd + " postMfaUnableToVerifyForRemove() " + message, 2, null);
                    MutableLiveData mutableLiveData = resetRemovePasskeyMfaViewModel22.djBIcL;
                    String message2 = thM7380exceptionOrNullimpl.getMessage();
                    mutableLiveData.setValue(message2 != null ? message2 : "");
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C5905aFL c5905aFL = this.this$0.iwGUEr;
        String string = PasskeyMfaInitialOperation.RESET_NO_REBIND.toString();
        this.label = 2;
        objKWHzl = c5905aFL.KWHzl(string, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        mutableSharedFlow = this.this$0.AYXKKw;
        boolKWHzl = C56443yFo.KWHzl(false);
        this.L$0 = objKWHzl;
        this.label = 3;
        if (mutableSharedFlow.emit(boolKWHzl, this) != objCopydefault) {
        }
    }
}
