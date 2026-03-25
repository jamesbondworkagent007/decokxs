package o;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.market.fragment.watchlist.WatchListViewModel$1;
import com.okinc.business.market.market.fragment.watchlist.WatchListViewModel$2;
import com.okinc.business.market.market.fragment.watchlist.WatchListViewModel$_uiState$1;
import com.okinc.business.market.market.fragment.watchlist.WatchListViewModel$arrayFilter_delegate$lambda$4$$inlined$combine$1$3;
import com.okinc.business.market.market.fragment.watchlist.WatchListViewModel$innerFilter$$inlined$map$1$2$1;
import com.okinc.business.market.market.fragment.watchlist.WatchListViewModel$selectType$1;
import com.okinc.business.market.market.fragment.watchlist.WatchListViewModel$special$$inlined$map$1$2$1;
import com.okinc.tradeapi.bean.MarketDataSource;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.CombineKt;
import o.AbstractC27554jxQ;
import o.C27869kGi;
import o.C27947kJf;
import o.InterfaceC49371unL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kJf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27947kJf extends AbstractC49411unz<Activity> {
    public final Flow<ActionBar> AEQbTJ;
    public final MutableStateFlow<java.lang.Long> AYXKKw;
    public final Flow<java.lang.Boolean> AhwBna;
    public final MutableStateFlow<ActionBar> AkhnZx;
    public final MutableStateFlow<kotlin.Pair<java.lang.Integer, java.lang.String>> EZpvd;
    public final MutableSharedFlow<TaskDescription> KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public Function1<? super kotlin.Pair<CoinQuote, ? extends MarketDataSource>, java.lang.Boolean> copydefault;
    public final kIR djBIcL;
    public WeakReference<AbstractC27554jxQ.ActionBar> fetchVPNInfo;
    public boolean gEmmrt;
    public final Flow<kotlin.Pair<java.lang.Integer, java.lang.String>> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super kotlin.Pair<com.okinc.business.market.bean.CoinQuote, ? extends com.okinc.tradeapi.bean.MarketDataSource>, java.lang.Boolean>, kotlin.jvm.functions.Function1<kotlin.Pair<com.okinc.business.market.bean.CoinQuote, ? extends com.okinc.tradeapi.bean.MarketDataSource>, java.lang.Boolean> */
    public final Function1<kotlin.Pair<CoinQuote, ? extends MarketDataSource>, java.lang.Boolean> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<ActionBar> copydefault() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.app.Application)
  (r2v0 o.kIR)
  (wrap:o.jxQ$ActionBar:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.jxQ$ActionBar) : (r3v0 o.jxQ$ActionBar))
 A[MD:(android.app.Application, o.kIR, o.jxQ$ActionBar):void (m)] (LINE:33) call: o.kJf.<init>(android.app.Application, o.kIR, o.jxQ$ActionBar):void type: THIS */
    public /* synthetic */ C27947kJf(android.app.Application application, kIR kir, AbstractC27554jxQ.ActionBar actionBar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, kir, (i & 4) != 0 ? null : actionBar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27947kJf(@NotNull android.app.Application application, @NotNull kIR kir, AbstractC27554jxQ.ActionBar actionBar) {
        super(new Activity(null, 1, 0 == true ? 1 : 0));
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(kir, "");
        this.djBIcL = kir;
        MutableStateFlow<kotlin.Pair<java.lang.Integer, java.lang.String>> MutableStateFlow = StateFlowKt.MutableStateFlow(new kotlin.Pair(0, "ANY"));
        this.EZpvd = MutableStateFlow;
        Dialog dialog = new Dialog(kir.copydefault());
        this.AhwBna = dialog;
        this.KWHzl = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AYXKKw = StateFlowKt.MutableStateFlow(0L);
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.kJg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27947kJf.OLrzqt(this.KWHzl);
            }
        });
        Flow<kotlin.Pair<java.lang.Integer, java.lang.String>> flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.flowCombine(MutableStateFlow, EZpvd(), new WatchListViewModel$selectType$1(null)));
        this.valueOf = flowDistinctUntilChanged;
        this.AEQbTJ = FlowKt.combine(dialog, flowDistinctUntilChanged, kir.copydefault(), EZpvd(), new WatchListViewModel$_uiState$1(null));
        this.AkhnZx = StateFlowKt.MutableStateFlow(new ActionBar(false, -1, yDY.AhwBna(), yDY.AhwBna()));
        this.fetchVPNInfo = new WeakReference<>(actionBar);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WatchListViewModel$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WatchListViewModel$2(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.kJf$Application */
    public static final class Application implements Flow<java.util.List<? extends kotlin.Pair<? extends CoinQuote, ? extends MarketDataSource>>> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ C27947kJf KWHzl;

        /* JADX INFO: renamed from: o.kJf$Application$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ C27947kJf KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector, C27947kJf c27947kJf) {
                this.AEQbTJ = flowCollector;
                this.KWHzl = c27947kJf;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                WatchListViewModel$innerFilter$$inlined$map$1$2$1 watchListViewModel$innerFilter$$inlined$map$1$2$1;
                java.util.ArrayList arrayList;
                if (continuation instanceof WatchListViewModel$innerFilter$$inlined$map$1$2$1) {
                    watchListViewModel$innerFilter$$inlined$map$1$2$1 = (WatchListViewModel$innerFilter$$inlined$map$1$2$1) continuation;
                    int i = watchListViewModel$innerFilter$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        watchListViewModel$innerFilter$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        watchListViewModel$innerFilter$$inlined$map$1$2$1 = new WatchListViewModel$innerFilter$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = watchListViewModel$innerFilter$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = watchListViewModel$innerFilter$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    java.util.List list = (java.util.List) obj;
                    if (list != null) {
                        arrayList = new java.util.ArrayList();
                        for (T t : list) {
                            kotlin.Pair<CoinQuote, ? extends MarketDataSource> pair = (kotlin.Pair) t;
                            Function1<kotlin.Pair<CoinQuote, ? extends MarketDataSource>, java.lang.Boolean> function1AEQbTJ = this.KWHzl.AEQbTJ();
                            if (function1AEQbTJ == null || function1AEQbTJ.invoke(pair).booleanValue()) {
                                arrayList.add(t);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    watchListViewModel$innerFilter$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(arrayList, watchListViewModel$innerFilter$$inlined$map$1$2$1) == objCopydefault) {
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

        public Application(Flow flow, C27947kJf c27947kJf) {
            this.AEQbTJ = flow;
            this.KWHzl = c27947kJf;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends kotlin.Pair<? extends CoinQuote, ? extends MarketDataSource>>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass1(flowCollector, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kJf$Dialog */
    public static final class Dialog implements Flow<java.lang.Boolean> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.kJf$Dialog$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                WatchListViewModel$special$$inlined$map$1$2$1 watchListViewModel$special$$inlined$map$1$2$1;
                if (continuation instanceof WatchListViewModel$special$$inlined$map$1$2$1) {
                    watchListViewModel$special$$inlined$map$1$2$1 = (WatchListViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = watchListViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        watchListViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        watchListViewModel$special$$inlined$map$1$2$1 = new WatchListViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = watchListViewModel$special$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = watchListViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.util.List list = (java.util.List) obj;
                    java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(list != null && list.isEmpty());
                    watchListViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(boolKWHzl, watchListViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
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

        public Dialog(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.lang.Boolean> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final Flow<java.util.ArrayList<C27869kGi.ActionBar>> EZpvd() {
        return (Flow) this.OLrzqt.getValue();
    }

    public static final Flow OLrzqt(C27947kJf c27947kJf) {
        return FlowKt.distinctUntilChanged(new StateListAnimator(new Flow[]{c27947kJf.KWHzl(c27947kJf.djBIcL.OLrzqt()), c27947kJf.KWHzl(c27947kJf.djBIcL.gEmmrt()), c27947kJf.KWHzl(c27947kJf.djBIcL.djBIcL()), c27947kJf.KWHzl(c27947kJf.djBIcL.AYXKKw()), c27947kJf.KWHzl(c27947kJf.djBIcL.AEQbTJ()), c27947kJf.KWHzl(c27947kJf.djBIcL.EZpvd())}));
    }

    /* JADX INFO: renamed from: o.kJf$StateListAnimator */
    public static final class StateListAnimator implements Flow<java.util.ArrayList<C27869kGi.ActionBar>> {
        public final /* synthetic */ Flow[] copydefault;

        public StateListAnimator(Flow[] flowArr) {
            this.copydefault = flowArr;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.ArrayList<C27869kGi.ActionBar>> flowCollector, Continuation continuation) {
            final Flow[] flowArr = this.copydefault;
            java.lang.Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new Function0<java.util.List<? extends kotlin.Pair<? extends CoinQuote, ? extends MarketDataSource>>[]>() { // from class: o.kJf.StateListAnimator.3
                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                public final java.util.List<? extends kotlin.Pair<? extends CoinQuote, ? extends MarketDataSource>>[] invoke() {
                    return new java.util.List[flowArr.length];
                }
            }, new WatchListViewModel$arrayFilter_delegate$lambda$4$$inlined$combine$1$3(null), continuation);
            return objCombineInternal == C56442yFn.copydefault() ? objCombineInternal : Unit.INSTANCE;
        }
    }

    public final void EZpvd(AbstractC27554jxQ.ActionBar actionBar) {
        this.fetchVPNInfo = new WeakReference<>(actionBar);
    }

    public final AbstractC27554jxQ.ActionBar KWHzl() {
        WeakReference<AbstractC27554jxQ.ActionBar> weakReference = this.fetchVPNInfo;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: o.kJf$ActionBar */
    public static final class ActionBar {
        public final boolean AEQbTJ;
        public final java.util.List<C27869kGi.ActionBar> EZpvd;
        public final java.util.List<CoinQuote> KWHzl;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kJf$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, boolean z, int i, java.util.List list, java.util.List list2, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                z = actionBar.AEQbTJ;
            }
            if ((i2 & 2) != 0) {
                i = actionBar.copydefault;
            }
            if ((i2 & 4) != 0) {
                list = actionBar.KWHzl;
            }
            if ((i2 & 8) != 0) {
                list2 = actionBar.EZpvd;
            }
            return actionBar.AEQbTJ(z, i, list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<CoinQuote> AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(boolean z, int i, java.util.List<CoinQuote> list, @NotNull java.util.List<C27869kGi.ActionBar> list2) {
            Intrinsics.checkNotNullParameter(list2, "");
            return new ActionBar(z, i, list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C27869kGi.ActionBar> OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return this.AEQbTJ == actionBar.AEQbTJ && this.copydefault == actionBar.copydefault && Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl) && Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Boolean.hashCode(this.AEQbTJ);
            int iHashCode2 = java.lang.Integer.hashCode(this.copydefault);
            java.util.List<CoinQuote> list = this.KWHzl;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UIState(showRecommend=" + this.AEQbTJ + ", selectTypeIndex=" + this.copydefault + ", data=" + this.KWHzl + ", arrayFilter=" + this.EZpvd + ")";
        }

        public ActionBar(boolean z, int i, java.util.List<CoinQuote> list, @NotNull java.util.List<C27869kGi.ActionBar> list2) {
            Intrinsics.checkNotNullParameter(list2, "");
            this.AEQbTJ = z;
            this.copydefault = i;
            this.KWHzl = list;
            this.EZpvd = list2;
        }
    }

    /* JADX INFO: renamed from: o.kJf$TaskDescription */
    public static abstract class TaskDescription {

        /* JADX INFO: renamed from: o.kJf$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class C0867TaskDescription extends TaskDescription {
            public final java.lang.String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String KWHzl() {
                return this.KWHzl;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kJf.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.kJf$TaskDescription$Activity */
        public static final class Activity extends TaskDescription {
            public final java.lang.String AEQbTJ;
            public final int KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int EZpvd() {
                return this.KWHzl;
            }

            public Activity(int i, java.lang.String str) {
                super(null);
                this.KWHzl = i;
                this.AEQbTJ = str;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(int, java.lang.String):void (m)] (LINE:174) call: o.kJf.TaskDescription.Activity.<init>(int, java.lang.String):void type: THIS */
            public /* synthetic */ Activity(int i, java.lang.String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, (i2 & 2) != 0 ? null : str);
            }
        }

        private TaskDescription() {
        }

        /* JADX INFO: renamed from: o.kJf$TaskDescription$ActionBar */
        public static final class ActionBar extends TaskDescription {
            public final java.util.List<MarketDataSource> EZpvd;
            public final java.util.List<CoinQuote> copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.util.List<MarketDataSource> KWHzl() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.util.List<CoinQuote> copydefault() {
                return this.copydefault;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.okinc.tradeapi.bean.MarketDataSource> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public ActionBar(java.util.List<CoinQuote> list, @NotNull java.util.List<? extends MarketDataSource> list2) {
                super(null);
                Intrinsics.checkNotNullParameter(list2, "");
                this.copydefault = list;
                this.EZpvd = list2;
            }
        }

        /* JADX INFO: renamed from: o.kJf$TaskDescription$StateListAnimator */
        public static final class StateListAnimator extends TaskDescription {
            public static final StateListAnimator EZpvd = new StateListAnimator();

            private StateListAnimator() {
                super(null);
            }
        }
    }

    public final java.lang.Object copydefault(@NotNull TaskDescription taskDescription, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objEmit = this.KWHzl.emit(taskDescription, continuation);
        return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
    }

    public final java.lang.Object AEQbTJ(TaskDescription taskDescription, Continuation<? super Unit> continuation) {
        java.lang.String strEZpvd;
        C27869kGi.ActionBar actionBar;
        if (taskDescription instanceof TaskDescription.Activity) {
            java.util.List<C27869kGi.ActionBar> listOLrzqt = this.AkhnZx.getValue().OLrzqt();
            TaskDescription.Activity activity = (TaskDescription.Activity) taskDescription;
            if (listOLrzqt.size() <= activity.EZpvd()) {
                listOLrzqt = null;
            }
            if (listOLrzqt == null || (actionBar = listOLrzqt.get(activity.EZpvd())) == null || (strEZpvd = actionBar.EZpvd()) == null) {
                strEZpvd = "";
            }
            java.lang.Object objEmit = this.EZpvd.emit(new kotlin.Pair<>(C56443yFo.AEQbTJ(activity.EZpvd()), strEZpvd), continuation);
            return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
        }
        if (taskDescription instanceof TaskDescription.StateListAnimator) {
            MutableStateFlow<java.lang.Long> mutableStateFlow = this.AYXKKw;
            java.lang.Object objEmit2 = mutableStateFlow.emit(C56443yFo.KWHzl(mutableStateFlow.getValue().longValue() + 1), continuation);
            return objEmit2 == C56442yFn.copydefault() ? objEmit2 : Unit.INSTANCE;
        }
        if (!(taskDescription instanceof TaskDescription.C0867TaskDescription)) {
            if (!(taskDescription instanceof TaskDescription.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            this.gEmmrt = true;
            TaskDescription.ActionBar actionBar2 = (TaskDescription.ActionBar) taskDescription;
            if (actionBar2.copydefault() != null) {
                java.lang.Object objKWHzl = this.djBIcL.KWHzl(actionBar2.copydefault(), actionBar2.KWHzl(), continuation);
                return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
            }
            java.lang.Object objCopydefault = this.djBIcL.copydefault(actionBar2.KWHzl(), continuation);
            return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
        }
        this.djBIcL.KWHzl(((TaskDescription.C0867TaskDescription) taskDescription).KWHzl());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.kJf$Activity */
    public static final class Activity extends AbstractC49408unw<Activity> {
        public InterfaceC49371unL<ActionBar> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kJf$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, InterfaceC49371unL interfaceC49371unL, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                interfaceC49371unL = activity.KWHzl;
            }
            return activity.AEQbTJ((InterfaceC49371unL<ActionBar>) interfaceC49371unL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(@NotNull InterfaceC49371unL<ActionBar> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            return new Activity(interfaceC49371unL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC49371unL<ActionBar> EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull InterfaceC49371unL<ActionBar> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.KWHzl = interfaceC49371unL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd(this.KWHzl, ((Activity) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "WatchTabUiState(tabUIState=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:o.unL:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0007: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:208) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r1v0 o.unL))
 A[MD:(o.unL<o.kJf$ActionBar>):void (m)] (LINE:207) call: o.kJf.Activity.<init>(o.unL):void type: THIS */
        public /* synthetic */ Activity(InterfaceC49371unL interfaceC49371unL, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull InterfaceC49371unL<ActionBar> interfaceC49371unL) {
            super(new Function1() { // from class: o.kJj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C27947kJf.Activity.AEQbTJ((C27947kJf.Activity) obj);
                }
            });
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.KWHzl = interfaceC49371unL;
        }

        public static final Activity AEQbTJ(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            return copy$default(activity, null, 1, null);
        }
    }

    public final Flow<java.util.List<kotlin.Pair<CoinQuote, MarketDataSource>>> KWHzl(Flow<? extends java.util.List<? extends kotlin.Pair<CoinQuote, ? extends MarketDataSource>>> flow) {
        return new Application(flow, this);
    }
}
