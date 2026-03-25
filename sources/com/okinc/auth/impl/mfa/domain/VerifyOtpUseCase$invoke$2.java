package com.okinc.auth.impl.mfa.domain;

import com.okinc.auth.impl.mfa.data.MfaApiService;
import com.okinc.auth.impl.mfa.model.MfaResponse;
import com.okinc.auth.impl.mfa.model.MfaResult;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.auth.impl.mfa.model.OTP;
import com.okinc.auth.impl.mfa.model.VerifyCodeRequest;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.ResponseData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C5774aCn;
import o.C5775aCo;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class VerifyOtpUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MfaResult>, Object> {
    final /* synthetic */ OTP $authType;
    final /* synthetic */ String $code;
    final /* synthetic */ MfaScenario $mfaScenario;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ SubdomainStrategy $subdomainStrategy;
    int label;
    final /* synthetic */ C5775aCo this$0;

    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MfaScenario.values().length];
            try {
                iArr[MfaScenario.IsNonAuth.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MfaScenario.IsPartialAuth.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MfaScenario.IsPostLogin.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyOtpUseCase$invoke$2(MfaScenario mfaScenario, C5775aCo c5775aCo, SubdomainStrategy subdomainStrategy, String str, String str2, OTP otp, Continuation<? super VerifyOtpUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$mfaScenario = mfaScenario;
        this.this$0 = c5775aCo;
        this.$subdomainStrategy = subdomainStrategy;
        this.$sessionId = str;
        this.$code = str2;
        this.$authType = otp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerifyOtpUseCase$invoke$2(this.$mfaScenario, this.this$0, this.$subdomainStrategy, this.$sessionId, this.$code, this.$authType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MfaResult> continuation) {
        return ((VerifyOtpUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ResponseData responseData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                int i2 = StateListAnimator.AEQbTJ[this.$mfaScenario.ordinal()];
                if (i2 == 1) {
                    MfaApiService mfaApiService = this.this$0.copydefault;
                    SubdomainStrategy subdomainStrategy = this.$subdomainStrategy;
                    VerifyCodeRequest verifyCodeRequest = new VerifyCodeRequest(this.$sessionId, this.$code, this.$authType.getKey());
                    this.label = 1;
                    obj = mfaApiService.EZpvd(subdomainStrategy, verifyCodeRequest, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    responseData = (ResponseData) obj;
                } else if (i2 == 2) {
                    MfaApiService mfaApiService2 = this.this$0.copydefault;
                    SubdomainStrategy subdomainStrategy2 = this.$subdomainStrategy;
                    VerifyCodeRequest verifyCodeRequest2 = new VerifyCodeRequest(this.$sessionId, this.$code, this.$authType.getKey());
                    this.label = 2;
                    obj = mfaApiService2.KWHzl(subdomainStrategy2, verifyCodeRequest2, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    responseData = (ResponseData) obj;
                } else if (i2 == 3) {
                    MfaApiService mfaApiService3 = this.this$0.copydefault;
                    SubdomainStrategy subdomainStrategy3 = this.$subdomainStrategy;
                    VerifyCodeRequest verifyCodeRequest3 = new VerifyCodeRequest(this.$sessionId, this.$code, this.$authType.getKey());
                    this.label = 3;
                    obj = mfaApiService3.AEQbTJ(subdomainStrategy3, verifyCodeRequest3, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    responseData = (ResponseData) obj;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                responseData = (ResponseData) obj;
            } else if (i == 2) {
                C56391yDq.AEQbTJ(obj);
                responseData = (ResponseData) obj;
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                responseData = (ResponseData) obj;
            }
            return C5774aCn.EZpvd((ResponseData<MfaResponse>) responseData);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            pUU.copydefault("VerifyOtpUseCase", message);
            return new MfaResult.Failure(C5774aCn.EZpvd(e));
        }
    }
}
