package o;

import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.market.watch.database.MarketFavDataBase;
import com.okinc.okmarket.data.watch.MarketWatchDataApiIMpl$addWatchList$2;
import com.okinc.okmarket.data.watch.MarketWatchDataApiIMpl$initWatchList$2;
import com.okinc.okmarket.data.watch.MarketWatchDataApiIMpl$isWatchingFlow$1;
import com.okinc.okmarket.data.watch.MarketWatchDataApiIMpl$queryIsWatching$2;
import com.okinc.okmarket.data.watch.MarketWatchDataApiIMpl$queryWatchList$2;
import com.okinc.okmarket.data.watch.MarketWatchDataApiIMpl$removeWatchList$2;
import com.okinc.okmarket.data.watch.MarketWatchDataApiIMpl$watchListFlow$1;
import com.okinc.okmarket.data.watch.MarketWatchDataApiIMpl$watchListFlow$suspendImpl$$inlined$map$1$2$1;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public class sZS implements InterfaceC40387qTz {
    public static final int EZpvd = qWN.KWHzl;
    public final qWN AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public sZS() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40387qTz
    public java.lang.Object EZpvd(boolean z, @NotNull Continuation<? super Unit> continuation) {
        return KWHzl(this, z, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40387qTz
    public java.lang.Object EZpvd(boolean z, boolean z2, @NotNull Continuation<? super java.util.List<WatchListData>> continuation) {
        return AEQbTJ(this, z, z2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40387qTz
    public java.lang.Object KWHzl(@NotNull WatchListData watchListData, @NotNull Continuation<? super Unit> continuation) {
        return OLrzqt(this, watchListData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40387qTz
    public java.lang.Object OLrzqt(@NotNull WatchListData watchListData, @NotNull Continuation<? super Unit> continuation) {
        return AEQbTJ(this, watchListData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40387qTz
    public java.lang.Object copydefault(@NotNull WatchListData watchListData, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return KWHzl(this, watchListData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40387qTz
    public java.lang.Object copydefault(boolean z, @NotNull Continuation<? super Flow<? extends java.util.List<WatchListData>>> continuation) {
        return EZpvd(this, z, continuation);
    }

    public sZS(@NotNull qWN qwn) {
        Intrinsics.checkNotNullParameter(qwn, "");
        this.AEQbTJ = qwn;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:o.qWN:?: TERNARY null = ((wrap:int:0x0001: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.qWN:0x0016: CONSTRUCTOR 
  (wrap:o.qWO:0x000d: INVOKE 
  (wrap:o.qWO$Application:0x0004: SGET  A[WRAPPED] (LINE:20) o.qWO.Companion o.qWO$Application)
  (wrap:com.okinc.market.watch.database.MarketFavDataBase:0x0009: INVOKE 
  (wrap:com.okinc.market.watch.database.MarketFavDataBase$TaskDescription:0x0006: SGET  A[WRAPPED] com.okinc.market.watch.database.MarketFavDataBase.Companion com.okinc.market.watch.database.MarketFavDataBase$TaskDescription)
  (null android.app.Application)
  (1 int)
  (null java.lang.Object)
 STATIC call: com.okinc.market.watch.database.MarketFavDataBase.TaskDescription.instance$default(com.okinc.market.watch.database.MarketFavDataBase$TaskDescription, android.app.Application, int, java.lang.Object):com.okinc.market.watch.database.MarketFavDataBase A[MD:(com.okinc.market.watch.database.MarketFavDataBase$TaskDescription, android.app.Application, int, java.lang.Object):com.okinc.market.watch.database.MarketFavDataBase (m), WRAPPED])
 VIRTUAL call: o.qWO.Application.copydefault(com.okinc.market.watch.database.MarketFavDataBase):o.qWO A[MD:(com.okinc.market.watch.database.MarketFavDataBase):o.qWO (m), WRAPPED] (LINE:20))
 A[MD:(o.qWO):void (m), WRAPPED] (LINE:19) call: o.qWN.<init>(o.qWO):void type: CONSTRUCTOR) : (r2v0 o.qWN))
 A[MD:(o.qWN):void (m)] (LINE:18) call: o.sZS.<init>(o.qWN):void type: THIS */
    public /* synthetic */ sZS(qWN qwn, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new qWN(qWO.Companion.copydefault(MarketFavDataBase.TaskDescription.instance$default(MarketFavDataBase.Companion, null, 1, null))) : qwn);
    }

    public static /* synthetic */ java.lang.Object KWHzl(sZS szs, boolean z, Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(C40440qVy.Companion.AEQbTJ(), new MarketWatchDataApiIMpl$initWatchList$2(z, szs, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object OLrzqt(sZS szs, WatchListData watchListData, Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(C40440qVy.Companion.AEQbTJ(), new MarketWatchDataApiIMpl$removeWatchList$2(szs, watchListData, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object AEQbTJ(sZS szs, WatchListData watchListData, Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(C40440qVy.Companion.AEQbTJ(), new MarketWatchDataApiIMpl$addWatchList$2(szs, watchListData, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object AEQbTJ(sZS szs, boolean z, boolean z2, Continuation<? super java.util.List<WatchListData>> continuation) {
        return BuildersKt.withContext(C40440qVy.Companion.AEQbTJ(), new MarketWatchDataApiIMpl$queryWatchList$2(z, z2, szs, null), continuation);
    }

    public static final class ActionBar implements Flow<java.util.List<? extends WatchListData>> {
        public final /* synthetic */ boolean AEQbTJ;
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: o.sZS$ActionBar$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ boolean OLrzqt;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, boolean z) {
                this.copydefault = flowCollector;
                this.OLrzqt = z;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                MarketWatchDataApiIMpl$watchListFlow$suspendImpl$$inlined$map$1$2$1 marketWatchDataApiIMpl$watchListFlow$suspendImpl$$inlined$map$1$2$1;
                java.util.ArrayList arrayList;
                if (continuation instanceof MarketWatchDataApiIMpl$watchListFlow$suspendImpl$$inlined$map$1$2$1) {
                    marketWatchDataApiIMpl$watchListFlow$suspendImpl$$inlined$map$1$2$1 = (MarketWatchDataApiIMpl$watchListFlow$suspendImpl$$inlined$map$1$2$1) continuation;
                    int i = marketWatchDataApiIMpl$watchListFlow$suspendImpl$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        marketWatchDataApiIMpl$watchListFlow$suspendImpl$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        marketWatchDataApiIMpl$watchListFlow$suspendImpl$$inlined$map$1$2$1 = new MarketWatchDataApiIMpl$watchListFlow$suspendImpl$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = marketWatchDataApiIMpl$watchListFlow$suspendImpl$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = marketWatchDataApiIMpl$watchListFlow$suspendImpl$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    java.util.List list = (java.util.List) obj;
                    if (this.OLrzqt) {
                        arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                        java.util.Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(qWJ.EZpvd((MarketUserFavorite) it.next()));
                        }
                    } else {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (T t : list) {
                            if (!Intrinsics.EZpvd((java.lang.Object) ((MarketUserFavorite) t).getInstType(), (java.lang.Object) "CEDEFI")) {
                                arrayList2.add(t);
                            }
                        }
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
                        java.util.Iterator<T> it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(qWJ.EZpvd((MarketUserFavorite) it2.next()));
                        }
                        arrayList = arrayList3;
                    }
                    marketWatchDataApiIMpl$watchListFlow$suspendImpl$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(arrayList, marketWatchDataApiIMpl$watchListFlow$suspendImpl$$inlined$map$1$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow, boolean z) {
            this.OLrzqt = flow;
            this.AEQbTJ = z;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends WatchListData>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass4(flowCollector, this.AEQbTJ), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object EZpvd(sZS szs, boolean z, Continuation<? super Flow<? extends java.util.List<WatchListData>>> continuation) throws java.lang.Throwable {
        MarketWatchDataApiIMpl$watchListFlow$1 marketWatchDataApiIMpl$watchListFlow$1;
        if (continuation instanceof MarketWatchDataApiIMpl$watchListFlow$1) {
            marketWatchDataApiIMpl$watchListFlow$1 = (MarketWatchDataApiIMpl$watchListFlow$1) continuation;
            int i = marketWatchDataApiIMpl$watchListFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketWatchDataApiIMpl$watchListFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                marketWatchDataApiIMpl$watchListFlow$1 = new MarketWatchDataApiIMpl$watchListFlow$1(szs, continuation);
            }
        }
        java.lang.Object objEZpvd = marketWatchDataApiIMpl$watchListFlow$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketWatchDataApiIMpl$watchListFlow$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            qWN qwn = szs.AEQbTJ;
            marketWatchDataApiIMpl$watchListFlow$1.Z$0 = z;
            marketWatchDataApiIMpl$watchListFlow$1.label = 1;
            objEZpvd = qwn.EZpvd(marketWatchDataApiIMpl$watchListFlow$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = marketWatchDataApiIMpl$watchListFlow$1.Z$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        return FlowKt.flowOn(new ActionBar((Flow) objEZpvd, z), C40440qVy.Companion.AEQbTJ());
    }

    public static /* synthetic */ java.lang.Object KWHzl(sZS szs, WatchListData watchListData, Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(C40440qVy.Companion.AEQbTJ(), new MarketWatchDataApiIMpl$queryIsWatching$2(szs, watchListData, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object copydefault(sZS szs, WatchListData watchListData, Continuation<? super Flow<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        MarketWatchDataApiIMpl$isWatchingFlow$1 marketWatchDataApiIMpl$isWatchingFlow$1;
        if (continuation instanceof MarketWatchDataApiIMpl$isWatchingFlow$1) {
            marketWatchDataApiIMpl$isWatchingFlow$1 = (MarketWatchDataApiIMpl$isWatchingFlow$1) continuation;
            int i = marketWatchDataApiIMpl$isWatchingFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketWatchDataApiIMpl$isWatchingFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                marketWatchDataApiIMpl$isWatchingFlow$1 = new MarketWatchDataApiIMpl$isWatchingFlow$1(szs, continuation);
            }
        }
        java.lang.Object objCopydefault = marketWatchDataApiIMpl$isWatchingFlow$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = marketWatchDataApiIMpl$isWatchingFlow$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            qWN qwn = szs.AEQbTJ;
            marketWatchDataApiIMpl$isWatchingFlow$1.label = 1;
            objCopydefault = qwn.copydefault(watchListData, marketWatchDataApiIMpl$isWatchingFlow$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCopydefault);
        }
        return FlowKt.flowOn((Flow) objCopydefault, C40440qVy.Companion.AEQbTJ());
    }
}
