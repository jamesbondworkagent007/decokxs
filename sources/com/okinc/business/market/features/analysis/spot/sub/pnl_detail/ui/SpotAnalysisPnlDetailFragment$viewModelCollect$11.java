package com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui;

import com.okinc.business.market.features.analysis.spot.root.ui.viewmodel.SpotAnalysisViewModel;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.viewmodel.SpotAnalysisPnlDetailViewModel;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C25973jNf;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49371unL;
import o.jMI;
import o.jMM;
import o.qZH;

/* JADX INFO: loaded from: classes15.dex */
public final class SpotAnalysisPnlDetailFragment$viewModelCollect$11 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends Unit>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ jMI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisPnlDetailFragment$viewModelCollect$11(jMI jmi, Continuation<? super SpotAnalysisPnlDetailFragment$viewModelCollect$11> continuation) {
        super(2, continuation);
        this.this$0 = jmi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SpotAnalysisPnlDetailFragment$viewModelCollect$11 spotAnalysisPnlDetailFragment$viewModelCollect$11 = new SpotAnalysisPnlDetailFragment$viewModelCollect$11(this.this$0, continuation);
        spotAnalysisPnlDetailFragment$viewModelCollect$11.L$0 = obj;
        return spotAnalysisPnlDetailFragment$viewModelCollect$11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends Unit> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC49371unL<Unit>) interfaceC49371unL, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC49371unL<Unit> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return ((SpotAnalysisPnlDetailFragment$viewModelCollect$11) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        HashMap map;
        InterfaceC49371unL<Unit> interfaceC49371unL;
        SpotAnalysisViewModel spotAnalysisViewModelAYXKKw;
        InterfaceC49371unL<Unit> interfaceC49371unL2;
        HashMap<Integer, InterfaceC49371unL<Unit>> map2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49371unL<Unit> interfaceC49371unL3 = (InterfaceC49371unL) this.L$0;
            map = this.this$0.valueOf;
            jMI jmi = this.this$0;
            SpotAnalysisPnlDetailViewModel spotAnalysisPnlDetailViewModelAhwBna = jmi.AhwBna();
            this.L$0 = interfaceC49371unL3;
            this.L$1 = map;
            this.label = 1;
            Object objAEQbTJ = jmi.AEQbTJ(spotAnalysisPnlDetailViewModelAhwBna, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            interfaceC49371unL = interfaceC49371unL3;
            obj = objAEQbTJ;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                spotAnalysisViewModelAYXKKw = (SpotAnalysisViewModel) this.L$1;
                interfaceC49371unL2 = (InterfaceC49371unL) this.L$0;
                C56391yDq.AEQbTJ(obj);
                map2 = (HashMap) obj;
                map2.put(C56443yFo.AEQbTJ(this.this$0.EZpvd()), interfaceC49371unL2);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (spotAnalysisViewModelAYXKKw.EZpvd(map2, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            map = (HashMap) this.L$1;
            InterfaceC49371unL<Unit> interfaceC49371unL4 = (InterfaceC49371unL) this.L$0;
            C56391yDq.AEQbTJ(obj);
            interfaceC49371unL = interfaceC49371unL4;
        }
        jMM jmm = (jMM) map.get(((C25973jNf) obj).copydefault());
        if (jmm != null) {
            jMM.updatePageState$default(jmm, interfaceC49371unL, C33070mpX.AYXKKw(qZH.PendingIntent.alsFma), null, 4, null);
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
            this.this$0.gEmmrt();
            return Unit.INSTANCE;
        }
        spotAnalysisViewModelAYXKKw = this.this$0.AYXKKw();
        SpotAnalysisViewModel spotAnalysisViewModelAYXKKw2 = this.this$0.AYXKKw();
        this.L$0 = interfaceC49371unL;
        this.L$1 = spotAnalysisViewModelAYXKKw;
        this.label = 2;
        obj = spotAnalysisViewModelAYXKKw2.EZpvd(this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        interfaceC49371unL2 = interfaceC49371unL;
        map2 = (HashMap) obj;
        map2.put(C56443yFo.AEQbTJ(this.this$0.EZpvd()), interfaceC49371unL2);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
        if (spotAnalysisViewModelAYXKKw.EZpvd(map2, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
