package com.okinc.auth.impl.passkey.ui.register.okxpay;

import com.okinc.auth.api.passkey.PasskeyState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5898aFE;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityRegisterOkxPayPasskeyServiceViewModel$initiateToCheckNextStep$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ SecurityRegisterOkxPayPasskeyServiceViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityRegisterOkxPayPasskeyServiceViewModel$initiateToCheckNextStep$1(SecurityRegisterOkxPayPasskeyServiceViewModel securityRegisterOkxPayPasskeyServiceViewModel, Continuation<? super SecurityRegisterOkxPayPasskeyServiceViewModel$initiateToCheckNextStep$1> continuation) {
        super(2, continuation);
        this.this$0 = securityRegisterOkxPayPasskeyServiceViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityRegisterOkxPayPasskeyServiceViewModel$initiateToCheckNextStep$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SecurityRegisterOkxPayPasskeyServiceViewModel$initiateToCheckNextStep$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5898aFE.Application application;
        MutableSharedFlow mutableSharedFlow;
        PasskeyState.RegisterError registerError;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C5898aFE c5898aFE = this.this$0.AhwBna;
            this.label = 1;
            obj = c5898aFE.OLrzqt(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    Unit unit = Unit.INSTANCE;
                    return Unit.INSTANCE;
                }
                application = (C5898aFE.Application) this.L$0;
                C56391yDq.AEQbTJ(obj);
                String message = ((C5898aFE.Application.TaskDescription) application).KWHzl().getMessage();
                String str = message != null ? message : "";
                mutableSharedFlow = this.this$0.AEQbTJ;
                registerError = new PasskeyState.RegisterError(str);
                this.L$0 = null;
                this.label = 3;
                if (mutableSharedFlow.emit(registerError, this) == objCopydefault) {
                    return objCopydefault;
                }
                Unit unit2 = Unit.INSTANCE;
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        application = (C5898aFE.Application) obj;
        if (Intrinsics.EZpvd(application, C5898aFE.Application.StateListAnimator.OLrzqt)) {
            this.this$0.KWHzl("");
        } else if (Intrinsics.EZpvd(application, C5898aFE.Application.C0817Application.EZpvd)) {
            this.this$0.gEmmrt();
        } else if (application instanceof C5898aFE.Application.TaskDescription) {
            MutableSharedFlow mutableSharedFlow2 = this.this$0.EZpvd;
            Boolean boolKWHzl = C56443yFo.KWHzl(false);
            this.L$0 = application;
            this.label = 2;
            if (mutableSharedFlow2.emit(boolKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
            String message2 = ((C5898aFE.Application.TaskDescription) application).KWHzl().getMessage();
            if (message2 != null) {
            }
            mutableSharedFlow = this.this$0.AEQbTJ;
            registerError = new PasskeyState.RegisterError(str);
            this.L$0 = null;
            this.label = 3;
            if (mutableSharedFlow.emit(registerError, this) == objCopydefault) {
            }
            Unit unit22 = Unit.INSTANCE;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
