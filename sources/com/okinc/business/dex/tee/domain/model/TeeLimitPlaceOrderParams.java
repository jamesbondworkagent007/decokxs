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
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class TeeLimitPlaceOrderParams implements Parcelable {
    public static final int $stable = 0;
    private final String accountId;
    private final String chainId;
    private final String estimateGasFee;
    private final String expireTime;
    private final String fromAmount;
    private final String fromTokenAddress;
    private final String fromTokenDecimals;
    private final boolean isCustomExpireTime;
    private final String minimumReceived;
    private final LimitPreset preset;
    private final String referralCode;
    private final String referrerAddress;
    private final Rule rule;
    private final ServiceFeeInfo serviceFeeInfo;
    private final int sourceType;
    private final Integer strategyDirection;
    private final StrategyType strategyType;
    private final String strategyTypeParam;
    private final String teeId;
    private final boolean teeSilentSignEnabled;
    private final String toAmount;
    private final String toTokenAddress;
    private final String toTokenDecimals;
    private final String userWalletAddress;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TeeLimitPlaceOrderParams> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.dex.tee.domain.model.StrategyType", StrategyType.values()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<TeeLimitPlaceOrderParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TeeLimitPlaceOrderParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TeeLimitPlaceOrderParams(parcel.readString(), parcel.readString(), StrategyType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Rule.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LimitPreset.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? ServiceFeeInfo.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TeeLimitPlaceOrderParams[] newArray(int i) {
            return new TeeLimitPlaceOrderParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Rule component10() {
        return this.rule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitPreset component11() {
        return this.preset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.referralCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component14() {
        return this.strategyDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.referrerAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo component17() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.fromTokenDecimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.toTokenDecimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.estimateGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.minimumReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component22() {
        return this.isCustomExpireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.strategyTypeParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component24() {
        return this.teeSilentSignEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyType component3() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeLimitPlaceOrderParams copy(@NotNull String str, @NotNull String str2, @NotNull StrategyType strategyType, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, Rule rule, LimitPreset limitPreset, @NotNull String str9, int i, Integer num, @NotNull String str10, @NotNull String str11, ServiceFeeInfo serviceFeeInfo, @NotNull String str12, @NotNull String str13, String str14, @NotNull String str15, boolean z, @NotNull String str16, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(strategyType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        return new TeeLimitPlaceOrderParams(str, str2, strategyType, str3, str4, str5, str6, str7, str8, rule, limitPreset, str9, i, num, str10, str11, serviceFeeInfo, str12, str13, str14, str15, z, str16, z2);
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
        if (!(obj instanceof TeeLimitPlaceOrderParams)) {
            return false;
        }
        TeeLimitPlaceOrderParams teeLimitPlaceOrderParams = (TeeLimitPlaceOrderParams) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) teeLimitPlaceOrderParams.accountId) && Intrinsics.EZpvd((Object) this.teeId, (Object) teeLimitPlaceOrderParams.teeId) && this.strategyType == teeLimitPlaceOrderParams.strategyType && Intrinsics.EZpvd((Object) this.chainId, (Object) teeLimitPlaceOrderParams.chainId) && Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) teeLimitPlaceOrderParams.fromTokenAddress) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) teeLimitPlaceOrderParams.toTokenAddress) && Intrinsics.EZpvd((Object) this.fromAmount, (Object) teeLimitPlaceOrderParams.fromAmount) && Intrinsics.EZpvd((Object) this.toAmount, (Object) teeLimitPlaceOrderParams.toAmount) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) teeLimitPlaceOrderParams.userWalletAddress) && Intrinsics.EZpvd(this.rule, teeLimitPlaceOrderParams.rule) && Intrinsics.EZpvd(this.preset, teeLimitPlaceOrderParams.preset) && Intrinsics.EZpvd((Object) this.referralCode, (Object) teeLimitPlaceOrderParams.referralCode) && this.sourceType == teeLimitPlaceOrderParams.sourceType && Intrinsics.EZpvd(this.strategyDirection, teeLimitPlaceOrderParams.strategyDirection) && Intrinsics.EZpvd((Object) this.referrerAddress, (Object) teeLimitPlaceOrderParams.referrerAddress) && Intrinsics.EZpvd((Object) this.expireTime, (Object) teeLimitPlaceOrderParams.expireTime) && Intrinsics.EZpvd(this.serviceFeeInfo, teeLimitPlaceOrderParams.serviceFeeInfo) && Intrinsics.EZpvd((Object) this.fromTokenDecimals, (Object) teeLimitPlaceOrderParams.fromTokenDecimals) && Intrinsics.EZpvd((Object) this.toTokenDecimals, (Object) teeLimitPlaceOrderParams.toTokenDecimals) && Intrinsics.EZpvd((Object) this.estimateGasFee, (Object) teeLimitPlaceOrderParams.estimateGasFee) && Intrinsics.EZpvd((Object) this.minimumReceived, (Object) teeLimitPlaceOrderParams.minimumReceived) && this.isCustomExpireTime == teeLimitPlaceOrderParams.isCustomExpireTime && Intrinsics.EZpvd((Object) this.strategyTypeParam, (Object) teeLimitPlaceOrderParams.strategyTypeParam) && this.teeSilentSignEnabled == teeLimitPlaceOrderParams.teeSilentSignEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
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
    public final String getFromAmount() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAddress() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenDecimals() {
        return this.fromTokenDecimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinimumReceived() {
        return this.minimumReceived;
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
    public final StrategyType getStrategyType() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyTypeParam() {
        return this.strategyTypeParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTeeId() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getTeeSilentSignEnabled() {
        return this.teeSilentSignEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAmount() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAddress() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenDecimals() {
        return this.toTokenDecimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.accountId.hashCode();
        int iHashCode2 = this.teeId.hashCode();
        int iHashCode3 = this.strategyType.hashCode();
        int iHashCode4 = this.chainId.hashCode();
        int iHashCode5 = this.fromTokenAddress.hashCode();
        int iHashCode6 = this.toTokenAddress.hashCode();
        int iHashCode7 = this.fromAmount.hashCode();
        int iHashCode8 = this.toAmount.hashCode();
        int iHashCode9 = this.userWalletAddress.hashCode();
        Rule rule = this.rule;
        int iHashCode10 = rule == null ? 0 : rule.hashCode();
        LimitPreset limitPreset = this.preset;
        int iHashCode11 = limitPreset == null ? 0 : limitPreset.hashCode();
        int iHashCode12 = this.referralCode.hashCode();
        int iHashCode13 = Integer.hashCode(this.sourceType);
        Integer num = this.strategyDirection;
        int iHashCode14 = num == null ? 0 : num.hashCode();
        int iHashCode15 = this.referrerAddress.hashCode();
        int iHashCode16 = this.expireTime.hashCode();
        ServiceFeeInfo serviceFeeInfo = this.serviceFeeInfo;
        int iHashCode17 = serviceFeeInfo == null ? 0 : serviceFeeInfo.hashCode();
        int iHashCode18 = this.fromTokenDecimals.hashCode();
        int iHashCode19 = this.toTokenDecimals.hashCode();
        String str = this.estimateGasFee;
        return (((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.minimumReceived.hashCode()) * 31) + Boolean.hashCode(this.isCustomExpireTime)) * 31) + this.strategyTypeParam.hashCode()) * 31) + Boolean.hashCode(this.teeSilentSignEnabled);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCustomExpireTime() {
        return this.isCustomExpireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TeeLimitPlaceOrderParams(accountId=" + this.accountId + ", teeId=" + this.teeId + ", strategyType=" + this.strategyType + ", chainId=" + this.chainId + ", fromTokenAddress=" + this.fromTokenAddress + ", toTokenAddress=" + this.toTokenAddress + ", fromAmount=" + this.fromAmount + ", toAmount=" + this.toAmount + ", userWalletAddress=" + this.userWalletAddress + ", rule=" + this.rule + ", preset=" + this.preset + ", referralCode=" + this.referralCode + ", sourceType=" + this.sourceType + ", strategyDirection=" + this.strategyDirection + ", referrerAddress=" + this.referrerAddress + ", expireTime=" + this.expireTime + ", serviceFeeInfo=" + this.serviceFeeInfo + ", fromTokenDecimals=" + this.fromTokenDecimals + ", toTokenDecimals=" + this.toTokenDecimals + ", estimateGasFee=" + this.estimateGasFee + ", minimumReceived=" + this.minimumReceived + ", isCustomExpireTime=" + this.isCustomExpireTime + ", strategyTypeParam=" + this.strategyTypeParam + ", teeSilentSignEnabled=" + this.teeSilentSignEnabled + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountId);
        parcel.writeString(this.teeId);
        parcel.writeString(this.strategyType.name());
        parcel.writeString(this.chainId);
        parcel.writeString(this.fromTokenAddress);
        parcel.writeString(this.toTokenAddress);
        parcel.writeString(this.fromAmount);
        parcel.writeString(this.toAmount);
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
        ServiceFeeInfo serviceFeeInfo = this.serviceFeeInfo;
        if (serviceFeeInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serviceFeeInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.fromTokenDecimals);
        parcel.writeString(this.toTokenDecimals);
        parcel.writeString(this.estimateGasFee);
        parcel.writeString(this.minimumReceived);
        parcel.writeInt(this.isCustomExpireTime ? 1 : 0);
        parcel.writeString(this.strategyTypeParam);
        parcel.writeInt(this.teeSilentSignEnabled ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.domain.model.TeeLimitPlaceOrderParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TeeLimitPlaceOrderParams> serializer() {
            return TeeLimitPlaceOrderParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TeeLimitPlaceOrderParams(int i, String str, String str2, StrategyType strategyType, String str3, String str4, String str5, String str6, String str7, String str8, Rule rule, LimitPreset limitPreset, String str9, int i2, Integer num, String str10, String str11, ServiceFeeInfo serviceFeeInfo, String str12, String str13, String str14, String str15, boolean z, String str16, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if (8781828 != (i & 8781828)) {
            PluginExceptionsKt.throwMissingFieldException(i, 8781828, TeeLimitPlaceOrderParams$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.accountId = "";
        } else {
            this.accountId = str;
        }
        if ((i & 2) == 0) {
            this.teeId = "";
        } else {
            this.teeId = str2;
        }
        this.strategyType = strategyType;
        if ((i & 8) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str3;
        }
        if ((i & 16) == 0) {
            this.fromTokenAddress = "";
        } else {
            this.fromTokenAddress = str4;
        }
        if ((i & 32) == 0) {
            this.toTokenAddress = "";
        } else {
            this.toTokenAddress = str5;
        }
        if ((i & 64) == 0) {
            this.fromAmount = "";
        } else {
            this.fromAmount = str6;
        }
        if ((i & 128) == 0) {
            this.toAmount = "";
        } else {
            this.toAmount = str7;
        }
        if ((i & 256) == 0) {
            this.userWalletAddress = "";
        } else {
            this.userWalletAddress = str8;
        }
        if ((i & 512) == 0) {
            this.rule = null;
        } else {
            this.rule = rule;
        }
        if ((i & 1024) == 0) {
            this.preset = null;
        } else {
            this.preset = limitPreset;
        }
        if ((i & 2048) == 0) {
            this.referralCode = "";
        } else {
            this.referralCode = str9;
        }
        if ((i & 4096) == 0) {
            this.sourceType = 0;
        } else {
            this.sourceType = i2;
        }
        if ((i & 8192) == 0) {
            this.strategyDirection = null;
        } else {
            this.strategyDirection = num;
        }
        if ((i & 16384) == 0) {
            this.referrerAddress = "";
        } else {
            this.referrerAddress = str10;
        }
        if ((32768 & i) == 0) {
            this.expireTime = "";
        } else {
            this.expireTime = str11;
        }
        if ((65536 & i) == 0) {
            this.serviceFeeInfo = null;
        } else {
            this.serviceFeeInfo = serviceFeeInfo;
        }
        this.fromTokenDecimals = str12;
        this.toTokenDecimals = str13;
        if ((524288 & i) == 0) {
            this.estimateGasFee = null;
        } else {
            this.estimateGasFee = str14;
        }
        if ((1048576 & i) == 0) {
            this.minimumReceived = "";
        } else {
            this.minimumReceived = str15;
        }
        if ((2097152 & i) == 0) {
            this.isCustomExpireTime = false;
        } else {
            this.isCustomExpireTime = z;
        }
        if ((i & 4194304) == 0) {
            this.strategyTypeParam = "";
        } else {
            this.strategyTypeParam = str16;
        }
        this.teeSilentSignEnabled = z2;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TeeLimitPlaceOrderParams teeLimitPlaceOrderParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) teeLimitPlaceOrderParams.accountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, teeLimitPlaceOrderParams.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) teeLimitPlaceOrderParams.teeId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, teeLimitPlaceOrderParams.teeId);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], teeLimitPlaceOrderParams.strategyType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) teeLimitPlaceOrderParams.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, teeLimitPlaceOrderParams.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) teeLimitPlaceOrderParams.fromTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, teeLimitPlaceOrderParams.fromTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) teeLimitPlaceOrderParams.toTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, teeLimitPlaceOrderParams.toTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) teeLimitPlaceOrderParams.fromAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, teeLimitPlaceOrderParams.fromAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) teeLimitPlaceOrderParams.toAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, teeLimitPlaceOrderParams.toAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) teeLimitPlaceOrderParams.userWalletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, teeLimitPlaceOrderParams.userWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || teeLimitPlaceOrderParams.rule != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, Rule$$serializer.INSTANCE, teeLimitPlaceOrderParams.rule);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || teeLimitPlaceOrderParams.preset != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, LimitPreset$$serializer.INSTANCE, teeLimitPlaceOrderParams.preset);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) teeLimitPlaceOrderParams.referralCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, teeLimitPlaceOrderParams.referralCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || teeLimitPlaceOrderParams.sourceType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 12, teeLimitPlaceOrderParams.sourceType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || teeLimitPlaceOrderParams.strategyDirection != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, teeLimitPlaceOrderParams.strategyDirection);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) teeLimitPlaceOrderParams.referrerAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, teeLimitPlaceOrderParams.referrerAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) teeLimitPlaceOrderParams.expireTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, teeLimitPlaceOrderParams.expireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || teeLimitPlaceOrderParams.serviceFeeInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, ServiceFeeInfo$$serializer.INSTANCE, teeLimitPlaceOrderParams.serviceFeeInfo);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 17, teeLimitPlaceOrderParams.fromTokenDecimals);
        compositeEncoder.encodeStringElement(serialDescriptor, 18, teeLimitPlaceOrderParams.toTokenDecimals);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || teeLimitPlaceOrderParams.estimateGasFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, teeLimitPlaceOrderParams.estimateGasFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) teeLimitPlaceOrderParams.minimumReceived, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, teeLimitPlaceOrderParams.minimumReceived);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || teeLimitPlaceOrderParams.isCustomExpireTime) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 21, teeLimitPlaceOrderParams.isCustomExpireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) teeLimitPlaceOrderParams.strategyTypeParam, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, teeLimitPlaceOrderParams.strategyTypeParam);
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 23, teeLimitPlaceOrderParams.teeSilentSignEnabled);
    }

    public TeeLimitPlaceOrderParams(@NotNull String str, @NotNull String str2, @NotNull StrategyType strategyType, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, Rule rule, LimitPreset limitPreset, @NotNull String str9, int i, Integer num, @NotNull String str10, @NotNull String str11, ServiceFeeInfo serviceFeeInfo, @NotNull String str12, @NotNull String str13, String str14, @NotNull String str15, boolean z, @NotNull String str16, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(strategyType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        this.accountId = str;
        this.teeId = str2;
        this.strategyType = strategyType;
        this.chainId = str3;
        this.fromTokenAddress = str4;
        this.toTokenAddress = str5;
        this.fromAmount = str6;
        this.toAmount = str7;
        this.userWalletAddress = str8;
        this.rule = rule;
        this.preset = limitPreset;
        this.referralCode = str9;
        this.sourceType = i;
        this.strategyDirection = num;
        this.referrerAddress = str10;
        this.expireTime = str11;
        this.serviceFeeInfo = serviceFeeInfo;
        this.fromTokenDecimals = str12;
        this.toTokenDecimals = str13;
        this.estimateGasFee = str14;
        this.minimumReceived = str15;
        this.isCustomExpireTime = z;
        this.strategyTypeParam = str16;
        this.teeSilentSignEnabled = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c0: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r53v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r53v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (r31v0 com.okinc.business.dex.tee.domain.model.StrategyType)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r53v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r53v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r53v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r53v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r53v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r53v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:com.okinc.business.dex.tee.domain.model.Rule:?: TERNARY null = ((wrap:int:0x0044: ARITH (r53v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.tee.domain.model.Rule) : (r38v0 com.okinc.business.dex.tee.domain.model.Rule))
  (wrap:com.okinc.business.dex.tee.domain.model.LimitPreset:?: TERNARY null = ((wrap:int:0x004d: ARITH (r53v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.tee.domain.model.LimitPreset) : (r39v0 com.okinc.business.dex.tee.domain.model.LimitPreset))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r53v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x005d: ARITH (r53v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r41v0 int))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0067: ARITH (r53v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r42v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0070: ARITH (r53v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007c: ARITH (32768 int) & (r53v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.ServiceFeeInfo:?: TERNARY null = ((wrap:int:0x0086: ARITH (65536 int) & (r53v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.ServiceFeeInfo) : (r45v0 com.okinc.business.dexlogic.bean.ServiceFeeInfo))
  (r46v0 java.lang.String)
  (r47v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0090: ARITH (524288 int) & (r53v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009a: ARITH (1048576 int) & (r53v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00a4: ARITH (2097152 int) & (r53v0 int) A[WRAPPED]) != (0 int)) ? false : (r50v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r53v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (r52v0 boolean)
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.dex.tee.domain.model.StrategyType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.tee.domain.model.Rule, com.okinc.business.dex.tee.domain.model.LimitPreset, java.lang.String, int, java.lang.Integer, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.ServiceFeeInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean):void (m)] (LINE:77) call: com.okinc.business.dex.tee.domain.model.TeeLimitPlaceOrderParams.<init>(java.lang.String, java.lang.String, com.okinc.business.dex.tee.domain.model.StrategyType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.tee.domain.model.Rule, com.okinc.business.dex.tee.domain.model.LimitPreset, java.lang.String, int, java.lang.Integer, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.ServiceFeeInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ TeeLimitPlaceOrderParams(String str, String str2, StrategyType strategyType, String str3, String str4, String str5, String str6, String str7, String str8, Rule rule, LimitPreset limitPreset, String str9, int i, Integer num, String str10, String str11, ServiceFeeInfo serviceFeeInfo, String str12, String str13, String str14, String str15, boolean z, String str16, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, strategyType, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? "" : str7, (i2 & 256) != 0 ? "" : str8, (i2 & 512) != 0 ? null : rule, (i2 & 1024) != 0 ? null : limitPreset, (i2 & 2048) != 0 ? "" : str9, (i2 & 4096) != 0 ? 0 : i, (i2 & 8192) != 0 ? null : num, (i2 & 16384) != 0 ? "" : str10, (32768 & i2) != 0 ? "" : str11, (65536 & i2) != 0 ? null : serviceFeeInfo, str12, str13, (524288 & i2) != 0 ? null : str14, (1048576 & i2) != 0 ? "" : str15, (2097152 & i2) != 0 ? false : z, (i2 & 4194304) != 0 ? "" : str16, z2);
    }

    public final String getRefCode() {
        ServiceFeeInfo serviceFeeInfo = this.serviceFeeInfo;
        String refCode = serviceFeeInfo != null ? serviceFeeInfo.getRefCode() : null;
        return refCode == null ? "" : refCode;
    }

    public final String getRefAddress() {
        ServiceFeeInfo serviceFeeInfo = this.serviceFeeInfo;
        String referralCommissionAddress = serviceFeeInfo != null ? serviceFeeInfo.getReferralCommissionAddress() : null;
        return referralCommissionAddress == null ? "" : referralCommissionAddress;
    }
}
