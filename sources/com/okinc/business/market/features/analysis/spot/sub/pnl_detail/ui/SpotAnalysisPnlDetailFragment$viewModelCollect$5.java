package com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui;

import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.business.market.features.analysis.spot.root.ui.viewmodel.SpotAnalysisViewModel;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.SpotAnalysisPnlDetailFragment$viewModelCollect$5;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailPageType;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailVo;
import com.okinc.market.ext.UpDownColor;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.C27977kKi;
import o.C33070mpX;
import o.C38307pTy;
import o.C41426qqb;
import o.C42842rdz;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49371unL;
import o.jMI;
import o.jMM;
import o.pTB;
import o.qZH;

/* JADX INFO: loaded from: classes15.dex */
public final class SpotAnalysisPnlDetailFragment$viewModelCollect$5 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends PnlDetailVo>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ jMI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisPnlDetailFragment$viewModelCollect$5(jMI jmi, Continuation<? super SpotAnalysisPnlDetailFragment$viewModelCollect$5> continuation) {
        super(2, continuation);
        this.this$0 = jmi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SpotAnalysisPnlDetailFragment$viewModelCollect$5 spotAnalysisPnlDetailFragment$viewModelCollect$5 = new SpotAnalysisPnlDetailFragment$viewModelCollect$5(this.this$0, continuation);
        spotAnalysisPnlDetailFragment$viewModelCollect$5.L$0 = obj;
        return spotAnalysisPnlDetailFragment$viewModelCollect$5;
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
        return ((SpotAnalysisPnlDetailFragment$viewModelCollect$5) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC49371unL<Unit> interfaceC49371unLCopydefault;
        TextView textView;
        Object objEZpvd;
        InterfaceC49371unL<Unit> interfaceC49371unL;
        SpotAnalysisViewModel spotAnalysisViewModel;
        TextView textView2;
        String strOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49371unL interfaceC49371unL2 = (InterfaceC49371unL) this.L$0;
            if (interfaceC49371unL2 instanceof InterfaceC49371unL.StateListAnimator) {
                return Unit.INSTANCE;
            }
            if (interfaceC49371unL2 instanceof InterfaceC49371unL.Activity) {
                jMM jmm = (jMM) this.this$0.valueOf.get(PnlDetailPageType.CURRENT_HOLDINGS);
                if (jmm != null) {
                    jmm.KWHzl(((PnlDetailVo) ((InterfaceC49371unL.Activity) interfaceC49371unL2).copydefault()).getPnlList());
                }
                C42842rdz c42842rdz = this.this$0.AYXKKw;
                if (c42842rdz != null && (textView2 = c42842rdz.KWHzl) != null) {
                    InterfaceC49371unL.Activity activity = (InterfaceC49371unL.Activity) interfaceC49371unL2;
                    UpDownColor upDownColorAEQbTJ = UpDownColor.Companion.AEQbTJ(((PnlDetailVo) activity.copydefault()).getHoldingPnl());
                    String holdingPnl = ((PnlDetailVo) activity.copydefault()).getHoldingPnl();
                    if (holdingPnl == null || (strOLrzqt = C27977kKi.OLrzqt(holdingPnl, this.this$0.AhwBna().EZpvd().OLrzqt().getValue().getUnit(), (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 2) != 0 ? "" : this.this$0.AhwBna().EZpvd().OLrzqt().getValue().getSymbol(), (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 4) != 0 ? false : true, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 8) == 0 ? false : false, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 16) != 0 ? "" : null, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 32) == 0 ? null : "", (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 64) != 0 ? true : true, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 128) != 0 ? new Function2() { // from class: o.kKj
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj22) {
                            return C27977kKi.copydefault((BigDecimal) obj2, (C38307pTy) obj22);
                        }
                    } : new Function2() { // from class: o.jMP
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return SpotAnalysisPnlDetailFragment$viewModelCollect$5.invokeSuspend$lambda$1((BigDecimal) obj2, (C38307pTy) obj3);
                        }
                    }, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 256) != 0 ? new Function1() { // from class: o.kKn
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return C27977kKi.EZpvd(((java.lang.Integer) obj2).intValue());
                        }
                    } : null)) == null) {
                        strOLrzqt = "--";
                    }
                    C41426qqb.setText$default(textView2, upDownColorAEQbTJ, (CharSequence) strOLrzqt, 0, 0, 0, false, 60, (Object) null);
                }
                interfaceC49371unLCopydefault = new InterfaceC49371unL.Activity<>(Unit.INSTANCE);
            } else {
                C42842rdz c42842rdz2 = this.this$0.AYXKKw;
                if (c42842rdz2 != null && (textView = c42842rdz2.KWHzl) != null) {
                    C41426qqb.setText$default(textView, UpDownColor.NEUTRAL, (CharSequence) "--", 0, 0, 0, false, 60, (Object) null);
                }
                interfaceC49371unLCopydefault = this.this$0.copydefault(interfaceC49371unL2, C33070mpX.AYXKKw(qZH.PendingIntent.dLBcXg));
            }
            SpotAnalysisViewModel spotAnalysisViewModelAYXKKw = this.this$0.AYXKKw();
            SpotAnalysisViewModel spotAnalysisViewModelAYXKKw2 = this.this$0.AYXKKw();
            this.L$0 = interfaceC49371unLCopydefault;
            this.L$1 = spotAnalysisViewModelAYXKKw;
            this.label = 1;
            objEZpvd = spotAnalysisViewModelAYXKKw2.EZpvd(this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            interfaceC49371unL = interfaceC49371unLCopydefault;
            spotAnalysisViewModel = spotAnalysisViewModelAYXKKw;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            spotAnalysisViewModel = (SpotAnalysisViewModel) this.L$1;
            InterfaceC49371unL<Unit> interfaceC49371unL3 = (InterfaceC49371unL) this.L$0;
            C56391yDq.AEQbTJ(obj);
            interfaceC49371unL = interfaceC49371unL3;
            objEZpvd = obj;
        }
        HashMap<Integer, InterfaceC49371unL<Unit>> map = (HashMap) objEZpvd;
        map.put(C56443yFo.AEQbTJ(this.this$0.EZpvd()), interfaceC49371unL);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (spotAnalysisViewModel.EZpvd(map, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$1(BigDecimal bigDecimal, C38307pTy c38307pTy) {
        return pTB.formatICUNumber$default(bigDecimal, RoundingMode.HALF_DOWN, c38307pTy, null, null, 12, null);
    }
}
