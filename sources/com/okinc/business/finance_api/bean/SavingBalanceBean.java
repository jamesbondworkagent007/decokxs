package com.okinc.business.finance_api.bean;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class SavingBalanceBean implements Parcelable {
    private String available;
    private String benefit;
    private String benefitCurrent;
    private String benefitTotal;
    private Long currencyId;
    private boolean eligibility;
    private String hold;
    private Integer kycLevel;
    private Long modifyTime;
    private String rate;
    private String unit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SavingBalanceBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SavingBalanceBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavingBalanceBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SavingBalanceBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavingBalanceBean[] newArray(int i) {
            return new SavingBalanceBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SavingBalanceBean() {
        this((String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, (Integer) null, (Long) null, (String) null, false, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.available;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.eligibility;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.benefit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.benefitCurrent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.benefitTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component5() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.hold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.kycLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component8() {
        return this.modifyTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SavingBalanceBean copy(String str, String str2, String str3, String str4, Long l, String str5, Integer num, Long l2, String str6, boolean z, String str7) {
        return new SavingBalanceBean(str, str2, str3, str4, l, str5, num, l2, str6, z, str7);
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
        if (!(obj instanceof SavingBalanceBean)) {
            return false;
        }
        SavingBalanceBean savingBalanceBean = (SavingBalanceBean) obj;
        return Intrinsics.EZpvd((Object) this.available, (Object) savingBalanceBean.available) && Intrinsics.EZpvd((Object) this.benefit, (Object) savingBalanceBean.benefit) && Intrinsics.EZpvd((Object) this.benefitCurrent, (Object) savingBalanceBean.benefitCurrent) && Intrinsics.EZpvd((Object) this.benefitTotal, (Object) savingBalanceBean.benefitTotal) && Intrinsics.EZpvd(this.currencyId, savingBalanceBean.currencyId) && Intrinsics.EZpvd((Object) this.hold, (Object) savingBalanceBean.hold) && Intrinsics.EZpvd(this.kycLevel, savingBalanceBean.kycLevel) && Intrinsics.EZpvd(this.modifyTime, savingBalanceBean.modifyTime) && Intrinsics.EZpvd((Object) this.rate, (Object) savingBalanceBean.rate) && this.eligibility == savingBalanceBean.eligibility && Intrinsics.EZpvd((Object) this.unit, (Object) savingBalanceBean.unit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailable() {
        return this.available;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBenefit() {
        return this.benefit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBenefitCurrent() {
        return this.benefitCurrent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBenefitTotal() {
        return this.benefitTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEligibility() {
        return this.eligibility;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHold() {
        return this.hold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getKycLevel() {
        return this.kycLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getModifyTime() {
        return this.modifyTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRate() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.available;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.benefit;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.benefitCurrent;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.benefitTotal;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        Long l = this.currencyId;
        int iHashCode5 = l == null ? 0 : l.hashCode();
        String str5 = this.hold;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        Integer num = this.kycLevel;
        int iHashCode7 = num == null ? 0 : num.hashCode();
        Long l2 = this.modifyTime;
        int iHashCode8 = l2 == null ? 0 : l2.hashCode();
        String str6 = this.rate;
        int iHashCode9 = str6 == null ? 0 : str6.hashCode();
        int iHashCode10 = Boolean.hashCode(this.eligibility);
        String str7 = this.unit;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvailable(String str) {
        this.available = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBenefit(String str) {
        this.benefit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBenefitCurrent(String str) {
        this.benefitCurrent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBenefitTotal(String str) {
        this.benefitTotal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(Long l) {
        this.currencyId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEligibility(boolean z) {
        this.eligibility = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHold(String str) {
        this.hold = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKycLevel(Integer num) {
        this.kycLevel = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setModifyTime(Long l) {
        this.modifyTime = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRate(String str) {
        this.rate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnit(String str) {
        this.unit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SavingBalanceBean(available=" + this.available + ", benefit=" + this.benefit + ", benefitCurrent=" + this.benefitCurrent + ", benefitTotal=" + this.benefitTotal + ", currencyId=" + this.currencyId + ", hold=" + this.hold + ", kycLevel=" + this.kycLevel + ", modifyTime=" + this.modifyTime + ", rate=" + this.rate + ", eligibility=" + this.eligibility + ", unit=" + this.unit + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.available);
        parcel.writeString(this.benefit);
        parcel.writeString(this.benefitCurrent);
        parcel.writeString(this.benefitTotal);
        Long l = this.currencyId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.hold);
        Integer num = this.kycLevel;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l2 = this.modifyTime;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.rate);
        parcel.writeInt(this.eligibility ? 1 : 0);
        parcel.writeString(this.unit);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.finance_api.bean.SavingBalanceBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SavingBalanceBean> serializer() {
            return SavingBalanceBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SavingBalanceBean(int i, String str, String str2, String str3, String str4, Long l, String str5, Integer num, Long l2, String str6, boolean z, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.available = null;
        } else {
            this.available = str;
        }
        if ((i & 2) == 0) {
            this.benefit = null;
        } else {
            this.benefit = str2;
        }
        if ((i & 4) == 0) {
            this.benefitCurrent = null;
        } else {
            this.benefitCurrent = str3;
        }
        if ((i & 8) == 0) {
            this.benefitTotal = null;
        } else {
            this.benefitTotal = str4;
        }
        if ((i & 16) == 0) {
            this.currencyId = null;
        } else {
            this.currencyId = l;
        }
        if ((i & 32) == 0) {
            this.hold = null;
        } else {
            this.hold = str5;
        }
        if ((i & 64) == 0) {
            this.kycLevel = null;
        } else {
            this.kycLevel = num;
        }
        if ((i & 128) == 0) {
            this.modifyTime = null;
        } else {
            this.modifyTime = l2;
        }
        if ((i & 256) == 0) {
            this.rate = null;
        } else {
            this.rate = str6;
        }
        if ((i & 512) == 0) {
            this.eligibility = false;
        } else {
            this.eligibility = z;
        }
        if ((i & 1024) == 0) {
            this.unit = null;
        } else {
            this.unit = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKFinance_finance_api(SavingBalanceBean savingBalanceBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || savingBalanceBean.available != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, savingBalanceBean.available);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || savingBalanceBean.benefit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, savingBalanceBean.benefit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || savingBalanceBean.benefitCurrent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, savingBalanceBean.benefitCurrent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || savingBalanceBean.benefitTotal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, savingBalanceBean.benefitTotal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || savingBalanceBean.currencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, savingBalanceBean.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || savingBalanceBean.hold != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, savingBalanceBean.hold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || savingBalanceBean.kycLevel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, savingBalanceBean.kycLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || savingBalanceBean.modifyTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, savingBalanceBean.modifyTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || savingBalanceBean.rate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, savingBalanceBean.rate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || savingBalanceBean.eligibility) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, savingBalanceBean.eligibility);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && savingBalanceBean.unit == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, savingBalanceBean.unit);
    }

    public SavingBalanceBean(String str, String str2, String str3, String str4, Long l, String str5, Integer num, Long l2, String str6, boolean z, String str7) {
        this.available = str;
        this.benefit = str2;
        this.benefitCurrent = str3;
        this.benefitTotal = str4;
        this.currencyId = l;
        this.hold = str5;
        this.kycLevel = num;
        this.modifyTime = l2;
        this.rate = str6;
        this.eligibility = z;
        this.unit = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0020: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r17v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0030: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r19v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0038: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r20v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0048: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0050: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.String, boolean, java.lang.String):void (m)] (LINE:11) call: com.okinc.business.finance_api.bean.SavingBalanceBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ SavingBalanceBean(String str, String str2, String str3, String str4, Long l, String str5, Integer num, Long l2, String str6, boolean z, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : l2, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? false : z, (i & 1024) == 0 ? str7 : null);
    }
}
