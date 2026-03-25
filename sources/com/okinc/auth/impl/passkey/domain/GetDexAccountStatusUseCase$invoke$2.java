package com.okinc.auth.impl.passkey.domain;

import com.okinc.auth.api.passkey.DexAccountStatus;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.model.DexAccountStatusResponse;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C5897aFD;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class GetDexAccountStatusUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DexAccountStatus>, Object> {
    int label;
    final /* synthetic */ C5897aFD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDexAccountStatusUseCase$invoke$2(C5897aFD c5897aFD, Continuation<? super GetDexAccountStatusUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c5897aFD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetDexAccountStatusUseCase$invoke$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DexAccountStatus> continuation) {
        return ((GetDexAccountStatusUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Boolean hasEscaped;
        Boolean hasDexAccount;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                PasskeyApiService passkeyApiService = this.this$0.EZpvd;
                this.label = 1;
                obj = passkeyApiService.getDexAccountStatus(this);
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
            DexAccountStatusResponse dexAccountStatusResponse = (DexAccountStatusResponse) responseData.getData();
            boolean zBooleanValue = false;
            boolean zBooleanValue2 = (dexAccountStatusResponse == null || (hasDexAccount = dexAccountStatusResponse.getHasDexAccount()) == null) ? false : hasDexAccount.booleanValue();
            DexAccountStatusResponse dexAccountStatusResponse2 = (DexAccountStatusResponse) responseData.getData();
            if (dexAccountStatusResponse2 != null && (hasEscaped = dexAccountStatusResponse2.getHasEscaped()) != null) {
                zBooleanValue = hasEscaped.booleanValue();
            }
            if (zBooleanValue2 && zBooleanValue) {
                return DexAccountStatus.ShowEntranceAlreadyEscaped.EZpvd;
            }
            if (zBooleanValue2) {
                return DexAccountStatus.ShowEntranceCanEscape.EZpvd;
            }
            return DexAccountStatus.HideEntrance.EZpvd;
        } catch (Exception e) {
            pUU.copydefault("GetDexAccountStatusUseCase", "e: " + e.getMessage());
            return new DexAccountStatus.Failure(String.valueOf(e.getMessage()));
        }
    }
}
