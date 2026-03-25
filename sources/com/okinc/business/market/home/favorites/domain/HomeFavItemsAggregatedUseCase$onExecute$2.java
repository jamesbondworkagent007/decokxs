package com.okinc.business.market.home.favorites.domain;

import com.okinc.business.market.bean.CoinQuote;
import com.okinc.unify_trade.biz.BizInstrument;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScopeKt;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.kER;
import o.pUU;
import o.qWC;
import o.qWG;
import o.qWH;
import o.qWK;
import o.yHS;

/* JADX INFO: loaded from: classes7.dex */
public final class HomeFavItemsAggregatedUseCase$onExecute$2 extends SuspendLambda implements yHS<List<? extends qWH>, List<? extends BizInstrument>, List<? extends CoinQuote>, List<? extends qWH>, Continuation<? super List<? extends qWH>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;
    final /* synthetic */ kER this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFavItemsAggregatedUseCase$onExecute$2(kER ker, Continuation<? super HomeFavItemsAggregatedUseCase$onExecute$2> continuation) {
        super(5, continuation);
        this.this$0 = ker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHS
    public /* bridge */ /* synthetic */ Object invoke(List<? extends qWH> list, List<? extends BizInstrument> list2, List<? extends CoinQuote> list3, List<? extends qWH> list4, Continuation<? super List<? extends qWH>> continuation) {
        return invoke2(list, list2, (List<CoinQuote>) list3, list4, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<? extends qWH> list, List<? extends BizInstrument> list2, List<CoinQuote> list3, List<? extends qWH> list4, Continuation<? super List<? extends qWH>> continuation) {
        HomeFavItemsAggregatedUseCase$onExecute$2 homeFavItemsAggregatedUseCase$onExecute$2 = new HomeFavItemsAggregatedUseCase$onExecute$2(this.this$0, continuation);
        homeFavItemsAggregatedUseCase$onExecute$2.L$0 = list;
        homeFavItemsAggregatedUseCase$onExecute$2.L$1 = list2;
        homeFavItemsAggregatedUseCase$onExecute$2.L$2 = list3;
        homeFavItemsAggregatedUseCase$onExecute$2.L$3 = list4;
        return homeFavItemsAggregatedUseCase$onExecute$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x014f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCoroutineScope;
        List<qWH> list;
        qWG qwg;
        qWH qwhCopydefault;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objCoroutineScope = obj;
        } else {
            C56391yDq.AEQbTJ(obj);
            List list2 = (List) this.L$0;
            List list3 = (List) this.L$1;
            List list4 = (List) this.L$2;
            List list5 = (List) this.L$3;
            pUU.KWHzl("HomeFavItemsAggregatedUseCase", "最终合流: 输入items=" + list2.size() + ", instruments=" + list3.size() + ", coinQuotes=" + list4.size() + ", dexQuotes=" + list5.size());
            HomeFavItemsAggregatedUseCase$onExecute$2$invokeSuspend$$inlined$executeAsyncTasks$1 homeFavItemsAggregatedUseCase$onExecute$2$invokeSuspend$$inlined$executeAsyncTasks$1 = new HomeFavItemsAggregatedUseCase$onExecute$2$invokeSuspend$$inlined$executeAsyncTasks$1(null, list3, list4, list5, this.this$0);
            this.L$0 = list2;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            objCoroutineScope = CoroutineScopeKt.coroutineScope(homeFavItemsAggregatedUseCase$onExecute$2$invokeSuspend$$inlined$executeAsyncTasks$1, this);
            if (objCoroutineScope == objCopydefault) {
                return objCopydefault;
            }
            list = list2;
        }
        Triple triple = (Triple) objCoroutineScope;
        Map map = (Map) triple.component1();
        Map map2 = (Map) triple.component2();
        Map map3 = (Map) triple.component3();
        kER ker = this.this$0;
        ArrayList arrayList = new ArrayList();
        for (qWH qwh : list) {
            if (qwh instanceof qWC) {
                String strAEQbTJ = ker.AEQbTJ(qwh);
                CoinQuote coinQuote = (CoinQuote) map2.get(strAEQbTJ);
                if (coinQuote == null) {
                    qwhCopydefault = null;
                } else {
                    qWC qwc = (qWC) qwh;
                    BizInstrument bizInstrumentCopydefault = (BizInstrument) map.get(strAEQbTJ);
                    if (bizInstrumentCopydefault == null) {
                        bizInstrumentCopydefault = qwc.copydefault();
                    }
                    qwhCopydefault = qwc.AEQbTJ(coinQuote, bizInstrumentCopydefault, C56443yFo.AEQbTJ(coinQuote.getChangePercent()), C56443yFo.AEQbTJ(coinQuote.getPriceNumber()), C33129mqd.EZpvd(C56443yFo.AEQbTJ(coinQuote.getTurnoverNumber())), coinQuote.getBaseCurrency(), coinQuote.getInstType(), qwc.djBIcL());
                }
            } else if ((qwh instanceof qWG) && (qwg = (qWG) map3.get(ker.AEQbTJ(qwh))) != null) {
                qWG qwg2 = (qWG) qwh;
                qWK qwkCopydefault = qwg.copydefault();
                Double dAEQbTJ = qwg.AEQbTJ();
                qwhCopydefault = qwg2.copydefault(qwkCopydefault, dAEQbTJ != null ? C56443yFo.AEQbTJ(dAEQbTJ.doubleValue() / 100.0d) : null, qwg.AYXKKw(), qwg.fetchVPNInfo(), qwg.KWHzl().getTokenSymbol(), "CEDEFI", qwg.djBIcL());
            }
            if (qwhCopydefault != null) {
                arrayList.add(qwhCopydefault);
            }
        }
        return arrayList;
    }
}
