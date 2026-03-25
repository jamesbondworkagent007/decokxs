package o;

import com.okinc.market.quotation.data.model.stock.StockListPo;
import com.okinc.market.ticker.datasource.impl.TickersWsDataSourceImpl$getAllPairTickers$$inlined$map$1$2$1;
import com.okinc.market.ticker.datasource.impl.TickersWsDataSourceImpl$getBatchCupTickers$$inlined$map$1$2$1;
import com.okinc.market.ticker.datasource.impl.TickersWsDataSourceImpl$getBatchMarkPriceTickers$$inlined$map$1$2$1;
import com.okinc.market.ticker.datasource.impl.TickersWsDataSourceImpl$getBatchPairTickers$$inlined$map$1$2$1;
import com.okinc.market.ticker.model.DexTickerPo;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.InterfaceC40396qUh;
import o.InterfaceC40397qUi;
import o.InterfaceC40404qUp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qUB {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.qUC
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return qUB.djBIcL();
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.qUF
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return qUB.KWHzl();
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.qUE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return qUB.EZpvd();
        }
    });

    @yCM
    public qUB() {
    }

    public static final class FragmentManager implements InterfaceC40404qUp {
        public Flow<TickersData> AEQbTJ(java.util.List<java.lang.String> list) {
            return InterfaceC40404qUp.TaskDescription.KWHzl(this, list);
        }

        public Flow<TickersData> EZpvd(java.util.List<java.lang.String> list) {
            return InterfaceC40404qUp.TaskDescription.EZpvd(this, list);
        }

        public Flow<TickersData> KWHzl(java.util.List<java.lang.String> list) {
            return InterfaceC40404qUp.TaskDescription.OLrzqt(this, list);
        }

        public Flow<TickersData> copydefault(java.lang.String str) {
            return InterfaceC40404qUp.TaskDescription.copydefault(this, str);
        }
    }

    public final FragmentManager AYXKKw() {
        return (FragmentManager) this.EZpvd.getValue();
    }

    public static final FragmentManager djBIcL() {
        return new FragmentManager();
    }

    public static final class Application implements InterfaceC40397qUi {
        public Flow<DexTickerPo> KWHzl(java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list) {
            return InterfaceC40397qUi.StateListAnimator.AEQbTJ(this, list);
        }
    }

    public final Application valueOf() {
        return (Application) this.KWHzl.getValue();
    }

    public static final Application KWHzl() {
        return new Application();
    }

    public static final class Dialog implements InterfaceC40396qUh {
        public Flow<java.util.List<StockListPo>> KWHzl() {
            return InterfaceC40396qUh.Application.AEQbTJ(this);
        }
    }

    public final Dialog gEmmrt() {
        return (Dialog) this.AEQbTJ.getValue();
    }

    public static final Dialog EZpvd() {
        return new Dialog();
    }

    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super Flow<? extends java.util.List<TickersData>>> continuation) {
        return new TaskDescription(AYXKKw().copydefault(str));
    }

    public java.lang.Object KWHzl(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Flow<? extends java.util.List<TickersData>>> continuation) {
        return new StateListAnimator(AYXKKw().KWHzl(list));
    }

    public java.lang.Object copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Flow<? extends java.util.List<TickersData>>> continuation) {
        return new Activity(AYXKKw().AEQbTJ(list));
    }

    public java.lang.Object AEQbTJ(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Flow<? extends java.util.List<TickersData>>> continuation) {
        return new ActionBar(AYXKKw().EZpvd(list));
    }

    public static final class ActionBar implements Flow<java.util.List<? extends TickersData>> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.qUB$ActionBar$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.AEQbTJ = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                TickersWsDataSourceImpl$getBatchMarkPriceTickers$$inlined$map$1$2$1 tickersWsDataSourceImpl$getBatchMarkPriceTickers$$inlined$map$1$2$1;
                if (continuation instanceof TickersWsDataSourceImpl$getBatchMarkPriceTickers$$inlined$map$1$2$1) {
                    tickersWsDataSourceImpl$getBatchMarkPriceTickers$$inlined$map$1$2$1 = (TickersWsDataSourceImpl$getBatchMarkPriceTickers$$inlined$map$1$2$1) continuation;
                    int i = tickersWsDataSourceImpl$getBatchMarkPriceTickers$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        tickersWsDataSourceImpl$getBatchMarkPriceTickers$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        tickersWsDataSourceImpl$getBatchMarkPriceTickers$$inlined$map$1$2$1 = new TickersWsDataSourceImpl$getBatchMarkPriceTickers$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = tickersWsDataSourceImpl$getBatchMarkPriceTickers$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = tickersWsDataSourceImpl$getBatchMarkPriceTickers$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    java.util.List listEZpvd = C56402yEa.EZpvd((TickersData) obj);
                    tickersWsDataSourceImpl$getBatchMarkPriceTickers$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(listEZpvd, tickersWsDataSourceImpl$getBatchMarkPriceTickers$$inlined$map$1$2$1) == objCopydefault) {
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
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends TickersData>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class Activity implements Flow<java.util.List<? extends TickersData>> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.qUB$Activity$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                TickersWsDataSourceImpl$getBatchCupTickers$$inlined$map$1$2$1 tickersWsDataSourceImpl$getBatchCupTickers$$inlined$map$1$2$1;
                if (continuation instanceof TickersWsDataSourceImpl$getBatchCupTickers$$inlined$map$1$2$1) {
                    tickersWsDataSourceImpl$getBatchCupTickers$$inlined$map$1$2$1 = (TickersWsDataSourceImpl$getBatchCupTickers$$inlined$map$1$2$1) continuation;
                    int i = tickersWsDataSourceImpl$getBatchCupTickers$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        tickersWsDataSourceImpl$getBatchCupTickers$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        tickersWsDataSourceImpl$getBatchCupTickers$$inlined$map$1$2$1 = new TickersWsDataSourceImpl$getBatchCupTickers$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = tickersWsDataSourceImpl$getBatchCupTickers$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = tickersWsDataSourceImpl$getBatchCupTickers$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    java.util.List listEZpvd = C56402yEa.EZpvd((TickersData) obj);
                    tickersWsDataSourceImpl$getBatchCupTickers$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(listEZpvd, tickersWsDataSourceImpl$getBatchCupTickers$$inlined$map$1$2$1) == objCopydefault) {
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
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends TickersData>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class StateListAnimator implements Flow<java.util.List<? extends TickersData>> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: o.qUB$StateListAnimator$5, reason: invalid class name */
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
                TickersWsDataSourceImpl$getBatchPairTickers$$inlined$map$1$2$1 tickersWsDataSourceImpl$getBatchPairTickers$$inlined$map$1$2$1;
                if (continuation instanceof TickersWsDataSourceImpl$getBatchPairTickers$$inlined$map$1$2$1) {
                    tickersWsDataSourceImpl$getBatchPairTickers$$inlined$map$1$2$1 = (TickersWsDataSourceImpl$getBatchPairTickers$$inlined$map$1$2$1) continuation;
                    int i = tickersWsDataSourceImpl$getBatchPairTickers$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        tickersWsDataSourceImpl$getBatchPairTickers$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        tickersWsDataSourceImpl$getBatchPairTickers$$inlined$map$1$2$1 = new TickersWsDataSourceImpl$getBatchPairTickers$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = tickersWsDataSourceImpl$getBatchPairTickers$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = tickersWsDataSourceImpl$getBatchPairTickers$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    java.util.List listEZpvd = C56402yEa.EZpvd((TickersData) obj);
                    tickersWsDataSourceImpl$getBatchPairTickers$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(listEZpvd, tickersWsDataSourceImpl$getBatchPairTickers$$inlined$map$1$2$1) == objCopydefault) {
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
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends TickersData>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class TaskDescription implements Flow<java.util.List<? extends TickersData>> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: o.qUB$TaskDescription$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                TickersWsDataSourceImpl$getAllPairTickers$$inlined$map$1$2$1 tickersWsDataSourceImpl$getAllPairTickers$$inlined$map$1$2$1;
                if (continuation instanceof TickersWsDataSourceImpl$getAllPairTickers$$inlined$map$1$2$1) {
                    tickersWsDataSourceImpl$getAllPairTickers$$inlined$map$1$2$1 = (TickersWsDataSourceImpl$getAllPairTickers$$inlined$map$1$2$1) continuation;
                    int i = tickersWsDataSourceImpl$getAllPairTickers$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        tickersWsDataSourceImpl$getAllPairTickers$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        tickersWsDataSourceImpl$getAllPairTickers$$inlined$map$1$2$1 = new TickersWsDataSourceImpl$getAllPairTickers$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = tickersWsDataSourceImpl$getAllPairTickers$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = tickersWsDataSourceImpl$getAllPairTickers$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    java.util.List listEZpvd = C56402yEa.EZpvd((TickersData) obj);
                    tickersWsDataSourceImpl$getAllPairTickers$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(listEZpvd, tickersWsDataSourceImpl$getAllPairTickers$$inlined$map$1$2$1) == objCopydefault) {
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
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends TickersData>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public java.lang.Object EZpvd(@NotNull java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list, @NotNull Continuation<? super Flow<DexTickerPo>> continuation) {
        return valueOf().KWHzl(list);
    }

    public java.lang.Object EZpvd(@NotNull Continuation<? super Flow<? extends java.util.List<StockListPo>>> continuation) {
        return gEmmrt().KWHzl();
    }
}
