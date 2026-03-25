package com.okinc.business.market.features.smart_money.ranking.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.business.dexlogic.txs.TxType;
import com.okinc.business.market.common.constants.CategoryType;
import com.okinc.business.market.common.constants.DurationType;
import com.okinc.business.market.common.constants.SortingType;
import com.okinc.business.market.features.smart_money.ranking.ui.model.RankingFilterModel;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalFilter;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalMultiSelectUiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56424yEw;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SmartMoneyConfig implements Parcelable {
    public static final Parcelable.Creator<SmartMoneyConfig> CREATOR = new Creator();
    public final List<MarketChainBean> AEQbTJ;
    public final TxType AYXKKw;
    public final Map<String, List<SignalMultiSelectUiModel>> AhwBna;
    public final SignalFilter EZpvd;
    public final String KWHzl;
    public final CategoryType OLrzqt;
    public final RankingFilterModel copydefault;
    public final SortingType djBIcL;
    public final DurationType valueOf;

    public static final class Creator implements Parcelable.Creator<SmartMoneyConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartMoneyConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(MarketChainBean.CREATOR.createFromParcel(parcel));
            }
            TxType txTypeCreateFromParcel = TxType.CREATOR.createFromParcel(parcel);
            CategoryType categoryTypeValueOf = CategoryType.valueOf(parcel.readString());
            DurationType durationTypeValueOf = DurationType.valueOf(parcel.readString());
            SortingType sortingTypeValueOf = SortingType.valueOf(parcel.readString());
            SignalFilter signalFilterCreateFromParcel = parcel.readInt() == 0 ? null : SignalFilter.CREATOR.createFromParcel(parcel);
            RankingFilterModel rankingFilterModelCreateFromParcel = parcel.readInt() != 0 ? RankingFilterModel.CREATOR.createFromParcel(parcel) : null;
            int i3 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                String string2 = parcel.readString();
                int i5 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i5);
                int i6 = 0;
                while (true) {
                    int i7 = i3;
                    if (i6 != i5) {
                        arrayList2.add(SignalMultiSelectUiModel.CREATOR.createFromParcel(parcel));
                        i6++;
                        i3 = i7;
                    }
                }
                linkedHashMap.put(string2, arrayList2);
            }
            return new SmartMoneyConfig(string, arrayList, txTypeCreateFromParcel, categoryTypeValueOf, durationTypeValueOf, sortingTypeValueOf, signalFilterCreateFromParcel, rankingFilterModelCreateFromParcel, linkedHashMap);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartMoneyConfig[] newArray(int i) {
            return new SmartMoneyConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SmartMoneyConfig() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartMoneyConfig KWHzl(@NotNull String str, @NotNull List<MarketChainBean> list, @NotNull TxType txType, @NotNull CategoryType categoryType, @NotNull DurationType durationType, @NotNull SortingType sortingType, SignalFilter signalFilter, RankingFilterModel rankingFilterModel, @NotNull Map<String, ? extends List<SignalMultiSelectUiModel>> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(txType, "");
        Intrinsics.checkNotNullParameter(categoryType, "");
        Intrinsics.checkNotNullParameter(durationType, "");
        Intrinsics.checkNotNullParameter(sortingType, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new SmartMoneyConfig(str, list, txType, categoryType, durationType, sortingType, signalFilter, rankingFilterModel, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, List<SignalMultiSelectUiModel>> OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MarketChainBean> copydefault() {
        return this.AEQbTJ;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartMoneyConfig)) {
            return false;
        }
        SmartMoneyConfig smartMoneyConfig = (SmartMoneyConfig) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) smartMoneyConfig.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, smartMoneyConfig.AEQbTJ) && this.AYXKKw == smartMoneyConfig.AYXKKw && this.OLrzqt == smartMoneyConfig.OLrzqt && this.valueOf == smartMoneyConfig.valueOf && this.djBIcL == smartMoneyConfig.djBIcL && Intrinsics.EZpvd(this.EZpvd, smartMoneyConfig.EZpvd) && Intrinsics.EZpvd(this.copydefault, smartMoneyConfig.copydefault) && Intrinsics.EZpvd(this.AhwBna, smartMoneyConfig.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        int iHashCode3 = this.AYXKKw.hashCode();
        int iHashCode4 = this.OLrzqt.hashCode();
        int iHashCode5 = this.valueOf.hashCode();
        int iHashCode6 = this.djBIcL.hashCode();
        SignalFilter signalFilter = this.EZpvd;
        int iHashCode7 = signalFilter == null ? 0 : signalFilter.hashCode();
        RankingFilterModel rankingFilterModel = this.copydefault;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (rankingFilterModel != null ? rankingFilterModel.hashCode() : 0)) * 31) + this.AhwBna.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SmartMoneyConfig(selectedChainId=" + this.KWHzl + ", popularChains=" + this.AEQbTJ + ", selectedTrend=" + this.AYXKKw + ", selectedCategory=" + this.OLrzqt + ", selectedDuration=" + this.valueOf + ", selectedRanking=" + this.djBIcL + ", appliedSignalFilter=" + this.EZpvd + ", appliedRankingFilter=" + this.copydefault + ", supportedSignalProtocols=" + this.AhwBna + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        List<MarketChainBean> list = this.AEQbTJ;
        parcel.writeInt(list.size());
        Iterator<MarketChainBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        this.AYXKKw.writeToParcel(parcel, i);
        parcel.writeString(this.OLrzqt.name());
        parcel.writeString(this.valueOf.name());
        parcel.writeString(this.djBIcL.name());
        SignalFilter signalFilter = this.EZpvd;
        if (signalFilter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            signalFilter.writeToParcel(parcel, i);
        }
        RankingFilterModel rankingFilterModel = this.copydefault;
        if (rankingFilterModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rankingFilterModel.writeToParcel(parcel, i);
        }
        Map<String, List<SignalMultiSelectUiModel>> map = this.AhwBna;
        parcel.writeInt(map.size());
        for (Map.Entry<String, List<SignalMultiSelectUiModel>> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            List<SignalMultiSelectUiModel> value = entry.getValue();
            parcel.writeInt(value.size());
            Iterator<SignalMultiSelectUiModel> it2 = value.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.List<com.okinc.business.market.features.smart_money.signal.domain.model.SignalMultiSelectUiModel>> */
    /* JADX WARN: Multi-variable type inference failed */
    public SmartMoneyConfig(@NotNull String str, @NotNull List<MarketChainBean> list, @NotNull TxType txType, @NotNull CategoryType categoryType, @NotNull DurationType durationType, @NotNull SortingType sortingType, SignalFilter signalFilter, RankingFilterModel rankingFilterModel, @NotNull Map<String, ? extends List<SignalMultiSelectUiModel>> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(txType, "");
        Intrinsics.checkNotNullParameter(categoryType, "");
        Intrinsics.checkNotNullParameter(durationType, "");
        Intrinsics.checkNotNullParameter(sortingType, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.KWHzl = str;
        this.AEQbTJ = list;
        this.AYXKKw = txType;
        this.OLrzqt = categoryType;
        this.valueOf = durationType;
        this.djBIcL = sortingType;
        this.EZpvd = signalFilter;
        this.copydefault = rankingFilterModel;
        this.AhwBna = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000e: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:17)) : (r12v0 java.util.List))
  (wrap:com.okinc.business.dexlogic.txs.TxType:?: TERNARY null = ((wrap:int:0x0014: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: SGET  A[WRAPPED] (LINE:18) com.okinc.business.dexlogic.txs.TxType.ALL com.okinc.business.dexlogic.txs.TxType) : (r13v0 com.okinc.business.dexlogic.txs.TxType))
  (wrap:com.okinc.business.market.common.constants.CategoryType:?: TERNARY null = ((wrap:int:0x001c: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0020: SGET  A[WRAPPED] (LINE:19) com.okinc.business.market.common.constants.CategoryType.ALL com.okinc.business.market.common.constants.CategoryType) : (r14v0 com.okinc.business.market.common.constants.CategoryType))
  (wrap:com.okinc.business.market.common.constants.DurationType:?: TERNARY null = ((wrap:int:0x0024: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0028: SGET  A[WRAPPED] (LINE:20) com.okinc.business.market.common.constants.DurationType.ONE_DAY com.okinc.business.market.common.constants.DurationType) : (r15v0 com.okinc.business.market.common.constants.DurationType))
  (wrap:com.okinc.business.market.common.constants.SortingType:?: TERNARY null = ((wrap:int:0x002c: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0030: SGET  A[WRAPPED] (LINE:21) com.okinc.business.market.common.constants.SortingType.PnL com.okinc.business.market.common.constants.SortingType) : (r16v0 com.okinc.business.market.common.constants.SortingType))
  (wrap:com.okinc.business.market.features.smart_money.signal.domain.model.SignalFilter:?: TERNARY null = ((wrap:int:0x0035: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.smart_money.signal.domain.model.SignalFilter) : (r17v0 com.okinc.business.market.features.smart_money.signal.domain.model.SignalFilter))
  (wrap:com.okinc.business.market.features.smart_money.ranking.ui.model.RankingFilterModel:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r18v0 com.okinc.business.market.features.smart_money.ranking.ui.model.RankingFilterModel) : (null com.okinc.business.market.features.smart_money.ranking.ui.model.RankingFilterModel))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0045: ARITH (r20v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0049: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:24)) : (r19v0 java.util.Map))
 A[MD:(java.lang.String, java.util.List<com.okinc.business.dexlogic.main.market.chain.MarketChainBean>, com.okinc.business.dexlogic.txs.TxType, com.okinc.business.market.common.constants.CategoryType, com.okinc.business.market.common.constants.DurationType, com.okinc.business.market.common.constants.SortingType, com.okinc.business.market.features.smart_money.signal.domain.model.SignalFilter, com.okinc.business.market.features.smart_money.ranking.ui.model.RankingFilterModel, java.util.Map<java.lang.String, ? extends java.util.List<com.okinc.business.market.features.smart_money.signal.domain.model.SignalMultiSelectUiModel>>):void (m)] (LINE:15) call: com.okinc.business.market.features.smart_money.ranking.domain.model.SmartMoneyConfig.<init>(java.lang.String, java.util.List, com.okinc.business.dexlogic.txs.TxType, com.okinc.business.market.common.constants.CategoryType, com.okinc.business.market.common.constants.DurationType, com.okinc.business.market.common.constants.SortingType, com.okinc.business.market.features.smart_money.signal.domain.model.SignalFilter, com.okinc.business.market.features.smart_money.ranking.ui.model.RankingFilterModel, java.util.Map):void type: THIS */
    public /* synthetic */ SmartMoneyConfig(String str, List list, TxType txType, CategoryType categoryType, DurationType durationType, SortingType sortingType, SignalFilter signalFilter, RankingFilterModel rankingFilterModel, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? TxType.ALL : txType, (i & 8) != 0 ? CategoryType.ALL : categoryType, (i & 16) != 0 ? DurationType.ONE_DAY : durationType, (i & 32) != 0 ? SortingType.PnL : sortingType, (i & 64) != 0 ? null : signalFilter, (i & 128) == 0 ? rankingFilterModel : null, (i & 256) != 0 ? C56424yEw.KWHzl() : map);
    }
}
