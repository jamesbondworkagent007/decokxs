package com.okinc.business.market.market.fragment;

import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.market.fragment.ConvertDataSourceManager$convertDataToCoin$2;
import com.okinc.tradeapi.bean.MarketDataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C38381pWr;
import o.C56391yDq;
import o.C56442yFn;
import o.C59471zhf;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class ConvertDataSourceManager$convertDataToCoin$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends CoinQuote>>, Object> {
    final /* synthetic */ List<MarketDataSource> $data;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.okinc.tradeapi.bean.MarketDataSource> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConvertDataSourceManager$convertDataToCoin$2(List<? extends MarketDataSource> list, Continuation<? super ConvertDataSourceManager$convertDataToCoin$2> continuation) {
        super(2, continuation);
        this.$data = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConvertDataSourceManager$convertDataToCoin$2(this.$data, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends CoinQuote>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<CoinQuote>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<CoinQuote>> continuation) {
        return ((ConvertDataSourceManager$convertDataToCoin$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList arrayList;
        Stream<MarketDataSource> streamParallelStream;
        List<CoinQuote> listOLrzqt;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("ConvertDataSourceManager", "convertDataSourceToCoin: task compute start  cal");
            List<MarketDataSource> list = this.$data;
            if (list == null || (streamParallelStream = list.parallelStream()) == null) {
                arrayList = null;
            } else {
                final Function1 function1 = new Function1() { // from class: o.kHn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return ConvertDataSourceManager$convertDataToCoin$2.invokeSuspend$lambda$0((MarketDataSource) obj2);
                    }
                };
                Stream<R> map = streamParallelStream.map(new Function() { // from class: o.kHl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.util.function.Function
                    public final java.lang.Object apply(java.lang.Object obj2) {
                        return ConvertDataSourceManager$convertDataToCoin$2.invokeSuspend$lambda$1(function1, obj2);
                    }
                });
                if (map != 0 && (listOLrzqt = C59471zhf.OLrzqt(map)) != null) {
                    arrayList = new ArrayList();
                    for (CoinQuote coinQuote : listOLrzqt) {
                        if (coinQuote != null) {
                            arrayList.add(coinQuote);
                        }
                    }
                }
            }
            pUU.KWHzl("ConvertDataSourceManager", "convertDataSourceToCoin: task compute end ");
            return arrayList == null ? yDY.AhwBna() : arrayList;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoinQuote invokeSuspend$lambda$0(MarketDataSource marketDataSource) {
        C38381pWr c38381pWr = C38381pWr.KWHzl;
        Intrinsics.copydefault(marketDataSource);
        return c38381pWr.OLrzqt(marketDataSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoinQuote invokeSuspend$lambda$1(Function1 function1, Object obj) {
        return (CoinQuote) function1.invoke(obj);
    }
}
