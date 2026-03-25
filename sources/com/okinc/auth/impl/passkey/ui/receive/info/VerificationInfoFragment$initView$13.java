package com.okinc.auth.impl.passkey.ui.receive.info;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33069mpW;
import o.C52794wYp;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C6227aLP;
import o.C8206ayP;
import o.C8279azj;

/* JADX INFO: loaded from: classes14.dex */
public final class VerificationInfoFragment$initView$13 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ C6227aLP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationInfoFragment$initView$13(C6227aLP c6227aLP, Continuation<? super VerificationInfoFragment$initView$13> continuation) {
        super(2, continuation);
        this.this$0 = c6227aLP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VerificationInfoFragment$initView$13 verificationInfoFragment$initView$13 = new VerificationInfoFragment$initView$13(this.this$0, continuation);
        verificationInfoFragment$initView$13.I$0 = ((Number) obj).intValue();
        return verificationInfoFragment$initView$13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(int i, Continuation<? super Unit> continuation) {
        return ((VerificationInfoFragment$initView$13) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
        return invoke(num.intValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            int i = this.I$0;
            if (i <= 0) {
                C8279azj c8279azj = this.this$0.valueOf;
                if (c8279azj != null && (c52794wYp2 = c8279azj.copydefault) != null) {
                    c52794wYp2.setText(this.this$0.getString(C8206ayP.Dialog.DGUQLIDGUQLI));
                }
            } else {
                C8279azj c8279azj2 = this.this$0.valueOf;
                if (c8279azj2 != null && (c52794wYp = c8279azj2.copydefault) != null) {
                    c52794wYp.setText(C33069mpW.copydefault(this.this$0, C8206ayP.Dialog.DGUQLIdZmdUa, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", String.valueOf(i)))));
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
