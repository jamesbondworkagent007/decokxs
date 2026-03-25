package com.okinc.auth.impl.passkey.domain;

import android.app.PendingIntent;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import com.google.android.gms.tasks.Task;
import com.okinc.auth.api.passkey.PasskeyPromotionAuthenticator;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.impl.mfa.model.MfaResponse;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.model.PasskeyRegistrationStartRequestBody;
import com.okinc.auth.impl.passkey.model.RegistrationStartResponse;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC5991aGs;
import o.C33488mxR;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5913aFT;
import o.C6617aSi;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyRegistrationUseCase$getRegistrationResult$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC5991aGs>, Object> {
    final /* synthetic */ PasskeyPromotionAuthenticator $authenticator;
    final /* synthetic */ boolean $isCredentialManager;
    final /* synthetic */ String $mfaSessionId;
    final /* synthetic */ String $passkeyEasyRegToken;
    final /* synthetic */ PasskeyScenario $scenario;
    int label;
    final /* synthetic */ C5913aFT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyRegistrationUseCase$getRegistrationResult$2(String str, String str2, PasskeyScenario passkeyScenario, C5913aFT c5913aFT, PasskeyPromotionAuthenticator passkeyPromotionAuthenticator, boolean z, Continuation<? super PasskeyRegistrationUseCase$getRegistrationResult$2> continuation) {
        super(2, continuation);
        this.$passkeyEasyRegToken = str;
        this.$mfaSessionId = str2;
        this.$scenario = passkeyScenario;
        this.this$0 = c5913aFT;
        this.$authenticator = passkeyPromotionAuthenticator;
        this.$isCredentialManager = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyRegistrationUseCase$getRegistrationResult$2(this.$passkeyEasyRegToken, this.$mfaSessionId, this.$scenario, this.this$0, this.$authenticator, this.$isCredentialManager, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC5991aGs> continuation) {
        return ((PasskeyRegistrationUseCase$getRegistrationResult$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object application;
        String message;
        Object objStartRegistration;
        Object objDexStartRegistration;
        ResponseData responseData;
        RegistrationStartResponse registrationStartResponse;
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                PasskeyRegistrationStartRequestBody passkeyRegistrationStartRequestBody = new PasskeyRegistrationStartRequestBody(this.$passkeyEasyRegToken, this.$mfaSessionId);
                PasskeyScenario passkeyScenario = this.$scenario;
                if (!(passkeyScenario instanceof PasskeyScenario.Asset) && !Intrinsics.EZpvd(passkeyScenario, PasskeyScenario.Account.AEQbTJ)) {
                    if (passkeyScenario instanceof PasskeyScenario.CedefiWallet) {
                        PasskeyApiService passkeyApiService = this.this$0.OLrzqt;
                        this.label = 2;
                        objDexStartRegistration = passkeyApiService.dexStartRegistration(passkeyRegistrationStartRequestBody, this);
                        if (objDexStartRegistration == objCopydefault) {
                            return objCopydefault;
                        }
                        responseData = (ResponseData) objDexStartRegistration;
                    } else {
                        if (Intrinsics.EZpvd(passkeyScenario, PasskeyScenario.Pay.EZpvd)) {
                            return new AbstractC5991aGs.Application("impossible scenario");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
                PasskeyApiService passkeyApiService2 = this.this$0.OLrzqt;
                this.label = 1;
                objStartRegistration = passkeyApiService2.startRegistration(passkeyRegistrationStartRequestBody, this);
                if (objStartRegistration == objCopydefault) {
                    return objCopydefault;
                }
                responseData = (ResponseData) objStartRegistration;
            } else if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                objStartRegistration = obj;
                responseData = (ResponseData) objStartRegistration;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objEZpvd = obj;
                    Intrinsics.checkNotNullExpressionValue(objEZpvd, "");
                    return new AbstractC5991aGs.LoaderManager((PendingIntent) objEZpvd);
                }
                C56391yDq.AEQbTJ(obj);
                objDexStartRegistration = obj;
                responseData = (ResponseData) objDexStartRegistration;
            }
            registrationStartResponse = (RegistrationStartResponse) responseData.getData();
        } catch (Exception e) {
            pUU.copydefault("PasskeyRegistrationUseCase", String.valueOf(e.getMessage()));
            List listGEmmrt = yDY.gEmmrt(C56443yFo.AEQbTJ(42007), C56443yFo.AEQbTJ(42013), C56443yFo.AEQbTJ(MfaResponse.SESSION_EXPIRED), C56443yFo.AEQbTJ(MfaResponse.SESSION_INVALID));
            boolean z = e instanceof OKServerException;
            if (z && listGEmmrt.contains(C56443yFo.AEQbTJ(((OKServerException) e).getCode()))) {
                return AbstractC5991aGs.FragmentManager.EZpvd;
            }
            if (z && ((OKServerException) e).getCode() == 42009) {
                String message2 = e.getMessage();
                return new AbstractC5991aGs.ActionBar(message2 != null ? message2 : "");
            }
            if (z && ((OKServerException) e).getCode() == 43019) {
                String message3 = e.getMessage();
                return new AbstractC5991aGs.StateListAnimator(message3 != null ? message3 : "");
            }
            if ((e instanceof IllegalArgumentException) && (message = e.getMessage()) != null && StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "UnsupportedAlgorithmIdentifierException", false, 2, (Object) null)) {
                return AbstractC5991aGs.PendingIntent.KWHzl;
            }
            application = new AbstractC5991aGs.Application(e.getMessage());
        }
        if (registrationStartResponse == null) {
            return new AbstractC5991aGs.Application("_null data");
        }
        RegistrationStartResponse.PublicKey publicKey = registrationStartResponse.getPublicKey();
        String strEZpvd = publicKey != null ? C33488mxR.EZpvd(publicKey) : null;
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        String strKWHzl = C6617aSi.KWHzl(strEZpvd, this.$authenticator);
        pUU.KWHzl("PasskeyRegistrationUseCase", "getRegistrationResult: finalJson: " + strKWHzl);
        if (!this.$isCredentialManager) {
            Task<PendingIntent> registerPendingIntent = this.this$0.copydefault.getRegisterPendingIntent(C6617aSi.KWHzl(strKWHzl));
            Intrinsics.checkNotNullExpressionValue(registerPendingIntent, "");
            this.label = 3;
            objEZpvd = C6617aSi.EZpvd(registerPendingIntent, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            Intrinsics.checkNotNullExpressionValue(objEZpvd, "");
            return new AbstractC5991aGs.LoaderManager((PendingIntent) objEZpvd);
        }
        application = new AbstractC5991aGs.TaskDescription(new CreatePublicKeyCredentialRequest(strKWHzl, null, false, null, false, 30, null));
        return application;
    }
}
