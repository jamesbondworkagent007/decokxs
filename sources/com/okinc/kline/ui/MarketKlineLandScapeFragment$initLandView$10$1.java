package com.okinc.kline.ui;

import androidx.drawerlayout.widget.DrawerLayout;
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
import o.C36236oUh;
import o.C36250oUv;
import o.C37908pFd;
import o.C37925pFu;
import o.C38795pgF;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC39563puh;
import o.oKD;
import o.oUN;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketKlineLandScapeFragment$initLandView$10$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C38795pgF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketKlineLandScapeFragment$initLandView$10$1(C38795pgF c38795pgF, Continuation<? super MarketKlineLandScapeFragment$initLandView$10$1> continuation) {
        super(2, continuation);
        this.this$0 = c38795pgF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketKlineLandScapeFragment$initLandView$10$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketKlineLandScapeFragment$initLandView$10$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C36250oUv c36250oUvQfsBiF = this.this$0.QfsBiF();
            if (c36250oUvQfsBiF != null && (chartViewOutSideConfigAkhnZx = c36250oUvQfsBiF.AkhnZx()) != null) {
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
        ActionBar actionBar = new ActionBar(this.this$0);
        C38795pgF c38795pgF = this.this$0;
        C36204oTc.StateListAnimator stateListAnimator = C36204oTc.Companion;
        EntryType entryType = this.this$0.QKVWgx() ? EntryType.LITE_LANDSCAPE : EntryType.PRO_LANDSCAPE;
        String strOcIXYQ = this.this$0.OcIXYQ();
        String str = strOcIXYQ == null ? "" : strOcIXYQ;
        String strORxRYg = this.this$0.ORxRYg();
        C36204oTc c36204oTcAEQbTJ = stateListAnimator.AEQbTJ(new SettingEntryPoint(entryType, str, strORxRYg == null ? "" : strORxRYg, "", true, false, false, false, false, false, false, false, false, false, false, 32672, null));
        c36204oTcAEQbTJ.OLrzqt(actionBar);
        c38795pgF.OLrzqt(c36204oTcAEQbTJ);
        DrawerLayout drawerLayout = this.this$0.QVsKAR;
        if (drawerLayout != null) {
            drawerLayout.openDrawer(5);
        }
        C37908pFd.EZpvd();
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements oKD {
        public final /* synthetic */ C38795pgF AEQbTJ;

        @Override // o.oKD
        public void EZpvd(float f) {
        }

        @Override // o.oKD
        public void KWHzl() {
        }

        @Override // o.oKD
        public void copydefault() {
        }

        public ActionBar(C38795pgF c38795pgF) {
            this.AEQbTJ = c38795pgF;
        }

        @Override // o.oKD
        public void EZpvd() {
            oKD.TaskDescription.OLrzqt(this);
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
        public void AYXKKw(boolean z) {
            C36250oUv c36250oUvQfsBiF = this.AEQbTJ.QfsBiF();
            if (c36250oUvQfsBiF != null) {
                c36250oUvQfsBiF.AEQbTJ(z);
            }
            this.AEQbTJ.UrRBLY();
        }

        @Override // o.oKD
        public void OLrzqt(boolean z) {
            C36250oUv c36250oUvQfsBiF;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            SPUtils.put("chart_countdown", Boolean.valueOf(z));
            C36250oUv c36250oUvQfsBiF2 = this.AEQbTJ.QfsBiF();
            if (c36250oUvQfsBiF2 != null && (chartViewOutSideConfigAkhnZx = c36250oUvQfsBiF2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setMShowCountdown(z);
            }
            this.AEQbTJ.UrRBLY();
            if (!z || (c36250oUvQfsBiF = this.AEQbTJ.QfsBiF()) == null) {
                return;
            }
            c36250oUvQfsBiF.QKVWgx();
        }

        @Override // o.oKD
        public void AhwBna(boolean z) {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            SPUtils.put("chart_price_warning", Boolean.valueOf(z));
            C36250oUv c36250oUvFIwbmz = this.AEQbTJ.fIwbmz();
            if (c36250oUvFIwbmz != null && (chartViewOutSideConfigAkhnZx = c36250oUvFIwbmz.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setShowPriceWarning(z);
            }
            this.AEQbTJ.UrRBLY();
            if (z) {
                return;
            }
            this.AEQbTJ.spnCvw();
        }

        @Override // o.oKD
        public void djBIcL(boolean z) {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
            SPUtils.put("chart_history_order", Boolean.valueOf(z));
            C36250oUv c36250oUvFIwbmz = this.AEQbTJ.fIwbmz();
            if (c36250oUvFIwbmz != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvFIwbmz.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx2.setMShowHistoryOrder(z);
            }
            C36250oUv c36250oUvQfsBiF = this.AEQbTJ.QfsBiF();
            if (c36250oUvQfsBiF != null && (chartViewOutSideConfigAkhnZx = c36250oUvQfsBiF.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setMChartOffsetInit(false);
            }
            this.AEQbTJ.UrRBLY();
        }

        @Override // o.oKD
        public void copydefault(boolean z) {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
            SPUtils.put("chart_current_order", Boolean.valueOf(z));
            C36250oUv c36250oUvQfsBiF = this.AEQbTJ.QfsBiF();
            if (c36250oUvQfsBiF != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQfsBiF.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx2.setMShowCurrentOrder(z);
            }
            C36250oUv c36250oUvQfsBiF2 = this.AEQbTJ.QfsBiF();
            if (c36250oUvQfsBiF2 != null && (chartViewOutSideConfigAkhnZx = c36250oUvQfsBiF2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setMChartOffsetInit(false);
            }
            this.AEQbTJ.UrRBLY();
        }

        @Override // o.oKD
        public void KWHzl(boolean z) {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
            SPUtils.put("chart_cost_line", Boolean.valueOf(z));
            C36250oUv c36250oUvQfsBiF = this.AEQbTJ.QfsBiF();
            if (c36250oUvQfsBiF != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQfsBiF.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx2.setMShowCostLine(z);
            }
            C36250oUv c36250oUvQfsBiF2 = this.AEQbTJ.QfsBiF();
            if (c36250oUvQfsBiF2 != null && (chartViewOutSideConfigAkhnZx = c36250oUvQfsBiF2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setMChartOffsetInit(false);
            }
            this.AEQbTJ.UrRBLY();
        }

        @Override // o.oKD
        public void EZpvd(boolean z) {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
            SPUtils.put("cost_be", Boolean.valueOf(z));
            C36250oUv c36250oUvQfsBiF = this.AEQbTJ.QfsBiF();
            if (c36250oUvQfsBiF != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQfsBiF.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx2.setShowBe(z);
            }
            C36250oUv c36250oUvQfsBiF2 = this.AEQbTJ.QfsBiF();
            if (c36250oUvQfsBiF2 != null && (chartViewOutSideConfigAkhnZx = c36250oUvQfsBiF2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setMChartOffsetInit(false);
            }
            this.AEQbTJ.UrRBLY();
        }

        @Override // o.oKD
        public void AEQbTJ(boolean z) {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
            SPUtils.put("cost_liq", Boolean.valueOf(z));
            C36250oUv c36250oUvQfsBiF = this.AEQbTJ.QfsBiF();
            if (c36250oUvQfsBiF != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQfsBiF.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx2.setShowLiq(z);
            }
            C36250oUv c36250oUvQfsBiF2 = this.AEQbTJ.QfsBiF();
            if (c36250oUvQfsBiF2 != null && (chartViewOutSideConfigAkhnZx = c36250oUvQfsBiF2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setMChartOffsetInit(false);
            }
            this.AEQbTJ.UrRBLY();
        }

        @Override // o.oKD
        public void gEmmrt(boolean z) {
            String strOcIXYQ;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            SPUtils.put("chart_spot_average", Boolean.valueOf(z));
            C36250oUv c36250oUvQfsBiF = this.AEQbTJ.QfsBiF();
            if (c36250oUvQfsBiF != null && (chartViewOutSideConfigAkhnZx = c36250oUvQfsBiF.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setShowSpotAveragePrice(z);
            }
            if (!z || (strOcIXYQ = this.AEQbTJ.OcIXYQ()) == null) {
                return;
            }
            C38795pgF c38795pgF = this.AEQbTJ;
            int iAEQbTJ = C37925pFu.KWHzl.AEQbTJ(c38795pgF.ORxRYg(), c38795pgF.DTwDnp());
            InterfaceC39563puh.StateListAnimator stateListAnimatorDNCPSb = c38795pgF.dNCPSb();
            if (stateListAnimatorDNCPSb != null) {
                String strORxRYg = c38795pgF.ORxRYg();
                Intrinsics.copydefault((Object) strORxRYg);
                InterfaceC39563puh.StateListAnimator.TaskDescription.loadCumulativeCost$default(stateListAnimatorDNCPSb, c38795pgF, strORxRYg, strOcIXYQ, iAEQbTJ, false, 16, null);
            }
        }

        @Override // o.oKD
        public void valueOf(boolean z) {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
            C36250oUv c36250oUvQfsBiF = this.AEQbTJ.QfsBiF();
            if (c36250oUvQfsBiF != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQfsBiF.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx2.setMChartOffsetInit(false);
            }
            C36250oUv c36250oUvQfsBiF2 = this.AEQbTJ.QfsBiF();
            if (c36250oUvQfsBiF2 != null && (chartViewOutSideConfigAkhnZx = c36250oUvQfsBiF2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setEconomicDefaultStatus(C36236oUh.EZpvd.iwGUEr());
            }
            this.AEQbTJ.UrRBLY();
        }
    }
}
