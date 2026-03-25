package com.okinc.auth.impl.mfa.ui.face;

import com.okinc.auth.impl.mfa.model.MfaResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.C5818aDe;

/* JADX INFO: loaded from: classes14.dex */
public final class VerifyMfaFaceFragment$initView$3 extends SuspendLambda implements Function2<MfaResponse, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5818aDe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMfaFaceFragment$initView$3(C5818aDe c5818aDe, Continuation<? super VerifyMfaFaceFragment$initView$3> continuation) {
        super(2, continuation);
        this.this$0 = c5818aDe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VerifyMfaFaceFragment$initView$3 verifyMfaFaceFragment$initView$3 = new VerifyMfaFaceFragment$initView$3(this.this$0, continuation);
        verifyMfaFaceFragment$initView$3.L$0 = obj;
        return verifyMfaFaceFragment$initView$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MfaResponse mfaResponse, Continuation<? super Unit> continuation) {
        return ((VerifyMfaFaceFragment$initView$3) create(mfaResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.AYXKKw().copydefault((MfaResponse) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
