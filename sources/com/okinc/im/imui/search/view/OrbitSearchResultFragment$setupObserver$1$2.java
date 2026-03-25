package com.okinc.im.imui.search.view;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC33912nKl;
import o.C33546myW;
import o.C37474ouX;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class OrbitSearchResultFragment$setupObserver$1$2 extends SuspendLambda implements yHO<CoroutineScope, Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ C37474ouX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrbitSearchResultFragment$setupObserver$1$2(C37474ouX c37474ouX, Continuation<? super OrbitSearchResultFragment$setupObserver$1$2> continuation) {
        super(3, continuation);
        this.this$0 = c37474ouX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(CoroutineScope coroutineScope, Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(coroutineScope, bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(CoroutineScope coroutineScope, boolean z, Continuation<? super Unit> continuation) {
        OrbitSearchResultFragment$setupObserver$1$2 orbitSearchResultFragment$setupObserver$1$2 = new OrbitSearchResultFragment$setupObserver$1$2(this.this$0, continuation);
        orbitSearchResultFragment$setupObserver$1$2.Z$0 = z;
        return orbitSearchResultFragment$setupObserver$1$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC33912nKl abstractC33912nKl;
        C33546myW c33546myW;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!this.Z$0 && (abstractC33912nKl = this.this$0.gEmmrt) != null && (c33546myW = abstractC33912nKl.OLrzqt) != null) {
                c33546myW.valueOf();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
