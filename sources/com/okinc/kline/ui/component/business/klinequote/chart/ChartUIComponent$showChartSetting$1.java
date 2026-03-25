package com.okinc.kline.ui.component.business.klinequote.chart;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.api.bean.EntryType;
import com.okinc.kline.features.settings.main.data.model.SettingEntryPoint;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.ui.component.business.klinequote.chart.ChartUIComponent$showChartSetting$1;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC39028pka;
import o.C32866mlf;
import o.C32868mlh;
import o.C36204oTc;
import o.C36236oUh;
import o.C36250oUv;
import o.C37925pFu;
import o.C37932pGa;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC39499ptW;
import o.InterfaceC39563puh;
import o.oKD;
import o.oML;
import o.oTH;
import o.oUN;
import o.pEI;

/* JADX INFO: loaded from: classes8.dex */
public final class ChartUIComponent$showChartSetting$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChartUIComponent this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartUIComponent$showChartSetting$1(ChartUIComponent chartUIComponent, Continuation<? super ChartUIComponent$showChartSetting$1> continuation) {
        super(2, continuation);
        this.this$0 = chartUIComponent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChartUIComponent$showChartSetting$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChartUIComponent$showChartSetting$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            oML oml = (oML) this.this$0.isConnected().KWHzl();
            if (oml != null && (c36250oUv = oml.AuCTel) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
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
        boolean z = !this.this$0.AYXKKw().QUSxYX() && pEI.EZpvd.AEQbTJ();
        EntryType entryType = z ? EntryType.PRO_PORTRAIT_TV : EntryType.PRO_PORTRAIT;
        String strFIwbmz = this.this$0.AYXKKw().fIwbmz();
        String str = strFIwbmz == null ? "" : strFIwbmz;
        String strAuCTel = this.this$0.AYXKKw().AuCTel();
        if (strAuCTel == null) {
            strAuCTel = "";
        }
        SettingEntryPoint settingEntryPoint = new SettingEntryPoint(entryType, str, strAuCTel, null, false, this.this$0.AYXKKw().QUSxYX(), false, false, false, false, false, false, false, false, false, 32728, null);
        if (z) {
            oTH.Application application = oTH.Companion;
            Context context = this.this$0.AYXKKw().OLrzqt().getContext();
            if (context == null) {
                return Unit.INSTANCE;
            }
            application.AEQbTJ(settingEntryPoint, context);
        } else {
            C36204oTc.StateListAnimator stateListAnimator = C36204oTc.Companion;
            FragmentManager childFragmentManager = this.this$0.AYXKKw().OLrzqt().getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            stateListAnimator.OLrzqt(settingEntryPoint, childFragmentManager).OLrzqt(taskDescription);
        }
        return Unit.INSTANCE;
    }

    public static final class TaskDescription implements oKD {
        public final /* synthetic */ ChartUIComponent AEQbTJ;

        public TaskDescription(ChartUIComponent chartUIComponent) {
            this.AEQbTJ = chartUIComponent;
        }

        @Override // o.oKD
        public void EZpvd() {
            oKD.TaskDescription.OLrzqt(this);
        }

        @Override // o.oKD
        public void OLrzqt() {
            oKD.TaskDescription.copydefault(this);
        }

