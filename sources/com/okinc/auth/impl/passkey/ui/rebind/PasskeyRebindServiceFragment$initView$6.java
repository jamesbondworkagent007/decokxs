package com.okinc.auth.impl.passkey.ui.rebind;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33070mpX;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C8206ayP;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyRebindServiceFragment$initView$6 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PasskeyRebindServiceFragment$initView$6(Continuation<? super PasskeyRebindServiceFragment$initView$6> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyRebindServiceFragment$initView$6(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((PasskeyRebindServiceFragment$initView$6) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C55326xho.toast$default(C33070mpX.AYXKKw(C8206ayP.Dialog.aKErDB), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
