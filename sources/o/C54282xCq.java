package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.TickerInstReq;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xCq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54282xCq extends xKE<java.util.List<? extends TickersData>> {
    public static final int EZpvd = 8;
    public java.lang.String AEQbTJ = "";
    public java.util.List<java.lang.String> OLrzqt = yDY.AhwBna();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54282xCq AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54282xCq KWHzl(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.subscribe.TickersData>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends TickersData>>> EZpvd() {
        if (!this.OLrzqt.isEmpty()) {
            return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).batchMarketTickers(CollectionsKt___CollectionsKt.joinToString$default(this.OLrzqt, ",", null, null, 0, null, null, 62, null));
        }
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).batchMarketTickers(EZpvd(new TickerInstReq(C56402yEa.EZpvd(this.AEQbTJ))));
    }

    public final java.lang.String EZpvd(TickerInstReq tickerInstReq) {
        java.util.List<java.lang.String> instIds;
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(tickerInstReq.getInstIds().size()), 50)) {
            instIds = CollectionsKt___CollectionsKt.copydefault((java.util.List) tickerInstReq.getInstIds(), new kotlin.ranges.IntRange(0, 49));
        } else {
            instIds = tickerInstReq.getInstIds();
        }
        return CollectionsKt___CollectionsKt.joinToString$default(instIds, ",", null, null, 0, null, null, 62, null);
    }
}
