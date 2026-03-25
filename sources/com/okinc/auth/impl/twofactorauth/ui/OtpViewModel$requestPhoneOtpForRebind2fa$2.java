package com.okinc.auth.impl.twofactorauth.ui;

import com.okinc.account.api.model.security.otp.Otp;
import com.okinc.account.api.model.security.otp.OtpAction;
import com.okinc.account.api.model.security.otp.OtpState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes3.dex */
public final class OtpViewModel$requestPhoneOtpForRebind2fa$2 extends SuspendLambda implements Function2<Otp, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $msgType;
    final /* synthetic */ OtpAction $otpAction;
    int label;
    final /* synthetic */ OtpViewModel this$0;

    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class TaskDescription {
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
    public OtpViewModel$requestPhoneOtpForRebind2fa$2(OtpAction otpAction, OtpViewModel otpViewModel, int i, Continuation<? super OtpViewModel$requestPhoneOtpForRebind2fa$2> continuation) {
        super(2, continuation);
        this.$otpAction = otpAction;
        this.this$0 = otpViewModel;
        this.$msgType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OtpViewModel$requestPhoneOtpForRebind2fa$2(this.$otpAction, this.this$0, this.$msgType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Otp otp, Continuation<? super Unit> continuation) {
        return ((OtpViewModel$requestPhoneOtpForRebind2fa$2) create(otp, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            int i2 = TaskDescription.EZpvd[this.$otpAction.ordinal()];
            if (i2 == 1) {
                MutableSharedFlow mutableSharedFlow = this.this$0.OLrzqt;
                OtpState.OldSuccess oldSuccess = new OtpState.OldSuccess(C56443yFo.AEQbTJ(this.$msgType));
                this.label = 1;
                if (mutableSharedFlow.emit(oldSuccess, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else if (i2 == 2) {
                MutableSharedFlow mutableSharedFlow2 = this.this$0.OLrzqt;
                OtpState.NewSuccess newSuccess = new OtpState.NewSuccess(C56443yFo.AEQbTJ(this.$msgType));
                this.label = 2;
                if (mutableSharedFlow2.emit(newSuccess, this) == objCopydefault) {
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
