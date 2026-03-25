package com.okinc.crcore.coreapi.net.responsebean.bsc;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class EarnOptionResponseBean implements Parcelable {
    public static final int $stable = 0;
    private final boolean autoEarnEnabled;
    private final Long currencyId;
    private final String earnAgreementContext;
    private final boolean earnMaxUnlimited;
    private final String earnRate;
    private final double eligibleAmountMax;
    private final double eligibleAmountMin;
    private final LocalizedTextResponseBean localizedText;
    private final Long productTypeId;
    private final String productTypeName;
    private final Integer rewardType;
    private final Long savingTypeId;
    private final String savingTypeName;
    private final boolean toggle;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EarnOptionResponseBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EarnOptionResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarnOptionResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EarnOptionResponseBean(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), LocalizedTextResponseBean.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarnOptionResponseBean[] newArray(int i) {
            return new EarnOptionResponseBean[i];
        }
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
    public final LocalizedTextResponseBean component12() {
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
    public final EarnOptionResponseBean copy(Long l, Long l2, @NotNull String str, Long l3, @NotNull String str2, double d, double d2, boolean z, boolean z2, boolean z3, @NotNull String str3, @NotNull LocalizedTextResponseBean localizedTextResponseBean, String str4, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(localizedTextResponseBean, "");
        return new EarnOptionResponseBean(l, l2, str, l3, str2, d, d2, z, z2, z3, str3, localizedTextResponseBean, str4, num);
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
        if (!(obj instanceof EarnOptionResponseBean)) {
            return false;
        }
        EarnOptionResponseBean earnOptionResponseBean = (EarnOptionResponseBean) obj;
        return Intrinsics.EZpvd(this.currencyId, earnOptionResponseBean.currencyId) && Intrinsics.EZpvd(this.productTypeId, earnOptionResponseBean.productTypeId) && Intrinsics.EZpvd((Object) this.productTypeName, (Object) earnOptionResponseBean.productTypeName) && Intrinsics.EZpvd(this.savingTypeId, earnOptionResponseBean.savingTypeId) && Intrinsics.EZpvd((Object) this.savingTypeName, (Object) earnOptionResponseBean.savingTypeName) && Double.compare(this.eligibleAmountMax, earnOptionResponseBean.eligibleAmountMax) == 0 && Double.compare(this.eligibleAmountMin, earnOptionResponseBean.eligibleAmountMin) == 0 && this.earnMaxUnlimited == earnOptionResponseBean.earnMaxUnlimited && this.toggle == earnOptionResponseBean.toggle && this.autoEarnEnabled == earnOptionResponseBean.autoEarnEnabled && Intrinsics.EZpvd((Object) this.earnRate, (Object) earnOptionResponseBean.earnRate) && Intrinsics.EZpvd(this.localizedText, earnOptionResponseBean.localizedText) && Intrinsics.EZpvd((Object) this.earnAgreementContext, (Object) earnOptionResponseBean.earnAgreementContext) && Intrinsics.EZpvd(this.rewardType, earnOptionResponseBean.rewardType);
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
    public final LocalizedTextResponseBean getLocalizedText() {
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
        String str = this.earnAgreementContext;
        int iHashCode13 = str == null ? 0 : str.hashCode();
        Integer num = this.rewardType;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EarnOptionResponseBean(currencyId=" + this.currencyId + ", productTypeId=" + this.productTypeId + ", productTypeName=" + this.productTypeName + ", savingTypeId=" + this.savingTypeId + ", savingTypeName=" + this.savingTypeName + ", eligibleAmountMax=" + this.eligibleAmountMax + ", eligibleAmountMin=" + this.eligibleAmountMin + ", earnMaxUnlimited=" + this.earnMaxUnlimited + ", toggle=" + this.toggle + ", autoEarnEnabled=" + this.autoEarnEnabled + ", earnRate=" + this.earnRate + ", localizedText=" + this.localizedText + ", earnAgreementContext=" + this.earnAgreementContext + ", rewardType=" + this.rewardType + ")";
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

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.EarnOptionResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EarnOptionResponseBean> serializer() {
            return EarnOptionResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EarnOptionResponseBean(int i, Long l, Long l2, String str, Long l3, String str2, double d, double d2, boolean z, boolean z2, boolean z3, String str3, LocalizedTextResponseBean localizedTextResponseBean, String str4, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (4107 != (i & 4107)) {
            PluginExceptionsKt.throwMissingFieldException(i, 4107, EarnOptionResponseBean$$serializer.INSTANCE.getDescriptor());
        }
        this.currencyId = l;
        this.productTypeId = l2;
        if ((i & 4) == 0) {
            this.productTypeName = "";
        } else {
            this.productTypeName = str;
        }
        this.savingTypeId = l3;
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
        this.localizedText = (i & 2048) == 0 ? new LocalizedTextResponseBean(false, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null) : localizedTextResponseBean;
        this.earnAgreementContext = str4;
        this.rewardType = (i & 8192) == 0 ? null : num;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(EarnOptionResponseBean earnOptionResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, longSerializer, earnOptionResponseBean.currencyId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, longSerializer, earnOptionResponseBean.productTypeId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) earnOptionResponseBean.productTypeName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, earnOptionResponseBean.productTypeName);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, longSerializer, earnOptionResponseBean.savingTypeId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) earnOptionResponseBean.savingTypeName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, earnOptionResponseBean.savingTypeName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || Double.compare(earnOptionResponseBean.eligibleAmountMax, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 5, earnOptionResponseBean.eligibleAmountMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || Double.compare(earnOptionResponseBean.eligibleAmountMin, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 6, earnOptionResponseBean.eligibleAmountMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || earnOptionResponseBean.earnMaxUnlimited) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, earnOptionResponseBean.earnMaxUnlimited);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || earnOptionResponseBean.toggle) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 8, earnOptionResponseBean.toggle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || earnOptionResponseBean.autoEarnEnabled) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, earnOptionResponseBean.autoEarnEnabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) earnOptionResponseBean.earnRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, earnOptionResponseBean.earnRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(earnOptionResponseBean.localizedText, new LocalizedTextResponseBean(false, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, LocalizedTextResponseBean$$serializer.INSTANCE, earnOptionResponseBean.localizedText);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, earnOptionResponseBean.earnAgreementContext);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && earnOptionResponseBean.rewardType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, earnOptionResponseBean.rewardType);
    }

    public EarnOptionResponseBean(Long l, Long l2, @NotNull String str, Long l3, @NotNull String str2, double d, double d2, boolean z, boolean z2, boolean z3, @NotNull String str3, @NotNull LocalizedTextResponseBean localizedTextResponseBean, String str4, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(localizedTextResponseBean, "");
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
        this.localizedText = localizedTextResponseBean;
        this.earnAgreementContext = str4;
        this.rewardType = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0087: CONSTRUCTOR 
  (r21v0 java.lang.Long)
  (r22v0 java.lang.Long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r37v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (r24v0 java.lang.Long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r37v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:double:?: TERNARY null = ((wrap:int:0x0014: ARITH (r37v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0.0d double) : (r26v0 double))
  (wrap:double:?: TERNARY null = ((wrap:int:0x001e: ARITH (r37v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0.0d double) : (r28v0 double))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (r37v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r30v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002f: ARITH (r37v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r31v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0037: ARITH (r37v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r32v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r37v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.bsc.LocalizedTextResponseBean:?: TERNARY null = ((wrap:int:0x0048: ARITH (r37v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006e: CONSTRUCTOR 
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (63 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:23) call: com.okinc.crcore.coreapi.net.responsebean.bsc.LocalizedTextResponseBean.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r34v0 com.okinc.crcore.coreapi.net.responsebean.bsc.LocalizedTextResponseBean))
  (r35v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0073: ARITH (r37v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r36v0 java.lang.Integer))
 A[MD:(java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, double, double, boolean, boolean, boolean, java.lang.String, com.okinc.crcore.coreapi.net.responsebean.bsc.LocalizedTextResponseBean, java.lang.String, java.lang.Integer):void (m)] (LINE:11) call: com.okinc.crcore.coreapi.net.responsebean.bsc.EarnOptionResponseBean.<init>(java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, double, double, boolean, boolean, boolean, java.lang.String, com.okinc.crcore.coreapi.net.responsebean.bsc.LocalizedTextResponseBean, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ EarnOptionResponseBean(Long l, Long l2, String str, Long l3, String str2, double d, double d2, boolean z, boolean z2, boolean z3, String str3, LocalizedTextResponseBean localizedTextResponseBean, String str4, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, l2, (i & 4) != 0 ? "" : str, l3, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? 0.0d : d, (i & 64) != 0 ? 0.0d : d2, (i & 128) != 0 ? false : z, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? false : z3, (i & 1024) != 0 ? "" : str3, (i & 2048) != 0 ? new LocalizedTextResponseBean(false, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null) : localizedTextResponseBean, str4, (i & 8192) != 0 ? null : num);
    }
}
