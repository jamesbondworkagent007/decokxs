package com.okinc.business.dex.trade.component.orderandposition.position.viewmodel;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.market.data.model.position_pnl.HoldingTokenData;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedAssetSort;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedAssetsFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.reactive.ReactiveFlowKt;
import o.AbstractC33073mpa;
import o.C22416heu;
import o.C23313hvq;
import o.C28182kRy;
import o.C28390kZq;
import o.C28434kah;
import o.C28438kal;
import o.C30765lhN;
import o.C30766lhO;
import o.C33129mqd;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56424yEw;
import o.C56442yFn;
import o.C56444yFp;
import o.C56548yJl;
import o.C59443zhD;
import o.C59449zhJ;
import o.C9860bdZ;
import o.InterfaceC56445yFq;
import o.gQS;
import o.kKG;
import o.pUU;
import o.yCM;
import o.yEE;
import o.yET;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class PositionComponentVewModel extends AbstractC33073mpa {
    public final MutableStateFlow<Boolean> AEQbTJ;
    public boolean AYXKKw;
    public AdvancedAssetsFilter AhwBna;
    public final StateFlow<gQS> AkhnZx;
    public final StateFlow<Map<C28438kal, TaskDescription>> AuCTel;
    public final StateFlow<Boolean> DbNXlk;
    public final MutableStateFlow<gQS> EZpvd;
    public final MutableStateFlow<Map<C28438kal, TaskDescription>> KWHzl;
    public final MutableStateFlow<Set<C28438kal>> OLrzqt;
    public final C30766lhO copydefault;
    public List<DexMultiTokenInfoBean> djBIcL;
    public final kKG ejfBZ;
    public final StateFlow<Set<C28438kal>> fARcdN;
    public final StateFlow<Map<C28438kal, TaskDescription>> fIwbmz;
    public final StateFlow<C9860bdZ> fJNWhG;
    public DefiChainInfo fetchVPNInfo;
    public final C28182kRy gEmmrt;
    public final StateFlow<Map<C28438kal, TaskDescription>> isConnected;
    public final C28434kah valueOf;
    public Job values;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PnLFor.values().length];
            try {
                iArr[PnLFor.PriceChange.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PnLFor.BalanceChange.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PnLFor.PnLPush.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<gQS> AEQbTJ() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Set<C28438kal>> AYXKKw() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C9860bdZ> AhwBna() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedAssetsFilter EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Map<C28438kal, TaskDescription>> KWHzl() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Map<C28438kal, TaskDescription>> OLrzqt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> copydefault() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Map<C28438kal, TaskDescription>> valueOf() {
        return this.fIwbmz;
    }

    public static final class ActionBar implements Flow<Map<C28438kal, ? extends TaskDescription>> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ PositionComponentVewModel OLrzqt;

        /* JADX INFO: renamed from: com.okinc.business.dex.trade.component.orderandposition.position.viewmodel.PositionComponentVewModel$ActionBar$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;
            public final /* synthetic */ PositionComponentVewModel OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, PositionComponentVewModel positionComponentVewModel) {
                this.EZpvd = flowCollector;
                this.OLrzqt = positionComponentVewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                PositionComponentVewModel$visiblePriceMap$lambda$5$$inlined$map$1$2$1 positionComponentVewModel$visiblePriceMap$lambda$5$$inlined$map$1$2$1;
                if (continuation instanceof PositionComponentVewModel$visiblePriceMap$lambda$5$$inlined$map$1$2$1) {
                    positionComponentVewModel$visiblePriceMap$lambda$5$$inlined$map$1$2$1 = (PositionComponentVewModel$visiblePriceMap$lambda$5$$inlined$map$1$2$1) continuation;
                    int i = positionComponentVewModel$visiblePriceMap$lambda$5$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        positionComponentVewModel$visiblePriceMap$lambda$5$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        positionComponentVewModel$visiblePriceMap$lambda$5$$inlined$map$1$2$1 = new PositionComponentVewModel$visiblePriceMap$lambda$5$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = positionComponentVewModel$visiblePriceMap$lambda$5$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = positionComponentVewModel$visiblePriceMap$lambda$5$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    List<HoldingTokenData> list = (List) obj;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
                    for (HoldingTokenData holdingTokenData : list) {
                        linkedHashMap.put(new C28438kal(holdingTokenData.OLrzqt(), holdingTokenData.copydefault()), PositionComponentVewModel.calculatePnlMetrics$default(this.OLrzqt, holdingTokenData.OLrzqt(), holdingTokenData.copydefault(), PnLFor.PriceChange, null, holdingTokenData.KWHzl(), null, null, null, 232, null));
                    }
                    positionComponentVewModel$visiblePriceMap$lambda$5$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(linkedHashMap, positionComponentVewModel$visiblePriceMap$lambda$5$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public ActionBar(Flow flow, PositionComponentVewModel positionComponentVewModel) {
            this.AEQbTJ = flow;
            this.OLrzqt = positionComponentVewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Map<C28438kal, ? extends TaskDescription>> flowCollector, Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass2(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class Activity implements Flow<Map<C28438kal, ? extends TaskDescription>> {
        public final /* synthetic */ Flow KWHzl;
        public final /* synthetic */ PositionComponentVewModel copydefault;

        /* JADX INFO: renamed from: com.okinc.business.dex.trade.component.orderandposition.position.viewmodel.PositionComponentVewModel$Activity$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ PositionComponentVewModel AEQbTJ;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector, PositionComponentVewModel positionComponentVewModel) {
                this.copydefault = flowCollector;
                this.AEQbTJ = positionComponentVewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                PositionComponentVewModel$special$$inlined$map$1$2$1 positionComponentVewModel$special$$inlined$map$1$2$1;
                Map mapKWHzl;
                if (continuation instanceof PositionComponentVewModel$special$$inlined$map$1$2$1) {
                    positionComponentVewModel$special$$inlined$map$1$2$1 = (PositionComponentVewModel$special$$inlined$map$1$2$1) continuation;
                    int i = positionComponentVewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        positionComponentVewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        positionComponentVewModel$special$$inlined$map$1$2$1 = new PositionComponentVewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = positionComponentVewModel$special$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = positionComponentVewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    C9860bdZ c9860bdZ = (C9860bdZ) obj;
                    if (c9860bdZ.OLrzqt() == null || c9860bdZ.AhwBna() == null) {
                        mapKWHzl = C56424yEw.KWHzl();
                    } else {
                        String strValueOf = String.valueOf(c9860bdZ.OLrzqt());
                        String strAhwBna = c9860bdZ.AhwBna();
                        if (strAhwBna == null) {
                            strAhwBna = "";
                        }
                        C28438kal c28438kal = new C28438kal(strValueOf, strAhwBna);
                        String strValueOf2 = String.valueOf(c9860bdZ.OLrzqt());
                        String strAhwBna2 = c9860bdZ.AhwBna();
                        mapKWHzl = C56423yEv.EZpvd(C56390yDp.OLrzqt(c28438kal, PositionComponentVewModel.calculatePnlMetrics$default(this.AEQbTJ, strValueOf2, strAhwBna2 == null ? "" : strAhwBna2, PnLFor.BalanceChange, c9860bdZ.EZpvd(), null, null, null, c9860bdZ.AEQbTJ(), WalletImportError.ERROR_CODE_AA_EXIST, null)));
                    }
                    positionComponentVewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(mapKWHzl, positionComponentVewModel$special$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Activity(Flow flow, PositionComponentVewModel positionComponentVewModel) {
            this.KWHzl = flow;
            this.copydefault = positionComponentVewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Map<C28438kal, ? extends TaskDescription>> flowCollector, Continuation continuation) {
            Object objCollect = this.KWHzl.collect(new AnonymousClass1(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @yCM
    public PositionComponentVewModel(@NotNull C28182kRy c28182kRy, @NotNull kKG kkg, @NotNull C30766lhO c30766lhO, @NotNull C28390kZq c28390kZq, @NotNull C28434kah c28434kah) {
        StateFlow<C9860bdZ> stateFlowStateIn;
        Intrinsics.checkNotNullParameter(c28182kRy, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c30766lhO, "");
        Intrinsics.checkNotNullParameter(c28390kZq, "");
        Intrinsics.checkNotNullParameter(c28434kah, "");
        this.gEmmrt = c28182kRy;
        this.ejfBZ = kkg;
        this.copydefault = c30766lhO;
        this.valueOf = c28434kah;
        this.AhwBna = new AdvancedAssetsFilter(false, (AdvancedAssetSort) null, false, 7, (DefaultConstructorMarker) null);
        MutableStateFlow<gQS> MutableStateFlow = StateFlowKt.MutableStateFlow(gQS.ActionBar.copydefault);
        this.EZpvd = MutableStateFlow;
        this.AkhnZx = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Set<C28438kal>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(yEE.copydefault());
        this.OLrzqt = MutableStateFlow2;
        StateFlow<Set<C28438kal>> stateFlowAsStateFlow = FlowKt.asStateFlow(MutableStateFlow2);
        this.fARcdN = stateFlowAsStateFlow;
        MutableStateFlow<Map<C28438kal, TaskDescription>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(C56424yEw.KWHzl());
        this.KWHzl = MutableStateFlow3;
        this.isConnected = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.AEQbTJ = MutableStateFlow4;
        this.DbNXlk = FlowKt.asStateFlow(MutableStateFlow4);
        Flow flowTransformLatest = FlowKt.transformLatest(stateFlowAsStateFlow, new PositionComponentVewModel$special$$inlined$flatMapLatest$1(null, this));
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        this.AuCTel = FlowKt.stateIn(flowTransformLatest, viewModelScope, SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), C56424yEw.KWHzl());
        if (C22416heu.ejfBZ()) {
            stateFlowStateIn = StateFlowKt.MutableStateFlow(new C9860bdZ(null, null, null, null, null, null, null, null, null, null, 1023, null));
        } else {
            stateFlowStateIn = FlowKt.stateIn(ReactiveFlowKt.asFlow(c28390kZq.copydefault()), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), new C9860bdZ(null, null, null, null, null, null, null, null, null, null, 1023, null));
        }
        this.fJNWhG = stateFlowStateIn;
        this.fIwbmz = FlowKt.stateIn(new Activity(stateFlowStateIn, this), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), C56424yEw.KWHzl());
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PnLFor {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ PnLFor[] $VALUES;
        public static final PnLFor PriceChange = new PnLFor("PriceChange", 0);
        public static final PnLFor PnLPush = new PnLFor("PnLPush", 1);
        public static final PnLFor BalanceChange = new PnLFor("BalanceChange", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ PnLFor[] $values() {
            return new PnLFor[]{PriceChange, PnLPush, BalanceChange};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<PnLFor> getEntries() {
            return $ENTRIES;
        }

        private PnLFor(String str, int i) {
        }

        static {
            PnLFor[] pnLForArr$values = $values();
            $VALUES = pnLForArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(pnLForArr$values);
        }

        public static PnLFor valueOf(String str) {
            return (PnLFor) Enum.valueOf(PnLFor.class, str);
        }

        public static PnLFor[] values() {
            return (PnLFor[]) $VALUES.clone();
        }
    }

    public static final class TaskDescription {
        public final String EZpvd;
        public final String KWHzl;
        public final String OLrzqt;
        public final String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = taskDescription.KWHzl;
            }
            if ((i & 4) != 0) {
                str3 = taskDescription.OLrzqt;
            }
            if ((i & 8) != 0) {
                str4 = taskDescription.EZpvd;
            }
            return taskDescription.AEQbTJ(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new TaskDescription(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd((Object) this.copydefault, (Object) taskDescription.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) taskDescription.KWHzl) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) taskDescription.OLrzqt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) taskDescription.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            int iHashCode2 = this.KWHzl.hashCode();
            int iHashCode3 = this.OLrzqt.hashCode();
            String str = this.EZpvd;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TradePnlMetrics(currencyAmount=" + this.copydefault + ", costAveragePrice=" + this.KWHzl + ", unrealizedGain=" + this.OLrzqt + ", unrealizedYield=" + this.EZpvd + ")";
        }

        public TaskDescription(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.copydefault = str;
            this.KWHzl = str2;
            this.OLrzqt = str3;
            this.EZpvd = str4;
        }
    }

    public final void EZpvd(@NotNull Set<C28438kal> set) {
        Intrinsics.checkNotNullParameter(set, "");
        this.OLrzqt.setValue(set);
    }

    public static final class StateListAnimator<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Double dAuCTel = C59443zhD.AuCTel(((C30765lhN) t2).OLrzqt());
            double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
            double dDoubleValue2 = dAuCTel != null ? dAuCTel.doubleValue() : 0.0d;
            Double dAuCTel2 = C59443zhD.AuCTel(((C30765lhN) t).OLrzqt());
            if (dAuCTel2 != null) {
                dDoubleValue = dAuCTel2.doubleValue();
            }
            return yET.KWHzl(Double.valueOf(dDoubleValue2), Double.valueOf(dDoubleValue));
        }
    }

    public final void gEmmrt() {
        if (C22416heu.ejfBZ()) {
            return;
        }
        Job job = this.values;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.KWHzl.setValue(C56424yEw.KWHzl());
        this.values = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PositionComponentVewModel$subscribeToPnlUpdates$1(this, null), 3, null);
    }

    public final void isConnected() {
        this.valueOf.KWHzl();
        Job job = this.values;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.values = null;
        this.KWHzl.setValue(C56424yEw.KWHzl());
    }

    public static /* synthetic */ TaskDescription calculatePnlMetrics$default(PositionComponentVewModel positionComponentVewModel, String str, String str2, PnLFor pnLFor, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        return positionComponentVewModel.AEQbTJ(str, str2, pnLFor, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7);
    }

    public final TaskDescription AEQbTJ(String str, String str2, PnLFor pnLFor, String str3, String str4, String str5, String str6, String str7) {
        List<C30765lhN> listEZpvd;
        Object next;
        String strMulS$default;
        String strAYXKKw;
        String strEZpvd;
        String strCopydefault;
        String strDjBIcL;
        try {
            gQS value = this.AkhnZx.getValue();
            gQS.Application application = value instanceof gQS.Application ? (gQS.Application) value : null;
            if (application != null && (listEZpvd = application.EZpvd()) != null) {
                Iterator<T> it = listEZpvd.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    C30765lhN c30765lhN = (C30765lhN) next;
                    if (Intrinsics.EZpvd((Object) c30765lhN.AEQbTJ(), (Object) str) && Intrinsics.EZpvd((Object) c30765lhN.gEmmrt(), (Object) str2)) {
                        break;
                    }
                }
                C30765lhN c30765lhN2 = (C30765lhN) next;
                if (c30765lhN2 != null) {
                    int[] iArr = Application.AEQbTJ;
                    int i = iArr[pnLFor.ordinal()];
                    if (i == 1) {
                        strMulS$default = C33129mqd.mulS$default(c30765lhN2.copydefault(), str4, null, null, null, 14, null);
                    } else if (i == 2) {
                        strMulS$default = str3 == null ? C33129mqd.mulS$default(str7, c30765lhN2.AYXKKw(), null, null, null, 14, null) : str3;
                    } else {
                        strMulS$default = c30765lhN2.OLrzqt();
                    }
                    if (iArr[pnLFor.ordinal()] == 1) {
                        strAYXKKw = str4 == null ? "0" : str4;
                    } else {
                        strAYXKKw = c30765lhN2.AYXKKw();
                    }
                    if (iArr[pnLFor.ordinal()] == 3) {
                        strEZpvd = str5 == null ? "0" : str5;
                    } else {
                        strEZpvd = c30765lhN2.EZpvd();
                    }
                    if (iArr[pnLFor.ordinal()] == 2) {
                        strCopydefault = str7 == null ? "0" : str7;
                    } else {
                        strCopydefault = c30765lhN2.copydefault();
                    }
                    if (iArr[pnLFor.ordinal()] == 3) {
                        strDjBIcL = str6 == null ? "0" : str6;
                    } else {
                        strDjBIcL = c30765lhN2.djBIcL();
                    }
                    if (C23313hvq.copydefault(strDjBIcL, "0")) {
                        strDjBIcL = null;
                    }
                    if (strDjBIcL == null) {
                        strDjBIcL = strCopydefault;
                    }
                    if (!C23313hvq.copydefault(strEZpvd, "0") && !C33129mqd.OLrzqt(strAYXKKw, "0")) {
                        String strDjBIcL2 = C23313hvq.djBIcL(strDjBIcL, strCopydefault);
                        return new TaskDescription(strMulS$default, strEZpvd, C33129mqd.mulS$default(strDjBIcL2, C33129mqd.subS$default(strAYXKKw, strEZpvd, null, null, null, 14, null), null, null, null, 14, null), (C33129mqd.AEQbTJ(strDjBIcL2, "0") && C33129mqd.AEQbTJ(strEZpvd, "0")) ? C33129mqd.subS$default(C33129mqd.divS$default(strAYXKKw, strEZpvd, null, null, null, 14, null), "1", null, null, null, 14, null) : null);
                    }
                    return new TaskDescription(strMulS$default, strEZpvd, "0", null);
                }
            }
            return new TaskDescription("0", str5 == null ? "0" : str5, "0", null);
        } catch (Exception e) {
            pUU.copydefault("PositionComponentVM", "Error calculating PnL metrics: " + e.getMessage());
            return new TaskDescription("0", "0", "0", null);
        }
    }

    public static /* synthetic */ void loadData$default(PositionComponentVewModel positionComponentVewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        positionComponentVewModel.KWHzl(z);
    }

    public final void KWHzl(boolean z) {
        copydefault(z);
    }

    public static /* synthetic */ void getMyPosition$default(PositionComponentVewModel positionComponentVewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        positionComponentVewModel.copydefault(z);
    }

    public final void copydefault(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PositionComponentVewModel$getMyPosition$1(z, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String fetchVPNInfo() {
        List<DexMultiTokenInfoBean> list;
        if (!this.AYXKKw || (list = this.djBIcL) == null || list.isEmpty()) {
            DefiChainInfo defiChainInfo = this.fetchVPNInfo;
            String chainId = defiChainInfo != null ? defiChainInfo.getChainId() : null;
            if (chainId != null) {
                return chainId;
            }
        }
        return "";
    }

    public static /* synthetic */ void saveAssetsFilter$default(PositionComponentVewModel positionComponentVewModel, AdvancedAssetsFilter advancedAssetsFilter, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        positionComponentVewModel.OLrzqt(advancedAssetsFilter, z);
    }

    public final void OLrzqt(@NotNull AdvancedAssetsFilter advancedAssetsFilter, boolean z) {
        Intrinsics.checkNotNullParameter(advancedAssetsFilter, "");
        this.AhwBna = advancedAssetsFilter;
        copydefault(z);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.trade.features.home.ui.cefi.data.AdvancedAssetsFilter.copy$default(com.okinc.business.trade.features.home.ui.cefi.data.AdvancedAssetsFilter, boolean, com.okinc.business.trade.features.home.ui.cefi.common.AdvancedAssetSort, boolean, int, java.lang.Object):com.okinc.business.trade.features.home.ui.cefi.data.AdvancedAssetsFilter */
    public final void djBIcL() {
        this.AhwBna = AdvancedAssetsFilter.copy$default(this.AhwBna, false, AdvancedAssetSort.DEFAULT, true, 1, null);
    }

    public final void EZpvd(DefiChainInfo defiChainInfo) {
        this.fetchVPNInfo = defiChainInfo;
        loadData$default(this, false, 1, null);
    }

    public final void EZpvd(boolean z) {
        if (this.AYXKKw == z) {
            return;
        }
        this.AYXKKw = z;
        loadData$default(this, false, 1, null);
    }

    public final void KWHzl(List<DexMultiTokenInfoBean> list) {
        List<DexMultiTokenInfoBean> listQfsBiF = list != null ? CollectionsKt___CollectionsKt.QfsBiF(list) : null;
        this.djBIcL = listQfsBiF;
        if (listQfsBiF == null) {
            return;
        }
        loadData$default(this, false, 1, null);
    }

    public final List<C30765lhN> AEQbTJ(List<C30765lhN> list) {
        List<DexMultiTokenInfoBean> list2;
        if (this.AhwBna.getSortBy() != AdvancedAssetSort.DEFAULT || (list2 = this.djBIcL) == null || list2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            C30765lhN c30765lhN = (C30765lhN) obj;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (DexMultiTokenInfoBean dexMultiTokenInfoBean : list2) {
                    if (C59449zhJ.gEmmrt(c30765lhN.gEmmrt(), dexMultiTokenInfoBean.getTokenContractAddress(), true) && Intrinsics.EZpvd((Object) c30765lhN.AEQbTJ(), (Object) dexMultiTokenInfoBean.getChainId())) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
            arrayList2.add(obj);
        }
        Pair pair = new Pair(arrayList, arrayList2);
        return CollectionsKt___CollectionsKt.djBIcL((Collection) CollectionsKt___CollectionsKt.EZpvd((List) pair.component1(), new StateListAnimator()), (Iterable) pair.component2());
    }
}
