package com.okinc.auth.impl.twofactorauth.ui;

import com.okinc.account.api.model.security.otp.Otp;
import com.okinc.account.api.model.security.otp.OtpAction;
import com.okinc.account.api.model.security.otp.OtpError;
import com.okinc.account.api.model.security.otp.OtpState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes3.dex */
public final class OtpViewModel$requestEmailOtpForRebind2fa$3 extends SuspendLambda implements yHO<FlowCollector<? super Otp>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ OtpAction $otpAction;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ OtpViewModel this$0;

    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OtpAction.values().length];
            try {
                iArr[OtpAction.OLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OtpAction.NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtpViewModel$requestEmailOtpForRebind2fa$3(OtpAction otpAction, OtpViewModel otpViewModel, Continuation<? super OtpViewModel$requestEmailOtpForRebind2fa$3> continuation) {
        super(3, continuation);
        this.$otpAction = otpAction;
        this.this$0 = otpViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super Otp> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        OtpViewModel$requestEmailOtpForRebind2fa$3 otpViewModel$requestEmailOtpForRebind2fa$3 = new OtpViewModel$requestEmailOtpForRebind2fa$3(this.$otpAction, this.this$0, continuation);
        otpViewModel$requestEmailOtpForRebind2fa$3.L$0 = flowCollector;
        otpViewModel$requestEmailOtpForRebind2fa$3.L$1 = th;
        return otpViewModel$requestEmailOtpForRebind2fa$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i == 1 || i == 2) {
            } else if (i != 3 && i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Throwable th = (Throwable) this.L$1;
            OtpError otpError = th instanceof OtpError ? (OtpError) th : null;
            if (otpError != null) {
                OtpAction otpAction = this.$otpAction;
                OtpViewModel otpViewModel = this.this$0;
                int i2 = Application.AEQbTJ[otpAction.ordinal()];
                if (i2 == 1) {
                    MutableSharedFlow mutableSharedFlow = otpViewModel.copydefault;
                    OtpState.OldError oldError = new OtpState.OldError(otpError.getCode(), otpError.getMsg());
                    this.L$0 = flowCollector;
                    this.label = 1;
                    if (mutableSharedFlow.emit(oldError, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (i2 == 2) {
                    MutableSharedFlow mutableSharedFlow2 = otpViewModel.copydefault;
                    OtpState.NewError newError = new OtpState.NewError(otpError.getCode(), otpError.getMsg());
                    this.L$0 = flowCollector;
                    this.label = 2;
                    if (mutableSharedFlow2.emit(newError, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                OtpAction otpAction2 = this.$otpAction;
                OtpViewModel otpViewModel2 = this.this$0;
                int i3 = Application.AEQbTJ[otpAction2.ordinal()];
                if (i3 == 1) {
                    MutableSharedFlow mutableSharedFlow3 = otpViewModel2.copydefault;
                    OtpState.OldError oldError2 = new OtpState.OldError(0, "");
                    this.L$0 = null;
                    this.label = 3;
                    if (mutableSharedFlow3.emit(oldError2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (i3 == 2) {
                    MutableSharedFlow mutableSharedFlow4 = otpViewModel2.copydefault;
                    OtpState.NewError newError2 = new OtpState.NewError(0, "");
                    this.L$0 = null;
                    this.label = 4;
                    if (mutableSharedFlow4.emit(newError2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
