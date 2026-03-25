package com.okinc.okpaymentapi.data.remote.model.experience;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.okpaymentapi.data.remote.model.management.EarnOptionRequestParam;
import com.okinc.okpaymentapi.data.remote.model.management.EarnOptionRequestParam$$serializer;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class SubmitOrderReq implements Parcelable {
    private String baseAmount;
    private String baseCurrency;
    private String codeType;
    private String depositCode;
    private DepositConvertParamReq depositConvertParam;
    private String depositName;
    private String depositPlatformCode;
    private String deviceData;
    private EarnOptionRequestParam earnOption;
    private String failUrl;
    private Integer frequency;
    private String frequencyTxt;
    private String fundingToTradingAmount;
    private SubmitOrderMetadata metaData;
    private String msgCode;
    private boolean needConvert;
    private String orderType;
    private String paymentAccountId;
    private String paymentMethod;
    private String quoteAmount;
    private String quoteCurrency;
    private String quoteToken;
    private String requestId;
    private String signifyTicket;
    private Float slippageTolerance;
    private String source;
    private String successUrl;
    private String targetBalanceAccountList;
    private String tradeType;
    private String usdAmount;
    private String userPreferenceCurrency;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SubmitOrderReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, SubmitOrderMetadata.Companion.serializer(), null};

    public static final class Creator implements Parcelable.Creator<SubmitOrderReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubmitOrderReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SubmitOrderReq(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : DepositConvertParamReq.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? EarnOptionRequestParam.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), (SubmitOrderMetadata) parcel.readParcelable(SubmitOrderReq.class.getClassLoader()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubmitOrderReq[] newArray(int i) {
            return new SubmitOrderReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SubmitOrderReq() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (Integer) null, (String) null, (DepositConvertParamReq) null, (String) null, (String) null, (String) null, (Float) null, (String) null, (String) null, (EarnOptionRequestParam) null, (String) null, (String) null, (SubmitOrderMetadata) null, (String) null, Integer.MAX_VALUE, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.paymentAccountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.paymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.successUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.failUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.quoteToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component17() {
        return this.needConvert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component18() {
        return this.frequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.signifyTicket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DepositConvertParamReq component20() {
        return this.depositConvertParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.codeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.msgCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component24() {
        return this.slippageTolerance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.frequencyTxt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnOptionRequestParam component27() {
        return this.earnOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.deviceData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.userPreferenceCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubmitOrderMetadata component30() {
        return this.metaData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.fundingToTradingAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.depositName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.depositPlatformCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.depositCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.targetBalanceAccountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubmitOrderReq copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, boolean z, Integer num, String str17, DepositConvertParamReq depositConvertParamReq, @NotNull String str18, String str19, String str20, Float f, @NotNull String str21, String str22, EarnOptionRequestParam earnOptionRequestParam, String str23, @NotNull String str24, SubmitOrderMetadata submitOrderMetadata, String str25) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str24, "");
        return new SubmitOrderReq(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, z, num, str17, depositConvertParamReq, str18, str19, str20, f, str21, str22, earnOptionRequestParam, str23, str24, submitOrderMetadata, str25);
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
        if (!(obj instanceof SubmitOrderReq)) {
            return false;
        }
        SubmitOrderReq submitOrderReq = (SubmitOrderReq) obj;
        return Intrinsics.EZpvd((Object) this.tradeType, (Object) submitOrderReq.tradeType) && Intrinsics.EZpvd((Object) this.quoteCurrency, (Object) submitOrderReq.quoteCurrency) && Intrinsics.EZpvd((Object) this.baseCurrency, (Object) submitOrderReq.baseCurrency) && Intrinsics.EZpvd((Object) this.quoteAmount, (Object) submitOrderReq.quoteAmount) && Intrinsics.EZpvd((Object) this.baseAmount, (Object) submitOrderReq.baseAmount) && Intrinsics.EZpvd((Object) this.depositName, (Object) submitOrderReq.depositName) && Intrinsics.EZpvd((Object) this.depositPlatformCode, (Object) submitOrderReq.depositPlatformCode) && Intrinsics.EZpvd((Object) this.depositCode, (Object) submitOrderReq.depositCode) && Intrinsics.EZpvd((Object) this.targetBalanceAccountList, (Object) submitOrderReq.targetBalanceAccountList) && Intrinsics.EZpvd((Object) this.paymentAccountId, (Object) submitOrderReq.paymentAccountId) && Intrinsics.EZpvd((Object) this.paymentMethod, (Object) submitOrderReq.paymentMethod) && Intrinsics.EZpvd((Object) this.successUrl, (Object) submitOrderReq.successUrl) && Intrinsics.EZpvd((Object) this.failUrl, (Object) submitOrderReq.failUrl) && Intrinsics.EZpvd((Object) this.usdAmount, (Object) submitOrderReq.usdAmount) && Intrinsics.EZpvd((Object) this.quoteToken, (Object) submitOrderReq.quoteToken) && Intrinsics.EZpvd((Object) this.source, (Object) submitOrderReq.source) && this.needConvert == submitOrderReq.needConvert && Intrinsics.EZpvd(this.frequency, submitOrderReq.frequency) && Intrinsics.EZpvd((Object) this.signifyTicket, (Object) submitOrderReq.signifyTicket) && Intrinsics.EZpvd(this.depositConvertParam, submitOrderReq.depositConvertParam) && Intrinsics.EZpvd((Object) this.requestId, (Object) submitOrderReq.requestId) && Intrinsics.EZpvd((Object) this.codeType, (Object) submitOrderReq.codeType) && Intrinsics.EZpvd((Object) this.msgCode, (Object) submitOrderReq.msgCode) && Intrinsics.EZpvd(this.slippageTolerance, submitOrderReq.slippageTolerance) && Intrinsics.EZpvd((Object) this.orderType, (Object) submitOrderReq.orderType) && Intrinsics.EZpvd((Object) this.frequencyTxt, (Object) submitOrderReq.frequencyTxt) && Intrinsics.EZpvd(this.earnOption, submitOrderReq.earnOption) && Intrinsics.EZpvd((Object) this.deviceData, (Object) submitOrderReq.deviceData) && Intrinsics.EZpvd((Object) this.userPreferenceCurrency, (Object) submitOrderReq.userPreferenceCurrency) && Intrinsics.EZpvd(this.metaData, submitOrderReq.metaData) && Intrinsics.EZpvd((Object) this.fundingToTradingAmount, (Object) submitOrderReq.fundingToTradingAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseAmount() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCodeType() {
        return this.codeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositCode() {
        return this.depositCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DepositConvertParamReq getDepositConvertParam() {
        return this.depositConvertParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositName() {
        return this.depositName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositPlatformCode() {
        return this.depositPlatformCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeviceData() {
        return this.deviceData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnOptionRequestParam getEarnOption() {
        return this.earnOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFailUrl() {
        return this.failUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFrequency() {
        return this.frequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrequencyTxt() {
        return this.frequencyTxt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingToTradingAmount() {
        return this.fundingToTradingAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubmitOrderMetadata getMetaData() {
        return this.metaData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsgCode() {
        return this.msgCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedConvert() {
        return this.needConvert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentAccountId() {
        return this.paymentAccountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteAmount() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteToken() {
        return this.quoteToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignifyTicket() {
        return this.signifyTicket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getSlippageTolerance() {
        return this.slippageTolerance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSuccessUrl() {
        return this.successUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetBalanceAccountList() {
        return this.targetBalanceAccountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeType() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdAmount() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserPreferenceCurrency() {
        return this.userPreferenceCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.tradeType.hashCode();
        int iHashCode2 = this.quoteCurrency.hashCode();
        int iHashCode3 = this.baseCurrency.hashCode();
        int iHashCode4 = this.quoteAmount.hashCode();
        int iHashCode5 = this.baseAmount.hashCode();
        int iHashCode6 = this.depositName.hashCode();
        int iHashCode7 = this.depositPlatformCode.hashCode();
        int iHashCode8 = this.depositCode.hashCode();
        String str = this.targetBalanceAccountList;
        int iHashCode9 = str == null ? 0 : str.hashCode();
        int iHashCode10 = this.paymentAccountId.hashCode();
        int iHashCode11 = this.paymentMethod.hashCode();
        int iHashCode12 = this.successUrl.hashCode();
        int iHashCode13 = this.failUrl.hashCode();
        int iHashCode14 = this.usdAmount.hashCode();
        int iHashCode15 = this.quoteToken.hashCode();
        int iHashCode16 = this.source.hashCode();
        int iHashCode17 = Boolean.hashCode(this.needConvert);
        Integer num = this.frequency;
        int iHashCode18 = num == null ? 0 : num.hashCode();
        String str2 = this.signifyTicket;
        int iHashCode19 = str2 == null ? 0 : str2.hashCode();
        DepositConvertParamReq depositConvertParamReq = this.depositConvertParam;
        int iHashCode20 = depositConvertParamReq == null ? 0 : depositConvertParamReq.hashCode();
        int iHashCode21 = this.requestId.hashCode();
        String str3 = this.codeType;
        int iHashCode22 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.msgCode;
        int iHashCode23 = str4 == null ? 0 : str4.hashCode();
        Float f = this.slippageTolerance;
        int iHashCode24 = f == null ? 0 : f.hashCode();
        int iHashCode25 = this.orderType.hashCode();
        String str5 = this.frequencyTxt;
        int iHashCode26 = str5 == null ? 0 : str5.hashCode();
        EarnOptionRequestParam earnOptionRequestParam = this.earnOption;
        int iHashCode27 = earnOptionRequestParam == null ? 0 : earnOptionRequestParam.hashCode();
        String str6 = this.deviceData;
        int iHashCode28 = str6 == null ? 0 : str6.hashCode();
        int iHashCode29 = this.userPreferenceCurrency.hashCode();
        SubmitOrderMetadata submitOrderMetadata = this.metaData;
        int iHashCode30 = submitOrderMetadata == null ? 0 : submitOrderMetadata.hashCode();
        String str7 = this.fundingToTradingAmount;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + (str7 == null ? 0 : str7.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCodeType(String str) {
        this.codeType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepositCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.depositCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepositConvertParam(DepositConvertParamReq depositConvertParamReq) {
        this.depositConvertParam = depositConvertParamReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepositName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.depositName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepositPlatformCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.depositPlatformCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeviceData(String str) {
        this.deviceData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarnOption(EarnOptionRequestParam earnOptionRequestParam) {
        this.earnOption = earnOptionRequestParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFailUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.failUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrequency(Integer num) {
        this.frequency = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrequencyTxt(String str) {
        this.frequencyTxt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFundingToTradingAmount(String str) {
        this.fundingToTradingAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMetaData(SubmitOrderMetadata submitOrderMetadata) {
        this.metaData = submitOrderMetadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMsgCode(String str) {
        this.msgCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedConvert(boolean z) {
        this.needConvert = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymentAccountId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymentAccountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymentMethod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymentMethod = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteToken = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRequestId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.requestId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignifyTicket(String str) {
        this.signifyTicket = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlippageTolerance(Float f) {
        this.slippageTolerance = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.source = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSuccessUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.successUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTargetBalanceAccountList(String str) {
        this.targetBalanceAccountList = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tradeType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.usdAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserPreferenceCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userPreferenceCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SubmitOrderReq(tradeType=" + this.tradeType + ", quoteCurrency=" + this.quoteCurrency + ", baseCurrency=" + this.baseCurrency + ", quoteAmount=" + this.quoteAmount + ", baseAmount=" + this.baseAmount + ", depositName=" + this.depositName + ", depositPlatformCode=" + this.depositPlatformCode + ", depositCode=" + this.depositCode + ", targetBalanceAccountList=" + this.targetBalanceAccountList + ", paymentAccountId=" + this.paymentAccountId + ", paymentMethod=" + this.paymentMethod + ", successUrl=" + this.successUrl + ", failUrl=" + this.failUrl + ", usdAmount=" + this.usdAmount + ", quoteToken=" + this.quoteToken + ", source=" + this.source + ", needConvert=" + this.needConvert + ", frequency=" + this.frequency + ", signifyTicket=" + this.signifyTicket + ", depositConvertParam=" + this.depositConvertParam + ", requestId=" + this.requestId + ", codeType=" + this.codeType + ", msgCode=" + this.msgCode + ", slippageTolerance=" + this.slippageTolerance + ", orderType=" + this.orderType + ", frequencyTxt=" + this.frequencyTxt + ", earnOption=" + this.earnOption + ", deviceData=" + this.deviceData + ", userPreferenceCurrency=" + this.userPreferenceCurrency + ", metaData=" + this.metaData + ", fundingToTradingAmount=" + this.fundingToTradingAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.tradeType);
        parcel.writeString(this.quoteCurrency);
        parcel.writeString(this.baseCurrency);
        parcel.writeString(this.quoteAmount);
        parcel.writeString(this.baseAmount);
        parcel.writeString(this.depositName);
        parcel.writeString(this.depositPlatformCode);
        parcel.writeString(this.depositCode);
        parcel.writeString(this.targetBalanceAccountList);
        parcel.writeString(this.paymentAccountId);
        parcel.writeString(this.paymentMethod);
        parcel.writeString(this.successUrl);
        parcel.writeString(this.failUrl);
        parcel.writeString(this.usdAmount);
        parcel.writeString(this.quoteToken);
        parcel.writeString(this.source);
        parcel.writeInt(this.needConvert ? 1 : 0);
        Integer num = this.frequency;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.signifyTicket);
        DepositConvertParamReq depositConvertParamReq = this.depositConvertParam;
        if (depositConvertParamReq == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            depositConvertParamReq.writeToParcel(parcel, i);
        }
        parcel.writeString(this.requestId);
        parcel.writeString(this.codeType);
        parcel.writeString(this.msgCode);
        Float f = this.slippageTolerance;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeString(this.orderType);
        parcel.writeString(this.frequencyTxt);
        EarnOptionRequestParam earnOptionRequestParam = this.earnOption;
        if (earnOptionRequestParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            earnOptionRequestParam.writeToParcel(parcel, i);
        }
        parcel.writeString(this.deviceData);
        parcel.writeString(this.userPreferenceCurrency);
        parcel.writeParcelable(this.metaData, i);
        parcel.writeString(this.fundingToTradingAmount);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.experience.SubmitOrderReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SubmitOrderReq> serializer() {
            return SubmitOrderReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SubmitOrderReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, Integer num, String str17, DepositConvertParamReq depositConvertParamReq, String str18, String str19, String str20, Float f, String str21, String str22, EarnOptionRequestParam earnOptionRequestParam, String str23, String str24, SubmitOrderMetadata submitOrderMetadata, String str25, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tradeType = "";
        } else {
            this.tradeType = str;
        }
        if ((i & 2) == 0) {
            this.quoteCurrency = "";
        } else {
            this.quoteCurrency = str2;
        }
        if ((i & 4) == 0) {
            this.baseCurrency = "";
        } else {
            this.baseCurrency = str3;
        }
        if ((i & 8) == 0) {
            this.quoteAmount = "";
        } else {
            this.quoteAmount = str4;
        }
        if ((i & 16) == 0) {
            this.baseAmount = "";
        } else {
            this.baseAmount = str5;
        }
        if ((i & 32) == 0) {
            this.depositName = "";
        } else {
            this.depositName = str6;
        }
        if ((i & 64) == 0) {
            this.depositPlatformCode = "";
        } else {
            this.depositPlatformCode = str7;
        }
        if ((i & 128) == 0) {
            this.depositCode = "";
        } else {
            this.depositCode = str8;
        }
        if ((i & 256) == 0) {
            this.targetBalanceAccountList = null;
        } else {
            this.targetBalanceAccountList = str9;
        }
        if ((i & 512) == 0) {
            this.paymentAccountId = "";
        } else {
            this.paymentAccountId = str10;
        }
        if ((i & 1024) == 0) {
            this.paymentMethod = "";
        } else {
            this.paymentMethod = str11;
        }
        if ((i & 2048) == 0) {
            this.successUrl = "";
        } else {
            this.successUrl = str12;
        }
        if ((i & 4096) == 0) {
            this.failUrl = "";
        } else {
            this.failUrl = str13;
        }
        if ((i & 8192) == 0) {
            this.usdAmount = "";
        } else {
            this.usdAmount = str14;
        }
        if ((i & 16384) == 0) {
            this.quoteToken = "";
        } else {
            this.quoteToken = str15;
        }
        if ((32768 & i) == 0) {
            this.source = "";
        } else {
            this.source = str16;
        }
        this.needConvert = (65536 & i) == 0 ? false : z;
        if ((131072 & i) == 0) {
            this.frequency = null;
        } else {
            this.frequency = num;
        }
        if ((262144 & i) == 0) {
            this.signifyTicket = null;
        } else {
            this.signifyTicket = str17;
        }
        if ((524288 & i) == 0) {
            this.depositConvertParam = null;
        } else {
            this.depositConvertParam = depositConvertParamReq;
        }
        this.requestId = (1048576 & i) == 0 ? UUID.randomUUID().toString() : str18;
        if ((2097152 & i) == 0) {
            this.codeType = null;
        } else {
            this.codeType = str19;
        }
        if ((4194304 & i) == 0) {
            this.msgCode = null;
        } else {
            this.msgCode = str20;
        }
        if ((8388608 & i) == 0) {
            this.slippageTolerance = null;
        } else {
            this.slippageTolerance = f;
        }
        this.orderType = (16777216 & i) == 0 ? "one_time" : str21;
        if ((33554432 & i) == 0) {
            this.frequencyTxt = null;
        } else {
            this.frequencyTxt = str22;
        }
        if ((67108864 & i) == 0) {
            this.earnOption = null;
        } else {
            this.earnOption = earnOptionRequestParam;
        }
        if ((134217728 & i) == 0) {
            this.deviceData = null;
        } else {
            this.deviceData = str23;
        }
        if ((268435456 & i) == 0) {
            this.userPreferenceCurrency = "";
        } else {
            this.userPreferenceCurrency = str24;
        }
        if ((536870912 & i) == 0) {
            this.metaData = null;
        } else {
            this.metaData = submitOrderMetadata;
        }
        if ((i & 1073741824) == 0) {
            this.fundingToTradingAmount = null;
        } else {
            this.fundingToTradingAmount = str25;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(SubmitOrderReq submitOrderReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) submitOrderReq.tradeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, submitOrderReq.tradeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) submitOrderReq.quoteCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, submitOrderReq.quoteCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) submitOrderReq.baseCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, submitOrderReq.baseCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) submitOrderReq.quoteAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, submitOrderReq.quoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) submitOrderReq.baseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, submitOrderReq.baseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) submitOrderReq.depositName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, submitOrderReq.depositName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) submitOrderReq.depositPlatformCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, submitOrderReq.depositPlatformCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) submitOrderReq.depositCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, submitOrderReq.depositCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || submitOrderReq.targetBalanceAccountList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, submitOrderReq.targetBalanceAccountList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) submitOrderReq.paymentAccountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, submitOrderReq.paymentAccountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) submitOrderReq.paymentMethod, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, submitOrderReq.paymentMethod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) submitOrderReq.successUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, submitOrderReq.successUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) submitOrderReq.failUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, submitOrderReq.failUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) submitOrderReq.usdAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, submitOrderReq.usdAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) submitOrderReq.quoteToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, submitOrderReq.quoteToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) submitOrderReq.source, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, submitOrderReq.source);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || submitOrderReq.needConvert) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 16, submitOrderReq.needConvert);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || submitOrderReq.frequency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, IntSerializer.INSTANCE, submitOrderReq.frequency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || submitOrderReq.signifyTicket != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, submitOrderReq.signifyTicket);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || submitOrderReq.depositConvertParam != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, DepositConvertParamReq$$serializer.INSTANCE, submitOrderReq.depositConvertParam);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) submitOrderReq.requestId, (Object) UUID.randomUUID().toString())) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, submitOrderReq.requestId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || submitOrderReq.codeType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, submitOrderReq.codeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || submitOrderReq.msgCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, submitOrderReq.msgCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || submitOrderReq.slippageTolerance != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, FloatSerializer.INSTANCE, submitOrderReq.slippageTolerance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) submitOrderReq.orderType, (Object) "one_time")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, submitOrderReq.orderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || submitOrderReq.frequencyTxt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, submitOrderReq.frequencyTxt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || submitOrderReq.earnOption != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, EarnOptionRequestParam$$serializer.INSTANCE, submitOrderReq.earnOption);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || submitOrderReq.deviceData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, StringSerializer.INSTANCE, submitOrderReq.deviceData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) submitOrderReq.userPreferenceCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, submitOrderReq.userPreferenceCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || submitOrderReq.metaData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, kSerializerArr[29], submitOrderReq.metaData);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) && submitOrderReq.fundingToTradingAmount == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, submitOrderReq.fundingToTradingAmount);
    }

    public SubmitOrderReq(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, boolean z, Integer num, String str17, DepositConvertParamReq depositConvertParamReq, @NotNull String str18, String str19, String str20, Float f, @NotNull String str21, String str22, EarnOptionRequestParam earnOptionRequestParam, String str23, @NotNull String str24, SubmitOrderMetadata submitOrderMetadata, String str25) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str24, "");
        this.tradeType = str;
        this.quoteCurrency = str2;
        this.baseCurrency = str3;
        this.quoteAmount = str4;
        this.baseAmount = str5;
        this.depositName = str6;
        this.depositPlatformCode = str7;
        this.depositCode = str8;
        this.targetBalanceAccountList = str9;
        this.paymentAccountId = str10;
        this.paymentMethod = str11;
        this.successUrl = str12;
        this.failUrl = str13;
        this.usdAmount = str14;
        this.quoteToken = str15;
        this.source = str16;
        this.needConvert = z;
        this.frequency = num;
        this.signifyTicket = str17;
        this.depositConvertParam = depositConvertParamReq;
        this.requestId = str18;
        this.codeType = str19;
        this.msgCode = str20;
        this.slippageTolerance = f;
        this.orderType = str21;
        this.frequencyTxt = str22;
        this.earnOption = earnOptionRequestParam;
        this.deviceData = str23;
        this.userPreferenceCurrency = str24;
        this.metaData = submitOrderMetadata;
        this.fundingToTradingAmount = str25;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0175: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r64v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r64v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r64v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r64v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r64v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r64v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r64v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r64v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r64v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r64v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r64v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r64v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r64v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r64v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r64v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r64v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x008d: ARITH (r64v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? false : (r49v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0098: ARITH (r64v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r50v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r64v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:com.okinc.okpaymentapi.data.remote.model.experience.DepositConvertParamReq:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r64v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.experience.DepositConvertParamReq) : (r52v0 com.okinc.okpaymentapi.data.remote.model.experience.DepositConvertParamReq))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r64v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00c1: INVOKE 
  (wrap:java.util.UUID:0x00bd: INVOKE  STATIC call: java.util.UUID.randomUUID():java.util.UUID A[MD:():java.util.UUID (c), WRAPPED] (LINE:42))
 VIRTUAL call: java.util.UUID.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:42)) : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ca: ARITH (r64v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d5: ARITH (r64v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r55v0 java.lang.String))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x00e0: ARITH (r64v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r56v0 java.lang.Float))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00eb: ARITH (r64v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("one_time") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f6: ARITH (r64v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r58v0 java.lang.String))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.EarnOptionRequestParam:?: TERNARY null = ((wrap:int:0x0101: ARITH (r64v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.management.EarnOptionRequestParam) : (r59v0 com.okinc.okpaymentapi.data.remote.model.management.EarnOptionRequestParam))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010c: ARITH (r64v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0117: ARITH (r64v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:com.okinc.okpaymentapi.data.remote.model.experience.SubmitOrderMetadata:?: TERNARY null = ((wrap:int:0x0122: ARITH (r64v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.experience.SubmitOrderMetadata) : (r62v0 com.okinc.okpaymentapi.data.remote.model.experience.SubmitOrderMetadata))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012d: ARITH (r64v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r63v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.String, com.okinc.okpaymentapi.data.remote.model.experience.DepositConvertParamReq, java.lang.String, java.lang.String, java.lang.String, java.lang.Float, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.EarnOptionRequestParam, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.experience.SubmitOrderMetadata, java.lang.String):void (m)] (LINE:21) call: com.okinc.okpaymentapi.data.remote.model.experience.SubmitOrderReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.String, com.okinc.okpaymentapi.data.remote.model.experience.DepositConvertParamReq, java.lang.String, java.lang.String, java.lang.String, java.lang.Float, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.EarnOptionRequestParam, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.experience.SubmitOrderMetadata, java.lang.String):void type: THIS */
    public /* synthetic */ SubmitOrderReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, Integer num, String str17, DepositConvertParamReq depositConvertParamReq, String str18, String str19, String str20, Float f, String str21, String str22, EarnOptionRequestParam earnOptionRequestParam, String str23, String str24, SubmitOrderMetadata submitOrderMetadata, String str25, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? false : z, (i & 131072) != 0 ? null : num, (i & 262144) != 0 ? null : str17, (i & 524288) != 0 ? null : depositConvertParamReq, (i & 1048576) != 0 ? UUID.randomUUID().toString() : str18, (i & 2097152) != 0 ? null : str19, (i & 4194304) != 0 ? null : str20, (i & 8388608) != 0 ? null : f, (i & 16777216) != 0 ? "one_time" : str21, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str22, (i & 67108864) != 0 ? null : earnOptionRequestParam, (i & 134217728) != 0 ? null : str23, (i & 268435456) != 0 ? "" : str24, (i & 536870912) != 0 ? null : submitOrderMetadata, (i & 1073741824) != 0 ? null : str25);
    }
}
