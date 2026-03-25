package com.okinc.business.market.features.analysis.futures.sub.overview.ui;

import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C42782rcs;
import o.C56391yDq;
import o.C56442yFn;
import o.jKQ;

/* JADX INFO: loaded from: classes15.dex */
public final class FuturesAnalysisOverviewFragment$updateTradingFeeVisibility$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ jKQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAnalysisOverviewFragment$updateTradingFeeVisibility$1(jKQ jkq, Continuation<? super FuturesAnalysisOverviewFragment$updateTradingFeeVisibility$1> continuation) {
        super(2, continuation);
        this.this$0 = jkq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesAnalysisOverviewFragment$updateTradingFeeVisibility$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesAnalysisOverviewFragment$updateTradingFeeVisibility$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        C42782rcs c42782rcs;
        C42782rcs c42782rcs2;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.copydefault) {
                jKQ jkq = this.this$0;
                FuturesAnalysisViewModel futuresAnalysisViewModelGEmmrt = jkq.gEmmrt();
                this.label = 1;
                obj = jkq.AEQbTJ(futuresAnalysisViewModelGEmmrt, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            c42782rcs = this.this$0.AEQbTJ;
            if (c42782rcs != null && (appCompatTextView2 = c42782rcs.RJOkX) != null) {
                appCompatTextView2.setVisibility(!z ? 0 : 8);
            }
            c42782rcs2 = this.this$0.AEQbTJ;
            if (c42782rcs2 != null && (appCompatTextView = c42782rcs2.aKErDB) != null) {
                appCompatTextView.setVisibility(z ? 0 : 8);
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        z = ((FuturesAnalysisViewModel.StateListAnimator) obj).gEmmrt();
        c42782rcs = this.this$0.AEQbTJ;
        if (c42782rcs != null) {
            appCompatTextView2.setVisibility(!z ? 0 : 8);
        }
        c42782rcs2 = this.this$0.AEQbTJ;
        if (c42782rcs2 != null) {
            appCompatTextView.setVisibility(z ? 0 : 8);
        }
        return Unit.INSTANCE;
    }
}
