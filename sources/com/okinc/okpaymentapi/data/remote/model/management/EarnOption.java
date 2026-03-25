package com.okinc.okpaymentapi.data.remote.model.management;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class EarnOption implements Parcelable {
    public static final int $stable = 0;
    private final Boolean autoEarnEnabled;
    private final Long currencyId;
    private final String earnAgreementContext;
    private final Boolean earnMaxUnlimited;
    private final String earnRate;
    private final Double eligibleAmountMax;
    private final Double eligibleAmountMin;
    private final LocalizedText localizedText;
    private final Long productTypeId;
    private final String productTypeName;
    private final Integer rewardType;
    private final Long savingTypeId;
    private final String savingTypeName;
    private final Boolean toggle;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EarnOption> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EarnOption> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarnOption createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Intrinsics.checkNotNullParameter(parcel, "");
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string2 = parcel.readString();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new EarnOption(lValueOf, lValueOf2, string, lValueOf3, string2, dValueOf, dValueOf2, boolValueOf, boolValueOf2, boolValueOf3, parcel.readString(), parcel.readInt() == 0 ? null : LocalizedText.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarnOption[] newArray(int i) {
            return new EarnOption[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EarnOption() {
        this((Long) null, (Long) null, (String) null, (Long) null, (String) null, (Double) null, (Double) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (LocalizedText) null, (String) null, (Integer) null, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.autoEarnEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.earnRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LocalizedText component12() {
        return this.localizedText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.earnAgreementContext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component14() {
        return this.rewardType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.productTypeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.productTypeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component4() {
        return this.savingTypeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.savingTypeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component6() {
        return this.eligibleAmountMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component7() {
        return this.eligibleAmountMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.earnMaxUnlimited;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.toggle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnOption copy(Long l, Long l2, String str, Long l3, String str2, Double d, Double d2, Boolean bool, Boolean bool2, Boolean bool3, String str3, LocalizedText localizedText, String str4, Integer num) {
        return new EarnOption(l, l2, str, l3, str2, d, d2, bool, bool2, bool3, str3, localizedText, str4, num);
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
        if (!(obj instanceof EarnOption)) {
            return false;
        }
        EarnOption earnOption = (EarnOption) obj;
        return Intrinsics.EZpvd(this.currencyId, earnOption.currencyId) && Intrinsics.EZpvd(this.productTypeId, earnOption.productTypeId) && Intrinsics.EZpvd((Object) this.productTypeName, (Object) earnOption.productTypeName) && Intrinsics.EZpvd(this.savingTypeId, earnOption.savingTypeId) && Intrinsics.EZpvd((Object) this.savingTypeName, (Object) earnOption.savingTypeName) && Intrinsics.EZpvd(this.eligibleAmountMax, earnOption.eligibleAmountMax) && Intrinsics.EZpvd(this.eligibleAmountMin, earnOption.eligibleAmountMin) && Intrinsics.EZpvd(this.earnMaxUnlimited, earnOption.earnMaxUnlimited) && Intrinsics.EZpvd(this.toggle, earnOption.toggle) && Intrinsics.EZpvd(this.autoEarnEnabled, earnOption.autoEarnEnabled) && Intrinsics.EZpvd((Object) this.earnRate, (Object) earnOption.earnRate) && Intrinsics.EZpvd(this.localizedText, earnOption.localizedText) && Intrinsics.EZpvd((Object) this.earnAgreementContext, (Object) earnOption.earnAgreementContext) && Intrinsics.EZpvd(this.rewardType, earnOption.rewardType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAutoEarnEnabled() {
        return this.autoEarnEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarnAgreementContext() {
        return this.earnAgreementContext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getEarnMaxUnlimited() {
        return this.earnMaxUnlimited;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarnRate() {
        return this.earnRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getEligibleAmountMax() {
        return this.eligibleAmountMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getEligibleAmountMin() {
        return this.eligibleAmountMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LocalizedText getLocalizedText() {
        return this.localizedText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getProductTypeId() {
        return this.productTypeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProductTypeName() {
        return this.productTypeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRewardType() {
        return this.rewardType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getSavingTypeId() {
        return this.savingTypeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSavingTypeName() {
        return this.savingTypeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getToggle() {
        return this.toggle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.currencyId;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.productTypeId;
        int iHashCode2 = l2 == null ? 0 : l2.hashCode();
        String str = this.productTypeName;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        Long l3 = this.savingTypeId;
        int iHashCode4 = l3 == null ? 0 : l3.hashCode();
        String str2 = this.savingTypeName;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        Double d = this.eligibleAmountMax;
        int iHashCode6 = d == null ? 0 : d.hashCode();
        Double d2 = this.eligibleAmountMin;
        int iHashCode7 = d2 == null ? 0 : d2.hashCode();
        Boolean bool = this.earnMaxUnlimited;
        int iHashCode8 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.toggle;
        int iHashCode9 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.autoEarnEnabled;
        int iHashCode10 = bool3 == null ? 0 : bool3.hashCode();
        String str3 = this.earnRate;
        int iHashCode11 = str3 == null ? 0 : str3.hashCode();
        LocalizedText localizedText = this.localizedText;
        int iHashCode12 = localizedText == null ? 0 : localizedText.hashCode();
        String str4 = this.earnAgreementContext;
        int iHashCode13 = str4 == null ? 0 : str4.hashCode();
        Integer num = this.rewardType;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EarnOption(currencyId=" + this.currencyId + ", productTypeId=" + this.productTypeId + ", productTypeName=" + this.productTypeName + ", savingTypeId=" + this.savingTypeId + ", savingTypeName=" + this.savingTypeName + ", eligibleAmountMax=" + this.eligibleAmountMax + ", eligibleAmountMin=" + this.eligibleAmountMin + ", earnMaxUnlimited=" + this.earnMaxUnlimited + ", toggle=" + this.toggle + ", autoEarnEnabled=" + this.autoEarnEnabled + ", earnRate=" + this.earnRate + ", localizedText=" + this.localizedText + ", earnAgreementContext=" + this.earnAgreementContext + ", rewardType=" + this.rewardType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.currencyId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.productTypeId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.productTypeName);
        Long l3 = this.savingTypeId;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        parcel.writeString(this.savingTypeName);
        Double d = this.eligibleAmountMax;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.eligibleAmountMin;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        Boolean bool = this.earnMaxUnlimited;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.toggle;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.autoEarnEnabled;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.earnRate);
        LocalizedText localizedText = this.localizedText;
        if (localizedText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localizedText.writeToParcel(parcel, i);
        }
        parcel.writeString(this.earnAgreementContext);
        Integer num = this.rewardType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.management.EarnOption.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EarnOption> serializer() {
            return EarnOption$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EarnOption(int i, Long l, Long l2, String str, Long l3, String str2, Double d, Double d2, Boolean bool, Boolean bool2, Boolean bool3, String str3, LocalizedText localizedText, String str4, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.currencyId = null;
        } else {
            this.currencyId = l;
        }
        if ((i & 2) == 0) {
            this.productTypeId = null;
        } else {
            this.productTypeId = l2;
        }
        if ((i & 4) == 0) {
            this.productTypeName = null;
        } else {
            this.productTypeName = str;
        }
        if ((i & 8) == 0) {
            this.savingTypeId = null;
        } else {
            this.savingTypeId = l3;
        }
        if ((i & 16) == 0) {
            this.savingTypeName = null;
        } else {
            this.savingTypeName = str2;
        }
        if ((i & 32) == 0) {
            this.eligibleAmountMax = null;
        } else {
            this.eligibleAmountMax = d;
        }
        if ((i & 64) == 0) {
            this.eligibleAmountMin = null;
        } else {
            this.eligibleAmountMin = d2;
        }
        if ((i & 128) == 0) {
            this.earnMaxUnlimited = null;
        } else {
            this.earnMaxUnlimited = bool;
        }
        if ((i & 256) == 0) {
            this.toggle = null;
        } else {
            this.toggle = bool2;
        }
        if ((i & 512) == 0) {
            this.autoEarnEnabled = null;
        } else {
            this.autoEarnEnabled = bool3;
        }
        if ((i & 1024) == 0) {
            this.earnRate = null;
        } else {
            this.earnRate = str3;
        }
        if ((i & 2048) == 0) {
            this.localizedText = null;
        } else {
            this.localizedText = localizedText;
        }
        if ((i & 4096) == 0) {
            this.earnAgreementContext = null;
        } else {
            this.earnAgreementContext = str4;
        }
        if ((i & 8192) == 0) {
            this.rewardType = null;
        } else {
            this.rewardType = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(EarnOption earnOption, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || earnOption.currencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, earnOption.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || earnOption.productTypeId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, earnOption.productTypeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || earnOption.productTypeName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, earnOption.productTypeName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || earnOption.savingTypeId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, earnOption.savingTypeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || earnOption.savingTypeName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, earnOption.savingTypeName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || earnOption.eligibleAmountMax != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, DoubleSerializer.INSTANCE, earnOption.eligibleAmountMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || earnOption.eligibleAmountMin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, DoubleSerializer.INSTANCE, earnOption.eligibleAmountMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || earnOption.earnMaxUnlimited != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, earnOption.earnMaxUnlimited);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || earnOption.toggle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, earnOption.toggle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || earnOption.autoEarnEnabled != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, earnOption.autoEarnEnabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || earnOption.earnRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, earnOption.earnRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || earnOption.localizedText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, LocalizedText$$serializer.INSTANCE, earnOption.localizedText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || earnOption.earnAgreementContext != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, earnOption.earnAgreementContext);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && earnOption.rewardType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, earnOption.rewardType);
    }

    public EarnOption(Long l, Long l2, String str, Long l3, String str2, Double d, Double d2, Boolean bool, Boolean bool2, Boolean bool3, String str3, LocalizedText localizedText, String str4, Integer num) {
        this.currencyId = l;
        this.productTypeId = l2;
        this.productTypeName = str;
        this.savingTypeId = l3;
        this.savingTypeName = str2;
        this.eligibleAmountMax = d;
        this.eligibleAmountMin = d2;
        this.earnMaxUnlimited = bool;
        this.toggle = bool2;
        this.autoEarnEnabled = bool3;
        this.earnRate = str3;
        this.localizedText = localizedText;
        this.earnAgreementContext = str4;
        this.rewardType = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0090: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r16v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r17v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x001b: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r19v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x002b: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r21v0 java.lang.Double))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0033: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r22v0 java.lang.Double))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003b: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r23v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0043: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r24v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004b: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r25v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.LocalizedText:?: TERNARY null = ((wrap:int:0x005b: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.management.LocalizedText) : (r27v0 com.okinc.okpaymentapi.data.remote.model.management.LocalizedText))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x006b: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.Integer) : (null java.lang.Integer))
 A[MD:(java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, java.lang.Double, java.lang.Double, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.LocalizedText, java.lang.String, java.lang.Integer):void (m)] (LINE:448) call: com.okinc.okpaymentapi.data.remote.model.management.EarnOption.<init>(java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, java.lang.Double, java.lang.Double, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.LocalizedText, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ EarnOption(Long l, Long l2, String str, Long l3, String str2, Double d, Double d2, Boolean bool, Boolean bool2, Boolean bool3, String str3, LocalizedText localizedText, String str4, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : l3, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : d, (i & 64) != 0 ? null : d2, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : bool2, (i & 512) != 0 ? null : bool3, (i & 1024) != 0 ? null : str3, (i & 2048) != 0 ? null : localizedText, (i & 4096) != 0 ? null : str4, (i & 8192) == 0 ? num : null);
    }
}
