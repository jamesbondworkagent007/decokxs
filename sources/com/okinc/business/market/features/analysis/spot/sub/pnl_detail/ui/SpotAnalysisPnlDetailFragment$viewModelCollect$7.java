package com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui;

import com.okinc.business.market.features.analysis.spot.root.ui.viewmodel.SpotAnalysisViewModel;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailPageType;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailVo;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49371unL;
import o.jMI;
import o.jMM;
import o.qZH;

/* JADX INFO: loaded from: classes15.dex */
public final class SpotAnalysisPnlDetailFragment$viewModelCollect$7 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends PnlDetailVo>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ jMI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisPnlDetailFragment$viewModelCollect$7(jMI jmi, Continuation<? super SpotAnalysisPnlDetailFragment$viewModelCollect$7> continuation) {
        super(2, continuation);
        this.this$0 = jmi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SpotAnalysisPnlDetailFragment$viewModelCollect$7 spotAnalysisPnlDetailFragment$viewModelCollect$7 = new SpotAnalysisPnlDetailFragment$viewModelCollect$7(this.this$0, continuation);
        spotAnalysisPnlDetailFragment$viewModelCollect$7.L$0 = obj;
        return spotAnalysisPnlDetailFragment$viewModelCollect$7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends PnlDetailVo> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC49371unL<PnlDetailVo>) interfaceC49371unL, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC49371unL<PnlDetailVo> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return ((SpotAnalysisPnlDetailFragment$viewModelCollect$7) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC49371unL<Unit> interfaceC49371unLCopydefault;
        SpotAnalysisViewModel spotAnalysisViewModelAYXKKw;
        InterfaceC49371unL<Unit> interfaceC49371unL;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49371unL interfaceC49371unL2 = (InterfaceC49371unL) this.L$0;
            if (interfaceC49371unL2 instanceof InterfaceC49371unL.StateListAnimator) {
                return Unit.INSTANCE;
            }
            if (interfaceC49371unL2 instanceof InterfaceC49371unL.Activity) {
                jMM jmm = (jMM) this.this$0.valueOf.get(PnlDetailPageType.ALL_TIME);
                if (jmm != null) {
                    jmm.KWHzl(((PnlDetailVo) ((InterfaceC49371unL.Activity) interfaceC49371unL2).copydefault()).getPnlList());
                }
                interfaceC49371unLCopydefault = new InterfaceC49371unL.Activity<>(Unit.INSTANCE);
            } else {
                interfaceC49371unLCopydefault = this.this$0.copydefault(interfaceC49371unL2, C33070mpX.AYXKKw(qZH.PendingIntent.alsFma));
            }
            spotAnalysisViewModelAYXKKw = this.this$0.AYXKKw();
            SpotAnalysisViewModel spotAnalysisViewModelAYXKKw2 = this.this$0.AYXKKw();
            this.L$0 = interfaceC49371unLCopydefault;
            this.L$1 = spotAnalysisViewModelAYXKKw;
            this.label = 1;
            Object objEZpvd = spotAnalysisViewModelAYXKKw2.EZpvd(this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            interfaceC49371unL = interfaceC49371unLCopydefault;
            obj = objEZpvd;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            spotAnalysisViewModelAYXKKw = (SpotAnalysisViewModel) this.L$1;
            interfaceC49371unL = (InterfaceC49371unL) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        HashMap<Integer, InterfaceC49371unL<Unit>> map = (HashMap) obj;
        map.put(C56443yFo.AEQbTJ(this.this$0.EZpvd()), interfaceC49371unL);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (spotAnalysisViewModelAYXKKw.EZpvd(map, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
