package com.okinc.kline.ui.component.business.klinequote.chart;

import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.news.data.KlineActiveListData;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54531xLw;
import o.C33129mqd;
import o.C39240poa;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC39563puh;
import o.InterfaceC54581xNr;
import o.pWO;

/* JADX INFO: loaded from: classes8.dex */
public final class ChartUIComponent$initData$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChartUIComponent this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartUIComponent$initData$4(ChartUIComponent chartUIComponent, Continuation<? super ChartUIComponent$initData$4> continuation) {
        super(2, continuation);
        this.this$0 = chartUIComponent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChartUIComponent$initData$4(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChartUIComponent$initData$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        KlineActiveListData klineActiveListData;
        String str;
        MarketCoinInfo marketCoinInfoHDKMBd;
        String quoteSymbol;
        InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH;
        String instrumentType;
        String instrumentId;
        String instrumentType2;
        String instrumentId2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        String instrumentType3;
        String instrumentId3;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        BizInstrument bizInstrumentValueOf2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MarketCoinInfo marketCoinInfoHDKMBd2 = this.this$0.AYXKKw().hDKMBd();
            klineActiveListData = null;
            if (marketCoinInfoHDKMBd2 != null && (instrumentType3 = marketCoinInfoHDKMBd2.getInstrumentType()) != null) {
                MarketCoinInfo marketCoinInfoHDKMBd3 = this.this$0.AYXKKw().hDKMBd();
                String tradeSymbol = (marketCoinInfoHDKMBd3 == null || (instrumentId3 = marketCoinInfoHDKMBd3.getInstrumentId()) == null || (interfaceC54581xNrOLrzqt2 = pWO.KWHzl().OLrzqt()) == null || (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt2.OLrzqt(instrumentType3)) == null || (bizInstrumentValueOf2 = abstractC54531xLwOLrzqt2.valueOf(instrumentId3)) == null) ? null : bizInstrumentValueOf2.getTradeSymbol();
                if (tradeSymbol != null) {
                    str = tradeSymbol;
                }
                marketCoinInfoHDKMBd = this.this$0.AYXKKw().hDKMBd();
                if (marketCoinInfoHDKMBd == null) {
                    quoteSymbol = "";
                    if (C33129mqd.OLrzqt((CharSequence) str)) {
                    }
                }
            } else {
                str = "";
                marketCoinInfoHDKMBd = this.this$0.AYXKKw().hDKMBd();
                if (marketCoinInfoHDKMBd == null && (instrumentType2 = marketCoinInfoHDKMBd.getInstrumentType()) != null) {
                    MarketCoinInfo marketCoinInfoHDKMBd4 = this.this$0.AYXKKw().hDKMBd();
                    quoteSymbol = (marketCoinInfoHDKMBd4 == null || (instrumentId2 = marketCoinInfoHDKMBd4.getInstrumentId()) == null || (interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt()) == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instrumentType2)) == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(instrumentId2)) == null) ? null : bizInstrumentValueOf.getQuoteSymbol();
                    if (quoteSymbol == null) {
                    }
                    if (C33129mqd.OLrzqt((CharSequence) str)) {
                        stateListAnimatorUzCIH = this.this$0.AYXKKw().uzCIH();
                        if (stateListAnimatorUzCIH != null) {
                        }
                        this.this$0.AYXKKw().AubY().OLrzqt().postValue(C56390yDp.OLrzqt(C56443yFo.KWHzl(this.this$0.AYXKKw().AubY().OLrzqt().getValue() == null), C39240poa.OLrzqt.AEQbTJ(klineActiveListData)));
                    }
                } else {
                    quoteSymbol = "";
                    if (C33129mqd.OLrzqt((CharSequence) str) && C33129mqd.OLrzqt((CharSequence) quoteSymbol)) {
                        stateListAnimatorUzCIH = this.this$0.AYXKKw().uzCIH();
                        if (stateListAnimatorUzCIH != null) {
                            MarketCoinInfo marketCoinInfoHDKMBd5 = this.this$0.AYXKKw().hDKMBd();
                            String str2 = (marketCoinInfoHDKMBd5 == null || (instrumentId = marketCoinInfoHDKMBd5.getInstrumentId()) == null) ? "" : instrumentId;
                            MarketCoinInfo marketCoinInfoHDKMBd6 = this.this$0.AYXKKw().hDKMBd();
                            String str3 = (marketCoinInfoHDKMBd6 == null || (instrumentType = marketCoinInfoHDKMBd6.getInstrumentType()) == null) ? "" : instrumentType;
                            this.label = 1;
                            obj = InterfaceC39563puh.StateListAnimator.TaskDescription.getKlineActiveList$default(stateListAnimatorUzCIH, str, "kline_page", str2, str3, null, null, this, 48, null);
                            if (obj == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        this.this$0.AYXKKw().AubY().OLrzqt().postValue(C56390yDp.OLrzqt(C56443yFo.KWHzl(this.this$0.AYXKKw().AubY().OLrzqt().getValue() == null), C39240poa.OLrzqt.AEQbTJ(klineActiveListData)));
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        klineActiveListData = (KlineActiveListData) obj;
        this.this$0.AYXKKw().AubY().OLrzqt().postValue(C56390yDp.OLrzqt(C56443yFo.KWHzl(this.this$0.AYXKKw().AubY().OLrzqt().getValue() == null), C39240poa.OLrzqt.AEQbTJ(klineActiveListData)));
        return Unit.INSTANCE;
    }
}
