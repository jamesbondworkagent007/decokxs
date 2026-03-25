package com.okinc.business.market.features.vibes.ui;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.market.features.vibes.domain.VibesSortType;
import com.okinc.business.market.features.vibes.domain.VibesTimeRange;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C27629jym;
import o.C27727kBc;
import o.C27750kBz;
import o.C56391yDq;
import o.C56442yFn;
import o.C56444yFp;
import o.InterfaceC27728kBd;
import o.InterfaceC27746kBv;
import o.InterfaceC56445yFq;
import o.kAH;
import o.kAK;
import o.kAO;
import o.kBA;
import o.kBE;
import o.yHT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class VibesViewModel extends ViewModel {
    public static final Companion Companion = new Companion(null);
    public static final int KWHzl = 8;
    public final MutableStateFlow<InterfaceC27728kBd> AEQbTJ;
    public final kAK AYXKKw;
    public final StateFlow<InterfaceC27746kBv> AhwBna;
    public final CoroutineDispatcher AkhnZx;
    public final StateFlow<C27750kBz> AuCTel;
    public final VibesActivityParams DbNXlk;
    public final MutableStateFlow<Companion.ChartDisplayUnit> EZpvd;
    public final MutableStateFlow<C27750kBz> OLrzqt;
    public final MutableStateFlow<InterfaceC27746kBv> copydefault;
    public C27727kBc djBIcL;
    public final kAO ejfBZ;
    public final StateFlow<kBE> fARcdN;
    public final StateFlow<InterfaceC27728kBd> fIwbmz;
    public final StateFlow<kBA> fJNWhG;
    public final C27629jym fetchVPNInfo;
    public final MutableStateFlow<kBA> gEmmrt;
    public final kAH isConnected;
    public final MutableStateFlow<kBE> valueOf;
    public final StateFlow<Companion.ChartDisplayUnit> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC27728kBd> AEQbTJ() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Companion.ChartDisplayUnit> AYXKKw() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VibesActivityParams KWHzl() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C27750kBz> OLrzqt() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC27746kBv> copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<kBE> gEmmrt() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<kBA> valueOf() {
        return this.fJNWhG;
    }

    public VibesViewModel(@NotNull kAK kak, @NotNull kAH kah, @NotNull kAO kao, @NotNull C27629jym c27629jym, @NotNull SavedStateHandle savedStateHandle, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(kak, "");
        Intrinsics.checkNotNullParameter(kah, "");
        Intrinsics.checkNotNullParameter(kao, "");
        Intrinsics.checkNotNullParameter(c27629jym, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AYXKKw = kak;
        this.isConnected = kah;
        this.ejfBZ = kao;
        this.fetchVPNInfo = c27629jym;
        this.AkhnZx = coroutineDispatcher;
        MutableStateFlow<kBA> MutableStateFlow = StateFlowKt.MutableStateFlow(kBA.TaskDescription.EZpvd);
        this.gEmmrt = MutableStateFlow;
        MutableStateFlow<kBE> MutableStateFlow2 = StateFlowKt.MutableStateFlow(kBE.ActionBar.KWHzl);
        this.valueOf = MutableStateFlow2;
        MutableStateFlow<C27750kBz> MutableStateFlow3 = StateFlowKt.MutableStateFlow(new C27750kBz(null, 0, null, null, false, 31, null));
        this.OLrzqt = MutableStateFlow3;
        MutableStateFlow<InterfaceC27746kBv> MutableStateFlow4 = StateFlowKt.MutableStateFlow(InterfaceC27746kBv.Application.KWHzl);
        this.copydefault = MutableStateFlow4;
        MutableStateFlow<InterfaceC27728kBd> MutableStateFlow5 = StateFlowKt.MutableStateFlow(InterfaceC27728kBd.Activity.KWHzl);
        this.AEQbTJ = MutableStateFlow5;
        this.fJNWhG = FlowKt.asStateFlow(MutableStateFlow);
        this.fARcdN = FlowKt.asStateFlow(MutableStateFlow2);
        this.AuCTel = FlowKt.asStateFlow(MutableStateFlow3);
        this.fIwbmz = FlowKt.asStateFlow(MutableStateFlow5);
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<Companion.ChartDisplayUnit> MutableStateFlow6 = StateFlowKt.MutableStateFlow(Companion.ChartDisplayUnit.PRICE);
        this.EZpvd = MutableStateFlow6;
        this.values = FlowKt.asStateFlow(MutableStateFlow6);
        VibesActivityParams vibesActivityParams = (VibesActivityParams) savedStateHandle.get("analysis_params");
        this.DbNXlk = vibesActivityParams == null ? new VibesActivityParams(null, 0L, 3, null) : vibesActivityParams;
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.vibes.ui.VibesViewModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ChartDisplayUnit {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ ChartDisplayUnit[] $VALUES;
            public static final ChartDisplayUnit MCAP = new ChartDisplayUnit("MCAP", 0);
            public static final ChartDisplayUnit PRICE = new ChartDisplayUnit("PRICE", 1);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ ChartDisplayUnit[] $values() {
                return new ChartDisplayUnit[]{MCAP, PRICE};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<ChartDisplayUnit> getEntries() {
                return $ENTRIES;
            }

            private ChartDisplayUnit(String str, int i) {
            }

            static {
                ChartDisplayUnit[] chartDisplayUnitArr$values = $values();
                $VALUES = chartDisplayUnitArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(chartDisplayUnitArr$values);
            }

            public static ChartDisplayUnit valueOf(String str) {
                return (ChartDisplayUnit) Enum.valueOf(ChartDisplayUnit.class, str);
            }

            public static ChartDisplayUnit[] values() {
                return (ChartDisplayUnit[]) $VALUES.clone();
            }
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.vibes.ui.VibesViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return VibesViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow flowCombine = FlowKt.combine(VibesViewModel.this.valueOf(), VibesViewModel.this.copydefault(), VibesViewModel.this.gEmmrt(), new C03711(VibesViewModel.this, null));
                final VibesViewModel vibesViewModel = VibesViewModel.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.vibes.ui.VibesViewModel.1.2
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public final Object emit(InterfaceC27728kBd interfaceC27728kBd, Continuation<? super Unit> continuation) {
                        vibesViewModel.AEQbTJ.setValue(interfaceC27728kBd);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowCombine.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.business.market.features.vibes.ui.VibesViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03711 extends SuspendLambda implements yHT<kBA, InterfaceC27746kBv, kBE, Continuation<? super InterfaceC27728kBd>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            /* synthetic */ Object L$2;
            int label;
            final /* synthetic */ VibesViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03711(VibesViewModel vibesViewModel, Continuation<? super C03711> continuation) {
                super(4, continuation);
                this.this$0 = vibesViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // o.yHT
            public final Object invoke(kBA kba, InterfaceC27746kBv interfaceC27746kBv, kBE kbe, Continuation<? super InterfaceC27728kBd> continuation) {
                C03711 c03711 = new C03711(this.this$0, continuation);
                c03711.L$0 = kba;
                c03711.L$1 = interfaceC27746kBv;
                c03711.L$2 = kbe;
                return c03711.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    kBA kba = (kBA) this.L$0;
                    InterfaceC27746kBv interfaceC27746kBv = (InterfaceC27746kBv) this.L$1;
                    kBE kbe = (kBE) this.L$2;
                    if ((kba instanceof kBA.TaskDescription) || (interfaceC27746kBv instanceof InterfaceC27746kBv.Application) || (kbe instanceof kBE.ActionBar)) {
                        return (InterfaceC27728kBd) this.this$0.AEQbTJ.getValue();
                    }
                    return InterfaceC27728kBd.TaskDescription.EZpvd;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void copydefault(@NotNull VibesTimeRange vibesTimeRange) {
        Intrinsics.checkNotNullParameter(vibesTimeRange, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new VibesViewModel$onTimeRangeChange$1(this, vibesTimeRange, null), 3, null);
    }

    public final void copydefault(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AkhnZx, null, new VibesViewModel$trackPageView$1(this, str, str2, null), 2, null);
    }

    public final void copydefault(@NotNull String str, String str2, String str3, VibesSortType vibesSortType, VibesSortType vibesSortType2, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AkhnZx, null, new VibesViewModel$trackPageClick$1(this, str4, str5, str, str3, str2, vibesSortType, vibesSortType2, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super C27727kBc> continuation) {
        VibesViewModel$loadEventTrackerData$1 vibesViewModel$loadEventTrackerData$1;
        Object objAEQbTJ;
        VibesViewModel vibesViewModel;
        Object objM7377constructorimpl;
        if (continuation instanceof VibesViewModel$loadEventTrackerData$1) {
            vibesViewModel$loadEventTrackerData$1 = (VibesViewModel$loadEventTrackerData$1) continuation;
            int i = vibesViewModel$loadEventTrackerData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                vibesViewModel$loadEventTrackerData$1.label = i - Integer.MIN_VALUE;
            } else {
                vibesViewModel$loadEventTrackerData$1 = new VibesViewModel$loadEventTrackerData$1(this, continuation);
            }
        }
        Object obj = vibesViewModel$loadEventTrackerData$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = vibesViewModel$loadEventTrackerData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C27727kBc c27727kBc = this.djBIcL;
            if (c27727kBc != null) {
                return c27727kBc;
            }
            C27629jym c27629jym = this.fetchVPNInfo;
            vibesViewModel$loadEventTrackerData$1.L$0 = this;
            vibesViewModel$loadEventTrackerData$1.label = 1;
            objAEQbTJ = c27629jym.AEQbTJ(str2, str, vibesViewModel$loadEventTrackerData$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            vibesViewModel = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vibesViewModel = (VibesViewModel) vibesViewModel$loadEventTrackerData$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            Result.Application application = Result.Companion;
            LatestMarketInfoBean latestMarketInfoBean = (LatestMarketInfoBean) objAEQbTJ;
            objM7377constructorimpl = Result.m7377constructorimpl(new C27727kBc(latestMarketInfoBean.getChainName(), latestMarketInfoBean.getNativeTokenSymbol(), latestMarketInfoBean.getTokenName()));
        } else {
            objM7377constructorimpl = Result.m7377constructorimpl(objAEQbTJ);
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        C27727kBc c27727kBc2 = (C27727kBc) objM7377constructorimpl;
        if (c27727kBc2 == null) {
            c27727kBc2 = new C27727kBc(null, null, null, 7, null);
        }
        vibesViewModel.djBIcL = c27727kBc2;
        return c27727kBc2;
    }

    public final void EZpvd(long j, @NotNull String str, @NotNull VibesSortType vibesSortType, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(vibesSortType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new VibesViewModel$onSortTypeChange$1(str2, this, j, str, vibesSortType, null), 3, null);
    }

    public static /* synthetic */ void loadData$default(VibesViewModel vibesViewModel, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        vibesViewModel.AEQbTJ(str, str2, z);
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (z) {
            this.AEQbTJ.setValue(InterfaceC27728kBd.Application.OLrzqt);
        }
        AEQbTJ(str, str2, this.AuCTel.getValue().EZpvd(), this.AuCTel.getValue().copydefault());
        copydefault(str, str2, this.AuCTel.getValue().KWHzl(), this.AuCTel.getValue().copydefault());
        EZpvd();
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull VibesSortType vibesSortType, @NotNull VibesTimeRange vibesTimeRange) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(vibesSortType, "");
        Intrinsics.checkNotNullParameter(vibesTimeRange, "");
        this.gEmmrt.setValue(kBA.TaskDescription.EZpvd);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new VibesViewModel$loadKolList$1(this, str, str2, vibesSortType, vibesTimeRange, null), 3, null);
    }

    public final void copydefault(@NotNull String str, @NotNull String str2, @NotNull VibesSortType vibesSortType, @NotNull VibesTimeRange vibesTimeRange) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(vibesSortType, "");
        Intrinsics.checkNotNullParameter(vibesTimeRange, "");
        this.valueOf.setValue(kBE.ActionBar.KWHzl);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new VibesViewModel$loadTreemapData$1(this, str, str2, vibesSortType, vibesTimeRange, null), 3, null);
    }

    public final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VibesViewModel$getVibesChartData$1(this, null), 3, null);
    }

    public final void copydefault(@NotNull Companion.ChartDisplayUnit chartDisplayUnit) {
        Intrinsics.checkNotNullParameter(chartDisplayUnit, "");
        if (this.AhwBna.getValue() instanceof InterfaceC27746kBv.ActionBar) {
            this.EZpvd.setValue(chartDisplayUnit);
        }
    }
}
