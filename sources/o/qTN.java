package o;

import com.okinc.market.common.MarketHttpApi;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_trade.biz.subscribe.TickerCupReq;
import com.okinc.unify_trade.biz.subscribe.TickerInstReq;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.exception.BizSystemException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qTN {
    public static final InterfaceC58217yxC copydefault(@NotNull TickerCupReq tickerCupReq, @NotNull final InterfaceC55701xos<java.util.List<TickersData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(tickerCupReq, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        AbstractC58185ywX<ResponseData<java.util.List<TickersData>>> abstractC58185ywXCopydefault = ((MarketHttpApi) C43393roT.httpService$default(C56524yIo.AEQbTJ(MarketHttpApi.class), null, 1, null)).batchMarketCupTickers(copydefault(tickerCupReq)).copydefault(yBP.AEQbTJ());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return yBI.subscribeBy$default(abstractC58185ywXCopydefault, new Function1() { // from class: o.qTP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qTN.KWHzl(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.qTR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qTN.KWHzl(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit KWHzl(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        try {
            interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC58217yxC EZpvd(@NotNull TickerInstReq tickerInstReq, @NotNull final InterfaceC55701xos<java.util.List<TickersData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(tickerInstReq, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        AbstractC58185ywX<ResponseData<java.util.List<TickersData>>> abstractC58185ywXCopydefault = ((MarketHttpApi) C43393roT.httpService$default(C56524yIo.AEQbTJ(MarketHttpApi.class), null, 1, null)).batchMarketTickers(AEQbTJ(tickerInstReq)).copydefault(yBP.AEQbTJ());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return yBI.subscribeBy$default(abstractC58185ywXCopydefault, new Function1() { // from class: o.qTU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qTN.valueOf(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.qTS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qTN.AYXKKw(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit valueOf(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public static final InterfaceC58217yxC EZpvd(@NotNull final InterfaceC55701xos<java.util.List<TickersData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        AbstractC58185ywX<ResponseData<java.util.List<TickersData>>> abstractC58185ywXCopydefault = ((MarketHttpApi) C43393roT.httpService$default(C56524yIo.AEQbTJ(MarketHttpApi.class), null, 1, null)).batchMarketAllCupTickers().copydefault(yBP.AEQbTJ());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return yBI.subscribeBy$default(abstractC58185ywXCopydefault, new Function1() { // from class: o.qTO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qTN.OLrzqt(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.qTQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qTN.AEQbTJ(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public static final java.lang.String copydefault(@NotNull TickerCupReq tickerCupReq) {
        java.util.List<java.lang.String> ccy;
        Intrinsics.checkNotNullParameter(tickerCupReq, "");
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(tickerCupReq.getCcy().size()), 50)) {
            ccy = CollectionsKt___CollectionsKt.copydefault((java.util.List) tickerCupReq.getCcy(), new kotlin.ranges.IntRange(0, 49));
        } else {
            ccy = tickerCupReq.getCcy();
        }
        return CollectionsKt___CollectionsKt.joinToString$default(ccy, ",", null, null, 0, null, null, 62, null);
    }

    public static final java.lang.String AEQbTJ(@NotNull TickerInstReq tickerInstReq) {
        java.util.List<java.lang.String> instIds;
        Intrinsics.checkNotNullParameter(tickerInstReq, "");
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(tickerInstReq.getInstIds().size()), 50)) {
            instIds = CollectionsKt___CollectionsKt.copydefault((java.util.List) tickerInstReq.getInstIds(), new kotlin.ranges.IntRange(0, 49));
        } else {
            instIds = tickerInstReq.getInstIds();
        }
        return CollectionsKt___CollectionsKt.joinToString$default(instIds, ",", null, null, 0, null, null, 62, null);
    }

    public static final Unit KWHzl(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        interfaceC55701xos.EZpvd(responseData.getCode() == 0 && responseData.getData() != null, responseData.getData(), (responseData.getCode() != 0 || responseData.getData() == null) ? new BizApiException(responseData.getMsg(), null, null, null, null, 30, null) : null);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        interfaceC55701xos.EZpvd(responseData.getCode() == 0 && responseData.getData() != null, responseData.getData(), (responseData.getCode() != 0 || responseData.getData() == null) ? new BizApiException(responseData.getMsg(), null, null, null, null, 30, null) : null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        interfaceC55701xos.EZpvd(responseData.getCode() == 0 && responseData.getData() != null, responseData.getData(), (responseData.getCode() != 0 || responseData.getData() == null) ? new BizApiException(responseData.getMsg(), null, null, null, null, 30, null) : null);
        return Unit.INSTANCE;
    }
}