        @Override // o.oKD
        public void copydefault() {
            if (this.AEQbTJ.AYXKKw().AEQbTJ() != null) {
                InterfaceC39499ptW interfaceC39499ptWAEQbTJ = this.AEQbTJ.AYXKKw().AEQbTJ();
                if (interfaceC39499ptWAEQbTJ != null) {
                    interfaceC39499ptWAEQbTJ.OLrzqt(Boolean.TRUE);
                }
                InterfaceC39499ptW interfaceC39499ptWAEQbTJ2 = this.AEQbTJ.AYXKKw().AEQbTJ();
                if (interfaceC39499ptWAEQbTJ2 != null) {
                    interfaceC39499ptWAEQbTJ2.OLrzqt(true);
                }
            }
            this.AEQbTJ.AYXKKw().KWHzl(true);
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("KLine_SettingPop_Button_Click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pnF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ChartUIComponent$showChartSetting$1.TaskDescription.AEQbTJ((EventParamsList) obj);
                }
            });
        }

        public static final Unit AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("top_button_name", "draw", true);
            eventParamsList.put("chart_layout", "classic", true);
            return Unit.INSTANCE;
        }

        @Override // o.oKD
        public void AYXKKw(boolean z) {
            C36250oUv c36250oUv;
            oML oml = (oML) this.AEQbTJ.isConnected().KWHzl();
            if (oml != null && (c36250oUv = oml.AuCTel) != null) {
                c36250oUv.AEQbTJ(z);
            }
            this.AEQbTJ.dNCPSb();
        }

        @Override // o.oKD
        public void OLrzqt(boolean z) {
            oML oml;
            C36250oUv c36250oUv;
            C36250oUv c36250oUv2;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            SPUtils.put("chart_countdown", Boolean.valueOf(z));
            oML oml2 = (oML) this.AEQbTJ.isConnected().KWHzl();
            if (oml2 != null && (c36250oUv2 = oml2.AuCTel) != null && (chartViewOutSideConfigAkhnZx = c36250oUv2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setMShowCountdown(z);
            }
            this.AEQbTJ.dNCPSb();
            if (!z || (oml = (oML) this.AEQbTJ.isConnected().KWHzl()) == null || (c36250oUv = oml.AuCTel) == null) {
                return;
            }
            c36250oUv.QKVWgx();
        }

        @Override // o.oKD
        public void AhwBna(boolean z) {
            C36250oUv c36250oUv;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            SPUtils.put("chart_price_warning", Boolean.valueOf(z));
            oML oml = (oML) this.AEQbTJ.isConnected().KWHzl();
            if (oml != null && (c36250oUv = oml.AuCTel) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setShowPriceWarning(z);
            }
            this.AEQbTJ.dNCPSb();
            if (z) {
                return;
            }
            this.AEQbTJ.AubY();
        }

        @Override // o.oKD
        public void djBIcL(boolean z) {
            C36250oUv c36250oUv;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            C36250oUv c36250oUv2;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
            SPUtils.put("chart_history_order", Boolean.valueOf(z));
            oML oml = (oML) this.AEQbTJ.isConnected().KWHzl();
            if (oml != null && (c36250oUv2 = oml.AuCTel) != null && (chartViewOutSideConfigAkhnZx2 = c36250oUv2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx2.setMShowHistoryOrder(z);
            }
            oML oml2 = (oML) this.AEQbTJ.isConnected().KWHzl();
            if (oml2 != null && (c36250oUv = oml2.AuCTel) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setMChartOffsetInit(false);
            }
            this.AEQbTJ.dNCPSb();
        }

        @Override // o.oKD
        public void copydefault(boolean z) {
            C36250oUv c36250oUv;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            C36250oUv c36250oUv2;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
            SPUtils.put("chart_current_order", Boolean.valueOf(z));
            oML oml = (oML) this.AEQbTJ.isConnected().KWHzl();
            if (oml != null && (c36250oUv2 = oml.AuCTel) != null && (chartViewOutSideConfigAkhnZx2 = c36250oUv2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx2.setMShowCurrentOrder(z);
            }
            oML oml2 = (oML) this.AEQbTJ.isConnected().KWHzl();
            if (oml2 != null && (c36250oUv = oml2.AuCTel) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setMChartOffsetInit(false);
            }
            C37932pGa c37932pGa = C37932pGa.AEQbTJ;
            c37932pGa.EZpvd();
            c37932pGa.copydefault();
            c37932pGa.OLrzqt();
            this.AEQbTJ.dNCPSb();
        }

        @Override // o.oKD
        public void KWHzl(boolean z) {
            C36250oUv c36250oUv;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            C36250oUv c36250oUv2;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
            SPUtils.put("chart_cost_line", Boolean.valueOf(z));
            oML oml = (oML) this.AEQbTJ.isConnected().KWHzl();
            if (oml != null && (c36250oUv2 = oml.AuCTel) != null && (chartViewOutSideConfigAkhnZx2 = c36250oUv2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx2.setMShowCostLine(z);
            }
            oML oml2 = (oML) this.AEQbTJ.isConnected().KWHzl();
            if (oml2 != null && (c36250oUv = oml2.AuCTel) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setMChartOffsetInit(false);
            }
            C37932pGa c37932pGa = C37932pGa.AEQbTJ;
            c37932pGa.EZpvd();
            c37932pGa.copydefault();
            c37932pGa.OLrzqt();
            this.AEQbTJ.dNCPSb();
        }

        @Override // o.oKD
        public void EZpvd(boolean z) {
            C36250oUv c36250oUv;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            C36250oUv c36250oUv2;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
            SPUtils.put("cost_be", Boolean.valueOf(z));
            oML oml = (oML) this.AEQbTJ.isConnected().KWHzl();
            if (oml != null && (c36250oUv2 = oml.AuCTel) != null && (chartViewOutSideConfigAkhnZx2 = c36250oUv2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx2.setShowBe(z);
            }
            oML oml2 = (oML) this.AEQbTJ.isConnected().KWHzl();
            if (oml2 != null && (c36250oUv = oml2.AuCTel) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setMChartOffsetInit(false);
            }
            C37932pGa c37932pGa = C37932pGa.AEQbTJ;
            c37932pGa.EZpvd();
            c37932pGa.copydefault();
            c37932pGa.OLrzqt();
            c37932pGa.KWHzl();
            this.AEQbTJ.dNCPSb();
        }

        @Override // o.oKD
        public void AEQbTJ(boolean z) {
            C36250oUv c36250oUv;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            C36250oUv c36250oUv2;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
            SPUtils.put("cost_liq", Boolean.valueOf(z));
            oML oml = (oML) this.AEQbTJ.isConnected().KWHzl();
            if (oml != null && (c36250oUv2 = oml.AuCTel) != null && (chartViewOutSideConfigAkhnZx2 = c36250oUv2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx2.setShowLiq(z);
            }
            oML oml2 = (oML) this.AEQbTJ.isConnected().KWHzl();
            if (oml2 != null && (c36250oUv = oml2.AuCTel) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setMChartOffsetInit(false);
            }
            C37932pGa c37932pGa = C37932pGa.AEQbTJ;
            c37932pGa.EZpvd();
            c37932pGa.copydefault();
            c37932pGa.OLrzqt();
            c37932pGa.KWHzl();
            c37932pGa.AEQbTJ();
            this.AEQbTJ.dNCPSb();
        }

        @Override // o.oKD
        public void gEmmrt(boolean z) {
            String strFIwbmz;
            C36250oUv c36250oUv;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            SPUtils.put("chart_spot_average", Boolean.valueOf(z));
            oML oml = (oML) this.AEQbTJ.isConnected().KWHzl();
            if (oml != null && (c36250oUv = oml.AuCTel) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setShowSpotAveragePrice(z);
            }
            if (!z || (strFIwbmz = this.AEQbTJ.AYXKKw().fIwbmz()) == null) {
                return;
            }
            ChartUIComponent chartUIComponent = this.AEQbTJ;
            int iAEQbTJ = C37925pFu.KWHzl.AEQbTJ(chartUIComponent.AYXKKw().AuCTel(), chartUIComponent.AYXKKw().fJNWhG());
            InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH = chartUIComponent.AYXKKw().uzCIH();
            if (stateListAnimatorUzCIH != null) {
                AbstractC39028pka abstractC39028pkaOLrzqt = chartUIComponent.AYXKKw().OLrzqt();
                String strAuCTel = chartUIComponent.AYXKKw().AuCTel();
                Intrinsics.copydefault((Object) strAuCTel);
                InterfaceC39563puh.StateListAnimator.TaskDescription.loadCumulativeCost$default(stateListAnimatorUzCIH, abstractC39028pkaOLrzqt, strAuCTel, strFIwbmz, iAEQbTJ, false, 16, null);
            }
        }

        @Override // o.oKD
        public void EZpvd(float f) {
            C36250oUv c36250oUv;
            this.AEQbTJ.AYXKKw().AubY().AYXKKw().setValue(Boolean.TRUE);
            oML oml = (oML) this.AEQbTJ.isConnected().KWHzl();
            if (oml == null || (c36250oUv = oml.AuCTel) == null) {
                return;
            }
            c36250oUv.setMinimumHeight((int) (this.AEQbTJ.AYXKKw().iwGUEr() * (f + 1.0f)));
        }

        @Override // o.oKD
        public void KWHzl() {
            this.AEQbTJ.QUSxYX();
            this.AEQbTJ.AYXKKw().ejfBZ().values().setValue(Boolean.TRUE);
        }

        @Override // o.oKD
        public void valueOf(boolean z) {
            C36250oUv c36250oUv;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            C36250oUv c36250oUv2;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
            oML oml = (oML) this.AEQbTJ.isConnected().KWHzl();
            if (oml != null && (c36250oUv2 = oml.AuCTel) != null && (chartViewOutSideConfigAkhnZx2 = c36250oUv2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx2.setMChartOffsetInit(false);
            }
            oML oml2 = (oML) this.AEQbTJ.isConnected().KWHzl();
            if (oml2 != null && (c36250oUv = oml2.AuCTel) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setEconomicDefaultStatus(C36236oUh.EZpvd.iwGUEr());
            }
            this.AEQbTJ.dNCPSb();
        }

        @Override // o.oKD
        public void KWHzl(long j) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.AEQbTJ.AYXKKw()), null, null, new ChartUIComponent$showChartSetting$1$settingListener$1$onSelectTime$1(this.AEQbTJ, j, null), 3, null);
        }
    }
}
