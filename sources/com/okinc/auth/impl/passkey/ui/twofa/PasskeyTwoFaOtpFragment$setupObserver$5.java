package com.okinc.auth.impl.passkey.ui.twofa;

import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.C5663aAi;
import o.C6535aRF;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyTwoFaOtpFragment$setupObserver$5 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ C6535aRF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyTwoFaOtpFragment$setupObserver$5(C6535aRF c6535aRF, Continuation<? super PasskeyTwoFaOtpFragment$setupObserver$5> continuation) {
        super(2, continuation);
        this.this$0 = c6535aRF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PasskeyTwoFaOtpFragment$setupObserver$5 passkeyTwoFaOtpFragment$setupObserver$5 = new PasskeyTwoFaOtpFragment$setupObserver$5(this.this$0, continuation);
        passkeyTwoFaOtpFragment$setupObserver$5.Z$0 = ((Boolean) obj).booleanValue();
        return passkeyTwoFaOtpFragment$setupObserver$5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
        return ((PasskeyTwoFaOtpFragment$setupObserver$5) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LinearLayout linearLayout;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = this.Z$0;
            C5663aAi c5663aAi = this.this$0.djBIcL;
            if (c5663aAi != null && (linearLayout = c5663aAi.values) != null) {
                linearLayout.setVisibility(z ? 0 : 8);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
