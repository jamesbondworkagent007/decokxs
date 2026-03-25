package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestValidatorListItems implements Parcelable {
    public static final int $stable = 0;
    private final String commission;
    private final Long investmentId;
    private final String providerPubkey;
    private final String rate;
    private final Integer rateType;
    private final boolean recommended;
    private final String stakedAmount;
    private final String tokenSymbol;
    private final String totalDelegations;
    private final String tvl;
    private final String validatorName;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InvestValidatorListItems> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestValidatorListItems> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestValidatorListItems createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestValidatorListItems(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestValidatorListItems[] newArray(int i) {
            return new InvestValidatorListItems[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestValidatorListItems() {
        this((Long) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.totalDelegations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.recommended;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.stakedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.validatorName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.providerPubkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.commission;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestValidatorListItems copy(Long l, String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        return new InvestValidatorListItems(l, str, num, str2, str3, str4, str5, str6, str7, str8, z);
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
        if (!(obj instanceof InvestValidatorListItems)) {
            return false;
        }
        InvestValidatorListItems investValidatorListItems = (InvestValidatorListItems) obj;
        return Intrinsics.EZpvd(this.investmentId, investValidatorListItems.investmentId) && Intrinsics.EZpvd((Object) this.rate, (Object) investValidatorListItems.rate) && Intrinsics.EZpvd(this.rateType, investValidatorListItems.rateType) && Intrinsics.EZpvd((Object) this.stakedAmount, (Object) investValidatorListItems.stakedAmount) && Intrinsics.EZpvd((Object) this.tvl, (Object) investValidatorListItems.tvl) && Intrinsics.EZpvd((Object) this.validatorName, (Object) investValidatorListItems.validatorName) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) investValidatorListItems.tokenSymbol) && Intrinsics.EZpvd((Object) this.providerPubkey, (Object) investValidatorListItems.providerPubkey) && Intrinsics.EZpvd((Object) this.commission, (Object) investValidatorListItems.commission) && Intrinsics.EZpvd((Object) this.totalDelegations, (Object) investValidatorListItems.totalDelegations) && this.recommended == investValidatorListItems.recommended;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCommission() {
        return this.commission;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getInvestmentId() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProviderPubkey() {
        return this.providerPubkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRate() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRateType() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getRecommended() {
        return this.recommended;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStakedAmount() {
        return this.stakedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalDelegations() {
        return this.totalDelegations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTvl() {
        return this.tvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValidatorName() {
        return this.validatorName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.investmentId;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.rate;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.rateType;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str2 = this.stakedAmount;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tvl;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.validatorName;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tokenSymbol;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.providerPubkey;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.commission;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.totalDelegations;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str8 != null ? str8.hashCode() : 0)) * 31) + Boolean.hashCode(this.recommended);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestValidatorListItems(investmentId=" + this.investmentId + ", rate=" + this.rate + ", rateType=" + this.rateType + ", stakedAmount=" + this.stakedAmount + ", tvl=" + this.tvl + ", validatorName=" + this.validatorName + ", tokenSymbol=" + this.tokenSymbol + ", providerPubkey=" + this.providerPubkey + ", commission=" + this.commission + ", totalDelegations=" + this.totalDelegations + ", recommended=" + this.recommended + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.investmentId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.rate);
        Integer num = this.rateType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.stakedAmount);
        parcel.writeString(this.tvl);
        parcel.writeString(this.validatorName);
        parcel.writeString(this.tokenSymbol);
        parcel.writeString(this.providerPubkey);
        parcel.writeString(this.commission);
        parcel.writeString(this.totalDelegations);
        parcel.writeInt(this.recommended ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestValidatorListItems.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestValidatorListItems> serializer() {
            return InvestValidatorListItems$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestValidatorListItems(int i, Long l, String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.investmentId = null;
        } else {
            this.investmentId = l;
        }
        if ((i & 2) == 0) {
            this.rate = null;
        } else {
            this.rate = str;
        }
        if ((i & 4) == 0) {
            this.rateType = null;
        } else {
            this.rateType = num;
        }
        if ((i & 8) == 0) {
            this.stakedAmount = null;
        } else {
            this.stakedAmount = str2;
        }
        if ((i & 16) == 0) {
            this.tvl = null;
        } else {
            this.tvl = str3;
        }
        if ((i & 32) == 0) {
            this.validatorName = null;
        } else {
            this.validatorName = str4;
        }
        if ((i & 64) == 0) {
            this.tokenSymbol = null;
        } else {
            this.tokenSymbol = str5;
        }
        if ((i & 128) == 0) {
            this.providerPubkey = null;
        } else {
            this.providerPubkey = str6;
        }
        if ((i & 256) == 0) {
            this.commission = null;
        } else {
            this.commission = str7;
        }
        if ((i & 512) == 0) {
            this.totalDelegations = null;
        } else {
            this.totalDelegations = str8;
        }
        if ((i & 1024) == 0) {
            this.recommended = false;
        } else {
            this.recommended = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestValidatorListItems investValidatorListItems, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investValidatorListItems.investmentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, investValidatorListItems.investmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investValidatorListItems.rate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, investValidatorListItems.rate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investValidatorListItems.rateType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, investValidatorListItems.rateType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investValidatorListItems.stakedAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, investValidatorListItems.stakedAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investValidatorListItems.tvl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, investValidatorListItems.tvl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investValidatorListItems.validatorName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, investValidatorListItems.validatorName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || investValidatorListItems.tokenSymbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, investValidatorListItems.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || investValidatorListItems.providerPubkey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, investValidatorListItems.providerPubkey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || investValidatorListItems.commission != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, investValidatorListItems.commission);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || investValidatorListItems.totalDelegations != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, investValidatorListItems.totalDelegations);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || investValidatorListItems.recommended) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 10, investValidatorListItems.recommended);
        }
    }

    public InvestValidatorListItems(Long l, String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        this.investmentId = l;
        this.rate = str;
        this.rateType = num;
        this.stakedAmount = str2;
        this.tvl = str3;
        this.validatorName = str4;
        this.tokenSymbol = str5;
        this.providerPubkey = str6;
        this.commission = str7;
        this.totalDelegations = str8;
        this.recommended = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006c: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r13v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0011: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r15v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r24v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r22v0 java.lang.String) : (null java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004f: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
 A[MD:(java.lang.Long, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:946) call: com.okinc.business.invest_biz.data.bean.InvestValidatorListItems.<init>(java.lang.Long, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ InvestValidatorListItems(Long l, String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) == 0 ? str8 : null, (i & 1024) != 0 ? false : z);
    }
}
