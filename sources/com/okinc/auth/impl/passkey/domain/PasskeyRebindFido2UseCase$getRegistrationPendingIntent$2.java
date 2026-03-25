package com.okinc.auth.impl.passkey.domain;

import android.app.PendingIntent;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.tasks.Task;
import com.okinc.auth.api.passkey.PasskeyPromotionAuthenticator;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.model.PasskeyRebindStartRequestBody;
import com.okinc.auth.impl.passkey.model.RegistrationStartResponse;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
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
import o.C5914aFU;
import o.C6617aSi;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyRebindFido2UseCase$getRegistrationPendingIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC5991aGs>, Object> {
    final /* synthetic */ PasskeyPromotionAuthenticator $authenticator;
    final /* synthetic */ String $workflowToken;
    int label;
    final /* synthetic */ C5914aFU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyRebindFido2UseCase$getRegistrationPendingIntent$2(String str, C5914aFU c5914aFU, PasskeyPromotionAuthenticator passkeyPromotionAuthenticator, Continuation<? super PasskeyRebindFido2UseCase$getRegistrationPendingIntent$2> continuation) {
        super(2, continuation);
        this.$workflowToken = str;
        this.this$0 = c5914aFU;
        this.$authenticator = passkeyPromotionAuthenticator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyRebindFido2UseCase$getRegistrationPendingIntent$2(this.$workflowToken, this.this$0, this.$authenticator, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC5991aGs> continuation) {
        return ((PasskeyRebindFido2UseCase$getRegistrationPendingIntent$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object application;
        String message;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception e) {
            pUU.copydefault("PasskeyRegistrationUseCase", String.valueOf(e.getMessage()));
            boolean z = e instanceof OKServerException;
            if (z && ((OKServerException) e).getCode() == 42007) {
                return AbstractC5991aGs.FragmentManager.EZpvd;
            }
            if (z && ((OKServerException) e).getCode() == 42009) {
                String message2 = e.getMessage();
                return new AbstractC5991aGs.ActionBar(message2 != null ? message2 : "");
            }
            if ((e instanceof IllegalArgumentException) && (message = e.getMessage()) != null && StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "UnsupportedAlgorithmIdentifierException", false, 2, (Object) null)) {
                return AbstractC5991aGs.PendingIntent.KWHzl;
            }
            application = new AbstractC5991aGs.Application(e.getMessage());
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            PasskeyRebindStartRequestBody passkeyRebindStartRequestBody = new PasskeyRebindStartRequestBody(this.$workflowToken);
            PasskeyApiService passkeyApiService = this.this$0.AEQbTJ;
            this.label = 1;
            obj = passkeyApiService.startRebind(passkeyRebindStartRequestBody, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                Intrinsics.checkNotNullExpressionValue(obj, "");
                application = new AbstractC5991aGs.LoaderManager((PendingIntent) obj);
                return application;
            }
            C56391yDq.AEQbTJ(obj);
        }
        RegistrationStartResponse registrationStartResponse = (RegistrationStartResponse) ((ResponseData) obj).getData();
        if (registrationStartResponse == null) {
            return new AbstractC5991aGs.Application("_null data");
        }
        RegistrationStartResponse.PublicKey publicKey = registrationStartResponse.getPublicKey();
        String strEZpvd = publicKey != null ? C33488mxR.EZpvd(publicKey) : null;
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        String strKWHzl = C6617aSi.KWHzl(strEZpvd, this.$authenticator);
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptionsKWHzl = C6617aSi.KWHzl(strKWHzl);
        pUU.KWHzl("PasskeyRegistrationUseCase", "getRegistrationPendingIntent: finalJson: " + strKWHzl);
        Task<PendingIntent> registerPendingIntent = this.this$0.KWHzl.getRegisterPendingIntent(publicKeyCredentialCreationOptionsKWHzl);
        Intrinsics.checkNotNullExpressionValue(registerPendingIntent, "");
        this.label = 2;
        obj = C6617aSi.EZpvd(registerPendingIntent, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        Intrinsics.checkNotNullExpressionValue(obj, "");
        application = new AbstractC5991aGs.LoaderManager((PendingIntent) obj);
        return application;
    }
}
