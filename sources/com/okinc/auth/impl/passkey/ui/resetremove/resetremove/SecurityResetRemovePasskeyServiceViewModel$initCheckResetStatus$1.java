package com.okinc.auth.impl.passkey.ui.resetremove.resetremove;

import com.okinc.auth.api.passkey.PasskeyResetRemoveType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityResetRemovePasskeyServiceViewModel$initCheckResetStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PasskeyResetRemoveType $argResetRemoveType;
    int label;
    final /* synthetic */ SecurityResetRemovePasskeyServiceViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityResetRemovePasskeyServiceViewModel$initCheckResetStatus$1(SecurityResetRemovePasskeyServiceViewModel securityResetRemovePasskeyServiceViewModel, PasskeyResetRemoveType passkeyResetRemoveType, Continuation<? super SecurityResetRemovePasskeyServiceViewModel$initCheckResetStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = securityResetRemovePasskeyServiceViewModel;
        this.$argResetRemoveType = passkeyResetRemoveType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityResetRemovePasskeyServiceViewModel$initCheckResetStatus$1(this.this$0, this.$argResetRemoveType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SecurityResetRemovePasskeyServiceViewModel$initCheckResetStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.copydefault(this.$argResetRemoveType);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
