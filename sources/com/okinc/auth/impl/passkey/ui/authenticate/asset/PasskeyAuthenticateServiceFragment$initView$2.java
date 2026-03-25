package com.okinc.auth.impl.passkey.ui.authenticate.asset;

import android.view.View;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyAuthenticateServiceFragment$initView$2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    final /* synthetic */ View $view;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyAuthenticateServiceFragment$initView$2(View view, Continuation<? super PasskeyAuthenticateServiceFragment$initView$2> continuation) {
        super(2, continuation);
        this.$view = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PasskeyAuthenticateServiceFragment$initView$2 passkeyAuthenticateServiceFragment$initView$2 = new PasskeyAuthenticateServiceFragment$initView$2(this.$view, continuation);
        passkeyAuthenticateServiceFragment$initView$2.L$0 = obj;
        return passkeyAuthenticateServiceFragment$initView$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((PasskeyAuthenticateServiceFragment$initView$2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            final String str = (String) this.L$0;
            this.$view.post(new Runnable() { // from class: o.aHc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C55326xho.toast$default(str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
