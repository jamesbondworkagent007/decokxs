package com.okinc.dexkline.market.features.overview.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C34332naA;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class OverviewViewModel$getSearchAlert$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ OverviewViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverviewViewModel$getSearchAlert$1(OverviewViewModel overviewViewModel, Continuation<? super OverviewViewModel$getSearchAlert$1> continuation) {
        super(2, continuation);
        this.this$0 = overviewViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OverviewViewModel$getSearchAlert$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OverviewViewModel$getSearchAlert$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        OverviewViewModel overviewViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            OverviewViewModel overviewViewModel2 = this.this$0;
            C34332naA c34332naA = overviewViewModel2.AYXKKw;
            this.L$0 = overviewViewModel2;
            this.label = 1;
            Object objEZpvd = c34332naA.EZpvd(this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            overviewViewModel = overviewViewModel2;
            obj = objEZpvd;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            overviewViewModel = (OverviewViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        overviewViewModel.djBIcL = ((Boolean) obj).booleanValue();
        return Unit.INSTANCE;
    }
}
