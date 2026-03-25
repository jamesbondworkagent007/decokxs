package com.okinc.okmarket.data;

import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
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

/* JADX INFO: loaded from: classes10.dex */
public final class MarketDataApiImpl$queryTickerData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Pair<? extends String, ? extends TickersData>>>, Object> {
    final /* synthetic */ List<String> $args;
    final /* synthetic */ boolean $isCcy;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketDataApiImpl$queryTickerData$2(boolean z, List<String> list, Continuation<? super MarketDataApiImpl$queryTickerData$2> continuation) {
        super(2, continuation);
        this.$isCcy = z;
        this.$args = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketDataApiImpl$queryTickerData$2(this.$isCcy, this.$args, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Pair<? extends String, ? extends TickersData>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<Pair<String, TickersData>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<Pair<String, TickersData>>> continuation) {
        return ((MarketDataApiImpl$queryTickerData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<TickersData> list;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C56131xwy c56131xwy = new C56131xwy();
            boolean z = this.$isCcy;
            List<String> list2 = this.$args;
            if (z) {
                this.label = 1;
                obj = C55626xnW.EZpvd(c56131xwy, list2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                list = (List) obj;
            } else {
                this.label = 2;
                obj = C55626xnW.copydefault(c56131xwy, list2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                list = (List) obj;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            list = (List) obj;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            list = (List) obj;
        }
        boolean z2 = this.$isCcy;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (TickersData tickersData : list) {
            arrayList.add(new Pair(z2 ? tickersData.getCcy() : tickersData.getInstId(), tickersData));
        }
        return arrayList;
    }
}
