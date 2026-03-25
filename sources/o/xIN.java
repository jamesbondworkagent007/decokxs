package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.tradeapi.bean.IndexTickersData;
import com.okinc.unify_trade.biz.subscribe.BizKLineData;
import com.okinc.unify_trade.biz.subscribe.BizTradeData;
import com.okinc.unify_trade.biz.subscribe.SettingWatchList;
import com.okinc.unify_trade.biz.subscribe.TickerCupReq;
import com.okinc.unify_trade.biz.subscribe.TickerInstReq;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import com.okinc.unify_trade.exception.BizSystemException;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xIN {
    public final InterfaceC58217yxC AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5, @NotNull final InterfaceC55701xos<Unit> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).setWatchListFavorite(new SettingWatchList(str, str2, str3, str4, str5, "", "")), new Function1() { // from class: o.xJu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.AwvSrB(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xJq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.getNewProxyInstance(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit AwvSrB(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC copydefault(@NotNull final InterfaceC55701xos<java.util.List<WatchListData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(BizApiService.TaskDescription.getWatchListFavorite$default((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null), false, 1, null), new Function1() { // from class: o.xIM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.zsXlph(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xIP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.getFieldNames(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit zsXlph(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC EZpvd(@NotNull java.util.List<SettingWatchList> list, @NotNull final InterfaceC55701xos<Unit> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).setAllFavorite(list), new Function1() { // from class: o.xJc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.gHZMYf(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xJb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.uzCIH(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit gHZMYf(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC OLrzqt(@NotNull java.lang.String str, java.lang.String str2, @NotNull final InterfaceC55701xos<java.util.List<TickersData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getMarketTickers(str, str2), new Function1() { // from class: o.xJp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.AuCTelauCTel(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xJt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.AuCTel(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit AuCTelauCTel(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC AEQbTJ(@NotNull TickerInstReq tickerInstReq, @NotNull final InterfaceC55701xos<java.util.List<TickersData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(tickerInstReq, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).batchMarketTickers(AEQbTJ(tickerInstReq)), new Function1() { // from class: o.xIU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.AuCTel(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xIT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.fetchVPNInfo(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit AuCTel(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC EZpvd(@NotNull TickerCupReq tickerCupReq, @NotNull final InterfaceC55701xos<java.util.List<TickersData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(tickerCupReq, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).batchMarketCupTickers(copydefault(tickerCupReq)), new Function1() { // from class: o.xJi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.fJNWhG(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xJj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.AkhnZx(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit fJNWhG(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        try {
            interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    public final java.lang.String copydefault(TickerCupReq tickerCupReq) {
        java.util.List<java.lang.String> ccy;
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(tickerCupReq.getCcy().size()), 50)) {
            ccy = CollectionsKt___CollectionsKt.copydefault((java.util.List) tickerCupReq.getCcy(), new kotlin.ranges.IntRange(0, 49));
        } else {
            ccy = tickerCupReq.getCcy();
        }
        return CollectionsKt___CollectionsKt.joinToString$default(ccy, ",", null, null, 0, null, null, 62, null);
    }

    public final java.lang.String AEQbTJ(TickerInstReq tickerInstReq) {
        java.util.List<java.lang.String> instIds;
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(tickerInstReq.getInstIds().size()), 50)) {
            instIds = CollectionsKt___CollectionsKt.copydefault((java.util.List) tickerInstReq.getInstIds(), new kotlin.ranges.IntRange(0, 49));
        } else {
            instIds = tickerInstReq.getInstIds();
        }
        return CollectionsKt___CollectionsKt.joinToString$default(instIds, ",", null, null, 0, null, null, 62, null);
    }

    public final InterfaceC58217yxC copydefault(@NotNull java.lang.String str, @NotNull final InterfaceC55701xos<TickersData> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getMarketTickerByInstId(str), new Function1() { // from class: o.xJm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.AubY(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xJo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.ejfBZ(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit AubY(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC copydefault(java.lang.String str, java.lang.String str2, @NotNull final InterfaceC55701xos<java.util.List<IndexTickersData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getIndexTickers(str, str2), new Function1() { // from class: o.xJg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.getFieldNames(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xJh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.fJNWhG(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit getFieldNames(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC copydefault(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull final InterfaceC55701xos<java.util.List<BizKLineData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        if (str3 == null) {
            str3 = "1440";
        }
        return C33024moe.subscribeOnIO$default(bizApiService.getMarketCandles(str, str2, str4, str3), new Function1() { // from class: o.xIQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.uzCIH(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xIO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.AYXKKw(interfaceC55701xos, this, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit uzCIH(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof OKServerException) {
            java.lang.String message = th.getMessage();
            interfaceC55701xos.EZpvd(false, null, new BizApiException(message == null ? "" : message, C33129mqd.gEmmrt(java.lang.Integer.valueOf(((OKServerException) th).getCode())), null, null, null, 28, null));
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        }
        return Unit.INSTANCE;
    }

    public final java.util.List<BizKLineData> AEQbTJ(java.util.List<? extends java.util.List<java.lang.String>> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null && !list.isEmpty()) {
            java.util.Iterator<? extends java.util.List<java.lang.String>> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(BizKLineData.Companion.EZpvd(it.next()));
            }
        }
        return arrayList;
    }

    public final InterfaceC58217yxC AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull final InterfaceC55701xos<java.util.List<BizKLineData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        if (str3 == null) {
            str3 = "1440";
        }
        return C33024moe.subscribeOnIO$default(bizApiService.getMarketIndexCandles(str, str2, str4, str3), new Function1() { // from class: o.xIZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.hDKMBd(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xJe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.valueOf(interfaceC55701xos, this, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit hDKMBd(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof OKServerException) {
            java.lang.String message = th.getMessage();
            interfaceC55701xos.EZpvd(false, null, new BizApiException(message == null ? "" : message, C33129mqd.gEmmrt(java.lang.Integer.valueOf(((OKServerException) th).getCode())), null, null, null, 28, null));
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        }
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, @NotNull final InterfaceC55701xos<java.util.List<BizKLineData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getMarketMarkPriceCandles(str, str2, "1440"), new Function1() { // from class: o.xIR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.getNewProxyInstance(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xIY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.gEmmrt(interfaceC55701xos, this, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit getNewProxyInstance(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof OKServerException) {
            java.lang.String message = th.getMessage();
            interfaceC55701xos.EZpvd(false, null, new BizApiException(message == null ? "" : message, C33129mqd.gEmmrt(java.lang.Integer.valueOf(((OKServerException) th).getCode())), null, null, null, 28, null));
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        }
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC KWHzl(@NotNull java.lang.String str, @NotNull final InterfaceC55701xos<java.util.List<TickersData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getMarkPriceMultTicker(str), new Function1() { // from class: o.xIW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.iwGUEr(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xJk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.fIwbmz(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit iwGUEr(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC AEQbTJ(@NotNull final InterfaceC55701xos<java.util.List<TickersData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).batchMarketAllCupTickers(), new Function1() { // from class: o.xJa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.fARcdN(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xIX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.DbNXlk(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit fARcdN(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull final InterfaceC55701xos<java.util.List<IndexTickersData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getNewIndexTickers(str, str2, str3, str4), new Function1() { // from class: o.xJl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.wlaJM(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xJn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.hDKMBd(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit wlaJM(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC KWHzl(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull final InterfaceC55701xos<java.util.List<BizKLineData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        if (str3 == null) {
            str3 = "1440";
        }
        return C33024moe.subscribeOnIO$default(bizApiService.getHistoryMarketCandles(str, str2, str4, str3), new Function1() { // from class: o.xIV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.fIwbmz(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xIS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.KWHzl(interfaceC55701xos, this, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit fIwbmz(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull final InterfaceC55701xos<java.util.List<BizTradeData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getMarketTrades(str, str2), new Function1() { // from class: o.xJf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.zLjUOn(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xJd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xIN.fARcdN(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit zLjUOn(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public static final Unit getNewProxyInstance(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            interfaceC55701xos.EZpvd(true, null, null);
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizApiException(responseData.getMsg(), null, null, null, null, 30, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit getFieldNames(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            interfaceC55701xos.EZpvd(true, responseData.getData(), null);
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizApiException(responseData.getMsg(), null, null, null, null, 30, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit uzCIH(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        interfaceC55701xos.EZpvd(responseData.getCode() == 0 && responseData.getData() != null, null, (responseData.getCode() != 0 || responseData.getData() == null) ? new BizApiException(responseData.getMsg(), null, null, null, null, 30, null) : null);
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        interfaceC55701xos.EZpvd(responseData.getCode() == 0 && responseData.getData() != null, responseData.getData(), (responseData.getCode() != 0 || responseData.getData() == null) ? new BizApiException(responseData.getMsg(), null, null, null, null, 30, null) : null);
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        interfaceC55701xos.EZpvd(responseData.getCode() == 0 && responseData.getData() != null, responseData.getData(), (responseData.getCode() != 0 || responseData.getData() == null) ? new BizApiException(responseData.getMsg(), null, null, null, null, 30, null) : null);
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        interfaceC55701xos.EZpvd(responseData.getCode() == 0 && responseData.getData() != null, responseData.getData(), (responseData.getCode() != 0 || responseData.getData() == null) ? new BizApiException(responseData.getMsg(), null, null, null, null, 30, null) : null);
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        TickersData tickersData;
        Intrinsics.checkNotNullParameter(responseData, "");
        boolean z = responseData.getCode() == 0 && responseData.getData() != null;
        if (responseData.getCode() == 0 && responseData.getData() != null && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            tickersData = (TickersData) ((java.util.List) data).get(0);
        } else {
            tickersData = null;
        }
        interfaceC55701xos.EZpvd(z, tickersData, (responseData.getCode() != 0 || responseData.getData() == null) ? new BizApiException(responseData.getMsg(), null, null, null, null, 30, null) : null);
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        interfaceC55701xos.EZpvd(responseData.getCode() == 0 && responseData.getData() != null, responseData.getData(), (responseData.getCode() != 0 || responseData.getData() == null) ? new BizApiException(responseData.getMsg(), null, null, null, null, 30, null) : null);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(InterfaceC55701xos interfaceC55701xos, xIN xin, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        interfaceC55701xos.EZpvd(responseData.getCode() == 0 && responseData.getData() != null, xin.AEQbTJ((java.util.List<? extends java.util.List<java.lang.String>>) responseData.getData()), (responseData.getCode() != 0 || responseData.getData() == null) ? new BizApiException(responseData.getMsg(), null, null, null, null, 30, null) : null);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(InterfaceC55701xos interfaceC55701xos, xIN xin, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        interfaceC55701xos.EZpvd(responseData.getCode() == 0 && responseData.getData() != null, xin.AEQbTJ((java.util.List<? extends java.util.List<java.lang.String>>) responseData.getData()), (responseData.getCode() != 0 || responseData.getData() == null) ? new BizApiException(responseData.getMsg(), null, null, null, null, 30, null) : null);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(InterfaceC55701xos interfaceC55701xos, xIN xin, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        interfaceC55701xos.EZpvd(responseData.getCode() == 0 && responseData.getData() != null, xin.AEQbTJ((java.util.List<? extends java.util.List<java.lang.String>>) responseData.getData()), (responseData.getCode() != 0 || responseData.getData() == null) ? new BizApiException(responseData.getMsg(), null, null, null, null, 30, null) : null);
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        interfaceC55701xos.EZpvd(responseData.getCode() == 0 && responseData.getData() != null, responseData.getData(), (responseData.getCode() != 0 || responseData.getData() == null) ? new BizApiException(responseData.getMsg(), null, null, null, null, 30, null) : null);
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        interfaceC55701xos.EZpvd(responseData.getCode() == 0 && responseData.getData() != null, responseData.getData(), (responseData.getCode() != 0 || responseData.getData() == null) ? new BizApiException(responseData.getMsg(), null, null, null, null, 30, null) : null);
        return Unit.INSTANCE;
    }

    public static final Unit hDKMBd(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        interfaceC55701xos.EZpvd(responseData.getCode() == 0 && responseData.getData() != null, responseData.getData(), (responseData.getCode() != 0 || responseData.getData() == null) ? new BizApiException(responseData.getMsg(), null, null, null, null, 30, null) : null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(InterfaceC55701xos interfaceC55701xos, xIN xin, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        interfaceC55701xos.EZpvd(responseData.getCode() == 0 && responseData.getData() != null, xin.AEQbTJ((java.util.List<? extends java.util.List<java.lang.String>>) responseData.getData()), (responseData.getCode() != 0 || responseData.getData() == null) ? new BizApiException(responseData.getMsg(), null, null, null, null, 30, null) : null);
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        interfaceC55701xos.EZpvd(responseData.getCode() == 0 && responseData.getData() != null, responseData.getData(), (responseData.getCode() != 0 || responseData.getData() == null) ? new BizApiException(responseData.getMsg(), null, null, null, null, 30, null) : null);
        return Unit.INSTANCE;
    }
}
