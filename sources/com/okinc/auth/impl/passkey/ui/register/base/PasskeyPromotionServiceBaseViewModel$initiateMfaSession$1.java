package com.okinc.auth.impl.passkey.ui.register.base;

import com.okinc.auth.api.passkey.InitiateMfaSessionResponse;
import com.okinc.auth.api.service.MfaCreateSessionRequest;
import com.okinc.auth.api.service.MfaCreateSessionResponse;
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
public final class PasskeyPromotionServiceBaseViewModel$initiateMfaSession$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PasskeyPromotionServiceBaseViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyPromotionServiceBaseViewModel$initiateMfaSession$1(PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel, Continuation<? super PasskeyPromotionServiceBaseViewModel$initiateMfaSession$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeyPromotionServiceBaseViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyPromotionServiceBaseViewModel$initiateMfaSession$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyPromotionServiceBaseViewModel$initiateMfaSession$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0161 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel;
        Object obj2;
        InitiateMfaSessionResponse initiateMfaSessionResponse;
        Object obj3;
        Object obj4;
        String business;
        Object objOLrzqt;
        Object obj5;
        PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel2;
        Throwable thM7380exceptionOrNullimpl;
        PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel3;
        Object obj6;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel4;
        Throwable thM7380exceptionOrNullimpl2;
        MutableSharedFlow mutableSharedFlow2;
        String strAYXKKw;
        MutableSharedFlow mutableSharedFlow3;
        Boolean boolKWHzl2;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow mutableSharedFlow4 = this.this$0.gEmmrt;
                Boolean boolKWHzl3 = C56443yFo.KWHzl(true);
                this.label = 1;
                if (mutableSharedFlow4.emit(boolKWHzl3, this) == objCopydefault) {
                    return objCopydefault;
                }
                C5905aFL c5905aFL = this.this$0.AxsJAY;
                this.label = 2;
                objKWHzl = c5905aFL.KWHzl("REG", this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                passkeyPromotionServiceBaseViewModel = this.this$0;
                if (Result.m7384isSuccessimpl(objKWHzl)) {
                    initiateMfaSessionResponse = (InitiateMfaSessionResponse) objKWHzl;
                    if (Intrinsics.EZpvd((Object) (initiateMfaSessionResponse != null ? initiateMfaSessionResponse.getNextStep() : null), (Object) "MFA_VERIFICATION")) {
                        MutableSharedFlow mutableSharedFlow5 = passkeyPromotionServiceBaseViewModel.gEmmrt;
                        Boolean boolKWHzl4 = C56443yFo.KWHzl(true);
                        this.L$0 = objKWHzl;
                        this.L$1 = passkeyPromotionServiceBaseViewModel;
                        this.L$2 = initiateMfaSessionResponse;
                        this.label = 3;
                        if (mutableSharedFlow5.emit(boolKWHzl4, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        obj4 = objKWHzl;
                        C5765aCe c5765aCe = passkeyPromotionServiceBaseViewModel.wlaJM;
                        business = initiateMfaSessionResponse.getBusiness();
                        if (business == null) {
                            business = "";
                        }
                        MfaCreateSessionRequest mfaCreateSessionRequest = new MfaCreateSessionRequest(business);
                        this.L$0 = obj4;
                        this.L$1 = passkeyPromotionServiceBaseViewModel;
                        this.L$2 = null;
                        this.label = 4;
                        objOLrzqt = c5765aCe.OLrzqt(mfaCreateSessionRequest, this);
                        if (objOLrzqt == objCopydefault) {
                            return objCopydefault;
                        }
                        PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel5 = passkeyPromotionServiceBaseViewModel;
                        obj5 = objOLrzqt;
                        passkeyPromotionServiceBaseViewModel2 = passkeyPromotionServiceBaseViewModel5;
                        if (Result.m7384isSuccessimpl(obj5)) {
                            MutableSharedFlow mutableSharedFlow6 = passkeyPromotionServiceBaseViewModel2.fARcdN;
                            String sessionId = ((MfaCreateSessionResponse) obj5).getSessionId();
                            if (sessionId == null) {
                                sessionId = "";
                            }
                            this.L$0 = obj4;
                            this.L$1 = passkeyPromotionServiceBaseViewModel2;
                            this.L$2 = obj5;
                            this.label = 5;
                            if (mutableSharedFlow6.emit(sessionId, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj5);
                        if (thM7380exceptionOrNullimpl != null) {
                            MutableSharedFlow mutableSharedFlow7 = passkeyPromotionServiceBaseViewModel2.uzCIH;
                            String message = thM7380exceptionOrNullimpl.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            this.L$0 = obj4;
                            this.L$1 = passkeyPromotionServiceBaseViewModel2;
                            this.L$2 = obj5;
                            this.label = 6;
                            if (mutableSharedFlow7.emit(message, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            passkeyPromotionServiceBaseViewModel3 = passkeyPromotionServiceBaseViewModel2;
                            passkeyPromotionServiceBaseViewModel2 = passkeyPromotionServiceBaseViewModel3;
                        }
                        obj6 = obj4;
                        mutableSharedFlow = passkeyPromotionServiceBaseViewModel2.gEmmrt;
                        boolKWHzl = C56443yFo.KWHzl(false);
                        this.L$0 = obj6;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 7;
                        if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        obj2 = obj6;
                        passkeyPromotionServiceBaseViewModel4 = this.this$0;
                        thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj2);
                        if (thM7380exceptionOrNullimpl2 != null) {
                            C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, "init mfa session: " + thM7380exceptionOrNullimpl2.getMessage(), 2, null);
                            MutableSharedFlow mutableSharedFlow8 = passkeyPromotionServiceBaseViewModel4.uzCIH;
                            String message2 = thM7380exceptionOrNullimpl2.getMessage();
                            String str = message2 != null ? message2 : "";
                            this.L$0 = obj2;
                            this.L$1 = passkeyPromotionServiceBaseViewModel4;
                            this.label = 10;
                            if (mutableSharedFlow8.emit(str, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            mutableSharedFlow3 = passkeyPromotionServiceBaseViewModel4.gEmmrt;
                            boolKWHzl2 = C56443yFo.KWHzl(false);
                            this.L$0 = obj2;
                            this.L$1 = null;
                            this.label = 11;
                            if (mutableSharedFlow3.emit(boolKWHzl2, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, "init mfa session, nextStep error: " + (initiateMfaSessionResponse != null ? initiateMfaSessionResponse.getNextStep() : null), 2, null);
                    MutableSharedFlow mutableSharedFlow9 = passkeyPromotionServiceBaseViewModel.gEmmrt;
                    Boolean boolKWHzl5 = C56443yFo.KWHzl(false);
                    this.L$0 = objKWHzl;
                    this.L$1 = passkeyPromotionServiceBaseViewModel;
                    this.label = 8;
                    if (mutableSharedFlow9.emit(boolKWHzl5, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    obj3 = objKWHzl;
                    mutableSharedFlow2 = passkeyPromotionServiceBaseViewModel.uzCIH;
                    strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.DPHNDa);
                    this.L$0 = obj3;
                    this.L$1 = null;
                    this.label = 9;
                    if (mutableSharedFlow2.emit(strAYXKKw, this) != objCopydefault) {
                        return objCopydefault;
                    }
                    obj6 = obj3;
                    obj2 = obj6;
                    passkeyPromotionServiceBaseViewModel4 = this.this$0;
                    thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl2 != null) {
                    }
                    return Unit.INSTANCE;
                }
                obj2 = objKWHzl;
                passkeyPromotionServiceBaseViewModel4 = this.this$0;
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl2 != null) {
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                C5905aFL c5905aFL2 = this.this$0.AxsJAY;
                this.label = 2;
                objKWHzl = c5905aFL2.KWHzl("REG", this);
                if (objKWHzl == objCopydefault) {
                }
                passkeyPromotionServiceBaseViewModel = this.this$0;
                if (Result.m7384isSuccessimpl(objKWHzl)) {
                }
                break;
            case 2:
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
                passkeyPromotionServiceBaseViewModel = this.this$0;
                if (Result.m7384isSuccessimpl(objKWHzl)) {
                }
                break;
            case 3:
                InitiateMfaSessionResponse initiateMfaSessionResponse2 = (InitiateMfaSessionResponse) this.L$2;
                PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel6 = (PasskeyPromotionServiceBaseViewModel) this.L$1;
                Object obj7 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                initiateMfaSessionResponse = initiateMfaSessionResponse2;
                passkeyPromotionServiceBaseViewModel = passkeyPromotionServiceBaseViewModel6;
                obj4 = obj7;
                C5765aCe c5765aCe2 = passkeyPromotionServiceBaseViewModel.wlaJM;
                business = initiateMfaSessionResponse.getBusiness();
                if (business == null) {
                }
                MfaCreateSessionRequest mfaCreateSessionRequest2 = new MfaCreateSessionRequest(business);
                this.L$0 = obj4;
                this.L$1 = passkeyPromotionServiceBaseViewModel;
                this.L$2 = null;
                this.label = 4;
                objOLrzqt = c5765aCe2.OLrzqt(mfaCreateSessionRequest2, this);
                if (objOLrzqt == objCopydefault) {
                }
                PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel52 = passkeyPromotionServiceBaseViewModel;
                obj5 = objOLrzqt;
                passkeyPromotionServiceBaseViewModel2 = passkeyPromotionServiceBaseViewModel52;
                if (Result.m7384isSuccessimpl(obj5)) {
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj5);
                if (thM7380exceptionOrNullimpl != null) {
                }
                obj6 = obj4;
                mutableSharedFlow = passkeyPromotionServiceBaseViewModel2.gEmmrt;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = obj6;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                obj2 = obj6;
                passkeyPromotionServiceBaseViewModel4 = this.this$0;
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl2 != null) {
                }
                return Unit.INSTANCE;
            case 4:
                passkeyPromotionServiceBaseViewModel = (PasskeyPromotionServiceBaseViewModel) this.L$1;
                obj4 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
                PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel522 = passkeyPromotionServiceBaseViewModel;
                obj5 = objOLrzqt;
                passkeyPromotionServiceBaseViewModel2 = passkeyPromotionServiceBaseViewModel522;
                if (Result.m7384isSuccessimpl(obj5)) {
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj5);
                if (thM7380exceptionOrNullimpl != null) {
                }
                obj6 = obj4;
                mutableSharedFlow = passkeyPromotionServiceBaseViewModel2.gEmmrt;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = obj6;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                obj2 = obj6;
                passkeyPromotionServiceBaseViewModel4 = this.this$0;
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl2 != null) {
                }
                return Unit.INSTANCE;
            case 5:
                obj5 = this.L$2;
                PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel7 = (PasskeyPromotionServiceBaseViewModel) this.L$1;
                Object obj8 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                passkeyPromotionServiceBaseViewModel2 = passkeyPromotionServiceBaseViewModel7;
                obj4 = obj8;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj5);
                if (thM7380exceptionOrNullimpl != null) {
                }
                obj6 = obj4;
                mutableSharedFlow = passkeyPromotionServiceBaseViewModel2.gEmmrt;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = obj6;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                obj2 = obj6;
                passkeyPromotionServiceBaseViewModel4 = this.this$0;
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl2 != null) {
                }
                return Unit.INSTANCE;
            case 6:
                passkeyPromotionServiceBaseViewModel3 = (PasskeyPromotionServiceBaseViewModel) this.L$1;
                obj4 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                passkeyPromotionServiceBaseViewModel2 = passkeyPromotionServiceBaseViewModel3;
                obj6 = obj4;
                mutableSharedFlow = passkeyPromotionServiceBaseViewModel2.gEmmrt;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = obj6;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                obj2 = obj6;
                passkeyPromotionServiceBaseViewModel4 = this.this$0;
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl2 != null) {
                }
                return Unit.INSTANCE;
            case 7:
            case 9:
                obj6 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                obj2 = obj6;
                passkeyPromotionServiceBaseViewModel4 = this.this$0;
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl2 != null) {
                }
                return Unit.INSTANCE;
            case 8:
                passkeyPromotionServiceBaseViewModel = (PasskeyPromotionServiceBaseViewModel) this.L$1;
                obj3 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow2 = passkeyPromotionServiceBaseViewModel.uzCIH;
                strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.DPHNDa);
                this.L$0 = obj3;
                this.L$1 = null;
                this.label = 9;
                if (mutableSharedFlow2.emit(strAYXKKw, this) != objCopydefault) {
                }
                break;
            case 10:
                passkeyPromotionServiceBaseViewModel4 = (PasskeyPromotionServiceBaseViewModel) this.L$1;
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow3 = passkeyPromotionServiceBaseViewModel4.gEmmrt;
                boolKWHzl2 = C56443yFo.KWHzl(false);
                this.L$0 = obj2;
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
