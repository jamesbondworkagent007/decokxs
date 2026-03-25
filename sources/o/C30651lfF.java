package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.TokenMarketInfoResponse;
import com.okinc.business.dexlogic.bean.TokenPriceResponse;
import com.okinc.business.dexlogic.txs.TxType;
import com.okinc.business.market.data.model.history.HistoryChangeData;
import com.okinc.business.market.data.model.history.HistoryChangeFilterRequest;
import com.okinc.business.market.data.model.history.HistoryTokenChangeData;
import com.okinc.business.market.data.model.history.HistoryTokenFilterData;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedMarketToken;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedOrderBookFilter;
import com.okinc.business.trade.features.home.ui.cefi.data.FilterValue;
import com.okinc.business.trade.features.home.ui.cefi.data.MinMaxData;
import com.okinc.business.trade.features.home.ui.cefi.data.OrderBookInfo;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.lfF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30651lfF {
    public final Json AEQbTJ;
    public final Gson EZpvd;

    @yCM
    public C30651lfF(@NotNull Json json, @NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(gson, "");
        this.AEQbTJ = json;
        this.EZpvd = gson;
    }

    public final AdvancedMarketToken AEQbTJ(@NotNull TokenPriceResponse tokenPriceResponse) {
        Intrinsics.checkNotNullParameter(tokenPriceResponse, "");
        return new AdvancedMarketToken(tokenPriceResponse.KWHzl(), tokenPriceResponse.EZpvd(), C33129mqd.gEmmrt(java.lang.Double.valueOf(tokenPriceResponse.copydefault())), C33129mqd.gEmmrt(java.lang.Double.valueOf(tokenPriceResponse.OLrzqt())), "", "", (java.lang.String) null, 64, (DefaultConstructorMarker) null);
    }

    public final AdvancedMarketToken OLrzqt(@NotNull TokenMarketInfoResponse tokenMarketInfoResponse) {
        Intrinsics.checkNotNullParameter(tokenMarketInfoResponse, "");
        return new AdvancedMarketToken(tokenMarketInfoResponse.copydefault(), tokenMarketInfoResponse.EZpvd(), "", "", C33129mqd.gEmmrt(tokenMarketInfoResponse.OLrzqt()), tokenMarketInfoResponse.AEQbTJ(), C33129mqd.gEmmrt(tokenMarketInfoResponse.KWHzl()));
    }

    public final HistoryChangeFilterRequest OLrzqt(@NotNull OrderBookInfo orderBookInfo) {
        Intrinsics.checkNotNullParameter(orderBookInfo, "");
        java.lang.String chainId = orderBookInfo.getChainId();
        java.lang.String tokenAddress = orderBookInfo.getTokenAddress();
        java.lang.String type = orderBookInfo.getType();
        java.lang.String volumeMin = orderBookInfo.getVolumeMin();
        if (volumeMin == null) {
            volumeMin = "";
        }
        java.lang.String volumeMax = orderBookInfo.getVolumeMax();
        if (volumeMax == null) {
            volumeMax = "";
        }
        java.util.List<java.lang.String> userAddressList = orderBookInfo.getUserAddressList();
        if (userAddressList == null) {
            userAddressList = yDY.AhwBna();
        }
        java.lang.String str = null;
        java.lang.String str2 = null;
        java.lang.String str3 = null;
        DefaultConstructorMarker defaultConstructorMarker = null;
        return new HistoryChangeFilterRequest(new HistoryTokenFilterData(chainId, tokenAddress, type, volumeMin, volumeMax, userAddressList, (java.lang.String) null, (java.lang.String) null, str, str2, (java.lang.String) null, str3, 4032, defaultConstructorMarker), str, str2, false, str3, 30, defaultConstructorMarker);
    }

    public final C28222kTk KWHzl(AdvancedMarketToken advancedMarketToken) {
        kotlin.Pair pair;
        if (advancedMarketToken != null) {
            if (C59449zhJ.startsWith$default(advancedMarketToken.getChange(), "-", false, 2, null) || C59449zhJ.startsWith$default(advancedMarketToken.getChange(), Marker.ANY_NON_NULL_MARKER, false, 2, null)) {
                char cZLjUOn = C59454zhO.zLjUOn((java.lang.CharSequence) advancedMarketToken.getChange());
                java.lang.String strSubstring = advancedMarketToken.getChange().substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                pair = new kotlin.Pair(java.lang.String.valueOf(cZLjUOn), strSubstring);
            } else {
                pair = new kotlin.Pair(Marker.ANY_NON_NULL_MARKER, advancedMarketToken.getChange());
            }
            java.lang.String str = (java.lang.String) pair.component1();
            java.lang.String str2 = (java.lang.String) pair.component2();
            return new C28222kTk(advancedMarketToken.getMarketCap(), advancedMarketToken.getLiquidity(), advancedMarketToken.getPrice(), str + pTB.formatICUPercent$default(C33129mqd.EZpvd(str2), null, null, null, null, null, 31, null), advancedMarketToken.getTokenAddress(), advancedMarketToken.getCirculatingSupply());
        }
        return new C28222kTk(null, null, null, null, null, null, 63, null);
    }

    public final C28230kTs copydefault(DexMultiTokenInfoBean dexMultiTokenInfoBean, HistoryChangeData historyChangeData) {
        java.lang.Object next;
        java.lang.Object next2;
        if (historyChangeData == null) {
            return new C28230kTs(null, null, null, null, false, null, 63, null);
        }
        java.util.Iterator<T> it = historyChangeData.getChangedTokenInfo().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((HistoryTokenChangeData) next).getTokenAddress(), (java.lang.Object) (dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getTokenContractAddress() : null))) {
                break;
            }
        }
        HistoryTokenChangeData historyTokenChangeData = (HistoryTokenChangeData) next;
        if (historyTokenChangeData == null) {
            java.util.Iterator<T> it2 = historyChangeData.getChangedTokenInfo().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((HistoryTokenChangeData) next2).getTokenAddress(), (java.lang.Object) (dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getWTokenAddress() : null))) {
                    break;
                }
            }
            historyTokenChangeData = (HistoryTokenChangeData) next2;
        }
        java.lang.String id = historyChangeData.getId();
        C23272hvB c23272hvB = C23272hvB.KWHzl;
        java.lang.String scientificCurrency$default = C23272hvB.formatScientificCurrency$default(c23272hvB, historyChangeData.getPrice(), false, null, false, false, false, true, null, false, false, 479, null);
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) historyChangeData.isBuy(), (java.lang.Object) TxType.BUY.getValue());
        java.lang.String scientificCurrency$default2 = C23272hvB.formatScientificCurrency$default(c23272hvB, historyChangeData.getVolume(), true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
        java.lang.String amount = historyTokenChangeData != null ? historyTokenChangeData.getAmount() : null;
        java.lang.String localizedNumber$default = C23322hvz.toLocalizedNumber$default(amount == null ? "" : amount, false, (RoundingMode) null, true, false, 11, (java.lang.Object) null);
        java.lang.String tokenAddress = historyTokenChangeData != null ? historyTokenChangeData.getTokenAddress() : null;
        return new C28230kTs(id, scientificCurrency$default, scientificCurrency$default2, localizedNumber$default, zEZpvd, tokenAddress == null ? "" : tokenAddress);
    }

    public final AdvancedMarketToken AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Json json = this.AEQbTJ;
            json.getSerializersModule();
            return (AdvancedMarketToken) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) json.decodeFromString(new ArrayListSerializer(AdvancedMarketToken.Companion.serializer()), str));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final java.util.List<HistoryChangeData> copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Json json = this.AEQbTJ;
            json.getSerializersModule();
            return (java.util.List) json.decodeFromString(new ArrayListSerializer(HistoryChangeData.Companion.serializer()), str);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final JsonObject KWHzl(@NotNull OrderBookInfo orderBookInfo) {
        Intrinsics.checkNotNullParameter(orderBookInfo, "");
        Json json = this.AEQbTJ;
        json.getSerializersModule();
        java.lang.Object objFromJson = this.EZpvd.fromJson(json.encodeToString(OrderBookInfo.Companion.serializer(), orderBookInfo), (java.lang.Class<java.lang.Object>) JsonObject.class);
        Intrinsics.checkNotNullExpressionValue(objFromJson, "");
        return (JsonObject) objFromJson;
    }

    public final java.util.List<C28230kTs> KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean, java.util.List<HistoryChangeData> list) {
        java.util.ArrayList arrayList;
        if (list != null) {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(copydefault(dexMultiTokenInfoBean, (HistoryChangeData) it.next()));
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? yDY.AhwBna() : arrayList;
    }

    public final java.util.List<C55276xgr> KWHzl(@NotNull java.util.List<AdvancedOrderBookFilter> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            AdvancedOrderBookFilter advancedOrderBookFilter = (AdvancedOrderBookFilter) obj;
            java.lang.String msgKey = advancedOrderBookFilter.getMsgKey();
            MinMaxData valueData = advancedOrderBookFilter.getValueData();
            java.lang.String min = valueData != null ? valueData.getMin() : null;
            java.lang.String str = min == null ? "" : min;
            MinMaxData valueData2 = advancedOrderBookFilter.getValueData();
            java.lang.String max = valueData2 != null ? valueData2.getMax() : null;
            arrayList.add(new C55276xgr(msgKey, new FilterValue(null, null, str, max == null ? "" : max, 3, null), null, i == 0, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
            i++;
        }
        return arrayList;
    }
}
