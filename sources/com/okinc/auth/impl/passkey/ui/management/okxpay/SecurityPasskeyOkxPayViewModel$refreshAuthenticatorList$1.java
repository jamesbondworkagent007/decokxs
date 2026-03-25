package com.okinc.auth.impl.passkey.ui.management.okxpay;

import androidx.lifecycle.MutableLiveData;
import com.okinc.auth.impl.passkey.model.GetAuthenticatorListResponse;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C33492mxV;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5982aGj;
import o.yDY;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityPasskeyOkxPayViewModel$refreshAuthenticatorList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ SecurityPasskeyOkxPayViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityPasskeyOkxPayViewModel$refreshAuthenticatorList$1(SecurityPasskeyOkxPayViewModel securityPasskeyOkxPayViewModel, Continuation<? super SecurityPasskeyOkxPayViewModel$refreshAuthenticatorList$1> continuation) {
        super(2, continuation);
        this.this$0 = securityPasskeyOkxPayViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityPasskeyOkxPayViewModel$refreshAuthenticatorList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SecurityPasskeyOkxPayViewModel$refreshAuthenticatorList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object obj2;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Boolean boolKWHzl2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow2 = this.this$0.AEQbTJ;
            Boolean boolKWHzl3 = C56443yFo.KWHzl(true);
            this.label = 1;
            if (mutableSharedFlow2.emit(boolKWHzl3, this) == objCopydefault) {
                return objCopydefault;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    if (this.this$0.EZpvd.getValue() == 0) {
                        this.this$0.EZpvd.setValue(yDY.AhwBna());
                    }
                    return Unit.INSTANCE;
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (Result.m7384isSuccessimpl(obj2)) {
                    MutableLiveData mutableLiveData = this.this$0.EZpvd;
                    GetAuthenticatorListResponse getAuthenticatorListResponse = (GetAuthenticatorListResponse) (Result.m7383isFailureimpl(obj2) ? null : obj2);
                    List displayModelList$default = getAuthenticatorListResponse != null ? GetAuthenticatorListResponse.toDisplayModelList$default(getAuthenticatorListResponse, C33492mxV.OLrzqt(), true, false, false, false, 28, null) : null;
                    if (displayModelList$default == null) {
                        displayModelList$default = yDY.AhwBna();
                    }
                    mutableLiveData.setValue(displayModelList$default);
                    MutableLiveData mutableLiveData2 = this.this$0.OLrzqt;
                    if (Result.m7383isFailureimpl(obj2)) {
                        obj2 = null;
                    }
                    GetAuthenticatorListResponse getAuthenticatorListResponse2 = (GetAuthenticatorListResponse) obj2;
                    if (getAuthenticatorListResponse2 == null || (boolKWHzl2 = getAuthenticatorListResponse2.getAllowUnlink()) == null) {
                        boolKWHzl2 = C56443yFo.KWHzl(true);
                    }
                    mutableLiveData2.setValue(boolKWHzl2);
                    return Unit.INSTANCE;
                }
                MutableSharedFlow mutableSharedFlow3 = this.this$0.AYXKKw;
                Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                String message = thM7380exceptionOrNullimpl != null ? thM7380exceptionOrNullimpl.getMessage() : null;
                if (message == null) {
                    message = "";
                }
                this.L$0 = null;
                this.label = 4;
                if (mutableSharedFlow3.emit(message, this) == objCopydefault) {
                    return objCopydefault;
                }
                if (this.this$0.EZpvd.getValue() == 0) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
            obj2 = objAEQbTJ;
            mutableSharedFlow = this.this$0.AEQbTJ;
            boolKWHzl = C56443yFo.KWHzl(false);
            this.L$0 = obj2;
            this.label = 3;
            if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
            if (Result.m7384isSuccessimpl(obj2)) {
            }
        }
        C5982aGj c5982aGj = this.this$0.fetchVPNInfo;
        this.label = 2;
        objAEQbTJ = c5982aGj.AEQbTJ(this);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        obj2 = objAEQbTJ;
        mutableSharedFlow = this.this$0.AEQbTJ;
        boolKWHzl = C56443yFo.KWHzl(false);
        this.L$0 = obj2;
        this.label = 3;
        if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
        }
        if (Result.m7384isSuccessimpl(obj2)) {
        }
    }
}
