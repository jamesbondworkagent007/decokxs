package com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui;

import com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui.viewmodel.SpotAnalysisCumulativePnlViewModel;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49371unL;
import o.jLZ;

/* JADX INFO: loaded from: classes15.dex */
public final class SpotAnalysisCumulativePnlFragment$viewModelCollect$8 extends SuspendLambda implements Function2<HashMap<Integer, InterfaceC49371unL<? extends Unit>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ jLZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisCumulativePnlFragment$viewModelCollect$8(jLZ jlz, Continuation<? super SpotAnalysisCumulativePnlFragment$viewModelCollect$8> continuation) {
        super(2, continuation);
        this.this$0 = jlz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SpotAnalysisCumulativePnlFragment$viewModelCollect$8 spotAnalysisCumulativePnlFragment$viewModelCollect$8 = new SpotAnalysisCumulativePnlFragment$viewModelCollect$8(this.this$0, continuation);
        spotAnalysisCumulativePnlFragment$viewModelCollect$8.L$0 = obj;
        return spotAnalysisCumulativePnlFragment$viewModelCollect$8;
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
        return ((SpotAnalysisCumulativePnlFragment$viewModelCollect$8) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            HashMap map = (HashMap) this.L$0;
            SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModelDbNXlk = this.this$0.DbNXlk();
            InterfaceC49371unL<Unit> actionBar = (InterfaceC49371unL) map.get(C56443yFo.AEQbTJ(this.this$0.djBIcL()));
            if (actionBar == null) {
                actionBar = new InterfaceC49371unL.ActionBar<>(Unit.INSTANCE);
            }
            this.label = 1;
            if (spotAnalysisCumulativePnlViewModelDbNXlk.copydefault(actionBar, this) == objCopydefault) {
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
