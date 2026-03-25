package com.okinc.business.market.features.chart.ui;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.features.chart.domain.ChartType;
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
import o.C25389ivm;
import o.C27670jza;
import o.C33129mqd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.oUO;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class ChartDataViewModel extends ViewModel {
    public final StateFlow<ChartType> AEQbTJ;
    public final StateFlow<Application> AhwBna;
    public boolean EZpvd;
    public final MutableStateFlow<ChartType> KWHzl;
    public final MutableStateFlow<Application> OLrzqt;
    public final C27670jza copydefault;
    public String valueOf;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChartType.values().length];
            try {
                iArr[ChartType.PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChartType.MARKET_CAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Application> EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ChartType> OLrzqt() {
        return this.AEQbTJ;
    }

    @yCM
    public ChartDataViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C27670jza c27670jza) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c27670jza, "");
        this.copydefault = c27670jza;
        MutableStateFlow<ChartType> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow;
        this.AEQbTJ = MutableStateFlow;
        this.valueOf = "";
        MutableStateFlow<Application> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Application.ActionBar.EZpvd);
        this.OLrzqt = MutableStateFlow2;
        this.AhwBna = MutableStateFlow2;
    }

    public static /* synthetic */ void init$default(ChartDataViewModel chartDataViewModel, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        chartDataViewModel.copydefault(z, str);
    }

    public final void copydefault(boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = z;
        this.valueOf = str;
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new ChartDataViewModel$init$1(this, null), 3, null);
    }

    public final void copydefault() {
        ChartType chartType;
        ChartType value = this.AEQbTJ.getValue();
        int i = value == null ? -1 : ActionBar.AEQbTJ[value.ordinal()];
        if (i == 1) {
            chartType = ChartType.MARKET_CAP;
        } else if (i != 2) {
            return;
        } else {
            chartType = ChartType.PRICE;
        }
        AEQbTJ(chartType);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends o.oUO> */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<oUO> KWHzl(@NotNull List<? extends oUO> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (this.AEQbTJ.getValue() != ChartType.MARKET_CAP || this.valueOf.length() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AEQbTJ((oUO) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:? A[LOOP:0: B:26:0x0069->B:30:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull Continuation<? super ChartType> continuation) throws Throwable {
        ChartDataViewModel$checkChartType$1 chartDataViewModel$checkChartType$1;
        Object objAEQbTJ;
        ChartDataViewModel chartDataViewModel;
        ChartType chartType;
        MutableStateFlow<ChartType> mutableStateFlow;
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
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = chartDataViewModel$checkChartType$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!this.EZpvd) {
                chartType = ChartType.PRICE;
                chartDataViewModel = this;
                mutableStateFlow = chartDataViewModel.KWHzl;
                while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), chartType)) {
                }
                return chartType;
            }
            C27670jza c27670jza = this.copydefault;
            KSerializer<ChartType> kSerializerSerializer = ChartType.Companion.serializer();
            chartDataViewModel$checkChartType$1.L$0 = this;
            chartDataViewModel$checkChartType$1.label = 1;
            objAEQbTJ = c27670jza.AEQbTJ("key_kline_market_chart_type", kSerializerSerializer, chartDataViewModel$checkChartType$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            chartDataViewModel = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chartDataViewModel = (ChartDataViewModel) chartDataViewModel$checkChartType$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        ChartType chartType2 = ChartType.PRICE;
        if (Result.m7383isFailureimpl(objAEQbTJ)) {
            objAEQbTJ = chartType2;
        }
        chartType = (ChartType) objAEQbTJ;
        mutableStateFlow = chartDataViewModel.KWHzl;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), chartType)) {
        }
        return chartType;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(@NotNull ChartType chartType, @NotNull Continuation<? super Unit> continuation) throws Throwable {
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
            C27670jza c27670jza = this.copydefault;
            KSerializer<ChartType> kSerializerSerializer = ChartType.Companion.serializer();
            chartDataViewModel$saveChartType$1.label = 1;
            if (c27670jza.EZpvd("key_kline_market_chart_type", kSerializerSerializer, chartType, chartDataViewModel$saveChartType$1) == objCopydefault) {
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

    public final oUO AEQbTJ(@NotNull oUO ouo) {
        Intrinsics.checkNotNullParameter(ouo, "");
        return new oUO(ouo.uzCIH, ouo.getNewProxyInstance, ouo.EZpvd, C33129mqd.mulD$default(Double.valueOf(ouo.valueOf), this.valueOf, null, null, null, 14, null), C33129mqd.mulD$default(Double.valueOf(ouo.copydefault), this.valueOf, null, null, null, 14, null), C33129mqd.mulD$default(Double.valueOf(ouo.OLrzqt), this.valueOf, null, null, null, 14, null), C33129mqd.mulD$default(Double.valueOf(ouo.KWHzl), this.valueOf, null, null, null, 14, null), ouo.djBIcL, ouo.AhwBna, ouo.gEmmrt, ouo.getFieldNames);
    }

    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.chart.ui.ChartDataViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class ActionBar extends Application {
            public static final ActionBar EZpvd = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }

        private Application() {
        }

        public static final class Activity extends Application {
            public final ChartType KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, ChartType chartType, int i, Object obj) {
                if ((i & 1) != 0) {
                    chartType = activity.KWHzl;
                }
                return activity.copydefault(chartType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ChartType KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity copydefault(@NotNull ChartType chartType) {
                Intrinsics.checkNotNullParameter(chartType, "");
                return new Activity(chartType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && this.KWHzl == ((Activity) obj).KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Ready(chartType=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull ChartType chartType) {
                super(null);
                Intrinsics.checkNotNullParameter(chartType, "");
                this.KWHzl = chartType;
            }
        }
    }

    public final void AEQbTJ(@NotNull ChartType chartType) {
        Intrinsics.checkNotNullParameter(chartType, "");
        if (this.EZpvd) {
            MutableStateFlow<ChartType> mutableStateFlow = this.KWHzl;
            while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), chartType)) {
            }
            C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new ChartDataViewModel$onChartTypeChanged$2(this, chartType, null), 3, null);
        }
    }
}
