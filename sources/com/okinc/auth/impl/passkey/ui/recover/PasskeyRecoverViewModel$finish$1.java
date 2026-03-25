package com.okinc.auth.impl.passkey.ui.recover;

import com.okinc.auth.api.passkey.PasskeyAuthenticateResponse;
import com.okinc.auth.api.passkey.PasskeyAuthenticateState;
import com.okinc.auth.api.passkey.PasskeyRecoverState;
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
public final class PasskeyRecoverViewModel$finish$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PasskeyAuthenticateState $authState;
    Object L$0;
    int label;
    final /* synthetic */ PasskeyRecoverViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyRecoverViewModel$finish$1(PasskeyAuthenticateState passkeyAuthenticateState, PasskeyRecoverViewModel passkeyRecoverViewModel, Continuation<? super PasskeyRecoverViewModel$finish$1> continuation) {
        super(2, continuation);
        this.$authState = passkeyAuthenticateState;
        this.this$0 = passkeyRecoverViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyRecoverViewModel$finish$1(this.$authState, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyRecoverViewModel$finish$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        PasskeyAuthenticateResponse passkeyAuthenticateResponseOLrzqt;
        Object objOLrzqt;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                PasskeyAuthenticateState passkeyAuthenticateState = this.$authState;
                if (passkeyAuthenticateState instanceof PasskeyAuthenticateState.Success) {
                    MutableSharedFlow mutableSharedFlow2 = this.this$0.AEQbTJ;
                    Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
                    this.label = 1;
                    if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    C5942aFw c5942aFw = this.this$0.AYXKKw;
                    passkeyAuthenticateResponseOLrzqt = ((PasskeyAuthenticateState.Success) this.$authState).OLrzqt();
                    if (passkeyAuthenticateResponseOLrzqt != null || (strEZpvd = C33488mxR.EZpvd(passkeyAuthenticateResponseOLrzqt)) == null) {
                        String strEZpvd = "";
                    }
                    this.label = 2;
                    objOLrzqt = c5942aFw.OLrzqt(strEZpvd, "WALLET_RECOVERY", this);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = objOLrzqt;
                    PasskeyRecoverViewModel passkeyRecoverViewModel = this.this$0;
                    if (Result.m7384isSuccessimpl(obj2)) {
                        MutableSharedFlow mutableSharedFlow3 = passkeyRecoverViewModel.EZpvd;
                        PasskeyRecoverState.Success success = PasskeyRecoverState.Success.copydefault;
                        this.L$0 = obj2;
                        this.label = 3;
                        if (mutableSharedFlow3.emit(success, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    PasskeyRecoverViewModel passkeyRecoverViewModel2 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl != null) {
                        pUU.copydefault("PasskeyRecoverViewModel", "finish: " + thM7380exceptionOrNullimpl.getMessage());
                        MutableSharedFlow mutableSharedFlow4 = passkeyRecoverViewModel2.AhwBna;
                        String message = thM7380exceptionOrNullimpl.getMessage();
                        String str = message != null ? message : "";
                        this.L$0 = obj2;
                        this.label = 4;
                        if (mutableSharedFlow4.emit(str, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    mutableSharedFlow = this.this$0.AEQbTJ;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.L$0 = null;
                    this.label = 5;
                    if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                if (!Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.Cancel.copydefault)) {
                    if (passkeyAuthenticateState instanceof PasskeyAuthenticateState.SdkError) {
                        pUU.copydefault("PasskeyRecoverViewModel", "finish: " + ((PasskeyAuthenticateState.SdkError) this.$authState).AEQbTJ() + " isHandled: " + ((PasskeyAuthenticateState.SdkError) this.$authState).copydefault());
                        if (!((PasskeyAuthenticateState.SdkError) this.$authState).copydefault()) {
                            MutableSharedFlow mutableSharedFlow5 = this.this$0.AhwBna;
                            String strAEQbTJ = ((PasskeyAuthenticateState.SdkError) this.$authState).AEQbTJ();
                            this.label = 6;
                            if (mutableSharedFlow5.emit(strAEQbTJ, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                    } else if (Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.NoValidPasskey.OLrzqt)) {
                        pUU.copydefault("PasskeyRecoverViewModel", "finish: NoValidPasskey");
                    } else if (Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.AccountFrozen.KWHzl)) {
                        pUU.copydefault("PasskeyRecoverViewModel", "finish: AccountFrozen");
                        MutableSharedFlow mutableSharedFlow6 = this.this$0.AhwBna;
                        this.label = 7;
                        if (mutableSharedFlow6.emit("AccountFrozen", this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        if (!Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.DeviceNotCompatible.OLrzqt) && !(passkeyAuthenticateState instanceof PasskeyAuthenticateState.Failure)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pUU.copydefault("PasskeyRecoverViewModel", "finish: Failure");
                        MutableSharedFlow mutableSharedFlow7 = this.this$0.AhwBna;
                        this.label = 8;
                        if (mutableSharedFlow7.emit("Failure", this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                C5942aFw c5942aFw2 = this.this$0.AYXKKw;
                passkeyAuthenticateResponseOLrzqt = ((PasskeyAuthenticateState.Success) this.$authState).OLrzqt();
                if (passkeyAuthenticateResponseOLrzqt != null) {
                    String strEZpvd2 = "";
                    this.label = 2;
                    objOLrzqt = c5942aFw2.OLrzqt(strEZpvd2, "WALLET_RECOVERY", this);
                    if (objOLrzqt == objCopydefault) {
                    }
                    obj2 = objOLrzqt;
                    PasskeyRecoverViewModel passkeyRecoverViewModel3 = this.this$0;
                    if (Result.m7384isSuccessimpl(obj2)) {
                    }
                    PasskeyRecoverViewModel passkeyRecoverViewModel22 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    mutableSharedFlow = this.this$0.AEQbTJ;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.L$0 = null;
                    this.label = 5;
                    if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                    }
                }
                return Unit.INSTANCE;
            case 2:
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
                obj2 = objOLrzqt;
                PasskeyRecoverViewModel passkeyRecoverViewModel32 = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                }
                PasskeyRecoverViewModel passkeyRecoverViewModel222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                mutableSharedFlow = this.this$0.AEQbTJ;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 5;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 3:
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                PasskeyRecoverViewModel passkeyRecoverViewModel2222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                mutableSharedFlow = this.this$0.AEQbTJ;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 5;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 4:
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow = this.this$0.AEQbTJ;
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
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
