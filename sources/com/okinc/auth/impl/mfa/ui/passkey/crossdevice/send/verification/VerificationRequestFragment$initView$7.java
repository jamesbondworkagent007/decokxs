package com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.verification;

import androidx.core.content.ContextCompat;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33069mpW;
import o.C52761wXj;
import o.C55317xhf;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C5845aEE;
import o.C8206ayP;
import o.C8282azm;

/* JADX INFO: loaded from: classes14.dex */
public final class VerificationRequestFragment$initView$7 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ C5845aEE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationRequestFragment$initView$7(C5845aEE c5845aEE, Continuation<? super VerificationRequestFragment$initView$7> continuation) {
        super(2, continuation);
        this.this$0 = c5845aEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VerificationRequestFragment$initView$7 verificationRequestFragment$initView$7 = new VerificationRequestFragment$initView$7(this.this$0, continuation);
        verificationRequestFragment$initView$7.I$0 = ((Number) obj).intValue();
        return verificationRequestFragment$initView$7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(int i, Continuation<? super Unit> continuation) {
        return ((VerificationRequestFragment$initView$7) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
        return invoke(num.intValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C55317xhf c55317xhf;
        C55317xhf c55317xhf2;
        C55317xhf c55317xhf3;
        C55317xhf c55317xhf4;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            int i = this.I$0;
            if (i <= 0) {
                C8282azm c8282azm = this.this$0.djBIcL;
                if (c8282azm != null && (c55317xhf4 = c8282azm.valueOf) != null) {
                    c55317xhf4.setTextValue(this.this$0.getString(C8206ayP.Dialog.gtCCJH));
                }
                C8282azm c8282azm2 = this.this$0.djBIcL;
                if (c8282azm2 != null && (c55317xhf3 = c8282azm2.valueOf) != null) {
                    c55317xhf3.setTextColor(ContextCompat.getColor(this.this$0.requireContext(), C52761wXj.Activity.fdOvFl));
                }
            } else {
                C8282azm c8282azm3 = this.this$0.djBIcL;
                if (c8282azm3 != null && (c55317xhf2 = c8282azm3.valueOf) != null) {
                    c55317xhf2.setTextValue(C33069mpW.copydefault(this.this$0, C8206ayP.Dialog.DrqXHJ, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("seconds", String.valueOf(i)))));
                }
                C8282azm c8282azm4 = this.this$0.djBIcL;
                if (c8282azm4 != null && (c55317xhf = c8282azm4.valueOf) != null) {
                    c55317xhf.setTextColor(ContextCompat.getColor(this.this$0.requireContext(), C52761wXj.Activity.UlJrfe));
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
