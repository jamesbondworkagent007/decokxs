package com.okinc.auth.impl.passkey.domain;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.model.UnlockTokenResponse;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C5901aFH;
import o.C5993aGu;

/* JADX INFO: loaded from: classes3.dex */
public final class OkxPayPasskeyRegistrationUnlockTokenUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends UnlockTokenResponse>>, Object> {
    final /* synthetic */ String $sessionId;
    int label;
    final /* synthetic */ C5901aFH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkxPayPasskeyRegistrationUnlockTokenUseCase$invoke$2(String str, C5901aFH c5901aFH, Continuation<? super OkxPayPasskeyRegistrationUnlockTokenUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$sessionId = str;
        this.this$0 = c5901aFH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OkxPayPasskeyRegistrationUnlockTokenUseCase$invoke$2(this.$sessionId, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends UnlockTokenResponse>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<UnlockTokenResponse>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<UnlockTokenResponse>> continuation) {
        return ((OkxPayPasskeyRegistrationUnlockTokenUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C5993aGu c5993aGu = new C5993aGu(this.$sessionId);
                PasskeyApiService passkeyApiService = this.this$0.KWHzl;
                this.label = 1;
                obj = passkeyApiService.getUnlockTokenForOkxPayFromMfa(c5993aGu, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Result.Application application = Result.Companion;
            return Result.m7376boximpl(Result.m7377constructorimpl(((ResponseData) obj).getData()));
        } catch (Exception e) {
            e.getMessage();
            Result.Application application2 = Result.Companion;
            return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(e)));
        }
    }
}
