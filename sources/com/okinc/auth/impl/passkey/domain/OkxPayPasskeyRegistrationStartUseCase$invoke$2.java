package com.okinc.auth.impl.passkey.domain;

import android.app.PendingIntent;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.tasks.Task;
import com.okinc.auth.api.passkey.PasskeyPromotionAuthenticator;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
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
import o.C5895aFB;
import o.C5989aGq;
import o.C6617aSi;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class OkxPayPasskeyRegistrationStartUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC5991aGs>, Object> {
    final /* synthetic */ String $unlockToken;
    int label;
    final /* synthetic */ C5895aFB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkxPayPasskeyRegistrationStartUseCase$invoke$2(String str, C5895aFB c5895aFB, Continuation<? super OkxPayPasskeyRegistrationStartUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$unlockToken = str;
        this.this$0 = c5895aFB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OkxPayPasskeyRegistrationStartUseCase$invoke$2(this.$unlockToken, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC5991aGs> continuation) {
        return ((OkxPayPasskeyRegistrationStartUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String message;
        RegistrationStartResponse.PublicKey publicKey;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C5989aGq c5989aGq = new C5989aGq(this.$unlockToken);
                PasskeyApiService passkeyApiService = this.this$0.AEQbTJ;
                this.label = 1;
                obj = passkeyApiService.startOkxPayRegistration(c5989aGq, this);
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
                    return new AbstractC5991aGs.LoaderManager((PendingIntent) obj);
                }
                C56391yDq.AEQbTJ(obj);
            }
            ResponseData responseData = (ResponseData) obj;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                RegistrationStartResponse registrationStartResponse = (RegistrationStartResponse) responseData.getData();
                String strEZpvd = (registrationStartResponse == null || (publicKey = registrationStartResponse.getPublicKey()) == null) ? null : C33488mxR.EZpvd(publicKey);
                if (strEZpvd == null) {
                    strEZpvd = "";
                }
                String strKWHzl = C6617aSi.KWHzl(strEZpvd, PasskeyPromotionAuthenticator.InternalOnly.copydefault);
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptionsKWHzl = C6617aSi.KWHzl(strKWHzl);
                pUU.KWHzl("OkxPayPasskeyRegistrationStartUseCase", "OkxPayPasskeyRegistrationStartUseCase: finalJson: " + strKWHzl);
                Task<PendingIntent> registerPendingIntent = this.this$0.OLrzqt.getRegisterPendingIntent(publicKeyCredentialCreationOptionsKWHzl);
                Intrinsics.checkNotNullExpressionValue(registerPendingIntent, "");
                this.label = 2;
                obj = C6617aSi.EZpvd(registerPendingIntent, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                Intrinsics.checkNotNullExpressionValue(obj, "");
                return new AbstractC5991aGs.LoaderManager((PendingIntent) obj);
            }
            return new AbstractC5991aGs.Application("_invalid_response");
        } catch (Exception e) {
            pUU.copydefault("OkxPayPasskeyRegistrationStartUseCase", "getRegistrationPendingIntentFlow: " + e.getMessage());
            boolean z = e instanceof OKServerException;
            if (z && ((OKServerException) e).getCode() == 42007) {
                return AbstractC5991aGs.FragmentManager.EZpvd;
            }
            if (z && ((OKServerException) e).getCode() == 42009) {
                String message2 = e.getMessage();
                return new AbstractC5991aGs.ActionBar(message2 != null ? message2 : "");
            }
            if (z && ((OKServerException) e).getCode() == 42501) {
                return AbstractC5991aGs.Activity.EZpvd;
            }
            if ((e instanceof IllegalArgumentException) && (message = e.getMessage()) != null && StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "UnsupportedAlgorithmIdentifierException", false, 2, (Object) null)) {
                return AbstractC5991aGs.PendingIntent.KWHzl;
            }
            return new AbstractC5991aGs.Application(e.getMessage());
        }
    }
}
