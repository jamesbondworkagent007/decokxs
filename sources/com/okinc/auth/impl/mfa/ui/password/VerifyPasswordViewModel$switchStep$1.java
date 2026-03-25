package com.okinc.auth.impl.mfa.ui.password;

import com.okinc.auth.impl.mfa.model.MfaFailure;
import com.okinc.auth.impl.mfa.model.MfaResponse;
import com.okinc.auth.impl.mfa.model.MfaResult;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.auth.impl.mfa.model.OTP;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5776aCp;

/* JADX INFO: loaded from: classes3.dex */
public final class VerifyPasswordViewModel$switchStep$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MfaScenario $mfaScenario;
    final /* synthetic */ OTP $targetOtpType;
    Object L$0;
    int label;
    final /* synthetic */ VerifyPasswordViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyPasswordViewModel$switchStep$1(VerifyPasswordViewModel verifyPasswordViewModel, OTP otp, MfaScenario mfaScenario, Continuation<? super VerifyPasswordViewModel$switchStep$1> continuation) {
        super(2, continuation);
        this.this$0 = verifyPasswordViewModel;
        this.$targetOtpType = otp;
        this.$mfaScenario = mfaScenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerifyPasswordViewModel$switchStep$1(this.this$0, this.$targetOtpType, this.$mfaScenario, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VerifyPasswordViewModel$switchStep$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String value;
        MfaResult mfaResult;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow mutableSharedFlow2 = this.this$0.EZpvd;
                Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
                this.label = 1;
                if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                    return objCopydefault;
                }
                C5776aCp c5776aCp = this.this$0.isConnected;
                value = this.this$0.AEQbTJ().getValue();
                if (value == null) {
                    value = "";
                }
                OTP otp = this.$targetOtpType;
                SubdomainStrategy value2 = this.this$0.gEmmrt().getValue();
                MfaScenario mfaScenario = this.$mfaScenario;
                this.label = 2;
                obj = c5776aCp.copydefault(value, otp, value2, mfaScenario, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                mfaResult = (MfaResult) obj;
                mutableSharedFlow = this.this$0.EZpvd;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = mfaResult;
                this.label = 3;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
                if (!(mfaResult instanceof MfaResult.Success)) {
                    MutableSharedFlow mutableSharedFlow3 = this.this$0.KWHzl;
                    MfaResponse mfaResponseKWHzl = ((MfaResult.Success) mfaResult).KWHzl();
                    this.L$0 = null;
                    this.label = 4;
                    if (mutableSharedFlow3.emit(mfaResponseKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (!(mfaResult instanceof MfaResult.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MfaResult.Failure failure = (MfaResult.Failure) mfaResult;
                    if (failure.KWHzl() instanceof MfaFailure.VerificationFailure) {
                        MutableSharedFlow mutableSharedFlow4 = this.this$0.copydefault;
                        String strCopydefault = ((MfaFailure.VerificationFailure) failure.KWHzl()).copydefault();
                        this.L$0 = null;
                        this.label = 5;
                        if (mutableSharedFlow4.emit(strCopydefault, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        MutableSharedFlow mutableSharedFlow5 = this.this$0.OLrzqt;
                        MfaFailure mfaFailureKWHzl = failure.KWHzl();
                        this.L$0 = null;
                        this.label = 6;
                        if (mutableSharedFlow5.emit(mfaFailureKWHzl, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                C5776aCp c5776aCp2 = this.this$0.isConnected;
                value = this.this$0.AEQbTJ().getValue();
                if (value == null) {
                }
                OTP otp2 = this.$targetOtpType;
                SubdomainStrategy value22 = this.this$0.gEmmrt().getValue();
                MfaScenario mfaScenario2 = this.$mfaScenario;
                this.label = 2;
                obj = c5776aCp2.copydefault(value, otp2, value22, mfaScenario2, this);
                if (obj == objCopydefault) {
                }
                mfaResult = (MfaResult) obj;
                mutableSharedFlow = this.this$0.EZpvd;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = mfaResult;
                this.label = 3;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                if (!(mfaResult instanceof MfaResult.Success)) {
                }
                return Unit.INSTANCE;
            case 2:
                C56391yDq.AEQbTJ(obj);
                mfaResult = (MfaResult) obj;
                mutableSharedFlow = this.this$0.EZpvd;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = mfaResult;
                this.label = 3;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                if (!(mfaResult instanceof MfaResult.Success)) {
                }
                return Unit.INSTANCE;
            case 3:
                mfaResult = (MfaResult) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (!(mfaResult instanceof MfaResult.Success)) {
                }
                return Unit.INSTANCE;
            case 4:
            case 5:
            case 6:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
