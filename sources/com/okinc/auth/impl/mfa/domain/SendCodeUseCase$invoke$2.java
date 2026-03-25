package com.okinc.auth.impl.mfa.domain;

import com.okinc.auth.impl.mfa.data.MfaApiService;
import com.okinc.auth.impl.mfa.domain.SendCodeResult;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.auth.impl.mfa.model.OTP;
import com.okinc.auth.impl.mfa.model.SendCodeRequest;
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
import o.C5771aCk;
import o.C5774aCn;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class SendCodeUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SendCodeResult>, Object> {
    final /* synthetic */ MfaScenario $mfaScenario;
    final /* synthetic */ OTP $sendType;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ SubdomainStrategy $subdomainStrategy;
    int label;
    final /* synthetic */ C5771aCk this$0;

    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] copydefault;

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
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendCodeUseCase$invoke$2(MfaScenario mfaScenario, C5771aCk c5771aCk, SubdomainStrategy subdomainStrategy, String str, OTP otp, Continuation<? super SendCodeUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$mfaScenario = mfaScenario;
        this.this$0 = c5771aCk;
        this.$subdomainStrategy = subdomainStrategy;
        this.$sessionId = str;
        this.$sendType = otp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SendCodeUseCase$invoke$2(this.$mfaScenario, this.this$0, this.$subdomainStrategy, this.$sessionId, this.$sendType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SendCodeResult> continuation) {
        return ((SendCodeUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        SendCodeResult.Failure failure;
        ResponseData responseData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                int i2 = Application.copydefault[this.$mfaScenario.ordinal()];
                if (i2 == 1) {
                    MfaApiService mfaApiService = this.this$0.AEQbTJ;
                    SubdomainStrategy subdomainStrategy = this.$subdomainStrategy;
                    SendCodeRequest sendCodeRequest = new SendCodeRequest(this.$sessionId, this.$sendType.getKey());
                    this.label = 1;
                    obj = mfaApiService.EZpvd(subdomainStrategy, sendCodeRequest, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    responseData = (ResponseData) obj;
                } else if (i2 == 2) {
                    MfaApiService mfaApiService2 = this.this$0.AEQbTJ;
                    SubdomainStrategy subdomainStrategy2 = this.$subdomainStrategy;
                    SendCodeRequest sendCodeRequest2 = new SendCodeRequest(this.$sessionId, this.$sendType.getKey());
                    this.label = 2;
                    obj = mfaApiService2.OLrzqt(subdomainStrategy2, sendCodeRequest2, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    responseData = (ResponseData) obj;
                } else if (i2 == 3) {
                    MfaApiService mfaApiService3 = this.this$0.AEQbTJ;
                    SubdomainStrategy subdomainStrategy3 = this.$subdomainStrategy;
                    SendCodeRequest sendCodeRequest3 = new SendCodeRequest(this.$sessionId, this.$sendType.getKey());
                    this.label = 3;
                    obj = mfaApiService3.AEQbTJ(subdomainStrategy3, sendCodeRequest3, this);
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
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            pUU.copydefault("SendCodeUseCase", message);
            failure = new SendCodeResult.Failure(C5774aCn.EZpvd(e));
        }
        if (responseData.getCode() == 0) {
            return SendCodeResult.Success.copydefault;
        }
        failure = new SendCodeResult.Failure(C5774aCn.OLrzqt(responseData));
        return failure;
    }
}
