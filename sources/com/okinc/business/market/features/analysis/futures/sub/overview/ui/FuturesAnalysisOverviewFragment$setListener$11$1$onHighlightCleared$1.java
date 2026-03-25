package com.okinc.business.market.features.analysis.futures.sub.overview.ui;

import android.content.Context;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C25915jLb;
import o.C41426qqb;
import o.C42782rcs;
import o.C52761wXj;
import o.C55366xib;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.jHY;
import o.jKQ;

/* JADX INFO: loaded from: classes23.dex */
public final class FuturesAnalysisOverviewFragment$setListener$11$1$onHighlightCleared$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ jHY $this_apply;
    int label;
    final /* synthetic */ jKQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAnalysisOverviewFragment$setListener$11$1$onHighlightCleared$1(jKQ jkq, jHY jhy, Continuation<? super FuturesAnalysisOverviewFragment$setListener$11$1$onHighlightCleared$1> continuation) {
        super(2, continuation);
        this.this$0 = jkq;
        this.$this_apply = jhy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesAnalysisOverviewFragment$setListener$11$1$onHighlightCleared$1(this.this$0, this.$this_apply, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesAnalysisOverviewFragment$setListener$11$1$onHighlightCleared$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C42782rcs c42782rcs;
        AppCompatTextView appCompatTextView;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jKQ jkq = this.this$0;
            FuturesAnalysisViewModel futuresAnalysisViewModelGEmmrt = jkq.gEmmrt();
            this.label = 1;
            obj = jkq.AEQbTJ(futuresAnalysisViewModelGEmmrt, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        FuturesAnalysisViewModel.StateListAnimator stateListAnimator = (FuturesAnalysisViewModel.StateListAnimator) obj;
        if (stateListAnimator.EZpvd() instanceof InterfaceC49371unL.Activity) {
            InterfaceC49371unL<C25915jLb> interfaceC49371unLEZpvd = stateListAnimator.EZpvd();
            Intrinsics.copydefault(interfaceC49371unLEZpvd, "");
            C25915jLb c25915jLb = (C25915jLb) ((InterfaceC49371unL.Activity) interfaceC49371unLEZpvd).copydefault();
            Context context = this.$this_apply.getContext();
            if (context != null && (c42782rcs = this.this$0.AEQbTJ) != null && (appCompatTextView = c42782rcs.QbewEr) != null) {
                C41426qqb.setText$default((TextView) appCompatTextView, c25915jLb.hDKMBd(), c25915jLb.iwGUEr(), 0, 0, C55366xib.KWHzl(C52761wXj.ActionBar.getPostValueLengthLimit, context), false, 44, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }
}
