package com.okinc.auth.impl.passkey.ui.register.okxpay;

import com.okinc.auth.api.passkey.PasskeyState;
import com.okinc.auth.impl.passkey.model.UnlockTokenResponse;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5901aFH;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityRegisterOkxPayPasskeyServiceViewModel$getUnlockTokenFromMfaSessionId$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $sessionId;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ SecurityRegisterOkxPayPasskeyServiceViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityRegisterOkxPayPasskeyServiceViewModel$getUnlockTokenFromMfaSessionId$1(SecurityRegisterOkxPayPasskeyServiceViewModel securityRegisterOkxPayPasskeyServiceViewModel, String str, Continuation<? super SecurityRegisterOkxPayPasskeyServiceViewModel$getUnlockTokenFromMfaSessionId$1> continuation) {
        super(2, continuation);
        this.this$0 = securityRegisterOkxPayPasskeyServiceViewModel;
        this.$sessionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityRegisterOkxPayPasskeyServiceViewModel$getUnlockTokenFromMfaSessionId$1(this.this$0, this.$sessionId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SecurityRegisterOkxPayPasskeyServiceViewModel$getUnlockTokenFromMfaSessionId$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object obj2;
        UnlockTokenResponse unlockTokenResponse;
        SecurityRegisterOkxPayPasskeyServiceViewModel securityRegisterOkxPayPasskeyServiceViewModel;
        Throwable thM7380exceptionOrNullimpl;
        SecurityRegisterOkxPayPasskeyServiceViewModel securityRegisterOkxPayPasskeyServiceViewModel2;
        Object obj3;
        String message;
        MutableSharedFlow mutableSharedFlow;
        PasskeyState.RegisterError registerError;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow2 = this.this$0.EZpvd;
            Boolean boolKWHzl = C56443yFo.KWHzl(true);
            this.label = 1;
            if (mutableSharedFlow2.emit(boolKWHzl, this) == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    objCopydefault = ((Result) obj).m7386unboximpl();
                    obj2 = objCopydefault;
                    SecurityRegisterOkxPayPasskeyServiceViewModel securityRegisterOkxPayPasskeyServiceViewModel3 = this.this$0;
                    if (Result.m7384isSuccessimpl(obj2)) {
                        unlockTokenResponse = (UnlockTokenResponse) obj2;
                        MutableSharedFlow mutableSharedFlow3 = securityRegisterOkxPayPasskeyServiceViewModel3.EZpvd;
                        Boolean boolKWHzl2 = C56443yFo.KWHzl(false);
                        this.L$0 = obj2;
                        this.L$1 = securityRegisterOkxPayPasskeyServiceViewModel3;
                        this.L$2 = unlockTokenResponse;
                        this.label = 3;
                        if (mutableSharedFlow3.emit(boolKWHzl2, this) == objCopydefault2) {
                            return objCopydefault2;
                        }
                        securityRegisterOkxPayPasskeyServiceViewModel = securityRegisterOkxPayPasskeyServiceViewModel3;
                        securityRegisterOkxPayPasskeyServiceViewModel.copydefault(unlockTokenResponse);
                    }
                    SecurityRegisterOkxPayPasskeyServiceViewModel securityRegisterOkxPayPasskeyServiceViewModel4 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    thM7380exceptionOrNullimpl = (Throwable) this.L$2;
                    securityRegisterOkxPayPasskeyServiceViewModel2 = (SecurityRegisterOkxPayPasskeyServiceViewModel) this.L$1;
                    obj3 = this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    message = thM7380exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    mutableSharedFlow = securityRegisterOkxPayPasskeyServiceViewModel2.AEQbTJ;
                    registerError = new PasskeyState.RegisterError(message);
                    this.L$0 = obj3;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    if (mutableSharedFlow.emit(registerError, this) == objCopydefault2) {
                        return objCopydefault2;
                    }
                    return Unit.INSTANCE;
                }
                unlockTokenResponse = (UnlockTokenResponse) this.L$2;
                securityRegisterOkxPayPasskeyServiceViewModel = (SecurityRegisterOkxPayPasskeyServiceViewModel) this.L$1;
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                securityRegisterOkxPayPasskeyServiceViewModel.copydefault(unlockTokenResponse);
                SecurityRegisterOkxPayPasskeyServiceViewModel securityRegisterOkxPayPasskeyServiceViewModel42 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableSharedFlow mutableSharedFlow4 = securityRegisterOkxPayPasskeyServiceViewModel42.EZpvd;
                    Boolean boolKWHzl3 = C56443yFo.KWHzl(false);
                    this.L$0 = obj2;
                    this.L$1 = securityRegisterOkxPayPasskeyServiceViewModel42;
                    this.L$2 = thM7380exceptionOrNullimpl;
                    this.label = 4;
                    if (mutableSharedFlow4.emit(boolKWHzl3, this) == objCopydefault2) {
                        return objCopydefault2;
                    }
                    securityRegisterOkxPayPasskeyServiceViewModel2 = securityRegisterOkxPayPasskeyServiceViewModel42;
                    obj3 = obj2;
                    message = thM7380exceptionOrNullimpl.getMessage();
                    if (message == null) {
                    }
                    mutableSharedFlow = securityRegisterOkxPayPasskeyServiceViewModel2.AEQbTJ;
                    registerError = new PasskeyState.RegisterError(message);
                    this.L$0 = obj3;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    if (mutableSharedFlow.emit(registerError, this) == objCopydefault2) {
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C5901aFH c5901aFH = this.this$0.DbNXlk;
        String str = this.$sessionId;
        this.label = 2;
        objCopydefault = c5901aFH.copydefault(str, this);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        obj2 = objCopydefault;
        SecurityRegisterOkxPayPasskeyServiceViewModel securityRegisterOkxPayPasskeyServiceViewModel32 = this.this$0;
        if (Result.m7384isSuccessimpl(obj2)) {
        }
        SecurityRegisterOkxPayPasskeyServiceViewModel securityRegisterOkxPayPasskeyServiceViewModel422 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
