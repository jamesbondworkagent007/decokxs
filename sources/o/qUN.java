package o;

import com.okinc.market.common.MarketHttpApi;
import com.okinc.market.ticker.datasource.impl.WatchListTickerDataSource$bindTickers$1;
import com.okinc.market.ticker.datasource.impl.WatchListTickerDataSource$requestCupTicker$1;
import com.okinc.market.ticker.datasource.impl.WatchListTickerDataSource$requestMpTicker$1;
import com.okinc.market.ticker.datasource.impl.WatchListTickerDataSource$requestTicker$1;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.TickerCupReq;
import com.okinc.unify_trade.biz.subscribe.TickerInstReq;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qUN {
    private static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final qUV AEQbTJ;
    public final InterfaceC56387yDm KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final qUV KWHzl() {
        return this.AEQbTJ;
    }

    @yCM
    public qUN(@NotNull qUV quv) {
        Intrinsics.checkNotNullParameter(quv, "");
        this.AEQbTJ = quv;
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.qUU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return qUN.copydefault();
            }
        });
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qUN.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final MarketHttpApi OLrzqt() {
        return (MarketHttpApi) this.KWHzl.getValue();
    }

    public static final MarketHttpApi copydefault() {
        return (MarketHttpApi) C43417ror.OLrzqt(C56524yIo.AEQbTJ(MarketHttpApi.class));
    }

    public Flow<java.util.List<TickersData>> copydefault(@NotNull Flow<? extends java.util.List<? extends BizInstrument>> flow) {
        Intrinsics.checkNotNullParameter(flow, "");
        return FlowKt.flatMapConcat(FlowKt.distinctUntilChanged(flow), new WatchListTickerDataSource$bindTickers$1(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(java.util.List<java.lang.String> list, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WatchListTickerDataSource$requestMpTicker$1 watchListTickerDataSource$requestMpTicker$1;
        qUN qun;
        if (continuation instanceof WatchListTickerDataSource$requestMpTicker$1) {
            watchListTickerDataSource$requestMpTicker$1 = (WatchListTickerDataSource$requestMpTicker$1) continuation;
            int i = watchListTickerDataSource$requestMpTicker$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchListTickerDataSource$requestMpTicker$1.label = i - Integer.MIN_VALUE;
            } else {
                watchListTickerDataSource$requestMpTicker$1 = new WatchListTickerDataSource$requestMpTicker$1(this, continuation);
            }
        }
        java.lang.Object markPriceMultTicker = watchListTickerDataSource$requestMpTicker$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = watchListTickerDataSource$requestMpTicker$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(markPriceMultTicker);
            if (!list.isEmpty()) {
                MarketHttpApi marketHttpApiOLrzqt = OLrzqt();
                java.lang.String strAEQbTJ = qTN.AEQbTJ(new TickerInstReq(list));
                watchListTickerDataSource$requestMpTicker$1.L$0 = this;
                watchListTickerDataSource$requestMpTicker$1.label = 1;
                markPriceMultTicker = marketHttpApiOLrzqt.getMarkPriceMultTicker(strAEQbTJ, watchListTickerDataSource$requestMpTicker$1);
                if (markPriceMultTicker == objCopydefault) {
                    return objCopydefault;
                }
                qun = this;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        qun = (qUN) watchListTickerDataSource$requestMpTicker$1.L$0;
        C56391yDq.AEQbTJ(markPriceMultTicker);
        java.util.List<TickersData> list2 = (java.util.List) ((ResponseData) markPriceMultTicker).getData();
        if (list2 != null) {
            for (TickersData tickersData : list2) {
                qun.AEQbTJ.OLrzqt(tickersData.getInstId(), tickersData);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.util.List<java.lang.String> list, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WatchListTickerDataSource$requestTicker$1 watchListTickerDataSource$requestTicker$1;
        qUN qun;
        if (continuation instanceof WatchListTickerDataSource$requestTicker$1) {
            watchListTickerDataSource$requestTicker$1 = (WatchListTickerDataSource$requestTicker$1) continuation;
            int i = watchListTickerDataSource$requestTicker$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchListTickerDataSource$requestTicker$1.label = i - Integer.MIN_VALUE;
            } else {
                watchListTickerDataSource$requestTicker$1 = new WatchListTickerDataSource$requestTicker$1(this, continuation);
            }
        }
        java.lang.Object objBatchMarketTickersCor = watchListTickerDataSource$requestTicker$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = watchListTickerDataSource$requestTicker$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objBatchMarketTickersCor);
            if (!list.isEmpty()) {
                MarketHttpApi marketHttpApiOLrzqt = OLrzqt();
                java.lang.String strAEQbTJ = qTN.AEQbTJ(new TickerInstReq(list));
                watchListTickerDataSource$requestTicker$1.L$0 = this;
                watchListTickerDataSource$requestTicker$1.label = 1;
                objBatchMarketTickersCor = marketHttpApiOLrzqt.batchMarketTickersCor(strAEQbTJ, watchListTickerDataSource$requestTicker$1);
                if (objBatchMarketTickersCor == objCopydefault) {
                    return objCopydefault;
                }
                qun = this;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        qun = (qUN) watchListTickerDataSource$requestTicker$1.L$0;
        C56391yDq.AEQbTJ(objBatchMarketTickersCor);
        java.util.List<TickersData> list2 = (java.util.List) ((ResponseData) objBatchMarketTickersCor).getData();
        if (list2 != null) {
            for (TickersData tickersData : list2) {
                qun.AEQbTJ.OLrzqt(tickersData.getInstId(), tickersData);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.util.List<java.lang.String> list, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WatchListTickerDataSource$requestCupTicker$1 watchListTickerDataSource$requestCupTicker$1;
        qUN qun;
        qUN qun2;
        java.util.List<TickersData> list2;
        java.util.List<TickersData> list3;
        if (continuation instanceof WatchListTickerDataSource$requestCupTicker$1) {
            watchListTickerDataSource$requestCupTicker$1 = (WatchListTickerDataSource$requestCupTicker$1) continuation;
            int i = watchListTickerDataSource$requestCupTicker$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchListTickerDataSource$requestCupTicker$1.label = i - Integer.MIN_VALUE;
            } else {
                watchListTickerDataSource$requestCupTicker$1 = new WatchListTickerDataSource$requestCupTicker$1(this, continuation);
            }
        }
        java.lang.Object objBatchMarketCupTickersCor = watchListTickerDataSource$requestCupTicker$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = watchListTickerDataSource$requestCupTicker$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objBatchMarketCupTickersCor);
            if (list.size() > 50) {
                MarketHttpApi marketHttpApiOLrzqt = OLrzqt();
                watchListTickerDataSource$requestCupTicker$1.L$0 = this;
                watchListTickerDataSource$requestCupTicker$1.label = 1;
                objBatchMarketCupTickersCor = marketHttpApiOLrzqt.batchMarketAllCupTickersCor(watchListTickerDataSource$requestCupTicker$1);
                if (objBatchMarketCupTickersCor == objCopydefault) {
                    return objCopydefault;
                }
                qun2 = this;
                list2 = (java.util.List) ((ResponseData) objBatchMarketCupTickersCor).getData();
                if (list2 != null) {
                }
            } else if (!list.isEmpty()) {
                MarketHttpApi marketHttpApiOLrzqt2 = OLrzqt();
                java.lang.String strCopydefault = qTN.copydefault(new TickerCupReq(list));
                watchListTickerDataSource$requestCupTicker$1.L$0 = this;
                watchListTickerDataSource$requestCupTicker$1.label = 2;
                objBatchMarketCupTickersCor = marketHttpApiOLrzqt2.batchMarketCupTickersCor(strCopydefault, watchListTickerDataSource$requestCupTicker$1);
                if (objBatchMarketCupTickersCor == objCopydefault) {
                    return objCopydefault;
                }
                qun = this;
                list3 = (java.util.List) ((ResponseData) objBatchMarketCupTickersCor).getData();
                if (list3 != null) {
                }
            }
        } else if (i2 == 1) {
            qun2 = (qUN) watchListTickerDataSource$requestCupTicker$1.L$0;
            C56391yDq.AEQbTJ(objBatchMarketCupTickersCor);
            list2 = (java.util.List) ((ResponseData) objBatchMarketCupTickersCor).getData();
            if (list2 != null) {
                for (TickersData tickersData : list2) {
                    qun2.AEQbTJ.OLrzqt(tickersData.getCcy(), tickersData);
                }
            }
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qun = (qUN) watchListTickerDataSource$requestCupTicker$1.L$0;
            C56391yDq.AEQbTJ(objBatchMarketCupTickersCor);
            list3 = (java.util.List) ((ResponseData) objBatchMarketCupTickersCor).getData();
            if (list3 != null) {
                for (TickersData tickersData2 : list3) {
                    qun.AEQbTJ.OLrzqt(tickersData2.getCcy(), tickersData2);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
