package com.okinc.auth.impl.passkey.ui.twofa;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C32113mPz;
import o.C33070mpX;
import o.C52761wXj;
import o.C56391yDq;
import o.C56442yFn;
import o.C5663aAi;
import o.C6535aRF;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyTwoFaOtpFragment$setupObserver$7 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ C6535aRF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyTwoFaOtpFragment$setupObserver$7(C6535aRF c6535aRF, Continuation<? super PasskeyTwoFaOtpFragment$setupObserver$7> continuation) {
        super(2, continuation);
        this.this$0 = c6535aRF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PasskeyTwoFaOtpFragment$setupObserver$7 passkeyTwoFaOtpFragment$setupObserver$7 = new PasskeyTwoFaOtpFragment$setupObserver$7(this.this$0, continuation);
        passkeyTwoFaOtpFragment$setupObserver$7.Z$0 = ((Boolean) obj).booleanValue();
        return passkeyTwoFaOtpFragment$setupObserver$7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
        return ((PasskeyTwoFaOtpFragment$setupObserver$7) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.Z$0) {
                C5663aAi c5663aAi = this.this$0.djBIcL;
                if (c5663aAi != null && (textView4 = c5663aAi.AhwBna) != null) {
                    textView4.setEnabled(true);
                }
                C5663aAi c5663aAi2 = this.this$0.djBIcL;
                if (c5663aAi2 != null && (textView3 = c5663aAi2.AhwBna) != null) {
                    textView3.setTextColor(C33070mpX.copydefault(C32113mPz.ActionBar.fIwbmz));
                }
            } else {
                C5663aAi c5663aAi3 = this.this$0.djBIcL;
                if (c5663aAi3 != null && (textView2 = c5663aAi3.AhwBna) != null) {
                    textView2.setEnabled(false);
                }
                C5663aAi c5663aAi4 = this.this$0.djBIcL;
                if (c5663aAi4 != null && (textView = c5663aAi4.AhwBna) != null) {
                    textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
