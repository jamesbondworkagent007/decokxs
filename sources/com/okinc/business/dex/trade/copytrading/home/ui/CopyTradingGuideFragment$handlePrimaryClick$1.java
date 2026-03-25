package com.okinc.business.dex.trade.copytrading.home.ui;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.gLQ;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingGuideFragment$handlePrimaryClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CopyTradingGuideFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingGuideFragment$handlePrimaryClick$1(CopyTradingGuideFragment copyTradingGuideFragment, Continuation<? super CopyTradingGuideFragment$handlePrimaryClick$1> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingGuideFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CopyTradingGuideFragment$handlePrimaryClick$1 copyTradingGuideFragment$handlePrimaryClick$1 = new CopyTradingGuideFragment$handlePrimaryClick$1(this.this$0, continuation);
        copyTradingGuideFragment$handlePrimaryClick$1.L$0 = obj;
        return copyTradingGuideFragment$handlePrimaryClick$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingGuideFragment$handlePrimaryClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Function2<Context, CoroutineScope, Unit> function2EZpvd;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            gLQ value = this.this$0.AYXKKw().AEQbTJ().getValue();
            if (value != null && (function2EZpvd = value.EZpvd()) != null) {
                Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                function2EZpvd.invoke(contextRequireContext, coroutineScope);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
