package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.market.quotation.data.model.stock.StockListPo;
import com.okinc.market.ticker.datasource.api.MarketRankTickerWsApi$DefaultImpls$createTickersFlow$$inlined$map$1$2$1;
import com.okinc.market.ticker.datasource.api.MarketRankTickerWsApi$createTickersFlow$1;
import com.okinc.market.ticker.datasource.api.MarketRankTickerWsApi$createTickersFlow$2;
import com.okinc.market.ticker.datasource.api.MarketRankTickerWsApi$createTickersFlow$3;
import com.okinc.unify_trade.core.wsnew.EntityWsArg;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qUh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC40396qUh {
    public static final /* synthetic */ ActionBar Companion = ActionBar.KWHzl;

    /* JADX INFO: renamed from: o.qUh$ActionBar */
    public static final class ActionBar {
        public static final /* synthetic */ ActionBar KWHzl = new ActionBar();

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.qUh$Application */
    public static final class Application {
        public static Flow<java.util.List<StockListPo>> AEQbTJ(@NotNull InterfaceC40396qUh interfaceC40396qUh) {
            return copydefault(interfaceC40396qUh, "stock-coin-rank");
        }

        public static Flow<java.util.List<StockListPo>> copydefault(InterfaceC40396qUh interfaceC40396qUh, java.lang.String str) {
            OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(OKComplianceRestrictionService.class));
            java.lang.String strAuCTelauCTel = oKComplianceRestrictionService != null ? oKComplianceRestrictionService.AuCTelauCTel() : null;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (strAuCTelauCTel == null || strAuCTelauCTel.length() == 0) {
                arrayList.add(new WsArgV5(str, null, null, null, "USDT", null, null, null, 238, null));
            } else {
                arrayList.add(new EntityWsArg(str, null, null, null, "USDT", null, null, null, strAuCTelauCTel, 238, null));
            }
            return FlowKt.filterNotNull(new ActionBar(FlowKt.onCompletion(FlowKt.onStart(FlowKt.callbackFlow(new MarketRankTickerWsApi$createTickersFlow$1(str, arrayList, null)), new MarketRankTickerWsApi$createTickersFlow$2(str, null)), new MarketRankTickerWsApi$createTickersFlow$3(str, null))));
        }

        /* JADX INFO: renamed from: o.qUh$Application$ActionBar */
        public static final class ActionBar implements Flow<java.util.List<? extends StockListPo>> {
            public final /* synthetic */ Flow AEQbTJ;

            /* JADX INFO: renamed from: o.qUh$Application$ActionBar$4, reason: invalid class name */
            public static final class AnonymousClass4<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector copydefault;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass4(FlowCollector flowCollector) {
                    this.copydefault = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                    MarketRankTickerWsApi$DefaultImpls$createTickersFlow$$inlined$map$1$2$1 marketRankTickerWsApi$DefaultImpls$createTickersFlow$$inlined$map$1$2$1;
                    if (continuation instanceof MarketRankTickerWsApi$DefaultImpls$createTickersFlow$$inlined$map$1$2$1) {
                        marketRankTickerWsApi$DefaultImpls$createTickersFlow$$inlined$map$1$2$1 = (MarketRankTickerWsApi$DefaultImpls$createTickersFlow$$inlined$map$1$2$1) continuation;
                        int i = marketRankTickerWsApi$DefaultImpls$createTickersFlow$$inlined$map$1$2$1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            marketRankTickerWsApi$DefaultImpls$createTickersFlow$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                        } else {
                            marketRankTickerWsApi$DefaultImpls$createTickersFlow$$inlined$map$1$2$1 = new MarketRankTickerWsApi$DefaultImpls$createTickersFlow$$inlined$map$1$2$1(this, continuation);
                        }
                    }
                    java.lang.Object obj2 = marketRankTickerWsApi$DefaultImpls$createTickersFlow$$inlined$map$1$2$1.result;
                    java.lang.Object objCopydefault = C56442yFn.copydefault();
                    int i2 = marketRankTickerWsApi$DefaultImpls$createTickersFlow$$inlined$map$1$2$1.label;
                    if (i2 == 0) {
                        C56391yDq.AEQbTJ(obj2);
                        FlowCollector flowCollector = this.copydefault;
                        java.util.List<StockListPo> listOLrzqt = StockListPo.Companion.OLrzqt(((OKIncomingData) obj).getPayload().toString());
                        marketRankTickerWsApi$DefaultImpls$createTickersFlow$$inlined$map$1$2$1.label = 1;
                        if (flowCollector.emit(listOLrzqt, marketRankTickerWsApi$DefaultImpls$createTickersFlow$$inlined$map$1$2$1) == objCopydefault) {
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
                this.AEQbTJ = flow;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(FlowCollector<? super java.util.List<? extends StockListPo>> flowCollector, Continuation continuation) {
                java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass4(flowCollector), continuation);
                return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
            }
        }
    }
}
