package com.okinc.auth.impl.mfa.ui.face;

import com.okinc.auth.impl.mfa.model.MfaFailure;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.C5759aCY;

/* JADX INFO: loaded from: classes14.dex */
public final class MfaFaceResultMaximumRetryFragment$initView$2 extends SuspendLambda implements Function2<MfaFailure, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5759aCY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MfaFaceResultMaximumRetryFragment$initView$2(C5759aCY c5759aCY, Continuation<? super MfaFaceResultMaximumRetryFragment$initView$2> continuation) {
        super(2, continuation);
        this.this$0 = c5759aCY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MfaFaceResultMaximumRetryFragment$initView$2 mfaFaceResultMaximumRetryFragment$initView$2 = new MfaFaceResultMaximumRetryFragment$initView$2(this.this$0, continuation);
        mfaFaceResultMaximumRetryFragment$initView$2.L$0 = obj;
        return mfaFaceResultMaximumRetryFragment$initView$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MfaFailure mfaFailure, Continuation<? super Unit> continuation) {
        return ((MfaFaceResultMaximumRetryFragment$initView$2) create(mfaFailure, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.gEmmrt().EZpvd((MfaFailure) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
