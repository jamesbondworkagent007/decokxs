package com.okinc.crcore.shared.net.responsebean.bsc;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import com.okinc.crcore.coreapi.net.responsebean.bsc.EarnOptionResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class EarnOptionBean implements Parcelable {
    public static final int $stable = 0;
    private final boolean autoEarnEnabled;
    private final Long currencyId;
    private final String earnAgreementContext;
    private final boolean earnMaxUnlimited;
    private final String earnRate;
    private final double eligibleAmountMax;
    private final double eligibleAmountMin;
    private final LocalizedTextBean localizedText;
    private final Long productTypeId;
    private final String productTypeName;
    private final Integer rewardType;
    private final Long savingTypeId;
    private final String savingTypeName;
    private final boolean toggle;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EarnOptionBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EarnOptionBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarnOptionBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EarnOptionBean(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), LocalizedTextBean.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarnOptionBean[] newArray(int i) {
            return new EarnOptionBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EarnOptionBean() {
        this((Long) null, (Long) null, (String) null, (Long) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, false, false, false, (String) null, (LocalizedTextBean) null, (String) null, (Integer) null, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.autoEarnEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.earnRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LocalizedTextBean component12() {
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
    public final double component6() {
        return this.eligibleAmountMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component7() {
        return this.eligibleAmountMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.earnMaxUnlimited;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.toggle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnOptionBean copy(Long l, Long l2, @NotNull String str, Long l3, @NotNull String str2, double d, double d2, boolean z, boolean z2, boolean z3, @NotNull String str3, @NotNull LocalizedTextBean localizedTextBean, @NotNull String str4, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(localizedTextBean, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new EarnOptionBean(l, l2, str, l3, str2, d, d2, z, z2, z3, str3, localizedTextBean, str4, num);
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
        if (!(obj instanceof EarnOptionBean)) {
            return false;
        }
        EarnOptionBean earnOptionBean = (EarnOptionBean) obj;
        return Intrinsics.EZpvd(this.currencyId, earnOptionBean.currencyId) && Intrinsics.EZpvd(this.productTypeId, earnOptionBean.productTypeId) && Intrinsics.EZpvd((Object) this.productTypeName, (Object) earnOptionBean.productTypeName) && Intrinsics.EZpvd(this.savingTypeId, earnOptionBean.savingTypeId) && Intrinsics.EZpvd((Object) this.savingTypeName, (Object) earnOptionBean.savingTypeName) && Double.compare(this.eligibleAmountMax, earnOptionBean.eligibleAmountMax) == 0 && Double.compare(this.eligibleAmountMin, earnOptionBean.eligibleAmountMin) == 0 && this.earnMaxUnlimited == earnOptionBean.earnMaxUnlimited && this.toggle == earnOptionBean.toggle && this.autoEarnEnabled == earnOptionBean.autoEarnEnabled && Intrinsics.EZpvd((Object) this.earnRate, (Object) earnOptionBean.earnRate) && Intrinsics.EZpvd(this.localizedText, earnOptionBean.localizedText) && Intrinsics.EZpvd((Object) this.earnAgreementContext, (Object) earnOptionBean.earnAgreementContext) && Intrinsics.EZpvd(this.rewardType, earnOptionBean.rewardType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAutoEarnEnabled() {
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
    public final boolean getEarnMaxUnlimited() {
        return this.earnMaxUnlimited;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarnRate() {
        return this.earnRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getEligibleAmountMax() {
        return this.eligibleAmountMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getEligibleAmountMin() {
        return this.eligibleAmountMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LocalizedTextBean getLocalizedText() {
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
    public final boolean getToggle() {
        return this.toggle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.currencyId;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.productTypeId;
        int iHashCode2 = l2 == null ? 0 : l2.hashCode();
        int iHashCode3 = this.productTypeName.hashCode();
        Long l3 = this.savingTypeId;
        int iHashCode4 = l3 == null ? 0 : l3.hashCode();
        int iHashCode5 = this.savingTypeName.hashCode();
        int iHashCode6 = Double.hashCode(this.eligibleAmountMax);
        int iHashCode7 = Double.hashCode(this.eligibleAmountMin);
        int iHashCode8 = Boolean.hashCode(this.earnMaxUnlimited);
        int iHashCode9 = Boolean.hashCode(this.toggle);
        int iHashCode10 = Boolean.hashCode(this.autoEarnEnabled);
        int iHashCode11 = this.earnRate.hashCode();
        int iHashCode12 = this.localizedText.hashCode();
        int iHashCode13 = this.earnAgreementContext.hashCode();
        Integer num = this.rewardType;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EarnOptionBean(currencyId=" + this.currencyId + ", productTypeId=" + this.productTypeId + ", productTypeName=" + this.productTypeName + ", savingTypeId=" + this.savingTypeId + ", savingTypeName=" + this.savingTypeName + ", eligibleAmountMax=" + this.eligibleAmountMax + ", eligibleAmountMin=" + this.eligibleAmountMin + ", earnMaxUnlimited=" + this.earnMaxUnlimited + ", toggle=" + this.toggle + ", autoEarnEnabled=" + this.autoEarnEnabled + ", earnRate=" + this.earnRate + ", localizedText=" + this.localizedText + ", earnAgreementContext=" + this.earnAgreementContext + ", rewardType=" + this.rewardType + ")";
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
        parcel.writeDouble(this.eligibleAmountMax);
        parcel.writeDouble(this.eligibleAmountMin);
        parcel.writeInt(this.earnMaxUnlimited ? 1 : 0);
        parcel.writeInt(this.toggle ? 1 : 0);
        parcel.writeInt(this.autoEarnEnabled ? 1 : 0);
        parcel.writeString(this.earnRate);
        this.localizedText.writeToParcel(parcel, i);
        parcel.writeString(this.earnAgreementContext);
        Integer num = this.rewardType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public /* synthetic */ EarnOptionBean(int i, Long l, Long l2, String str, Long l3, String str2, double d, double d2, boolean z, boolean z2, boolean z3, String str3, LocalizedTextBean localizedTextBean, String str4, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.productTypeName = "";
        } else {
            this.productTypeName = str;
        }
        if ((i & 8) == 0) {
            this.savingTypeId = null;
        } else {
            this.savingTypeId = l3;
        }
        if ((i & 16) == 0) {
            this.savingTypeName = "";
        } else {
            this.savingTypeName = str2;
        }
        int i2 = i & 32;
        double d3 = AudioStats.AUDIO_AMPLITUDE_NONE;
        if (i2 == 0) {
            this.eligibleAmountMax = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            this.eligibleAmountMax = d;
        }
        this.eligibleAmountMin = (i & 64) != 0 ? d2 : d3;
        if ((i & 128) == 0) {
            this.earnMaxUnlimited = false;
        } else {
            this.earnMaxUnlimited = z;
        }
        if ((i & 256) == 0) {
            this.toggle = false;
        } else {
            this.toggle = z2;
        }
        if ((i & 512) == 0) {
            this.autoEarnEnabled = false;
        } else {
            this.autoEarnEnabled = z3;
        }
        if ((i & 1024) == 0) {
            this.earnRate = "";
        } else {
            this.earnRate = str3;
        }
        this.localizedText = (i & 2048) == 0 ? new LocalizedTextBean(false, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null) : localizedTextBean;
        if ((i & 4096) == 0) {
            this.earnAgreementContext = "";
        } else {
            this.earnAgreementContext = str4;
        }
        if ((i & 8192) == 0) {
            this.rewardType = null;
        } else {
            this.rewardType = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(EarnOptionBean earnOptionBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || earnOptionBean.currencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, earnOptionBean.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || earnOptionBean.productTypeId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, earnOptionBean.productTypeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) earnOptionBean.productTypeName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, earnOptionBean.productTypeName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || earnOptionBean.savingTypeId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, earnOptionBean.savingTypeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) earnOptionBean.savingTypeName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, earnOptionBean.savingTypeName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || Double.compare(earnOptionBean.eligibleAmountMax, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 5, earnOptionBean.eligibleAmountMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || Double.compare(earnOptionBean.eligibleAmountMin, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 6, earnOptionBean.eligibleAmountMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || earnOptionBean.earnMaxUnlimited) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, earnOptionBean.earnMaxUnlimited);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || earnOptionBean.toggle) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 8, earnOptionBean.toggle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || earnOptionBean.autoEarnEnabled) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, earnOptionBean.autoEarnEnabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) earnOptionBean.earnRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, earnOptionBean.earnRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(earnOptionBean.localizedText, new LocalizedTextBean(false, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, LocalizedTextBean$$serializer.INSTANCE, earnOptionBean.localizedText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) earnOptionBean.earnAgreementContext, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, earnOptionBean.earnAgreementContext);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && earnOptionBean.rewardType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, earnOptionBean.rewardType);
    }

    public EarnOptionBean(Long l, Long l2, @NotNull String str, Long l3, @NotNull String str2, double d, double d2, boolean z, boolean z2, boolean z3, @NotNull String str3, @NotNull LocalizedTextBean localizedTextBean, @NotNull String str4, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(localizedTextBean, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.currencyId = l;
        this.productTypeId = l2;
        this.productTypeName = str;
        this.savingTypeId = l3;
        this.savingTypeName = str2;
        this.eligibleAmountMax = d;
        this.eligibleAmountMin = d2;
        this.earnMaxUnlimited = z;
        this.toggle = z2;
        this.autoEarnEnabled = z3;
        this.earnRate = str3;
        this.localizedText = localizedTextBean;
        this.earnAgreementContext = str4;
        this.rewardType = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00bc: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r41v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r25v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000a: ARITH (r41v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r26v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r41v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x001c: ARITH (r41v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r28v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r41v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:double:?: TERNARY null = ((wrap:int:0x002c: ARITH (r41v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0.0d double) : (r30v0 double))
  (wrap:double:?: TERNARY null = ((wrap:int:0x0036: ARITH (r41v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r32v0 double) : (wrap:double:0x002e: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003d: ARITH (r41v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r34v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0046: ARITH (r41v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r35v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004e: ARITH (r41v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r36v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r41v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:com.okinc.crcore.shared.net.responsebean.bsc.LocalizedTextBean:?: TERNARY null = ((wrap:int:0x005d: ARITH (r41v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0085: CONSTRUCTOR 
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (63 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:108) call: com.okinc.crcore.shared.net.responsebean.bsc.LocalizedTextBean.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r38v0 com.okinc.crcore.shared.net.responsebean.bsc.LocalizedTextBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r41v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0096: ARITH (r41v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r40v0 java.lang.Integer))
 A[MD:(java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, double, double, boolean, boolean, boolean, java.lang.String, com.okinc.crcore.shared.net.responsebean.bsc.LocalizedTextBean, java.lang.String, java.lang.Integer):void (m)] (LINE:96) call: com.okinc.crcore.shared.net.responsebean.bsc.EarnOptionBean.<init>(java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, double, double, boolean, boolean, boolean, java.lang.String, com.okinc.crcore.shared.net.responsebean.bsc.LocalizedTextBean, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ EarnOptionBean(Long l, Long l2, String str, Long l3, String str2, double d, double d2, boolean z, boolean z2, boolean z3, String str3, LocalizedTextBean localizedTextBean, String str4, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? null : l3, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? 0.0d : d, (i & 64) == 0 ? d2 : AudioStats.AUDIO_AMPLITUDE_NONE, (i & 128) != 0 ? false : z, (i & 256) != 0 ? false : z2, (i & 512) == 0 ? z3 : false, (i & 1024) != 0 ? "" : str3, (i & 2048) != 0 ? new LocalizedTextBean(false, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null) : localizedTextBean, (i & 4096) != 0 ? "" : str4, (i & 8192) != 0 ? null : num);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.EarnOptionBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EarnOptionBean> serializer() {
            return EarnOptionBean$$serializer.INSTANCE;
        }

        public final EarnOptionBean KWHzl(@NotNull EarnOptionResponseBean earnOptionResponseBean) {
            Intrinsics.checkNotNullParameter(earnOptionResponseBean, "");
            Long currencyId = earnOptionResponseBean.getCurrencyId();
            Long productTypeId = earnOptionResponseBean.getProductTypeId();
            String productTypeName = earnOptionResponseBean.getProductTypeName();
            Long savingTypeId = earnOptionResponseBean.getSavingTypeId();
            String savingTypeName = earnOptionResponseBean.getSavingTypeName();
            double eligibleAmountMax = earnOptionResponseBean.getEligibleAmountMax();
            double eligibleAmountMin = earnOptionResponseBean.getEligibleAmountMin();
            boolean earnMaxUnlimited = earnOptionResponseBean.getEarnMaxUnlimited();
            boolean toggle = earnOptionResponseBean.getToggle();
            boolean autoEarnEnabled = earnOptionResponseBean.getAutoEarnEnabled();
            String earnRate = earnOptionResponseBean.getEarnRate();
            LocalizedTextBean localizedTextBeanEZpvd = LocalizedTextBean.Companion.EZpvd(earnOptionResponseBean.getLocalizedText());
            String earnAgreementContext = earnOptionResponseBean.getEarnAgreementContext();
            return new EarnOptionBean(currencyId, productTypeId, productTypeName, savingTypeId, savingTypeName, eligibleAmountMax, eligibleAmountMin, earnMaxUnlimited, toggle, autoEarnEnabled, earnRate, localizedTextBeanEZpvd, earnAgreementContext != null ? earnAgreementContext : "", earnOptionResponseBean.getRewardType());
        }
    }
}
