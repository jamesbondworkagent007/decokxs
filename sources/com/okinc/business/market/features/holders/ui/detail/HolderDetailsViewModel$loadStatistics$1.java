package com.okinc.business.market.features.holders.ui.detail;

import com.okinc.business.market.features.holders.domain.model.HistoryStatistics;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.jYE;
import o.jZR;

/* JADX INFO: loaded from: classes7.dex */
public final class HolderDetailsViewModel$loadStatistics$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ HolderDetailsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HolderDetailsViewModel$loadStatistics$1(HolderDetailsViewModel holderDetailsViewModel, Continuation<? super HolderDetailsViewModel$loadStatistics$1> continuation) {
        super(2, continuation);
        this.this$0 = holderDetailsViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HolderDetailsViewModel$loadStatistics$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HolderDetailsViewModel$loadStatistics$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jYE jye = this.this$0.isConnected;
            String strAEQbTJ = this.this$0.EZpvd().AEQbTJ();
            String strValueOf = this.this$0.EZpvd().valueOf();
            String strKWHzl = this.this$0.EZpvd().KWHzl();
            this.label = 1;
            objAEQbTJ = jye.AEQbTJ(strAEQbTJ, strValueOf, strKWHzl, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        HolderDetailsViewModel holderDetailsViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            holderDetailsViewModel.AYXKKw.setValue((HistoryStatistics) objAEQbTJ);
            holderDetailsViewModel.gEmmrt.setValue(jZR.StateListAnimator.EZpvd);
            holderDetailsViewModel.isConnected.OLrzqt(holderDetailsViewModel.EZpvd().AEQbTJ(), holderDetailsViewModel.EZpvd().valueOf(), holderDetailsViewModel.EZpvd().KWHzl());
        }
        HolderDetailsViewModel holderDetailsViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
        if (thM7380exceptionOrNullimpl != null) {
            holderDetailsViewModel2.gEmmrt.setValue(new jZR.Activity(thM7380exceptionOrNullimpl));
        }
        return Unit.INSTANCE;
    }
}
