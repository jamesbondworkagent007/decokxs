package com.okinc.auth.impl.passkey.ui.rename;

import androidx.core.os.BundleKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C32989mnw;
import o.C33070mpX;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C6403aOg;
import o.C8206ayP;

/* JADX INFO: loaded from: classes14.dex */
public final class SecurityFido2RenameBottomFragment$onViewCreated$3 extends SuspendLambda implements Function2<C32989mnw<Unit>, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C6403aOg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityFido2RenameBottomFragment$onViewCreated$3(C6403aOg c6403aOg, Continuation<? super SecurityFido2RenameBottomFragment$onViewCreated$3> continuation) {
        super(2, continuation);
        this.this$0 = c6403aOg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityFido2RenameBottomFragment$onViewCreated$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C32989mnw<Unit> c32989mnw, Continuation<? super Unit> continuation) {
        return ((SecurityFido2RenameBottomFragment$onViewCreated$3) create(c32989mnw, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C8206ayP.Dialog.UeEOUB), 0, 1, (Object) null);
            this.this$0.dismissAllowingStateLoss();
            this.this$0.getParentFragmentManager().setFragmentResult(this.this$0.djBIcL(), BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_RESPONSE", null)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
