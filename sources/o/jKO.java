package o;

import com.google.gson.annotations.SerializedName;
import com.okinc.business.market.features.analysis.futures.sub.overview.data.model.CumulativePnlPo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jKO {
    public static final int $stable = 8;

    @SerializedName("avgHoldTime")
    private final java.lang.String avgHoldTime;

    @SerializedName("avgPnl")
    private final java.lang.String avgPnl;

    @SerializedName("avgPnlOnLosers")
    private final java.lang.String avgPnlOnLosers;

    @SerializedName("avgPnlOnWinners")
    private final java.lang.String avgPnlOnWinners;

    @SerializedName("cumulativePnl")
    private final java.lang.String cumulativePnl;

    @SerializedName("cumulativePnlList")
    private final java.util.List<CumulativePnlPo> cumulativePnlList;

    @SerializedName("currentDayPnl")
    private final java.lang.String currentDayPnl;

    @SerializedName("loseAvgHoldTime")
    private final java.lang.String loseAvgHoldTime;

    @SerializedName("lossCount")
    private final java.lang.String lossCount;

    @SerializedName("lossPnl")
    private final java.lang.String lossPnl;

    @SerializedName("profitFactor")
    private final java.lang.String profitFactor;

    @SerializedName("riskRewardRatio")
    private final java.lang.String riskRewardRatio;

    @SerializedName("totalCount")
    private final java.lang.String totalCount;

    @SerializedName("tradingFee")
    private final java.lang.String tradingFee;

    @SerializedName("winAvgHoldTime")
    private final java.lang.String winAvgHoldTime;

    @SerializedName("winCount")
    private final java.lang.String winCount;

    @SerializedName("winPnl")
    private final java.lang.String winPnl;

    @SerializedName("winRate")
    private final java.lang.String winRate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public jKO() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.avgHoldTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.lossPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.lossCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.totalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.profitFactor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.cumulativePnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.avgPnlOnLosers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jKO KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<CumulativePnlPo> list, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11, @NotNull java.lang.String str12, @NotNull java.lang.String str13, @NotNull java.lang.String str14, @NotNull java.lang.String str15, @NotNull java.lang.String str16, @NotNull java.lang.String str17) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        return new jKO(str, str2, list, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.avgPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.avgPnlOnWinners;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.loseAvgHoldTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String ejfBZ() {
        return this.winRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jKO)) {
            return false;
        }
        jKO jko = (jKO) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.cumulativePnl, (java.lang.Object) jko.cumulativePnl) && Intrinsics.EZpvd((java.lang.Object) this.currentDayPnl, (java.lang.Object) jko.currentDayPnl) && Intrinsics.EZpvd(this.cumulativePnlList, jko.cumulativePnlList) && Intrinsics.EZpvd((java.lang.Object) this.winRate, (java.lang.Object) jko.winRate) && Intrinsics.EZpvd((java.lang.Object) this.totalCount, (java.lang.Object) jko.totalCount) && Intrinsics.EZpvd((java.lang.Object) this.profitFactor, (java.lang.Object) jko.profitFactor) && Intrinsics.EZpvd((java.lang.Object) this.avgPnl, (java.lang.Object) jko.avgPnl) && Intrinsics.EZpvd((java.lang.Object) this.riskRewardRatio, (java.lang.Object) jko.riskRewardRatio) && Intrinsics.EZpvd((java.lang.Object) this.avgHoldTime, (java.lang.Object) jko.avgHoldTime) && Intrinsics.EZpvd((java.lang.Object) this.winPnl, (java.lang.Object) jko.winPnl) && Intrinsics.EZpvd((java.lang.Object) this.lossPnl, (java.lang.Object) jko.lossPnl) && Intrinsics.EZpvd((java.lang.Object) this.winAvgHoldTime, (java.lang.Object) jko.winAvgHoldTime) && Intrinsics.EZpvd((java.lang.Object) this.loseAvgHoldTime, (java.lang.Object) jko.loseAvgHoldTime) && Intrinsics.EZpvd((java.lang.Object) this.winCount, (java.lang.Object) jko.winCount) && Intrinsics.EZpvd((java.lang.Object) this.lossCount, (java.lang.Object) jko.lossCount) && Intrinsics.EZpvd((java.lang.Object) this.avgPnlOnWinners, (java.lang.Object) jko.avgPnlOnWinners) && Intrinsics.EZpvd((java.lang.Object) this.avgPnlOnLosers, (java.lang.Object) jko.avgPnlOnLosers) && Intrinsics.EZpvd((java.lang.Object) this.tradingFee, (java.lang.Object) jko.tradingFee);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fIwbmz() {
        return this.winCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fJNWhG() {
        return this.winPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.winAvgHoldTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.currentDayPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.cumulativePnl.hashCode() * 31) + this.currentDayPnl.hashCode()) * 31) + this.cumulativePnlList.hashCode()) * 31) + this.winRate.hashCode()) * 31) + this.totalCount.hashCode()) * 31) + this.profitFactor.hashCode()) * 31) + this.avgPnl.hashCode()) * 31) + this.riskRewardRatio.hashCode()) * 31) + this.avgHoldTime.hashCode()) * 31) + this.winPnl.hashCode()) * 31) + this.lossPnl.hashCode()) * 31) + this.winAvgHoldTime.hashCode()) * 31) + this.loseAvgHoldTime.hashCode()) * 31) + this.winCount.hashCode()) * 31) + this.lossCount.hashCode()) * 31) + this.avgPnlOnWinners.hashCode()) * 31) + this.avgPnlOnLosers.hashCode()) * 31) + this.tradingFee.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return this.riskRewardRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OverviewPo(cumulativePnl=" + this.cumulativePnl + ", currentDayPnl=" + this.currentDayPnl + ", cumulativePnlList=" + this.cumulativePnlList + ", winRate=" + this.winRate + ", totalCount=" + this.totalCount + ", profitFactor=" + this.profitFactor + ", avgPnl=" + this.avgPnl + ", riskRewardRatio=" + this.riskRewardRatio + ", avgHoldTime=" + this.avgHoldTime + ", winPnl=" + this.winPnl + ", lossPnl=" + this.lossPnl + ", winAvgHoldTime=" + this.winAvgHoldTime + ", loseAvgHoldTime=" + this.loseAvgHoldTime + ", winCount=" + this.winCount + ", lossCount=" + this.lossCount + ", avgPnlOnWinners=" + this.avgPnlOnWinners + ", avgPnlOnLosers=" + this.avgPnlOnLosers + ", tradingFee=" + this.tradingFee + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<CumulativePnlPo> valueOf() {
        return this.cumulativePnlList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String values() {
        return this.tradingFee;
    }

    public jKO(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<CumulativePnlPo> list, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11, @NotNull java.lang.String str12, @NotNull java.lang.String str13, @NotNull java.lang.String str14, @NotNull java.lang.String str15, @NotNull java.lang.String str16, @NotNull java.lang.String str17) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        this.cumulativePnl = str;
        this.currentDayPnl = str2;
        this.cumulativePnlList = list;
        this.winRate = str3;
        this.totalCount = str4;
        this.profitFactor = str5;
        this.avgPnl = str6;
        this.riskRewardRatio = str7;
        this.avgHoldTime = str8;
        this.winPnl = str9;
        this.lossPnl = str10;
        this.winAvgHoldTime = str11;
        this.loseAvgHoldTime = str12;
        this.winCount = str13;
        this.lossCount = str14;
        this.avgPnlOnWinners = str15;
        this.avgPnlOnLosers = str16;
        this.tradingFee = str17;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ca: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r38v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r38v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0014: ARITH (r38v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:18)) : (r22v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r38v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r38v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r38v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r38v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r38v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r38v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r38v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0057: ARITH (r38v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005f: ARITH (r38v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0067: ARITH (r38v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006f: ARITH (r38v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0079: ARITH (r38v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0085: ARITH (r38v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0090: ARITH (r38v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009b: ARITH (r38v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.features.analysis.futures.sub.overview.data.model.CumulativePnlPo>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:6) call: o.jKO.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ jKO(java.lang.String str, java.lang.String str2, java.util.List list, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.String str16, java.lang.String str17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? yDY.AhwBna() : list, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? "" : str13, (i & 16384) != 0 ? "" : str14, (i & 32768) != 0 ? "" : str15, (i & 65536) != 0 ? "" : str16, (i & 131072) != 0 ? "" : str17);
    }
}
