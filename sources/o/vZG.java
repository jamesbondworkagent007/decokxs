package o;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.oksearch.analytics.FuzzySearchEventSourceEnum;
import com.okinc.oksearch.analytics.FuzzySearchEventTracker;
import com.okinc.tradingbot.impl.order.strategy.signalbot.ui.dialog.SignalMultiCoinSelectViewModel$displayList$1;
import com.okinc.tradingbot.impl.order.strategy.signalbot.ui.dialog.SignalMultiCoinSelectViewModel$displayList$2;
import com.okinc.tradingbot.impl.order.strategy.signalbot.ui.dialog.SignalMultiCoinSelectViewModel$special$$inlined$map$1$2$1;
import com.okinc.unify_trade.bot.data.SignalMultiCoinPairSelectItemData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C52861wac;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vZG extends ViewModel {
    public final MutableStateFlow<C52861wac.Activity> AEQbTJ;
    public final MutableStateFlow<java.lang.String> AYXKKw;
    public final Flow<java.util.List<java.lang.Object>> EZpvd;
    public final MutableStateFlow<java.util.List<SignalMultiCoinPairSelectItemData>> KWHzl;
    public final StateFlow<java.lang.Boolean> OLrzqt;
    public final MutableStateFlow<java.lang.Boolean> copydefault;
    public final StateFlow<java.util.List<SignalMultiCoinPairSelectItemData>> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<java.util.List<java.lang.Object>> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.List<SignalMultiCoinPairSelectItemData>> OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Boolean> copydefault() {
        return this.OLrzqt;
    }

    public vZG() {
        MutableStateFlow<C52861wac.Activity> MutableStateFlow = StateFlowKt.MutableStateFlow(new C52861wac.Activity(false, true));
        this.AEQbTJ = MutableStateFlow;
        MutableStateFlow<java.util.List<SignalMultiCoinPairSelectItemData>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.KWHzl = MutableStateFlow2;
        MutableStateFlow<java.lang.String> MutableStateFlow3 = StateFlowKt.MutableStateFlow("");
        this.AYXKKw = MutableStateFlow3;
        this.EZpvd = FlowKt.flowCombine(FlowKt.flowCombine(MutableStateFlow2, MutableStateFlow3, new SignalMultiCoinSelectViewModel$displayList$1(null)), MutableStateFlow, new SignalMultiCoinSelectViewModel$displayList$2(null));
        this.gEmmrt = FlowKt.stateIn(new TaskDescription(MutableStateFlow2), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.getEagerly(), yDY.AhwBna());
        MutableStateFlow<java.lang.Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(java.lang.Boolean.TRUE);
        this.copydefault = MutableStateFlow4;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow4);
    }

    public static final class TaskDescription implements Flow<java.util.List<? extends SignalMultiCoinPairSelectItemData>> {
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: o.vZG$TaskDescription$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SignalMultiCoinSelectViewModel$special$$inlined$map$1$2$1 signalMultiCoinSelectViewModel$special$$inlined$map$1$2$1;
                if (continuation instanceof SignalMultiCoinSelectViewModel$special$$inlined$map$1$2$1) {
                    signalMultiCoinSelectViewModel$special$$inlined$map$1$2$1 = (SignalMultiCoinSelectViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = signalMultiCoinSelectViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        signalMultiCoinSelectViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        signalMultiCoinSelectViewModel$special$$inlined$map$1$2$1 = new SignalMultiCoinSelectViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = signalMultiCoinSelectViewModel$special$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = signalMultiCoinSelectViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (T t : (java.util.List) obj) {
                        SignalMultiCoinPairSelectItemData signalMultiCoinPairSelectItemData = (SignalMultiCoinPairSelectItemData) t;
                        if (signalMultiCoinPairSelectItemData.gEmmrt() && signalMultiCoinPairSelectItemData.valueOf()) {
                            arrayList.add(t);
                        }
                    }
                    signalMultiCoinSelectViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(arrayList, signalMultiCoinSelectViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public TaskDescription(Flow flow) {
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends SignalMultiCoinPairSelectItemData>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final void copydefault(@NotNull java.util.List<SignalMultiCoinPairSelectItemData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl.setValue(list);
        EZpvd();
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw.setValue(str);
    }

    public final void EZpvd(boolean z) {
        MutableStateFlow<java.util.List<SignalMultiCoinPairSelectItemData>> mutableStateFlow = this.KWHzl;
        java.util.List<SignalMultiCoinPairSelectItemData> value = mutableStateFlow.getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(value, 10));
        for (SignalMultiCoinPairSelectItemData signalMultiCoinPairSelectItemDataEZpvd : value) {
            if (signalMultiCoinPairSelectItemDataEZpvd.gEmmrt()) {
                signalMultiCoinPairSelectItemDataEZpvd = signalMultiCoinPairSelectItemDataEZpvd.EZpvd((2015 & 1) != 0 ? signalMultiCoinPairSelectItemDataEZpvd.gEmmrt : null, (2015 & 2) != 0 ? signalMultiCoinPairSelectItemDataEZpvd.isConnected : null, (2015 & 4) != 0 ? signalMultiCoinPairSelectItemDataEZpvd.AEQbTJ : null, (2015 & 8) != 0 ? signalMultiCoinPairSelectItemDataEZpvd.KWHzl : null, (2015 & 16) != 0 ? signalMultiCoinPairSelectItemDataEZpvd.OLrzqt : null, (2015 & 32) != 0 ? signalMultiCoinPairSelectItemDataEZpvd.copydefault : z, (2015 & 64) != 0 ? signalMultiCoinPairSelectItemDataEZpvd.EZpvd : false, (2015 & 128) != 0 ? signalMultiCoinPairSelectItemDataEZpvd.valueOf : null, (2015 & 256) != 0 ? signalMultiCoinPairSelectItemDataEZpvd.AYXKKw : AudioStats.AUDIO_AMPLITUDE_NONE, (2015 & 512) != 0 ? signalMultiCoinPairSelectItemDataEZpvd.AhwBna : null, (2015 & 1024) != 0 ? signalMultiCoinPairSelectItemDataEZpvd.djBIcL : AudioStats.AUDIO_AMPLITUDE_NONE);
            }
            arrayList.add(signalMultiCoinPairSelectItemDataEZpvd);
        }
        mutableStateFlow.tryEmit(arrayList);
        EZpvd();
        this.copydefault.setValue(java.lang.Boolean.TRUE);
    }

    public final void KWHzl(@NotNull SignalMultiCoinPairSelectItemData signalMultiCoinPairSelectItemData) {
        Intrinsics.checkNotNullParameter(signalMultiCoinPairSelectItemData, "");
        MutableStateFlow<java.util.List<SignalMultiCoinPairSelectItemData>> mutableStateFlow = this.KWHzl;
        java.util.List<SignalMultiCoinPairSelectItemData> value = mutableStateFlow.getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(value, 10));
        int i = 0;
        for (java.lang.Object obj : value) {
            int i2 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            SignalMultiCoinPairSelectItemData signalMultiCoinPairSelectItemDataEZpvd = (SignalMultiCoinPairSelectItemData) obj;
            if (signalMultiCoinPairSelectItemDataEZpvd.gEmmrt() && Intrinsics.EZpvd(signalMultiCoinPairSelectItemDataEZpvd, signalMultiCoinPairSelectItemData)) {
                FuzzySearchEventTracker.EZpvd.KWHzl(FuzzySearchEventSourceEnum.OKTRADE_MULTI_COIN.getSource(), this.AYXKKw.getValue(), C33129mqd.gEmmrt(signalMultiCoinPairSelectItemData.getPrimary()), C33129mqd.gEmmrt(signalMultiCoinPairSelectItemData.getSecondary()), C33129mqd.gEmmrt(java.lang.Double.valueOf(signalMultiCoinPairSelectItemData.getPrimarySimilarity())), C33129mqd.gEmmrt(java.lang.Double.valueOf(signalMultiCoinPairSelectItemData.getSecondarySimilarity())), C33129mqd.gEmmrt(java.lang.Integer.valueOf(i2)));
                signalMultiCoinPairSelectItemDataEZpvd = signalMultiCoinPairSelectItemDataEZpvd.EZpvd((2015 & 1) != 0 ? signalMultiCoinPairSelectItemDataEZpvd.gEmmrt : null, (2015 & 2) != 0 ? signalMultiCoinPairSelectItemDataEZpvd.isConnected : null, (2015 & 4) != 0 ? signalMultiCoinPairSelectItemDataEZpvd.AEQbTJ : null, (2015 & 8) != 0 ? signalMultiCoinPairSelectItemDataEZpvd.KWHzl : null, (2015 & 16) != 0 ? signalMultiCoinPairSelectItemDataEZpvd.OLrzqt : null, (2015 & 32) != 0 ? signalMultiCoinPairSelectItemDataEZpvd.copydefault : !signalMultiCoinPairSelectItemDataEZpvd.valueOf(), (2015 & 64) != 0 ? signalMultiCoinPairSelectItemDataEZpvd.EZpvd : false, (2015 & 128) != 0 ? signalMultiCoinPairSelectItemDataEZpvd.valueOf : null, (2015 & 256) != 0 ? signalMultiCoinPairSelectItemDataEZpvd.AYXKKw : AudioStats.AUDIO_AMPLITUDE_NONE, (2015 & 512) != 0 ? signalMultiCoinPairSelectItemDataEZpvd.AhwBna : null, (2015 & 1024) != 0 ? signalMultiCoinPairSelectItemDataEZpvd.djBIcL : AudioStats.AUDIO_AMPLITUDE_NONE);
            }
            arrayList.add(signalMultiCoinPairSelectItemDataEZpvd);
            i = i2;
        }
        mutableStateFlow.setValue(arrayList);
        EZpvd();
        this.copydefault.setValue(java.lang.Boolean.TRUE);
    }

    public final void djBIcL() {
        java.lang.Object next;
        java.util.ArrayList arrayList;
        SignalMultiCoinPairSelectItemData signalMultiCoinPairSelectItemDataEZpvd;
        java.util.List<SignalMultiCoinPairSelectItemData> value = this.KWHzl.getValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : value) {
            if (((SignalMultiCoinPairSelectItemData) obj).gEmmrt()) {
                arrayList2.add(obj);
            }
        }
        java.util.Iterator it = arrayList2.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((SignalMultiCoinPairSelectItemData) next).OLrzqt(), (java.lang.Object) "BTC-USDT-SWAP")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        SignalMultiCoinPairSelectItemData signalMultiCoinPairSelectItemData = (SignalMultiCoinPairSelectItemData) next;
        if (signalMultiCoinPairSelectItemData == null) {
            signalMultiCoinPairSelectItemData = (SignalMultiCoinPairSelectItemData) CollectionsKt___CollectionsKt.firstOrNull(arrayList2);
        }
        MutableStateFlow<java.util.List<SignalMultiCoinPairSelectItemData>> mutableStateFlow = this.KWHzl;
        java.util.List<SignalMultiCoinPairSelectItemData> value2 = mutableStateFlow.getValue();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(value2, 10));
        for (SignalMultiCoinPairSelectItemData signalMultiCoinPairSelectItemData2 : value2) {
            if (Intrinsics.EZpvd(signalMultiCoinPairSelectItemData2, signalMultiCoinPairSelectItemData)) {
                SignalMultiCoinPairSelectItemData signalMultiCoinPairSelectItemData3 = signalMultiCoinPairSelectItemData;
                arrayList = arrayList3;
                signalMultiCoinPairSelectItemDataEZpvd = signalMultiCoinPairSelectItemData3.EZpvd((2015 & 1) != 0 ? signalMultiCoinPairSelectItemData3.gEmmrt : null, (2015 & 2) != 0 ? signalMultiCoinPairSelectItemData3.isConnected : null, (2015 & 4) != 0 ? signalMultiCoinPairSelectItemData3.AEQbTJ : null, (2015 & 8) != 0 ? signalMultiCoinPairSelectItemData3.KWHzl : null, (2015 & 16) != 0 ? signalMultiCoinPairSelectItemData3.OLrzqt : null, (2015 & 32) != 0 ? signalMultiCoinPairSelectItemData3.copydefault : true, (2015 & 64) != 0 ? signalMultiCoinPairSelectItemData3.EZpvd : false, (2015 & 128) != 0 ? signalMultiCoinPairSelectItemData3.valueOf : null, (2015 & 256) != 0 ? signalMultiCoinPairSelectItemData3.AYXKKw : AudioStats.AUDIO_AMPLITUDE_NONE, (2015 & 512) != 0 ? signalMultiCoinPairSelectItemData3.AhwBna : null, (2015 & 1024) != 0 ? signalMultiCoinPairSelectItemData3.djBIcL : AudioStats.AUDIO_AMPLITUDE_NONE);
            } else {
                arrayList = arrayList3;
                signalMultiCoinPairSelectItemDataEZpvd = signalMultiCoinPairSelectItemData2.EZpvd((2015 & 1) != 0 ? signalMultiCoinPairSelectItemData2.gEmmrt : null, (2015 & 2) != 0 ? signalMultiCoinPairSelectItemData2.isConnected : null, (2015 & 4) != 0 ? signalMultiCoinPairSelectItemData2.AEQbTJ : null, (2015 & 8) != 0 ? signalMultiCoinPairSelectItemData2.KWHzl : null, (2015 & 16) != 0 ? signalMultiCoinPairSelectItemData2.OLrzqt : null, (2015 & 32) != 0 ? signalMultiCoinPairSelectItemData2.copydefault : false, (2015 & 64) != 0 ? signalMultiCoinPairSelectItemData2.EZpvd : false, (2015 & 128) != 0 ? signalMultiCoinPairSelectItemData2.valueOf : null, (2015 & 256) != 0 ? signalMultiCoinPairSelectItemData2.AYXKKw : AudioStats.AUDIO_AMPLITUDE_NONE, (2015 & 512) != 0 ? signalMultiCoinPairSelectItemData2.AhwBna : null, (2015 & 1024) != 0 ? signalMultiCoinPairSelectItemData2.djBIcL : AudioStats.AUDIO_AMPLITUDE_NONE);
            }
            java.util.ArrayList arrayList4 = arrayList;
            arrayList4.add(signalMultiCoinPairSelectItemDataEZpvd);
            arrayList3 = arrayList4;
        }
        mutableStateFlow.setValue(arrayList3);
        EZpvd();
        this.copydefault.setValue(java.lang.Boolean.FALSE);
    }

    public final void EZpvd() {
        MutableStateFlow<C52861wac.Activity> mutableStateFlow = this.AEQbTJ;
        mutableStateFlow.tryEmit(C52861wac.Activity.copy$default(mutableStateFlow.getValue(), KWHzl(), false, 2, null));
    }

    public final boolean KWHzl() {
        java.util.List<SignalMultiCoinPairSelectItemData> value = this.KWHzl.getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : value) {
            if (((SignalMultiCoinPairSelectItemData) obj).gEmmrt()) {
                arrayList.add(obj);
            }
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                return true;
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((SignalMultiCoinPairSelectItemData) it.next()).valueOf()) {
                }
            }
            return true;
        }
        return false;
    }
}
