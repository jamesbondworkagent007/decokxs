package com.okinc.auth.impl.mfa.ui.verifymfaotp;

import com.okinc.auth.impl.mfa.domain.SendCodeResult;
import com.okinc.auth.impl.mfa.model.MfaFailure;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.auth.impl.mfa.model.OTP;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5771aCk;
import o.C5779aCs;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class VerifyMfaOtpViewModel$sendOtpCode$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OTP $sendCodeType;
    int label;
    final /* synthetic */ VerifyMfaOtpViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMfaOtpViewModel$sendOtpCode$1(VerifyMfaOtpViewModel verifyMfaOtpViewModel, OTP otp, Continuation<? super VerifyMfaOtpViewModel$sendOtpCode$1> continuation) {
        super(2, continuation);
        this.this$0 = verifyMfaOtpViewModel;
        this.$sendCodeType = otp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerifyMfaOtpViewModel$sendOtpCode$1(this.this$0, this.$sendCodeType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VerifyMfaOtpViewModel$sendOtpCode$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        SendCodeResult sendCodeResult;
        MutableStateFlow mutableStateFlow;
        Object value2;
        Object value3;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                MutableStateFlow mutableStateFlow2 = this.this$0.DbNXlk;
                do {
                    value = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value, C5779aCs.copy$default((C5779aCs) value, true, null, null, null, null, false, null, 124, null)));
                C5771aCk c5771aCk = this.this$0.ejfBZ;
                String str = (String) this.this$0.valueOf.getValue();
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                OTP otp = this.$sendCodeType;
                SubdomainStrategy subdomainStrategy = (SubdomainStrategy) this.this$0.djBIcL.getValue();
                MfaScenario mfaScenario = (MfaScenario) this.this$0.OLrzqt.getValue();
                if (mfaScenario == null) {
                    mfaScenario = MfaScenario.IsPostLogin;
                }
                this.label = 1;
                obj = c5771aCk.OLrzqt(str2, otp, subdomainStrategy, mfaScenario, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                sendCodeResult = (SendCodeResult) obj;
                mutableStateFlow = this.this$0.DbNXlk;
                do {
                    value2 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value2, C5779aCs.copy$default((C5779aCs) value2, false, null, null, null, null, false, null, WebSocketProtocol.PAYLOAD_SHORT, null)));
                if (!(sendCodeResult instanceof SendCodeResult.Success)) {
                    MutableSharedFlow mutableSharedFlow = this.this$0.AYXKKw;
                    Unit unit = Unit.INSTANCE;
                    this.label = 2;
                    if (mutableSharedFlow.emit(unit, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (!(sendCodeResult instanceof SendCodeResult.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SendCodeResult.Failure failure = (SendCodeResult.Failure) sendCodeResult;
                    MfaFailure mfaFailureKWHzl = failure.KWHzl();
                    if (mfaFailureKWHzl instanceof MfaFailure.TooManyOtpRequest) {
                        MutableSharedFlow mutableSharedFlow2 = this.this$0.values;
                        Long lKWHzl = C56443yFo.KWHzl(((MfaFailure.TooManyOtpRequest) failure.KWHzl()).OLrzqt());
                        this.label = 3;
                        if (mutableSharedFlow2.emit(lKWHzl, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (mfaFailureKWHzl instanceof MfaFailure.GenericFailure) {
                        if (Intrinsics.EZpvd((Object) ((MfaFailure.GenericFailure) failure.KWHzl()).copydefault(), (Object) "33201")) {
                            MutableSharedFlow mutableSharedFlow3 = this.this$0.AEQbTJ;
                            String strEZpvd = ((MfaFailure.GenericFailure) failure.KWHzl()).EZpvd();
                            this.label = 4;
                            if (mutableSharedFlow3.emit(strEZpvd, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            MutableSharedFlow mutableSharedFlow4 = this.this$0.KWHzl;
                            MfaFailure mfaFailureKWHzl2 = failure.KWHzl();
                            this.label = 5;
                            if (mutableSharedFlow4.emit(mfaFailureKWHzl2, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                    } else if (mfaFailureKWHzl instanceof MfaFailure.VerificationFailure) {
                        MutableStateFlow mutableStateFlow3 = this.this$0.DbNXlk;
                        do {
                            value3 = mutableStateFlow3.getValue();
                        } while (!mutableStateFlow3.compareAndSet(value3, C5779aCs.copy$default((C5779aCs) value3, false, ((MfaFailure.VerificationFailure) failure.KWHzl()).copydefault(), null, null, null, false, null, 125, null)));
                    } else {
                        MutableSharedFlow mutableSharedFlow5 = this.this$0.KWHzl;
                        MfaFailure mfaFailureKWHzl3 = failure.KWHzl();
                        this.label = 6;
                        if (mutableSharedFlow5.emit(mfaFailureKWHzl3, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                sendCodeResult = (SendCodeResult) obj;
                mutableStateFlow = this.this$0.DbNXlk;
                do {
                    value2 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value2, C5779aCs.copy$default((C5779aCs) value2, false, null, null, null, null, false, null, WebSocketProtocol.PAYLOAD_SHORT, null)));
                if (!(sendCodeResult instanceof SendCodeResult.Success)) {
                }
                return Unit.INSTANCE;
            case 2:
            case 3:
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
