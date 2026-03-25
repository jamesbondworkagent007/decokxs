package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class SimpleModePreCheckResp implements Parcelable {
    public static final int $stable = 0;
    private final String balanceAmount;
    private final String borrowed;
    private final String hourRates;
    private final String interestRate;
    private final String rateType;
    private final String repayAvailAmount;
    private final String riskRatio;
    private final String yearRates;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SimpleModePreCheckResp> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<SimpleModePreCheckResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleModePreCheckResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SimpleModePreCheckResp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleModePreCheckResp[] newArray(int i) {
            return new SimpleModePreCheckResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SimpleModePreCheckResp() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.balanceAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.repayAvailAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.borrowed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.interestRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.riskRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.hourRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.yearRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleModePreCheckResp copy(String str, String str2, String str3, String str4, String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new SimpleModePreCheckResp(str, str2, str3, str4, str5, str6, str7, str8);
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
        if (!(obj instanceof SimpleModePreCheckResp)) {
            return false;
        }
        SimpleModePreCheckResp simpleModePreCheckResp = (SimpleModePreCheckResp) obj;
        return Intrinsics.EZpvd((Object) this.balanceAmount, (Object) simpleModePreCheckResp.balanceAmount) && Intrinsics.EZpvd((Object) this.repayAvailAmount, (Object) simpleModePreCheckResp.repayAvailAmount) && Intrinsics.EZpvd((Object) this.borrowed, (Object) simpleModePreCheckResp.borrowed) && Intrinsics.EZpvd((Object) this.interestRate, (Object) simpleModePreCheckResp.interestRate) && Intrinsics.EZpvd((Object) this.riskRatio, (Object) simpleModePreCheckResp.riskRatio) && Intrinsics.EZpvd((Object) this.hourRates, (Object) simpleModePreCheckResp.hourRates) && Intrinsics.EZpvd((Object) this.yearRates, (Object) simpleModePreCheckResp.yearRates) && Intrinsics.EZpvd((Object) this.rateType, (Object) simpleModePreCheckResp.rateType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalanceAmount() {
        return this.balanceAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBorrowed() {
        return this.borrowed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHourRates() {
        return this.hourRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInterestRate() {
        return this.interestRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRateType() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRepayAvailAmount() {
        return this.repayAvailAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskRatio() {
        return this.riskRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getYearRates() {
        return this.yearRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.balanceAmount;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.repayAvailAmount;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.borrowed;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.interestRate;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.riskRatio;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0)) * 31) + this.hourRates.hashCode()) * 31) + this.yearRates.hashCode()) * 31) + this.rateType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SimpleModePreCheckResp(balanceAmount=" + this.balanceAmount + ", repayAvailAmount=" + this.repayAvailAmount + ", borrowed=" + this.borrowed + ", interestRate=" + this.interestRate + ", riskRatio=" + this.riskRatio + ", hourRates=" + this.hourRates + ", yearRates=" + this.yearRates + ", rateType=" + this.rateType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.balanceAmount);
        parcel.writeString(this.repayAvailAmount);
        parcel.writeString(this.borrowed);
        parcel.writeString(this.interestRate);
        parcel.writeString(this.riskRatio);
        parcel.writeString(this.hourRates);
        parcel.writeString(this.yearRates);
        parcel.writeString(this.rateType);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SimpleModePreCheckResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SimpleModePreCheckResp> serializer() {
            return SimpleModePreCheckResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SimpleModePreCheckResp(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.balanceAmount = "";
        } else {
            this.balanceAmount = str;
        }
        if ((i & 2) == 0) {
            this.repayAvailAmount = "";
        } else {
            this.repayAvailAmount = str2;
        }
        if ((i & 4) == 0) {
            this.borrowed = "";
        } else {
            this.borrowed = str3;
        }
        if ((i & 8) == 0) {
            this.interestRate = "";
        } else {
            this.interestRate = str4;
        }
        if ((i & 16) == 0) {
            this.riskRatio = "";
        } else {
            this.riskRatio = str5;
        }
        if ((i & 32) == 0) {
            this.hourRates = "";
        } else {
            this.hourRates = str6;
        }
        if ((i & 64) == 0) {
            this.yearRates = "";
        } else {
            this.yearRates = str7;
        }
        if ((i & 128) == 0) {
            this.rateType = "";
        } else {
            this.rateType = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SimpleModePreCheckResp simpleModePreCheckResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) simpleModePreCheckResp.balanceAmount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, simpleModePreCheckResp.balanceAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) simpleModePreCheckResp.repayAvailAmount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, simpleModePreCheckResp.repayAvailAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) simpleModePreCheckResp.borrowed, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, simpleModePreCheckResp.borrowed);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) simpleModePreCheckResp.interestRate, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, simpleModePreCheckResp.interestRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) simpleModePreCheckResp.riskRatio, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, simpleModePreCheckResp.riskRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) simpleModePreCheckResp.hourRates, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, simpleModePreCheckResp.hourRates);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) simpleModePreCheckResp.yearRates, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, simpleModePreCheckResp.yearRates);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd((Object) simpleModePreCheckResp.rateType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, simpleModePreCheckResp.rateType);
    }

    public SimpleModePreCheckResp(String str, String str2, String str3, String str4, String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.balanceAmount = str;
        this.repayAvailAmount = str2;
        this.borrowed = str3;
        this.interestRate = str4;
        this.riskRatio = str5;
        this.hourRates = str6;
        this.yearRates = str7;
        this.rateType = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:27) call: com.okinc.unify_trade.biz.SimpleModePreCheckResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SimpleModePreCheckResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "");
    }

    public final String getRateByType() {
        String str = this.rateType;
        if (Intrinsics.EZpvd((Object) str, (Object) "year")) {
            return this.yearRates;
        }
        if (Intrinsics.EZpvd((Object) str, (Object) "hour")) {
            return this.hourRates;
        }
        String str2 = this.interestRate;
        return str2 == null ? "" : str2;
    }
}
