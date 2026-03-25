package com.okinc.auth.impl.passkey.ui.receive.info;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;
import o.C6227aLP;
import o.C8279azj;

/* JADX INFO: loaded from: classes14.dex */
public final class VerificationInfoFragment$initView$4 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ C6227aLP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationInfoFragment$initView$4(C6227aLP c6227aLP, Continuation<? super VerificationInfoFragment$initView$4> continuation) {
        super(2, continuation);
        this.this$0 = c6227aLP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VerificationInfoFragment$initView$4 verificationInfoFragment$initView$4 = new VerificationInfoFragment$initView$4(this.this$0, continuation);
        verificationInfoFragment$initView$4.Z$0 = ((Boolean) obj).booleanValue();
        return verificationInfoFragment$initView$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
        return ((VerificationInfoFragment$initView$4) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.Z$0) {
                C8279azj c8279azj = this.this$0.valueOf;
                if (c8279azj != null && (c52794wYp2 = c8279azj.copydefault) != null) {
                    C52794wYp.startLoading$default(c52794wYp2, 0L, 1, null);
                }
            } else {
                C8279azj c8279azj2 = this.this$0.valueOf;
                if (c8279azj2 != null && (c52794wYp = c8279azj2.copydefault) != null) {
                    c52794wYp.fIwbmz();
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
