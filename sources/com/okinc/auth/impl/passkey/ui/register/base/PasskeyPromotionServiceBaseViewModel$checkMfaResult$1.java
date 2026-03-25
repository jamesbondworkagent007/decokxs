package com.okinc.auth.impl.passkey.ui.register.base;

import com.okinc.auth.api.service.MfaCheckResultResponse;
import com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseViewModel;
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
public final class PasskeyPromotionServiceBaseViewModel$checkMfaResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $sessionId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PasskeyPromotionServiceBaseViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyPromotionServiceBaseViewModel$checkMfaResult$1(PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel, String str, Continuation<? super PasskeyPromotionServiceBaseViewModel$checkMfaResult$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeyPromotionServiceBaseViewModel;
        this.$sessionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyPromotionServiceBaseViewModel$checkMfaResult$1(this.this$0, this.$sessionId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyPromotionServiceBaseViewModel$checkMfaResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0131 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c9 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8552invoke0E7RQCE$default;
        Object obj2;
        PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel2;
        Throwable thM7380exceptionOrNullimpl;
        Object obj3;
        MutableSharedFlow mutableSharedFlow2;
        Boolean boolKWHzl2;
        MutableSharedFlow mutableSharedFlow3;
        Boolean boolKWHzl3;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow mutableSharedFlow4 = this.this$0.gEmmrt;
                Boolean boolKWHzl4 = C56443yFo.KWHzl(true);
                this.label = 1;
                if (mutableSharedFlow4.emit(boolKWHzl4, this) == objCopydefault) {
                    return objCopydefault;
                }
                this.this$0.isConnected.setValue(new PasskeyPromotionServiceBaseViewModel.Request("", this.$sessionId));
                C5763aCc c5763aCc = this.this$0.hDKMBd;
                String str = this.$sessionId;
                this.label = 2;
                objM8552invoke0E7RQCE$default = C5763aCc.m8552invoke0E7RQCE$default(c5763aCc, str, null, this, 2, null);
                if (objM8552invoke0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
                obj2 = objM8552invoke0E7RQCE$default;
                passkeyPromotionServiceBaseViewModel = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                    MfaCheckResultResponse mfaCheckResultResponse = (MfaCheckResultResponse) obj2;
                    C5922aFc c5922aFc = C5922aFc.KWHzl;
                    C5922aFc.log$default(c5922aFc, "[REGISTER]", null, "check mfa: nextStep: " + (mfaCheckResultResponse != null ? mfaCheckResultResponse.getNextStep() : null), 2, null);
                    if (Intrinsics.EZpvd((Object) (mfaCheckResultResponse != null ? mfaCheckResultResponse.getNextStep() : null), (Object) "REG_PASSKEY")) {
                        this.L$0 = obj2;
                        this.L$1 = passkeyPromotionServiceBaseViewModel;
                        this.label = 3;
                        obj = passkeyPromotionServiceBaseViewModel.copydefault(this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                        if (!((Boolean) obj).booleanValue()) {
                            MutableSharedFlow mutableSharedFlow5 = passkeyPromotionServiceBaseViewModel.djBIcL;
                            Unit unit = Unit.INSTANCE;
                            this.L$0 = obj2;
                            this.L$1 = passkeyPromotionServiceBaseViewModel;
                            this.label = 4;
                            if (mutableSharedFlow5.emit(unit, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            MutableSharedFlow mutableSharedFlow6 = passkeyPromotionServiceBaseViewModel.uzCIH;
                            this.L$0 = obj2;
                            this.L$1 = passkeyPromotionServiceBaseViewModel;
                            this.label = 5;
                            if (mutableSharedFlow6.emit("passkey incompatible", this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        mutableSharedFlow = passkeyPromotionServiceBaseViewModel.gEmmrt;
                        boolKWHzl = C56443yFo.KWHzl(false);
                        this.L$0 = obj2;
                        this.L$1 = null;
                        this.label = 6;
                        if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        C5922aFc.log$default(c5922aFc, "[REGISTER]", null, "check mfa: nextStep: steps not handled", 2, null);
                        MutableSharedFlow mutableSharedFlow7 = passkeyPromotionServiceBaseViewModel.uzCIH;
                        String strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.DPHNDa);
                        this.L$0 = obj2;
                        this.L$1 = passkeyPromotionServiceBaseViewModel;
                        this.label = 7;
                        if (mutableSharedFlow7.emit(strAYXKKw, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        mutableSharedFlow2 = passkeyPromotionServiceBaseViewModel.gEmmrt;
                        boolKWHzl2 = C56443yFo.KWHzl(false);
                        this.L$0 = obj2;
                        this.L$1 = null;
                        this.label = 8;
                        if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                passkeyPromotionServiceBaseViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, "check mfa: " + thM7380exceptionOrNullimpl.getMessage(), 2, null);
                    MutableSharedFlow mutableSharedFlow8 = passkeyPromotionServiceBaseViewModel2.uzCIH;
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    String str2 = message != null ? message : "";
                    this.L$0 = obj2;
                    this.L$1 = passkeyPromotionServiceBaseViewModel2;
                    this.label = 9;
                    if (mutableSharedFlow8.emit(str2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    obj3 = obj2;
                    mutableSharedFlow3 = passkeyPromotionServiceBaseViewModel2.gEmmrt;
                    boolKWHzl3 = C56443yFo.KWHzl(false);
                    this.L$0 = obj3;
                    this.L$1 = null;
                    this.label = 10;
                    if (mutableSharedFlow3.emit(boolKWHzl3, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                this.this$0.isConnected.setValue(new PasskeyPromotionServiceBaseViewModel.Request("", this.$sessionId));
                C5763aCc c5763aCc2 = this.this$0.hDKMBd;
                String str3 = this.$sessionId;
                this.label = 2;
                objM8552invoke0E7RQCE$default = C5763aCc.m8552invoke0E7RQCE$default(c5763aCc2, str3, null, this, 2, null);
                if (objM8552invoke0E7RQCE$default == objCopydefault) {
                }
                obj2 = objM8552invoke0E7RQCE$default;
                passkeyPromotionServiceBaseViewModel = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                }
                passkeyPromotionServiceBaseViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 2:
                C56391yDq.AEQbTJ(obj);
                objM8552invoke0E7RQCE$default = ((Result) obj).m7386unboximpl();
                obj2 = objM8552invoke0E7RQCE$default;
                passkeyPromotionServiceBaseViewModel = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                }
                passkeyPromotionServiceBaseViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 3:
                passkeyPromotionServiceBaseViewModel = (PasskeyPromotionServiceBaseViewModel) this.L$1;
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (!((Boolean) obj).booleanValue()) {
                }
                mutableSharedFlow = passkeyPromotionServiceBaseViewModel.gEmmrt;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = obj2;
                this.L$1 = null;
                this.label = 6;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                passkeyPromotionServiceBaseViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 4:
            case 5:
                passkeyPromotionServiceBaseViewModel = (PasskeyPromotionServiceBaseViewModel) this.L$1;
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow = passkeyPromotionServiceBaseViewModel.gEmmrt;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = obj2;
                this.L$1 = null;
                this.label = 6;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                passkeyPromotionServiceBaseViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 6:
            case 8:
                Object obj4 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                obj2 = obj4;
                passkeyPromotionServiceBaseViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 7:
                passkeyPromotionServiceBaseViewModel = (PasskeyPromotionServiceBaseViewModel) this.L$1;
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow2 = passkeyPromotionServiceBaseViewModel.gEmmrt;
                boolKWHzl2 = C56443yFo.KWHzl(false);
                this.L$0 = obj2;
                this.L$1 = null;
                this.label = 8;
                if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                }
                passkeyPromotionServiceBaseViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 9:
                passkeyPromotionServiceBaseViewModel2 = (PasskeyPromotionServiceBaseViewModel) this.L$1;
                obj3 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow3 = passkeyPromotionServiceBaseViewModel2.gEmmrt;
                boolKWHzl3 = C56443yFo.KWHzl(false);
                this.L$0 = obj3;
                this.L$1 = null;
                this.label = 10;
                if (mutableSharedFlow3.emit(boolKWHzl3, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 10:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
