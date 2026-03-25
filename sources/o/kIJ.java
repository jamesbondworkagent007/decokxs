package o;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.market.fragment.watchlist.WatchListChildViewModel$1;
import com.okinc.business.market.market.fragment.watchlist.WatchListChildViewModel$2;
import com.okinc.business.market.market.fragment.watchlist.WatchListChildViewModel$bizFilterType$1;
import com.okinc.business.market.market.fragment.watchlist.WatchListChildViewModel$chooseUserBizType$1;
import com.okinc.business.market.market.fragment.watchlist.WatchListChildViewModel$data$1;
import com.okinc.business.market.market.fragment.watchlist.WatchListChildViewModel$data$2;
import com.okinc.business.market.market.fragment.watchlist.WatchListChildViewModel$data$3;
import com.okinc.business.market.market.fragment.watchlist.WatchListChildViewModel$data$4;
import com.okinc.business.market.market.fragment.watchlist.WatchListChildViewModel$data$5;
import com.okinc.business.market.market.fragment.watchlist.WatchListChildViewModel$data$6;
import com.okinc.business.market.market.fragment.watchlist.WatchListChildViewModel$data$7;
import com.okinc.business.market.market.fragment.watchlist.WatchListChildViewModel$data$8;
import com.okinc.business.market.market.fragment.watchlist.WatchListChildViewModel$data$9;
import com.okinc.business.market.market.fragment.watchlist.WatchListChildViewModel$special$$inlined$map$1$2$1;
import com.okinc.core.widget.SortTextView;
import com.okinc.tradeapi.bean.MarketDataSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C27985kKq;
import o.C46732tci;
import o.InterfaceC49371unL;
import o.kIJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kIJ extends AbstractC49411unz<StateListAnimator> {
    public java.lang.String AEQbTJ;
    public final kIR AYXKKw;
    public final MutableStateFlow<java.lang.String> AhwBna;
    public final Flow<java.util.List<kotlin.Pair<CoinQuote, MarketDataSource>>> EZpvd;
    public final Flow<java.util.ArrayList<kotlin.Pair<CoinQuote, MarketDataSource>>> KWHzl;
    public java.lang.String OLrzqt;
    public Function1<? super kotlin.Pair<CoinQuote, ? extends MarketDataSource>, java.lang.Boolean> copydefault;
    public final java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super kotlin.Pair<com.okinc.business.market.bean.CoinQuote, ? extends com.okinc.tradeapi.bean.MarketDataSource>, java.lang.Boolean>, kotlin.jvm.functions.Function1<kotlin.Pair<com.okinc.business.market.bean.CoinQuote, ? extends com.okinc.tradeapi.bean.MarketDataSource>, java.lang.Boolean> */
    public final Function1<kotlin.Pair<CoinQuote, ? extends MarketDataSource>, java.lang.Boolean> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<java.util.List<kotlin.Pair<CoinQuote, MarketDataSource>>> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<java.util.ArrayList<kotlin.Pair<CoinQuote, MarketDataSource>>> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<java.lang.String> gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [47=8] */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kIJ(@NotNull android.app.Application application, @NotNull java.lang.String str, @NotNull kIR kir) {
        Flow flowFlowCombine;
        super(new StateListAnimator(new InterfaceC49371unL.ActionBar(null, 1, null), "", ""));
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(kir, "");
        this.djBIcL = str;
        this.AYXKKw = kir;
        this.AEQbTJ = "";
        MutableStateFlow<java.lang.String> MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this.AhwBna = MutableStateFlow;
        switch (str.hashCode()) {
            case -2027980370:
                flowFlowCombine = !str.equals("MARGIN") ? FlowKt.flowCombine(kir.copydefault(), MutableStateFlow, new WatchListChildViewModel$data$9(null)) : FlowKt.flowCombine(kir.AEQbTJ(), MutableStateFlow, new WatchListChildViewModel$data$5(null));
                break;
            case -1956807563:
                if (str.equals("OPTION")) {
                    flowFlowCombine = FlowKt.flowCombine(kir.EZpvd(), MutableStateFlow, new WatchListChildViewModel$data$7(null));
                    break;
                }
                break;
            case 64972:
                if (str.equals("ANY")) {
                    flowFlowCombine = FlowKt.flowCombine(kir.copydefault(), MutableStateFlow, new WatchListChildViewModel$data$1(null));
                    break;
                }
                break;
            case 2074257:
                if (str.equals("COIN")) {
                    flowFlowCombine = FlowKt.flowCombine(kir.OLrzqt(), MutableStateFlow, new WatchListChildViewModel$data$4(null));
                    break;
                }
                break;
            case 2552066:
                if (str.equals("SPOT")) {
                    flowFlowCombine = FlowKt.flowCombine(kir.gEmmrt(), MutableStateFlow, new WatchListChildViewModel$data$3(null));
                    break;
                }
                break;
            case 2558355:
                if (str.equals("SWAP")) {
                    flowFlowCombine = FlowKt.flowCombine(kir.djBIcL(), MutableStateFlow, new WatchListChildViewModel$data$2(null));
                    break;
                }
                break;
            case 214415088:
                if (str.equals("FUTURES")) {
                    flowFlowCombine = FlowKt.flowCombine(kir.djBIcL(), MutableStateFlow, new WatchListChildViewModel$data$8(null));
                    break;
                }
                break;
            case 1131295064:
                if (str.equals("pre_market")) {
                    flowFlowCombine = FlowKt.flowCombine(kir.AYXKKw(), MutableStateFlow, new WatchListChildViewModel$data$6(null));
                    break;
                }
                break;
        }
        Flow<java.util.ArrayList<kotlin.Pair<CoinQuote, MarketDataSource>>> flowConflate = FlowKt.conflate(flowFlowCombine);
        this.KWHzl = flowConflate;
        this.EZpvd = FlowKt.conflate(new ActionBar(flowConflate, this));
        this.OLrzqt = "";
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WatchListChildViewModel$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WatchListChildViewModel$2(this, null), 3, null);
    }

    public final void EZpvd(java.lang.String str) {
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.AEQbTJ)) {
            this.AEQbTJ = str;
        }
        this.AhwBna.setValue(this.AEQbTJ);
    }

    public static final class ActionBar implements Flow<java.util.List<? extends kotlin.Pair<? extends CoinQuote, ? extends MarketDataSource>>> {
        public final /* synthetic */ Flow EZpvd;
        public final /* synthetic */ kIJ copydefault;

        /* JADX INFO: renamed from: o.kIJ$ActionBar$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ kIJ EZpvd;
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, kIJ kij) {
                this.OLrzqt = flowCollector;
                this.EZpvd = kij;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                WatchListChildViewModel$special$$inlined$map$1$2$1 watchListChildViewModel$special$$inlined$map$1$2$1;
                if (continuation instanceof WatchListChildViewModel$special$$inlined$map$1$2$1) {
                    watchListChildViewModel$special$$inlined$map$1$2$1 = (WatchListChildViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = watchListChildViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        watchListChildViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        watchListChildViewModel$special$$inlined$map$1$2$1 = new WatchListChildViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = watchListChildViewModel$special$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = watchListChildViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (T t : (java.util.ArrayList) obj) {
                        kotlin.Pair<CoinQuote, ? extends MarketDataSource> pair = (kotlin.Pair) t;
                        Function1<kotlin.Pair<CoinQuote, ? extends MarketDataSource>, java.lang.Boolean> function1AEQbTJ = this.EZpvd.AEQbTJ();
                        if (function1AEQbTJ == null || function1AEQbTJ.invoke(pair).booleanValue()) {
                            arrayList.add(t);
                        }
                    }
                    watchListChildViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(arrayList, watchListChildViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow, kIJ kij) {
            this.EZpvd = flow;
            this.copydefault = kij;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends kotlin.Pair<? extends CoinQuote, ? extends MarketDataSource>>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass2(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.OLrzqt)) {
            return;
        }
        this.OLrzqt = str;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WatchListChildViewModel$bizFilterType$1(this, null), 3, null);
    }

    public static final class StateListAnimator extends AbstractC49408unw<StateListAnimator> {
        public java.lang.String AEQbTJ;
        public InterfaceC49371unL<? extends java.util.List<? extends kotlin.Pair<CoinQuote, ? extends MarketDataSource>>> KWHzl;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kIJ$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, InterfaceC49371unL interfaceC49371unL, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                interfaceC49371unL = stateListAnimator.KWHzl;
            }
            if ((i & 2) != 0) {
                str = stateListAnimator.AEQbTJ;
            }
            if ((i & 4) != 0) {
                str2 = stateListAnimator.copydefault;
            }
            return stateListAnimator.EZpvd(interfaceC49371unL, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(@NotNull InterfaceC49371unL<? extends java.util.List<? extends kotlin.Pair<CoinQuote, ? extends MarketDataSource>>> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.KWHzl = interfaceC49371unL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull InterfaceC49371unL<? extends java.util.List<? extends kotlin.Pair<CoinQuote, ? extends MarketDataSource>>> interfaceC49371unL, java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new StateListAnimator(interfaceC49371unL, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.unL<? extends java.util.List<? extends kotlin.Pair<com.okinc.business.market.bean.CoinQuote, ? extends com.okinc.tradeapi.bean.MarketDataSource>>>, o.unL<java.util.List<kotlin.Pair<com.okinc.business.market.bean.CoinQuote, com.okinc.tradeapi.bean.MarketDataSource>>> */
        public final InterfaceC49371unL<java.util.List<kotlin.Pair<CoinQuote, MarketDataSource>>> copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) stateListAnimator.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) stateListAnimator.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            java.lang.String str = this.AEQbTJ;
            return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "WatchChildUIState(datas=" + this.KWHzl + ", sortType=" + this.AEQbTJ + ", bizFilterType=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull InterfaceC49371unL<? extends java.util.List<? extends kotlin.Pair<CoinQuote, ? extends MarketDataSource>>> interfaceC49371unL, java.lang.String str, @NotNull java.lang.String str2) {
            super(new Function1() { // from class: o.kIK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kIJ.StateListAnimator.OLrzqt((kIJ.StateListAnimator) obj);
                }
            });
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.KWHzl = interfaceC49371unL;
            this.AEQbTJ = str;
            this.copydefault = str2;
        }

        public static final StateListAnimator OLrzqt(StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            return copy$default(stateListAnimator, null, null, null, 7, null);
        }
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r3v0, r4v1 */
    public final void AEQbTJ(int i, @NotNull SortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(sortType, "");
        if (i == 3) {
            EZpvd(C27985kKq.ActionBar.copydefault.OLrzqt(sortType.ordinal()));
            return;
        }
        java.util.Map<java.lang.String, java.lang.String> mapKWHzl = C27985kKq.ActionBar.copydefault.KWHzl();
        int iOrdinal = sortType.ordinal();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(i);
        sb.append(iOrdinal);
        EZpvd(mapKWHzl.get(sb.toString()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WatchListChildViewModel$chooseUserBizType$1 watchListChildViewModel$chooseUserBizType$1;
        kIJ kij;
        java.util.List list;
        if (continuation instanceof WatchListChildViewModel$chooseUserBizType$1) {
            watchListChildViewModel$chooseUserBizType$1 = (WatchListChildViewModel$chooseUserBizType$1) continuation;
            int i = watchListChildViewModel$chooseUserBizType$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchListChildViewModel$chooseUserBizType$1.label = i - Integer.MIN_VALUE;
            } else {
                watchListChildViewModel$chooseUserBizType$1 = new WatchListChildViewModel$chooseUserBizType$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = watchListChildViewModel$chooseUserBizType$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = watchListChildViewModel$chooseUserBizType$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> listOLrzqt = C27953kJl.OLrzqt();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
            java.util.Iterator<T> it = listOLrzqt.iterator();
            while (it.hasNext()) {
                arrayList.add((java.lang.String) ((kotlin.Pair) it.next()).getSecond());
            }
            java.util.Iterator<kotlin.Pair<java.lang.String, java.lang.String>> it2 = C27953kJl.OLrzqt().iterator();
            int i3 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i3 = -1;
                    break;
                }
                if (Intrinsics.EZpvd((java.lang.Object) it2.next().getFirst(), (java.lang.Object) this.OLrzqt)) {
                    break;
                }
                i3++;
            }
            int iCopydefault = C56548yJl.copydefault(i3, 0);
            C46732tci.TaskDescription taskDescription = C46732tci.Companion;
            watchListChildViewModel$chooseUserBizType$1.L$0 = this;
            watchListChildViewModel$chooseUserBizType$1.L$1 = arrayList;
            watchListChildViewModel$chooseUserBizType$1.label = 1;
            objEZpvd = taskDescription.EZpvd(arrayList, iCopydefault, fragmentManager, watchListChildViewModel$chooseUserBizType$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            kij = this;
            list = arrayList;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) watchListChildViewModel$chooseUserBizType$1.L$1;
            kij = (kIJ) watchListChildViewModel$chooseUserBizType$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        java.lang.String str = (java.lang.String) objEZpvd;
        if (str != null) {
            kij.OLrzqt(C27953kJl.OLrzqt().get(list.indexOf(str)).getFirst());
        }
        return Unit.INSTANCE;
    }
}
