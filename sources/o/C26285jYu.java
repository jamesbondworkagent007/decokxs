package o;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.okinc.business.dexlogic.bean.TradingHistoryStatisticsResult;
import com.okinc.business.market.features.history.domain.model.StatisticsExtraParams;
import com.okinc.business.market.features.holders.domain.model.HistoryStatistics;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jYu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26285jYu {
    public final Json KWHzl;
    public final Gson copydefault;

    public C26285jYu(@NotNull Json json, @NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(gson, "");
        this.KWHzl = json;
        this.copydefault = gson;
    }

    public final HistoryStatistics OLrzqt(@NotNull TradingHistoryStatisticsResult tradingHistoryStatisticsResult) {
        Intrinsics.checkNotNullParameter(tradingHistoryStatisticsResult, "");
        return new HistoryStatistics(tradingHistoryStatisticsResult.AEQbTJ(), tradingHistoryStatisticsResult.AuCTel(), tradingHistoryStatisticsResult.fIwbmz(), tradingHistoryStatisticsResult.djBIcL(), tradingHistoryStatisticsResult.copydefault(), tradingHistoryStatisticsResult.KWHzl(), tradingHistoryStatisticsResult.OLrzqt(), tradingHistoryStatisticsResult.EZpvd(), tradingHistoryStatisticsResult.isConnected(), tradingHistoryStatisticsResult.AkhnZx(), tradingHistoryStatisticsResult.fetchVPNInfo(), tradingHistoryStatisticsResult.values(), tradingHistoryStatisticsResult.valueOf(), tradingHistoryStatisticsResult.DbNXlk(), tradingHistoryStatisticsResult.gEmmrt(), tradingHistoryStatisticsResult.AhwBna(), tradingHistoryStatisticsResult.AYXKKw());
    }

    public final JsonObject EZpvd(@NotNull StatisticsExtraParams statisticsExtraParams) {
        Intrinsics.checkNotNullParameter(statisticsExtraParams, "");
        java.lang.Object objFromJson = this.copydefault.fromJson(this.KWHzl.encodeToString(StatisticsExtraParams.Companion.serializer(), statisticsExtraParams), (java.lang.Class<java.lang.Object>) JsonObject.class);
        Intrinsics.checkNotNullExpressionValue(objFromJson, "");
        return (JsonObject) objFromJson;
    }

    public final HistoryStatistics OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Json json = this.KWHzl;
            json.getSerializersModule();
            return OLrzqt((TradingHistoryStatisticsResult) json.decodeFromString(TradingHistoryStatisticsResult.Companion.serializer(), str));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
