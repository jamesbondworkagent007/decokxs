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
import o.C5775aCo;
import o.C5779aCs;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class VerifyMfaOtpViewModel$verifyOtpCode$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $code;
    int label;
    final /* synthetic */ VerifyMfaOtpViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMfaOtpViewModel$verifyOtpCode$1(VerifyMfaOtpViewModel verifyMfaOtpViewModel, String str, Continuation<? super VerifyMfaOtpViewModel$verifyOtpCode$1> continuation) {
        super(2, continuation);
        this.this$0 = verifyMfaOtpViewModel;
        this.$code = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerifyMfaOtpViewModel$verifyOtpCode$1(this.this$0, this.$code, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VerifyMfaOtpViewModel$verifyOtpCode$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objKWHzl;
        Object value2;
        Object value3;
        Object value4;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.DbNXlk;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, C5779aCs.copy$default((C5779aCs) value, true, null, null, null, null, false, null, 124, null)));
            C5775aCo c5775aCo = this.this$0.getFieldNames;
            String str = (String) this.this$0.valueOf.getValue();
            if (str == null) {
                str = "";
            }
            String str2 = this.$code;
            OTP value5 = this.this$0.copydefault().getValue();
            if (value5 == null) {
                value5 = OTP.SMS;
            }
            SubdomainStrategy subdomainStrategy = (SubdomainStrategy) this.this$0.djBIcL.getValue();
            MfaScenario mfaScenario = (MfaScenario) this.this$0.OLrzqt.getValue();
            if (mfaScenario == null) {
                mfaScenario = MfaScenario.IsPostLogin;
            }
            this.label = 1;
            objKWHzl = c5775aCo.KWHzl(str, str2, value5, subdomainStrategy, mfaScenario, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3 && i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = obj;
        }
        MfaResult mfaResult = (MfaResult) objKWHzl;
        MutableStateFlow mutableStateFlow2 = this.this$0.DbNXlk;
        do {
            value2 = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.compareAndSet(value2, C5779aCs.copy$default((C5779aCs) value2, false, null, null, null, null, false, null, WebSocketProtocol.PAYLOAD_SHORT, null)));
        if (mfaResult instanceof MfaResult.Success) {
            MutableSharedFlow mutableSharedFlow = this.this$0.copydefault;
            MfaResponse mfaResponseKWHzl = ((MfaResult.Success) mfaResult).KWHzl();
            this.label = 2;
            if (mutableSharedFlow.emit(mfaResponseKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (!(mfaResult instanceof MfaResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            MfaResult.Failure failure = (MfaResult.Failure) mfaResult;
            MfaFailure mfaFailureKWHzl = failure.KWHzl();
            if (mfaFailureKWHzl instanceof MfaFailure.GenericFailure) {
                MutableStateFlow mutableStateFlow3 = this.this$0.DbNXlk;
                do {
                    value4 = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.compareAndSet(value4, C5779aCs.copy$default((C5779aCs) value4, false, ((MfaFailure.GenericFailure) failure.KWHzl()).EZpvd(), null, null, null, false, null, 125, null)));
            } else if (mfaFailureKWHzl instanceof MfaFailure.VerificationFailure) {
                MutableStateFlow mutableStateFlow4 = this.this$0.DbNXlk;
                do {
                    value3 = mutableStateFlow4.getValue();
                } while (!mutableStateFlow4.compareAndSet(value3, C5779aCs.copy$default((C5779aCs) value3, false, ((MfaFailure.VerificationFailure) failure.KWHzl()).copydefault(), null, null, null, false, null, 125, null)));
                MutableSharedFlow mutableSharedFlow2 = this.this$0.fetchVPNInfo;
                Unit unit = Unit.INSTANCE;
                this.label = 3;
                if (mutableSharedFlow2.emit(unit, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                MutableSharedFlow mutableSharedFlow3 = this.this$0.KWHzl;
                MfaFailure mfaFailureKWHzl2 = failure.KWHzl();
                this.label = 4;
                if (mutableSharedFlow3.emit(mfaFailureKWHzl2, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
