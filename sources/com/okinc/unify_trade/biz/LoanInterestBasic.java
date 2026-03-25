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

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class LoanInterestBasic implements Parcelable {
    public static final int $stable = 0;
    private final String apr;
    private final String ccy;
    private final String hourRates;
    private final String quota;
    private final String rate;
    private final String rateType;
    private final String yearRates;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LoanInterestBasic> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LoanInterestBasic> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoanInterestBasic createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LoanInterestBasic(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoanInterestBasic[] newArray(int i) {
            return new LoanInterestBasic[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LoanInterestBasic() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LoanInterestBasic copy$default(LoanInterestBasic loanInterestBasic, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loanInterestBasic.apr;
        }
        if ((i & 2) != 0) {
            str2 = loanInterestBasic.ccy;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = loanInterestBasic.quota;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = loanInterestBasic.rate;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = loanInterestBasic.hourRates;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = loanInterestBasic.yearRates;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = loanInterestBasic.rateType;
        }
        return loanInterestBasic.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.apr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.quota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.hourRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.yearRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LoanInterestBasic copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new LoanInterestBasic(str, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof LoanInterestBasic)) {
            return false;
        }
        LoanInterestBasic loanInterestBasic = (LoanInterestBasic) obj;
        return Intrinsics.EZpvd((Object) this.apr, (Object) loanInterestBasic.apr) && Intrinsics.EZpvd((Object) this.ccy, (Object) loanInterestBasic.ccy) && Intrinsics.EZpvd((Object) this.quota, (Object) loanInterestBasic.quota) && Intrinsics.EZpvd((Object) this.rate, (Object) loanInterestBasic.rate) && Intrinsics.EZpvd((Object) this.hourRates, (Object) loanInterestBasic.hourRates) && Intrinsics.EZpvd((Object) this.yearRates, (Object) loanInterestBasic.yearRates) && Intrinsics.EZpvd((Object) this.rateType, (Object) loanInterestBasic.rateType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApr() {
        return this.apr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHourRates() {
        return this.hourRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuota() {
        return this.quota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRate() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRateType() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getYearRates() {
        return this.yearRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.apr;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.ccy;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.quota;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.rate;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.hourRates;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.yearRates;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.rateType;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LoanInterestBasic(apr=" + this.apr + ", ccy=" + this.ccy + ", quota=" + this.quota + ", rate=" + this.rate + ", hourRates=" + this.hourRates + ", yearRates=" + this.yearRates + ", rateType=" + this.rateType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.apr);
        parcel.writeString(this.ccy);
        parcel.writeString(this.quota);
        parcel.writeString(this.rate);
        parcel.writeString(this.hourRates);
        parcel.writeString(this.yearRates);
        parcel.writeString(this.rateType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.LoanInterestBasic.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LoanInterestBasic> serializer() {
            return LoanInterestBasic$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LoanInterestBasic(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.apr = "";
        } else {
            this.apr = str;
        }
        if ((i & 2) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str2;
        }
        if ((i & 4) == 0) {
            this.quota = "";
        } else {
            this.quota = str3;
        }
        if ((i & 8) == 0) {
            this.rate = "";
        } else {
            this.rate = str4;
        }
        if ((i & 16) == 0) {
            this.hourRates = "";
        } else {
            this.hourRates = str5;
        }
        if ((i & 32) == 0) {
            this.yearRates = "";
        } else {
            this.yearRates = str6;
        }
        if ((i & 64) == 0) {
            this.rateType = "";
        } else {
            this.rateType = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(LoanInterestBasic loanInterestBasic, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) loanInterestBasic.apr, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, loanInterestBasic.apr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) loanInterestBasic.ccy, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, loanInterestBasic.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) loanInterestBasic.quota, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, loanInterestBasic.quota);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) loanInterestBasic.rate, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, loanInterestBasic.rate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) loanInterestBasic.hourRates, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, loanInterestBasic.hourRates);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) loanInterestBasic.yearRates, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, loanInterestBasic.yearRates);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) loanInterestBasic.rateType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, loanInterestBasic.rateType);
    }

    public LoanInterestBasic(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.apr = str;
        this.ccy = str2;
        this.quota = str3;
        this.rate = str4;
        this.hourRates = str5;
        this.yearRates = str6;
        this.rateType = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:3559) call: com.okinc.unify_trade.biz.LoanInterestBasic.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LoanInterestBasic(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }

    public final String getRateByType() {
        String str = this.rateType;
        return (str == null || str.length() == 0) ? this.apr : Intrinsics.EZpvd((Object) this.rateType, (Object) "year") ? this.yearRates : this.hourRates;
    }
}
