package com.okinc.kline.ui.formula.ui;

import androidx.fragment.app.FragmentManager;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.api.bean.EntryType;
import com.okinc.kline.features.settings.main.data.model.SettingEntryPoint;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C36204oTc;
import o.C36250oUv;
import o.C37925pFu;
import o.C37932pGa;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC39563puh;
import o.oKD;
import o.oUN;

/* JADX INFO: loaded from: classes8.dex */
public final class KLineFormulaFragment$showChartSetting$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ KLineFormulaFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineFormulaFragment$showChartSetting$1(KLineFormulaFragment kLineFormulaFragment, Continuation<? super KLineFormulaFragment$showChartSetting$1> continuation) {
        super(2, continuation);
        this.this$0 = kLineFormulaFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineFormulaFragment$showChartSetting$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KLineFormulaFragment$showChartSetting$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C36250oUv c36250oUvQVAiDq = this.this$0.QVAiDq();
            if (c36250oUvQVAiDq != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq.AkhnZx()) != null) {
                oUN ounOLrzqt = oUN.Companion.OLrzqt();
                this.label = 1;
                if (ounOLrzqt.OLrzqt(chartViewOutSideConfigAkhnZx, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        TaskDescription taskDescription = new TaskDescription(this.this$0);
        C36204oTc.StateListAnimator stateListAnimator = C36204oTc.Companion;
        SettingEntryPoint settingEntryPoint = new SettingEntryPoint(EntryType.PRO_FORMULA, null, null, null, false, false, false, false, false, false, false, false, false, false, false, 32766, null);
        FragmentManager childFragmentManager = this.this$0.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        stateListAnimator.OLrzqt(settingEntryPoint, childFragmentManager).OLrzqt(taskDescription);
        return Unit.INSTANCE;
    }

    public static final class TaskDescription implements oKD {
        public final /* synthetic */ KLineFormulaFragment KWHzl;

        @Override // o.oKD
        public void EZpvd(float f) {
        }

        @Override // o.oKD
        public void KWHzl() {
        }

        @Override // o.oKD
        public void copydefault() {
        }

        public TaskDescription(KLineFormulaFragment kLineFormulaFragment) {
            this.KWHzl = kLineFormulaFragment;
        }

        @Override // o.oKD
        public void AEQbTJ(boolean z) {
            oKD.TaskDescription.OLrzqt(this, z);
        }

        @Override // o.oKD
        public void EZpvd() {
            oKD.TaskDescription.OLrzqt(this);
        }

        @Override // o.oKD
        public void EZpvd(boolean z) {
            oKD.TaskDescription.copydefault(this, z);
        }

        @Override // o.oKD
        public void KWHzl(long j) {
            oKD.TaskDescription.OLrzqt(this, j);
        }

        @Override // o.oKD
        public void OLrzqt() {
            oKD.TaskDescription.copydefault(this);
        }

        @Override // o.oKD
        public void valueOf(boolean z) {
            oKD.TaskDescription.AEQbTJ(this, z);
        }

        @Override // o.oKD
        public void AYXKKw(boolean z) {
            C36250oUv c36250oUvQVAiDq = this.KWHzl.QVAiDq();
            if (c36250oUvQVAiDq != null) {
                c36250oUvQVAiDq.AEQbTJ(z);
            }
            this.KWHzl.UrRBLY();
        }

        @Override // o.oKD
        public void OLrzqt(boolean z) {
            C36250oUv c36250oUvQVAiDq;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            SPUtils.put("chart_countdown", Boolean.valueOf(z));
            C36250oUv c36250oUvQVAiDq2 = this.KWHzl.QVAiDq();
            if (c36250oUvQVAiDq2 != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setMShowCountdown(z);
            }
            this.KWHzl.UrRBLY();
            if (!z || (c36250oUvQVAiDq = this.KWHzl.QVAiDq()) == null) {
                return;
            }
            c36250oUvQVAiDq.QKVWgx();
        }

        @Override // o.oKD
        public void AhwBna(boolean z) {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            SPUtils.put("chart_price_warning", Boolean.valueOf(z));
            C36250oUv c36250oUvQVAiDq = this.KWHzl.QVAiDq();
            if (c36250oUvQVAiDq != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setShowPriceWarning(z);
            }
            this.KWHzl.UrRBLY();
        }

        @Override // o.oKD
        public void djBIcL(boolean z) {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
            SPUtils.put("chart_history_order", Boolean.valueOf(z));
            C36250oUv c36250oUvQVAiDq = this.KWHzl.QVAiDq();
            if (c36250oUvQVAiDq != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQVAiDq.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx2.setMShowHistoryOrder(z);
            }
            C36250oUv c36250oUvQVAiDq2 = this.KWHzl.QVAiDq();
            if (c36250oUvQVAiDq2 != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setMChartOffsetInit(false);
            }
            this.KWHzl.UrRBLY();
        }

        @Override // o.oKD
        public void copydefault(boolean z) {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
            SPUtils.put("chart_current_order", Boolean.valueOf(z));
            C36250oUv c36250oUvQVAiDq = this.KWHzl.QVAiDq();
            if (c36250oUvQVAiDq != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQVAiDq.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx2.setMShowCurrentOrder(z);
            }
            C36250oUv c36250oUvQVAiDq2 = this.KWHzl.QVAiDq();
            if (c36250oUvQVAiDq2 != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setMChartOffsetInit(false);
            }
            C37932pGa c37932pGa = C37932pGa.AEQbTJ;
            c37932pGa.EZpvd();
            c37932pGa.copydefault();
            c37932pGa.OLrzqt();
            this.KWHzl.UrRBLY();
        }

        @Override // o.oKD
        public void KWHzl(boolean z) {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
            SPUtils.put("chart_cost_line", Boolean.valueOf(z));
            C36250oUv c36250oUvQVAiDq = this.KWHzl.QVAiDq();
            if (c36250oUvQVAiDq != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQVAiDq.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx2.setMShowCostLine(z);
            }
            C36250oUv c36250oUvQVAiDq2 = this.KWHzl.QVAiDq();
            if (c36250oUvQVAiDq2 != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setMChartOffsetInit(false);
            }
            C37932pGa c37932pGa = C37932pGa.AEQbTJ;
            c37932pGa.EZpvd();
            c37932pGa.copydefault();
            c37932pGa.OLrzqt();
            this.KWHzl.UrRBLY();
        }

        @Override // o.oKD
        public void gEmmrt(boolean z) {
            String strOcIXYQ;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            SPUtils.put("chart_spot_average", Boolean.valueOf(z));
            C36250oUv c36250oUvQVAiDq = this.KWHzl.QVAiDq();
            if (c36250oUvQVAiDq != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setShowSpotAveragePrice(z);
            }
            if (!z || (strOcIXYQ = this.KWHzl.OcIXYQ()) == null) {
                return;
            }
            KLineFormulaFragment kLineFormulaFragment = this.KWHzl;
            int iAEQbTJ = C37925pFu.KWHzl.AEQbTJ(kLineFormulaFragment.ORxRYg(), kLineFormulaFragment.DTwDnp());
            InterfaceC39563puh.StateListAnimator stateListAnimatorDNCPSb = kLineFormulaFragment.dNCPSb();
            if (stateListAnimatorDNCPSb != null) {
                String strORxRYg = kLineFormulaFragment.ORxRYg();
                Intrinsics.copydefault((Object) strORxRYg);
                InterfaceC39563puh.StateListAnimator.TaskDescription.loadCumulativeCost$default(stateListAnimatorDNCPSb, kLineFormulaFragment, strORxRYg, strOcIXYQ, iAEQbTJ, false, 16, null);
            }
        }
    }
}
