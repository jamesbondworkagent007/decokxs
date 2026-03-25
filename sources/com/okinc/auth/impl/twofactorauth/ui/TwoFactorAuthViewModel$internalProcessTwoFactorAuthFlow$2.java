package com.okinc.auth.impl.twofactorauth.ui;

import com.okinc.account.api.model.security.otp.TwoFactorAuth;
import com.okinc.account.api.model.security.otp.TwoFactorAuthState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes3.dex */
public final class TwoFactorAuthViewModel$internalProcessTwoFactorAuthFlow$2<T> extends SuspendLambda implements Function2<TwoFactorAuth<T>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TwoFactorAuthViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoFactorAuthViewModel$internalProcessTwoFactorAuthFlow$2(TwoFactorAuthViewModel twoFactorAuthViewModel, Continuation<? super TwoFactorAuthViewModel$internalProcessTwoFactorAuthFlow$2> continuation) {
        super(2, continuation);
        this.this$0 = twoFactorAuthViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TwoFactorAuthViewModel$internalProcessTwoFactorAuthFlow$2 twoFactorAuthViewModel$internalProcessTwoFactorAuthFlow$2 = new TwoFactorAuthViewModel$internalProcessTwoFactorAuthFlow$2(this.this$0, continuation);
        twoFactorAuthViewModel$internalProcessTwoFactorAuthFlow$2.L$0 = obj;
        return twoFactorAuthViewModel$internalProcessTwoFactorAuthFlow$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TwoFactorAuth<T> twoFactorAuth, Continuation<? super Unit> continuation) {
        return ((TwoFactorAuthViewModel$internalProcessTwoFactorAuthFlow$2) create(twoFactorAuth, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            TwoFactorAuth twoFactorAuth = (TwoFactorAuth) this.L$0;
            MutableSharedFlow mutableSharedFlow = this.this$0.EZpvd;
            TwoFactorAuthState.Success success = new TwoFactorAuthState.Success(twoFactorAuth.getData());
            this.label = 1;
            if (mutableSharedFlow.emit(success, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
