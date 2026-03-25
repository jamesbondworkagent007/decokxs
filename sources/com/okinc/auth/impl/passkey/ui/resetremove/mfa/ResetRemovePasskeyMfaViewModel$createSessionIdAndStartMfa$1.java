package com.okinc.auth.impl.passkey.ui.resetremove.mfa;

import androidx.lifecycle.MutableLiveData;
import com.okinc.auth.api.passkey.PasskeyResetRemoveType;
import com.okinc.auth.api.service.MfaCreateSessionRequest;
import com.okinc.auth.api.service.MfaCreateSessionResponse;
import kotlin.Pair;
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
import o.C5765aCe;
import o.C5922aFc;

/* JADX INFO: loaded from: classes3.dex */
public final class ResetRemovePasskeyMfaViewModel$createSessionIdAndStartMfa$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $business;
    Object L$0;
    int label;
    final /* synthetic */ ResetRemovePasskeyMfaViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetRemovePasskeyMfaViewModel$createSessionIdAndStartMfa$1(ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel, String str, Continuation<? super ResetRemovePasskeyMfaViewModel$createSessionIdAndStartMfa$1> continuation) {
        super(2, continuation);
        this.this$0 = resetRemovePasskeyMfaViewModel;
        this.$business = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ResetRemovePasskeyMfaViewModel$createSessionIdAndStartMfa$1(this.this$0, this.$business, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ResetRemovePasskeyMfaViewModel$createSessionIdAndStartMfa$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
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
                    objOLrzqt = ((Result) obj).m7386unboximpl();
                    mutableSharedFlow = this.this$0.AYXKKw;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.L$0 = objOLrzqt;
                    this.label = 3;
                    if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel = this.this$0;
                    if (Result.m7384isSuccessimpl(objOLrzqt)) {
                    }
                    ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel2 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objOLrzqt = obj2;
                    ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel22 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt);
                    if (thM7380exceptionOrNullimpl != null) {
                        C5922aFc c5922aFc = C5922aFc.KWHzl;
                        String strEZpvd = ResetRemovePasskeyMfaViewModel.Companion.EZpvd();
                        String message = thM7380exceptionOrNullimpl.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        C5922aFc.log$default(c5922aFc, "[RESET/REMOVE]", null, strEZpvd + " createSessionIdAndStartMfa() " + message, 2, null);
                        MutableLiveData mutableLiveData = resetRemovePasskeyMfaViewModel22.djBIcL;
                        String message2 = thM7380exceptionOrNullimpl.getMessage();
                        mutableLiveData.setValue(message2 != null ? message2 : "");
                    }
                    return Unit.INSTANCE;
                }
                Object obj3 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = obj3;
                ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel3 = this.this$0;
                if (Result.m7384isSuccessimpl(objOLrzqt)) {
                    MfaCreateSessionResponse mfaCreateSessionResponse = (MfaCreateSessionResponse) objOLrzqt;
                    Pair pair = (Pair) resetRemovePasskeyMfaViewModel3.AEQbTJ.getValue();
                    if ((pair != null ? (PasskeyResetRemoveType) pair.getFirst() : null) instanceof PasskeyResetRemoveType.Remove) {
                        MutableSharedFlow mutableSharedFlow3 = resetRemovePasskeyMfaViewModel3.fetchVPNInfo;
                        String sessionId = mfaCreateSessionResponse.getSessionId();
                        if (sessionId == null) {
                            sessionId = "";
                        }
                        this.L$0 = objOLrzqt;
                        this.label = 4;
                        if (mutableSharedFlow3.emit(sessionId, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        MutableSharedFlow mutableSharedFlow4 = resetRemovePasskeyMfaViewModel3.isConnected;
                        String sessionId2 = mfaCreateSessionResponse.getSessionId();
                        if (sessionId2 == null) {
                            sessionId2 = "";
                        }
                        this.L$0 = objOLrzqt;
                        this.label = 5;
                        if (mutableSharedFlow4.emit(sessionId2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    obj2 = objOLrzqt;
                    objOLrzqt = obj2;
                }
                ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C5765aCe c5765aCe = this.this$0.getNewProxyInstance;
        MfaCreateSessionRequest mfaCreateSessionRequest = new MfaCreateSessionRequest(this.$business);
        this.label = 2;
        objOLrzqt = c5765aCe.OLrzqt(mfaCreateSessionRequest, this);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        mutableSharedFlow = this.this$0.AYXKKw;
        boolKWHzl = C56443yFo.KWHzl(false);
        this.L$0 = objOLrzqt;
        this.label = 3;
        if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
        }
        ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel32 = this.this$0;
        if (Result.m7384isSuccessimpl(objOLrzqt)) {
        }
        ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel2222 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
