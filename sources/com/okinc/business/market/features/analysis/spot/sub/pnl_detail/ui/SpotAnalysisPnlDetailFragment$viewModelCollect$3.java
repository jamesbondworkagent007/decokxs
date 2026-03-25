package com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailPageType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C33062mpP;
import o.C42842rdz;
import o.C56391yDq;
import o.C56442yFn;
import o.jMI;
import o.jMM;

/* JADX INFO: loaded from: classes15.dex */
public final class SpotAnalysisPnlDetailFragment$viewModelCollect$3 extends SuspendLambda implements Function2<PnlDetailPageType, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ jMI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisPnlDetailFragment$viewModelCollect$3(jMI jmi, Continuation<? super SpotAnalysisPnlDetailFragment$viewModelCollect$3> continuation) {
        super(2, continuation);
        this.this$0 = jmi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SpotAnalysisPnlDetailFragment$viewModelCollect$3 spotAnalysisPnlDetailFragment$viewModelCollect$3 = new SpotAnalysisPnlDetailFragment$viewModelCollect$3(this.this$0, continuation);
        spotAnalysisPnlDetailFragment$viewModelCollect$3.L$0 = obj;
        return spotAnalysisPnlDetailFragment$viewModelCollect$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PnlDetailPageType pnlDetailPageType, Continuation<? super Unit> continuation) {
        return ((SpotAnalysisPnlDetailFragment$viewModelCollect$3) create(pnlDetailPageType, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ConstraintLayout constraintLayout;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            PnlDetailPageType pnlDetailPageType = (PnlDetailPageType) this.L$0;
            HashMap map = this.this$0.valueOf;
            jMI jmi = this.this$0;
            Iterator it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getKey() == pnlDetailPageType) {
                    jMM jmm = (jMM) jmi.valueOf.get(entry.getKey());
                    if (jmm != null) {
                        FragmentManager childFragmentManager = jmi.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                        C33062mpP.show$default(jmm, childFragmentManager, false, 2, null);
                    }
                } else {
                    jMM jmm2 = (jMM) jmi.valueOf.get(entry.getKey());
                    if (jmm2 != null) {
                        FragmentManager childFragmentManager2 = jmi.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                        C33062mpP.hide$default(jmm2, childFragmentManager2, false, 2, null);
                    }
                }
            }
            C42842rdz c42842rdz = this.this$0.AYXKKw;
            if (c42842rdz != null && (constraintLayout = c42842rdz.EZpvd) != null) {
                constraintLayout.setVisibility(pnlDetailPageType != PnlDetailPageType.CURRENT_HOLDINGS ? 8 : 0);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
