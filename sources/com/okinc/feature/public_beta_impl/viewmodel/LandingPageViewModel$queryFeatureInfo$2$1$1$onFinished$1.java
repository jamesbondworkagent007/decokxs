package com.okinc.feature.public_beta_impl.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C2349AIi;
import o.C33070mpX;
import o.C34764nic;
import o.C34783niv;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class LandingPageViewModel$queryFeatureInfo$2$1$1$onFinished$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<C2349AIi, Unit> $callback;
    final /* synthetic */ C2349AIi $result;
    int label;
    final /* synthetic */ C34783niv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.AIi, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LandingPageViewModel$queryFeatureInfo$2$1$1$onFinished$1(C2349AIi c2349AIi, Function1<? super C2349AIi, Unit> function1, C34783niv c34783niv, Continuation<? super LandingPageViewModel$queryFeatureInfo$2$1$1$onFinished$1> continuation) {
        super(2, continuation);
        this.$result = c2349AIi;
        this.$callback = function1;
        this.this$0 = c34783niv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LandingPageViewModel$queryFeatureInfo$2$1$1$onFinished$1(this.$result, this.$callback, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LandingPageViewModel$queryFeatureInfo$2$1$1$onFinished$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strAYXKKw;
        Object value;
        Function1<C2349AIi, Unit> function1;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            int iKWHzl = this.$result.KWHzl();
            if (iKWHzl == -1) {
                strAYXKKw = C33070mpX.AYXKKw(C34764nic.StateListAnimator.OLrzqt);
            } else {
                strAYXKKw = iKWHzl != 0 ? this.$result.valueOf() : "";
            }
            if (this.$result.DbNXlk() && (function1 = this.$callback) != null) {
                function1.invoke(this.$result);
            }
            MutableStateFlow mutableStateFlow = this.this$0.EZpvd;
            C2349AIi c2349AIi = this.$result;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, C34783niv.Activity.copy$default((C34783niv.Activity) value, null, false, c2349AIi, strAYXKKw.length() > 0 ? new C34783niv.Application(strAYXKKw, false, 2, null) : null, false, 17, null)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
