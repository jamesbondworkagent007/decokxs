package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class LoanHistoricalRate implements Parcelable {
    private LastRates lastOneDayRates;
    private LastRates lastOneMonthRates;
    private LastRates lastOneWeekRates;
    private LastRates lastOneYearRates;
    private String rateType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<LoanHistoricalRate> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<LoanHistoricalRate> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoanHistoricalRate createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LoanHistoricalRate(parcel.readInt() == 0 ? null : LastRates.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LastRates.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LastRates.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LastRates.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoanHistoricalRate[] newArray(int i) {
            return new LoanHistoricalRate[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LoanHistoricalRate() {
        this((LastRates) null, (LastRates) null, (LastRates) null, (LastRates) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LoanHistoricalRate copy$default(LoanHistoricalRate loanHistoricalRate, LastRates lastRates, LastRates lastRates2, LastRates lastRates3, LastRates lastRates4, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            lastRates = loanHistoricalRate.lastOneDayRates;
        }
        if ((i & 2) != 0) {
            lastRates2 = loanHistoricalRate.lastOneMonthRates;
        }
        LastRates lastRates5 = lastRates2;
        if ((i & 4) != 0) {
            lastRates3 = loanHistoricalRate.lastOneWeekRates;
        }
        LastRates lastRates6 = lastRates3;
        if ((i & 8) != 0) {
            lastRates4 = loanHistoricalRate.lastOneYearRates;
        }
        LastRates lastRates7 = lastRates4;
        if ((i & 16) != 0) {
            str = loanHistoricalRate.rateType;
        }
        return loanHistoricalRate.copy(lastRates, lastRates5, lastRates6, lastRates7, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LastRates component1() {
        return this.lastOneDayRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LastRates component2() {
        return this.lastOneMonthRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LastRates component3() {
        return this.lastOneWeekRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LastRates component4() {
        return this.lastOneYearRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LoanHistoricalRate copy(LastRates lastRates, LastRates lastRates2, LastRates lastRates3, LastRates lastRates4, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new LoanHistoricalRate(lastRates, lastRates2, lastRates3, lastRates4, str);
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
        if (!(obj instanceof LoanHistoricalRate)) {
            return false;
        }
        LoanHistoricalRate loanHistoricalRate = (LoanHistoricalRate) obj;
        return Intrinsics.EZpvd(this.lastOneDayRates, loanHistoricalRate.lastOneDayRates) && Intrinsics.EZpvd(this.lastOneMonthRates, loanHistoricalRate.lastOneMonthRates) && Intrinsics.EZpvd(this.lastOneWeekRates, loanHistoricalRate.lastOneWeekRates) && Intrinsics.EZpvd(this.lastOneYearRates, loanHistoricalRate.lastOneYearRates) && Intrinsics.EZpvd((Object) this.rateType, (Object) loanHistoricalRate.rateType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LastRates getLastOneDayRates() {
        return this.lastOneDayRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LastRates getLastOneMonthRates() {
        return this.lastOneMonthRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LastRates getLastOneWeekRates() {
        return this.lastOneWeekRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LastRates getLastOneYearRates() {
        return this.lastOneYearRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRateType() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        LastRates lastRates = this.lastOneDayRates;
        int iHashCode = lastRates == null ? 0 : lastRates.hashCode();
        LastRates lastRates2 = this.lastOneMonthRates;
        int iHashCode2 = lastRates2 == null ? 0 : lastRates2.hashCode();
        LastRates lastRates3 = this.lastOneWeekRates;
        int iHashCode3 = lastRates3 == null ? 0 : lastRates3.hashCode();
        LastRates lastRates4 = this.lastOneYearRates;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (lastRates4 != null ? lastRates4.hashCode() : 0)) * 31) + this.rateType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastOneDayRates(LastRates lastRates) {
        this.lastOneDayRates = lastRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastOneMonthRates(LastRates lastRates) {
        this.lastOneMonthRates = lastRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastOneWeekRates(LastRates lastRates) {
        this.lastOneWeekRates = lastRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastOneYearRates(LastRates lastRates) {
        this.lastOneYearRates = lastRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRateType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rateType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LoanHistoricalRate(lastOneDayRates=" + this.lastOneDayRates + ", lastOneMonthRates=" + this.lastOneMonthRates + ", lastOneWeekRates=" + this.lastOneWeekRates + ", lastOneYearRates=" + this.lastOneYearRates + ", rateType=" + this.rateType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        LastRates lastRates = this.lastOneDayRates;
        if (lastRates == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lastRates.writeToParcel(parcel, i);
        }
        LastRates lastRates2 = this.lastOneMonthRates;
        if (lastRates2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lastRates2.writeToParcel(parcel, i);
        }
        LastRates lastRates3 = this.lastOneWeekRates;
        if (lastRates3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lastRates3.writeToParcel(parcel, i);
        }
        LastRates lastRates4 = this.lastOneYearRates;
        if (lastRates4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lastRates4.writeToParcel(parcel, i);
        }
        parcel.writeString(this.rateType);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.LoanHistoricalRate.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LoanHistoricalRate> serializer() {
            return LoanHistoricalRate$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LoanHistoricalRate(int i, LastRates lastRates, LastRates lastRates2, LastRates lastRates3, LastRates lastRates4, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.lastOneDayRates = (i & 1) == 0 ? new LastRates((AverageRate) null, (List) null, 3, (DefaultConstructorMarker) null) : lastRates;
        if ((i & 2) == 0) {
            this.lastOneMonthRates = new LastRates((AverageRate) null, (List) null, 3, (DefaultConstructorMarker) null);
        } else {
            this.lastOneMonthRates = lastRates2;
        }
        if ((i & 4) == 0) {
            this.lastOneWeekRates = new LastRates((AverageRate) null, (List) null, 3, (DefaultConstructorMarker) null);
        } else {
            this.lastOneWeekRates = lastRates3;
        }
        if ((i & 8) == 0) {
            this.lastOneYearRates = new LastRates((AverageRate) null, (List) null, 3, (DefaultConstructorMarker) null);
        } else {
            this.lastOneYearRates = lastRates4;
        }
        if ((i & 16) == 0) {
            this.rateType = "";
        } else {
            this.rateType = str;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [8=5] */
    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(LoanHistoricalRate loanHistoricalRate, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(loanHistoricalRate.lastOneDayRates, new LastRates((AverageRate) null, (List) null, 3, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LastRates$$serializer.INSTANCE, loanHistoricalRate.lastOneDayRates);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(loanHistoricalRate.lastOneMonthRates, new LastRates((AverageRate) null, (List) null, 3, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LastRates$$serializer.INSTANCE, loanHistoricalRate.lastOneMonthRates);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(loanHistoricalRate.lastOneWeekRates, new LastRates((AverageRate) null, (List) null, 3, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LastRates$$serializer.INSTANCE, loanHistoricalRate.lastOneWeekRates);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(loanHistoricalRate.lastOneYearRates, new LastRates((AverageRate) null, (List) null, 3, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LastRates$$serializer.INSTANCE, loanHistoricalRate.lastOneYearRates);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) loanHistoricalRate.rateType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, loanHistoricalRate.rateType);
    }

    public LoanHistoricalRate(LastRates lastRates, LastRates lastRates2, LastRates lastRates3, LastRates lastRates4, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lastOneDayRates = lastRates;
        this.lastOneMonthRates = lastRates2;
        this.lastOneWeekRates = lastRates3;
        this.lastOneYearRates = lastRates4;
        this.rateType = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0036: CONSTRUCTOR 
  (wrap:com.okinc.unify_trade.biz.LastRates:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.unify_trade.biz.LastRates:0x0008: CONSTRUCTOR 
  (wrap:com.okinc.unify_trade.biz.AverageRate:?: CAST (com.okinc.unify_trade.biz.AverageRate) (null com.okinc.unify_trade.biz.AverageRate))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (3 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(com.okinc.unify_trade.biz.AverageRate, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:12) call: com.okinc.unify_trade.biz.LastRates.<init>(com.okinc.unify_trade.biz.AverageRate, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r4v0 com.okinc.unify_trade.biz.LastRates))
  (wrap:com.okinc.unify_trade.biz.LastRates:0x0014: TERNARY null = ((wrap:int:0x000b: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.unify_trade.biz.LastRates:0x0011: CONSTRUCTOR 
  (wrap:com.okinc.unify_trade.biz.AverageRate:?: CAST (com.okinc.unify_trade.biz.AverageRate) (null com.okinc.unify_trade.biz.AverageRate))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (3 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(com.okinc.unify_trade.biz.AverageRate, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:13) call: com.okinc.unify_trade.biz.LastRates.<init>(com.okinc.unify_trade.biz.AverageRate, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r5v0 com.okinc.unify_trade.biz.LastRates))
  (wrap:com.okinc.unify_trade.biz.LastRates:0x001e: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.unify_trade.biz.LastRates:0x001b: CONSTRUCTOR 
  (wrap:com.okinc.unify_trade.biz.AverageRate:?: CAST (com.okinc.unify_trade.biz.AverageRate) (null com.okinc.unify_trade.biz.AverageRate))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (3 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(com.okinc.unify_trade.biz.AverageRate, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:14) call: com.okinc.unify_trade.biz.LastRates.<init>(com.okinc.unify_trade.biz.AverageRate, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r6v0 com.okinc.unify_trade.biz.LastRates))
  (wrap:com.okinc.unify_trade.biz.LastRates:0x0028: TERNARY null = ((wrap:int:0x001f: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.unify_trade.biz.LastRates:0x0025: CONSTRUCTOR 
  (wrap:com.okinc.unify_trade.biz.AverageRate:?: CAST (com.okinc.unify_trade.biz.AverageRate) (null com.okinc.unify_trade.biz.AverageRate))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (3 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(com.okinc.unify_trade.biz.AverageRate, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:15) call: com.okinc.unify_trade.biz.LastRates.<init>(com.okinc.unify_trade.biz.AverageRate, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r7v0 com.okinc.unify_trade.biz.LastRates))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
 A[MD:(com.okinc.unify_trade.biz.LastRates, com.okinc.unify_trade.biz.LastRates, com.okinc.unify_trade.biz.LastRates, com.okinc.unify_trade.biz.LastRates, java.lang.String):void (m)] (LINE:11) call: com.okinc.unify_trade.biz.LoanHistoricalRate.<init>(com.okinc.unify_trade.biz.LastRates, com.okinc.unify_trade.biz.LastRates, com.okinc.unify_trade.biz.LastRates, com.okinc.unify_trade.biz.LastRates, java.lang.String):void type: THIS */
    public /* synthetic */ LoanHistoricalRate(LastRates lastRates, LastRates lastRates2, LastRates lastRates3, LastRates lastRates4, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LastRates((AverageRate) null, (List) null, 3, (DefaultConstructorMarker) null) : lastRates, (i & 2) != 0 ? new LastRates((AverageRate) null, (List) null, 3, (DefaultConstructorMarker) null) : lastRates2, (i & 4) != 0 ? new LastRates((AverageRate) null, (List) null, 3, (DefaultConstructorMarker) null) : lastRates3, (i & 8) != 0 ? new LastRates((AverageRate) null, (List) null, 3, (DefaultConstructorMarker) null) : lastRates4, (i & 16) != 0 ? "" : str);
    }
}
