package com.okinc.auth.impl.mfa.ui.passkey;

import com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyFragment$initView$16;
import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.C5790aDC;
import o.C5869aEc;
import o.C5875aEi;

/* JADX INFO: loaded from: classes14.dex */
public final class VerifyMfaPasskeyFragment$initView$16 extends SuspendLambda implements Function2<AuthenticationStartResponse, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C5790aDC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMfaPasskeyFragment$initView$16(C5790aDC c5790aDC, Continuation<? super VerifyMfaPasskeyFragment$initView$16> continuation) {
        super(2, continuation);
        this.this$0 = c5790aDC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerifyMfaPasskeyFragment$initView$16(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AuthenticationStartResponse authenticationStartResponse, Continuation<? super Unit> continuation) {
        return ((VerifyMfaPasskeyFragment$initView$16) create(authenticationStartResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.getChildFragmentManager().isStateSaved()) {
                return Unit.INSTANCE;
            }
            C5875aEi.TaskDescription taskDescription = C5875aEi.Companion;
            final C5790aDC c5790aDC = this.this$0;
            taskDescription.KWHzl(new Function0() { // from class: o.aDP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return VerifyMfaPasskeyFragment$initView$16.invokeSuspend$lambda$0(c5790aDC);
                }
            }, new Function0() { // from class: o.aDR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return Unit.INSTANCE;
                }
            }).show(this.this$0.getChildFragmentManager(), C5869aEc.class.getName());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(C5790aDC c5790aDC) {
        c5790aDC.ejfBZ().wlaJM();
        return Unit.INSTANCE;
    }
}
