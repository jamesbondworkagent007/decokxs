package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.market.quotation.data.model.PeriodTickersPo;
import com.okinc.market.ticker.datasource.api.MarketTickerWsApi$DefaultImpls$createPeriodTickersFlow$$inlined$map$1$2$1;
import com.okinc.market.ticker.datasource.api.MarketTickerWsApi$DefaultImpls$createTickersFlow$$inlined$map$1$2$1;
import com.okinc.market.ticker.datasource.api.MarketTickerWsApi$createPeriodTickersFlow$1;
import com.okinc.market.ticker.datasource.api.MarketTickerWsApi$createPeriodTickersFlow$2;
import com.okinc.market.ticker.datasource.api.MarketTickerWsApi$createPeriodTickersFlow$3;
import com.okinc.market.ticker.datasource.api.MarketTickerWsApi$createTickersFlow$1;
import com.okinc.market.ticker.datasource.api.MarketTickerWsApi$createTickersFlow$2;
import com.okinc.market.ticker.datasource.api.MarketTickerWsApi$createTickersFlow$3;
import com.okinc.market.time.filter.PeriodEnum;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qUp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC40404qUp {
    public static final /* synthetic */ Activity Companion = Activity.EZpvd;

    /* JADX INFO: renamed from: o.qUp$Activity */
    public static final class Activity {
        public static final /* synthetic */ Activity EZpvd = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.qUp$TaskDescription */
    public static final class TaskDescription {

        /* JADX INFO: renamed from: o.qUp$TaskDescription$Activity */
        public static final class Activity implements Flow<TickersData> {
            public final /* synthetic */ Flow copydefault;

            /* JADX INFO: renamed from: o.qUp$TaskDescription$Activity$5, reason: invalid class name */
            public static final class AnonymousClass5<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector OLrzqt;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass5(FlowCollector flowCollector) {
                    this.OLrzqt = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                    MarketTickerWsApi$DefaultImpls$createTickersFlow$$inlined$map$1$2$1 marketTickerWsApi$DefaultImpls$createTickersFlow$$inlined$map$1$2$1;
                    if (continuation instanceof MarketTickerWsApi$DefaultImpls$createTickersFlow$$inlined$map$1$2$1) {
                        marketTickerWsApi$DefaultImpls$createTickersFlow$$inlined$map$1$2$1 = (MarketTickerWsApi$DefaultImpls$createTickersFlow$$inlined$map$1$2$1) continuation;
                        int i = marketTickerWsApi$DefaultImpls$createTickersFlow$$inlined$map$1$2$1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            marketTickerWsApi$DefaultImpls$createTickersFlow$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                        } else {
                            marketTickerWsApi$DefaultImpls$createTickersFlow$$inlined$map$1$2$1 = new MarketTickerWsApi$DefaultImpls$createTickersFlow$$inlined$map$1$2$1(this, continuation);
                        }
                    }
                    java.lang.Object obj2 = marketTickerWsApi$DefaultImpls$createTickersFlow$$inlined$map$1$2$1.result;
                    java.lang.Object objCopydefault = C56442yFn.copydefault();
                    int i2 = marketTickerWsApi$DefaultImpls$createTickersFlow$$inlined$map$1$2$1.label;
                    if (i2 == 0) {
                        C56391yDq.AEQbTJ(obj2);
                        FlowCollector flowCollector = this.OLrzqt;
                        TickersData tickersDataOLrzqt = TickersData.Companion.OLrzqt(((OKIncomingData) obj).getPayload().toString());
                        marketTickerWsApi$DefaultImpls$createTickersFlow$$inlined$map$1$2$1.label = 1;
                        if (flowCollector.emit(tickersDataOLrzqt, marketTickerWsApi$DefaultImpls$createTickersFlow$$inlined$map$1$2$1) == objCopydefault) {
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
            public java.lang.Object collect(FlowCollector<? super TickersData> flowCollector, Continuation continuation) {
                java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass5(flowCollector), continuation);
                return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: o.qUp$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class C0924TaskDescription implements Flow<java.util.List<? extends PeriodTickersPo>> {
            public final /* synthetic */ Flow AEQbTJ;

            /* JADX INFO: renamed from: o.qUp$TaskDescription$TaskDescription$4, reason: invalid class name */
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
                    MarketTickerWsApi$DefaultImpls$createPeriodTickersFlow$$inlined$map$1$2$1 marketTickerWsApi$DefaultImpls$createPeriodTickersFlow$$inlined$map$1$2$1;
                    if (continuation instanceof MarketTickerWsApi$DefaultImpls$createPeriodTickersFlow$$inlined$map$1$2$1) {
                        marketTickerWsApi$DefaultImpls$createPeriodTickersFlow$$inlined$map$1$2$1 = (MarketTickerWsApi$DefaultImpls$createPeriodTickersFlow$$inlined$map$1$2$1) continuation;
                        int i = marketTickerWsApi$DefaultImpls$createPeriodTickersFlow$$inlined$map$1$2$1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            marketTickerWsApi$DefaultImpls$createPeriodTickersFlow$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                        } else {
                            marketTickerWsApi$DefaultImpls$createPeriodTickersFlow$$inlined$map$1$2$1 = new MarketTickerWsApi$DefaultImpls$createPeriodTickersFlow$$inlined$map$1$2$1(this, continuation);
                        }
                    }
                    java.lang.Object obj2 = marketTickerWsApi$DefaultImpls$createPeriodTickersFlow$$inlined$map$1$2$1.result;
                    java.lang.Object objCopydefault = C56442yFn.copydefault();
                    int i2 = marketTickerWsApi$DefaultImpls$createPeriodTickersFlow$$inlined$map$1$2$1.label;
                    if (i2 == 0) {
                        C56391yDq.AEQbTJ(obj2);
                        FlowCollector flowCollector = this.OLrzqt;
                        java.util.List<PeriodTickersPo> listOLrzqt = PeriodTickersPo.Companion.OLrzqt(((OKIncomingData) obj).getPayload().toString());
                        marketTickerWsApi$DefaultImpls$createPeriodTickersFlow$$inlined$map$1$2$1.label = 1;
                        if (flowCollector.emit(listOLrzqt, marketTickerWsApi$DefaultImpls$createPeriodTickersFlow$$inlined$map$1$2$1) == objCopydefault) {
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

            public C0924TaskDescription(Flow flow) {
                this.AEQbTJ = flow;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(FlowCollector<? super java.util.List<? extends PeriodTickersPo>> flowCollector, Continuation continuation) {
                java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass4(flowCollector), continuation);
                return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
            }
        }

        public static Flow<TickersData> copydefault(@NotNull InterfaceC40404qUp interfaceC40404qUp, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            java.util.List listEZpvd = C56402yEa.EZpvd(new WsArgV5("tickers-3s", null, null, str, null, null, null, null, 246, null));
            qTL.copydefault.AEQbTJ("MarketTickerWsApi", "createAllPairTickerFlow, instBiz: " + str);
            return copydefault(interfaceC40404qUp, "tickers-3s", listEZpvd);
        }

        public static Flow<java.util.List<PeriodTickersPo>> EZpvd(@NotNull InterfaceC40404qUp interfaceC40404qUp, @NotNull java.lang.String str, @NotNull PeriodEnum periodEnum) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(periodEnum, "");
            java.util.List listEZpvd = C56402yEa.EZpvd(new WsArgV5("price-change-turnover", null, null, str, null, null, null, null, 246, null));
            qTL.copydefault.AEQbTJ("MarketTickerWsApi", "createAllPeriodTickerFlow, period=" + periodEnum.getInputPara() + ", instBiz=" + str);
            return KWHzl(interfaceC40404qUp, "price-change-turnover", listEZpvd);
        }

        public static Flow<java.util.List<PeriodTickersPo>> KWHzl(InterfaceC40404qUp interfaceC40404qUp, java.lang.String str, java.util.List<? extends WsArgV5> list) {
            return FlowKt.filterNotNull(new C0924TaskDescription(FlowKt.onCompletion(FlowKt.onStart(FlowKt.callbackFlow(new MarketTickerWsApi$createPeriodTickersFlow$1(str, new java.util.ArrayList(list), null)), new MarketTickerWsApi$createPeriodTickersFlow$2(str, null)), new MarketTickerWsApi$createPeriodTickersFlow$3(str, null))));
        }

        public static Flow<TickersData> copydefault(InterfaceC40404qUp interfaceC40404qUp, java.lang.String str, java.util.List<? extends WsArgV5> list) {
            return FlowKt.filterNotNull(new Activity(FlowKt.onCompletion(FlowKt.onStart(FlowKt.callbackFlow(new MarketTickerWsApi$createTickersFlow$1(str, new java.util.ArrayList(list), null)), new MarketTickerWsApi$createTickersFlow$2(str, null)), new MarketTickerWsApi$createTickersFlow$3(str, null))));
        }

        public static Flow<TickersData> OLrzqt(@NotNull InterfaceC40404qUp interfaceC40404qUp, @NotNull java.util.List<java.lang.String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new WsArgV5("tickers-3s", (java.lang.String) it.next(), null, null, null, null, null, null, 252, null));
            }
            qTL.copydefault.AEQbTJ("MarketTickerWsApi", "createBatchPariTickerFlow, instIdList: " + list);
            return copydefault(interfaceC40404qUp, "tickers-3s", arrayList);
        }

        public static Flow<TickersData> KWHzl(@NotNull InterfaceC40404qUp interfaceC40404qUp, @NotNull java.util.List<java.lang.String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new WsArgV5("cup-tickers-3s", null, null, null, (java.lang.String) it.next(), null, null, null, 238, null));
            }
            qTL.copydefault.AEQbTJ("MarketTickerWsApi", "createBatchCupTickerFlow, ccyList: " + list);
            return copydefault(interfaceC40404qUp, "cup-tickers-3s", arrayList);
        }

        public static Flow<TickersData> EZpvd(@NotNull InterfaceC40404qUp interfaceC40404qUp, @NotNull java.util.List<java.lang.String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new WsArgV5("mp-tickers-3s", (java.lang.String) it.next(), null, null, null, null, null, null, 252, null));
            }
            qTL.copydefault.AEQbTJ("MarketTickerWsApi", "createMarkPriceTickerFlow, instIdList: " + list);
            return copydefault(interfaceC40404qUp, "mp-tickers-3s", arrayList);
        }

        public static Flow<java.util.List<PeriodTickersPo>> AEQbTJ(@NotNull InterfaceC40404qUp interfaceC40404qUp, @NotNull java.util.List<java.lang.String> list, @NotNull PeriodEnum periodEnum) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(periodEnum, "");
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new WsArgV5("price-change-turnover", (java.lang.String) it.next(), null, null, null, null, null, null, 252, null));
            }
            qTL.copydefault.AEQbTJ("MarketTickerWsApi", "createBatchPeriodTickerFlow, period=" + periodEnum.getInputPara() + ", instIdList=" + list.size());
            return KWHzl(interfaceC40404qUp, "price-change-turnover", arrayList);
        }
    }
}
