package com.okinc.auth.impl.passkey.ui.rebind;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.okinc.auth.impl.passkey.ui.rebind.PasskeyRebindServiceFragment$initView$4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.C6254aLq;
import o.C8206ayP;
import o.ViewOnClickListenerC54939xaY;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyRebindServiceFragment$initView$4 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C6254aLq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyRebindServiceFragment$initView$4(C6254aLq c6254aLq, Continuation<? super PasskeyRebindServiceFragment$initView$4> continuation) {
        super(2, continuation);
        this.this$0 = c6254aLq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyRebindServiceFragment$initView$4(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((PasskeyRebindServiceFragment$initView$4) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Context context = this.this$0.getContext();
            if (context == null) {
                return Unit.INSTANCE;
            }
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            final C6254aLq c6254aLq = this.this$0;
            viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C8206ayP.Dialog.ORxRYg));
            viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C8206ayP.Dialog.DTwDnp));
            viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C8206ayP.Dialog.QfsBiF), new View.OnClickListener() { // from class: o.aLD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    viewOnClickListenerC54939xaY.dismiss();
                }
            });
            viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) C33070mpX.AYXKKw(C8206ayP.Dialog.QKVWgx), new View.OnClickListener() { // from class: o.aLF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    PasskeyRebindServiceFragment$initView$4.invokeSuspend$lambda$2$lambda$1(c6254aLq, viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.setCancelable(false);
            viewOnClickListenerC54939xaY.show();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2$lambda$1(C6254aLq c6254aLq, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        c6254aLq.startActivity(new Intent("android.settings.SETTINGS"));
        viewOnClickListenerC54939xaY.dismiss();
    }
}
