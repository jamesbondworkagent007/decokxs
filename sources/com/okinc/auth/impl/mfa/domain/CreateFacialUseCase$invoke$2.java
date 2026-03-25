package com.okinc.auth.impl.mfa.domain;

import com.okinc.auth.impl.mfa.data.MfaApiService;
import com.okinc.auth.impl.mfa.model.MfaCreateFacialRequest;
import com.okinc.auth.impl.mfa.model.MfaCreateFacialResponse;
import com.okinc.auth.impl.mfa.model.MfaFailure;
import com.okinc.auth.impl.mfa.model.MfaScenario;
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
import o.C5707aBZ;
import o.C5774aCn;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class CreateFacialUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C5707aBZ.Activity>, Object> {
    final /* synthetic */ MfaScenario $mfaScenario;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ SubdomainStrategy $subdomainStrategy;
    int label;
    final /* synthetic */ C5707aBZ this$0;

    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

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
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateFacialUseCase$invoke$2(MfaScenario mfaScenario, C5707aBZ c5707aBZ, SubdomainStrategy subdomainStrategy, String str, Continuation<? super CreateFacialUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$mfaScenario = mfaScenario;
        this.this$0 = c5707aBZ;
        this.$subdomainStrategy = subdomainStrategy;
        this.$sessionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateFacialUseCase$invoke$2(this.$mfaScenario, this.this$0, this.$subdomainStrategy, this.$sessionId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C5707aBZ.Activity> continuation) {
        return ((CreateFacialUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ResponseData responseData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                int i2 = ActionBar.OLrzqt[this.$mfaScenario.ordinal()];
                if (i2 == 1) {
                    MfaApiService mfaApiService = this.this$0.EZpvd;
                    SubdomainStrategy subdomainStrategy = this.$subdomainStrategy;
                    MfaCreateFacialRequest mfaCreateFacialRequest = new MfaCreateFacialRequest(this.$sessionId);
                    this.label = 1;
                    obj = mfaApiService.copydefault(subdomainStrategy, mfaCreateFacialRequest, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    responseData = (ResponseData) obj;
                } else if (i2 == 2) {
                    MfaApiService mfaApiService2 = this.this$0.EZpvd;
                    SubdomainStrategy subdomainStrategy2 = this.$subdomainStrategy;
                    MfaCreateFacialRequest mfaCreateFacialRequest2 = new MfaCreateFacialRequest(this.$sessionId);
                    this.label = 2;
                    obj = mfaApiService2.KWHzl(subdomainStrategy2, mfaCreateFacialRequest2, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    responseData = (ResponseData) obj;
                } else if (i2 == 3) {
                    MfaApiService mfaApiService3 = this.this$0.EZpvd;
                    SubdomainStrategy subdomainStrategy3 = this.$subdomainStrategy;
                    MfaCreateFacialRequest mfaCreateFacialRequest3 = new MfaCreateFacialRequest(this.$sessionId);
                    this.label = 3;
                    obj = mfaApiService3.EZpvd(subdomainStrategy3, mfaCreateFacialRequest3, this);
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
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                MfaCreateFacialResponse mfaCreateFacialResponse = (MfaCreateFacialResponse) responseData.getData();
                String faceVerificationSessionId = mfaCreateFacialResponse != null ? mfaCreateFacialResponse.getFaceVerificationSessionId() : null;
                if (faceVerificationSessionId == null) {
                    faceVerificationSessionId = "";
                }
                return new C5707aBZ.Activity.C0811Activity(faceVerificationSessionId);
            }
            return new C5707aBZ.Activity.StateListAnimator(new MfaFailure.GenericFailure(null, "Invalid response", 1, null));
        } catch (Exception e) {
            String message = e.getMessage();
            pUU.copydefault("CreateFacialUseCase", message != null ? message : "");
            return new C5707aBZ.Activity.StateListAnimator(C5774aCn.EZpvd(e));
        }
    }
}
