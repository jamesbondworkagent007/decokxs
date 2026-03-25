package com.okinc.tradingbot.impl.dto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class InterestInfoResponse implements Parcelable {
    public static final int $stable = 0;
    public final String debtCcy;
    public final String interestAmt;
    public final String interestDebt;
    public final String interestRateApyAvg;
    public final long nextChargingTime;
    public final String nonInterestDebt;
    public final String totalInterestAmt;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InterestInfoResponse> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InterestInfoResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InterestInfoResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InterestInfoResponse(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InterestInfoResponse[] newArray(int i) {
            return new InterestInfoResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterestInfoResponse() {
        this(0L, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.debtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.totalInterestAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.interestAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.interestDebt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterestInfoResponse OLrzqt(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new InterestInfoResponse(j, str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.interestRateApyAvg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.nextChargingTime;
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
        if (!(obj instanceof InterestInfoResponse)) {
            return false;
        }
        InterestInfoResponse interestInfoResponse = (InterestInfoResponse) obj;
        return this.nextChargingTime == interestInfoResponse.nextChargingTime && Intrinsics.EZpvd((Object) this.interestDebt, (Object) interestInfoResponse.interestDebt) && Intrinsics.EZpvd((Object) this.nonInterestDebt, (Object) interestInfoResponse.nonInterestDebt) && Intrinsics.EZpvd((Object) this.interestAmt, (Object) interestInfoResponse.interestAmt) && Intrinsics.EZpvd((Object) this.debtCcy, (Object) interestInfoResponse.debtCcy) && Intrinsics.EZpvd((Object) this.interestRateApyAvg, (Object) interestInfoResponse.interestRateApyAvg) && Intrinsics.EZpvd((Object) this.totalInterestAmt, (Object) interestInfoResponse.totalInterestAmt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.nonInterestDebt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((Long.hashCode(this.nextChargingTime) * 31) + this.interestDebt.hashCode()) * 31) + this.nonInterestDebt.hashCode()) * 31) + this.interestAmt.hashCode()) * 31) + this.debtCcy.hashCode()) * 31) + this.interestRateApyAvg.hashCode()) * 31) + this.totalInterestAmt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InterestInfoResponse(nextChargingTime=" + this.nextChargingTime + ", interestDebt=" + this.interestDebt + ", nonInterestDebt=" + this.nonInterestDebt + ", interestAmt=" + this.interestAmt + ", debtCcy=" + this.debtCcy + ", interestRateApyAvg=" + this.interestRateApyAvg + ", totalInterestAmt=" + this.totalInterestAmt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.nextChargingTime);
        parcel.writeString(this.interestDebt);
        parcel.writeString(this.nonInterestDebt);
        parcel.writeString(this.interestAmt);
        parcel.writeString(this.debtCcy);
        parcel.writeString(this.interestRateApyAvg);
        parcel.writeString(this.totalInterestAmt);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.dto.InterestInfoResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InterestInfoResponse> serializer() {
            return InterestInfoResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InterestInfoResponse(int i, long j, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        this.nextChargingTime = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.interestDebt = "";
        } else {
            this.interestDebt = str;
        }
        if ((i & 4) == 0) {
            this.nonInterestDebt = "";
        } else {
            this.nonInterestDebt = str2;
        }
        if ((i & 8) == 0) {
            this.interestAmt = "";
        } else {
            this.interestAmt = str3;
        }
        if ((i & 16) == 0) {
            this.debtCcy = "";
        } else {
            this.debtCcy = str4;
        }
        if ((i & 32) == 0) {
            this.interestRateApyAvg = "";
        } else {
            this.interestRateApyAvg = str5;
        }
        if ((i & 64) == 0) {
            this.totalInterestAmt = "";
        } else {
            this.totalInterestAmt = str6;
        }
    }

    public static final /* synthetic */ void EZpvd(InterestInfoResponse interestInfoResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || interestInfoResponse.nextChargingTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, interestInfoResponse.nextChargingTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) interestInfoResponse.interestDebt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, interestInfoResponse.interestDebt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) interestInfoResponse.nonInterestDebt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, interestInfoResponse.nonInterestDebt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) interestInfoResponse.interestAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, interestInfoResponse.interestAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) interestInfoResponse.debtCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, interestInfoResponse.debtCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) interestInfoResponse.interestRateApyAvg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, interestInfoResponse.interestRateApyAvg);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) interestInfoResponse.totalInterestAmt, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, interestInfoResponse.totalInterestAmt);
    }

    public InterestInfoResponse(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.nextChargingTime = j;
        this.interestDebt = str;
        this.nonInterestDebt = str2;
        this.interestAmt = str3;
        this.debtCcy = str4;
        this.interestRateApyAvg = str5;
        this.totalInterestAmt = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0040: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r10v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:10) call: com.okinc.tradingbot.impl.dto.InterestInfoResponse.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InterestInfoResponse(long j, String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) == 0 ? str6 : "");
    }
}
