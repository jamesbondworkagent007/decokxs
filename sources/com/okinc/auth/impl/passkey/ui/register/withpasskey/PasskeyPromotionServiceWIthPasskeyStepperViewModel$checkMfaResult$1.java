package com.okinc.auth.impl.passkey.ui.register.withpasskey;

import com.okinc.auth.api.service.MfaCheckResultResponse;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5763aCc;
import o.C5922aFc;
import o.C8206ayP;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyPromotionServiceWIthPasskeyStepperViewModel$checkMfaResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $sessionId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PasskeyPromotionServiceWIthPasskeyStepperViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyPromotionServiceWIthPasskeyStepperViewModel$checkMfaResult$1(PasskeyPromotionServiceWIthPasskeyStepperViewModel passkeyPromotionServiceWIthPasskeyStepperViewModel, String str, Continuation<? super PasskeyPromotionServiceWIthPasskeyStepperViewModel$checkMfaResult$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeyPromotionServiceWIthPasskeyStepperViewModel;
        this.$sessionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyPromotionServiceWIthPasskeyStepperViewModel$checkMfaResult$1(this.this$0, this.$sessionId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyPromotionServiceWIthPasskeyStepperViewModel$checkMfaResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0161 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8552invoke0E7RQCE$default;
        PasskeyPromotionServiceWIthPasskeyStepperViewModel passkeyPromotionServiceWIthPasskeyStepperViewModel;
        Object obj2;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object obj3;
        PasskeyPromotionServiceWIthPasskeyStepperViewModel passkeyPromotionServiceWIthPasskeyStepperViewModel2;
        Throwable thM7380exceptionOrNullimpl;
        MutableSharedFlow mutableSharedFlow2;
        Boolean boolKWHzl2;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow mutableSharedFlow3 = this.this$0.EZpvd;
                Boolean boolKWHzl3 = C56443yFo.KWHzl(true);
                this.label = 1;
                if (mutableSharedFlow3.emit(boolKWHzl3, this) == objCopydefault) {
                    return objCopydefault;
                }
                C5763aCc c5763aCc = this.this$0.djBIcL;
                String str = this.$sessionId;
                this.label = 2;
                objM8552invoke0E7RQCE$default = C5763aCc.m8552invoke0E7RQCE$default(c5763aCc, str, null, this, 2, null);
                if (objM8552invoke0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
                passkeyPromotionServiceWIthPasskeyStepperViewModel = this.this$0;
                String str2 = this.$sessionId;
                if (Result.m7384isSuccessimpl(objM8552invoke0E7RQCE$default)) {
                    MfaCheckResultResponse mfaCheckResultResponse = (MfaCheckResultResponse) objM8552invoke0E7RQCE$default;
                    if (Intrinsics.EZpvd((Object) (mfaCheckResultResponse != null ? mfaCheckResultResponse.getNextStep() : null), (Object) "REG_PASSKEY")) {
                        C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, "PasskeyPromotionServiceWIthPasskeyStepperViewModel mfa check result success", 2, null);
                        MutableSharedFlow mutableSharedFlow4 = passkeyPromotionServiceWIthPasskeyStepperViewModel.AhwBna;
                        this.L$0 = objM8552invoke0E7RQCE$default;
                        this.L$1 = passkeyPromotionServiceWIthPasskeyStepperViewModel;
                        this.label = 3;
                        if (mutableSharedFlow4.emit(str2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, "PasskeyPromotionServiceWIthPasskeyStepperViewModel mfa check result nextStep: " + (mfaCheckResultResponse != null ? mfaCheckResultResponse.getNextStep() : null), 2, null);
                        MutableSharedFlow mutableSharedFlow5 = passkeyPromotionServiceWIthPasskeyStepperViewModel.AYXKKw;
                        String strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.DPHNDa);
                        this.L$0 = objM8552invoke0E7RQCE$default;
                        this.L$1 = passkeyPromotionServiceWIthPasskeyStepperViewModel;
                        this.label = 4;
                        if (mutableSharedFlow5.emit(strAYXKKw, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    mutableSharedFlow = passkeyPromotionServiceWIthPasskeyStepperViewModel.EZpvd;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.L$0 = objM8552invoke0E7RQCE$default;
                    this.L$1 = null;
                    this.label = 5;
                    if (mutableSharedFlow.emit(boolKWHzl, this) != objCopydefault) {
                        return objCopydefault;
                    }
                    obj3 = objM8552invoke0E7RQCE$default;
                    obj2 = obj3;
                    passkeyPromotionServiceWIthPasskeyStepperViewModel2 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl != null) {
                        C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, "PasskeyPromotionServiceWIthPasskeyStepperViewModel mfa check result exception: " + thM7380exceptionOrNullimpl.getMessage(), 2, null);
                        MutableSharedFlow mutableSharedFlow6 = passkeyPromotionServiceWIthPasskeyStepperViewModel2.AYXKKw;
                        String message = thM7380exceptionOrNullimpl.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        this.L$0 = obj2;
                        this.L$1 = passkeyPromotionServiceWIthPasskeyStepperViewModel2;
                        this.label = 6;
                        if (mutableSharedFlow6.emit(message, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        mutableSharedFlow2 = passkeyPromotionServiceWIthPasskeyStepperViewModel2.EZpvd;
                        boolKWHzl2 = C56443yFo.KWHzl(false);
                        this.L$0 = obj2;
                        this.L$1 = null;
                        this.label = 7;
                        if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                obj2 = objM8552invoke0E7RQCE$default;
                passkeyPromotionServiceWIthPasskeyStepperViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                C5763aCc c5763aCc2 = this.this$0.djBIcL;
                String str3 = this.$sessionId;
                this.label = 2;
                objM8552invoke0E7RQCE$default = C5763aCc.m8552invoke0E7RQCE$default(c5763aCc2, str3, null, this, 2, null);
                if (objM8552invoke0E7RQCE$default == objCopydefault) {
                }
                passkeyPromotionServiceWIthPasskeyStepperViewModel = this.this$0;
                String str22 = this.$sessionId;
                if (Result.m7384isSuccessimpl(objM8552invoke0E7RQCE$default)) {
                }
                break;
            case 2:
                C56391yDq.AEQbTJ(obj);
                objM8552invoke0E7RQCE$default = ((Result) obj).m7386unboximpl();
                passkeyPromotionServiceWIthPasskeyStepperViewModel = this.this$0;
                String str222 = this.$sessionId;
                if (Result.m7384isSuccessimpl(objM8552invoke0E7RQCE$default)) {
                }
                break;
            case 3:
            case 4:
                passkeyPromotionServiceWIthPasskeyStepperViewModel = (PasskeyPromotionServiceWIthPasskeyStepperViewModel) this.L$1;
                Object obj4 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM8552invoke0E7RQCE$default = obj4;
                mutableSharedFlow = passkeyPromotionServiceWIthPasskeyStepperViewModel.EZpvd;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = objM8552invoke0E7RQCE$default;
                this.L$1 = null;
                this.label = 5;
                if (mutableSharedFlow.emit(boolKWHzl, this) != objCopydefault) {
                }
                break;
            case 5:
                obj3 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                obj2 = obj3;
                passkeyPromotionServiceWIthPasskeyStepperViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 6:
                passkeyPromotionServiceWIthPasskeyStepperViewModel2 = (PasskeyPromotionServiceWIthPasskeyStepperViewModel) this.L$1;
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow2 = passkeyPromotionServiceWIthPasskeyStepperViewModel2.EZpvd;
                boolKWHzl2 = C56443yFo.KWHzl(false);
                this.L$0 = obj2;
                this.L$1 = null;
                this.label = 7;
                if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 7:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
