package com.okinc.auth.impl.passkey.ui.register.okxpay;

import com.okinc.auth.api.passkey.PasskeyState;
import com.okinc.auth.api.service.MfaCreateSessionRequest;
import com.okinc.auth.api.service.MfaCreateSessionResponse;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC32955mnO;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5765aCe;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityRegisterOkxPayPasskeyServiceViewModel$start2fa$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ SecurityRegisterOkxPayPasskeyServiceViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityRegisterOkxPayPasskeyServiceViewModel$start2fa$1(SecurityRegisterOkxPayPasskeyServiceViewModel securityRegisterOkxPayPasskeyServiceViewModel, Continuation<? super SecurityRegisterOkxPayPasskeyServiceViewModel$start2fa$1> continuation) {
        super(2, continuation);
        this.this$0 = securityRegisterOkxPayPasskeyServiceViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityRegisterOkxPayPasskeyServiceViewModel$start2fa$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SecurityRegisterOkxPayPasskeyServiceViewModel$start2fa$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        SecurityRegisterOkxPayPasskeyServiceViewModel securityRegisterOkxPayPasskeyServiceViewModel;
        Object obj2;
        MfaCreateSessionResponse mfaCreateSessionResponse;
        String sessionId;
        Object obj3;
        Throwable thM7380exceptionOrNullimpl;
        SecurityRegisterOkxPayPasskeyServiceViewModel securityRegisterOkxPayPasskeyServiceViewModel2;
        MutableSharedFlow mutableSharedFlow;
        AbstractC32955mnO.Activity activity;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow mutableSharedFlow2 = this.this$0.EZpvd;
                Boolean boolKWHzl = C56443yFo.KWHzl(true);
                this.label = 1;
                if (mutableSharedFlow2.emit(boolKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
                C5765aCe c5765aCe = this.this$0.valueOf;
                MfaCreateSessionRequest mfaCreateSessionRequest = new MfaCreateSessionRequest("WEB3_PAY_PASSKEY_UNLOCK_TOKEN");
                this.label = 2;
                objOLrzqt = c5765aCe.OLrzqt(mfaCreateSessionRequest, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                securityRegisterOkxPayPasskeyServiceViewModel = this.this$0;
                if (Result.m7384isSuccessimpl(objOLrzqt)) {
                    mfaCreateSessionResponse = (MfaCreateSessionResponse) objOLrzqt;
                    MutableSharedFlow mutableSharedFlow3 = securityRegisterOkxPayPasskeyServiceViewModel.EZpvd;
                    Boolean boolKWHzl2 = C56443yFo.KWHzl(false);
                    this.L$0 = objOLrzqt;
                    this.L$1 = securityRegisterOkxPayPasskeyServiceViewModel;
                    this.L$2 = mfaCreateSessionResponse;
                    this.label = 3;
                    if (mutableSharedFlow3.emit(boolKWHzl2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    sessionId = mfaCreateSessionResponse.getSessionId();
                    if (sessionId == null) {
                        sessionId = "";
                    }
                    if (sessionId.length() != 0) {
                        MutableSharedFlow mutableSharedFlow4 = securityRegisterOkxPayPasskeyServiceViewModel.AEQbTJ;
                        PasskeyState.RegisterError registerError = new PasskeyState.RegisterError("mfa session id is empty");
                        this.L$0 = objOLrzqt;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 5;
                        if (mutableSharedFlow4.emit(registerError, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        MutableSharedFlow mutableSharedFlow5 = securityRegisterOkxPayPasskeyServiceViewModel.KWHzl;
                        this.L$0 = objOLrzqt;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 4;
                        if (mutableSharedFlow5.emit(sessionId, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    obj3 = objOLrzqt;
                    obj2 = obj3;
                    SecurityRegisterOkxPayPasskeyServiceViewModel securityRegisterOkxPayPasskeyServiceViewModel3 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl != null) {
                        MutableSharedFlow mutableSharedFlow6 = securityRegisterOkxPayPasskeyServiceViewModel3.EZpvd;
                        Boolean boolKWHzl3 = C56443yFo.KWHzl(false);
                        this.L$0 = obj2;
                        this.L$1 = securityRegisterOkxPayPasskeyServiceViewModel3;
                        this.L$2 = thM7380exceptionOrNullimpl;
                        this.label = 6;
                        if (mutableSharedFlow6.emit(boolKWHzl3, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        securityRegisterOkxPayPasskeyServiceViewModel2 = securityRegisterOkxPayPasskeyServiceViewModel3;
                        String message = thM7380exceptionOrNullimpl.getMessage();
                        String str = message != null ? message : "";
                        mutableSharedFlow = securityRegisterOkxPayPasskeyServiceViewModel2.copydefault;
                        activity = new AbstractC32955mnO.Activity(str);
                        this.L$0 = obj2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 7;
                        if (mutableSharedFlow.emit(activity, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                obj2 = objOLrzqt;
                SecurityRegisterOkxPayPasskeyServiceViewModel securityRegisterOkxPayPasskeyServiceViewModel32 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                C5765aCe c5765aCe2 = this.this$0.valueOf;
                MfaCreateSessionRequest mfaCreateSessionRequest2 = new MfaCreateSessionRequest("WEB3_PAY_PASSKEY_UNLOCK_TOKEN");
                this.label = 2;
                objOLrzqt = c5765aCe2.OLrzqt(mfaCreateSessionRequest2, this);
                if (objOLrzqt == objCopydefault) {
                }
                securityRegisterOkxPayPasskeyServiceViewModel = this.this$0;
                if (Result.m7384isSuccessimpl(objOLrzqt)) {
                }
                break;
            case 2:
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
                securityRegisterOkxPayPasskeyServiceViewModel = this.this$0;
                if (Result.m7384isSuccessimpl(objOLrzqt)) {
                }
                break;
            case 3:
                mfaCreateSessionResponse = (MfaCreateSessionResponse) this.L$2;
                securityRegisterOkxPayPasskeyServiceViewModel = (SecurityRegisterOkxPayPasskeyServiceViewModel) this.L$1;
                Object obj4 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = obj4;
                sessionId = mfaCreateSessionResponse.getSessionId();
                if (sessionId == null) {
                }
                if (sessionId.length() != 0) {
                }
                obj3 = objOLrzqt;
                obj2 = obj3;
                SecurityRegisterOkxPayPasskeyServiceViewModel securityRegisterOkxPayPasskeyServiceViewModel322 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 4:
            case 5:
                obj3 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                obj2 = obj3;
                SecurityRegisterOkxPayPasskeyServiceViewModel securityRegisterOkxPayPasskeyServiceViewModel3222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 6:
                thM7380exceptionOrNullimpl = (Throwable) this.L$2;
                securityRegisterOkxPayPasskeyServiceViewModel2 = (SecurityRegisterOkxPayPasskeyServiceViewModel) this.L$1;
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                String message2 = thM7380exceptionOrNullimpl.getMessage();
                if (message2 != null) {
                }
                mutableSharedFlow = securityRegisterOkxPayPasskeyServiceViewModel2.copydefault;
                activity = new AbstractC32955mnO.Activity(str);
                this.L$0 = obj2;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(activity, this) == objCopydefault) {
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
