package com.okinc.auth.impl.passkey.ui.register.withpasskey;

import com.okinc.auth.api.passkey.InitiateMfaSessionResponse;
import com.okinc.auth.api.service.MfaCreateSessionRequest;
import com.okinc.auth.api.service.MfaCreateSessionResponse;
import com.okinc.auth.impl.passkey.model.PasskeyMfaInitialOperation;
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
import o.C5765aCe;
import o.C5905aFL;
import o.C5922aFc;
import o.C8206ayP;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyPromotionServiceWIthPasskeyStepperViewModel$proceedMfa$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PasskeyPromotionServiceWIthPasskeyStepperViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyPromotionServiceWIthPasskeyStepperViewModel$proceedMfa$1(PasskeyPromotionServiceWIthPasskeyStepperViewModel passkeyPromotionServiceWIthPasskeyStepperViewModel, Continuation<? super PasskeyPromotionServiceWIthPasskeyStepperViewModel$proceedMfa$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeyPromotionServiceWIthPasskeyStepperViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyPromotionServiceWIthPasskeyStepperViewModel$proceedMfa$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyPromotionServiceWIthPasskeyStepperViewModel$proceedMfa$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x025c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        InitiateMfaSessionResponse initiateMfaSessionResponse;
        Object obj2;
        PasskeyPromotionServiceWIthPasskeyStepperViewModel passkeyPromotionServiceWIthPasskeyStepperViewModel;
        Object obj3;
        PasskeyPromotionServiceWIthPasskeyStepperViewModel passkeyPromotionServiceWIthPasskeyStepperViewModel2;
        String business;
        Object objOLrzqt;
        PasskeyPromotionServiceWIthPasskeyStepperViewModel passkeyPromotionServiceWIthPasskeyStepperViewModel3;
        Object obj4;
        Object obj5;
        Throwable thM7380exceptionOrNullimpl;
        PasskeyPromotionServiceWIthPasskeyStepperViewModel passkeyPromotionServiceWIthPasskeyStepperViewModel4;
        Object obj6;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object obj7;
        PasskeyPromotionServiceWIthPasskeyStepperViewModel passkeyPromotionServiceWIthPasskeyStepperViewModel5;
        Throwable thM7380exceptionOrNullimpl2;
        MutableSharedFlow mutableSharedFlow2;
        String strAYXKKw;
        MutableSharedFlow mutableSharedFlow3;
        Boolean boolKWHzl2;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow mutableSharedFlow4 = this.this$0.EZpvd;
                Boolean boolKWHzl3 = C56443yFo.KWHzl(true);
                this.label = 1;
                if (mutableSharedFlow4.emit(boolKWHzl3, this) == objCopydefault) {
                    return objCopydefault;
                }
                C5905aFL c5905aFL = this.this$0.AuCTel;
                String string = PasskeyMfaInitialOperation.REG.toString();
                this.label = 2;
                objKWHzl = c5905aFL.KWHzl(string, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                PasskeyPromotionServiceWIthPasskeyStepperViewModel passkeyPromotionServiceWIthPasskeyStepperViewModel6 = this.this$0;
                if (Result.m7384isSuccessimpl(objKWHzl)) {
                    initiateMfaSessionResponse = (InitiateMfaSessionResponse) objKWHzl;
                    if (Intrinsics.EZpvd((Object) (initiateMfaSessionResponse != null ? initiateMfaSessionResponse.getNextStep() : null), (Object) "MFA_VERIFICATION")) {
                        MutableSharedFlow mutableSharedFlow5 = passkeyPromotionServiceWIthPasskeyStepperViewModel6.EZpvd;
                        Boolean boolKWHzl4 = C56443yFo.KWHzl(true);
                        this.L$0 = objKWHzl;
                        this.L$1 = passkeyPromotionServiceWIthPasskeyStepperViewModel6;
                        this.L$2 = initiateMfaSessionResponse;
                        this.label = 3;
                        if (mutableSharedFlow5.emit(boolKWHzl4, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        obj3 = objKWHzl;
                        passkeyPromotionServiceWIthPasskeyStepperViewModel2 = passkeyPromotionServiceWIthPasskeyStepperViewModel6;
                        C5765aCe c5765aCe = passkeyPromotionServiceWIthPasskeyStepperViewModel2.AkhnZx;
                        business = initiateMfaSessionResponse.getBusiness();
                        if (business == null) {
                            business = "";
                        }
                        MfaCreateSessionRequest mfaCreateSessionRequest = new MfaCreateSessionRequest(business);
                        this.L$0 = obj3;
                        this.L$1 = passkeyPromotionServiceWIthPasskeyStepperViewModel2;
                        this.L$2 = null;
                        this.label = 4;
                        objOLrzqt = c5765aCe.OLrzqt(mfaCreateSessionRequest, this);
                        if (objOLrzqt == objCopydefault) {
                            return objCopydefault;
                        }
                        Object obj8 = obj3;
                        passkeyPromotionServiceWIthPasskeyStepperViewModel3 = passkeyPromotionServiceWIthPasskeyStepperViewModel2;
                        obj4 = objOLrzqt;
                        obj5 = obj8;
                        if (Result.m7384isSuccessimpl(obj4)) {
                            C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, "PasskeyPromotionServiceWIthPasskeyStepperViewModel mfa create session success", 2, null);
                            MutableSharedFlow mutableSharedFlow6 = passkeyPromotionServiceWIthPasskeyStepperViewModel3.gEmmrt;
                            String sessionId = ((MfaCreateSessionResponse) obj4).getSessionId();
                            if (sessionId == null) {
                                sessionId = "";
                            }
                            this.L$0 = obj5;
                            this.L$1 = passkeyPromotionServiceWIthPasskeyStepperViewModel3;
                            this.L$2 = obj4;
                            this.label = 5;
                            if (mutableSharedFlow6.emit(sessionId, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj4);
                        if (thM7380exceptionOrNullimpl != null) {
                            objKWHzl = obj5;
                            mutableSharedFlow = passkeyPromotionServiceWIthPasskeyStepperViewModel3.EZpvd;
                            boolKWHzl = C56443yFo.KWHzl(false);
                            this.L$0 = objKWHzl;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 7;
                            if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                            }
                        } else {
                            C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, "PasskeyPromotionServiceWIthPasskeyStepperViewModel mfa create session error: " + thM7380exceptionOrNullimpl.getMessage(), 2, null);
                            MutableSharedFlow mutableSharedFlow7 = passkeyPromotionServiceWIthPasskeyStepperViewModel3.AYXKKw;
                            String message = thM7380exceptionOrNullimpl.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            this.L$0 = obj5;
                            this.L$1 = passkeyPromotionServiceWIthPasskeyStepperViewModel3;
                            this.L$2 = obj4;
                            this.label = 6;
                            if (mutableSharedFlow7.emit(message, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            passkeyPromotionServiceWIthPasskeyStepperViewModel4 = passkeyPromotionServiceWIthPasskeyStepperViewModel3;
                            obj6 = obj5;
                            Object obj9 = obj6;
                            passkeyPromotionServiceWIthPasskeyStepperViewModel3 = passkeyPromotionServiceWIthPasskeyStepperViewModel4;
                            objKWHzl = obj9;
                            mutableSharedFlow = passkeyPromotionServiceWIthPasskeyStepperViewModel3.EZpvd;
                            boolKWHzl = C56443yFo.KWHzl(false);
                            this.L$0 = objKWHzl;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 7;
                            if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                    } else {
                        C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, "PasskeyPromotionServiceWIthPasskeyStepperViewModel mfa init nextStep: " + (initiateMfaSessionResponse != null ? initiateMfaSessionResponse.getNextStep() : null), 2, null);
                        MutableSharedFlow mutableSharedFlow8 = passkeyPromotionServiceWIthPasskeyStepperViewModel6.EZpvd;
                        Boolean boolKWHzl5 = C56443yFo.KWHzl(false);
                        this.L$0 = objKWHzl;
                        this.L$1 = passkeyPromotionServiceWIthPasskeyStepperViewModel6;
                        this.label = 8;
                        if (mutableSharedFlow8.emit(boolKWHzl5, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        obj2 = objKWHzl;
                        passkeyPromotionServiceWIthPasskeyStepperViewModel = passkeyPromotionServiceWIthPasskeyStepperViewModel6;
                        mutableSharedFlow2 = passkeyPromotionServiceWIthPasskeyStepperViewModel.AYXKKw;
                        strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.DPHNDa);
                        this.L$0 = obj2;
                        this.L$1 = null;
                        this.label = 9;
                        if (mutableSharedFlow2.emit(strAYXKKw, this) != objCopydefault) {
                            return objCopydefault;
                        }
                        objKWHzl = obj2;
                    }
                }
                obj7 = objKWHzl;
                passkeyPromotionServiceWIthPasskeyStepperViewModel5 = this.this$0;
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj7);
                if (thM7380exceptionOrNullimpl2 != null) {
                    C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, "PasskeyPromotionServiceWIthPasskeyStepperViewModel mfa init exception: " + thM7380exceptionOrNullimpl2.getMessage(), 2, null);
                    MutableSharedFlow mutableSharedFlow9 = passkeyPromotionServiceWIthPasskeyStepperViewModel5.AYXKKw;
                    String message2 = thM7380exceptionOrNullimpl2.getMessage();
                    String str = message2 != null ? message2 : "";
                    this.L$0 = obj7;
                    this.L$1 = passkeyPromotionServiceWIthPasskeyStepperViewModel5;
                    this.label = 10;
                    if (mutableSharedFlow9.emit(str, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    mutableSharedFlow3 = passkeyPromotionServiceWIthPasskeyStepperViewModel5.EZpvd;
                    boolKWHzl2 = C56443yFo.KWHzl(false);
                    this.L$0 = obj7;
                    this.L$1 = null;
                    this.label = 11;
                    if (mutableSharedFlow3.emit(boolKWHzl2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                C5905aFL c5905aFL2 = this.this$0.AuCTel;
                String string2 = PasskeyMfaInitialOperation.REG.toString();
                this.label = 2;
                objKWHzl = c5905aFL2.KWHzl(string2, this);
                if (objKWHzl == objCopydefault) {
                }
                PasskeyPromotionServiceWIthPasskeyStepperViewModel passkeyPromotionServiceWIthPasskeyStepperViewModel62 = this.this$0;
                if (Result.m7384isSuccessimpl(objKWHzl)) {
                }
                obj7 = objKWHzl;
                passkeyPromotionServiceWIthPasskeyStepperViewModel5 = this.this$0;
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj7);
                if (thM7380exceptionOrNullimpl2 != null) {
                }
                return Unit.INSTANCE;
            case 2:
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
                PasskeyPromotionServiceWIthPasskeyStepperViewModel passkeyPromotionServiceWIthPasskeyStepperViewModel622 = this.this$0;
                if (Result.m7384isSuccessimpl(objKWHzl)) {
                }
                obj7 = objKWHzl;
                passkeyPromotionServiceWIthPasskeyStepperViewModel5 = this.this$0;
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj7);
                if (thM7380exceptionOrNullimpl2 != null) {
                }
                return Unit.INSTANCE;
            case 3:
                InitiateMfaSessionResponse initiateMfaSessionResponse2 = (InitiateMfaSessionResponse) this.L$2;
                PasskeyPromotionServiceWIthPasskeyStepperViewModel passkeyPromotionServiceWIthPasskeyStepperViewModel7 = (PasskeyPromotionServiceWIthPasskeyStepperViewModel) this.L$1;
                Object obj10 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                initiateMfaSessionResponse = initiateMfaSessionResponse2;
                passkeyPromotionServiceWIthPasskeyStepperViewModel2 = passkeyPromotionServiceWIthPasskeyStepperViewModel7;
                obj3 = obj10;
                C5765aCe c5765aCe2 = passkeyPromotionServiceWIthPasskeyStepperViewModel2.AkhnZx;
                business = initiateMfaSessionResponse.getBusiness();
                if (business == null) {
                }
                MfaCreateSessionRequest mfaCreateSessionRequest2 = new MfaCreateSessionRequest(business);
                this.L$0 = obj3;
                this.L$1 = passkeyPromotionServiceWIthPasskeyStepperViewModel2;
                this.L$2 = null;
                this.label = 4;
                objOLrzqt = c5765aCe2.OLrzqt(mfaCreateSessionRequest2, this);
                if (objOLrzqt == objCopydefault) {
                }
                Object obj82 = obj3;
                passkeyPromotionServiceWIthPasskeyStepperViewModel3 = passkeyPromotionServiceWIthPasskeyStepperViewModel2;
                obj4 = objOLrzqt;
                obj5 = obj82;
                if (Result.m7384isSuccessimpl(obj4)) {
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj4);
                if (thM7380exceptionOrNullimpl != null) {
                }
                break;
            case 4:
                passkeyPromotionServiceWIthPasskeyStepperViewModel2 = (PasskeyPromotionServiceWIthPasskeyStepperViewModel) this.L$1;
                obj3 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
                Object obj822 = obj3;
                passkeyPromotionServiceWIthPasskeyStepperViewModel3 = passkeyPromotionServiceWIthPasskeyStepperViewModel2;
                obj4 = objOLrzqt;
                obj5 = obj822;
                if (Result.m7384isSuccessimpl(obj4)) {
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj4);
                if (thM7380exceptionOrNullimpl != null) {
                }
                break;
            case 5:
                obj4 = this.L$2;
                passkeyPromotionServiceWIthPasskeyStepperViewModel3 = (PasskeyPromotionServiceWIthPasskeyStepperViewModel) this.L$1;
                obj5 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj4);
                if (thM7380exceptionOrNullimpl != null) {
                }
                break;
            case 6:
                passkeyPromotionServiceWIthPasskeyStepperViewModel4 = (PasskeyPromotionServiceWIthPasskeyStepperViewModel) this.L$1;
                obj6 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                Object obj92 = obj6;
                passkeyPromotionServiceWIthPasskeyStepperViewModel3 = passkeyPromotionServiceWIthPasskeyStepperViewModel4;
                objKWHzl = obj92;
                mutableSharedFlow = passkeyPromotionServiceWIthPasskeyStepperViewModel3.EZpvd;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = objKWHzl;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                obj7 = objKWHzl;
                passkeyPromotionServiceWIthPasskeyStepperViewModel5 = this.this$0;
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj7);
                if (thM7380exceptionOrNullimpl2 != null) {
                }
                return Unit.INSTANCE;
            case 7:
            case 9:
                objKWHzl = this.L$0;
                C56391yDq.AEQbTJ(obj);
                obj7 = objKWHzl;
                passkeyPromotionServiceWIthPasskeyStepperViewModel5 = this.this$0;
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj7);
                if (thM7380exceptionOrNullimpl2 != null) {
                }
                return Unit.INSTANCE;
            case 8:
                passkeyPromotionServiceWIthPasskeyStepperViewModel = (PasskeyPromotionServiceWIthPasskeyStepperViewModel) this.L$1;
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow2 = passkeyPromotionServiceWIthPasskeyStepperViewModel.AYXKKw;
                strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.DPHNDa);
                this.L$0 = obj2;
                this.L$1 = null;
                this.label = 9;
                if (mutableSharedFlow2.emit(strAYXKKw, this) != objCopydefault) {
                }
                break;
            case 10:
                passkeyPromotionServiceWIthPasskeyStepperViewModel5 = (PasskeyPromotionServiceWIthPasskeyStepperViewModel) this.L$1;
                obj7 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow3 = passkeyPromotionServiceWIthPasskeyStepperViewModel5.EZpvd;
                boolKWHzl2 = C56443yFo.KWHzl(false);
                this.L$0 = obj7;
                this.L$1 = null;
                this.label = 11;
                if (mutableSharedFlow3.emit(boolKWHzl2, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 11:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
