package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class LimitRecordData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String apr;
    private final String availLoan;
    private final String avgRate;
    private final String ccy;
    private final String coinBorrowLimit;
    private final String coinRealBorrowAmt;
    private final String dnaMasterFlexLoanAvaQuota;
    private final String dnaMasterFlexLoanQuota;
    private final boolean dnaSupportedCoin;
    private final String hourRates;
    private final String interest;
    private final String masterFlexLoanAvaQuota;
    private final String masterFlexLoanQuota;
    private final String masterFlexLoanQuotaMode;
    private final String posLoan;
    private final String rate;
    private final String rateType;
    private final String surplusLimit;
    private final SurplusLmtDetails surplusLmtDetails;
    private final String usedLimit;
    private final String usedLoan;
    private final String userFlexLoanInterestFreeBorrowAmt;
    private final String yearRates;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LimitRecordData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (SurplusLmtDetails) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8388607, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.usedLoan;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.avgRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.userFlexLoanInterestFreeBorrowAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.coinRealBorrowAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SurplusLmtDetails component14() {
        return this.surplusLmtDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.masterFlexLoanQuotaMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component16() {
        return this.dnaSupportedCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.masterFlexLoanQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.dnaMasterFlexLoanQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.dnaMasterFlexLoanAvaQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.masterFlexLoanAvaQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.hourRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.yearRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.apr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.coinBorrowLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.surplusLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.usedLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.interest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.posLoan;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.availLoan;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitRecordData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, SurplusLmtDetails surplusLmtDetails, @NotNull String str14, boolean z, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
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
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        return new LimitRecordData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, surplusLmtDetails, str14, z, str15, str16, str17, str18, str19, str20, str21);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitRecordData)) {
            return false;
        }
        LimitRecordData limitRecordData = (LimitRecordData) obj;
        return Intrinsics.EZpvd((Object) this.ccy, (Object) limitRecordData.ccy) && Intrinsics.EZpvd((Object) this.rate, (Object) limitRecordData.rate) && Intrinsics.EZpvd((Object) this.apr, (Object) limitRecordData.apr) && Intrinsics.EZpvd((Object) this.coinBorrowLimit, (Object) limitRecordData.coinBorrowLimit) && Intrinsics.EZpvd((Object) this.surplusLimit, (Object) limitRecordData.surplusLimit) && Intrinsics.EZpvd((Object) this.usedLimit, (Object) limitRecordData.usedLimit) && Intrinsics.EZpvd((Object) this.interest, (Object) limitRecordData.interest) && Intrinsics.EZpvd((Object) this.posLoan, (Object) limitRecordData.posLoan) && Intrinsics.EZpvd((Object) this.availLoan, (Object) limitRecordData.availLoan) && Intrinsics.EZpvd((Object) this.usedLoan, (Object) limitRecordData.usedLoan) && Intrinsics.EZpvd((Object) this.avgRate, (Object) limitRecordData.avgRate) && Intrinsics.EZpvd((Object) this.userFlexLoanInterestFreeBorrowAmt, (Object) limitRecordData.userFlexLoanInterestFreeBorrowAmt) && Intrinsics.EZpvd((Object) this.coinRealBorrowAmt, (Object) limitRecordData.coinRealBorrowAmt) && Intrinsics.EZpvd(this.surplusLmtDetails, limitRecordData.surplusLmtDetails) && Intrinsics.EZpvd((Object) this.masterFlexLoanQuotaMode, (Object) limitRecordData.masterFlexLoanQuotaMode) && this.dnaSupportedCoin == limitRecordData.dnaSupportedCoin && Intrinsics.EZpvd((Object) this.masterFlexLoanQuota, (Object) limitRecordData.masterFlexLoanQuota) && Intrinsics.EZpvd((Object) this.dnaMasterFlexLoanQuota, (Object) limitRecordData.dnaMasterFlexLoanQuota) && Intrinsics.EZpvd((Object) this.dnaMasterFlexLoanAvaQuota, (Object) limitRecordData.dnaMasterFlexLoanAvaQuota) && Intrinsics.EZpvd((Object) this.masterFlexLoanAvaQuota, (Object) limitRecordData.masterFlexLoanAvaQuota) && Intrinsics.EZpvd((Object) this.hourRates, (Object) limitRecordData.hourRates) && Intrinsics.EZpvd((Object) this.yearRates, (Object) limitRecordData.yearRates) && Intrinsics.EZpvd((Object) this.rateType, (Object) limitRecordData.rateType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApr() {
        return this.apr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailLoan() {
        return this.availLoan;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvgRate() {
        return this.avgRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinBorrowLimit() {
        return this.coinBorrowLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinRealBorrowAmt() {
        return this.coinRealBorrowAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDnaMasterFlexLoanAvaQuota() {
        return this.dnaMasterFlexLoanAvaQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDnaMasterFlexLoanQuota() {
        return this.dnaMasterFlexLoanQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDnaSupportedCoin() {
        return this.dnaSupportedCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHourRates() {
        return this.hourRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInterest() {
        return this.interest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMasterFlexLoanAvaQuota() {
        return this.masterFlexLoanAvaQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMasterFlexLoanQuota() {
        return this.masterFlexLoanQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMasterFlexLoanQuotaMode() {
        return this.masterFlexLoanQuotaMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosLoan() {
        return this.posLoan;
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
    public final String getSurplusLimit() {
        return this.surplusLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SurplusLmtDetails getSurplusLmtDetails() {
        return this.surplusLmtDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsedLimit() {
        return this.usedLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsedLoan() {
        return this.usedLoan;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserFlexLoanInterestFreeBorrowAmt() {
        return this.userFlexLoanInterestFreeBorrowAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getYearRates() {
        return this.yearRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.ccy.hashCode();
        int iHashCode2 = this.rate.hashCode();
        int iHashCode3 = this.apr.hashCode();
        int iHashCode4 = this.coinBorrowLimit.hashCode();
        int iHashCode5 = this.surplusLimit.hashCode();
        int iHashCode6 = this.usedLimit.hashCode();
        int iHashCode7 = this.interest.hashCode();
        int iHashCode8 = this.posLoan.hashCode();
        int iHashCode9 = this.availLoan.hashCode();
        int iHashCode10 = this.usedLoan.hashCode();
        int iHashCode11 = this.avgRate.hashCode();
        int iHashCode12 = this.userFlexLoanInterestFreeBorrowAmt.hashCode();
        int iHashCode13 = this.coinRealBorrowAmt.hashCode();
        SurplusLmtDetails surplusLmtDetails = this.surplusLmtDetails;
        return (((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (surplusLmtDetails == null ? 0 : surplusLmtDetails.hashCode())) * 31) + this.masterFlexLoanQuotaMode.hashCode()) * 31) + Boolean.hashCode(this.dnaSupportedCoin)) * 31) + this.masterFlexLoanQuota.hashCode()) * 31) + this.dnaMasterFlexLoanQuota.hashCode()) * 31) + this.dnaMasterFlexLoanAvaQuota.hashCode()) * 31) + this.masterFlexLoanAvaQuota.hashCode()) * 31) + this.hourRates.hashCode()) * 31) + this.yearRates.hashCode()) * 31) + this.rateType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LimitRecordData(ccy=" + this.ccy + ", rate=" + this.rate + ", apr=" + this.apr + ", coinBorrowLimit=" + this.coinBorrowLimit + ", surplusLimit=" + this.surplusLimit + ", usedLimit=" + this.usedLimit + ", interest=" + this.interest + ", posLoan=" + this.posLoan + ", availLoan=" + this.availLoan + ", usedLoan=" + this.usedLoan + ", avgRate=" + this.avgRate + ", userFlexLoanInterestFreeBorrowAmt=" + this.userFlexLoanInterestFreeBorrowAmt + ", coinRealBorrowAmt=" + this.coinRealBorrowAmt + ", surplusLmtDetails=" + this.surplusLmtDetails + ", masterFlexLoanQuotaMode=" + this.masterFlexLoanQuotaMode + ", dnaSupportedCoin=" + this.dnaSupportedCoin + ", masterFlexLoanQuota=" + this.masterFlexLoanQuota + ", dnaMasterFlexLoanQuota=" + this.dnaMasterFlexLoanQuota + ", dnaMasterFlexLoanAvaQuota=" + this.dnaMasterFlexLoanAvaQuota + ", masterFlexLoanAvaQuota=" + this.masterFlexLoanAvaQuota + ", hourRates=" + this.hourRates + ", yearRates=" + this.yearRates + ", rateType=" + this.rateType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.LimitRecordData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LimitRecordData> serializer() {
            return LimitRecordData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LimitRecordData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, SurplusLmtDetails surplusLmtDetails, String str14, boolean z, String str15, String str16, String str17, String str18, String str19, String str20, String str21, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str;
        }
        if ((i & 2) == 0) {
            this.rate = "";
        } else {
            this.rate = str2;
        }
        if ((i & 4) == 0) {
            this.apr = "";
        } else {
            this.apr = str3;
        }
        if ((i & 8) == 0) {
            this.coinBorrowLimit = "";
        } else {
            this.coinBorrowLimit = str4;
        }
        if ((i & 16) == 0) {
            this.surplusLimit = "";
        } else {
            this.surplusLimit = str5;
        }
        if ((i & 32) == 0) {
            this.usedLimit = "";
        } else {
            this.usedLimit = str6;
        }
        if ((i & 64) == 0) {
            this.interest = "";
        } else {
            this.interest = str7;
        }
        if ((i & 128) == 0) {
            this.posLoan = "";
        } else {
            this.posLoan = str8;
        }
        if ((i & 256) == 0) {
            this.availLoan = "";
        } else {
            this.availLoan = str9;
        }
        if ((i & 512) == 0) {
            this.usedLoan = "";
        } else {
            this.usedLoan = str10;
        }
        if ((i & 1024) == 0) {
            this.avgRate = "";
        } else {
            this.avgRate = str11;
        }
        if ((i & 2048) == 0) {
            this.userFlexLoanInterestFreeBorrowAmt = "";
        } else {
            this.userFlexLoanInterestFreeBorrowAmt = str12;
        }
        if ((i & 4096) == 0) {
            this.coinRealBorrowAmt = "";
        } else {
            this.coinRealBorrowAmt = str13;
        }
        this.surplusLmtDetails = (i & 8192) == 0 ? null : surplusLmtDetails;
        if ((i & 16384) == 0) {
            this.masterFlexLoanQuotaMode = "";
        } else {
            this.masterFlexLoanQuotaMode = str14;
        }
        this.dnaSupportedCoin = (32768 & i) == 0 ? false : z;
        if ((65536 & i) == 0) {
            this.masterFlexLoanQuota = "";
        } else {
            this.masterFlexLoanQuota = str15;
        }
        if ((131072 & i) == 0) {
            this.dnaMasterFlexLoanQuota = "";
        } else {
            this.dnaMasterFlexLoanQuota = str16;
        }
        if ((262144 & i) == 0) {
            this.dnaMasterFlexLoanAvaQuota = "";
        } else {
            this.dnaMasterFlexLoanAvaQuota = str17;
        }
        if ((524288 & i) == 0) {
            this.masterFlexLoanAvaQuota = "";
        } else {
            this.masterFlexLoanAvaQuota = str18;
        }
        if ((1048576 & i) == 0) {
            this.hourRates = "";
        } else {
            this.hourRates = str19;
        }
        if ((2097152 & i) == 0) {
            this.yearRates = "";
        } else {
            this.yearRates = str20;
        }
        if ((i & 4194304) == 0) {
            this.rateType = "";
        } else {
            this.rateType = str21;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(LimitRecordData limitRecordData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) limitRecordData.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, limitRecordData.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) limitRecordData.rate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, limitRecordData.rate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) limitRecordData.apr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, limitRecordData.apr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) limitRecordData.coinBorrowLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, limitRecordData.coinBorrowLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) limitRecordData.surplusLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, limitRecordData.surplusLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) limitRecordData.usedLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, limitRecordData.usedLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) limitRecordData.interest, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, limitRecordData.interest);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) limitRecordData.posLoan, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, limitRecordData.posLoan);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) limitRecordData.availLoan, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, limitRecordData.availLoan);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) limitRecordData.usedLoan, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, limitRecordData.usedLoan);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) limitRecordData.avgRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, limitRecordData.avgRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) limitRecordData.userFlexLoanInterestFreeBorrowAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, limitRecordData.userFlexLoanInterestFreeBorrowAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) limitRecordData.coinRealBorrowAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, limitRecordData.coinRealBorrowAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || limitRecordData.surplusLmtDetails != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, SurplusLmtDetails$$serializer.INSTANCE, limitRecordData.surplusLmtDetails);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) limitRecordData.masterFlexLoanQuotaMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, limitRecordData.masterFlexLoanQuotaMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || limitRecordData.dnaSupportedCoin) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 15, limitRecordData.dnaSupportedCoin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) limitRecordData.masterFlexLoanQuota, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, limitRecordData.masterFlexLoanQuota);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) limitRecordData.dnaMasterFlexLoanQuota, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, limitRecordData.dnaMasterFlexLoanQuota);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) limitRecordData.dnaMasterFlexLoanAvaQuota, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, limitRecordData.dnaMasterFlexLoanAvaQuota);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) limitRecordData.masterFlexLoanAvaQuota, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, limitRecordData.masterFlexLoanAvaQuota);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) limitRecordData.hourRates, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, limitRecordData.hourRates);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) limitRecordData.yearRates, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, limitRecordData.yearRates);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) && Intrinsics.EZpvd((Object) limitRecordData.rateType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 22, limitRecordData.rateType);
    }

    public LimitRecordData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, SurplusLmtDetails surplusLmtDetails, @NotNull String str14, boolean z, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
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
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        this.ccy = str;
        this.rate = str2;
        this.apr = str3;
        this.coinBorrowLimit = str4;
        this.surplusLimit = str5;
        this.usedLimit = str6;
        this.interest = str7;
        this.posLoan = str8;
        this.availLoan = str9;
        this.usedLoan = str10;
        this.avgRate = str11;
        this.userFlexLoanInterestFreeBorrowAmt = str12;
        this.coinRealBorrowAmt = str13;
        this.surplusLmtDetails = surplusLmtDetails;
        this.masterFlexLoanQuotaMode = str14;
        this.dnaSupportedCoin = z;
        this.masterFlexLoanQuota = str15;
        this.dnaMasterFlexLoanQuota = str16;
        this.dnaMasterFlexLoanAvaQuota = str17;
        this.masterFlexLoanAvaQuota = str18;
        this.hourRates = str19;
        this.yearRates = str20;
        this.rateType = str21;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0108: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r48v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r48v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r48v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r48v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r48v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r48v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r48v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r48v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r48v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r48v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r48v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r48v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r48v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.SurplusLmtDetails:?: TERNARY null = ((wrap:int:0x006c: ARITH (r48v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.SurplusLmtDetails) : (r38v0 com.okinc.unify_trade.biz.SurplusLmtDetails))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r48v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0082: ARITH (r48v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? false : (r40v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r48v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r48v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r48v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r48v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r48v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r48v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r48v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.SurplusLmtDetails, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:110) call: com.okinc.unify_trade.biz.LimitRecordData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.SurplusLmtDetails, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LimitRecordData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, SurplusLmtDetails surplusLmtDetails, String str14, boolean z, String str15, String str16, String str17, String str18, String str19, String str20, String str21, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? null : surplusLmtDetails, (i & 16384) != 0 ? "" : str14, (i & 32768) != 0 ? false : z, (i & 65536) != 0 ? "" : str15, (i & 131072) != 0 ? "" : str16, (i & 262144) != 0 ? "" : str17, (i & 524288) != 0 ? "" : str18, (i & 1048576) != 0 ? "" : str19, (i & 2097152) != 0 ? "" : str20, (i & 4194304) != 0 ? "" : str21);
    }

    public final String getRateByType() {
        return this.rateType.length() == 0 ? this.apr : Intrinsics.EZpvd((Object) this.rateType, (Object) "year") ? this.yearRates : this.hourRates;
    }
}
