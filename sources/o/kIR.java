package o;

import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.market.fragment.watchlist.WatchListReo$data$1;
import com.okinc.business.market.market.fragment.watchlist.WatchListReo$special$$inlined$map$1$2$1;
import com.okinc.business.market.market.fragment.watchlist.WatchListReo$special$$inlined$map$2$2$1;
import com.okinc.business.market.market.fragment.watchlist.WatchListReo$special$$inlined$map$3$2$1;
import com.okinc.business.market.market.fragment.watchlist.WatchListReo$special$$inlined$map$4$2$1;
import com.okinc.business.market.market.fragment.watchlist.WatchListReo$special$$inlined$map$5$2$1;
import com.okinc.business.market.market.fragment.watchlist.WatchListReo$special$$inlined$map$6$2$1;
import com.okinc.tradeapi.bean.MarketDataSource;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kIR {
    public xTS AEQbTJ;
    public final Flow<java.util.List<kotlin.Pair<CoinQuote, MarketDataSource>>> AYXKKw;
    public final Flow<java.util.List<kotlin.Pair<CoinQuote, MarketDataSource>>> AhwBna;
    public final Flow<java.util.List<kotlin.Pair<CoinQuote, MarketDataSource>>> EZpvd;
    public final MutableStateFlow<java.lang.String> KWHzl;
    public final Flow<java.util.List<kotlin.Pair<CoinQuote, MarketDataSource>>> OLrzqt;
    public final MutableStateFlow<java.util.List<kotlin.Pair<CoinQuote, MarketDataSource>>> copydefault;
    public boolean djBIcL;
    public java.util.List<? extends MarketDataSource> gEmmrt;
    public final Flow<java.util.List<kotlin.Pair<CoinQuote, MarketDataSource>>> isConnected;
    public final Flow<java.util.List<kotlin.Pair<CoinQuote, MarketDataSource>>> valueOf;
    public final Flow<java.util.List<kotlin.Pair<CoinQuote, MarketDataSource>>> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<java.util.List<kotlin.Pair<CoinQuote, MarketDataSource>>> AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<java.util.List<kotlin.Pair<CoinQuote, MarketDataSource>>> AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<java.util.List<kotlin.Pair<CoinQuote, MarketDataSource>>> EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(xTS xts) {
        this.AEQbTJ = xts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xTS KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<java.util.List<kotlin.Pair<CoinQuote, MarketDataSource>>> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<java.util.List<kotlin.Pair<CoinQuote, MarketDataSource>>> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<java.util.List<kotlin.Pair<CoinQuote, MarketDataSource>>> djBIcL() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<java.util.List<kotlin.Pair<CoinQuote, MarketDataSource>>> gEmmrt() {
        return this.isConnected;
    }

    public kIR() {
        MutableStateFlow<java.util.List<kotlin.Pair<CoinQuote, MarketDataSource>>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow;
        MutableStateFlow<java.lang.String> MutableStateFlow2 = StateFlowKt.MutableStateFlow("");
        this.KWHzl = MutableStateFlow2;
        this.djBIcL = true;
        Flow<java.util.List<kotlin.Pair<CoinQuote, MarketDataSource>>> flowConflate = FlowKt.conflate(FlowKt.flowOn(FlowKt.flowCombine(MutableStateFlow, MutableStateFlow2, new WatchListReo$data$1(this, null)), Dispatchers.getDefault()));
        this.OLrzqt = flowConflate;
        this.EZpvd = new ActionBar(flowConflate);
        this.isConnected = new StateListAnimator(flowConflate);
        this.values = new TaskDescription(flowConflate);
        this.AYXKKw = new Activity(flowConflate);
        this.valueOf = new Application(flowConflate);
        this.AhwBna = new FragmentManager(flowConflate);
    }

    public static final class ActionBar implements Flow<java.util.List<? extends kotlin.Pair<? extends CoinQuote, ? extends MarketDataSource>>> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: o.kIR$ActionBar$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                WatchListReo$special$$inlined$map$1$2$1 watchListReo$special$$inlined$map$1$2$1;
                java.util.ArrayList arrayList;
                if (continuation instanceof WatchListReo$special$$inlined$map$1$2$1) {
                    watchListReo$special$$inlined$map$1$2$1 = (WatchListReo$special$$inlined$map$1$2$1) continuation;
                    int i = watchListReo$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        watchListReo$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        watchListReo$special$$inlined$map$1$2$1 = new WatchListReo$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = watchListReo$special$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = watchListReo$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    java.util.List list = (java.util.List) obj;
                    if (list != null) {
                        arrayList = new java.util.ArrayList();
                        for (T t : list) {
                            if (Intrinsics.EZpvd((java.lang.Object) ((MarketDataSource) ((kotlin.Pair) t).getSecond()).getInstType(), (java.lang.Object) "COIN")) {
                                arrayList.add(t);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    watchListReo$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(arrayList, watchListReo$special$$inlined$map$1$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow) {
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends kotlin.Pair<? extends CoinQuote, ? extends MarketDataSource>>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class Activity implements Flow<java.util.List<? extends kotlin.Pair<? extends CoinQuote, ? extends MarketDataSource>>> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.kIR$Activity$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                WatchListReo$special$$inlined$map$4$2$1 watchListReo$special$$inlined$map$4$2$1;
                if (continuation instanceof WatchListReo$special$$inlined$map$4$2$1) {
                    watchListReo$special$$inlined$map$4$2$1 = (WatchListReo$special$$inlined$map$4$2$1) continuation;
                    int i = watchListReo$special$$inlined$map$4$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        watchListReo$special$$inlined$map$4$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        watchListReo$special$$inlined$map$4$2$1 = new WatchListReo$special$$inlined$map$4$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = watchListReo$special$$inlined$map$4$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = watchListReo$special$$inlined$map$4$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.util.List listAhwBna = yDY.AhwBna();
                    watchListReo$special$$inlined$map$4$2$1.label = 1;
                    if (flowCollector.emit(listAhwBna, watchListReo$special$$inlined$map$4$2$1) == objCopydefault) {
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

        public Activity(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends kotlin.Pair<? extends CoinQuote, ? extends MarketDataSource>>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class Application implements Flow<java.util.List<? extends kotlin.Pair<? extends CoinQuote, ? extends MarketDataSource>>> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: o.kIR$Application$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.AEQbTJ = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                WatchListReo$special$$inlined$map$5$2$1 watchListReo$special$$inlined$map$5$2$1;
                java.util.ArrayList arrayList;
                if (continuation instanceof WatchListReo$special$$inlined$map$5$2$1) {
                    watchListReo$special$$inlined$map$5$2$1 = (WatchListReo$special$$inlined$map$5$2$1) continuation;
                    int i = watchListReo$special$$inlined$map$5$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        watchListReo$special$$inlined$map$5$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        watchListReo$special$$inlined$map$5$2$1 = new WatchListReo$special$$inlined$map$5$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = watchListReo$special$$inlined$map$5$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = watchListReo$special$$inlined$map$5$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    java.util.List list = (java.util.List) obj;
                    if (list != null) {
                        arrayList = new java.util.ArrayList();
                        for (T t : list) {
                            if (Intrinsics.EZpvd((java.lang.Object) ((MarketDataSource) ((kotlin.Pair) t).getSecond()).getInstType(), (java.lang.Object) "MARGIN")) {
                                arrayList.add(t);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    watchListReo$special$$inlined$map$5$2$1.label = 1;
                    if (flowCollector.emit(arrayList, watchListReo$special$$inlined$map$5$2$1) == objCopydefault) {
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

        public Application(Flow flow) {
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends kotlin.Pair<? extends CoinQuote, ? extends MarketDataSource>>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class FragmentManager implements Flow<java.util.List<? extends kotlin.Pair<? extends CoinQuote, ? extends MarketDataSource>>> {
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: o.kIR$FragmentManager$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.AEQbTJ = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                WatchListReo$special$$inlined$map$6$2$1 watchListReo$special$$inlined$map$6$2$1;
                java.util.ArrayList arrayList;
                if (continuation instanceof WatchListReo$special$$inlined$map$6$2$1) {
                    watchListReo$special$$inlined$map$6$2$1 = (WatchListReo$special$$inlined$map$6$2$1) continuation;
                    int i = watchListReo$special$$inlined$map$6$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        watchListReo$special$$inlined$map$6$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        watchListReo$special$$inlined$map$6$2$1 = new WatchListReo$special$$inlined$map$6$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = watchListReo$special$$inlined$map$6$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = watchListReo$special$$inlined$map$6$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    java.util.List list = (java.util.List) obj;
                    if (list != null) {
                        arrayList = new java.util.ArrayList();
                        for (T t : list) {
                            if (Intrinsics.EZpvd((java.lang.Object) ((MarketDataSource) ((kotlin.Pair) t).getSecond()).getInstType(), (java.lang.Object) "OPTION")) {
                                arrayList.add(t);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    watchListReo$special$$inlined$map$6$2$1.label = 1;
                    if (flowCollector.emit(arrayList, watchListReo$special$$inlined$map$6$2$1) == objCopydefault) {
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

        public FragmentManager(Flow flow) {
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends kotlin.Pair<? extends CoinQuote, ? extends MarketDataSource>>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class StateListAnimator implements Flow<java.util.List<? extends kotlin.Pair<? extends CoinQuote, ? extends MarketDataSource>>> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: o.kIR$StateListAnimator$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                WatchListReo$special$$inlined$map$2$2$1 watchListReo$special$$inlined$map$2$2$1;
                java.util.ArrayList arrayList;
                if (continuation instanceof WatchListReo$special$$inlined$map$2$2$1) {
                    watchListReo$special$$inlined$map$2$2$1 = (WatchListReo$special$$inlined$map$2$2$1) continuation;
                    int i = watchListReo$special$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        watchListReo$special$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        watchListReo$special$$inlined$map$2$2$1 = new WatchListReo$special$$inlined$map$2$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = watchListReo$special$$inlined$map$2$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = watchListReo$special$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.util.List list = (java.util.List) obj;
                    if (list != null) {
                        arrayList = new java.util.ArrayList();
                        for (T t : list) {
                            if (Intrinsics.EZpvd((java.lang.Object) ((MarketDataSource) ((kotlin.Pair) t).getSecond()).getInstType(), (java.lang.Object) "SPOT")) {
                                arrayList.add(t);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    watchListReo$special$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(arrayList, watchListReo$special$$inlined$map$2$2$1) == objCopydefault) {
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

        public StateListAnimator(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends kotlin.Pair<? extends CoinQuote, ? extends MarketDataSource>>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class TaskDescription implements Flow<java.util.List<? extends kotlin.Pair<? extends CoinQuote, ? extends MarketDataSource>>> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.kIR$TaskDescription$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                WatchListReo$special$$inlined$map$3$2$1 watchListReo$special$$inlined$map$3$2$1;
                java.util.ArrayList arrayList;
                if (continuation instanceof WatchListReo$special$$inlined$map$3$2$1) {
                    watchListReo$special$$inlined$map$3$2$1 = (WatchListReo$special$$inlined$map$3$2$1) continuation;
                    int i = watchListReo$special$$inlined$map$3$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        watchListReo$special$$inlined$map$3$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        watchListReo$special$$inlined$map$3$2$1 = new WatchListReo$special$$inlined$map$3$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = watchListReo$special$$inlined$map$3$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = watchListReo$special$$inlined$map$3$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.util.List list = (java.util.List) obj;
                    if (list != null) {
                        arrayList = new java.util.ArrayList();
                        for (T t : list) {
                            kotlin.Pair pair = (kotlin.Pair) t;
                            if (Intrinsics.EZpvd((java.lang.Object) ((MarketDataSource) pair.getSecond()).getInstType(), (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) ((MarketDataSource) pair.getSecond()).getInstType(), (java.lang.Object) "FUTURES")) {
                                arrayList.add(t);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    watchListReo$special$$inlined$map$3$2$1.label = 1;
                    if (flowCollector.emit(arrayList, watchListReo$special$$inlined$map$3$2$1) == objCopydefault) {
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
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends kotlin.Pair<? extends CoinQuote, ? extends MarketDataSource>>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final java.lang.Object KWHzl(@NotNull java.util.List<CoinQuote> list, @NotNull java.util.List<? extends MarketDataSource> list2, @NotNull Continuation<? super Unit> continuation) {
        java.util.ArrayList arrayList;
        int iValueOf = C56548yJl.valueOf(list.size(), list2.size());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i = 0; i < iValueOf; i++) {
            arrayList2.add(new kotlin.Pair(list.get(i), list2.get(i)));
        }
        java.util.List<kotlin.Pair<CoinQuote, MarketDataSource>> value = this.copydefault.getValue();
        if (value != null) {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(value, 10));
            java.util.Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                arrayList.add((MarketDataSource) ((kotlin.Pair) it.next()).getSecond());
            }
        } else {
            arrayList = null;
        }
        this.djBIcL = !copydefault(list2, arrayList);
        this.copydefault.setValue(arrayList2);
        return Unit.INSTANCE;
    }

    public final java.lang.Object copydefault(@NotNull java.util.List<? extends MarketDataSource> list, @NotNull Continuation<? super Unit> continuation) {
        java.util.ArrayList arrayList;
        java.util.List<kotlin.Pair<CoinQuote, MarketDataSource>> value = this.copydefault.getValue();
        if (value != null) {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(value, 10));
            java.util.Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                arrayList.add((MarketDataSource) ((kotlin.Pair) it.next()).getSecond());
            }
        } else {
            arrayList = null;
        }
        this.djBIcL = !copydefault(list, arrayList);
        MutableStateFlow<java.util.List<kotlin.Pair<CoinQuote, MarketDataSource>>> mutableStateFlow = this.copydefault;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(C56390yDp.OLrzqt(C27619jyc.OLrzqt(), (MarketDataSource) it2.next()));
        }
        mutableStateFlow.setValue(arrayList2);
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.setValue(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [158=4, 111=4] */
    public final boolean copydefault(java.util.List<? extends MarketDataSource> list, java.util.List<? extends MarketDataSource> list2) {
        java.util.Set setOqFWZa;
        java.util.Set setOqFWZa2 = null;
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (MarketDataSource marketDataSource : list) {
                arrayList.add(C56390yDp.OLrzqt(marketDataSource.getInstId(), marketDataSource.getInstType()));
            }
            setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
        } else {
            setOqFWZa = null;
        }
        if (list2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
            for (MarketDataSource marketDataSource2 : list2) {
                arrayList2.add(C56390yDp.OLrzqt(marketDataSource2.getInstId(), marketDataSource2.getInstType()));
            }
            setOqFWZa2 = CollectionsKt___CollectionsKt.OqFWZa(arrayList2);
        }
        return Intrinsics.EZpvd(setOqFWZa, setOqFWZa2);
    }
}
