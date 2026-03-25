package o;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.okinc.business.market.data.model.AdvancedFilterData;
import com.okinc.business.market.features.filter.domain.AdvancedFilter;
import com.okinc.business.market.features.home_token_list.repo.WsExtraParams;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jUB {
    public final Json EZpvd;
    public final Gson KWHzl;

    @yCM
    public jUB(@NotNull Json json, @NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(gson, "");
        this.EZpvd = json;
        this.KWHzl = gson;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> KWHzl(@NotNull AdvancedFilter advancedFilter) {
        Intrinsics.checkNotNullParameter(advancedFilter, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("rankBy", java.lang.Integer.valueOf(advancedFilter.isConnected().getValue()));
        linkedHashMap.put("desc", java.lang.Boolean.valueOf(advancedFilter.EZpvd()));
        linkedHashMap.put("periodType", java.lang.Integer.valueOf(advancedFilter.fetchVPNInfo().getValue()));
        linkedHashMap.put("riskFilter", java.lang.Boolean.valueOf(advancedFilter.fJNWhG()));
        linkedHashMap.put("changePeriod", java.lang.Integer.valueOf(advancedFilter.copydefault().getValue()));
        linkedHashMap.put("changeMin", advancedFilter.OLrzqt());
        linkedHashMap.put("changeMax", advancedFilter.KWHzl());
        linkedHashMap.put("tradeNumPeriod", java.lang.Integer.valueOf(advancedFilter.iwGUEr().getValue()));
        linkedHashMap.put("tradeNumMin", advancedFilter.getNewProxyInstance());
        linkedHashMap.put("tradeNumMax", advancedFilter.uzCIH());
        linkedHashMap.put("holdersMin", advancedFilter.AhwBna());
        linkedHashMap.put("holdersMax", advancedFilter.AYXKKw());
        linkedHashMap.put("volumePeriod", java.lang.Integer.valueOf(advancedFilter.AwvSrB().getValue()));
        linkedHashMap.put("volumeMin", advancedFilter.sSMYrx());
        linkedHashMap.put("volumeMax", advancedFilter.AxsJAY());
        linkedHashMap.put("txsPeriod", java.lang.Integer.valueOf(advancedFilter.zLjUOn().getValue()));
        linkedHashMap.put("txsMin", advancedFilter.zsXlph());
        linkedHashMap.put("txsMax", advancedFilter.getFieldNames());
        linkedHashMap.put("uniqueTraderPeriod", java.lang.Integer.valueOf(advancedFilter.wlaJM().getValue()));
        linkedHashMap.put("uniqueTraderMin", advancedFilter.AubY());
        linkedHashMap.put("uniqueTraderMax", advancedFilter.AuCTelauCTel());
        linkedHashMap.put("marketCapMin", advancedFilter.AkhnZx());
        linkedHashMap.put("marketCapMax", advancedFilter.DbNXlk());
        linkedHashMap.put("fdvMin", advancedFilter.valueOf());
        linkedHashMap.put("fdvMax", advancedFilter.gEmmrt());
        linkedHashMap.put("liquidityMin", advancedFilter.values());
        linkedHashMap.put("liquidityMax", advancedFilter.djBIcL());
        linkedHashMap.put("tokenAgeType", java.lang.Integer.valueOf(advancedFilter.hDKMBd().getValue()));
        linkedHashMap.put("tokenAgeMin", advancedFilter.fIwbmz());
        linkedHashMap.put("tokenAgeMax", advancedFilter.AuCTel());
        linkedHashMap.put("tags", java.lang.Integer.valueOf(advancedFilter.fARcdN()));
        linkedHashMap.put("stableTokenFilter", java.lang.Boolean.valueOf(advancedFilter.ejfBZ()));
        return linkedHashMap;
    }

    public static /* synthetic */ WsArgV5ForWeb3 toWsArgs$default(jUB jub, AdvancedFilter advancedFilter, java.lang.String str, java.lang.String str2, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 8) != 0) {
            i = 1;
        }
        int i5 = i;
        if ((i4 & 16) != 0) {
            i2 = 200;
        }
        int i6 = i2;
        if ((i4 & 32) != 0) {
            i3 = 0;
        }
        return jub.KWHzl(advancedFilter, str, str2, i5, i6, i3);
    }

    public final WsArgV5ForWeb3 KWHzl(AdvancedFilter advancedFilter, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new WsArgV5ForWeb3("dex-market-custom-rank-web", null, null, null, (JsonObject) this.KWHzl.fromJson(this.EZpvd.encodeToString(WsExtraParams.Companion.serializer(), new WsExtraParams(i3, i, i2, 4, advancedFilter != null ? AEQbTJ(advancedFilter, i, i2, i3) : null, str, str2)), JsonObject.class), 14, null);
    }

    public final AdvancedFilterData AEQbTJ(AdvancedFilter advancedFilter, int i, int i2, int i3) {
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(advancedFilter.AEQbTJ(), ",", null, null, 0, null, null, 62, null);
        if (strJoinToString$default.length() == 0) {
            strJoinToString$default = "all";
        }
        return new AdvancedFilterData(strJoinToString$default, advancedFilter.copydefault(), advancedFilter.OLrzqt(), advancedFilter.KWHzl(), advancedFilter.EZpvd(), advancedFilter.AhwBna(), advancedFilter.AYXKKw(), advancedFilter.values(), advancedFilter.djBIcL(), false, advancedFilter.fetchVPNInfo(), advancedFilter.fJNWhG(), advancedFilter.ejfBZ(), advancedFilter.iwGUEr(), advancedFilter.getNewProxyInstance(), advancedFilter.uzCIH(), advancedFilter.zLjUOn(), advancedFilter.zsXlph(), advancedFilter.getFieldNames(), advancedFilter.sSMYrx(), advancedFilter.AxsJAY(), advancedFilter.AwvSrB(), 4, advancedFilter.isConnected(), advancedFilter.hDKMBd(), advancedFilter.fIwbmz(), advancedFilter.AuCTel(), i2, i, i3, advancedFilter.wlaJM(), advancedFilter.AubY(), advancedFilter.AuCTelauCTel(), advancedFilter.fetchVPNInfo(), (java.lang.String) null, advancedFilter.AkhnZx(), advancedFilter.DbNXlk(), 512, 4, (DefaultConstructorMarker) null);
    }
}
