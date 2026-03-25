package com.okinc.auth.impl.passkey.ui.link;

import com.okinc.auth.api.passkey.PasskeyAuthenticateResponse;
import com.okinc.auth.api.passkey.PasskeyAuthenticateState;
import com.okinc.auth.api.passkey.PasskeyLinkState;
import com.okinc.network.okg.response.OKServerException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C33488mxR;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5942aFw;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyLinkScenarioViewModel$finish$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PasskeyAuthenticateState $authState;
    Object L$0;
    int label;
    final /* synthetic */ PasskeyLinkScenarioViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyLinkScenarioViewModel$finish$1(PasskeyAuthenticateState passkeyAuthenticateState, PasskeyLinkScenarioViewModel passkeyLinkScenarioViewModel, Continuation<? super PasskeyLinkScenarioViewModel$finish$1> continuation) {
        super(2, continuation);
        this.$authState = passkeyAuthenticateState;
        this.this$0 = passkeyLinkScenarioViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyLinkScenarioViewModel$finish$1(this.$authState, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyLinkScenarioViewModel$finish$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8558invoke0E7RQCE$default;
        String strEZpvd;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        PasskeyLinkState.Failure failure;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                PasskeyAuthenticateState passkeyAuthenticateState = this.$authState;
                if (passkeyAuthenticateState instanceof PasskeyAuthenticateState.Success) {
                    MutableSharedFlow mutableSharedFlow2 = this.this$0.EZpvd;
                    Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
                    this.label = 1;
                    if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    C5942aFw c5942aFw = this.this$0.djBIcL;
                    PasskeyAuthenticateResponse passkeyAuthenticateResponseOLrzqt = ((PasskeyAuthenticateState.Success) this.$authState).OLrzqt();
                    String str = (passkeyAuthenticateResponseOLrzqt != null || (strEZpvd = C33488mxR.EZpvd(passkeyAuthenticateResponseOLrzqt)) == null) ? "" : strEZpvd;
                    this.label = 2;
                    objM8558invoke0E7RQCE$default = C5942aFw.m8558invoke0E7RQCE$default(c5942aFw, str, null, this, 2, null);
                    if (objM8558invoke0E7RQCE$default == objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = objM8558invoke0E7RQCE$default;
                    PasskeyLinkScenarioViewModel passkeyLinkScenarioViewModel = this.this$0;
                    PasskeyAuthenticateState passkeyAuthenticateState2 = this.$authState;
                    if (Result.m7384isSuccessimpl(obj2)) {
                        MutableSharedFlow mutableSharedFlow3 = passkeyLinkScenarioViewModel.KWHzl;
                        PasskeyAuthenticateResponse passkeyAuthenticateResponseOLrzqt2 = ((PasskeyAuthenticateState.Success) passkeyAuthenticateState2).OLrzqt();
                        PasskeyLinkState.Success success = new PasskeyLinkState.Success(passkeyAuthenticateResponseOLrzqt2 != null ? passkeyAuthenticateResponseOLrzqt2.getIsExternalPasskey() : false);
                        this.L$0 = obj2;
                        this.label = 3;
                        if (mutableSharedFlow3.emit(success, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    PasskeyLinkScenarioViewModel passkeyLinkScenarioViewModel2 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl != null) {
                        pUU.copydefault("PasskeyLinkScenarioViewModel", "finish: " + thM7380exceptionOrNullimpl.getMessage());
                        if (thM7380exceptionOrNullimpl instanceof OKServerException) {
                            int code = ((OKServerException) thM7380exceptionOrNullimpl).getCode();
                            String message = thM7380exceptionOrNullimpl.getMessage();
                            failure = new PasskeyLinkState.Failure(String.valueOf(code), message != null ? message : "");
                        } else {
                            String message2 = thM7380exceptionOrNullimpl.getMessage();
                            if (message2 == null) {
                                message2 = "";
                            }
                            failure = new PasskeyLinkState.Failure("", message2);
                        }
                        MutableSharedFlow mutableSharedFlow4 = passkeyLinkScenarioViewModel2.KWHzl;
                        this.L$0 = obj2;
                        this.label = 4;
                        if (mutableSharedFlow4.emit(failure, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    mutableSharedFlow = this.this$0.EZpvd;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.L$0 = null;
                    this.label = 5;
                    if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                if (Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.Cancel.copydefault)) {
                    MutableSharedFlow mutableSharedFlow5 = this.this$0.KWHzl;
                    PasskeyLinkState.Cancel cancel = PasskeyLinkState.Cancel.OLrzqt;
                    this.label = 6;
                    if (mutableSharedFlow5.emit(cancel, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (passkeyAuthenticateState instanceof PasskeyAuthenticateState.SdkError) {
                    MutableSharedFlow mutableSharedFlow6 = this.this$0.KWHzl;
                    PasskeyLinkState.SdkError sdkError = new PasskeyLinkState.SdkError(((PasskeyAuthenticateState.SdkError) this.$authState).AEQbTJ(), ((PasskeyAuthenticateState.SdkError) this.$authState).copydefault());
                    this.label = 7;
                    if (mutableSharedFlow6.emit(sdkError, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.NoValidPasskey.OLrzqt)) {
                    MutableSharedFlow mutableSharedFlow7 = this.this$0.KWHzl;
                    PasskeyLinkState.NoValidPasskey noValidPasskey = PasskeyLinkState.NoValidPasskey.OLrzqt;
                    this.label = 8;
                    if (mutableSharedFlow7.emit(noValidPasskey, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.AccountFrozen.KWHzl)) {
                    MutableSharedFlow mutableSharedFlow8 = this.this$0.KWHzl;
                    PasskeyLinkState.Cancel cancel2 = PasskeyLinkState.Cancel.OLrzqt;
                    this.label = 9;
                    if (mutableSharedFlow8.emit(cancel2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (passkeyAuthenticateState instanceof PasskeyAuthenticateState.Failure) {
                    MutableSharedFlow mutableSharedFlow9 = this.this$0.KWHzl;
                    PasskeyLinkState.Failure failure2 = new PasskeyLinkState.Failure(null, null, 3, null);
                    this.label = 10;
                    if (mutableSharedFlow9.emit(failure2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (passkeyAuthenticateState instanceof PasskeyAuthenticateState.DeviceNotCompatible) {
                    MutableSharedFlow mutableSharedFlow10 = this.this$0.KWHzl;
                    PasskeyLinkState.DeviceNotCompatible deviceNotCompatible = PasskeyLinkState.DeviceNotCompatible.KWHzl;
                    this.label = 11;
                    if (mutableSharedFlow10.emit(deviceNotCompatible, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                C5942aFw c5942aFw2 = this.this$0.djBIcL;
                PasskeyAuthenticateResponse passkeyAuthenticateResponseOLrzqt3 = ((PasskeyAuthenticateState.Success) this.$authState).OLrzqt();
                if (passkeyAuthenticateResponseOLrzqt3 != null) {
                    this.label = 2;
                    objM8558invoke0E7RQCE$default = C5942aFw.m8558invoke0E7RQCE$default(c5942aFw2, str, null, this, 2, null);
                    if (objM8558invoke0E7RQCE$default == objCopydefault) {
                    }
                    obj2 = objM8558invoke0E7RQCE$default;
                    PasskeyLinkScenarioViewModel passkeyLinkScenarioViewModel3 = this.this$0;
                    PasskeyAuthenticateState passkeyAuthenticateState22 = this.$authState;
                    if (Result.m7384isSuccessimpl(obj2)) {
                    }
                    PasskeyLinkScenarioViewModel passkeyLinkScenarioViewModel22 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    mutableSharedFlow = this.this$0.EZpvd;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.L$0 = null;
                    this.label = 5;
                    if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                    }
                }
                return Unit.INSTANCE;
            case 2:
                C56391yDq.AEQbTJ(obj);
                objM8558invoke0E7RQCE$default = ((Result) obj).m7386unboximpl();
                obj2 = objM8558invoke0E7RQCE$default;
                PasskeyLinkScenarioViewModel passkeyLinkScenarioViewModel32 = this.this$0;
                PasskeyAuthenticateState passkeyAuthenticateState222 = this.$authState;
                if (Result.m7384isSuccessimpl(obj2)) {
                }
                PasskeyLinkScenarioViewModel passkeyLinkScenarioViewModel222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                mutableSharedFlow = this.this$0.EZpvd;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 5;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 3:
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                PasskeyLinkScenarioViewModel passkeyLinkScenarioViewModel2222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                mutableSharedFlow = this.this$0.EZpvd;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 5;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 4:
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow = this.this$0.EZpvd;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 5;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
