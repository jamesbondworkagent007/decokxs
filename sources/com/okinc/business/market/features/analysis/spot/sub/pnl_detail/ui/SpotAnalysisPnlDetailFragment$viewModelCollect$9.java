package com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui;

import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.viewmodel.SpotAnalysisPnlDetailViewModel;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49371unL;
import o.jMI;

/* JADX INFO: loaded from: classes15.dex */
public final class SpotAnalysisPnlDetailFragment$viewModelCollect$9 extends SuspendLambda implements Function2<HashMap<Integer, InterfaceC49371unL<? extends Unit>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ jMI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisPnlDetailFragment$viewModelCollect$9(jMI jmi, Continuation<? super SpotAnalysisPnlDetailFragment$viewModelCollect$9> continuation) {
        super(2, continuation);
        this.this$0 = jmi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SpotAnalysisPnlDetailFragment$viewModelCollect$9 spotAnalysisPnlDetailFragment$viewModelCollect$9 = new SpotAnalysisPnlDetailFragment$viewModelCollect$9(this.this$0, continuation);
        spotAnalysisPnlDetailFragment$viewModelCollect$9.L$0 = obj;
        return spotAnalysisPnlDetailFragment$viewModelCollect$9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(HashMap<Integer, InterfaceC49371unL<? extends Unit>> map, Continuation<? super Unit> continuation) {
        return invoke2((HashMap<Integer, InterfaceC49371unL<Unit>>) map, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(HashMap<Integer, InterfaceC49371unL<Unit>> map, Continuation<? super Unit> continuation) {
        return ((SpotAnalysisPnlDetailFragment$viewModelCollect$9) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            HashMap map = (HashMap) this.L$0;
            SpotAnalysisPnlDetailViewModel spotAnalysisPnlDetailViewModelAhwBna = this.this$0.AhwBna();
            InterfaceC49371unL<Unit> actionBar = (InterfaceC49371unL) map.get(C56443yFo.AEQbTJ(this.this$0.EZpvd()));
            if (actionBar == null) {
                actionBar = new InterfaceC49371unL.ActionBar<>(Unit.INSTANCE);
            }
            this.label = 1;
            if (spotAnalysisPnlDetailViewModelAhwBna.EZpvd(actionBar, this) == objCopydefault) {
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
