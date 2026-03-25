package o;

import com.okinc.base.utils.commmon.ThreadUtils;
import com.okinc.market.common.bean.DexTokenItemListRequest;
import com.okinc.tradeapi.bean.MarketDataSource;
import com.okinc.unify_trade.biz.WatchListBean;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import com.okinc.unify_trade.trade.source.watch.UnLoginWatchMarketDataSource$loadWatch$pair$1;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xUs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54771xUs extends xTS {
    public xTB AxsJAY;
    public final xTK wlaJM;
    public Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> zLjUOn;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean AYXKKw(WatchListData watchListData) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        return true;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
  (r7v0 o.xTK)
  (wrap:java.util.HashMap:0x0009: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.HashMap:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:30) call: java.util.HashMap.<init>():void type: CONSTRUCTOR) : (r8v0 java.util.HashMap))
  (wrap:java.util.HashMap:0x0013: TERNARY null = ((wrap:int:0x000a: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.HashMap:0x0010: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:31) call: java.util.HashMap.<init>():void type: CONSTRUCTOR) : (r9v0 java.util.HashMap))
  (wrap:boolean:0x0019: TERNARY null = ((wrap:int:0x0014: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r10v0 boolean))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x001a: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x0020: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:33) call: o.xUx.<init>():void type: CONSTRUCTOR) : (r11v0 kotlin.jvm.functions.Function1))
 A[MD:(o.xTK, java.util.HashMap<java.lang.String, com.okinc.unify_trade.biz.subscribe.TickersData>, java.util.HashMap<java.lang.String, com.okinc.unify_trade.biz.subscribe.TickersData>, boolean, kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.biz.subscribe.WatchListData, java.lang.Boolean>):void (m)] (LINE:28) call: o.xUs.<init>(o.xTK, java.util.HashMap, java.util.HashMap, boolean, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C54771xUs(xTK xtk, java.util.HashMap map, java.util.HashMap map2, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(xtk, (i & 2) != 0 ? new java.util.HashMap() : map, (i & 4) != 0 ? new java.util.HashMap() : map2, (i & 8) != 0 ? true : z, (i & 16) != 0 ? new Function1() { // from class: o.xUx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C54771xUs.AYXKKw((WatchListData) obj));
            }
        } : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54771xUs(xTK xtk, @NotNull java.util.HashMap<java.lang.String, TickersData> map, @NotNull java.util.HashMap<java.lang.String, TickersData> map2, boolean z, @NotNull Function1<? super WatchListData, java.lang.Boolean> function1) {
        super(xtk, map, map2, z, function1);
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.wlaJM = xtk;
    }

    public C54771xUs(xTK xtk) {
        this(xtk, new java.util.HashMap(), new java.util.HashMap(), false, null, 24, null);
    }

    @Override // o.xTS
    public void KWHzl(@NotNull Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.zLjUOn = function2;
        EZpvd(true, new Function1() { // from class: o.xUH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54771xUs.copydefault(this.AEQbTJ, (java.util.List) obj);
            }
        });
    }

    public static final Unit copydefault(final C54771xUs c54771xUs, java.util.List list) {
        C41436qql<?> c41436qqlAEQbTJ;
        Intrinsics.checkNotNullParameter(list, "");
        c54771xUs.AEQbTJ((java.util.List<WatchListData>) list);
        if (list.isEmpty()) {
            Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2 = c54771xUs.zLjUOn;
            if (function2 != null) {
                function2.invoke(java.lang.Boolean.TRUE, null);
            }
            c54771xUs.KWHzl(true);
            Function1<java.util.ArrayList<MarketDataSource>, Unit> function1FJNWhG = c54771xUs.fJNWhG();
            if (function1FJNWhG != null) {
                function1FJNWhG.invoke(new java.util.ArrayList<>());
            }
            C41435qqk<?, MarketDataSource> c41435qqkDbNXlk = c54771xUs.DbNXlk();
            if (c41435qqkDbNXlk != null && (c41436qqlAEQbTJ = c41435qqkDbNXlk.AEQbTJ(yDY.AhwBna())) != null) {
                c41436qqlAEQbTJ.copydefault();
            }
        } else {
            c54771xUs.copydefault(new java.util.ArrayList<>(list));
            xTB xtb = c54771xUs.AxsJAY;
            if (xtb != null) {
                xtb.OLrzqt();
            }
            c54771xUs.AxsJAY = new xTB(list, new Function1() { // from class: o.xUw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C54771xUs.copydefault(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
                }
            }, c54771xUs.wlaJM);
        }
        c54771xUs.KWHzl(new Function1() { // from class: o.xUy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54771xUs.OLrzqt(this.copydefault, ((java.lang.Integer) obj).intValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(final C54771xUs c54771xUs, boolean z) {
        c54771xUs.EZpvd(true, new Function1() { // from class: o.xUt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54771xUs.AEQbTJ(this.copydefault, (java.util.List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C54771xUs c54771xUs, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c54771xUs.AuCTelauCTel();
        c54771xUs.copydefault(new java.util.ArrayList<>(list));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final C54771xUs c54771xUs, int i) {
        pUU.KWHzl("IWatchSource", "unlogin refresh data");
        readLocalWatchList$default(c54771xUs, false, new Function1() { // from class: o.xUu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54771xUs.djBIcL(this.copydefault, (java.util.List) obj);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C54771xUs c54771xUs, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c54771xUs.AYXKKw();
        c54771xUs.AYXKKw().clear();
        c54771xUs.AYXKKw().addAll(c54771xUs.AEQbTJ((java.util.List<WatchListData>) list));
        xTS.refreshTicker$default(c54771xUs, false, 1, null);
        if (!c54771xUs.AYXKKw().isEmpty()) {
            c54771xUs.getNewProxyInstance();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void readLocalWatchList$default(C54771xUs c54771xUs, boolean z, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c54771xUs.EZpvd(z, (Function1<? super java.util.List<WatchListData>, Unit>) function1);
    }

    public final void EZpvd(boolean z, final Function1<? super java.util.List<WatchListData>, Unit> function1) {
        try {
            Result.Application application = Result.Companion;
            if (values() instanceof xPY) {
                if (z) {
                    qVD.AEQbTJ.AEQbTJ(true);
                }
                values().AEQbTJ(new Function1() { // from class: o.xUA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C54771xUs.copydefault(this.EZpvd, function1, ((java.lang.Boolean) obj).booleanValue());
                    }
                });
            } else {
                java.util.ArrayList<WatchListBean> arrayListEZpvd = qVA.EZpvd();
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListEZpvd, 10));
                java.util.Iterator<T> it = arrayListEZpvd.iterator();
                while (it.hasNext()) {
                    arrayList.add(((WatchListBean) it.next()).getWatchlistData());
                }
                function1.invoke(new java.util.ArrayList(new java.util.ArrayList(arrayList)));
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public static final Unit copydefault(C54771xUs c54771xUs, Function1 function1, boolean z) {
        ((xPY) c54771xUs.values()).KWHzl(function1);
        return Unit.INSTANCE;
    }

    @Override // o.xTS, o.AbstractC54646xQb
    public void copydefault(@NotNull Function1<? super java.util.ArrayList<MarketDataSource>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        super.copydefault(function1);
        if (AYXKKw().isEmpty()) {
            function1.invoke(new java.util.ArrayList());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<com.okinc.unify_trade.biz.subscribe.WatchListData, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(java.util.ArrayList<WatchListData> arrayList) {
        AYXKKw().clear();
        CopyOnWriteArrayList<WatchListData> copyOnWriteArrayListAYXKKw = AYXKKw();
        Function1<WatchListData, java.lang.Boolean> function1DjBIcL = djBIcL();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (((java.lang.Boolean) function1DjBIcL.invoke(obj)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        copyOnWriteArrayListAYXKKw.addAll(arrayList2);
        AEQbTJ(arrayList);
        AuCTelauCTel();
        Triple<java.lang.String, java.lang.String, java.util.List<DexTokenItemListRequest>> tripleKWHzl = xTQ.copydefault.KWHzl(Util.toImmutableList(AYXKKw()), new UnLoginWatchMarketDataSource$loadWatch$pair$1(this));
        AEQbTJ(tripleKWHzl.getFirst(), tripleKWHzl.getSecond(), new Function2() { // from class: o.xUB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                return C54771xUs.OLrzqt(this.EZpvd, ((java.lang.Boolean) obj2).booleanValue(), (java.lang.Exception) obj3);
            }
        });
    }

    public static final Unit OLrzqt(final C54771xUs c54771xUs, final boolean z, final java.lang.Exception exc) {
        if (z) {
            c54771xUs.KWHzl(z, exc, new Function2() { // from class: o.xUC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C54771xUs.copydefault(this.AEQbTJ, z, exc, ((java.lang.Boolean) obj).booleanValue(), (java.lang.Exception) obj2);
                }
            });
        } else {
            c54771xUs.copydefault(z, exc);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C54771xUs c54771xUs, boolean z, java.lang.Exception exc, boolean z2, java.lang.Exception exc2) {
        c54771xUs.copydefault(z, exc);
        return Unit.INSTANCE;
    }

    public final void copydefault(final boolean z, final java.lang.Exception exc) {
        KWHzl(z);
        ThreadUtils.copydefault(new java.lang.Runnable() { // from class: o.xUv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C54771xUs.EZpvd(z, this, exc);
            }
        });
    }

    public static final void EZpvd(boolean z, C54771xUs c54771xUs, java.lang.Exception exc) {
        if (!z) {
            Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2 = c54771xUs.zLjUOn;
            if (function2 != null) {
                function2.invoke(java.lang.Boolean.valueOf(z), exc);
                return;
            }
            return;
        }
        c54771xUs.uzCIH();
        Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function22 = c54771xUs.zLjUOn;
        if (function22 != null) {
            function22.invoke(java.lang.Boolean.valueOf(z), null);
        }
    }

    @Override // o.xTS
    public void AEQbTJ(@NotNull java.util.List<WatchListData> list, @NotNull final InterfaceC55701xos<Unit> interfaceC55701xos, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        if (z) {
            OLrzqt(list);
            xTS.refreshTicker$default(this, false, 1, null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (WatchListData watchListData : list) {
            arrayList.add(new WatchListBean(watchListData.getAlias(), watchListData.getExpTime(), watchListData.getInstId(), watchListData.getInstType(), watchListData.getChainId(), watchListData.getTokenContractAddress(), "", ""));
        }
        if (values() instanceof xPY) {
            ((xPY) values()).copydefault(list, new Function1() { // from class: o.xUz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C54771xUs.AEQbTJ(interfaceC55701xos, (Result) obj);
                }
            });
        } else {
            qVA.copydefault(arrayList);
            interfaceC55701xos.EZpvd(true, null, null);
        }
    }

    public static final Unit AEQbTJ(InterfaceC55701xos interfaceC55701xos, Result result) {
        interfaceC55701xos.EZpvd(true, null, null);
        return Unit.INSTANCE;
    }

    @Override // o.xTS, o.AbstractC54646xQb
    public void valueOf() {
        super.valueOf();
        C43296rmc.AEQbTJ("UnLoginMarketDataSource", "------------------>destroy");
        AhwBna().dispose();
        InterfaceC58217yxC interfaceC58217yxCGEmmrt = gEmmrt();
        if (interfaceC58217yxCGEmmrt != null) {
            interfaceC58217yxCGEmmrt.dispose();
        }
        this.zLjUOn = null;
        xTG xtgAkhnZx = AkhnZx();
        if (xtgAkhnZx != null) {
            xtgAkhnZx.AYXKKw();
        }
        xTB xtb = this.AxsJAY;
        if (xtb != null) {
            xtb.OLrzqt();
        }
    }

    public final void AuCTelauCTel() {
        CopyOnWriteArrayList<WatchListData> copyOnWriteArrayListAYXKKw = AYXKKw();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : copyOnWriteArrayListAYXKKw) {
            WatchListData watchListData = (WatchListData) obj;
            if (Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "OPTION") && C33129mqd.valueOf(watchListData.getExpTime(), C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())))) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AYXKKw().remove((WatchListData) it.next());
        }
        qVA.copydefault(AubY());
    }

    /* JADX DEBUG: Possible override for method o.xTS.AubY()V */
    public final java.util.ArrayList<WatchListBean> AubY() {
        java.util.ArrayList<WatchListBean> arrayList = new java.util.ArrayList<>();
        for (WatchListData watchListData : AYXKKw()) {
            arrayList.add(new WatchListBean(watchListData.getAlias(), watchListData.getExpTime(), watchListData.getInstId(), watchListData.getInstType(), watchListData.getChainId(), watchListData.getTokenContractAddress(), watchListData.getTokenSymbol(), watchListData.getTokenName()));
        }
        return arrayList;
    }
}
