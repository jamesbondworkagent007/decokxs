package com.okinc.okex.lite.hero.repo;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC47263tmj;
import o.C45730svm;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes10.dex */
public final class HeroResetStateCoordinator$registerMonitors$2 extends SuspendLambda implements yHO<CoroutineScope, AbstractC47263tmj, Continuation<? super Unit>, Object> {
    final /* synthetic */ LifecycleOwner $owner;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C45730svm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeroResetStateCoordinator$registerMonitors$2(C45730svm c45730svm, LifecycleOwner lifecycleOwner, Continuation<? super HeroResetStateCoordinator$registerMonitors$2> continuation) {
        super(3, continuation);
        this.this$0 = c45730svm;
        this.$owner = lifecycleOwner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, AbstractC47263tmj abstractC47263tmj, Continuation<? super Unit> continuation) {
        HeroResetStateCoordinator$registerMonitors$2 heroResetStateCoordinator$registerMonitors$2 = new HeroResetStateCoordinator$registerMonitors$2(this.this$0, this.$owner, continuation);
        heroResetStateCoordinator$registerMonitors$2.L$0 = abstractC47263tmj;
        return heroResetStateCoordinator$registerMonitors$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC47263tmj abstractC47263tmj = (AbstractC47263tmj) this.L$0;
            C45730svm c45730svm = this.this$0;
            LifecycleOwner lifecycleOwner = this.$owner;
            this.label = 1;
            if (c45730svm.KWHzl(lifecycleOwner, abstractC47263tmj, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
