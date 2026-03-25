package com.okinc.auth.impl.passkey.ui.authenticate.asset;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.C5967aGU;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyAuthenticateServiceFragment$initView$6 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ C5967aGU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyAuthenticateServiceFragment$initView$6(C5967aGU c5967aGU, Continuation<? super PasskeyAuthenticateServiceFragment$initView$6> continuation) {
        super(2, continuation);
        this.this$0 = c5967aGU;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PasskeyAuthenticateServiceFragment$initView$6 passkeyAuthenticateServiceFragment$initView$6 = new PasskeyAuthenticateServiceFragment$initView$6(this.this$0, continuation);
        passkeyAuthenticateServiceFragment$initView$6.Z$0 = ((Boolean) obj).booleanValue();
        return passkeyAuthenticateServiceFragment$initView$6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
        return ((PasskeyAuthenticateServiceFragment$initView$6) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.AEQbTJ(this.Z$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
