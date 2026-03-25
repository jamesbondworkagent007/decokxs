package com.okinc.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class StrategyType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ StrategyType[] $VALUES;
    public static final StrategyType ALL;
    public static final StrategyType ARBITRAGE;
    public static final StrategyType BERG_TACTICS;
    public static final StrategyType CONTRACT_DCA;
    public static final StrategyType CONVERT;
    public static final Parcelable.Creator<StrategyType> CREATOR;
    public static final Activity Companion;
    public static final StrategyType DCD_BOT;
    public static final StrategyType GRID;
    public static final StrategyType INFINITE_GRID;
    public static final StrategyType LLMBot;
    public static final StrategyType MOON_GRID;
    public static final StrategyType PRICE_LOCKER_BUY;
    public static final StrategyType PRICE_LOCKER_SELL;
    public static final StrategyType RECURRING;
    public static final StrategyType SIGNAL_BOT;
    public static final StrategyType SMART_ARBITRAGE;
    public static final StrategyType SMART_ICEBERG;
    public static final StrategyType SMART_PORTFOLIO;
    public static final StrategyType SPOT_DCA;
    public static final StrategyType TIME_WEIGHTING;
    private final String reportName;
    public static final StrategyType LIMIT = new StrategyType("LIMIT", 0, "limit order");
    public static final StrategyType ADVANCED_LIMIT = new StrategyType("ADVANCED_LIMIT", 1, "advanced limit order");
    public static final StrategyType MARKET = new StrategyType("MARKET", 2, "market order");
    public static final StrategyType STOP = new StrategyType("STOP", 3, "tpsl");
    public static final StrategyType MP = new StrategyType("MP", 4, "trailing stop");
    public static final StrategyType TRIGGER = new StrategyType("TRIGGER", 5, "trigger");
    public static final StrategyType SEGMENT = new StrategyType("SEGMENT", 6, "scaled order");
    public static final StrategyType CHASE = new StrategyType("CHASE", 7, "chase order");
    public static final StrategyType ICEBERG = new StrategyType("ICEBERG", 8, "iceberg");
    public static final StrategyType TWAP = new StrategyType("TWAP", 10, "twap");
    public static final StrategyType CONTRACT_GRID = new StrategyType("CONTRACT_GRID", 12, null, 1, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ StrategyType[] $values() {
        return new StrategyType[]{LIMIT, ADVANCED_LIMIT, MARKET, STOP, MP, TRIGGER, SEGMENT, CHASE, ICEBERG, SMART_ICEBERG, TWAP, GRID, CONTRACT_GRID, RECURRING, ARBITRAGE, SMART_PORTFOLIO, MOON_GRID, PRICE_LOCKER_BUY, PRICE_LOCKER_SELL, SPOT_DCA, CONTRACT_DCA, INFINITE_GRID, SIGNAL_BOT, BERG_TACTICS, TIME_WEIGHTING, ALL, SMART_ARBITRAGE, CONVERT, DCD_BOT, LLMBot};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<StrategyType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReportName() {
        return this.reportName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private StrategyType(String str, int i, String str2) {
        this.reportName = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, int, java.lang.String):void (m)] (LINE:10) call: com.okinc.biz.StrategyType.<init>(java.lang.String, int, java.lang.String):void type: THIS */
    public /* synthetic */ StrategyType(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 1) != 0 ? null : str2);
    }

    static {
        String str = null;
        int i = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        SMART_ICEBERG = new StrategyType("SMART_ICEBERG", 9, str, i, defaultConstructorMarker);
        GRID = new StrategyType("GRID", 11, str, i, defaultConstructorMarker);
        String str2 = null;
        int i2 = 1;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        RECURRING = new StrategyType("RECURRING", 13, str2, i2, defaultConstructorMarker2);
        String str3 = null;
        int i3 = 1;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        ARBITRAGE = new StrategyType("ARBITRAGE", 14, str3, i3, defaultConstructorMarker3);
        SMART_PORTFOLIO = new StrategyType("SMART_PORTFOLIO", 15, str2, i2, defaultConstructorMarker2);
        MOON_GRID = new StrategyType("MOON_GRID", 16, str3, i3, defaultConstructorMarker3);
        PRICE_LOCKER_BUY = new StrategyType("PRICE_LOCKER_BUY", 17, str2, i2, defaultConstructorMarker2);
        PRICE_LOCKER_SELL = new StrategyType("PRICE_LOCKER_SELL", 18, str3, i3, defaultConstructorMarker3);
        SPOT_DCA = new StrategyType("SPOT_DCA", 19, str2, i2, defaultConstructorMarker2);
        CONTRACT_DCA = new StrategyType("CONTRACT_DCA", 20, str3, i3, defaultConstructorMarker3);
        INFINITE_GRID = new StrategyType("INFINITE_GRID", 21, str2, i2, defaultConstructorMarker2);
        SIGNAL_BOT = new StrategyType("SIGNAL_BOT", 22, str3, i3, defaultConstructorMarker3);
        BERG_TACTICS = new StrategyType("BERG_TACTICS", 23, str2, i2, defaultConstructorMarker2);
        TIME_WEIGHTING = new StrategyType("TIME_WEIGHTING", 24, str3, i3, defaultConstructorMarker3);
        ALL = new StrategyType("ALL", 25, str2, i2, defaultConstructorMarker2);
        SMART_ARBITRAGE = new StrategyType("SMART_ARBITRAGE", 26, str3, i3, defaultConstructorMarker3);
        CONVERT = new StrategyType("CONVERT", 27, str2, i2, defaultConstructorMarker2);
        DCD_BOT = new StrategyType("DCD_BOT", 28, str3, i3, defaultConstructorMarker3);
        LLMBot = new StrategyType("LLMBot", 29, str2, i2, defaultConstructorMarker2);
        StrategyType[] strategyTypeArr$values = $values();
        $VALUES = strategyTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(strategyTypeArr$values);
        Companion = new Activity(null);
        CREATOR = new Parcelable.Creator<StrategyType>() { // from class: com.okinc.biz.StrategyType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StrategyType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return StrategyType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StrategyType[] newArray(int i4) {
                return new StrategyType[i4];
            }
        };
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.biz.StrategyType.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static StrategyType valueOf(String str) {
        return (StrategyType) Enum.valueOf(StrategyType.class, str);
    }

    public static StrategyType[] values() {
        return (StrategyType[]) $VALUES.clone();
    }
}
