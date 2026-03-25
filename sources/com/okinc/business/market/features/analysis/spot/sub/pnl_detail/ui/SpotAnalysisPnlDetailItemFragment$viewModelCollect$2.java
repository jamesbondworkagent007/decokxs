package com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui;

import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailVo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.jMM;
import o.jMX;
import o.qZH;
import o.yDY;

/* JADX INFO: loaded from: classes15.dex */
public final class SpotAnalysisPnlDetailItemFragment$viewModelCollect$2 extends SuspendLambda implements Function2<List<? extends PnlDetailVo.PnlListItem>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ jMM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisPnlDetailItemFragment$viewModelCollect$2(jMM jmm, Continuation<? super SpotAnalysisPnlDetailItemFragment$viewModelCollect$2> continuation) {
        super(2, continuation);
        this.this$0 = jmm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SpotAnalysisPnlDetailItemFragment$viewModelCollect$2 spotAnalysisPnlDetailItemFragment$viewModelCollect$2 = new SpotAnalysisPnlDetailItemFragment$viewModelCollect$2(this.this$0, continuation);
        spotAnalysisPnlDetailItemFragment$viewModelCollect$2.L$0 = obj;
        return spotAnalysisPnlDetailItemFragment$viewModelCollect$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends PnlDetailVo.PnlListItem> list, Continuation<? super Unit> continuation) {
        return invoke2((List<PnlDetailVo.PnlListItem>) list, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<PnlDetailVo.PnlListItem> list, Continuation<? super Unit> continuation) {
        return ((SpotAnalysisPnlDetailItemFragment$viewModelCollect$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List listAhwBna = (List) this.L$0;
            ArrayList arrayList = new ArrayList();
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            if (!listAhwBna.isEmpty()) {
                arrayList.addAll(listAhwBna);
                arrayList.add(new jMX.Application(C33070mpX.AYXKKw(qZH.PendingIntent.fTEjYi)));
            }
            this.this$0.isConnected.setItems(arrayList);
            this.this$0.isConnected.notifyDataSetChanged();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
