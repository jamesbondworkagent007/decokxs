package com.okinc.buysell.ui.bsc.fragment.master;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C55249xgQ;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes15.dex */
public final class BSCMasterFragmentV3$setupViewPager$9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BSCMasterFragmentV3 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BSCMasterFragmentV3$setupViewPager$9(BSCMasterFragmentV3 bSCMasterFragmentV3, Continuation<? super BSCMasterFragmentV3$setupViewPager$9> continuation) {
        super(2, continuation);
        this.this$0 = bSCMasterFragmentV3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BSCMasterFragmentV3$setupViewPager$9(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BSCMasterFragmentV3$setupViewPager$9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C55249xgQ c55249xgQ = BSCMasterFragmentV3.KWHzl(this.this$0).fIwbmz;
            c55249xgQ.selectTab(c55249xgQ.getTabAt(this.this$0.fetchVPNInfo().AkhnZx().getIndex()));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
