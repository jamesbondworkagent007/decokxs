package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.okmarket.data.MarketDataApiImpl$getPriceAndPercent$1;
import com.okinc.okmarket.data.MarketDataApiImpl$getPriceAndPercent$2;
import com.okinc.okmarket.data.MarketDataApiImpl$getPriceAndPercentUseNetPrice$1;
import com.okinc.okmarket.data.MarketDataApiImpl$getPriceAndPercentUseNetPrice$2;
import com.okinc.okmarket.data.MarketDataApiImpl$httpThenSubscribePriceAndPercent$1;
import com.okinc.okmarket.data.MarketDataApiImpl$httpThenSubscribePriceAndPercent$2;
import com.okinc.okmarket.data.MarketDataApiImpl$httpThenSubscribePriceAndPercent$httpFlow$1;
import com.okinc.okmarket.data.MarketDataApiImpl$httpThenSubscribePriceAndPercent$wsFlow$1;
import com.okinc.okmarket.data.MarketDataApiImpl$httpThenSubscribeTickerData$1;
import com.okinc.okmarket.data.MarketDataApiImpl$httpThenSubscribeTickerData$2;
import com.okinc.okmarket.data.MarketDataApiImpl$httpThenSubscribeTickerData$httpFlow$1;
import com.okinc.okmarket.data.MarketDataApiImpl$httpThenSubscribeTickerData$wsFlow$1;
import com.okinc.okmarket.data.MarketDataApiImpl$observerPriceAndPercent$$inlined$map$1$2$1;
import com.okinc.okmarket.data.MarketDataApiImpl$observerPriceAndPercent$1;
import com.okinc.okmarket.data.MarketDataApiImpl$observerPriceAndPercentUseNetPrice$$inlined$map$1$2$1;
import com.okinc.okmarket.data.MarketDataApiImpl$observerPriceAndPercentUseNetPrice$1;
import com.okinc.okmarket.data.MarketDataApiImpl$queryPriceAndPercent$1;
import com.okinc.okmarket.data.MarketDataApiImpl$queryPriceAndPercent$2;
import com.okinc.okmarket.data.MarketDataApiImpl$queryTickerData$1;
import com.okinc.okmarket.data.MarketDataApiImpl$queryTickerData$2;
import com.okinc.okmarket.data.MarketDataApiImpl$subscribePriceAndPercent$$inlined$map$1$2$1;
import com.okinc.okmarket.data.MarketDataApiImpl$subscribePriceAndPercent$1;
import com.okinc.okmarket.data.MarketDataApiImpl$subscribeTickerData$$inlined$map$1$2$1;
import com.okinc.okmarket.data.MarketDataApiImpl$subscribeTickerData$1;
import com.okinc.okmarket.data.MarketDataApiImpl$tryInitOkTrade$2;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sZN implements InterfaceC43032rhd {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.List<kotlin.Pair<java.lang.String, Triple<java.lang.String, java.lang.Double, java.lang.String>>>> continuation) throws java.lang.Throwable {
        MarketDataApiImpl$getPriceAndPercent$1 marketDataApiImpl$getPriceAndPercent$1;
        sZN szn;
        if (continuation instanceof MarketDataApiImpl$getPriceAndPercent$1) {
            marketDataApiImpl$getPriceAndPercent$1 = (MarketDataApiImpl$getPriceAndPercent$1) continuation;
            int i = marketDataApiImpl$getPriceAndPercent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketDataApiImpl$getPriceAndPercent$1.label = i - Integer.MIN_VALUE;
            } else {
                marketDataApiImpl$getPriceAndPercent$1 = new MarketDataApiImpl$getPriceAndPercent$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = marketDataApiImpl$getPriceAndPercent$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketDataApiImpl$getPriceAndPercent$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            marketDataApiImpl$getPriceAndPercent$1.L$0 = this;
            marketDataApiImpl$getPriceAndPercent$1.L$1 = list;
            marketDataApiImpl$getPriceAndPercent$1.label = 1;
            if (AEQbTJ(lifecycleOwner, marketDataApiImpl$getPriceAndPercent$1) == objCopydefault) {
                return objCopydefault;
            }
            szn = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objWithContext);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) marketDataApiImpl$getPriceAndPercent$1.L$1;
            szn = (sZN) marketDataApiImpl$getPriceAndPercent$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            return null;
        }
        CoroutineDispatcher coroutineDispatcherAEQbTJ = C40440qVy.Companion.AEQbTJ();
        MarketDataApiImpl$getPriceAndPercent$2 marketDataApiImpl$getPriceAndPercent$2 = new MarketDataApiImpl$getPriceAndPercent$2(list, szn, interfaceC54581xNrOLrzqt, null);
        marketDataApiImpl$getPriceAndPercent$1.L$0 = null;
        marketDataApiImpl$getPriceAndPercent$1.L$1 = null;
        marketDataApiImpl$getPriceAndPercent$1.label = 2;
        objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, marketDataApiImpl$getPriceAndPercent$2, marketDataApiImpl$getPriceAndPercent$1);
        return objWithContext == objCopydefault ? objCopydefault : objWithContext;
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Activity implements Flow<java.util.List<? extends kotlin.Pair<? extends java.lang.String, ? extends Triple<? extends java.lang.String, ? extends java.lang.Double, ? extends java.lang.String>>>> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ InterfaceC54581xNr KWHzl;
        public final /* synthetic */ sZN OLrzqt;

        /* JADX INFO: renamed from: o.sZN$Activity$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ sZN AEQbTJ;
            public final /* synthetic */ FlowCollector KWHzl;
            public final /* synthetic */ InterfaceC54581xNr OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, sZN szn, InterfaceC54581xNr interfaceC54581xNr) {
                this.KWHzl = flowCollector;
                this.AEQbTJ = szn;
                this.OLrzqt = interfaceC54581xNr;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                MarketDataApiImpl$observerPriceAndPercent$$inlined$map$1$2$1 marketDataApiImpl$observerPriceAndPercent$$inlined$map$1$2$1;
                if (continuation instanceof MarketDataApiImpl$observerPriceAndPercent$$inlined$map$1$2$1) {
                    marketDataApiImpl$observerPriceAndPercent$$inlined$map$1$2$1 = (MarketDataApiImpl$observerPriceAndPercent$$inlined$map$1$2$1) continuation;
                    int i = marketDataApiImpl$observerPriceAndPercent$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        marketDataApiImpl$observerPriceAndPercent$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        marketDataApiImpl$observerPriceAndPercent$$inlined$map$1$2$1 = new MarketDataApiImpl$observerPriceAndPercent$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = marketDataApiImpl$observerPriceAndPercent$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = marketDataApiImpl$observerPriceAndPercent$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.util.List list = (java.util.List) obj;
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                    java.util.Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(this.AEQbTJ.AEQbTJ((TickersData) it.next(), this.OLrzqt));
                    }
                    marketDataApiImpl$observerPriceAndPercent$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(arrayList, marketDataApiImpl$observerPriceAndPercent$$inlined$map$1$2$1) == objCopydefault) {
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

        public Activity(Flow flow, sZN szn, InterfaceC54581xNr interfaceC54581xNr) {
            this.AEQbTJ = flow;
            this.OLrzqt = szn;
            this.KWHzl = interfaceC54581xNr;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends kotlin.Pair<? extends java.lang.String, ? extends Triple<? extends java.lang.String, ? extends java.lang.Double, ? extends java.lang.String>>>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass3(flowCollector, this.OLrzqt, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Application implements Flow<java.util.List<? extends kotlin.Pair<? extends java.lang.String, ? extends Triple<? extends java.lang.String, ? extends java.lang.Double, ? extends java.lang.String>>>> {
        public final /* synthetic */ sZN AEQbTJ;
        public final /* synthetic */ Flow EZpvd;
        public final /* synthetic */ InterfaceC54581xNr KWHzl;

        /* JADX INFO: renamed from: o.sZN$Application$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;
            public final /* synthetic */ InterfaceC54581xNr KWHzl;
            public final /* synthetic */ sZN copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, sZN szn, InterfaceC54581xNr interfaceC54581xNr) {
                this.EZpvd = flowCollector;
                this.copydefault = szn;
                this.KWHzl = interfaceC54581xNr;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                MarketDataApiImpl$subscribePriceAndPercent$$inlined$map$1$2$1 marketDataApiImpl$subscribePriceAndPercent$$inlined$map$1$2$1;
                if (continuation instanceof MarketDataApiImpl$subscribePriceAndPercent$$inlined$map$1$2$1) {
                    marketDataApiImpl$subscribePriceAndPercent$$inlined$map$1$2$1 = (MarketDataApiImpl$subscribePriceAndPercent$$inlined$map$1$2$1) continuation;
                    int i = marketDataApiImpl$subscribePriceAndPercent$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        marketDataApiImpl$subscribePriceAndPercent$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        marketDataApiImpl$subscribePriceAndPercent$$inlined$map$1$2$1 = new MarketDataApiImpl$subscribePriceAndPercent$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = marketDataApiImpl$subscribePriceAndPercent$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = marketDataApiImpl$subscribePriceAndPercent$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    java.util.List list = (java.util.List) obj;
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                    java.util.Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(this.copydefault.EZpvd((TickersData) it.next(), this.KWHzl));
                    }
                    marketDataApiImpl$subscribePriceAndPercent$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(arrayList, marketDataApiImpl$subscribePriceAndPercent$$inlined$map$1$2$1) == objCopydefault) {
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

        public Application(Flow flow, sZN szn, InterfaceC54581xNr interfaceC54581xNr) {
            this.EZpvd = flow;
            this.AEQbTJ = szn;
            this.KWHzl = interfaceC54581xNr;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends kotlin.Pair<? extends java.lang.String, ? extends Triple<? extends java.lang.String, ? extends java.lang.Double, ? extends java.lang.String>>>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass4(flowCollector, this.AEQbTJ, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class StateListAnimator implements Flow<java.util.List<? extends kotlin.Pair<? extends java.lang.String, ? extends Triple<? extends java.lang.String, ? extends java.lang.Double, ? extends java.lang.String>>>> {
        public final /* synthetic */ sZN EZpvd;
        public final /* synthetic */ Flow KWHzl;
        public final /* synthetic */ InterfaceC54581xNr copydefault;

        /* JADX INFO: renamed from: o.sZN$StateListAnimator$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ InterfaceC54581xNr AEQbTJ;
            public final /* synthetic */ FlowCollector KWHzl;
            public final /* synthetic */ sZN OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, sZN szn, InterfaceC54581xNr interfaceC54581xNr) {
                this.KWHzl = flowCollector;
                this.OLrzqt = szn;
                this.AEQbTJ = interfaceC54581xNr;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                MarketDataApiImpl$observerPriceAndPercentUseNetPrice$$inlined$map$1$2$1 marketDataApiImpl$observerPriceAndPercentUseNetPrice$$inlined$map$1$2$1;
                if (continuation instanceof MarketDataApiImpl$observerPriceAndPercentUseNetPrice$$inlined$map$1$2$1) {
                    marketDataApiImpl$observerPriceAndPercentUseNetPrice$$inlined$map$1$2$1 = (MarketDataApiImpl$observerPriceAndPercentUseNetPrice$$inlined$map$1$2$1) continuation;
                    int i = marketDataApiImpl$observerPriceAndPercentUseNetPrice$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        marketDataApiImpl$observerPriceAndPercentUseNetPrice$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        marketDataApiImpl$observerPriceAndPercentUseNetPrice$$inlined$map$1$2$1 = new MarketDataApiImpl$observerPriceAndPercentUseNetPrice$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = marketDataApiImpl$observerPriceAndPercentUseNetPrice$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = marketDataApiImpl$observerPriceAndPercentUseNetPrice$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.util.List list = (java.util.List) obj;
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                    java.util.Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(this.OLrzqt.EZpvd((TickersData) it.next(), this.AEQbTJ));
                    }
                    marketDataApiImpl$observerPriceAndPercentUseNetPrice$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(arrayList, marketDataApiImpl$observerPriceAndPercentUseNetPrice$$inlined$map$1$2$1) == objCopydefault) {
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

        public StateListAnimator(Flow flow, sZN szn, InterfaceC54581xNr interfaceC54581xNr) {
            this.KWHzl = flow;
            this.EZpvd = szn;
            this.copydefault = interfaceC54581xNr;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends kotlin.Pair<? extends java.lang.String, ? extends Triple<? extends java.lang.String, ? extends java.lang.Double, ? extends java.lang.String>>>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass4(flowCollector, this.EZpvd, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription implements Flow<java.util.List<? extends kotlin.Pair<? extends java.lang.String, ? extends TickersData>>> {
        public final /* synthetic */ Flow KWHzl;
        public final /* synthetic */ boolean copydefault;

        /* JADX INFO: renamed from: o.sZN$TaskDescription$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ boolean AEQbTJ;
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, boolean z) {
                this.OLrzqt = flowCollector;
                this.AEQbTJ = z;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                MarketDataApiImpl$subscribeTickerData$$inlined$map$1$2$1 marketDataApiImpl$subscribeTickerData$$inlined$map$1$2$1;
                if (continuation instanceof MarketDataApiImpl$subscribeTickerData$$inlined$map$1$2$1) {
                    marketDataApiImpl$subscribeTickerData$$inlined$map$1$2$1 = (MarketDataApiImpl$subscribeTickerData$$inlined$map$1$2$1) continuation;
                    int i = marketDataApiImpl$subscribeTickerData$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        marketDataApiImpl$subscribeTickerData$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        marketDataApiImpl$subscribeTickerData$$inlined$map$1$2$1 = new MarketDataApiImpl$subscribeTickerData$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = marketDataApiImpl$subscribeTickerData$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = marketDataApiImpl$subscribeTickerData$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    java.util.List<TickersData> list = (java.util.List) obj;
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                    for (TickersData tickersData : list) {
                        arrayList.add(new kotlin.Pair(this.AEQbTJ ? tickersData.getCcy() : tickersData.getInstId(), tickersData));
                    }
                    marketDataApiImpl$subscribeTickerData$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(arrayList, marketDataApiImpl$subscribeTickerData$$inlined$map$1$2$1) == objCopydefault) {
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

        public TaskDescription(Flow flow, boolean z) {
            this.KWHzl = flow;
            this.copydefault = z;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends kotlin.Pair<? extends java.lang.String, ? extends TickersData>>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass5(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final kotlin.Pair<java.lang.String, Triple<java.lang.String, java.lang.Double, java.lang.String>> AEQbTJ(TickersData tickersData, InterfaceC54581xNr interfaceC54581xNr) {
        kotlin.Pair priceRiceLimit$default = C55626xnW.getPriceRiceLimit$default(tickersData, false, 1, null);
        return new kotlin.Pair<>(tickersData.getCcy(), new Triple(C55626xnW.OLrzqt(interfaceC54581xNr, tickersData), priceRiceLimit$default.getFirst(), priceRiceLimit$default.getSecond()));
    }

    public final kotlin.Pair<java.lang.String, Triple<java.lang.String, java.lang.Double, java.lang.String>> EZpvd(TickersData tickersData, InterfaceC54581xNr interfaceC54581xNr) {
        kotlin.Pair priceRiceLimit$default = C55626xnW.getPriceRiceLimit$default(tickersData, false, 1, null);
        return new kotlin.Pair<>(tickersData.getCcy(), new Triple(tickersData.getLast(), priceRiceLimit$default.getFirst(), priceRiceLimit$default.getSecond()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Flow<? extends java.util.List<kotlin.Pair<java.lang.String, Triple<java.lang.String, java.lang.Double, java.lang.String>>>>> continuation) throws java.lang.Throwable {
        MarketDataApiImpl$observerPriceAndPercent$1 marketDataApiImpl$observerPriceAndPercent$1;
        sZN szn;
        if (continuation instanceof MarketDataApiImpl$observerPriceAndPercent$1) {
            marketDataApiImpl$observerPriceAndPercent$1 = (MarketDataApiImpl$observerPriceAndPercent$1) continuation;
            int i = marketDataApiImpl$observerPriceAndPercent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketDataApiImpl$observerPriceAndPercent$1.label = i - Integer.MIN_VALUE;
            } else {
                marketDataApiImpl$observerPriceAndPercent$1 = new MarketDataApiImpl$observerPriceAndPercent$1(this, continuation);
            }
        }
        java.lang.Object obj = marketDataApiImpl$observerPriceAndPercent$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketDataApiImpl$observerPriceAndPercent$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            marketDataApiImpl$observerPriceAndPercent$1.L$0 = this;
            marketDataApiImpl$observerPriceAndPercent$1.L$1 = list;
            marketDataApiImpl$observerPriceAndPercent$1.label = 1;
            if (AEQbTJ(lifecycleOwner, marketDataApiImpl$observerPriceAndPercent$1) == objCopydefault) {
                return objCopydefault;
            }
            szn = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) marketDataApiImpl$observerPriceAndPercent$1.L$1;
            szn = (sZN) marketDataApiImpl$observerPriceAndPercent$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            return null;
        }
        return FlowKt.flowOn(new Activity(C55626xnW.AEQbTJ(list), szn, interfaceC54581xNrOLrzqt), C40440qVy.Companion.AEQbTJ());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.List<kotlin.Pair<java.lang.String, Triple<java.lang.String, java.lang.Double, java.lang.String>>>> continuation) throws java.lang.Throwable {
        MarketDataApiImpl$getPriceAndPercentUseNetPrice$1 marketDataApiImpl$getPriceAndPercentUseNetPrice$1;
        sZN szn;
        if (continuation instanceof MarketDataApiImpl$getPriceAndPercentUseNetPrice$1) {
            marketDataApiImpl$getPriceAndPercentUseNetPrice$1 = (MarketDataApiImpl$getPriceAndPercentUseNetPrice$1) continuation;
            int i = marketDataApiImpl$getPriceAndPercentUseNetPrice$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketDataApiImpl$getPriceAndPercentUseNetPrice$1.label = i - Integer.MIN_VALUE;
            } else {
                marketDataApiImpl$getPriceAndPercentUseNetPrice$1 = new MarketDataApiImpl$getPriceAndPercentUseNetPrice$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = marketDataApiImpl$getPriceAndPercentUseNetPrice$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketDataApiImpl$getPriceAndPercentUseNetPrice$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            marketDataApiImpl$getPriceAndPercentUseNetPrice$1.L$0 = this;
            marketDataApiImpl$getPriceAndPercentUseNetPrice$1.L$1 = list;
            marketDataApiImpl$getPriceAndPercentUseNetPrice$1.label = 1;
            if (AEQbTJ(lifecycleOwner, marketDataApiImpl$getPriceAndPercentUseNetPrice$1) == objCopydefault) {
                return objCopydefault;
            }
            szn = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objWithContext);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) marketDataApiImpl$getPriceAndPercentUseNetPrice$1.L$1;
            szn = (sZN) marketDataApiImpl$getPriceAndPercentUseNetPrice$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            return null;
        }
        CoroutineDispatcher coroutineDispatcherAEQbTJ = C40440qVy.Companion.AEQbTJ();
        MarketDataApiImpl$getPriceAndPercentUseNetPrice$2 marketDataApiImpl$getPriceAndPercentUseNetPrice$2 = new MarketDataApiImpl$getPriceAndPercentUseNetPrice$2(list, szn, interfaceC54581xNrOLrzqt, null);
        marketDataApiImpl$getPriceAndPercentUseNetPrice$1.L$0 = null;
        marketDataApiImpl$getPriceAndPercentUseNetPrice$1.L$1 = null;
        marketDataApiImpl$getPriceAndPercentUseNetPrice$1.label = 2;
        objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, marketDataApiImpl$getPriceAndPercentUseNetPrice$2, marketDataApiImpl$getPriceAndPercentUseNetPrice$1);
        return objWithContext == objCopydefault ? objCopydefault : objWithContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Flow<? extends java.util.List<kotlin.Pair<java.lang.String, Triple<java.lang.String, java.lang.Double, java.lang.String>>>>> continuation) throws java.lang.Throwable {
        MarketDataApiImpl$observerPriceAndPercentUseNetPrice$1 marketDataApiImpl$observerPriceAndPercentUseNetPrice$1;
        sZN szn;
        if (continuation instanceof MarketDataApiImpl$observerPriceAndPercentUseNetPrice$1) {
            marketDataApiImpl$observerPriceAndPercentUseNetPrice$1 = (MarketDataApiImpl$observerPriceAndPercentUseNetPrice$1) continuation;
            int i = marketDataApiImpl$observerPriceAndPercentUseNetPrice$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketDataApiImpl$observerPriceAndPercentUseNetPrice$1.label = i - Integer.MIN_VALUE;
            } else {
                marketDataApiImpl$observerPriceAndPercentUseNetPrice$1 = new MarketDataApiImpl$observerPriceAndPercentUseNetPrice$1(this, continuation);
            }
        }
        java.lang.Object obj = marketDataApiImpl$observerPriceAndPercentUseNetPrice$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketDataApiImpl$observerPriceAndPercentUseNetPrice$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            marketDataApiImpl$observerPriceAndPercentUseNetPrice$1.L$0 = this;
            marketDataApiImpl$observerPriceAndPercentUseNetPrice$1.L$1 = list;
            marketDataApiImpl$observerPriceAndPercentUseNetPrice$1.label = 1;
            if (AEQbTJ(lifecycleOwner, marketDataApiImpl$observerPriceAndPercentUseNetPrice$1) == objCopydefault) {
                return objCopydefault;
            }
            szn = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) marketDataApiImpl$observerPriceAndPercentUseNetPrice$1.L$1;
            szn = (sZN) marketDataApiImpl$observerPriceAndPercentUseNetPrice$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            return null;
        }
        return FlowKt.flowOn(new StateListAnimator(C55626xnW.AEQbTJ(list), szn, interfaceC54581xNrOLrzqt), C40440qVy.Companion.AEQbTJ());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.List<java.lang.String> list, boolean z, boolean z2, @NotNull Continuation<? super java.util.List<kotlin.Pair<java.lang.String, Triple<java.lang.String, java.lang.Double, java.lang.String>>>> continuation) throws java.lang.Throwable {
        MarketDataApiImpl$queryPriceAndPercent$1 marketDataApiImpl$queryPriceAndPercent$1;
        sZN szn;
        if (continuation instanceof MarketDataApiImpl$queryPriceAndPercent$1) {
            marketDataApiImpl$queryPriceAndPercent$1 = (MarketDataApiImpl$queryPriceAndPercent$1) continuation;
            int i = marketDataApiImpl$queryPriceAndPercent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketDataApiImpl$queryPriceAndPercent$1.label = i - Integer.MIN_VALUE;
            } else {
                marketDataApiImpl$queryPriceAndPercent$1 = new MarketDataApiImpl$queryPriceAndPercent$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = marketDataApiImpl$queryPriceAndPercent$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketDataApiImpl$queryPriceAndPercent$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            marketDataApiImpl$queryPriceAndPercent$1.L$0 = this;
            marketDataApiImpl$queryPriceAndPercent$1.L$1 = list;
            marketDataApiImpl$queryPriceAndPercent$1.Z$0 = z2;
            marketDataApiImpl$queryPriceAndPercent$1.label = 1;
            if (AEQbTJ(lifecycleOwner, marketDataApiImpl$queryPriceAndPercent$1) == objCopydefault) {
                return objCopydefault;
            }
            szn = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objWithContext);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = marketDataApiImpl$queryPriceAndPercent$1.Z$0;
            list = (java.util.List) marketDataApiImpl$queryPriceAndPercent$1.L$1;
            sZN szn2 = (sZN) marketDataApiImpl$queryPriceAndPercent$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            szn = szn2;
        }
        java.util.List<java.lang.String> list2 = list;
        boolean z3 = z2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            return null;
        }
        CoroutineDispatcher coroutineDispatcherAEQbTJ = C40440qVy.Companion.AEQbTJ();
        MarketDataApiImpl$queryPriceAndPercent$2 marketDataApiImpl$queryPriceAndPercent$2 = new MarketDataApiImpl$queryPriceAndPercent$2(list2, z3, szn, interfaceC54581xNrOLrzqt, null);
        marketDataApiImpl$queryPriceAndPercent$1.L$0 = null;
        marketDataApiImpl$queryPriceAndPercent$1.L$1 = null;
        marketDataApiImpl$queryPriceAndPercent$1.label = 2;
        objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, marketDataApiImpl$queryPriceAndPercent$2, marketDataApiImpl$queryPriceAndPercent$1);
        return objWithContext == objCopydefault ? objCopydefault : objWithContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.List<java.lang.String> list, boolean z, boolean z2, @NotNull Continuation<? super Flow<? extends java.util.List<kotlin.Pair<java.lang.String, Triple<java.lang.String, java.lang.Double, java.lang.String>>>>> continuation) throws java.lang.Throwable {
        MarketDataApiImpl$subscribePriceAndPercent$1 marketDataApiImpl$subscribePriceAndPercent$1;
        sZN szn;
        Flow<java.util.List<TickersData>> flowAEQbTJ;
        if (continuation instanceof MarketDataApiImpl$subscribePriceAndPercent$1) {
            marketDataApiImpl$subscribePriceAndPercent$1 = (MarketDataApiImpl$subscribePriceAndPercent$1) continuation;
            int i = marketDataApiImpl$subscribePriceAndPercent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketDataApiImpl$subscribePriceAndPercent$1.label = i - Integer.MIN_VALUE;
            } else {
                marketDataApiImpl$subscribePriceAndPercent$1 = new MarketDataApiImpl$subscribePriceAndPercent$1(this, continuation);
            }
        }
        java.lang.Object obj = marketDataApiImpl$subscribePriceAndPercent$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketDataApiImpl$subscribePriceAndPercent$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            marketDataApiImpl$subscribePriceAndPercent$1.L$0 = this;
            marketDataApiImpl$subscribePriceAndPercent$1.L$1 = list;
            marketDataApiImpl$subscribePriceAndPercent$1.Z$0 = z;
            marketDataApiImpl$subscribePriceAndPercent$1.label = 1;
            if (AEQbTJ(lifecycleOwner, marketDataApiImpl$subscribePriceAndPercent$1) == objCopydefault) {
                return objCopydefault;
            }
            szn = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = marketDataApiImpl$subscribePriceAndPercent$1.Z$0;
            list = (java.util.List) marketDataApiImpl$subscribePriceAndPercent$1.L$1;
            szn = (sZN) marketDataApiImpl$subscribePriceAndPercent$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            return null;
        }
        if (z) {
            flowAEQbTJ = C55626xnW.copydefault(list, "cup-tickers-3s");
        } else {
            flowAEQbTJ = C55626xnW.AEQbTJ(list);
        }
        return FlowKt.flowOn(new Application(flowAEQbTJ, szn, interfaceC54581xNrOLrzqt), C40440qVy.Companion.AEQbTJ());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.List<java.lang.String> list, boolean z, boolean z2, @NotNull Continuation<? super Flow<? extends java.util.List<kotlin.Pair<java.lang.String, Triple<java.lang.String, java.lang.Double, java.lang.String>>>>> continuation) throws java.lang.Throwable {
        MarketDataApiImpl$httpThenSubscribePriceAndPercent$1 marketDataApiImpl$httpThenSubscribePriceAndPercent$1;
        java.util.List<java.lang.String> list2;
        boolean z3;
        boolean z4;
        sZN szn;
        Flow flow;
        Flow flow2;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (continuation instanceof MarketDataApiImpl$httpThenSubscribePriceAndPercent$1) {
            marketDataApiImpl$httpThenSubscribePriceAndPercent$1 = (MarketDataApiImpl$httpThenSubscribePriceAndPercent$1) continuation;
            int i = marketDataApiImpl$httpThenSubscribePriceAndPercent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketDataApiImpl$httpThenSubscribePriceAndPercent$1.label = i - Integer.MIN_VALUE;
            } else {
                marketDataApiImpl$httpThenSubscribePriceAndPercent$1 = new MarketDataApiImpl$httpThenSubscribePriceAndPercent$1(this, continuation);
            }
        }
        MarketDataApiImpl$httpThenSubscribePriceAndPercent$1 marketDataApiImpl$httpThenSubscribePriceAndPercent$12 = marketDataApiImpl$httpThenSubscribePriceAndPercent$1;
        java.lang.Object obj = marketDataApiImpl$httpThenSubscribePriceAndPercent$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketDataApiImpl$httpThenSubscribePriceAndPercent$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            marketDataApiImpl$httpThenSubscribePriceAndPercent$12.L$0 = this;
            marketDataApiImpl$httpThenSubscribePriceAndPercent$12.L$1 = lifecycleOwner2;
            marketDataApiImpl$httpThenSubscribePriceAndPercent$12.L$2 = list;
            marketDataApiImpl$httpThenSubscribePriceAndPercent$12.Z$0 = z;
            marketDataApiImpl$httpThenSubscribePriceAndPercent$12.Z$1 = z2;
            marketDataApiImpl$httpThenSubscribePriceAndPercent$12.label = 1;
            if (AEQbTJ(lifecycleOwner2, marketDataApiImpl$httpThenSubscribePriceAndPercent$12) == objCopydefault) {
                return objCopydefault;
            }
            list2 = list;
            z3 = z2;
            z4 = z;
            szn = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flow = (Flow) marketDataApiImpl$httpThenSubscribePriceAndPercent$12.L$0;
                C56391yDq.AEQbTJ(obj);
                flow2 = (Flow) obj;
                if (flow2 == null) {
                    flow2 = FlowKt.flow(new MarketDataApiImpl$httpThenSubscribePriceAndPercent$wsFlow$1(null));
                }
                return FlowKt.flatMapConcat(FlowKt.flowOf((java.lang.Object[]) new Flow[]{flow, flow2}), new MarketDataApiImpl$httpThenSubscribePriceAndPercent$2(null));
            }
            boolean z5 = marketDataApiImpl$httpThenSubscribePriceAndPercent$12.Z$1;
            boolean z6 = marketDataApiImpl$httpThenSubscribePriceAndPercent$12.Z$0;
            list2 = (java.util.List) marketDataApiImpl$httpThenSubscribePriceAndPercent$12.L$2;
            LifecycleOwner lifecycleOwner3 = (LifecycleOwner) marketDataApiImpl$httpThenSubscribePriceAndPercent$12.L$1;
            sZN szn2 = (sZN) marketDataApiImpl$httpThenSubscribePriceAndPercent$12.L$0;
            C56391yDq.AEQbTJ(obj);
            z3 = z5;
            lifecycleOwner2 = lifecycleOwner3;
            z4 = z6;
            szn = szn2;
        }
        if (pWO.KWHzl().OLrzqt() == null) {
            return null;
        }
        Flow flowAsFlow = FlowKt.asFlow(new MarketDataApiImpl$httpThenSubscribePriceAndPercent$httpFlow$1(szn, lifecycleOwner2, list2, z4, z3, null));
        marketDataApiImpl$httpThenSubscribePriceAndPercent$12.L$0 = flowAsFlow;
        marketDataApiImpl$httpThenSubscribePriceAndPercent$12.L$1 = null;
        marketDataApiImpl$httpThenSubscribePriceAndPercent$12.L$2 = null;
        marketDataApiImpl$httpThenSubscribePriceAndPercent$12.label = 2;
        java.lang.Object objEZpvd = szn.EZpvd(lifecycleOwner2, list2, z4, z3, marketDataApiImpl$httpThenSubscribePriceAndPercent$12);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        obj = objEZpvd;
        flow = flowAsFlow;
        flow2 = (Flow) obj;
        if (flow2 == null) {
        }
        return FlowKt.flatMapConcat(FlowKt.flowOf((java.lang.Object[]) new Flow[]{flow, flow2}), new MarketDataApiImpl$httpThenSubscribePriceAndPercent$2(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC43032rhd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.List<java.lang.String> list, boolean z, @NotNull Continuation<? super java.util.List<kotlin.Pair<java.lang.String, TickersData>>> continuation) throws java.lang.Throwable {
        MarketDataApiImpl$queryTickerData$1 marketDataApiImpl$queryTickerData$1;
        if (continuation instanceof MarketDataApiImpl$queryTickerData$1) {
            marketDataApiImpl$queryTickerData$1 = (MarketDataApiImpl$queryTickerData$1) continuation;
            int i = marketDataApiImpl$queryTickerData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketDataApiImpl$queryTickerData$1.label = i - Integer.MIN_VALUE;
            } else {
                marketDataApiImpl$queryTickerData$1 = new MarketDataApiImpl$queryTickerData$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = marketDataApiImpl$queryTickerData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketDataApiImpl$queryTickerData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            marketDataApiImpl$queryTickerData$1.L$0 = list;
            marketDataApiImpl$queryTickerData$1.Z$0 = z;
            marketDataApiImpl$queryTickerData$1.label = 1;
            if (AEQbTJ(lifecycleOwner, marketDataApiImpl$queryTickerData$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objWithContext);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = marketDataApiImpl$queryTickerData$1.Z$0;
            list = (java.util.List) marketDataApiImpl$queryTickerData$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        if (pWO.KWHzl().OLrzqt() == null) {
            return null;
        }
        CoroutineDispatcher coroutineDispatcherAEQbTJ = C40440qVy.Companion.AEQbTJ();
        MarketDataApiImpl$queryTickerData$2 marketDataApiImpl$queryTickerData$2 = new MarketDataApiImpl$queryTickerData$2(z, list, null);
        marketDataApiImpl$queryTickerData$1.L$0 = null;
        marketDataApiImpl$queryTickerData$1.label = 2;
        objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, marketDataApiImpl$queryTickerData$2, marketDataApiImpl$queryTickerData$1);
        return objWithContext == objCopydefault ? objCopydefault : objWithContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.List<java.lang.String> list, boolean z, @NotNull Continuation<? super Flow<? extends java.util.List<kotlin.Pair<java.lang.String, TickersData>>>> continuation) throws java.lang.Throwable {
        MarketDataApiImpl$subscribeTickerData$1 marketDataApiImpl$subscribeTickerData$1;
        Flow<java.util.List<TickersData>> flowCopydefault;
        if (continuation instanceof MarketDataApiImpl$subscribeTickerData$1) {
            marketDataApiImpl$subscribeTickerData$1 = (MarketDataApiImpl$subscribeTickerData$1) continuation;
            int i = marketDataApiImpl$subscribeTickerData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketDataApiImpl$subscribeTickerData$1.label = i - Integer.MIN_VALUE;
            } else {
                marketDataApiImpl$subscribeTickerData$1 = new MarketDataApiImpl$subscribeTickerData$1(this, continuation);
            }
        }
        java.lang.Object obj = marketDataApiImpl$subscribeTickerData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketDataApiImpl$subscribeTickerData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            marketDataApiImpl$subscribeTickerData$1.L$0 = list;
            marketDataApiImpl$subscribeTickerData$1.Z$0 = z;
            marketDataApiImpl$subscribeTickerData$1.label = 1;
            if (AEQbTJ(lifecycleOwner, marketDataApiImpl$subscribeTickerData$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = marketDataApiImpl$subscribeTickerData$1.Z$0;
            list = (java.util.List) marketDataApiImpl$subscribeTickerData$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (pWO.KWHzl().OLrzqt() == null) {
            return null;
        }
        if (z) {
            flowCopydefault = C55626xnW.copydefault(list, "cup-tickers-3s");
        } else {
            flowCopydefault = C55626xnW.copydefault(list, "tickers-3s");
        }
        return FlowKt.flowOn(new TaskDescription(flowCopydefault, z), C40440qVy.Companion.AEQbTJ());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // o.InterfaceC43032rhd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.List<java.lang.String> list, boolean z, @NotNull Continuation<? super Flow<? extends java.util.List<kotlin.Pair<java.lang.String, TickersData>>>> continuation) throws java.lang.Throwable {
        MarketDataApiImpl$httpThenSubscribeTickerData$1 marketDataApiImpl$httpThenSubscribeTickerData$1;
        java.util.List<java.lang.String> list2;
        boolean z2;
        sZN szn;
        Flow flow;
        Flow flow2;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (continuation instanceof MarketDataApiImpl$httpThenSubscribeTickerData$1) {
            marketDataApiImpl$httpThenSubscribeTickerData$1 = (MarketDataApiImpl$httpThenSubscribeTickerData$1) continuation;
            int i = marketDataApiImpl$httpThenSubscribeTickerData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketDataApiImpl$httpThenSubscribeTickerData$1.label = i - Integer.MIN_VALUE;
            } else {
                marketDataApiImpl$httpThenSubscribeTickerData$1 = new MarketDataApiImpl$httpThenSubscribeTickerData$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = marketDataApiImpl$httpThenSubscribeTickerData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketDataApiImpl$httpThenSubscribeTickerData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            marketDataApiImpl$httpThenSubscribeTickerData$1.L$0 = this;
            marketDataApiImpl$httpThenSubscribeTickerData$1.L$1 = lifecycleOwner2;
            list2 = list;
            marketDataApiImpl$httpThenSubscribeTickerData$1.L$2 = list2;
            z2 = z;
            marketDataApiImpl$httpThenSubscribeTickerData$1.Z$0 = z2;
            marketDataApiImpl$httpThenSubscribeTickerData$1.label = 1;
            if (AEQbTJ(lifecycleOwner2, marketDataApiImpl$httpThenSubscribeTickerData$1) == objCopydefault) {
                return objCopydefault;
            }
            szn = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flow = (Flow) marketDataApiImpl$httpThenSubscribeTickerData$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                flow2 = (Flow) objEZpvd;
                if (flow2 == null) {
                    flow2 = FlowKt.flow(new MarketDataApiImpl$httpThenSubscribeTickerData$wsFlow$1(null));
                }
                return FlowKt.flatMapConcat(FlowKt.flowOf((java.lang.Object[]) new Flow[]{flow, flow2}), new MarketDataApiImpl$httpThenSubscribeTickerData$2(null));
            }
            boolean z3 = marketDataApiImpl$httpThenSubscribeTickerData$1.Z$0;
            java.util.List<java.lang.String> list3 = (java.util.List) marketDataApiImpl$httpThenSubscribeTickerData$1.L$2;
            LifecycleOwner lifecycleOwner3 = (LifecycleOwner) marketDataApiImpl$httpThenSubscribeTickerData$1.L$1;
            sZN szn2 = (sZN) marketDataApiImpl$httpThenSubscribeTickerData$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            list2 = list3;
            z2 = z3;
            lifecycleOwner2 = lifecycleOwner3;
            szn = szn2;
        }
        if (pWO.KWHzl().OLrzqt() == null) {
            return null;
        }
        Flow flowAsFlow = FlowKt.asFlow(new MarketDataApiImpl$httpThenSubscribeTickerData$httpFlow$1(szn, lifecycleOwner2, list2, z2, null));
        marketDataApiImpl$httpThenSubscribeTickerData$1.L$0 = flowAsFlow;
        marketDataApiImpl$httpThenSubscribeTickerData$1.L$1 = null;
        marketDataApiImpl$httpThenSubscribeTickerData$1.L$2 = null;
        marketDataApiImpl$httpThenSubscribeTickerData$1.label = 2;
        objEZpvd = szn.EZpvd(lifecycleOwner2, list2, z2, marketDataApiImpl$httpThenSubscribeTickerData$1);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        flow = flowAsFlow;
        flow2 = (Flow) objEZpvd;
        if (flow2 == null) {
        }
        return FlowKt.flatMapConcat(FlowKt.flowOf((java.lang.Object[]) new Flow[]{flow, flow2}), new MarketDataApiImpl$httpThenSubscribeTickerData$2(null));
    }

    public final java.lang.Object AEQbTJ(LifecycleOwner lifecycleOwner, Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new MarketDataApiImpl$tryInitOkTrade$2(lifecycleOwner, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }
}
