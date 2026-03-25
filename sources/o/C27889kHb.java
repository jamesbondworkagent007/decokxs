package o;

import com.okinc.business.market.bean.CoinQuote;
import com.okinc.tradeapi.bean.MarketDataSource;
import com.okinc.unify_trade.trade.model.IndexSourceData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kHb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27889kHb {
    public static InterfaceC58217yxC KWHzl;
    public static InterfaceC58217yxC copydefault;
    public static final C27889kHb AEQbTJ = new C27889kHb();
    public static final int OLrzqt = 8;

    private C27889kHb() {
    }

    public final void EZpvd(final java.util.List<? extends MarketDataSource> list, @NotNull final Function1<? super java.util.List<CoinQuote>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        pUU.KWHzl("ConvertDataSourceManager", "convertDataSourceToCoin: ");
        InterfaceC58217yxC interfaceC58217yxC = KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.kHf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58249yxi
            public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                C27889kHb.copydefault(list, interfaceC58251yxk);
            }
        }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.kHe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27889kHb.AEQbTJ(function1, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.kHj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C27889kHb.AhwBna(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.kHk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27889kHb.KWHzl((java.lang.Throwable) obj);
            }
        };
        KWHzl = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.kHm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C27889kHb.valueOf(function13, obj);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void copydefault(java.util.List list, InterfaceC58251yxk interfaceC58251yxk) {
        java.util.List listAhwBna;
        java.util.stream.Stream streamParallelStream;
        java.util.List<CoinQuote> listOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
        pUU.KWHzl("ConvertDataSourceManager", "convertDataSourceToCoin: task start ");
        if (list == null || (streamParallelStream = list.parallelStream()) == null) {
            listAhwBna = null;
        } else {
            final Function1 function1 = new Function1() { // from class: o.kHc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C27889kHb.AEQbTJ((MarketDataSource) obj);
                }
            };
            java.util.stream.Stream map = streamParallelStream.map(new java.util.function.Function() { // from class: o.kGZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C27889kHb.djBIcL(function1, obj);
                }
            });
            if (map != null && (listOLrzqt = C59471zhf.OLrzqt(map)) != null) {
                listAhwBna = new java.util.ArrayList();
                for (CoinQuote coinQuote : listOLrzqt) {
                    if (coinQuote != null) {
                        listAhwBna.add(coinQuote);
                    }
                }
            }
        }
        pUU.KWHzl("ConvertDataSourceManager", "convertDataSourceToCoin: task compute end ");
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        interfaceC58251yxk.onNext(listAhwBna);
    }

    public static final CoinQuote AEQbTJ(MarketDataSource marketDataSource) {
        C38381pWr c38381pWr = C38381pWr.KWHzl;
        Intrinsics.copydefault(marketDataSource);
        return c38381pWr.OLrzqt(marketDataSource);
    }

    public static final CoinQuote djBIcL(Function1 function1, java.lang.Object obj) {
        return (CoinQuote) function1.invoke(obj);
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(Function1 function1, java.util.List list) {
        pUU.KWHzl("ConvertDataSourceManager", "convertDataSourceToCoin: task  notify ");
        Intrinsics.copydefault(list);
        function1.invoke(list);
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull final java.util.List<IndexSourceData> list, @NotNull final Function1<? super java.util.List<CoinQuote>, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        pUU.KWHzl("ConvertDataSourceManager", "convertToCoinQuote: ");
        InterfaceC58217yxC interfaceC58217yxC = copydefault;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.kHd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58249yxi
            public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                C27889kHb.EZpvd(list, interfaceC58251yxk);
            }
        }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.kHa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27889kHb.copydefault(function1, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.kHi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C27889kHb.AYXKKw(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.kHh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27889kHb.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        copydefault = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.kHg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C27889kHb.gEmmrt(function13, obj);
            }
        });
    }

    public static final void EZpvd(java.util.List list, InterfaceC58251yxk interfaceC58251yxk) {
        Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
        pUU.KWHzl("ConvertDataSourceManager", "convertToCoinQuote: task start ");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            int i = 0;
            for (java.lang.Object obj : list) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                CoinQuote coinQuoteConvertToCoinQuote$default = C38381pWr.convertToCoinQuote$default(C38381pWr.KWHzl, (IndexSourceData) obj, false, 2, null);
                if (coinQuoteConvertToCoinQuote$default != null) {
                    arrayList.add(coinQuoteConvertToCoinQuote$default);
                }
                i++;
            }
        }
        interfaceC58251yxk.onNext(arrayList);
        pUU.KWHzl("ConvertDataSourceManager", "convertToCoinQuote: task compute end ");
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(Function1 function1, java.util.List list) {
        pUU.KWHzl("ConvertDataSourceManager", "convertToCoinQuote: task  notify ");
        Intrinsics.copydefault(list);
        function1.invoke(list);
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        InterfaceC58217yxC interfaceC58217yxC = KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        KWHzl = null;
        InterfaceC58217yxC interfaceC58217yxC2 = copydefault;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        copydefault = null;
    }
}
