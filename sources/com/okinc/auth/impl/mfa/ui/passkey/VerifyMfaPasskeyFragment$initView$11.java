package com.okinc.auth.impl.mfa.ui.passkey;

import com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyFragment$initView$11;
import com.okinc.auth.impl.passkey.ui.crossdevice.master.PasskeyIncompatibleV2BottomFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.C5790aDC;

/* JADX INFO: loaded from: classes14.dex */
public final class VerifyMfaPasskeyFragment$initView$11 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C5790aDC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMfaPasskeyFragment$initView$11(C5790aDC c5790aDC, Continuation<? super VerifyMfaPasskeyFragment$initView$11> continuation) {
        super(2, continuation);
        this.this$0 = c5790aDC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerifyMfaPasskeyFragment$initView$11(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((VerifyMfaPasskeyFragment$initView$11) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            PasskeyIncompatibleV2BottomFragment.ActionBar actionBar = PasskeyIncompatibleV2BottomFragment.Companion;
            final C5790aDC c5790aDC = this.this$0;
            actionBar.OLrzqt(new Function0() { // from class: o.aDL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return VerifyMfaPasskeyFragment$initView$11.invokeSuspend$lambda$0(c5790aDC);
                }
            }, true, this.this$0.fetchVPNInfo().fJNWhG() == 1).show(this.this$0.getChildFragmentManager(), PasskeyIncompatibleV2BottomFragment.class.getName());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(C5790aDC c5790aDC) {
        c5790aDC.ejfBZ().getNewProxyInstance();
        return Unit.INSTANCE;
    }
}
