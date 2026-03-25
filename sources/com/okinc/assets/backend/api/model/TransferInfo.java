package com.okinc.assets.backend.api.model;

import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class TransferInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Integer acctLv;
    private final Boolean autoEarnEnabled;
    private final Boolean autoEarnSupported;
    private final String borrowLimitReason;
    private final String c2cHoldAmount;
    private final Boolean cedefiAccountExist;
    private final String hold;
    private final String inUse;
    private final Boolean isBorrow;
    private final boolean isTimeCurrency;
    private final Integer kycLevel;
    private final double limit;
    private final String max;
    private final String maxWdEx;
    private final double min;
    private final boolean pm3Whitelisted;
    private final String portfolioSpotRiskOffset;
    private final String spotInUseAmt;
    private final String spotOffsetMaxWd;
    private final String spotOffsetMaxWdEx;
    private final double used;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.hold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.isBorrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.spotOffsetMaxWd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.spotOffsetMaxWdEx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.portfolioSpotRiskOffset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.inUse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.spotInUseAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component16() {
        return this.pm3Whitelisted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component17() {
        return this.acctLv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component18() {
        return this.autoEarnEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component19() {
        return this.autoEarnSupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isTimeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component20() {
        return this.cedefiAccountExist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.borrowLimitReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.kycLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component4() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.max;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component6() {
        return this.min;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component7() {
        return this.used;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.c2cHoldAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.maxWdEx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransferInfo copy(String str, boolean z, Integer num, double d, @NotNull String str2, double d2, double d3, @NotNull String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, String str9, boolean z2, Integer num2, Boolean bool2, Boolean bool3, Boolean bool4, String str10) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new TransferInfo(str, z, num, d, str2, d2, d3, str3, str4, bool, str5, str6, str7, str8, str9, z2, num2, bool2, bool3, bool4, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferInfo)) {
            return false;
        }
        TransferInfo transferInfo = (TransferInfo) obj;
        return Intrinsics.EZpvd((Object) this.hold, (Object) transferInfo.hold) && this.isTimeCurrency == transferInfo.isTimeCurrency && Intrinsics.EZpvd(this.kycLevel, transferInfo.kycLevel) && Double.compare(this.limit, transferInfo.limit) == 0 && Intrinsics.EZpvd((Object) this.max, (Object) transferInfo.max) && Double.compare(this.min, transferInfo.min) == 0 && Double.compare(this.used, transferInfo.used) == 0 && Intrinsics.EZpvd((Object) this.c2cHoldAmount, (Object) transferInfo.c2cHoldAmount) && Intrinsics.EZpvd((Object) this.maxWdEx, (Object) transferInfo.maxWdEx) && Intrinsics.EZpvd(this.isBorrow, transferInfo.isBorrow) && Intrinsics.EZpvd((Object) this.spotOffsetMaxWd, (Object) transferInfo.spotOffsetMaxWd) && Intrinsics.EZpvd((Object) this.spotOffsetMaxWdEx, (Object) transferInfo.spotOffsetMaxWdEx) && Intrinsics.EZpvd((Object) this.portfolioSpotRiskOffset, (Object) transferInfo.portfolioSpotRiskOffset) && Intrinsics.EZpvd((Object) this.inUse, (Object) transferInfo.inUse) && Intrinsics.EZpvd((Object) this.spotInUseAmt, (Object) transferInfo.spotInUseAmt) && this.pm3Whitelisted == transferInfo.pm3Whitelisted && Intrinsics.EZpvd(this.acctLv, transferInfo.acctLv) && Intrinsics.EZpvd(this.autoEarnEnabled, transferInfo.autoEarnEnabled) && Intrinsics.EZpvd(this.autoEarnSupported, transferInfo.autoEarnSupported) && Intrinsics.EZpvd(this.cedefiAccountExist, transferInfo.cedefiAccountExist) && Intrinsics.EZpvd((Object) this.borrowLimitReason, (Object) transferInfo.borrowLimitReason);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAcctLv() {
        return this.acctLv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAutoEarnEnabled() {
        return this.autoEarnEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAutoEarnSupported() {
        return this.autoEarnSupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBorrowLimitReason() {
        return this.borrowLimitReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getC2cHoldAmount() {
        return this.c2cHoldAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCedefiAccountExist() {
        return this.cedefiAccountExist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHold() {
        return this.hold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInUse() {
        return this.inUse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getKycLevel() {
        return this.kycLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getLimit() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMax() {
        return this.max;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxWdEx() {
        return this.maxWdEx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getMin() {
        return this.min;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getPm3Whitelisted() {
        return this.pm3Whitelisted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPortfolioSpotRiskOffset() {
        return this.portfolioSpotRiskOffset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotInUseAmt() {
        return this.spotInUseAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotOffsetMaxWd() {
        return this.spotOffsetMaxWd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotOffsetMaxWdEx() {
        return this.spotOffsetMaxWdEx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getUsed() {
        return this.used;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.hold;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = Boolean.hashCode(this.isTimeCurrency);
        Integer num = this.kycLevel;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        int iHashCode4 = Double.hashCode(this.limit);
        int iHashCode5 = this.max.hashCode();
        int iHashCode6 = Double.hashCode(this.min);
        int iHashCode7 = Double.hashCode(this.used);
        int iHashCode8 = this.c2cHoldAmount.hashCode();
        String str2 = this.maxWdEx;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.isBorrow;
        int iHashCode10 = bool == null ? 0 : bool.hashCode();
        String str3 = this.spotOffsetMaxWd;
        int iHashCode11 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.spotOffsetMaxWdEx;
        int iHashCode12 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.portfolioSpotRiskOffset;
        int iHashCode13 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.inUse;
        int iHashCode14 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.spotInUseAmt;
        int iHashCode15 = str7 == null ? 0 : str7.hashCode();
        int iHashCode16 = Boolean.hashCode(this.pm3Whitelisted);
        Integer num2 = this.acctLv;
        int iHashCode17 = num2 == null ? 0 : num2.hashCode();
        Boolean bool2 = this.autoEarnEnabled;
        int iHashCode18 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.autoEarnSupported;
        int iHashCode19 = bool3 == null ? 0 : bool3.hashCode();
        Boolean bool4 = this.cedefiAccountExist;
        int iHashCode20 = bool4 == null ? 0 : bool4.hashCode();
        String str8 = this.borrowLimitReason;
        return (((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + (str8 == null ? 0 : str8.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isBorrow() {
        return this.isBorrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isTimeCurrency() {
        return this.isTimeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransferInfo(hold=" + this.hold + ", isTimeCurrency=" + this.isTimeCurrency + ", kycLevel=" + this.kycLevel + ", limit=" + this.limit + ", max=" + this.max + ", min=" + this.min + ", used=" + this.used + ", c2cHoldAmount=" + this.c2cHoldAmount + ", maxWdEx=" + this.maxWdEx + ", isBorrow=" + this.isBorrow + ", spotOffsetMaxWd=" + this.spotOffsetMaxWd + ", spotOffsetMaxWdEx=" + this.spotOffsetMaxWdEx + ", portfolioSpotRiskOffset=" + this.portfolioSpotRiskOffset + ", inUse=" + this.inUse + ", spotInUseAmt=" + this.spotInUseAmt + ", pm3Whitelisted=" + this.pm3Whitelisted + ", acctLv=" + this.acctLv + ", autoEarnEnabled=" + this.autoEarnEnabled + ", autoEarnSupported=" + this.autoEarnSupported + ", cedefiAccountExist=" + this.cedefiAccountExist + ", borrowLimitReason=" + this.borrowLimitReason + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.TransferInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransferInfo> serializer() {
            return TransferInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TransferInfo(int i, String str, boolean z, Integer num, double d, String str2, double d2, double d3, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, String str9, boolean z2, Integer num2, Boolean bool2, Boolean bool3, Boolean bool4, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if (512 != (i & 512)) {
            PluginExceptionsKt.throwMissingFieldException(i, 512, TransferInfo$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.hold = null;
        } else {
            this.hold = str;
        }
        if ((i & 2) == 0) {
            this.isTimeCurrency = false;
        } else {
            this.isTimeCurrency = z;
        }
        if ((i & 4) == 0) {
            this.kycLevel = null;
        } else {
            this.kycLevel = num;
        }
        int i2 = i & 8;
        double d4 = AudioStats.AUDIO_AMPLITUDE_NONE;
        if (i2 == 0) {
            this.limit = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            this.limit = d;
        }
        if ((i & 16) == 0) {
            this.max = "";
        } else {
            this.max = str2;
        }
        if ((i & 32) == 0) {
            this.min = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            this.min = d2;
        }
        this.used = (i & 64) != 0 ? d3 : d4;
        if ((i & 128) == 0) {
            this.c2cHoldAmount = "";
        } else {
            this.c2cHoldAmount = str3;
        }
        if ((i & 256) == 0) {
            this.maxWdEx = null;
        } else {
            this.maxWdEx = str4;
        }
        this.isBorrow = bool;
        if ((i & 1024) == 0) {
            this.spotOffsetMaxWd = null;
        } else {
            this.spotOffsetMaxWd = str5;
        }
        if ((i & 2048) == 0) {
            this.spotOffsetMaxWdEx = null;
        } else {
            this.spotOffsetMaxWdEx = str6;
        }
        if ((i & 4096) == 0) {
            this.portfolioSpotRiskOffset = null;
        } else {
            this.portfolioSpotRiskOffset = str7;
        }
        if ((i & 8192) == 0) {
            this.inUse = null;
        } else {
            this.inUse = str8;
        }
        if ((i & 16384) == 0) {
            this.spotInUseAmt = null;
        } else {
            this.spotInUseAmt = str9;
        }
        if ((32768 & i) == 0) {
            this.pm3Whitelisted = false;
        } else {
            this.pm3Whitelisted = z2;
        }
        if ((65536 & i) == 0) {
            this.acctLv = null;
        } else {
            this.acctLv = num2;
        }
        if ((131072 & i) == 0) {
            this.autoEarnEnabled = null;
        } else {
            this.autoEarnEnabled = bool2;
        }
        if ((262144 & i) == 0) {
            this.autoEarnSupported = null;
        } else {
            this.autoEarnSupported = bool3;
        }
        this.cedefiAccountExist = (524288 & i) == 0 ? Boolean.FALSE : bool4;
        if ((i & 1048576) == 0) {
            this.borrowLimitReason = null;
        } else {
            this.borrowLimitReason = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(TransferInfo transferInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || transferInfo.hold != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, transferInfo.hold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || transferInfo.isTimeCurrency) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, transferInfo.isTimeCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || transferInfo.kycLevel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, transferInfo.kycLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || Double.compare(transferInfo.limit, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 3, transferInfo.limit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) transferInfo.max, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, transferInfo.max);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || Double.compare(transferInfo.min, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 5, transferInfo.min);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || Double.compare(transferInfo.used, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 6, transferInfo.used);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) transferInfo.c2cHoldAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, transferInfo.c2cHoldAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || transferInfo.maxWdEx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, transferInfo.maxWdEx);
        }
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, transferInfo.isBorrow);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || transferInfo.spotOffsetMaxWd != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, transferInfo.spotOffsetMaxWd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || transferInfo.spotOffsetMaxWdEx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, transferInfo.spotOffsetMaxWdEx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || transferInfo.portfolioSpotRiskOffset != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, transferInfo.portfolioSpotRiskOffset);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || transferInfo.inUse != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, transferInfo.inUse);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || transferInfo.spotInUseAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, transferInfo.spotInUseAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || transferInfo.pm3Whitelisted) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 15, transferInfo.pm3Whitelisted);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || transferInfo.acctLv != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, IntSerializer.INSTANCE, transferInfo.acctLv);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || transferInfo.autoEarnEnabled != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, booleanSerializer, transferInfo.autoEarnEnabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || transferInfo.autoEarnSupported != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, booleanSerializer, transferInfo.autoEarnSupported);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd(transferInfo.cedefiAccountExist, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, booleanSerializer, transferInfo.cedefiAccountExist);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) && transferInfo.borrowLimitReason == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, transferInfo.borrowLimitReason);
    }

    public TransferInfo(String str, boolean z, Integer num, double d, @NotNull String str2, double d2, double d3, @NotNull String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, String str9, boolean z2, Integer num2, Boolean bool2, Boolean bool3, Boolean bool4, String str10) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.hold = str;
        this.isTimeCurrency = z;
        this.kycLevel = num;
        this.limit = d;
        this.max = str2;
        this.min = d2;
        this.used = d3;
        this.c2cHoldAmount = str3;
        this.maxWdEx = str4;
        this.isBorrow = bool;
        this.spotOffsetMaxWd = str5;
        this.spotOffsetMaxWdEx = str6;
        this.portfolioSpotRiskOffset = str7;
        this.inUse = str8;
        this.spotInUseAmt = str9;
        this.pm3Whitelisted = z2;
        this.acctLv = num2;
        this.autoEarnEnabled = bool2;
        this.autoEarnSupported = bool3;
        this.cedefiAccountExist = bool4;
        this.borrowLimitReason = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00de: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r53v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r53v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r30v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0014: ARITH (r53v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r31v0 java.lang.Integer))
  (wrap:double:?: TERNARY null = ((wrap:int:0x001c: ARITH (r53v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0.0d double) : (r32v0 double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r53v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:double:?: TERNARY null = ((wrap:int:0x0030: ARITH (r53v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0.0d double) : (r35v0 double))
  (wrap:double:?: TERNARY null = ((wrap:int:0x0038: ARITH (r53v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0.0d double) : (r37v0 double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r53v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r53v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (r41v0 java.lang.Boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r53v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r53v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r53v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006d: ARITH (r53v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r53v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0082: ARITH (32768 int) & (r53v0 int) A[WRAPPED]) != (0 int)) ? false : (r47v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x008c: ARITH (65536 int) & (r53v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r48v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0096: ARITH (131072 int) & (r53v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r49v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00a0: ARITH (262144 int) & (r53v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r50v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00aa: ARITH (524288 int) & (r53v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00af: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r51v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b6: ARITH (r53v0 int) & (1048576 int) A[WRAPPED]) == (0 int)) ? (r52v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, boolean, java.lang.Integer, double, java.lang.String, double, double, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String):void (m)] (LINE:300) call: com.okinc.assets.backend.api.model.TransferInfo.<init>(java.lang.String, boolean, java.lang.Integer, double, java.lang.String, double, double, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ TransferInfo(String str, boolean z, Integer num, double d, String str2, double d2, double d3, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, String str9, boolean z2, Integer num2, Boolean bool2, Boolean bool3, Boolean bool4, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : num, (i & 8) != 0 ? 0.0d : d, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? 0.0d : d2, (i & 64) != 0 ? 0.0d : d3, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? null : str4, bool, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? null : str8, (i & 16384) != 0 ? null : str9, (32768 & i) != 0 ? false : z2, (65536 & i) != 0 ? null : num2, (131072 & i) != 0 ? null : bool2, (262144 & i) != 0 ? null : bool3, (524288 & i) != 0 ? Boolean.FALSE : bool4, (i & 1048576) == 0 ? str10 : null);
    }
}
