package com.okinc.auth.impl.passkey.ui.management.cefi;

import androidx.lifecycle.MutableLiveData;
import com.okinc.auth.impl.passkey.model.PasskeyResetStatusResponse;
import com.okinc.auth.impl.passkey.ui.management.cefi.SecurityFido2AuthenticatorViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C32989mnw;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5916aFW;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityFido2AuthenticatorViewModel$checkReviewingRequestForResetStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ SecurityFido2AuthenticatorViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityFido2AuthenticatorViewModel$checkReviewingRequestForResetStatus$1(SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel, Continuation<? super SecurityFido2AuthenticatorViewModel$checkReviewingRequestForResetStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = securityFido2AuthenticatorViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityFido2AuthenticatorViewModel$checkReviewingRequestForResetStatus$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SecurityFido2AuthenticatorViewModel$checkReviewingRequestForResetStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow2 = this.this$0.gEmmrt;
            Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
            this.label = 1;
            if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    objKWHzl = ((Result) obj).m7386unboximpl();
                    mutableSharedFlow = this.this$0.gEmmrt;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.L$0 = objKWHzl;
                    this.label = 3;
                    if (mutableSharedFlow.emit(boolKWHzl, this) != objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = objKWHzl;
                    SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel = this.this$0;
                    if (Result.m7384isSuccessimpl(obj2)) {
                    }
                    SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel2 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel3 = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                    securityFido2AuthenticatorViewModel3.AkhnZx.setValue(C56443yFo.KWHzl(!Intrinsics.EZpvd((Object) ((PasskeyResetStatusResponse) obj2).AEQbTJ(), (Object) "NONE")));
                }
                SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel22 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableLiveData mutableLiveData = securityFido2AuthenticatorViewModel22.EZpvd;
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    mutableLiveData.setValue(new C32989mnw(new SecurityFido2AuthenticatorViewModel.StateListAnimator.FragmentManager(message)));
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C5916aFW c5916aFW = this.this$0.gHZMYf;
        Unit unit = Unit.INSTANCE;
        this.label = 2;
        objKWHzl = c5916aFW.KWHzl(unit, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        mutableSharedFlow = this.this$0.gEmmrt;
        boolKWHzl = C56443yFo.KWHzl(false);
        this.L$0 = objKWHzl;
        this.label = 3;
        if (mutableSharedFlow.emit(boolKWHzl, this) != objCopydefault) {
        }
    }
}
