package com.okinc.auth.impl.mfa.ui.password;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33070mpX;
import o.C55019xbz;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C5680aAz;
import o.C5850aEJ;
import o.C8206ayP;

/* JADX INFO: loaded from: classes14.dex */
public final class VerifyPasswordFragment$initView$3 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5850aEJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyPasswordFragment$initView$3(C5850aEJ c5850aEJ, Continuation<? super VerifyPasswordFragment$initView$3> continuation) {
        super(2, continuation);
        this.this$0 = c5850aEJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VerifyPasswordFragment$initView$3 verifyPasswordFragment$initView$3 = new VerifyPasswordFragment$initView$3(this.this$0, continuation);
        verifyPasswordFragment$initView$3.L$0 = obj;
        return verifyPasswordFragment$initView$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((VerifyPasswordFragment$initView$3) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C55019xbz c55019xbz;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = (String) this.L$0;
            if (str.length() > 0) {
                C55326xho.toastWithFailedIcon$default(str, 0, 1, (Object) null);
            }
            C5680aAz c5680aAz = this.this$0.gEmmrt;
            if (c5680aAz != null && (c55019xbz = c5680aAz.EZpvd) != null) {
                c55019xbz.setErrorText(C33070mpX.AYXKKw(C8206ayP.Dialog.DCJXGO));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
