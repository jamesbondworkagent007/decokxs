package com.okinc.auth.impl.passkey.ui.register.okxpay;

import com.okinc.auth.impl.passkey.model.UnlockTokenResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityRegisterOkxPayPasskeyServiceViewModel$post2fa$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UnlockTokenResponse $response;
    int label;
    final /* synthetic */ SecurityRegisterOkxPayPasskeyServiceViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityRegisterOkxPayPasskeyServiceViewModel$post2fa$1(UnlockTokenResponse unlockTokenResponse, SecurityRegisterOkxPayPasskeyServiceViewModel securityRegisterOkxPayPasskeyServiceViewModel, Continuation<? super SecurityRegisterOkxPayPasskeyServiceViewModel$post2fa$1> continuation) {
        super(2, continuation);
        this.$response = unlockTokenResponse;
        this.this$0 = securityRegisterOkxPayPasskeyServiceViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityRegisterOkxPayPasskeyServiceViewModel$post2fa$1(this.$response, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SecurityRegisterOkxPayPasskeyServiceViewModel$post2fa$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            UnlockTokenResponse unlockTokenResponse = this.$response;
            String token = unlockTokenResponse != null ? unlockTokenResponse.getToken() : null;
            if (token == null) {
                token = "";
            }
            if (token.length() == 0) {
                this.this$0.valueOf();
            } else {
                this.this$0.KWHzl(token);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
