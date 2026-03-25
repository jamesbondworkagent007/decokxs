package com.okinc.auth.impl.mfa.domain;

import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.impl.mfa.data.MfaApiService;
import com.okinc.auth.impl.mfa.model.MfaResponse;
import com.okinc.auth.impl.mfa.model.MfaResult;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.auth.impl.mfa.model.StartRequest;
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
import o.C5773aCm;
import o.C5774aCn;
import o.InterfaceC8196ayF;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class StartMfaUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MfaResult>, Object> {
    final /* synthetic */ MfaScenario $mfaScenario;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ SubdomainStrategy $subdomainStrategy;
    int label;
    final /* synthetic */ C5773aCm this$0;

    /* JADX INFO: loaded from: classes17.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MfaScenario.values().length];
            try {
                iArr[MfaScenario.IsNonAuth.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MfaScenario.IsPostLogin.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MfaScenario.IsPartialAuth.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartMfaUseCase$invoke$2(C5773aCm c5773aCm, MfaScenario mfaScenario, SubdomainStrategy subdomainStrategy, String str, Continuation<? super StartMfaUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c5773aCm;
        this.$mfaScenario = mfaScenario;
        this.$subdomainStrategy = subdomainStrategy;
        this.$sessionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StartMfaUseCase$invoke$2(this.this$0, this.$mfaScenario, this.$subdomainStrategy, this.$sessionId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MfaResult> continuation) {
        return ((StartMfaUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ResponseData responseData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC8196ayF interfaceC8196ayF = this.this$0.EZpvd;
                PasskeyScenario.Account account = PasskeyScenario.Account.AEQbTJ;
                this.label = 1;
                obj = interfaceC8196ayF.copydefault(account, true, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        C56391yDq.AEQbTJ(obj);
                        responseData = (ResponseData) obj;
                        return C5774aCn.EZpvd((ResponseData<MfaResponse>) responseData);
                    }
                    if (i == 3) {
                        C56391yDq.AEQbTJ(obj);
                        responseData = (ResponseData) obj;
                        return C5774aCn.EZpvd((ResponseData<MfaResponse>) responseData);
                    }
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    responseData = (ResponseData) obj;
                    return C5774aCn.EZpvd((ResponseData<MfaResponse>) responseData);
                }
                C56391yDq.AEQbTJ(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            int i2 = TaskDescription.KWHzl[this.$mfaScenario.ordinal()];
            if (i2 == 1) {
                MfaApiService mfaApiService = this.this$0.OLrzqt;
                SubdomainStrategy subdomainStrategy = this.$subdomainStrategy;
                StartRequest startRequest = new StartRequest(this.$sessionId, zBooleanValue);
                this.label = 2;
                obj = mfaApiService.EZpvd(subdomainStrategy, startRequest, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                responseData = (ResponseData) obj;
                return C5774aCn.EZpvd((ResponseData<MfaResponse>) responseData);
            }
            if (i2 == 2) {
                MfaApiService mfaApiService2 = this.this$0.OLrzqt;
                SubdomainStrategy subdomainStrategy2 = this.$subdomainStrategy;
                StartRequest startRequest2 = new StartRequest(this.$sessionId, zBooleanValue);
                this.label = 3;
                obj = mfaApiService2.OLrzqt(subdomainStrategy2, startRequest2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                responseData = (ResponseData) obj;
                return C5774aCn.EZpvd((ResponseData<MfaResponse>) responseData);
            }
            if (i2 == 3) {
                MfaApiService mfaApiService3 = this.this$0.OLrzqt;
                SubdomainStrategy subdomainStrategy3 = this.$subdomainStrategy;
                StartRequest startRequest3 = new StartRequest(this.$sessionId, zBooleanValue);
                this.label = 4;
                obj = mfaApiService3.copydefault(subdomainStrategy3, startRequest3, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                responseData = (ResponseData) obj;
                return C5774aCn.EZpvd((ResponseData<MfaResponse>) responseData);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            pUU.copydefault("StartMfaUseCase", message);
            return new MfaResult.Failure(C5774aCn.EZpvd(e));
        }
    }
}
