package com.okinc.okex.lite.hero.coordinator;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C45667suP;
import o.C45670suS;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class HeroABTestCoordinator$startMonitoring$1$onUpdatedCallback$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<LifecycleOwner, Unit> $onUpdate;
    final /* synthetic */ LifecycleOwner $owner;
    int label;
    final /* synthetic */ C45667suP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super androidx.lifecycle.LifecycleOwner, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HeroABTestCoordinator$startMonitoring$1$onUpdatedCallback$1(C45667suP c45667suP, Function1<? super LifecycleOwner, Unit> function1, LifecycleOwner lifecycleOwner, Continuation<? super HeroABTestCoordinator$startMonitoring$1$onUpdatedCallback$1> continuation) {
        super(2, continuation);
        this.this$0 = c45667suP;
        this.$onUpdate = function1;
        this.$owner = lifecycleOwner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HeroABTestCoordinator$startMonitoring$1$onUpdatedCallback$1(this.this$0, this.$onUpdate, this.$owner, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HeroABTestCoordinator$startMonitoring$1$onUpdatedCallback$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.EZpvd.AEQbTJ("Starting hero loading due to A/B test update");
                C45670suS c45670suS = this.this$0.copydefault;
                this.label = 1;
                if (c45670suS.OLrzqt(this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            this.this$0.EZpvd.AEQbTJ("Hero loading completed for A/B test update");
            this.$onUpdate.invoke(this.$owner);
        } catch (Exception e) {
            this.this$0.EZpvd.OLrzqt("Error loading hero content after A/B test update", e);
        }
        return Unit.INSTANCE;
    }
}
