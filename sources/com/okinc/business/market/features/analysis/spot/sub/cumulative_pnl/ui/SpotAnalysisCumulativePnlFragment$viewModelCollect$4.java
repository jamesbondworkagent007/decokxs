package com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.market.features.analysis.spot.root.ui.viewmodel.SpotAnalysisViewModel;
import com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.data.model.CumulativePnlPo;
import com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui.SpotAnalysisCumulativePnlFragment$viewModelCollect$4;
import com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui.viewmodel.SpotAnalysisCumulativePnlViewModel;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C33070mpX;
import o.C42793rdC;
import o.C52761wXj;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49371unL;
import o.jHW;
import o.jHY;
import o.jHZ;
import o.jLZ;
import o.qXK;
import o.qZH;
import o.rVN;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class SpotAnalysisCumulativePnlFragment$viewModelCollect$4 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends CumulativePnlPo>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ jLZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisCumulativePnlFragment$viewModelCollect$4(jLZ jlz, Continuation<? super SpotAnalysisCumulativePnlFragment$viewModelCollect$4> continuation) {
        super(2, continuation);
        this.this$0 = jlz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SpotAnalysisCumulativePnlFragment$viewModelCollect$4 spotAnalysisCumulativePnlFragment$viewModelCollect$4 = new SpotAnalysisCumulativePnlFragment$viewModelCollect$4(this.this$0, continuation);
        spotAnalysisCumulativePnlFragment$viewModelCollect$4.L$0 = obj;
        return spotAnalysisCumulativePnlFragment$viewModelCollect$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends CumulativePnlPo> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC49371unL<CumulativePnlPo>) interfaceC49371unL, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC49371unL<CumulativePnlPo> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return ((SpotAnalysisCumulativePnlFragment$viewModelCollect$4) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b6 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C42793rdC c42793rdC;
        final jLZ jlz;
        InterfaceC49371unL<Unit> activity;
        C42793rdC c42793rdC2;
        InterfaceC49371unL<Unit> activity2;
        jLZ jlz2;
        Object objCopydefault;
        InterfaceC49371unL interfaceC49371unL;
        C42793rdC c42793rdC3;
        Object objEZpvd;
        InterfaceC49371unL<Unit> interfaceC49371unL2;
        SpotAnalysisViewModel spotAnalysisViewModel;
        C42793rdC c42793rdC4;
        jLZ jlz3;
        List<CumulativePnlPo.EveryTimeStepPnlList> everyTimeStepPnlList;
        HashMap<Integer, InterfaceC49371unL<Unit>> map;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49371unL interfaceC49371unL3 = (InterfaceC49371unL) this.L$0;
            c42793rdC = this.this$0.djBIcL;
            if (c42793rdC != null) {
                jlz = this.this$0;
                if (interfaceC49371unL3 instanceof InterfaceC49371unL.StateListAnimator) {
                    return Unit.INSTANCE;
                }
                if (interfaceC49371unL3 instanceof InterfaceC49371unL.Activity) {
                    jlz.fARcdN();
                    SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModelDbNXlk = jlz.DbNXlk();
                    this.L$0 = interfaceC49371unL3;
                    this.L$1 = c42793rdC;
                    this.L$2 = jlz;
                    this.L$3 = c42793rdC;
                    this.label = 1;
                    objCopydefault = jlz.copydefault(spotAnalysisCumulativePnlViewModelDbNXlk, this);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    interfaceC49371unL = interfaceC49371unL3;
                    c42793rdC3 = c42793rdC;
                    InterfaceC49371unL.Activity activity3 = (InterfaceC49371unL.Activity) interfaceC49371unL;
                    jlz.KWHzl(((CumulativePnlPo) activity3.copydefault()).getTodayPnl());
                    String pnl = ((CumulativePnlPo) activity3.copydefault()).getPnl();
                    jlz.copydefault(pnl != null ? pnl : "--");
                    jHY jhy = c42793rdC.djBIcL;
                    everyTimeStepPnlList = ((CumulativePnlPo) activity3.copydefault()).getEveryTimeStepPnlList();
                    if (everyTimeStepPnlList == null) {
                    }
                    jhy.setData(new jHZ(jlz.OLrzqt(everyTimeStepPnlList), new jHW(C33070mpX.copydefault(C52761wXj.Activity.iKEqwx), 1.5f, 0.0f, 0.0f, null, true, false, false, true, -1, false, false, 3228, null)));
                    activity2 = new InterfaceC49371unL.Activity<>(Unit.INSTANCE);
                    rVN.reportFullyDrawn$default((Fragment) jlz, true, (String) null, 2, (Object) null);
                    jlz2 = jlz;
                    c42793rdC2 = c42793rdC3;
                } else {
                    if (interfaceC49371unL3 instanceof InterfaceC49371unL.ActionBar) {
                        jlz.KWHzl("--");
                        jlz.copydefault("--");
                        qXK.StateListAnimator.showLoadingState$default(jlz, 0L, 1, null);
                        activity = new InterfaceC49371unL.ActionBar<>(Unit.INSTANCE);
                    } else if (interfaceC49371unL3 instanceof InterfaceC49371unL.TaskDescription) {
                        jlz.KWHzl("--");
                        jlz.copydefault("--");
                        InterfaceC49371unL.TaskDescription taskDescription = new InterfaceC49371unL.TaskDescription(Unit.INSTANCE);
                        qXK.StateListAnimator.showEmptyState$default(jlz, C33070mpX.AYXKKw(qZH.PendingIntent.isConnected), (String) null, (String) null, 0, (Function0) null, 30, (Object) null);
                        rVN.reportFullyDrawn$default((Fragment) jlz, true, (String) null, 2, (Object) null);
                        activity = taskDescription;
                    } else if (interfaceC49371unL3 instanceof InterfaceC49371unL.Application) {
                        jlz.KWHzl("--");
                        jlz.copydefault("--");
                        activity = new InterfaceC49371unL.Application<>(((InterfaceC49371unL.Application) interfaceC49371unL3).AEQbTJ(), Unit.INSTANCE);
                        jlz.EZpvd(qZH.PendingIntent.GQzpsZ, qZH.PendingIntent.hwkNQP, qZH.PendingIntent.gFTCsA, new Function0() { // from class: o.jMe
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return SpotAnalysisCumulativePnlFragment$viewModelCollect$4.invokeSuspend$lambda$3$lambda$1(jlz);
                            }
                        });
                        rVN.reportFullyDrawn$default((Fragment) jlz, false, (String) null, 2, (Object) null);
                    } else {
                        jlz.fARcdN();
                        activity = new InterfaceC49371unL.Activity<>(Unit.INSTANCE);
                    }
                    c42793rdC2 = c42793rdC;
                    activity2 = activity;
                    jlz2 = jlz;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            spotAnalysisViewModel = (SpotAnalysisViewModel) this.L$3;
            InterfaceC49371unL<Unit> interfaceC49371unL4 = (InterfaceC49371unL) this.L$2;
            jLZ jlz4 = (jLZ) this.L$1;
            C42793rdC c42793rdC5 = (C42793rdC) this.L$0;
            C56391yDq.AEQbTJ(obj);
            c42793rdC4 = c42793rdC5;
            jlz3 = jlz4;
            interfaceC49371unL2 = interfaceC49371unL4;
            objEZpvd = obj;
            map = (HashMap) objEZpvd;
            map.put(C56443yFo.AEQbTJ(jlz3.djBIcL()), interfaceC49371unL2);
            this.L$0 = c42793rdC4;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 3;
            if (spotAnalysisViewModel.EZpvd(map, this) == objCopydefault2) {
                return objCopydefault2;
            }
            return Unit.INSTANCE;
        }
        c42793rdC = (C42793rdC) this.L$3;
        jlz = (jLZ) this.L$2;
        C42793rdC c42793rdC6 = (C42793rdC) this.L$1;
        InterfaceC49371unL interfaceC49371unL5 = (InterfaceC49371unL) this.L$0;
        C56391yDq.AEQbTJ(obj);
        interfaceC49371unL = interfaceC49371unL5;
        c42793rdC3 = c42793rdC6;
        objCopydefault = obj;
        InterfaceC49371unL.Activity activity32 = (InterfaceC49371unL.Activity) interfaceC49371unL;
        jlz.KWHzl(((CumulativePnlPo) activity32.copydefault()).getTodayPnl());
        String pnl2 = ((CumulativePnlPo) activity32.copydefault()).getPnl();
        jlz.copydefault(pnl2 != null ? pnl2 : "--");
        jHY jhy2 = c42793rdC.djBIcL;
        everyTimeStepPnlList = ((CumulativePnlPo) activity32.copydefault()).getEveryTimeStepPnlList();
        if (everyTimeStepPnlList == null) {
            everyTimeStepPnlList = yDY.AhwBna();
        }
        jhy2.setData(new jHZ(jlz.OLrzqt(everyTimeStepPnlList), new jHW(C33070mpX.copydefault(C52761wXj.Activity.iKEqwx), 1.5f, 0.0f, 0.0f, null, true, false, false, true, -1, false, false, 3228, null)));
        activity2 = new InterfaceC49371unL.Activity<>(Unit.INSTANCE);
        rVN.reportFullyDrawn$default((Fragment) jlz, true, (String) null, 2, (Object) null);
        jlz2 = jlz;
        c42793rdC2 = c42793rdC3;
        SpotAnalysisViewModel spotAnalysisViewModelValues = jlz2.values();
        SpotAnalysisViewModel spotAnalysisViewModelValues2 = jlz2.values();
        this.L$0 = c42793rdC2;
        this.L$1 = jlz2;
        this.L$2 = activity2;
        this.L$3 = spotAnalysisViewModelValues;
        this.label = 2;
        objEZpvd = spotAnalysisViewModelValues2.EZpvd(this);
        if (objEZpvd == objCopydefault2) {
            return objCopydefault2;
        }
        jLZ jlz5 = jlz2;
        interfaceC49371unL2 = activity2;
        spotAnalysisViewModel = spotAnalysisViewModelValues;
        c42793rdC4 = c42793rdC2;
        jlz3 = jlz5;
        map = (HashMap) objEZpvd;
        map.put(C56443yFo.AEQbTJ(jlz3.djBIcL()), interfaceC49371unL2);
        this.L$0 = c42793rdC4;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 3;
        if (spotAnalysisViewModel.EZpvd(map, this) == objCopydefault2) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3$lambda$1(jLZ jlz) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(jlz), null, null, new SpotAnalysisCumulativePnlFragment$viewModelCollect$4$1$2$1(jlz, null), 3, null);
        return Unit.INSTANCE;
    }
}
