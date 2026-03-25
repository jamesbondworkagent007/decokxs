package com.okinc.kline.ui.component.business.klinequote;

import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C43251rlk;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC39502ptZ;
import o.InterfaceC40387qTz;
import o.InterfaceC49425uoM;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;
import o.pUU;
import o.pWP;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineQuoteDataComponent$checkIsWatched$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ KlineQuoteDataComponent this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineQuoteDataComponent$checkIsWatched$1(KlineQuoteDataComponent klineQuoteDataComponent, Continuation<? super KlineQuoteDataComponent$checkIsWatched$1> continuation) {
        super(2, continuation);
        this.this$0 = klineQuoteDataComponent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineQuoteDataComponent$checkIsWatched$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KlineQuoteDataComponent$checkIsWatched$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        KlineQuoteDataComponent klineQuoteDataComponent;
        Object objQueryWatchList$default;
        KlineQuoteDataComponent klineQuoteDataComponent2;
        KlineQuoteDataComponent klineQuoteDataComponent3;
        KlineQuoteDataComponent klineQuoteDataComponent4;
        Throwable th;
        Object objM7377constructorimpl;
        String instrumentType;
        pWP pwp;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        BizInstrument suggestedInstrument$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            klineQuoteDataComponent4 = (KlineQuoteDataComponent) this.L$2;
            klineQuoteDataComponent2 = (KlineQuoteDataComponent) this.L$1;
            klineQuoteDataComponent3 = (KlineQuoteDataComponent) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                klineQuoteDataComponent = klineQuoteDataComponent4;
                objQueryWatchList$default = obj;
            } catch (Throwable th2) {
                th = th2;
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                klineQuoteDataComponent = klineQuoteDataComponent4;
            }
        } else {
            C56391yDq.AEQbTJ(obj);
            try {
                klineQuoteDataComponent = this.this$0;
                try {
                    Result.Application application2 = Result.Companion;
                    InterfaceC40387qTz interfaceC40387qTzFFgQHt = klineQuoteDataComponent.fFgQHt();
                    this.L$0 = klineQuoteDataComponent;
                    this.L$1 = klineQuoteDataComponent;
                    this.L$2 = klineQuoteDataComponent;
                    this.label = 1;
                    objQueryWatchList$default = InterfaceC40387qTz.Activity.queryWatchList$default(interfaceC40387qTzFFgQHt, true, false, this, 2, null);
                    if (objQueryWatchList$default == objCopydefault) {
                        return objCopydefault;
                    }
                    klineQuoteDataComponent2 = klineQuoteDataComponent;
                    klineQuoteDataComponent3 = klineQuoteDataComponent2;
                } catch (Throwable th3) {
                    th = th3;
                    klineQuoteDataComponent4 = klineQuoteDataComponent;
                    Result.Application application3 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    klineQuoteDataComponent = klineQuoteDataComponent4;
                }
            } catch (Exception e) {
                e.printStackTrace();
                pUU.copydefault(this.this$0.OLrzqt().getTAG(), "checkIsWatched: " + e.getMessage());
            }
        }
        klineQuoteDataComponent2.AEQbTJ((List<WatchListData>) objQueryWatchList$default);
        MarketCoinInfo marketCoinInfoHDKMBd = klineQuoteDataComponent3.hDKMBd();
        Object obj2 = null;
        if (Intrinsics.EZpvd((Object) (marketCoinInfoHDKMBd != null ? marketCoinInfoHDKMBd.getInstrumentType() : null), (Object) "MARGIN")) {
            instrumentType = "SPOT";
        } else {
            MarketCoinInfo marketCoinInfoHDKMBd2 = klineQuoteDataComponent3.hDKMBd();
            instrumentType = marketCoinInfoHDKMBd2 != null ? marketCoinInfoHDKMBd2.getInstrumentType() : null;
        }
        List<WatchListData> listZsXlph = klineQuoteDataComponent3.zsXlph();
        ArrayList<WatchListData> arrayList = new ArrayList();
        for (Object obj3 : listZsXlph) {
            if (Intrinsics.EZpvd((Object) ((WatchListData) obj3).getInstType(), (Object) instrumentType)) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (WatchListData watchListData : arrayList) {
            if (Intrinsics.EZpvd((Object) watchListData.getInstType(), (Object) "FUTURES")) {
                InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                pwp = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, "FUTURES", null, watchListData.getInstId(), watchListData.getAlias(), 2, null)) == null) ? null : new pWP(suggestedInstrument$default.getInstId(), suggestedInstrument$default.getInstType(), null, null, null, 28, null);
            } else {
                pwp = new pWP(watchListData.getInstId(), watchListData.getInstType(), null, null, null, 28, null);
            }
            arrayList2.add(pwp);
        }
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            pWP pwp2 = (pWP) next;
            String strAEQbTJ = pwp2 != null ? pwp2.AEQbTJ() : null;
            MarketCoinInfo marketCoinInfoHDKMBd3 = klineQuoteDataComponent3.hDKMBd();
            if (Intrinsics.EZpvd((Object) strAEQbTJ, (Object) (marketCoinInfoHDKMBd3 != null ? marketCoinInfoHDKMBd3.getInstrumentId() : null))) {
                if (Intrinsics.EZpvd((Object) (pwp2 != null ? pwp2.KWHzl() : null), (Object) instrumentType)) {
                    obj2 = next;
                    break;
                }
            }
        }
        if (obj2 == null) {
            z = false;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(z));
        Boolean boolKWHzl = C56443yFo.KWHzl(false);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = boolKWHzl;
        }
        klineQuoteDataComponent.AEQbTJ(((Boolean) objM7377constructorimpl).booleanValue());
        InterfaceC39502ptZ interfaceC39502ptZCopydefault = this.this$0.copydefault();
        if (interfaceC39502ptZCopydefault != null) {
            interfaceC39502ptZCopydefault.KWHzl(0, this.this$0.fARcdN());
        }
        return Unit.INSTANCE;
    }
}
