package com.okinc.auth.impl.passkey.ui.resetremove.mfa;

import androidx.lifecycle.MutableLiveData;
import com.okinc.auth.api.service.MfaCheckResultResponse;
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
import o.C5763aCc;
import o.C5922aFc;

/* JADX INFO: loaded from: classes3.dex */
public final class ResetRemovePasskeyMfaViewModel$postMfaCheckResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $sessionId;
    Object L$0;
    int label;
    final /* synthetic */ ResetRemovePasskeyMfaViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetRemovePasskeyMfaViewModel$postMfaCheckResult$1(ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel, String str, Continuation<? super ResetRemovePasskeyMfaViewModel$postMfaCheckResult$1> continuation) {
        super(2, continuation);
        this.this$0 = resetRemovePasskeyMfaViewModel;
        this.$sessionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ResetRemovePasskeyMfaViewModel$postMfaCheckResult$1(this.this$0, this.$sessionId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ResetRemovePasskeyMfaViewModel$postMfaCheckResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8552invoke0E7RQCE$default;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
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
                    objM8552invoke0E7RQCE$default = ((Result) obj).m7386unboximpl();
                    mutableSharedFlow = this.this$0.AYXKKw;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.L$0 = objM8552invoke0E7RQCE$default;
                    this.label = 3;
                    if (mutableSharedFlow.emit(boolKWHzl, this) != objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = objM8552invoke0E7RQCE$default;
                    ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel = this.this$0;
                    String str = this.$sessionId;
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
                String str2 = this.$sessionId;
                if (Result.m7384isSuccessimpl(obj2)) {
                    MfaCheckResultResponse mfaCheckResultResponse = (MfaCheckResultResponse) obj2;
                    C5922aFc.log$default(C5922aFc.KWHzl, "[RESET/REMOVE]", null, ResetRemovePasskeyMfaViewModel.Companion.EZpvd() + " check mfa result nextStep: " + (mfaCheckResultResponse != null ? mfaCheckResultResponse.getNextStep() : null), 2, null);
                    String nextStep = mfaCheckResultResponse != null ? mfaCheckResultResponse.getNextStep() : null;
                    if (Intrinsics.EZpvd((Object) nextStep, (Object) "REMOVE_PASSKEY")) {
                        resetRemovePasskeyMfaViewModel3.OLrzqt(str2);
                    } else if (Intrinsics.EZpvd((Object) nextStep, (Object) "RESET_PASSKEY")) {
                        resetRemovePasskeyMfaViewModel3.AEQbTJ(str2, resetRemovePasskeyMfaViewModel3.KWHzl());
                    } else {
                        resetRemovePasskeyMfaViewModel3.djBIcL.setValue("postMfaCheckResult nextStep is " + (mfaCheckResultResponse != null ? mfaCheckResultResponse.getNextStep() : null));
                        Unit unit = Unit.INSTANCE;
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
                    C5922aFc.log$default(c5922aFc, "[RESET/REMOVE]", null, strEZpvd + " postMfaCheckResult() " + message, 2, null);
                    MutableLiveData mutableLiveData = resetRemovePasskeyMfaViewModel22.djBIcL;
                    String message2 = thM7380exceptionOrNullimpl.getMessage();
                    mutableLiveData.setValue(message2 != null ? message2 : "");
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C5763aCc c5763aCc = this.this$0.ejfBZ;
        String str3 = this.$sessionId;
        this.label = 2;
        objM8552invoke0E7RQCE$default = C5763aCc.m8552invoke0E7RQCE$default(c5763aCc, str3, null, this, 2, null);
        if (objM8552invoke0E7RQCE$default == objCopydefault) {
            return objCopydefault;
        }
        mutableSharedFlow = this.this$0.AYXKKw;
        boolKWHzl = C56443yFo.KWHzl(false);
        this.L$0 = objM8552invoke0E7RQCE$default;
        this.label = 3;
        if (mutableSharedFlow.emit(boolKWHzl, this) != objCopydefault) {
        }
    }
}
