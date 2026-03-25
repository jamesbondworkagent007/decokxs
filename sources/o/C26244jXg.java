package o;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.history.HistoryChangeData;
import com.okinc.business.market.data.model.history.HistoryTokenChangeData;
import com.okinc.business.market.data.model.history.HistoryTokenFilterData;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.business.market.features.history.domain.model.HistoryChange;
import com.okinc.business.market.features.history.domain.model.HistoryTokenChange;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jXg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26244jXg {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final Json AEQbTJ;
    public final C29708kyj KWHzl;
    public final Gson copydefault;

    public C26244jXg(@NotNull Json json, @NotNull Gson gson, @NotNull C29708kyj c29708kyj) {
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(gson, "");
        Intrinsics.checkNotNullParameter(c29708kyj, "");
        this.AEQbTJ = json;
        this.copydefault = gson;
        this.KWHzl = c29708kyj;
    }

    public final HistoryTokenFilterData KWHzl(@NotNull TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        if (tokenFilter.AEQbTJ()) {
            return new HistoryTokenFilterData(tokenFilter.KWHzl(), tokenFilter.isConnected(), tokenFilter.DbNXlk(), (java.lang.String) null, (java.lang.String) null, tokenFilter.OLrzqt(), tokenFilter.EZpvd(), tokenFilter.copydefault().AhwBna(), tokenFilter.copydefault().KWHzl(), tokenFilter.valueOf().OLrzqt(), tokenFilter.valueOf().EZpvd(), tokenFilter.fetchVPNInfo(), 24, (DefaultConstructorMarker) null);
        }
        return new HistoryTokenFilterData(tokenFilter.KWHzl(), tokenFilter.isConnected(), tokenFilter.DbNXlk(), tokenFilter.AYXKKw().AhwBna(), tokenFilter.AYXKKw().KWHzl(), tokenFilter.OLrzqt(), tokenFilter.EZpvd(), (java.lang.String) null, (java.lang.String) null, tokenFilter.valueOf().OLrzqt(), tokenFilter.valueOf().EZpvd(), tokenFilter.fetchVPNInfo(), MLKEMEngine.KyberPolyBytes, (DefaultConstructorMarker) null);
    }

    public final JsonObject AEQbTJ(@NotNull TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        HistoryTokenFilterData historyTokenFilterDataKWHzl = KWHzl(tokenFilter);
        Json json = this.AEQbTJ;
        json.getSerializersModule();
        java.lang.Object objFromJson = this.copydefault.fromJson(json.encodeToString(HistoryTokenFilterData.Companion.serializer(), historyTokenFilterDataKWHzl), (java.lang.Class<java.lang.Object>) JsonObject.class);
        Intrinsics.checkNotNullExpressionValue(objFromJson, "");
        return (JsonObject) objFromJson;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.kyj.invoke$default(o.kyj, com.okinc.business.market.data.model.CompactTagData, com.okinc.business.market.features.tag.domain.TagLocalProperty, com.okinc.business.market.features.tag.domain.TagEventProperty, int, java.lang.Object):com.okinc.business.market.features.tag.domain.CompactTag */
    public final HistoryChange OLrzqt(@NotNull HistoryChangeData historyChangeData) {
        Intrinsics.checkNotNullParameter(historyChangeData, "");
        java.lang.String id = historyChangeData.getId();
        java.lang.String chainId = historyChangeData.getChainId();
        java.lang.String dexName = historyChangeData.getDexName();
        java.lang.String price = historyChangeData.getPrice();
        java.lang.String volume = historyChangeData.getVolume();
        java.lang.String poolLogoUrl = historyChangeData.getPoolLogoUrl();
        java.lang.String txHashUrl = historyChangeData.getTxHashUrl();
        java.lang.String strIsBuy = historyChangeData.isBuy();
        java.lang.String userAddress = historyChangeData.getUserAddress();
        java.util.List<HistoryTokenChangeData> changedTokenInfo = historyChangeData.getChangedTokenInfo();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(changedTokenInfo, 10));
        java.util.Iterator<T> it = changedTokenInfo.iterator();
        while (it.hasNext()) {
            arrayList.add(copydefault((HistoryTokenChangeData) it.next()));
        }
        java.lang.String tokenSymbol = historyChangeData.getTokenSymbol();
        java.lang.String amount = historyChangeData.getAmount();
        java.lang.String timestamp = historyChangeData.getTimestamp();
        java.lang.String baseTokenPrice = historyChangeData.getBaseTokenPrice();
        java.util.List<CompactTagData> newTagList = historyChangeData.getNewTagList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(newTagList, 10));
        java.util.Iterator<T> it2 = newTagList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(C29708kyj.invoke$default(this.KWHzl, (CompactTagData) it2.next(), null, null, 6, null));
        }
        return new HistoryChange(id, chainId, dexName, price, poolLogoUrl, txHashUrl, volume, userAddress, arrayList, tokenSymbol, amount, timestamp, strIsBuy, baseTokenPrice, arrayList2);
    }

    public final HistoryTokenChange copydefault(HistoryTokenChangeData historyTokenChangeData) {
        return new HistoryTokenChange(historyTokenChangeData.getSymbol(), historyTokenChangeData.getAmount(), null, 4, null);
    }

    /* JADX INFO: renamed from: o.jXg$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jXg.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final HistoryChange OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Json json = this.AEQbTJ;
            json.getSerializersModule();
            return OLrzqt((HistoryChangeData) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) json.decodeFromString(new ArrayListSerializer(HistoryChangeData.Companion.serializer()), str)));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public final HistoryChange AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Json json = this.AEQbTJ;
            json.getSerializersModule();
            return OLrzqt((HistoryChangeData) json.decodeFromString(HistoryChangeData.Companion.serializer(), str));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
