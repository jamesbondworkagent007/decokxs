package com.okinc.auth.impl.passkey.domain;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C5894aFA;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class DexPasskeyStartAuthenticateUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C5894aFA.TaskDescription>, Object> {
    int label;
    final /* synthetic */ C5894aFA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexPasskeyStartAuthenticateUseCase$invoke$2(C5894aFA c5894aFA, Continuation<? super DexPasskeyStartAuthenticateUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c5894aFA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DexPasskeyStartAuthenticateUseCase$invoke$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C5894aFA.TaskDescription> continuation) {
        return ((DexPasskeyStartAuthenticateUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                PasskeyApiService passkeyApiService = this.this$0.AEQbTJ;
                this.label = 1;
                obj = passkeyApiService.dexStartAuthentication(this);
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
            if (responseData.getCode() == 0) {
                Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new C5894aFA.TaskDescription.StateListAnimator((AuthenticationStartResponse) data);
            }
            return new C5894aFA.TaskDescription.ActionBar(new Exception(responseData.getMsg()));
        } catch (Exception e) {
            pUU.copydefault("DexPasskeyAuthenticateStartUseCase", "e:" + e.getMessage());
            if ((e instanceof OKServerException) && ((OKServerException) e).getCode() == 43019) {
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                return new C5894aFA.TaskDescription.Application(message);
            }
            return new C5894aFA.TaskDescription.ActionBar(e);
        }
    }
}
