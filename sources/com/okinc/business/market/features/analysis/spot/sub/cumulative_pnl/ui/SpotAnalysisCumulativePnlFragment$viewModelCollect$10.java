package com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui;

import com.okinc.business.market.features.analysis.spot.root.ui.viewmodel.SpotAnalysisViewModel;
import com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui.viewmodel.SpotAnalysisCumulativePnlViewModel;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C25950jMj;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49371unL;
import o.jLZ;

/* JADX INFO: loaded from: classes15.dex */
public final class SpotAnalysisCumulativePnlFragment$viewModelCollect$10 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends Unit>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ jLZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisCumulativePnlFragment$viewModelCollect$10(jLZ jlz, Continuation<? super SpotAnalysisCumulativePnlFragment$viewModelCollect$10> continuation) {
        super(2, continuation);
        this.this$0 = jlz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SpotAnalysisCumulativePnlFragment$viewModelCollect$10 spotAnalysisCumulativePnlFragment$viewModelCollect$10 = new SpotAnalysisCumulativePnlFragment$viewModelCollect$10(this.this$0, continuation);
        spotAnalysisCumulativePnlFragment$viewModelCollect$10.L$0 = obj;
        return spotAnalysisCumulativePnlFragment$viewModelCollect$10;
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
        return ((SpotAnalysisCumulativePnlFragment$viewModelCollect$10) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        SpotAnalysisViewModel spotAnalysisViewModelValues;
        InterfaceC49371unL<Unit> interfaceC49371unL;
        String str;
        SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModel;
        String str2;
        HashMap<Integer, InterfaceC49371unL<Unit>> map;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49371unL<Unit> interfaceC49371unL2 = (InterfaceC49371unL) this.L$0;
            if (interfaceC49371unL2 instanceof InterfaceC49371unL.ActionBar) {
                SpotAnalysisViewModel spotAnalysisViewModelValues2 = this.this$0.values();
                this.label = 1;
                obj = spotAnalysisViewModelValues2.AEQbTJ(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                str = (String) obj;
                if (str != null) {
                }
            } else {
                spotAnalysisViewModelValues = this.this$0.values();
                SpotAnalysisViewModel spotAnalysisViewModelValues3 = this.this$0.values();
                this.L$0 = interfaceC49371unL2;
                this.L$1 = spotAnalysisViewModelValues;
                this.label = 3;
                Object objEZpvd = spotAnalysisViewModelValues3.EZpvd(this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                interfaceC49371unL = interfaceC49371unL2;
                obj = objEZpvd;
                map = (HashMap) obj;
                map.put(C56443yFo.AEQbTJ(this.this$0.djBIcL()), interfaceC49371unL);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 4;
                if (spotAnalysisViewModelValues.EZpvd(map, this) == objCopydefault) {
                }
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            str = (String) obj;
            if (str != null) {
                SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModelDbNXlk = this.this$0.DbNXlk();
                jLZ jlz = this.this$0;
                SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModelDbNXlk2 = jlz.DbNXlk();
                this.L$0 = spotAnalysisCumulativePnlViewModelDbNXlk;
                this.L$1 = str;
                this.label = 2;
                Object objCopydefault2 = jlz.copydefault(spotAnalysisCumulativePnlViewModelDbNXlk2, this);
                if (objCopydefault2 == objCopydefault) {
                    return objCopydefault;
                }
                spotAnalysisCumulativePnlViewModel = spotAnalysisCumulativePnlViewModelDbNXlk;
                str2 = str;
                obj = objCopydefault2;
                SpotAnalysisCumulativePnlViewModel.requestCumulativePnlWithDebounce$default(spotAnalysisCumulativePnlViewModel, str2, ((C25950jMj) obj).EZpvd().getPayload(), 0L, 4, null);
            }
        } else if (i == 2) {
            String str3 = (String) this.L$1;
            SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModel2 = (SpotAnalysisCumulativePnlViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            str2 = str3;
            spotAnalysisCumulativePnlViewModel = spotAnalysisCumulativePnlViewModel2;
            SpotAnalysisCumulativePnlViewModel.requestCumulativePnlWithDebounce$default(spotAnalysisCumulativePnlViewModel, str2, ((C25950jMj) obj).EZpvd().getPayload(), 0L, 4, null);
        } else if (i == 3) {
            spotAnalysisViewModelValues = (SpotAnalysisViewModel) this.L$1;
            interfaceC49371unL = (InterfaceC49371unL) this.L$0;
            C56391yDq.AEQbTJ(obj);
            map = (HashMap) obj;
            map.put(C56443yFo.AEQbTJ(this.this$0.djBIcL()), interfaceC49371unL);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 4;
            if (spotAnalysisViewModelValues.EZpvd(map, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
