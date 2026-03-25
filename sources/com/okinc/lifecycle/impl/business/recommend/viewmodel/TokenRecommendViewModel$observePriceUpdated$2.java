package com.okinc.lifecycle.impl.business.recommend.viewmodel;

import com.okinc.okex.lite_market_api.bean.FairPriceTickerData;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C38072pLe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pKX;
import o.pKZ;

/* JADX INFO: loaded from: classes9.dex */
public final class TokenRecommendViewModel$observePriceUpdated$2 extends SuspendLambda implements Function2<Map<String, ? extends FairPriceTickerData>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C38072pLe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenRecommendViewModel$observePriceUpdated$2(C38072pLe c38072pLe, Continuation<? super TokenRecommendViewModel$observePriceUpdated$2> continuation) {
        super(2, continuation);
        this.this$0 = c38072pLe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TokenRecommendViewModel$observePriceUpdated$2 tokenRecommendViewModel$observePriceUpdated$2 = new TokenRecommendViewModel$observePriceUpdated$2(this.this$0, continuation);
        tokenRecommendViewModel$observePriceUpdated$2.L$0 = obj;
        return tokenRecommendViewModel$observePriceUpdated$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Map<String, ? extends FairPriceTickerData> map, Continuation<? super Unit> continuation) {
        return invoke2((Map<String, FairPriceTickerData>) map, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Map<String, FairPriceTickerData> map, Continuation<? super Unit> continuation) {
        return ((TokenRecommendViewModel$observePriceUpdated$2) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Map map = (Map) this.L$0;
            List<pKX> listOLrzqt = ((pKZ) this.this$0.copydefault.getValue()).OLrzqt();
            for (Map.Entry entry : map.entrySet()) {
                Iterator<T> it = listOLrzqt.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.EZpvd(((pKX) next).gEmmrt(), entry.getKey())) {
                        break;
                    }
                }
                pKX pkx = (pKX) next;
                if (pkx != null) {
                    FairPriceTickerData fairPriceTickerData = (FairPriceTickerData) entry.getValue();
                    pkx.AEQbTJ(fairPriceTickerData.getPercentToDisplay());
                    pkx.copydefault(fairPriceTickerData.getPriceToDisplay());
                    pkx.EZpvd(C33129mqd.gEmmrt(C56443yFo.AEQbTJ(fairPriceTickerData.getPercent())));
                }
            }
            this.this$0.copydefault.setValue(new pKZ(listOLrzqt, ((pKZ) this.this$0.copydefault.getValue()).AEQbTJ()));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
