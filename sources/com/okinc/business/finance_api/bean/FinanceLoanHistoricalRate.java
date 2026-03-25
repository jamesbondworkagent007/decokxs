package com.okinc.business.finance_api.bean;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class FinanceLoanHistoricalRate implements Parcelable {
    private LastRates lastOneDayRates;
    private LastRates lastOneMonthRates;
    private LastRates lastOneWeekRates;
    private LastRates lastOneYearRates;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FinanceLoanHistoricalRate> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<FinanceLoanHistoricalRate> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinanceLoanHistoricalRate createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FinanceLoanHistoricalRate(parcel.readInt() == 0 ? null : LastRates.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LastRates.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LastRates.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LastRates.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinanceLoanHistoricalRate[] newArray(int i) {
            return new FinanceLoanHistoricalRate[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FinanceLoanHistoricalRate() {
        this((LastRates) null, (LastRates) null, (LastRates) null, (LastRates) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FinanceLoanHistoricalRate copy$default(FinanceLoanHistoricalRate financeLoanHistoricalRate, LastRates lastRates, LastRates lastRates2, LastRates lastRates3, LastRates lastRates4, int i, Object obj) {
        if ((i & 1) != 0) {
            lastRates = financeLoanHistoricalRate.lastOneDayRates;
        }
        if ((i & 2) != 0) {
            lastRates2 = financeLoanHistoricalRate.lastOneMonthRates;
        }
        if ((i & 4) != 0) {
            lastRates3 = financeLoanHistoricalRate.lastOneWeekRates;
        }
        if ((i & 8) != 0) {
            lastRates4 = financeLoanHistoricalRate.lastOneYearRates;
        }
        return financeLoanHistoricalRate.copy(lastRates, lastRates2, lastRates3, lastRates4);
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
    public final FinanceLoanHistoricalRate copy(LastRates lastRates, LastRates lastRates2, LastRates lastRates3, LastRates lastRates4) {
        return new FinanceLoanHistoricalRate(lastRates, lastRates2, lastRates3, lastRates4);
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
        if (!(obj instanceof FinanceLoanHistoricalRate)) {
            return false;
        }
        FinanceLoanHistoricalRate financeLoanHistoricalRate = (FinanceLoanHistoricalRate) obj;
        return Intrinsics.EZpvd(this.lastOneDayRates, financeLoanHistoricalRate.lastOneDayRates) && Intrinsics.EZpvd(this.lastOneMonthRates, financeLoanHistoricalRate.lastOneMonthRates) && Intrinsics.EZpvd(this.lastOneWeekRates, financeLoanHistoricalRate.lastOneWeekRates) && Intrinsics.EZpvd(this.lastOneYearRates, financeLoanHistoricalRate.lastOneYearRates);
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
    public int hashCode() {
        LastRates lastRates = this.lastOneDayRates;
        int iHashCode = lastRates == null ? 0 : lastRates.hashCode();
        LastRates lastRates2 = this.lastOneMonthRates;
        int iHashCode2 = lastRates2 == null ? 0 : lastRates2.hashCode();
        LastRates lastRates3 = this.lastOneWeekRates;
        int iHashCode3 = lastRates3 == null ? 0 : lastRates3.hashCode();
        LastRates lastRates4 = this.lastOneYearRates;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (lastRates4 != null ? lastRates4.hashCode() : 0);
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
    public String toString() {
        return "FinanceLoanHistoricalRate(lastOneDayRates=" + this.lastOneDayRates + ", lastOneMonthRates=" + this.lastOneMonthRates + ", lastOneWeekRates=" + this.lastOneWeekRates + ", lastOneYearRates=" + this.lastOneYearRates + ")";
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
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.finance_api.bean.FinanceLoanHistoricalRate.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FinanceLoanHistoricalRate> serializer() {
            return FinanceLoanHistoricalRate$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FinanceLoanHistoricalRate(int i, LastRates lastRates, LastRates lastRates2, LastRates lastRates3, LastRates lastRates4, SerializationConstructorMarker serializationConstructorMarker) {
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
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [10=5] */
    public static final /* synthetic */ void write$Self$OKFinance_finance_api(FinanceLoanHistoricalRate financeLoanHistoricalRate, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(financeLoanHistoricalRate.lastOneDayRates, new LastRates((AverageRate) null, (List) null, 3, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LastRates$$serializer.INSTANCE, financeLoanHistoricalRate.lastOneDayRates);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(financeLoanHistoricalRate.lastOneMonthRates, new LastRates((AverageRate) null, (List) null, 3, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LastRates$$serializer.INSTANCE, financeLoanHistoricalRate.lastOneMonthRates);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(financeLoanHistoricalRate.lastOneWeekRates, new LastRates((AverageRate) null, (List) null, 3, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LastRates$$serializer.INSTANCE, financeLoanHistoricalRate.lastOneWeekRates);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(financeLoanHistoricalRate.lastOneYearRates, new LastRates((AverageRate) null, (List) null, 3, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LastRates$$serializer.INSTANCE, financeLoanHistoricalRate.lastOneYearRates);
    }

    public FinanceLoanHistoricalRate(LastRates lastRates, LastRates lastRates2, LastRates lastRates3, LastRates lastRates4) {
        this.lastOneDayRates = lastRates;
        this.lastOneMonthRates = lastRates2;
        this.lastOneWeekRates = lastRates3;
        this.lastOneYearRates = lastRates4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
  (wrap:com.okinc.business.finance_api.bean.LastRates:?: TERNARY null = ((wrap:int:0x0000: ARITH (r7v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.finance_api.bean.LastRates:0x0008: CONSTRUCTOR 
  (wrap:com.okinc.business.finance_api.bean.AverageRate:?: CAST (com.okinc.business.finance_api.bean.AverageRate) (null com.okinc.business.finance_api.bean.AverageRate))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (3 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(com.okinc.business.finance_api.bean.AverageRate, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:14) call: com.okinc.business.finance_api.bean.LastRates.<init>(com.okinc.business.finance_api.bean.AverageRate, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r3v0 com.okinc.business.finance_api.bean.LastRates))
  (wrap:com.okinc.business.finance_api.bean.LastRates:?: TERNARY null = ((wrap:int:0x000b: ARITH (r7v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.finance_api.bean.LastRates:0x0011: CONSTRUCTOR 
  (wrap:com.okinc.business.finance_api.bean.AverageRate:?: CAST (com.okinc.business.finance_api.bean.AverageRate) (null com.okinc.business.finance_api.bean.AverageRate))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (3 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(com.okinc.business.finance_api.bean.AverageRate, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:15) call: com.okinc.business.finance_api.bean.LastRates.<init>(com.okinc.business.finance_api.bean.AverageRate, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r4v0 com.okinc.business.finance_api.bean.LastRates))
  (wrap:com.okinc.business.finance_api.bean.LastRates:?: TERNARY null = ((wrap:int:0x0014: ARITH (r7v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.finance_api.bean.LastRates:0x001a: CONSTRUCTOR 
  (wrap:com.okinc.business.finance_api.bean.AverageRate:?: CAST (com.okinc.business.finance_api.bean.AverageRate) (null com.okinc.business.finance_api.bean.AverageRate))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (3 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(com.okinc.business.finance_api.bean.AverageRate, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:16) call: com.okinc.business.finance_api.bean.LastRates.<init>(com.okinc.business.finance_api.bean.AverageRate, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r5v0 com.okinc.business.finance_api.bean.LastRates))
  (wrap:com.okinc.business.finance_api.bean.LastRates:?: TERNARY null = ((wrap:int:0x001d: ARITH (r7v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.finance_api.bean.LastRates:0x0023: CONSTRUCTOR 
  (wrap:com.okinc.business.finance_api.bean.AverageRate:?: CAST (com.okinc.business.finance_api.bean.AverageRate) (null com.okinc.business.finance_api.bean.AverageRate))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (3 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(com.okinc.business.finance_api.bean.AverageRate, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:17) call: com.okinc.business.finance_api.bean.LastRates.<init>(com.okinc.business.finance_api.bean.AverageRate, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r6v0 com.okinc.business.finance_api.bean.LastRates))
 A[MD:(com.okinc.business.finance_api.bean.LastRates, com.okinc.business.finance_api.bean.LastRates, com.okinc.business.finance_api.bean.LastRates, com.okinc.business.finance_api.bean.LastRates):void (m)] (LINE:13) call: com.okinc.business.finance_api.bean.FinanceLoanHistoricalRate.<init>(com.okinc.business.finance_api.bean.LastRates, com.okinc.business.finance_api.bean.LastRates, com.okinc.business.finance_api.bean.LastRates, com.okinc.business.finance_api.bean.LastRates):void type: THIS */
    public /* synthetic */ FinanceLoanHistoricalRate(LastRates lastRates, LastRates lastRates2, LastRates lastRates3, LastRates lastRates4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LastRates((AverageRate) null, (List) null, 3, (DefaultConstructorMarker) null) : lastRates, (i & 2) != 0 ? new LastRates((AverageRate) null, (List) null, 3, (DefaultConstructorMarker) null) : lastRates2, (i & 4) != 0 ? new LastRates((AverageRate) null, (List) null, 3, (DefaultConstructorMarker) null) : lastRates3, (i & 8) != 0 ? new LastRates((AverageRate) null, (List) null, 3, (DefaultConstructorMarker) null) : lastRates4);
    }
}
