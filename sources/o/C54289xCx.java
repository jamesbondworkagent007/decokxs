package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.TickerCupReq;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xCx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54289xCx extends xKE<java.util.List<? extends TickersData>> {
    public TickerCupReq EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull TickerCupReq tickerCupReq) {
        Intrinsics.checkNotNullParameter(tickerCupReq, "");
        this.EZpvd = tickerCupReq;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.subscribe.TickersData>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends TickersData>>> EZpvd() {
        TickerCupReq tickerCupReq = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        TickerCupReq tickerCupReq2 = this.EZpvd;
        if (tickerCupReq2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            tickerCupReq = tickerCupReq2;
        }
        return bizApiService.batchMarketCupTickers(EZpvd(tickerCupReq));
    }

    public final java.lang.String EZpvd(TickerCupReq tickerCupReq) {
        java.util.List<java.lang.String> ccy;
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(tickerCupReq.getCcy().size()), 50)) {
            ccy = CollectionsKt___CollectionsKt.copydefault((java.util.List) tickerCupReq.getCcy(), new kotlin.ranges.IntRange(0, 49));
        } else {
            ccy = tickerCupReq.getCcy();
        }
        return CollectionsKt___CollectionsKt.joinToString$default(ccy, ",", null, null, 0, null, null, 62, null);
    }
}
