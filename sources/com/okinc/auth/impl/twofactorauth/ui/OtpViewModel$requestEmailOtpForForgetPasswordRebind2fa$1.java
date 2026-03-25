package com.okinc.auth.impl.twofactorauth.ui;

import com.okinc.account.api.model.security.otp.Otp;
import com.okinc.account.api.model.security.otp.OtpAction;
import com.okinc.account.api.model.security.otp.OtpState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes3.dex */
public final class OtpViewModel$requestEmailOtpForForgetPasswordRebind2fa$1 extends SuspendLambda implements Function2<FlowCollector<? super Otp>, Continuation<? super Unit>, Object> {
    final /* synthetic */ OtpAction $otpAction;
    int label;
    final /* synthetic */ OtpViewModel this$0;

    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

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
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtpViewModel$requestEmailOtpForForgetPasswordRebind2fa$1(OtpAction otpAction, OtpViewModel otpViewModel, Continuation<? super OtpViewModel$requestEmailOtpForForgetPasswordRebind2fa$1> continuation) {
        super(2, continuation);
        this.$otpAction = otpAction;
        this.this$0 = otpViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OtpViewModel$requestEmailOtpForForgetPasswordRebind2fa$1(this.$otpAction, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Otp> flowCollector, Continuation<? super Unit> continuation) {
        return ((OtpViewModel$requestEmailOtpForForgetPasswordRebind2fa$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            int i2 = StateListAnimator.EZpvd[this.$otpAction.ordinal()];
            if (i2 == 1) {
                MutableSharedFlow mutableSharedFlow = this.this$0.copydefault;
                OtpState.OldLoading oldLoading = OtpState.OldLoading.INSTANCE;
                this.label = 1;
                if (mutableSharedFlow.emit(oldLoading, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else if (i2 == 2) {
                MutableSharedFlow mutableSharedFlow2 = this.this$0.copydefault;
                OtpState.NewLoading newLoading = OtpState.NewLoading.INSTANCE;
                this.label = 2;
                if (mutableSharedFlow2.emit(newLoading, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
