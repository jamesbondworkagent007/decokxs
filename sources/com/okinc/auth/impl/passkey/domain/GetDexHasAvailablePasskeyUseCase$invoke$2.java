package com.okinc.auth.impl.passkey.domain;

import com.okinc.auth.api.passkey.PasskeyCanLinkExistingToCedefiWalletState;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5899aFF;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class GetDexHasAvailablePasskeyUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PasskeyCanLinkExistingToCedefiWalletState>, Object> {
    int label;
    final /* synthetic */ C5899aFF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDexHasAvailablePasskeyUseCase$invoke$2(C5899aFF c5899aFF, Continuation<? super GetDexHasAvailablePasskeyUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c5899aFF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetDexHasAvailablePasskeyUseCase$invoke$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PasskeyCanLinkExistingToCedefiWalletState> continuation) {
        return ((GetDexHasAvailablePasskeyUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                PasskeyApiService passkeyApiService = this.this$0.copydefault;
                this.label = 1;
                obj = passkeyApiService.getDexHasAvailablePasskey(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return new PasskeyCanLinkExistingToCedefiWalletState.Success(Intrinsics.EZpvd(((ResponseData) obj).getData(), C56443yFo.KWHzl(true)));
        } catch (Exception e) {
            pUU.copydefault("GetDexHasAvailablePasskeyUseCase", "e: " + e.getMessage());
            return new PasskeyCanLinkExistingToCedefiWalletState.Failure(String.valueOf(e.getMessage()));
        }
    }
}
