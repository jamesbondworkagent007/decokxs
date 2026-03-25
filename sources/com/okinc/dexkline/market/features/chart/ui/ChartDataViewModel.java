package com.okinc.dexkline.market.features.chart.ui;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.dexkline.market.features.chart.domain.ChartType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.KSerializer;
import o.C32272mVw;
import o.C33129mqd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.mUR;
import o.oUO;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class ChartDataViewModel extends ViewModel {
    public String AEQbTJ;
    public final StateFlow<Application> AhwBna;
    public boolean EZpvd;
    public final MutableStateFlow<Application> KWHzl;
    public ChartType OLrzqt;
    public final C32272mVw copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChartType AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Application> copydefault() {
        return this.AhwBna;
    }

    @yCM
    public ChartDataViewModel(@NotNull C32272mVw c32272mVw) {
        Intrinsics.checkNotNullParameter(c32272mVw, "");
        this.copydefault = c32272mVw;
        this.AEQbTJ = "";
        this.OLrzqt = ChartType.PRICE;
        MutableStateFlow<Application> MutableStateFlow = StateFlowKt.MutableStateFlow(Application.StateListAnimator.EZpvd);
        this.KWHzl = MutableStateFlow;
        this.AhwBna = MutableStateFlow;
    }

    public final void EZpvd(boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = z;
        this.AEQbTJ = str;
        if (z) {
            mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new ChartDataViewModel$init$1(this, null), 3, null);
        } else {
            this.KWHzl.setValue(new Application.ActionBar(ChartType.PRICE));
        }
    }

    public final void OLrzqt(@NotNull ChartType chartType) {
        Intrinsics.checkNotNullParameter(chartType, "");
        this.OLrzqt = chartType;
        mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new ChartDataViewModel$onChartTypeChanged$1(this, chartType, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends o.oUO> */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<oUO> copydefault(@NotNull List<? extends oUO> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (this.OLrzqt == ChartType.PRICE || this.AEQbTJ.length() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(EZpvd((oUO) it.next()));
        }
        return arrayList;
    }

    public final boolean EZpvd() {
        return this.EZpvd && this.OLrzqt == ChartType.MARKET_CAP;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        ChartDataViewModel$checkChartType$1 chartDataViewModel$checkChartType$1;
        Object objCopydefault;
        ChartDataViewModel chartDataViewModel;
        if (continuation instanceof ChartDataViewModel$checkChartType$1) {
            chartDataViewModel$checkChartType$1 = (ChartDataViewModel$checkChartType$1) continuation;
            int i = chartDataViewModel$checkChartType$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chartDataViewModel$checkChartType$1.label = i - Integer.MIN_VALUE;
            } else {
                chartDataViewModel$checkChartType$1 = new ChartDataViewModel$checkChartType$1(this, continuation);
            }
        }
        Object obj = chartDataViewModel$checkChartType$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = chartDataViewModel$checkChartType$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C32272mVw c32272mVw = this.copydefault;
            KSerializer<ChartType> kSerializerSerializer = ChartType.Companion.serializer();
            chartDataViewModel$checkChartType$1.L$0 = this;
            chartDataViewModel$checkChartType$1.label = 1;
            objCopydefault = c32272mVw.copydefault("key_kline_market_chart_type", kSerializerSerializer, chartDataViewModel$checkChartType$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            chartDataViewModel = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chartDataViewModel = (ChartDataViewModel) chartDataViewModel$checkChartType$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        ChartType chartType = ChartType.PRICE;
        if (Result.m7383isFailureimpl(objCopydefault)) {
            objCopydefault = chartType;
        }
        chartDataViewModel.OLrzqt = (ChartType) objCopydefault;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(@NotNull ChartType chartType, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        ChartDataViewModel$saveChartType$1 chartDataViewModel$saveChartType$1;
        if (continuation instanceof ChartDataViewModel$saveChartType$1) {
            chartDataViewModel$saveChartType$1 = (ChartDataViewModel$saveChartType$1) continuation;
            int i = chartDataViewModel$saveChartType$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chartDataViewModel$saveChartType$1.label = i - Integer.MIN_VALUE;
            } else {
                chartDataViewModel$saveChartType$1 = new ChartDataViewModel$saveChartType$1(this, continuation);
            }
        }
        Object obj = chartDataViewModel$saveChartType$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = chartDataViewModel$saveChartType$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C32272mVw c32272mVw = this.copydefault;
            KSerializer<ChartType> kSerializerSerializer = ChartType.Companion.serializer();
            chartDataViewModel$saveChartType$1.label = 1;
            if (c32272mVw.EZpvd("key_kline_market_chart_type", kSerializerSerializer, chartType, chartDataViewModel$saveChartType$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        return Unit.INSTANCE;
    }

    public final oUO EZpvd(@NotNull oUO ouo) {
        Intrinsics.checkNotNullParameter(ouo, "");
        return new oUO(ouo.uzCIH, ouo.getNewProxyInstance, ouo.EZpvd, C33129mqd.mulD$default(Double.valueOf(ouo.valueOf), this.AEQbTJ, null, null, null, 14, null), C33129mqd.mulD$default(Double.valueOf(ouo.copydefault), this.AEQbTJ, null, null, null, 14, null), C33129mqd.mulD$default(Double.valueOf(ouo.OLrzqt), this.AEQbTJ, null, null, null, 14, null), C33129mqd.mulD$default(Double.valueOf(ouo.KWHzl), this.AEQbTJ, null, null, null, 14, null), ouo.djBIcL, ouo.AhwBna, ouo.gEmmrt, ouo.getFieldNames);
    }

    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.features.chart.ui.ChartDataViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class StateListAnimator extends Application {
            public static final StateListAnimator EZpvd = new StateListAnimator();

            private StateListAnimator() {
                super(null);
            }
        }

        private Application() {
        }

        /* JADX INFO: loaded from: classes15.dex */
        public static final class ActionBar extends Application {
            public final ChartType EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, ChartType chartType, int i, Object obj) {
                if ((i & 1) != 0) {
                    chartType = actionBar.EZpvd;
                }
                return actionBar.copydefault(chartType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ChartType copydefault() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar copydefault(@NotNull ChartType chartType) {
                Intrinsics.checkNotNullParameter(chartType, "");
                return new ActionBar(chartType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && this.EZpvd == ((ActionBar) obj).EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Ready(chartType=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull ChartType chartType) {
                super(null);
                Intrinsics.checkNotNullParameter(chartType, "");
                this.EZpvd = chartType;
            }
        }
    }
}
