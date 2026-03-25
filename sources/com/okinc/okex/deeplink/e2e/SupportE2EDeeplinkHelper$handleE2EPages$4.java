package com.okinc.okex.deeplink.e2e;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ActivityC45583ssl;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportE2EDeeplinkHelper$handleE2EPages$4 extends SuspendLambda implements Function2<Context, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $acContext;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportE2EDeeplinkHelper$handleE2EPages$4(Context context, Continuation<? super SupportE2EDeeplinkHelper$handleE2EPages$4> continuation) {
        super(2, continuation);
        this.$acContext = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportE2EDeeplinkHelper$handleE2EPages$4(this.$acContext, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Context context, Continuation<? super Unit> continuation) {
        return ((SupportE2EDeeplinkHelper$handleE2EPages$4) create(context, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.$acContext.startActivity(ActivityC45583ssl.Companion.KWHzl(this.$acContext, true));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
