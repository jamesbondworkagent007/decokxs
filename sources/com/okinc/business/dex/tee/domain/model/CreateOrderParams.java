package com.okinc.business.dex.tee.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CreateOrderParams implements Parcelable {
    public static final int $stable = 0;
    private final String chainId;
    private final String estimateGasFee;
    private final String expireTime;
    private final LimitPreset preset;
    private final String referralCode;
    private final String referrerAddress;
    private final Rule rule;
    private final ServiceFeeInfo serviceFeeInfo;
    private final int sourceType;
    private final Integer strategyDirection;
    private final String strategyType;
    private final boolean teeSilentSignEnabled;
    private final String userWalletAddress;
    private final VerifySignInfo verifySignInfo;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CreateOrderParams> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CreateOrderParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateOrderParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CreateOrderParams(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Rule.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LimitPreset.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : VerifySignInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? ServiceFeeInfo.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateOrderParams[] newArray(int i) {
            return new CreateOrderParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo component12() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.estimateGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.teeSilentSignEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Rule component3() {
        return this.rule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitPreset component4() {
        return this.preset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VerifySignInfo component5() {
        return this.verifySignInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.referralCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.strategyDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.referrerAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreateOrderParams copy(@NotNull String str, @NotNull String str2, Rule rule, LimitPreset limitPreset, VerifySignInfo verifySignInfo, @NotNull String str3, int i, Integer num, @NotNull String str4, @NotNull String str5, @NotNull String str6, ServiceFeeInfo serviceFeeInfo, String str7, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new CreateOrderParams(str, str2, rule, limitPreset, verifySignInfo, str3, i, num, str4, str5, str6, serviceFeeInfo, str7, z);
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
        if (!(obj instanceof CreateOrderParams)) {
            return false;
        }
        CreateOrderParams createOrderParams = (CreateOrderParams) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) createOrderParams.chainId) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) createOrderParams.userWalletAddress) && Intrinsics.EZpvd(this.rule, createOrderParams.rule) && Intrinsics.EZpvd(this.preset, createOrderParams.preset) && Intrinsics.EZpvd(this.verifySignInfo, createOrderParams.verifySignInfo) && Intrinsics.EZpvd((Object) this.referralCode, (Object) createOrderParams.referralCode) && this.sourceType == createOrderParams.sourceType && Intrinsics.EZpvd(this.strategyDirection, createOrderParams.strategyDirection) && Intrinsics.EZpvd((Object) this.referrerAddress, (Object) createOrderParams.referrerAddress) && Intrinsics.EZpvd((Object) this.expireTime, (Object) createOrderParams.expireTime) && Intrinsics.EZpvd((Object) this.strategyType, (Object) createOrderParams.strategyType) && Intrinsics.EZpvd(this.serviceFeeInfo, createOrderParams.serviceFeeInfo) && Intrinsics.EZpvd((Object) this.estimateGasFee, (Object) createOrderParams.estimateGasFee) && this.teeSilentSignEnabled == createOrderParams.teeSilentSignEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateGasFee() {
        return this.estimateGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpireTime() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitPreset getPreset() {
        return this.preset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReferralCode() {
        return this.referralCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReferrerAddress() {
        return this.referrerAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Rule getRule() {
        return this.rule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo getServiceFeeInfo() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSourceType() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getStrategyDirection() {
        return this.strategyDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyType() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getTeeSilentSignEnabled() {
        return this.teeSilentSignEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VerifySignInfo getVerifySignInfo() {
        return this.verifySignInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainId.hashCode();
        int iHashCode2 = this.userWalletAddress.hashCode();
        Rule rule = this.rule;
        int iHashCode3 = rule == null ? 0 : rule.hashCode();
        LimitPreset limitPreset = this.preset;
        int iHashCode4 = limitPreset == null ? 0 : limitPreset.hashCode();
        VerifySignInfo verifySignInfo = this.verifySignInfo;
        int iHashCode5 = verifySignInfo == null ? 0 : verifySignInfo.hashCode();
        int iHashCode6 = this.referralCode.hashCode();
        int iHashCode7 = Integer.hashCode(this.sourceType);
        Integer num = this.strategyDirection;
        int iHashCode8 = num == null ? 0 : num.hashCode();
        int iHashCode9 = this.referrerAddress.hashCode();
        int iHashCode10 = this.expireTime.hashCode();
        int iHashCode11 = this.strategyType.hashCode();
        ServiceFeeInfo serviceFeeInfo = this.serviceFeeInfo;
        int iHashCode12 = serviceFeeInfo == null ? 0 : serviceFeeInfo.hashCode();
        String str = this.estimateGasFee;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.teeSilentSignEnabled);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreateOrderParams(chainId=" + this.chainId + ", userWalletAddress=" + this.userWalletAddress + ", rule=" + this.rule + ", preset=" + this.preset + ", verifySignInfo=" + this.verifySignInfo + ", referralCode=" + this.referralCode + ", sourceType=" + this.sourceType + ", strategyDirection=" + this.strategyDirection + ", referrerAddress=" + this.referrerAddress + ", expireTime=" + this.expireTime + ", strategyType=" + this.strategyType + ", serviceFeeInfo=" + this.serviceFeeInfo + ", estimateGasFee=" + this.estimateGasFee + ", teeSilentSignEnabled=" + this.teeSilentSignEnabled + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainId);
        parcel.writeString(this.userWalletAddress);
        Rule rule = this.rule;
        if (rule == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rule.writeToParcel(parcel, i);
        }
        LimitPreset limitPreset = this.preset;
        if (limitPreset == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            limitPreset.writeToParcel(parcel, i);
        }
        VerifySignInfo verifySignInfo = this.verifySignInfo;
        if (verifySignInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            verifySignInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.referralCode);
        parcel.writeInt(this.sourceType);
        Integer num = this.strategyDirection;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.referrerAddress);
        parcel.writeString(this.expireTime);
        parcel.writeString(this.strategyType);
        ServiceFeeInfo serviceFeeInfo = this.serviceFeeInfo;
        if (serviceFeeInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serviceFeeInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.estimateGasFee);
        parcel.writeInt(this.teeSilentSignEnabled ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.domain.model.CreateOrderParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreateOrderParams> serializer() {
            return CreateOrderParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreateOrderParams(int i, String str, String str2, Rule rule, LimitPreset limitPreset, VerifySignInfo verifySignInfo, String str3, int i2, Integer num, String str4, String str5, String str6, ServiceFeeInfo serviceFeeInfo, String str7, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (64 != (i & 64)) {
            PluginExceptionsKt.throwMissingFieldException(i, 64, CreateOrderParams$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.userWalletAddress = "";
        } else {
            this.userWalletAddress = str2;
        }
        if ((i & 4) == 0) {
            this.rule = null;
        } else {
            this.rule = rule;
        }
        if ((i & 8) == 0) {
            this.preset = null;
        } else {
            this.preset = limitPreset;
        }
        if ((i & 16) == 0) {
            this.verifySignInfo = null;
        } else {
            this.verifySignInfo = verifySignInfo;
        }
        if ((i & 32) == 0) {
            this.referralCode = "";
        } else {
            this.referralCode = str3;
        }
        this.sourceType = i2;
        if ((i & 128) == 0) {
            this.strategyDirection = null;
        } else {
            this.strategyDirection = num;
        }
        if ((i & 256) == 0) {
            this.referrerAddress = "";
        } else {
            this.referrerAddress = str4;
        }
        if ((i & 512) == 0) {
            this.expireTime = "";
        } else {
            this.expireTime = str5;
        }
        if ((i & 1024) == 0) {
            this.strategyType = "";
        } else {
            this.strategyType = str6;
        }
        if ((i & 2048) == 0) {
            this.serviceFeeInfo = null;
        } else {
            this.serviceFeeInfo = serviceFeeInfo;
        }
        if ((i & 4096) == 0) {
            this.estimateGasFee = null;
        } else {
            this.estimateGasFee = str7;
        }
        this.teeSilentSignEnabled = (i & 8192) == 0 ? false : z;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CreateOrderParams createOrderParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) createOrderParams.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, createOrderParams.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) createOrderParams.userWalletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, createOrderParams.userWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || createOrderParams.rule != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, Rule$$serializer.INSTANCE, createOrderParams.rule);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || createOrderParams.preset != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LimitPreset$$serializer.INSTANCE, createOrderParams.preset);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || createOrderParams.verifySignInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, VerifySignInfo$$serializer.INSTANCE, createOrderParams.verifySignInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) createOrderParams.referralCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, createOrderParams.referralCode);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 6, createOrderParams.sourceType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || createOrderParams.strategyDirection != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, createOrderParams.strategyDirection);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) createOrderParams.referrerAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, createOrderParams.referrerAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) createOrderParams.expireTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, createOrderParams.expireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) createOrderParams.strategyType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, createOrderParams.strategyType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || createOrderParams.serviceFeeInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, ServiceFeeInfo$$serializer.INSTANCE, createOrderParams.serviceFeeInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || createOrderParams.estimateGasFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, createOrderParams.estimateGasFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || createOrderParams.teeSilentSignEnabled) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 13, createOrderParams.teeSilentSignEnabled);
        }
    }

    public CreateOrderParams(@NotNull String str, @NotNull String str2, Rule rule, LimitPreset limitPreset, VerifySignInfo verifySignInfo, @NotNull String str3, int i, Integer num, @NotNull String str4, @NotNull String str5, @NotNull String str6, ServiceFeeInfo serviceFeeInfo, String str7, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.chainId = str;
        this.userWalletAddress = str2;
        this.rule = rule;
        this.preset = limitPreset;
        this.verifySignInfo = verifySignInfo;
        this.referralCode = str3;
        this.sourceType = i;
        this.strategyDirection = num;
        this.referrerAddress = str4;
        this.expireTime = str5;
        this.strategyType = str6;
        this.serviceFeeInfo = serviceFeeInfo;
        this.estimateGasFee = str7;
        this.teeSilentSignEnabled = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0074: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r33v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r33v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:com.okinc.business.dex.tee.domain.model.Rule:?: TERNARY null = ((wrap:int:0x0014: ARITH (r33v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.tee.domain.model.Rule) : (r21v0 com.okinc.business.dex.tee.domain.model.Rule))
  (wrap:com.okinc.business.dex.tee.domain.model.LimitPreset:?: TERNARY null = ((wrap:int:0x001d: ARITH (r33v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.tee.domain.model.LimitPreset) : (r22v0 com.okinc.business.dex.tee.domain.model.LimitPreset))
  (wrap:com.okinc.business.dex.tee.domain.model.VerifySignInfo:?: TERNARY null = ((wrap:int:0x0025: ARITH (r33v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.tee.domain.model.VerifySignInfo) : (r23v0 com.okinc.business.dex.tee.domain.model.VerifySignInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r33v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (r25v0 int)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0035: ARITH (r33v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r26v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r33v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r33v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r33v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.ServiceFeeInfo:?: TERNARY null = ((wrap:int:0x0055: ARITH (r33v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.ServiceFeeInfo) : (r30v0 com.okinc.business.dexlogic.bean.ServiceFeeInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r33v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0066: ARITH (r33v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r32v0 boolean))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.dex.tee.domain.model.Rule, com.okinc.business.dex.tee.domain.model.LimitPreset, com.okinc.business.dex.tee.domain.model.VerifySignInfo, java.lang.String, int, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.ServiceFeeInfo, java.lang.String, boolean):void (m)] (LINE:15) call: com.okinc.business.dex.tee.domain.model.CreateOrderParams.<init>(java.lang.String, java.lang.String, com.okinc.business.dex.tee.domain.model.Rule, com.okinc.business.dex.tee.domain.model.LimitPreset, com.okinc.business.dex.tee.domain.model.VerifySignInfo, java.lang.String, int, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.ServiceFeeInfo, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ CreateOrderParams(String str, String str2, Rule rule, LimitPreset limitPreset, VerifySignInfo verifySignInfo, String str3, int i, Integer num, String str4, String str5, String str6, ServiceFeeInfo serviceFeeInfo, String str7, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? null : rule, (i2 & 8) != 0 ? null : limitPreset, (i2 & 16) != 0 ? null : verifySignInfo, (i2 & 32) != 0 ? "" : str3, i, (i2 & 128) != 0 ? null : num, (i2 & 256) != 0 ? "" : str4, (i2 & 512) != 0 ? "" : str5, (i2 & 1024) != 0 ? "" : str6, (i2 & 2048) != 0 ? null : serviceFeeInfo, (i2 & 4096) != 0 ? null : str7, (i2 & 8192) != 0 ? false : z);
    }
}
