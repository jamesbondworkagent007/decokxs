package com.okinc.auth.impl.mfa.domain;

import com.okinc.auth.impl.mfa.data.MfaApiService;
import com.okinc.auth.impl.mfa.model.MaxOutSupportRequest;
import com.okinc.auth.impl.mfa.model.MfaResponse;
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
import o.C5766aCf;
import o.C5774aCn;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class MaxOutSupportNextStepUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C5766aCf.Application>, Object> {
    final /* synthetic */ MfaScenario $mfaScenario;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ SubdomainStrategy $subdomainStrategy;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5766aCf this$0;

    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;

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
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxOutSupportNextStepUseCase$invoke$2(MfaScenario mfaScenario, C5766aCf c5766aCf, SubdomainStrategy subdomainStrategy, String str, Continuation<? super MaxOutSupportNextStepUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$mfaScenario = mfaScenario;
        this.this$0 = c5766aCf;
        this.$subdomainStrategy = subdomainStrategy;
        this.$sessionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MaxOutSupportNextStepUseCase$invoke$2 maxOutSupportNextStepUseCase$invoke$2 = new MaxOutSupportNextStepUseCase$invoke$2(this.$mfaScenario, this.this$0, this.$subdomainStrategy, this.$sessionId, continuation);
        maxOutSupportNextStepUseCase$invoke$2.L$0 = obj;
        return maxOutSupportNextStepUseCase$invoke$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C5766aCf.Application> continuation) {
        return ((MaxOutSupportNextStepUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5766aCf.Application.StateListAnimator stateListAnimator;
        ResponseData responseData;
        MfaResponse mfaResponse;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                int i2 = Application.EZpvd[this.$mfaScenario.ordinal()];
                if (i2 == 1) {
                    MfaApiService mfaApiService = this.this$0.KWHzl;
                    SubdomainStrategy subdomainStrategy = this.$subdomainStrategy;
                    MaxOutSupportRequest maxOutSupportRequest = new MaxOutSupportRequest(this.$sessionId);
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    obj = mfaApiService.AEQbTJ(subdomainStrategy, maxOutSupportRequest, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    responseData = (ResponseData) obj;
                } else if (i2 == 2) {
                    MfaApiService mfaApiService2 = this.this$0.KWHzl;
                    SubdomainStrategy subdomainStrategy2 = this.$subdomainStrategy;
                    MaxOutSupportRequest maxOutSupportRequest2 = new MaxOutSupportRequest(this.$sessionId);
                    this.L$0 = coroutineScope;
                    this.label = 2;
                    obj = mfaApiService2.EZpvd(subdomainStrategy2, maxOutSupportRequest2, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    responseData = (ResponseData) obj;
                } else if (i2 == 3) {
                    MfaApiService mfaApiService3 = this.this$0.KWHzl;
                    SubdomainStrategy subdomainStrategy3 = this.$subdomainStrategy;
                    MaxOutSupportRequest maxOutSupportRequest3 = new MaxOutSupportRequest(this.$sessionId);
                    this.L$0 = coroutineScope;
                    this.label = 3;
                    obj = mfaApiService3.copydefault(subdomainStrategy3, maxOutSupportRequest3, this);
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
            mfaResponse = (MfaResponse) responseData.getData();
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            pUU.copydefault("MaxOutSupportNextStepUseCase", message);
            stateListAnimator = new C5766aCf.Application.StateListAnimator(C5774aCn.EZpvd(e));
        }
        if (mfaResponse != null) {
            return new C5766aCf.Application.TaskDescription(mfaResponse);
        }
        stateListAnimator = new C5766aCf.Application.StateListAnimator(C5774aCn.OLrzqt(responseData));
        return stateListAnimator;
    }
}
