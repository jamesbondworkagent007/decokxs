package com.okinc.auth.impl.mfa.ui.verifymfaotp;

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
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C5776aCp;
import o.C5779aCs;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class VerifyMfaOtpViewModel$switchOtpType$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MfaScenario $mfaScenario;
    final /* synthetic */ OTP $targetOtpType;
    int label;
    final /* synthetic */ VerifyMfaOtpViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMfaOtpViewModel$switchOtpType$1(VerifyMfaOtpViewModel verifyMfaOtpViewModel, OTP otp, MfaScenario mfaScenario, Continuation<? super VerifyMfaOtpViewModel$switchOtpType$1> continuation) {
        super(2, continuation);
        this.this$0 = verifyMfaOtpViewModel;
        this.$targetOtpType = otp;
        this.$mfaScenario = mfaScenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerifyMfaOtpViewModel$switchOtpType$1(this.this$0, this.$targetOtpType, this.$mfaScenario, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VerifyMfaOtpViewModel$switchOtpType$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objCopydefault;
        MfaResult mfaResult;
        MutableStateFlow mutableStateFlow;
        Object value2;
        Object value3;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.copydefault().getValue() == OTP.SMS) {
                OTP otp = this.$targetOtpType;
                OTP otp2 = OTP.VOICE;
                if (otp == otp2) {
                    this.this$0.AEQbTJ(otp2);
                    this.this$0.OLrzqt(otp2);
                }
            }
            MutableStateFlow mutableStateFlow2 = this.this$0.DbNXlk;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, C5779aCs.copy$default((C5779aCs) value, true, null, null, null, null, false, null, 124, null)));
            C5776aCp c5776aCp = this.this$0.iwGUEr;
            String str = (String) this.this$0.valueOf.getValue();
            if (str == null) {
                str = "";
            }
            OTP otp3 = this.$targetOtpType;
            SubdomainStrategy subdomainStrategy = (SubdomainStrategy) this.this$0.djBIcL.getValue();
            MfaScenario mfaScenario = this.$mfaScenario;
            this.label = 1;
            objCopydefault = c5776aCp.copydefault(str, otp3, subdomainStrategy, mfaScenario, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            mfaResult = (MfaResult) objCopydefault;
            mutableStateFlow = this.this$0.DbNXlk;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, C5779aCs.copy$default((C5779aCs) value2, false, null, null, null, null, false, null, WebSocketProtocol.PAYLOAD_SHORT, null)));
            if (!(mfaResult instanceof MfaResult.Success)) {
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            objCopydefault = obj;
            mfaResult = (MfaResult) objCopydefault;
            mutableStateFlow = this.this$0.DbNXlk;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, C5779aCs.copy$default((C5779aCs) value2, false, null, null, null, null, false, null, WebSocketProtocol.PAYLOAD_SHORT, null)));
            if (!(mfaResult instanceof MfaResult.Success)) {
                MutableSharedFlow mutableSharedFlow = this.this$0.copydefault;
                MfaResponse mfaResponseKWHzl = ((MfaResult.Success) mfaResult).KWHzl();
                this.label = 2;
                if (mutableSharedFlow.emit(mfaResponseKWHzl, this) == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (!(mfaResult instanceof MfaResult.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                MfaResult.Failure failure = (MfaResult.Failure) mfaResult;
                if (failure.KWHzl() instanceof MfaFailure.VerificationFailure) {
                    MutableStateFlow mutableStateFlow3 = this.this$0.DbNXlk;
                    do {
                        value3 = mutableStateFlow3.getValue();
                    } while (!mutableStateFlow3.compareAndSet(value3, C5779aCs.copy$default((C5779aCs) value3, false, ((MfaFailure.VerificationFailure) failure.KWHzl()).copydefault(), null, null, null, false, null, 125, null)));
                } else {
                    MutableSharedFlow mutableSharedFlow2 = this.this$0.KWHzl;
                    MfaFailure mfaFailureKWHzl = failure.KWHzl();
                    this.label = 3;
                    if (mutableSharedFlow2.emit(mfaFailureKWHzl, this) == objCopydefault2) {
                        return objCopydefault2;
                    }
                }
            }
        } else {
            if (i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
