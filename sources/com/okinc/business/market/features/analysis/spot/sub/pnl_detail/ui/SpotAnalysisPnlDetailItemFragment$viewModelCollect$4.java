package com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui;

import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailListSortType;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.viewmodel.SpotAnalysisPnlDetailItemViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.jMM;

/* JADX INFO: loaded from: classes15.dex */
public final class SpotAnalysisPnlDetailItemFragment$viewModelCollect$4 extends SuspendLambda implements Function2<PnlDetailListSortType, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ jMM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisPnlDetailItemFragment$viewModelCollect$4(jMM jmm, Continuation<? super SpotAnalysisPnlDetailItemFragment$viewModelCollect$4> continuation) {
        super(2, continuation);
        this.this$0 = jmm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SpotAnalysisPnlDetailItemFragment$viewModelCollect$4 spotAnalysisPnlDetailItemFragment$viewModelCollect$4 = new SpotAnalysisPnlDetailItemFragment$viewModelCollect$4(this.this$0, continuation);
        spotAnalysisPnlDetailItemFragment$viewModelCollect$4.L$0 = obj;
        return spotAnalysisPnlDetailItemFragment$viewModelCollect$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PnlDetailListSortType pnlDetailListSortType, Continuation<? super Unit> continuation) {
        return ((SpotAnalysisPnlDetailItemFragment$viewModelCollect$4) create(pnlDetailListSortType, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            PnlDetailListSortType pnlDetailListSortType = (PnlDetailListSortType) this.L$0;
            SpotAnalysisPnlDetailItemViewModel spotAnalysisPnlDetailItemViewModelGEmmrt = this.this$0.gEmmrt();
            this.label = 1;
            if (spotAnalysisPnlDetailItemViewModelGEmmrt.KWHzl(pnlDetailListSortType, this) == objCopydefault) {
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
