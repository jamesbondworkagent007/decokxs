package com.okinc.auth.impl.passkey.domain;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.model.PasskeyRebindFinishRequestBody;
import com.okinc.auth.impl.passkey.model.PasskeyRebindFinishResponse;
import com.okinc.auth.impl.passkey.model.RegistrationFinishBody;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C5906aFM;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyRebindCredentialManagerUseCase$validateRegistration$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends PasskeyRebindFinishResponse>>, Object> {
    final /* synthetic */ boolean $isWalletRecovery;
    final /* synthetic */ String $responseJson;
    final /* synthetic */ String $workflowToken;
    int label;
    final /* synthetic */ C5906aFM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyRebindCredentialManagerUseCase$validateRegistration$2(String str, String str2, C5906aFM c5906aFM, boolean z, Continuation<? super PasskeyRebindCredentialManagerUseCase$validateRegistration$2> continuation) {
        super(2, continuation);
        this.$responseJson = str;
        this.$workflowToken = str2;
        this.this$0 = c5906aFM;
        this.$isWalletRecovery = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyRebindCredentialManagerUseCase$validateRegistration$2(this.$responseJson, this.$workflowToken, this.this$0, this.$isWalletRecovery, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends PasskeyRebindFinishResponse>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<PasskeyRebindFinishResponse>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<PasskeyRebindFinishResponse>> continuation) {
        return ((PasskeyRebindCredentialManagerUseCase$validateRegistration$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                PasskeyRebindFinishRequestBody passkeyRebindFinishRequestBody = new PasskeyRebindFinishRequestBody(false, (Integer) null, this.$workflowToken, RegistrationFinishBody.Companion.copydefault(this.$responseJson), this.$isWalletRecovery ? "WALLET_RECOVERY" : null, 2, (DefaultConstructorMarker) null);
                PasskeyApiService passkeyApiService = this.this$0.copydefault;
                this.label = 1;
                obj = passkeyApiService.finishRebind(passkeyRebindFinishRequestBody, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            ResponseData responseData = (ResponseData) obj;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(responseData.getData());
            } else {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(new Exception("_invalid response")));
            }
        } catch (Exception e) {
            pUU.copydefault("PasskeyRegistrationUseCase", String.valueOf(e.getMessage()));
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(new Exception(e)));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
