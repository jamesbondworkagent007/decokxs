package com.okinc.okmarket.data;

import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C55626xnW;
import o.C56131xwy;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC54581xNr;
import o.sZN;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketDataApiImpl$getPriceAndPercent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Pair<? extends String, ? extends Triple<? extends String, ? extends Double, ? extends String>>>>, Object> {
    final /* synthetic */ List<String> $ccy;
    final /* synthetic */ InterfaceC54581xNr $trade;
    int label;
    final /* synthetic */ sZN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketDataApiImpl$getPriceAndPercent$2(List<String> list, sZN szn, InterfaceC54581xNr interfaceC54581xNr, Continuation<? super MarketDataApiImpl$getPriceAndPercent$2> continuation) {
        super(2, continuation);
        this.$ccy = list;
        this.this$0 = szn;
        this.$trade = interfaceC54581xNr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketDataApiImpl$getPriceAndPercent$2(this.$ccy, this.this$0, this.$trade, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Pair<? extends String, ? extends Triple<? extends String, ? extends Double, ? extends String>>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<Pair<String, Triple<String, Double, String>>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<Pair<String, Triple<String, Double, String>>>> continuation) {
        return ((MarketDataApiImpl$getPriceAndPercent$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C56131xwy c56131xwy = new C56131xwy();
            List<String> list = this.$ccy;
            this.label = 1;
            obj = C55626xnW.EZpvd(c56131xwy, list, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        List list2 = (List) obj;
        sZN szn = this.this$0;
        InterfaceC54581xNr interfaceC54581xNr = this.$trade;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(szn.AEQbTJ((TickersData) it.next(), interfaceC54581xNr));
        }
        return arrayList;
    }
}
