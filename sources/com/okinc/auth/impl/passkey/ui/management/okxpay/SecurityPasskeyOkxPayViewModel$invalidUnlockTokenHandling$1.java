package com.okinc.auth.impl.passkey.ui.management.okxpay;

import com.okinc.auth.impl.passkey.model.GetAuthenticationTypeResponse;
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
import o.C5980aGh;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityPasskeyOkxPayViewModel$invalidUnlockTokenHandling$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ SecurityPasskeyOkxPayViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityPasskeyOkxPayViewModel$invalidUnlockTokenHandling$1(SecurityPasskeyOkxPayViewModel securityPasskeyOkxPayViewModel, Continuation<? super SecurityPasskeyOkxPayViewModel$invalidUnlockTokenHandling$1> continuation) {
        super(2, continuation);
        this.this$0 = securityPasskeyOkxPayViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityPasskeyOkxPayViewModel$invalidUnlockTokenHandling$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SecurityPasskeyOkxPayViewModel$invalidUnlockTokenHandling$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object obj2;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow2 = this.this$0.AEQbTJ;
            Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
            this.label = 1;
            if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
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
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (Result.m7384isSuccessimpl(obj2)) {
                    if (Result.m7383isFailureimpl(obj2)) {
                        obj2 = null;
                    }
                    GetAuthenticationTypeResponse getAuthenticationTypeResponse = (GetAuthenticationTypeResponse) obj2;
                    if (getAuthenticationTypeResponse != null) {
                        MutableSharedFlow mutableSharedFlow3 = this.this$0.KWHzl;
                        this.L$0 = null;
                        this.label = 4;
                        if (mutableSharedFlow3.emit(getAuthenticationTypeResponse, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl != null) {
                        MutableSharedFlow mutableSharedFlow4 = this.this$0.AYXKKw;
                        String message = thM7380exceptionOrNullimpl.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        this.L$0 = null;
                        this.label = 5;
                        if (mutableSharedFlow4.emit(message, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C5980aGh c5980aGh = this.this$0.AkhnZx;
        this.label = 2;
        objAEQbTJ = c5980aGh.AEQbTJ(this);
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
        return Unit.INSTANCE;
    }
}
