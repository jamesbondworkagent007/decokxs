package com.okinc.auth.impl.passkey.domain;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C5944aFy;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class DexPasskeyRegistrationPreconditionUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C5944aFy.ActionBar>, Object> {
    int label;
    final /* synthetic */ C5944aFy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexPasskeyRegistrationPreconditionUseCase$invoke$2(C5944aFy c5944aFy, Continuation<? super DexPasskeyRegistrationPreconditionUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c5944aFy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DexPasskeyRegistrationPreconditionUseCase$invoke$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C5944aFy.ActionBar> continuation) {
        return ((DexPasskeyRegistrationPreconditionUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                PasskeyApiService passkeyApiService = this.this$0.OLrzqt;
                this.label = 1;
                obj = passkeyApiService.dexRegistrationPrecondition(this);
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
                return C5944aFy.ActionBar.StateListAnimator.EZpvd;
            }
            return new C5944aFy.ActionBar.C0820ActionBar(new Exception(responseData.getMsg()));
        } catch (Exception e) {
            pUU.copydefault("DexPasskeyRegistrationPreconditionUseCase", "e:" + e.getMessage());
            boolean z = e instanceof OKServerException;
            if (z && ((OKServerException) e).getCode() == 43019) {
                String message = e.getMessage();
                return new C5944aFy.ActionBar.TaskDescription(message != null ? message : "");
            }
            if (z && ((OKServerException) e).getCode() == 43020) {
                String message2 = e.getMessage();
                return new C5944aFy.ActionBar.Application(message2 != null ? message2 : "");
            }
            String message3 = e.getMessage();
            return new C5944aFy.ActionBar.C0820ActionBar(new Exception(message3 != null ? message3 : ""));
        }
    }
}
