package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotUserSummaryData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BotUserSummaryData> CREATOR = new Creator();
    private final String assetSymbol;
    private final String cycle;
    private final int cycleColor;
    private final boolean isNeedTransfer;
    private final String multiplierForBotAssets;
    private final String ongoingBots;
    private final StrategyUserSummaryData origin;
    private final int precision;
    private final String profitRatio;
    private final int profitRatioColor;
    private final String title;
    private final String totalAsset;
    private final String totalProfit;
    private final int totalProfitColor;

    public static final class Creator implements Parcelable.Creator<BotUserSummaryData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotUserSummaryData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BotUserSummaryData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), StrategyUserSummaryData.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotUserSummaryData[] newArray(int i) {
            return new BotUserSummaryData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotUserSummaryData() {
        this(null, null, null, null, 0, null, 0, null, 0, null, null, false, 0, null, 16383, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyUserSummaryData component10() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.multiplierForBotAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.isNeedTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.precision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.ongoingBots;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.totalAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.assetSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.totalProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.totalProfitColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.profitRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.profitRatioColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.cycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.cycleColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotUserSummaryData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull String str5, int i2, @NotNull String str6, int i3, @NotNull StrategyUserSummaryData strategyUserSummaryData, @NotNull String str7, boolean z, int i4, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(strategyUserSummaryData, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new BotUserSummaryData(str, str2, str3, str4, i, str5, i2, str6, i3, strategyUserSummaryData, str7, z, i4, str8);
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
        if (!(obj instanceof BotUserSummaryData)) {
            return false;
        }
        BotUserSummaryData botUserSummaryData = (BotUserSummaryData) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) botUserSummaryData.title) && Intrinsics.EZpvd((Object) this.totalAsset, (Object) botUserSummaryData.totalAsset) && Intrinsics.EZpvd((Object) this.assetSymbol, (Object) botUserSummaryData.assetSymbol) && Intrinsics.EZpvd((Object) this.totalProfit, (Object) botUserSummaryData.totalProfit) && this.totalProfitColor == botUserSummaryData.totalProfitColor && Intrinsics.EZpvd((Object) this.profitRatio, (Object) botUserSummaryData.profitRatio) && this.profitRatioColor == botUserSummaryData.profitRatioColor && Intrinsics.EZpvd((Object) this.cycle, (Object) botUserSummaryData.cycle) && this.cycleColor == botUserSummaryData.cycleColor && Intrinsics.EZpvd(this.origin, botUserSummaryData.origin) && Intrinsics.EZpvd((Object) this.multiplierForBotAssets, (Object) botUserSummaryData.multiplierForBotAssets) && this.isNeedTransfer == botUserSummaryData.isNeedTransfer && this.precision == botUserSummaryData.precision && Intrinsics.EZpvd((Object) this.ongoingBots, (Object) botUserSummaryData.ongoingBots);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAssetSymbol() {
        return this.assetSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCycle() {
        return this.cycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCycleColor() {
        return this.cycleColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMultiplierForBotAssets() {
        return this.multiplierForBotAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOngoingBots() {
        return this.ongoingBots;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyUserSummaryData getOrigin() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPrecision() {
        return this.precision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitRatio() {
        return this.profitRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getProfitRatioColor() {
        return this.profitRatioColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalAsset() {
        return this.totalAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalProfit() {
        return this.totalProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTotalProfitColor() {
        return this.totalProfitColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((this.title.hashCode() * 31) + this.totalAsset.hashCode()) * 31) + this.assetSymbol.hashCode()) * 31) + this.totalProfit.hashCode()) * 31) + Integer.hashCode(this.totalProfitColor)) * 31) + this.profitRatio.hashCode()) * 31) + Integer.hashCode(this.profitRatioColor)) * 31) + this.cycle.hashCode()) * 31) + Integer.hashCode(this.cycleColor)) * 31) + this.origin.hashCode()) * 31) + this.multiplierForBotAssets.hashCode()) * 31) + Boolean.hashCode(this.isNeedTransfer)) * 31) + Integer.hashCode(this.precision)) * 31) + this.ongoingBots.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isNeedTransfer() {
        return this.isNeedTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotUserSummaryData(title=" + this.title + ", totalAsset=" + this.totalAsset + ", assetSymbol=" + this.assetSymbol + ", totalProfit=" + this.totalProfit + ", totalProfitColor=" + this.totalProfitColor + ", profitRatio=" + this.profitRatio + ", profitRatioColor=" + this.profitRatioColor + ", cycle=" + this.cycle + ", cycleColor=" + this.cycleColor + ", origin=" + this.origin + ", multiplierForBotAssets=" + this.multiplierForBotAssets + ", isNeedTransfer=" + this.isNeedTransfer + ", precision=" + this.precision + ", ongoingBots=" + this.ongoingBots + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.totalAsset);
        parcel.writeString(this.assetSymbol);
        parcel.writeString(this.totalProfit);
        parcel.writeInt(this.totalProfitColor);
        parcel.writeString(this.profitRatio);
        parcel.writeInt(this.profitRatioColor);
        parcel.writeString(this.cycle);
        parcel.writeInt(this.cycleColor);
        this.origin.writeToParcel(parcel, i);
        parcel.writeString(this.multiplierForBotAssets);
        parcel.writeInt(this.isNeedTransfer ? 1 : 0);
        parcel.writeInt(this.precision);
        parcel.writeString(this.ongoingBots);
    }

    public BotUserSummaryData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull String str5, int i2, @NotNull String str6, int i3, @NotNull StrategyUserSummaryData strategyUserSummaryData, @NotNull String str7, boolean z, int i4, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(strategyUserSummaryData, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.title = str;
        this.totalAsset = str2;
        this.assetSymbol = str3;
        this.totalProfit = str4;
        this.totalProfitColor = i;
        this.profitRatio = str5;
        this.profitRatioColor = i2;
        this.cycle = str6;
        this.cycleColor = i3;
        this.origin = strategyUserSummaryData;
        this.multiplierForBotAssets = str7;
        this.isNeedTransfer = z;
        this.precision = i4;
        this.ongoingBots = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b1: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0024: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r24v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0035: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r26v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r34v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0044: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r28v0 int))
  (wrap:com.okinc.unify_trade.biz.StrategyUserSummaryData:?: TERNARY null = ((wrap:int:0x004c: ARITH (r34v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006c: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (31 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:1129) call: com.okinc.unify_trade.biz.StrategyUserSummaryData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r29v0 com.okinc.unify_trade.biz.StrategyUserSummaryData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("1") : (r30v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x007b: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r31v0 boolean) : false)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0082: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r32v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008a: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("0") : (r33v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, int, com.okinc.unify_trade.biz.StrategyUserSummaryData, java.lang.String, boolean, int, java.lang.String):void (m)] (LINE:1119) call: com.okinc.unify_trade.biz.BotUserSummaryData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, int, com.okinc.unify_trade.biz.StrategyUserSummaryData, java.lang.String, boolean, int, java.lang.String):void type: THIS */
    public /* synthetic */ BotUserSummaryData(String str, String str2, String str3, String str4, int i, String str5, int i2, String str6, int i3, StrategyUserSummaryData strategyUserSummaryData, String str7, boolean z, int i4, String str8, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) != 0 ? "" : str3, (i5 & 8) != 0 ? "" : str4, (i5 & 16) != 0 ? 0 : i, (i5 & 32) != 0 ? "" : str5, (i5 & 64) != 0 ? 0 : i2, (i5 & 128) == 0 ? str6 : "", (i5 & 256) != 0 ? -1 : i3, (i5 & 512) != 0 ? new StrategyUserSummaryData((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : strategyUserSummaryData, (i5 & 1024) != 0 ? "1" : str7, (i5 & 2048) == 0 ? z : false, (i5 & 4096) != 0 ? 2 : i4, (i5 & 8192) != 0 ? "0" : str8);
    }
}
