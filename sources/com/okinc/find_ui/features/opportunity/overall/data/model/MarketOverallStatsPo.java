package com.okinc.find_ui.features.opportunity.overall.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketOverallStatsPo {
    public static final int $stable = 8;

    @SerializedName("marketChange")
    private final String capRatio;

    @SerializedName("marketCap")
    private final String capValue;

    @SerializedName("dominance")
    private final List<DominanceCoinPo> dominance;

    @SerializedName("volumeChange")
    private final String volumeRatio;

    @SerializedName("volume")
    private final String volumeValue;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketOverallStatsPo() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.find_ui.features.opportunity.overall.data.model.MarketOverallStatsPo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketOverallStatsPo copy$default(MarketOverallStatsPo marketOverallStatsPo, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketOverallStatsPo.capValue;
        }
        if ((i & 2) != 0) {
            str2 = marketOverallStatsPo.capRatio;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = marketOverallStatsPo.volumeValue;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = marketOverallStatsPo.volumeRatio;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            list = marketOverallStatsPo.dominance;
        }
        return marketOverallStatsPo.copy(str, str5, str6, str7, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.capValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.capRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.volumeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.volumeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DominanceCoinPo> component5() {
        return this.dominance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketOverallStatsPo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<DominanceCoinPo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new MarketOverallStatsPo(str, str2, str3, str4, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketOverallStatsPo)) {
            return false;
        }
        MarketOverallStatsPo marketOverallStatsPo = (MarketOverallStatsPo) obj;
        return Intrinsics.EZpvd((Object) this.capValue, (Object) marketOverallStatsPo.capValue) && Intrinsics.EZpvd((Object) this.capRatio, (Object) marketOverallStatsPo.capRatio) && Intrinsics.EZpvd((Object) this.volumeValue, (Object) marketOverallStatsPo.volumeValue) && Intrinsics.EZpvd((Object) this.volumeRatio, (Object) marketOverallStatsPo.volumeRatio) && Intrinsics.EZpvd(this.dominance, marketOverallStatsPo.dominance);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCapRatio() {
        return this.capRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCapValue() {
        return this.capValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DominanceCoinPo> getDominance() {
        return this.dominance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolumeRatio() {
        return this.volumeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolumeValue() {
        return this.volumeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.capValue.hashCode() * 31) + this.capRatio.hashCode()) * 31) + this.volumeValue.hashCode()) * 31) + this.volumeRatio.hashCode()) * 31) + this.dominance.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketOverallStatsPo(capValue=" + this.capValue + ", capRatio=" + this.capRatio + ", volumeValue=" + this.volumeValue + ", volumeRatio=" + this.volumeRatio + ", dominance=" + this.dominance + ")";
    }

    public MarketOverallStatsPo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<DominanceCoinPo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.capValue = str;
        this.capRatio = str2;
        this.volumeValue = str3;
        this.volumeRatio = str4;
        this.dominance = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0021: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:42)) : (r8v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.find_ui.features.opportunity.overall.data.model.MarketOverallStatsPo$DominanceCoinPo>):void (m)] (LINE:7) call: com.okinc.find_ui.features.opportunity.overall.data.model.MarketOverallStatsPo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ MarketOverallStatsPo(String str, String str2, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? yDY.AhwBna() : list);
    }

    public static final class DominanceCoinPo {
        public static final int $stable = 0;

        @SerializedName("coin")
        private final String coin;

        @SerializedName("coinIconUrl")
        private final String coinIconUrl;

        @SerializedName("ratio")
        private final String ratio;

        @SerializedName("ratioChange")
        private final String ratioChange;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DominanceCoinPo() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ DominanceCoinPo copy$default(DominanceCoinPo dominanceCoinPo, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dominanceCoinPo.coin;
            }
            if ((i & 2) != 0) {
                str2 = dominanceCoinPo.coinIconUrl;
            }
            if ((i & 4) != 0) {
                str3 = dominanceCoinPo.ratio;
            }
            if ((i & 8) != 0) {
                str4 = dominanceCoinPo.ratioChange;
            }
            return dominanceCoinPo.copy(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.coin;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.coinIconUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.ratio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.ratioChange;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DominanceCoinPo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new DominanceCoinPo(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DominanceCoinPo)) {
                return false;
            }
            DominanceCoinPo dominanceCoinPo = (DominanceCoinPo) obj;
            return Intrinsics.EZpvd((Object) this.coin, (Object) dominanceCoinPo.coin) && Intrinsics.EZpvd((Object) this.coinIconUrl, (Object) dominanceCoinPo.coinIconUrl) && Intrinsics.EZpvd((Object) this.ratio, (Object) dominanceCoinPo.ratio) && Intrinsics.EZpvd((Object) this.ratioChange, (Object) dominanceCoinPo.ratioChange);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCoin() {
            return this.coin;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCoinIconUrl() {
            return this.coinIconUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRatio() {
            return this.ratio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRatioChange() {
            return this.ratioChange;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.coin.hashCode() * 31) + this.coinIconUrl.hashCode()) * 31) + this.ratio.hashCode()) * 31) + this.ratioChange.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DominanceCoinPo(coin=" + this.coin + ", coinIconUrl=" + this.coinIconUrl + ", ratio=" + this.ratio + ", ratioChange=" + this.ratioChange + ")";
        }

        public DominanceCoinPo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.coin = str;
            this.coinIconUrl = str2;
            this.ratio = str3;
            this.ratioChange = str4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:49) call: com.okinc.find_ui.features.opportunity.overall.data.model.MarketOverallStatsPo.DominanceCoinPo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ DominanceCoinPo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
        }
    }
}
