package com.okinc.business.market.features.analysis.futures.sub.funding.ui;

import com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel;
import com.okinc.business.market.features.analysis.futures.sub.funding.ui.model.CoinPairVo;
import com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel.SelectCoinPairViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25881jJv;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes15.dex */
public final class FutureAnalysisCoinPairDialogFragment$initData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C25881jJv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FutureAnalysisCoinPairDialogFragment$initData$1(C25881jJv c25881jJv, Continuation<? super FutureAnalysisCoinPairDialogFragment$initData$1> continuation) {
        super(2, continuation);
        this.this$0 = c25881jJv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FutureAnalysisCoinPairDialogFragment$initData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FutureAnalysisCoinPairDialogFragment$initData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        SelectCoinPairViewModel selectCoinPairViewModelKWHzl;
        CoinPairVo coinPairVo;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            selectCoinPairViewModelKWHzl = this.this$0.KWHzl();
            CoinPairVo coinPairVoAYXKKw = this.this$0.AYXKKw();
            C25881jJv c25881jJv = this.this$0;
            FuturesAnalysisViewModel futuresAnalysisViewModelEZpvd = c25881jJv.EZpvd();
            this.L$0 = selectCoinPairViewModelKWHzl;
            this.L$1 = coinPairVoAYXKKw;
            this.label = 1;
            Object objOLrzqt = c25881jJv.OLrzqt(futuresAnalysisViewModelEZpvd, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            coinPairVo = coinPairVoAYXKKw;
            obj = objOLrzqt;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coinPairVo = (CoinPairVo) this.L$1;
            selectCoinPairViewModelKWHzl = (SelectCoinPairViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        selectCoinPairViewModelKWHzl.OLrzqt(coinPairVo, ((FuturesAnalysisViewModel.StateListAnimator) obj).AEQbTJ().KWHzl());
        return Unit.INSTANCE;
    }
}
