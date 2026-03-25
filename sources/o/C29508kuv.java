package o;

import com.okinc.business.market.data.model.common.DexTokenMeta;
import com.okinc.business.market.data.model.common.TokenInfo;
import com.okinc.business.market.data.model.smart_money.SignalData;
import com.okinc.business.market.data.model.smart_money.SignalOverview;
import com.okinc.business.market.features.smart_money.signal.domain.GetSignalOverviewListUseCase$fetchInitialKLineData$1;
import com.okinc.business.market.features.smart_money.signal.domain.GetSignalOverviewListUseCase$fetchKlineForOverview$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.smart_money.signal.domain.GetSignalOverviewListUseCase$fetchKlineForOverview$1;
import com.okinc.business.market.features.smart_money.signal.domain.GetSignalOverviewListUseCase$fetchKlineLoadMore$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.smart_money.signal.domain.GetSignalOverviewListUseCase$fetchKlineLoadMore$1;
import com.okinc.business.market.features.smart_money.signal.domain.GetSignalOverviewListUseCase$invoke$1;
import com.okinc.business.market.features.smart_money.signal.domain.GetSignalOverviewListUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.smart_money.signal.domain.GetSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$1;
import com.okinc.business.market.features.smart_money.signal.domain.GetSignalOverviewListUseCase$stopTokenUpdatesWs$1;
import com.okinc.business.market.features.smart_money.signal.domain.GetSignalOverviewListUseCase$stopWs$1;
import com.okinc.business.market.features.smart_money.signal.domain.GetSignalOverviewListUseCase$subscribeMultipleTokenUpdatesWs$1;
import com.okinc.business.market.features.smart_money.signal.domain.GetSignalOverviewListUseCase$subscribeMultipleTokenUpdatesWs$2;
import com.okinc.business.market.features.smart_money.signal.domain.GetSignalOverviewListUseCase$subscribeTokenUpdatesWs$1;
import com.okinc.business.market.features.smart_money.signal.domain.GetSignalOverviewListUseCase$subscribeTokenUpdatesWs$2;
import com.okinc.business.market.features.smart_money.signal.domain.GetSignalOverviewListUseCase$subscribeWs$1;
import com.okinc.business.market.features.smart_money.signal.domain.GetSignalOverviewListUseCase$subscribeWs$2;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewKLineUiModel;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewUiModel;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel;
import com.okinc.business.market.features.smart_money.signal.ui.overview.chart.BuySellMarker;
import com.okinc.business.market.features.smart_money.signal.ui.overview.chart.TimeIntervalSelector;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kuv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29508kuv {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final C29507kuu AEQbTJ;
    public final InterfaceC29466kuF AYXKKw;
    public final StateFlow<java.util.List<SignalOverviewUiModel>> AhwBna;
    public Job DbNXlk;
    public java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> EZpvd;
    public final MutableStateFlow<java.util.List<SignalOverviewUiModel>> KWHzl;
    public final MutableStateFlow<java.lang.Boolean> OLrzqt;
    public final CoroutineDispatcher djBIcL;
    public final StateFlow<java.lang.Boolean> fetchVPNInfo;
    public C29481kuU gEmmrt;
    public final CoroutineScope isConnected;
    public final C29474kuN valueOf;

    public static final SignalOverviewKLineUiModel KWHzl(SignalOverviewKLineUiModel signalOverviewKLineUiModel) {
        return signalOverviewKLineUiModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.List<SignalOverviewUiModel>> AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Boolean> KWHzl() {
        return this.fetchVPNInfo;
    }

    @yCM
    public C29508kuv(@NotNull InterfaceC29466kuF interfaceC29466kuF, @NotNull C29474kuN c29474kuN, @NotNull C29507kuu c29507kuu, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC29466kuF, "");
        Intrinsics.checkNotNullParameter(c29474kuN, "");
        Intrinsics.checkNotNullParameter(c29507kuu, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AYXKKw = interfaceC29466kuF;
        this.valueOf = c29474kuN;
        this.AEQbTJ = c29507kuu;
        this.djBIcL = coroutineDispatcher;
        MutableStateFlow<java.util.List<SignalOverviewUiModel>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<java.lang.Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.OLrzqt = MutableStateFlow2;
        this.fetchVPNInfo = FlowKt.asStateFlow(MutableStateFlow2);
        this.isConnected = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
        this.EZpvd = yDY.AhwBna();
    }

    /* JADX INFO: renamed from: o.kuv$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kuv.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void OLrzqt() {
        this.KWHzl.setValue(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.util.List<java.lang.String> list, boolean z, @NotNull C29481kuU c29481kuU, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        GetSignalOverviewListUseCase$invoke$1 getSignalOverviewListUseCase$invoke$1;
        if (continuation instanceof GetSignalOverviewListUseCase$invoke$1) {
            getSignalOverviewListUseCase$invoke$1 = (GetSignalOverviewListUseCase$invoke$1) continuation;
            int i = getSignalOverviewListUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSignalOverviewListUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getSignalOverviewListUseCase$invoke$1 = new GetSignalOverviewListUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getSignalOverviewListUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSignalOverviewListUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.djBIcL;
            GetSignalOverviewListUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 getSignalOverviewListUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 = new GetSignalOverviewListUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(null, this, c29481kuU, z, list);
            getSignalOverviewListUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getSignalOverviewListUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1, getSignalOverviewListUseCase$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kuv */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: invoke-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8676invokeBWLJW6A$default(C29508kuv c29508kuv, java.util.List list, boolean z, C29481kuU c29481kuU, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = yDY.AhwBna();
        }
        return c29508kuv.copydefault(list, z, c29481kuU, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull TimeIntervalSelector timeIntervalSelector, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        GetSignalOverviewListUseCase$fetchKlineForOverview$1 getSignalOverviewListUseCase$fetchKlineForOverview$1;
        if (continuation instanceof GetSignalOverviewListUseCase$fetchKlineForOverview$1) {
            getSignalOverviewListUseCase$fetchKlineForOverview$1 = (GetSignalOverviewListUseCase$fetchKlineForOverview$1) continuation;
            int i = getSignalOverviewListUseCase$fetchKlineForOverview$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSignalOverviewListUseCase$fetchKlineForOverview$1.label = i - Integer.MIN_VALUE;
            } else {
                getSignalOverviewListUseCase$fetchKlineForOverview$1 = new GetSignalOverviewListUseCase$fetchKlineForOverview$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getSignalOverviewListUseCase$fetchKlineForOverview$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSignalOverviewListUseCase$fetchKlineForOverview$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.djBIcL;
            GetSignalOverviewListUseCase$fetchKlineForOverview$$inlined$dexRunCatching$1 getSignalOverviewListUseCase$fetchKlineForOverview$$inlined$dexRunCatching$1 = new GetSignalOverviewListUseCase$fetchKlineForOverview$$inlined$dexRunCatching$1(null, this, str, str2, timeIntervalSelector);
            getSignalOverviewListUseCase$fetchKlineForOverview$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getSignalOverviewListUseCase$fetchKlineForOverview$$inlined$dexRunCatching$1, getSignalOverviewListUseCase$fetchKlineForOverview$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        ((Result) objWithContext).m7386unboximpl();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull TimeIntervalSelector timeIntervalSelector, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        GetSignalOverviewListUseCase$fetchKlineLoadMore$1 getSignalOverviewListUseCase$fetchKlineLoadMore$1;
        if (continuation instanceof GetSignalOverviewListUseCase$fetchKlineLoadMore$1) {
            getSignalOverviewListUseCase$fetchKlineLoadMore$1 = (GetSignalOverviewListUseCase$fetchKlineLoadMore$1) continuation;
            int i = getSignalOverviewListUseCase$fetchKlineLoadMore$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSignalOverviewListUseCase$fetchKlineLoadMore$1.label = i - Integer.MIN_VALUE;
            } else {
                getSignalOverviewListUseCase$fetchKlineLoadMore$1 = new GetSignalOverviewListUseCase$fetchKlineLoadMore$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getSignalOverviewListUseCase$fetchKlineLoadMore$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSignalOverviewListUseCase$fetchKlineLoadMore$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.djBIcL;
            GetSignalOverviewListUseCase$fetchKlineLoadMore$$inlined$dexRunCatching$1 getSignalOverviewListUseCase$fetchKlineLoadMore$$inlined$dexRunCatching$1 = new GetSignalOverviewListUseCase$fetchKlineLoadMore$$inlined$dexRunCatching$1(null, this, str, str2, timeIntervalSelector);
            getSignalOverviewListUseCase$fetchKlineLoadMore$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getSignalOverviewListUseCase$fetchKlineLoadMore$$inlined$dexRunCatching$1, getSignalOverviewListUseCase$fetchKlineLoadMore$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        ((Result) objWithContext).m7386unboximpl();
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull BuySellMarker buySellMarker, boolean z, boolean z2) {
        java.lang.Object next;
        java.lang.Object next2;
        java.util.List<SignalOverviewUiModel> value;
        java.util.ArrayList arrayList;
        Intrinsics.checkNotNullParameter(buySellMarker, "");
        java.util.List<SignalOverviewUiModel> value2 = this.AhwBna.getValue();
        if (value2 != null) {
            java.util.Iterator<T> it = value2.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                java.util.List<SignalUiModel> listDjBIcL = ((SignalOverviewUiModel) next).djBIcL();
                if (!(listDjBIcL instanceof java.util.Collection) || !listDjBIcL.isEmpty()) {
                    java.util.Iterator<T> it2 = listDjBIcL.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.EZpvd((java.lang.Object) ((SignalUiModel) it2.next()).djBIcL(), (java.lang.Object) buySellMarker.AEQbTJ())) {
                            break loop0;
                        }
                    }
                }
            }
            SignalOverviewUiModel signalOverviewUiModel = (SignalOverviewUiModel) next;
            if (signalOverviewUiModel == null) {
                return;
            }
            java.util.Iterator<T> it3 = signalOverviewUiModel.djBIcL().iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((SignalUiModel) next2).djBIcL(), (java.lang.Object) buySellMarker.AEQbTJ())) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            SignalUiModel signalUiModel = (SignalUiModel) next2;
            if (signalUiModel == null) {
                return;
            }
            SignalOverviewUiModel signalOverviewUiModelAEQbTJ = signalOverviewUiModel.AEQbTJ((212991 & 1) != 0 ? signalOverviewUiModel.AkhnZx : null, (212991 & 2) != 0 ? signalOverviewUiModel.DbNXlk : null, (212991 & 4) != 0 ? signalOverviewUiModel.isConnected : null, (212991 & 8) != 0 ? signalOverviewUiModel.values : null, (212991 & 16) != 0 ? signalOverviewUiModel.fetchVPNInfo : null, (212991 & 32) != 0 ? signalOverviewUiModel.fARcdN : null, (212991 & 64) != 0 ? signalOverviewUiModel.fIwbmz : null, (212991 & 128) != 0 ? signalOverviewUiModel.ejfBZ : null, (212991 & 256) != 0 ? signalOverviewUiModel.AEQbTJ : null, (212991 & 512) != 0 ? signalOverviewUiModel.KWHzl : null, (212991 & 1024) != 0 ? signalOverviewUiModel.EZpvd : null, (212991 & 2048) != 0 ? signalOverviewUiModel.copydefault : null, (212991 & 4096) != 0 ? signalOverviewUiModel.valueOf : 0L, (212991 & 8192) != 0 ? signalOverviewUiModel.AhwBna : null, (212991 & 16384) != 0 ? signalOverviewUiModel.AYXKKw : signalUiModel, (212991 & 32768) != 0 ? signalOverviewUiModel.djBIcL : null, (212991 & 65536) != 0 ? signalOverviewUiModel.gEmmrt : null, (212991 & 131072) != 0 ? signalOverviewUiModel.AuCTel : null);
            MutableStateFlow<java.util.List<SignalOverviewUiModel>> mutableStateFlow = this.KWHzl;
            do {
                value = mutableStateFlow.getValue();
                java.util.List<SignalOverviewUiModel> list = value;
                if (list != null) {
                    arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                    for (SignalOverviewUiModel signalOverviewUiModel2 : list) {
                        if (Intrinsics.EZpvd(signalOverviewUiModel2, signalOverviewUiModel)) {
                            signalOverviewUiModel2 = signalOverviewUiModelAEQbTJ;
                        }
                        arrayList.add(signalOverviewUiModel2);
                    }
                } else {
                    arrayList = null;
                }
            } while (!mutableStateFlow.compareAndSet(value, arrayList));
            if (z2) {
                if (z) {
                    C29408ktA.KWHzl.copydefault(signalOverviewUiModelAEQbTJ.fetchVPNInfo(), "signal_point");
                } else {
                    C29408ktA.KWHzl.KWHzl(signalOverviewUiModelAEQbTJ.fetchVPNInfo(), "signal_point");
                }
            }
        }
    }

    public final void OLrzqt(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        JobKt__JobKt.cancelChildren$default(this.isConnected.getCoroutineContext(), (CancellationException) null, 1, (java.lang.Object) null);
        C25389ivm.safeLaunch$default(this.isConnected, null, null, new GetSignalOverviewListUseCase$subscribeWs$1(this, null), 3, null);
        C25389ivm.safeLaunch$default(this.isConnected, this.djBIcL, null, new GetSignalOverviewListUseCase$subscribeWs$2(this, list, null), 2, null);
    }

    public final void EZpvd() {
        JobKt__JobKt.cancelChildren$default(this.isConnected.getCoroutineContext(), (CancellationException) null, 1, (java.lang.Object) null);
        C25389ivm.safeLaunch$default(this.isConnected, null, null, new GetSignalOverviewListUseCase$stopWs$1(this, null), 3, null);
    }

    public final void copydefault() {
        this.OLrzqt.setValue(java.lang.Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        GetSignalOverviewListUseCase$subscribeTokenUpdatesWs$1 getSignalOverviewListUseCase$subscribeTokenUpdatesWs$1;
        C29508kuv c29508kuv;
        if (continuation instanceof GetSignalOverviewListUseCase$subscribeTokenUpdatesWs$1) {
            getSignalOverviewListUseCase$subscribeTokenUpdatesWs$1 = (GetSignalOverviewListUseCase$subscribeTokenUpdatesWs$1) continuation;
            int i = getSignalOverviewListUseCase$subscribeTokenUpdatesWs$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSignalOverviewListUseCase$subscribeTokenUpdatesWs$1.label = i - Integer.MIN_VALUE;
            } else {
                getSignalOverviewListUseCase$subscribeTokenUpdatesWs$1 = new GetSignalOverviewListUseCase$subscribeTokenUpdatesWs$1(this, continuation);
            }
        }
        java.lang.Object obj = getSignalOverviewListUseCase$subscribeTokenUpdatesWs$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSignalOverviewListUseCase$subscribeTokenUpdatesWs$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            getSignalOverviewListUseCase$subscribeTokenUpdatesWs$1.L$0 = this;
            getSignalOverviewListUseCase$subscribeTokenUpdatesWs$1.L$1 = str;
            getSignalOverviewListUseCase$subscribeTokenUpdatesWs$1.L$2 = str2;
            getSignalOverviewListUseCase$subscribeTokenUpdatesWs$1.label = 1;
            if (EZpvd(getSignalOverviewListUseCase$subscribeTokenUpdatesWs$1) == objCopydefault) {
                return objCopydefault;
            }
            c29508kuv = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (java.lang.String) getSignalOverviewListUseCase$subscribeTokenUpdatesWs$1.L$2;
            str = (java.lang.String) getSignalOverviewListUseCase$subscribeTokenUpdatesWs$1.L$1;
            c29508kuv = (C29508kuv) getSignalOverviewListUseCase$subscribeTokenUpdatesWs$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        C25389ivm.safeLaunch$default(c29508kuv.isConnected, c29508kuv.djBIcL, null, new GetSignalOverviewListUseCase$subscribeTokenUpdatesWs$2(c29508kuv, str, str2, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        GetSignalOverviewListUseCase$subscribeMultipleTokenUpdatesWs$1 getSignalOverviewListUseCase$subscribeMultipleTokenUpdatesWs$1;
        C29508kuv c29508kuv;
        java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list2;
        if (continuation instanceof GetSignalOverviewListUseCase$subscribeMultipleTokenUpdatesWs$1) {
            getSignalOverviewListUseCase$subscribeMultipleTokenUpdatesWs$1 = (GetSignalOverviewListUseCase$subscribeMultipleTokenUpdatesWs$1) continuation;
            int i = getSignalOverviewListUseCase$subscribeMultipleTokenUpdatesWs$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSignalOverviewListUseCase$subscribeMultipleTokenUpdatesWs$1.label = i - Integer.MIN_VALUE;
            } else {
                getSignalOverviewListUseCase$subscribeMultipleTokenUpdatesWs$1 = new GetSignalOverviewListUseCase$subscribeMultipleTokenUpdatesWs$1(this, continuation);
            }
        }
        java.lang.Object obj = getSignalOverviewListUseCase$subscribeMultipleTokenUpdatesWs$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSignalOverviewListUseCase$subscribeMultipleTokenUpdatesWs$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (list.isEmpty()) {
                return Unit.INSTANCE;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                kotlin.Pair pair = (kotlin.Pair) obj2;
                if ((!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) pair.getFirst())) && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) pair.getSecond()))) {
                    arrayList.add(obj2);
                }
            }
            if (Intrinsics.EZpvd(CollectionsKt___CollectionsKt.OqFWZa(arrayList), CollectionsKt___CollectionsKt.OqFWZa(this.EZpvd))) {
                return Unit.INSTANCE;
            }
            getSignalOverviewListUseCase$subscribeMultipleTokenUpdatesWs$1.L$0 = this;
            getSignalOverviewListUseCase$subscribeMultipleTokenUpdatesWs$1.L$1 = arrayList;
            getSignalOverviewListUseCase$subscribeMultipleTokenUpdatesWs$1.label = 1;
            if (EZpvd(getSignalOverviewListUseCase$subscribeMultipleTokenUpdatesWs$1) == objCopydefault) {
                return objCopydefault;
            }
            c29508kuv = this;
            list2 = arrayList;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (java.util.List) getSignalOverviewListUseCase$subscribeMultipleTokenUpdatesWs$1.L$1;
            c29508kuv = (C29508kuv) getSignalOverviewListUseCase$subscribeMultipleTokenUpdatesWs$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        c29508kuv.DbNXlk = C25389ivm.safeLaunch$default(c29508kuv.isConnected, c29508kuv.djBIcL, null, new GetSignalOverviewListUseCase$subscribeMultipleTokenUpdatesWs$2(c29508kuv, list2, null), 2, null);
        c29508kuv.EZpvd = list2;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        GetSignalOverviewListUseCase$stopTokenUpdatesWs$1 getSignalOverviewListUseCase$stopTokenUpdatesWs$1;
        C29508kuv c29508kuv;
        if (continuation instanceof GetSignalOverviewListUseCase$stopTokenUpdatesWs$1) {
            getSignalOverviewListUseCase$stopTokenUpdatesWs$1 = (GetSignalOverviewListUseCase$stopTokenUpdatesWs$1) continuation;
            int i = getSignalOverviewListUseCase$stopTokenUpdatesWs$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSignalOverviewListUseCase$stopTokenUpdatesWs$1.label = i - Integer.MIN_VALUE;
            } else {
                getSignalOverviewListUseCase$stopTokenUpdatesWs$1 = new GetSignalOverviewListUseCase$stopTokenUpdatesWs$1(this, continuation);
            }
        }
        java.lang.Object obj = getSignalOverviewListUseCase$stopTokenUpdatesWs$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSignalOverviewListUseCase$stopTokenUpdatesWs$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Job job = this.DbNXlk;
            if (job != null) {
                getSignalOverviewListUseCase$stopTokenUpdatesWs$1.L$0 = this;
                getSignalOverviewListUseCase$stopTokenUpdatesWs$1.label = 1;
                if (JobKt.cancelAndJoin(job, getSignalOverviewListUseCase$stopTokenUpdatesWs$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
            c29508kuv = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            c29508kuv = (C29508kuv) getSignalOverviewListUseCase$stopTokenUpdatesWs$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        c29508kuv.DbNXlk = null;
        c29508kuv.EZpvd = yDY.AhwBna();
        InterfaceC29466kuF interfaceC29466kuF = c29508kuv.AYXKKw;
        getSignalOverviewListUseCase$stopTokenUpdatesWs$1.L$0 = null;
        getSignalOverviewListUseCase$stopTokenUpdatesWs$1.label = 2;
        if (interfaceC29466kuF.copydefault(getSignalOverviewListUseCase$stopTokenUpdatesWs$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.kuu.invoke-yxL6bBk$default(o.kuu, java.lang.String, java.lang.String, com.okinc.business.market.features.smart_money.signal.ui.overview.chart.TimeIntervalSelector, long, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull SignalOverviewUiModel signalOverviewUiModel, @NotNull Continuation<? super SignalOverviewKLineUiModel> continuation) throws java.lang.Throwable {
        GetSignalOverviewListUseCase$fetchInitialKLineData$1 getSignalOverviewListUseCase$fetchInitialKLineData$1;
        TimeIntervalSelector timeIntervalSelector;
        java.lang.Object objM8675invokeyxL6bBk$default;
        if (continuation instanceof GetSignalOverviewListUseCase$fetchInitialKLineData$1) {
            getSignalOverviewListUseCase$fetchInitialKLineData$1 = (GetSignalOverviewListUseCase$fetchInitialKLineData$1) continuation;
            int i = getSignalOverviewListUseCase$fetchInitialKLineData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSignalOverviewListUseCase$fetchInitialKLineData$1.label = i - Integer.MIN_VALUE;
            } else {
                getSignalOverviewListUseCase$fetchInitialKLineData$1 = new GetSignalOverviewListUseCase$fetchInitialKLineData$1(this, continuation);
            }
        }
        GetSignalOverviewListUseCase$fetchInitialKLineData$1 getSignalOverviewListUseCase$fetchInitialKLineData$12 = getSignalOverviewListUseCase$fetchInitialKLineData$1;
        java.lang.Object obj = getSignalOverviewListUseCase$fetchInitialKLineData$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSignalOverviewListUseCase$fetchInitialKLineData$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (signalOverviewUiModel.djBIcL().isEmpty()) {
                return null;
            }
            java.util.Iterator<T> it = signalOverviewUiModel.djBIcL().iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            java.lang.String strAYXKKw = ((SignalUiModel) it.next()).AYXKKw();
            while (it.hasNext()) {
                java.lang.String strAYXKKw2 = ((SignalUiModel) it.next()).AYXKKw();
                if (strAYXKKw.compareTo(strAYXKKw2) < 0) {
                    strAYXKKw = strAYXKKw2;
                }
            }
            java.lang.Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(strAYXKKw);
            if (fieldNames == null) {
                return null;
            }
            long jCurrentTimeMillis = (java.lang.System.currentTimeMillis() - fieldNames.longValue()) / ((long) 3600000);
            if (jCurrentTimeMillis <= 4) {
                timeIntervalSelector = TimeIntervalSelector.FOUR_HOURS;
            } else if (jCurrentTimeMillis <= 24) {
                timeIntervalSelector = TimeIntervalSelector.TWENTY_FOUR_HOURS;
            } else {
                timeIntervalSelector = TimeIntervalSelector.SEVEN_DAYS;
            }
            TimeIntervalSelector timeIntervalSelector2 = timeIntervalSelector;
            C29507kuu c29507kuu = this.AEQbTJ;
            java.lang.String strValueOf = signalOverviewUiModel.valueOf();
            java.lang.String strValues = signalOverviewUiModel.values();
            getSignalOverviewListUseCase$fetchInitialKLineData$12.label = 1;
            objM8675invokeyxL6bBk$default = C29507kuu.m8675invokeyxL6bBk$default(c29507kuu, strValueOf, strValues, timeIntervalSelector2, 0L, getSignalOverviewListUseCase$fetchInitialKLineData$12, 8, null);
            if (objM8675invokeyxL6bBk$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM8675invokeyxL6bBk$default = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objM8675invokeyxL6bBk$default)) {
            return null;
        }
        return objM8675invokeyxL6bBk$default;
    }

    /* JADX DEBUG: Duplicate block (B:22:0x008a) to fix multi-entry loop: BACK_EDGE: B:22:0x008a -> B:42:0x015f */
    /* JADX DEBUG: Duplicate block (B:41:0x015b) to fix multi-entry loop: BACK_EDGE: B:41:0x015b -> B:42:0x015f */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x015f, code lost:
    
        r11 = r0;
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0136 -> B:32:0x013d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.util.List<SignalOverview> list, @NotNull java.util.Map<java.lang.String, TokenInfo> map, boolean z, @NotNull Continuation<? super java.util.List<SignalOverviewUiModel>> continuation) throws java.lang.Throwable {
        GetSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$1 getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$1;
        C29508kuv c29508kuv;
        java.util.Collection arrayList;
        C29508kuv c29508kuv2;
        java.util.Iterator it;
        java.util.Map<java.lang.String, TokenInfo> map2;
        GetSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$1 getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$12;
        boolean z2;
        if (continuation instanceof GetSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$1) {
            getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$1 = (GetSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$1) continuation;
            int i = getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$1.label = i - Integer.MIN_VALUE;
                c29508kuv = this;
            } else {
                c29508kuv = this;
                getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$1 = new GetSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$1(c29508kuv, continuation);
            }
        }
        java.lang.Object obj = getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            arrayList = new java.util.ArrayList();
            c29508kuv2 = c29508kuv;
            it = list.iterator();
            map2 = map;
            getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$12 = getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$1;
            z2 = z;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z3 = getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$1.Z$0;
            TokenInfo tokenInfo = (TokenInfo) getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$1.L$5;
            SignalOverview signalOverview = (SignalOverview) getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$1.L$4;
            it = (java.util.Iterator) getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$1.L$3;
            arrayList = (java.util.Collection) getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$1.L$2;
            java.util.Map<java.lang.String, TokenInfo> map3 = (java.util.Map) getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$1.L$1;
            c29508kuv2 = (C29508kuv) getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$1.L$0;
            C56391yDq.AEQbTJ(obj);
            final SignalOverviewKLineUiModel signalOverviewKLineUiModel = (SignalOverviewKLineUiModel) obj;
            if (signalOverviewKLineUiModel != null) {
                SignalOverviewUiModel signalOverviewUiModelCopydefault = null;
                boolean z4 = z3;
                getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$12 = getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$1;
                z2 = z4;
                if (signalOverviewUiModelCopydefault != null) {
                    arrayList.add(signalOverviewUiModelCopydefault);
                }
                map2 = map3;
                if (it.hasNext()) {
                    signalOverview = (SignalOverview) it.next();
                    tokenInfo = map2.get(signalOverview.fetchVPNInfo());
                    if (tokenInfo == null || signalOverview.valueOf().isEmpty()) {
                        map3 = map2;
                        signalOverviewUiModelCopydefault = null;
                        if (signalOverviewUiModelCopydefault != null) {
                        }
                        map2 = map3;
                        if (it.hasNext()) {
                        }
                    } else if (z2) {
                        java.lang.String strEZpvd = tokenInfo.EZpvd();
                        java.lang.String strIsConnected = tokenInfo.isConnected();
                        java.util.List<SignalData> listValueOf = signalOverview.valueOf();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listValueOf, 10));
                        for (SignalData signalData : listValueOf) {
                            arrayList2.add(c29508kuv2.valueOf.OLrzqt(signalData.OLrzqt((262142 & 1) != 0 ? signalData.tokenInfo : DexTokenMeta.Companion.OLrzqt(tokenInfo), (262142 & 2) != 0 ? signalData.id : null, (262142 & 4) != 0 ? signalData.batchId : null, (262142 & 8) != 0 ? signalData.batchIndex : null, (262142 & 16) != 0 ? signalData.trend : null, (262142 & 32) != 0 ? signalData.addressNum : null, (262142 & 64) != 0 ? signalData.addresses : null, (262142 & 128) != 0 ? signalData.volume : null, (262142 & 256) != 0 ? signalData.price : null, (262142 & 512) != 0 ? signalData.liquidity : null, (262142 & 1024) != 0 ? signalData.marketCap : null, (262142 & 2048) != 0 ? signalData.eventTime : null, (262142 & 4096) != 0 ? signalData.duration : null, (262142 & 8192) != 0 ? signalData.holders : null, (262142 & 16384) != 0 ? signalData.sellRatio : null, (262142 & 32768) != 0 ? signalData.expireStatus : null, (262142 & 65536) != 0 ? signalData.signalLabel : null, (262142 & 131072) != 0 ? signalData.tokenKey : null)));
                        }
                        SignalOverviewUiModel signalOverviewUiModel = new SignalOverviewUiModel(strEZpvd, null, null, null, strIsConnected, null, null, null, null, null, null, null, 0L, arrayList2, null, null, null, null, 253934, null);
                        getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$12.L$0 = c29508kuv2;
                        getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$12.L$1 = map2;
                        getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$12.L$2 = arrayList;
                        getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$12.L$3 = it;
                        getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$12.L$4 = signalOverview;
                        getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$12.L$5 = tokenInfo;
                        getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$12.Z$0 = z2;
                        getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$12.label = 1;
                        java.lang.Object objOLrzqt = c29508kuv2.OLrzqt(signalOverviewUiModel, getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$12);
                        if (objOLrzqt == objCopydefault) {
                            return objCopydefault;
                        }
                        map3 = map2;
                        obj = objOLrzqt;
                        GetSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$1 getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$13 = getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$12;
                        z3 = z2;
                        getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$1 = getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$13;
                        final SignalOverviewKLineUiModel signalOverviewKLineUiModel2 = (SignalOverviewKLineUiModel) obj;
                        if (signalOverviewKLineUiModel2 != null) {
                            boolean z5 = z3;
                            getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$12 = getSignalOverviewListUseCase$mapOverviewResponseToSignalOverviewUiModel$1;
                            z2 = z5;
                            C29474kuN c29474kuN = c29508kuv2.valueOf;
                            signalOverviewUiModelCopydefault = signalOverviewKLineUiModel2 == null ? c29474kuN.copydefault(signalOverview, tokenInfo, new Function0() { // from class: o.kuy
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return C29508kuv.KWHzl(signalOverviewKLineUiModel2);
                                }
                            }) : c29474kuN.copydefault(signalOverview, tokenInfo, (Function0<SignalOverviewKLineUiModel>) null);
                            if (signalOverviewUiModelCopydefault != null) {
                            }
                            map2 = map3;
                            if (it.hasNext()) {
                                return (java.util.List) arrayList;
                            }
                        }
                    } else {
                        map3 = map2;
                        signalOverviewKLineUiModel2 = null;
                        C29474kuN c29474kuN2 = c29508kuv2.valueOf;
                        if (signalOverviewKLineUiModel2 == null) {
                        }
                        if (signalOverviewUiModelCopydefault != null) {
                        }
                        map2 = map3;
                        if (it.hasNext()) {
                        }
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kuv */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object mapOverviewResponseToSignalOverviewUiModel$default(C29508kuv c29508kuv, java.util.List list, java.util.Map map, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return c29508kuv.OLrzqt(list, map, z, continuation);
    }

    public final java.util.List<SignalOverviewUiModel> KWHzl(@NotNull java.util.List<SignalOverviewUiModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            SignalOverviewUiModel signalOverviewUiModel = (SignalOverviewUiModel) obj;
            if (hashSet.add(C56390yDp.OLrzqt(signalOverviewUiModel.valueOf(), signalOverviewUiModel.values()))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
