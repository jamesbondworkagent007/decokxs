package o;

import com.okinc.market.ticker.TickerRepoV2$parallelRequestTickers$1;
import com.okinc.market.ticker.TickerRepoV2$parallelRequestTickers$result$1;
import com.okinc.market.ticker.TickerRepoV2$parallelRequestTickers$result$2;
import com.okinc.market.ticker.TickerRepoV2$refresh$1;
import com.okinc.market.ticker.TickerRepoV2$refresh$2;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class qTX extends qTT {
    public Function0<Unit> AkhnZx;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AkhnZx = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> fetchVPNInfo() {
        return this.AkhnZx;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.qTT, o.qTF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        TickerRepoV2$refresh$1 tickerRepoV2$refresh$1;
        qTX qtx;
        if (continuation instanceof TickerRepoV2$refresh$1) {
            tickerRepoV2$refresh$1 = (TickerRepoV2$refresh$1) continuation;
            int i = tickerRepoV2$refresh$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tickerRepoV2$refresh$1.label = i - Integer.MIN_VALUE;
            } else {
                tickerRepoV2$refresh$1 = new TickerRepoV2$refresh$1(this, continuation);
            }
        }
        java.lang.Object obj = tickerRepoV2$refresh$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tickerRepoV2$refresh$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.EZpvd("TickerRepo", "refresh() called");
            Job jobKWHzl = KWHzl();
            if (jobKWHzl != null && jobKWHzl.isActive()) {
                return Unit.INSTANCE;
            }
            pUU.KWHzl("NavOptPhase1", AYXKKw() + " -> TickerRepoV2 invoke refresh start...");
            copydefault(BuildersKt__Builders_commonKt.launch$default(EZpvd(), C40440qVy.Companion.AEQbTJ(), null, new TickerRepoV2$refresh$2(this, null), 2, null));
            gEmmrt();
            Job jobKWHzl2 = KWHzl();
            if (jobKWHzl2 != null) {
                tickerRepoV2$refresh$1.L$0 = this;
                tickerRepoV2$refresh$1.label = 1;
                if (jobKWHzl2.join(tickerRepoV2$refresh$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
            qtx = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qtx = (qTX) tickerRepoV2$refresh$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        pUU.KWHzl("NavOptPhase1", qtx.AYXKKw() + " -> TickerRepoV2 all jobs done 2");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(boolean z, Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        TickerRepoV2$parallelRequestTickers$1 tickerRepoV2$parallelRequestTickers$1;
        final qTX qtx;
        java.util.stream.Stream streamParallelStream;
        if (continuation instanceof TickerRepoV2$parallelRequestTickers$1) {
            tickerRepoV2$parallelRequestTickers$1 = (TickerRepoV2$parallelRequestTickers$1) continuation;
            int i = tickerRepoV2$parallelRequestTickers$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tickerRepoV2$parallelRequestTickers$1.label = i - Integer.MIN_VALUE;
            } else {
                tickerRepoV2$parallelRequestTickers$1 = new TickerRepoV2$parallelRequestTickers$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = tickerRepoV2$parallelRequestTickers$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tickerRepoV2$parallelRequestTickers$1.label;
        boolean z2 = false;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            Function1[] function1Arr = {new TickerRepoV2$parallelRequestTickers$result$1(this, z, null), new TickerRepoV2$parallelRequestTickers$result$2(this, z, null)};
            tickerRepoV2$parallelRequestTickers$1.L$0 = this;
            tickerRepoV2$parallelRequestTickers$1.label = 1;
            objKWHzl = C40394qUf.KWHzl(function1Arr, tickerRepoV2$parallelRequestTickers$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            qtx = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qtx = (qTX) tickerRepoV2$parallelRequestTickers$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        java.util.List<kotlin.Pair> list = (java.util.List) objKWHzl;
        java.util.ArrayList<java.util.List> arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (kotlin.Pair pair : list) {
            arrayList.add(pair != null ? (java.util.List) pair.getSecond() : null);
        }
        for (java.util.List list2 : arrayList) {
            if (list2 != null && (streamParallelStream = list2.parallelStream()) != null) {
                final Function1 function1 = new Function1() { // from class: o.qUa
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return qTX.EZpvd(this.OLrzqt, (TickersData) obj);
                    }
                };
                streamParallelStream.forEach(new java.util.function.Consumer() { // from class: o.qUb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.util.function.Consumer
                    public final void accept(java.lang.Object obj) {
                        qTX.OLrzqt(function1, obj);
                    }
                });
            }
        }
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                kotlin.Pair pair2 = (kotlin.Pair) it.next();
                if (pair2 != null && ((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
                    z2 = true;
                    break;
                }
            }
        }
        return C56443yFo.KWHzl(z2);
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(qTX qtx, TickersData tickersData) {
        ConcurrentHashMap<java.lang.String, TickersData> concurrentHashMapCopydefault = qtx.copydefault();
        Intrinsics.copydefault(tickersData);
        concurrentHashMapCopydefault.put(qtx.copydefault(tickersData), tickersData);
        return Unit.INSTANCE;
    }
}
