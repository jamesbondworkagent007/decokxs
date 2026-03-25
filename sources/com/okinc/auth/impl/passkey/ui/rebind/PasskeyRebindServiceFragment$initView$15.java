package com.okinc.auth.impl.passkey.ui.rebind;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.C6254aLq;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyRebindServiceFragment$initView$15 extends SuspendLambda implements Function2<Pair<? extends String, ? extends String>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C6254aLq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyRebindServiceFragment$initView$15(C6254aLq c6254aLq, Continuation<? super PasskeyRebindServiceFragment$initView$15> continuation) {
        super(2, continuation);
        this.this$0 = c6254aLq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PasskeyRebindServiceFragment$initView$15 passkeyRebindServiceFragment$initView$15 = new PasskeyRebindServiceFragment$initView$15(this.this$0, continuation);
        passkeyRebindServiceFragment$initView$15.L$0 = obj;
        return passkeyRebindServiceFragment$initView$15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Pair<? extends String, ? extends String> pair, Continuation<? super Unit> continuation) {
        return invoke2((Pair<String, String>) pair, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Pair<String, String> pair, Continuation<? super Unit> continuation) {
        return ((PasskeyRebindServiceFragment$initView$15) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Pair pair = (Pair) this.L$0;
            this.this$0.EZpvd((String) pair.component1(), (String) pair.component2());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
