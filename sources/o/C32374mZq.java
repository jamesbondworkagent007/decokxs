package o;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.okinc.dexkline.market.data.model.CompactTagData;
import com.okinc.dexkline.market.data.model.history.HistoryChangeData;
import com.okinc.dexkline.market.data.model.history.HistoryTokenChangeData;
import com.okinc.dexkline.market.data.model.history.HistoryTokenFilterData;
import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import com.okinc.dexkline.market.features.history.domian.models.HistoryChange;
import com.okinc.dexkline.market.features.history.domian.models.HistoryTokenChange;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mZq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C32374mZq {
    public final Json KWHzl;
    public final Gson OLrzqt;
    public final C34539ndw copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    public C32374mZq(@NotNull Json json, @NotNull Gson gson, @NotNull C34539ndw c34539ndw) {
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(gson, "");
        Intrinsics.checkNotNullParameter(c34539ndw, "");
        this.KWHzl = json;
        this.OLrzqt = gson;
        this.copydefault = c34539ndw;
    }

    public final HistoryTokenFilterData AEQbTJ(@NotNull TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        if (tokenFilter.OLrzqt()) {
            return new HistoryTokenFilterData(tokenFilter.KWHzl(), tokenFilter.DbNXlk(), tokenFilter.isConnected(), (java.lang.String) null, (java.lang.String) null, tokenFilter.EZpvd(), tokenFilter.copydefault(), tokenFilter.gEmmrt().AhwBna(), tokenFilter.gEmmrt().OLrzqt(), tokenFilter.djBIcL().KWHzl(), tokenFilter.djBIcL().copydefault(), 24, (DefaultConstructorMarker) null);
        }
        return new HistoryTokenFilterData(tokenFilter.KWHzl(), tokenFilter.DbNXlk(), tokenFilter.isConnected(), tokenFilter.AYXKKw().AhwBna(), tokenFilter.AYXKKw().OLrzqt(), tokenFilter.EZpvd(), tokenFilter.copydefault(), (java.lang.String) null, (java.lang.String) null, tokenFilter.djBIcL().KWHzl(), tokenFilter.djBIcL().copydefault(), MLKEMEngine.KyberPolyBytes, (DefaultConstructorMarker) null);
    }

    public final JsonObject EZpvd(@NotNull TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        HistoryTokenFilterData historyTokenFilterDataAEQbTJ = AEQbTJ(tokenFilter);
        Json json = this.KWHzl;
        json.getSerializersModule();
        java.lang.Object objFromJson = this.OLrzqt.fromJson(json.encodeToString(HistoryTokenFilterData.Companion.serializer(), historyTokenFilterDataAEQbTJ), (java.lang.Class<java.lang.Object>) JsonObject.class);
        Intrinsics.checkNotNullExpressionValue(objFromJson, "");
        return (JsonObject) objFromJson;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ndw.invoke$default(o.ndw, com.okinc.dexkline.market.data.model.CompactTagData, com.okinc.dexkline.market.features.tag.domain.TagLocalProperty, com.okinc.dexkline.market.features.tag.domain.TagEventProperty, int, java.lang.Object):com.okinc.dexkline.market.features.tag.domain.CompactTag */
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
            arrayList.add(KWHzl((HistoryTokenChangeData) it.next()));
        }
        java.lang.String tokenSymbol = historyChangeData.getTokenSymbol();
        java.lang.String amount = historyChangeData.getAmount();
        java.lang.String timestamp = historyChangeData.getTimestamp();
        java.lang.String baseTokenPrice = historyChangeData.getBaseTokenPrice();
        java.util.List<CompactTagData> newTagList = historyChangeData.getNewTagList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(newTagList, 10));
        java.util.Iterator<T> it2 = newTagList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(C34539ndw.invoke$default(this.copydefault, (CompactTagData) it2.next(), null, null, 6, null));
        }
        return new HistoryChange(id, chainId, dexName, price, poolLogoUrl, txHashUrl, volume, userAddress, arrayList, tokenSymbol, amount, timestamp, strIsBuy, baseTokenPrice, arrayList2);
    }

    public final HistoryTokenChange KWHzl(HistoryTokenChangeData historyTokenChangeData) {
        return new HistoryTokenChange(historyTokenChangeData.getSymbol(), historyTokenChangeData.getAmount(), null, 4, null);
    }

    /* JADX INFO: renamed from: o.mZq$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mZq.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final HistoryChange KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Json json = this.KWHzl;
            json.getSerializersModule();
            return OLrzqt((HistoryChangeData) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) json.decodeFromString(new ArrayListSerializer(HistoryChangeData.Companion.serializer()), str)));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public final HistoryChange AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Json json = this.KWHzl;
            json.getSerializersModule();
            return OLrzqt((HistoryChangeData) json.decodeFromString(HistoryChangeData.Companion.serializer(), str));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
