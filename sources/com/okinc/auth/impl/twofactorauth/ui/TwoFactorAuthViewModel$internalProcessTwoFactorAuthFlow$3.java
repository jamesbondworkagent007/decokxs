package com.okinc.auth.impl.twofactorauth.ui;

import com.okinc.account.api.model.security.otp.TwoFactorAuth;
import com.okinc.account.api.model.security.otp.TwoFactorAuthError;
import com.okinc.account.api.model.security.otp.TwoFactorAuthState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes3.dex */
public final class TwoFactorAuthViewModel$internalProcessTwoFactorAuthFlow$3<T> extends SuspendLambda implements yHO<FlowCollector<? super TwoFactorAuth<T>>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TwoFactorAuthViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoFactorAuthViewModel$internalProcessTwoFactorAuthFlow$3(TwoFactorAuthViewModel twoFactorAuthViewModel, Continuation<? super TwoFactorAuthViewModel$internalProcessTwoFactorAuthFlow$3> continuation) {
        super(3, continuation);
        this.this$0 = twoFactorAuthViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super TwoFactorAuth<T>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        TwoFactorAuthViewModel$internalProcessTwoFactorAuthFlow$3 twoFactorAuthViewModel$internalProcessTwoFactorAuthFlow$3 = new TwoFactorAuthViewModel$internalProcessTwoFactorAuthFlow$3(this.this$0, continuation);
        twoFactorAuthViewModel$internalProcessTwoFactorAuthFlow$3.L$0 = th;
        return twoFactorAuthViewModel$internalProcessTwoFactorAuthFlow$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Throwable th = (Throwable) this.L$0;
            if (!(th instanceof TwoFactorAuthError)) {
                MutableSharedFlow mutableSharedFlow = this.this$0.EZpvd;
                TwoFactorAuthState.UnknownError unknownError = new TwoFactorAuthState.UnknownError(-1, th.getMessage());
                this.label = 4;
                if (mutableSharedFlow.emit(unknownError, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                TwoFactorAuthError twoFactorAuthError = (TwoFactorAuthError) th;
                if (twoFactorAuthError instanceof TwoFactorAuthError.InvalidAuthCode) {
                    MutableSharedFlow mutableSharedFlow2 = this.this$0.EZpvd;
                    TwoFactorAuthError.InvalidAuthCode invalidAuthCode = (TwoFactorAuthError.InvalidAuthCode) th;
                    String attemptsLeft = invalidAuthCode.getAttemptsLeft();
                    if (attemptsLeft == null) {
                        attemptsLeft = "";
                    }
                    TwoFactorAuthState.InvalidAuthCode invalidAuthCode2 = new TwoFactorAuthState.InvalidAuthCode(attemptsLeft, invalidAuthCode.getErrors());
                    this.label = 1;
                    if (mutableSharedFlow2.emit(invalidAuthCode2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (twoFactorAuthError instanceof TwoFactorAuthError.MaxAttemptReached) {
                    MutableSharedFlow mutableSharedFlow3 = this.this$0.EZpvd;
                    TwoFactorAuthState.MaxAttemptReached maxAttemptReached = new TwoFactorAuthState.MaxAttemptReached(((TwoFactorAuthError.MaxAttemptReached) th).getMsg());
                    this.label = 2;
                    if (mutableSharedFlow3.emit(maxAttemptReached, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (twoFactorAuthError instanceof TwoFactorAuthError.Unknown) {
                    MutableSharedFlow mutableSharedFlow4 = this.this$0.EZpvd;
                    TwoFactorAuthError.Unknown unknown = (TwoFactorAuthError.Unknown) th;
                    TwoFactorAuthState.UnknownError unknownError2 = new TwoFactorAuthState.UnknownError(unknown.getCode(), unknown.getMsg());
                    this.label = 3;
                    if (mutableSharedFlow4.emit(unknownError2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
