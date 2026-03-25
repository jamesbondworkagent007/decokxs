package com.okinc.business.invest_biz.data.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
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
public final class InvestTokenWithAmount implements Parcelable {
    private final Long availableClaimTime;
    private final int availableClaimType;
    private final String browserUrl;
    private final ButtonType buttonType;
    private long chainId;
    private String coinAmount;
    private final Long collectionDeadLine;
    private String currencyAmount;
    private final InvestTokenType dataType;
    private final boolean depositTips;
    private String expectTokenAddress;
    private final boolean isBaseToken;
    private final Integer isCanClaim;
    private final String minInvestAmount;
    private final String network;
    private final Long originalInvestmentId;
    private final String originalProductType;
    private final String rangeMinCoinAmount;
    private final String safeMaxAmount;
    private final String safeMinAmount;
    private final String tokenAddress;
    private final String tokenId;
    private final String tokenLogo;
    private final String tokenName;
    private final String tokenPrecision;
    private final String tokenPrice;
    private final String tokenSymbol;
    private final String transferableBalance;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestTokenWithAmount> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, ButtonType.Companion.serializer(), null, null, InvestTokenType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<InvestTokenWithAmount> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestTokenWithAmount createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestTokenWithAmount(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), ButtonType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), InvestTokenType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestTokenWithAmount[] newArray(int i) {
            return new InvestTokenWithAmount[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestTokenWithAmount() {
        this(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null);
    }

    @SerialName("availableClaimTime")
    public static /* synthetic */ void getAvailableClaimTime$annotations() {
    }

    @SerialName("availableClaimType")
    public static /* synthetic */ void getAvailableClaimType$annotations() {
    }

    @SerialName("browserUrl")
    public static /* synthetic */ void getBrowserUrl$annotations() {
    }

    @SerialName("buttonType")
    public static /* synthetic */ void getButtonType$annotations() {
    }

    @SerialName("chainId")
    public static /* synthetic */ void getChainId$annotations() {
    }

    @SerialName("coinAmount")
    public static /* synthetic */ void getCoinAmount$annotations() {
    }

    @SerialName("collectionDeadLine")
    public static /* synthetic */ void getCollectionDeadLine$annotations() {
    }

    @SerialName("currencyAmount")
    public static /* synthetic */ void getCurrencyAmount$annotations() {
    }

    @SerialName("dataType")
    public static /* synthetic */ void getDataType$annotations() {
    }

    @SerialName("depositTips")
    public static /* synthetic */ void getDepositTips$annotations() {
    }

    @SerialName("expectTokenAddress")
    public static /* synthetic */ void getExpectTokenAddress$annotations() {
    }

    @SerialName("minInvestAmount")
    public static /* synthetic */ void getMinInvestAmount$annotations() {
    }

    @SerialName("network")
    public static /* synthetic */ void getNetwork$annotations() {
    }

    @SerialName("tokenInvestmentId")
    public static /* synthetic */ void getOriginalInvestmentId$annotations() {
    }

    @SerialName("productType")
    public static /* synthetic */ void getOriginalProductType$annotations() {
    }

    @SerialName("rangeMinCoinAmount")
    public static /* synthetic */ void getRangeMinCoinAmount$annotations() {
    }

    @SerialName("safeMaxAmount")
    public static /* synthetic */ void getSafeMaxAmount$annotations() {
    }

    @SerialName("safeMinAmount")
    public static /* synthetic */ void getSafeMinAmount$annotations() {
    }

    @SerialName("tokenAddress")
    public static /* synthetic */ void getTokenAddress$annotations() {
    }

    @SerialName("tokenId")
    public static /* synthetic */ void getTokenId$annotations() {
    }

    @SerialName("tokenLogo")
    public static /* synthetic */ void getTokenLogo$annotations() {
    }

    @SerialName("tokenName")
    public static /* synthetic */ void getTokenName$annotations() {
    }

    @SerialName("tokenPrecision")
    public static /* synthetic */ void getTokenPrecision$annotations() {
    }

    @SerialName("tokenPrice")
    public static /* synthetic */ void getTokenPrice$annotations() {
    }

    @SerialName("tokenSymbol")
    public static /* synthetic */ void getTokenSymbol$annotations() {
    }

    @SerialName("transferableBalance")
    public static /* synthetic */ void getTransferableBalance$annotations() {
    }

    @SerialName("isBaseToken")
    public static /* synthetic */ void isBaseToken$annotations() {
    }

    @SerialName("isCanClaim")
    public static /* synthetic */ void isCanClaim$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.tokenPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.browserUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component14() {
        return this.isCanClaim;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonType component15() {
        return this.buttonType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.expectTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.transferableBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenType component18() {
        return this.dataType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component19() {
        return this.availableClaimTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component20() {
        return this.collectionDeadLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component21() {
        return this.availableClaimType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.minInvestAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component23() {
        return this.originalInvestmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.originalProductType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.rangeMinCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.safeMinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.safeMaxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.tokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.depositTips;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isBaseToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount copy(long j, @NotNull String str, @NotNull String str2, boolean z, boolean z2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, Integer num, @NotNull ButtonType buttonType, String str11, @NotNull String str12, @NotNull InvestTokenType investTokenType, Long l, Long l2, int i, @NotNull String str13, Long l3, String str14, String str15, String str16, String str17, @NotNull String str18) {
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
        Intrinsics.checkNotNullParameter(buttonType, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(investTokenType, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str18, "");
        return new InvestTokenWithAmount(j, str, str2, z, z2, str3, str4, str5, str6, str7, str8, str9, str10, num, buttonType, str11, str12, investTokenType, l, l2, i, str13, l3, str14, str15, str16, str17, str18);
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
        if (!(obj instanceof InvestTokenWithAmount)) {
            return false;
        }
        InvestTokenWithAmount investTokenWithAmount = (InvestTokenWithAmount) obj;
        return this.chainId == investTokenWithAmount.chainId && Intrinsics.EZpvd((Object) this.coinAmount, (Object) investTokenWithAmount.coinAmount) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) investTokenWithAmount.currencyAmount) && this.depositTips == investTokenWithAmount.depositTips && this.isBaseToken == investTokenWithAmount.isBaseToken && Intrinsics.EZpvd((Object) this.network, (Object) investTokenWithAmount.network) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) investTokenWithAmount.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) investTokenWithAmount.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenName, (Object) investTokenWithAmount.tokenName) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) investTokenWithAmount.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenPrecision, (Object) investTokenWithAmount.tokenPrecision) && Intrinsics.EZpvd((Object) this.browserUrl, (Object) investTokenWithAmount.browserUrl) && Intrinsics.EZpvd((Object) this.tokenId, (Object) investTokenWithAmount.tokenId) && Intrinsics.EZpvd(this.isCanClaim, investTokenWithAmount.isCanClaim) && this.buttonType == investTokenWithAmount.buttonType && Intrinsics.EZpvd((Object) this.expectTokenAddress, (Object) investTokenWithAmount.expectTokenAddress) && Intrinsics.EZpvd((Object) this.transferableBalance, (Object) investTokenWithAmount.transferableBalance) && this.dataType == investTokenWithAmount.dataType && Intrinsics.EZpvd(this.availableClaimTime, investTokenWithAmount.availableClaimTime) && Intrinsics.EZpvd(this.collectionDeadLine, investTokenWithAmount.collectionDeadLine) && this.availableClaimType == investTokenWithAmount.availableClaimType && Intrinsics.EZpvd((Object) this.minInvestAmount, (Object) investTokenWithAmount.minInvestAmount) && Intrinsics.EZpvd(this.originalInvestmentId, investTokenWithAmount.originalInvestmentId) && Intrinsics.EZpvd((Object) this.originalProductType, (Object) investTokenWithAmount.originalProductType) && Intrinsics.EZpvd((Object) this.rangeMinCoinAmount, (Object) investTokenWithAmount.rangeMinCoinAmount) && Intrinsics.EZpvd((Object) this.safeMinAmount, (Object) investTokenWithAmount.safeMinAmount) && Intrinsics.EZpvd((Object) this.safeMaxAmount, (Object) investTokenWithAmount.safeMaxAmount) && Intrinsics.EZpvd((Object) this.tokenPrice, (Object) investTokenWithAmount.tokenPrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getAvailableClaimTime() {
        return this.availableClaimTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAvailableClaimType() {
        return this.availableClaimType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBrowserUrl() {
        return this.browserUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonType getButtonType() {
        return this.buttonType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmount() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCollectionDeadLine() {
        return this.collectionDeadLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenType getDataType() {
        return this.dataType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDepositTips() {
        return this.depositTips;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpectTokenAddress() {
        return this.expectTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinInvestAmount() {
        return this.minInvestAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getOriginalInvestmentId() {
        return this.originalInvestmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginalProductType() {
        return this.originalProductType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRangeMinCoinAmount() {
        return this.rangeMinCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSafeMaxAmount() {
        return this.safeMaxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSafeMinAmount() {
        return this.safeMinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenId() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogo() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenName() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenPrecision() {
        return this.tokenPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenPrice() {
        return this.tokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransferableBalance() {
        return this.transferableBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.chainId);
        int iHashCode2 = this.coinAmount.hashCode();
        int iHashCode3 = this.currencyAmount.hashCode();
        int iHashCode4 = Boolean.hashCode(this.depositTips);
        int iHashCode5 = Boolean.hashCode(this.isBaseToken);
        int iHashCode6 = this.network.hashCode();
        int iHashCode7 = this.tokenAddress.hashCode();
        int iHashCode8 = this.tokenLogo.hashCode();
        int iHashCode9 = this.tokenName.hashCode();
        int iHashCode10 = this.tokenSymbol.hashCode();
        int iHashCode11 = this.tokenPrecision.hashCode();
        int iHashCode12 = this.browserUrl.hashCode();
        int iHashCode13 = this.tokenId.hashCode();
        Integer num = this.isCanClaim;
        int iHashCode14 = num == null ? 0 : num.hashCode();
        int iHashCode15 = this.buttonType.hashCode();
        String str = this.expectTokenAddress;
        int iHashCode16 = str == null ? 0 : str.hashCode();
        int iHashCode17 = this.transferableBalance.hashCode();
        int iHashCode18 = this.dataType.hashCode();
        Long l = this.availableClaimTime;
        int iHashCode19 = l == null ? 0 : l.hashCode();
        Long l2 = this.collectionDeadLine;
        int iHashCode20 = l2 == null ? 0 : l2.hashCode();
        int iHashCode21 = Integer.hashCode(this.availableClaimType);
        int iHashCode22 = this.minInvestAmount.hashCode();
        Long l3 = this.originalInvestmentId;
        int iHashCode23 = l3 == null ? 0 : l3.hashCode();
        String str2 = this.originalProductType;
        int iHashCode24 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.rangeMinCoinAmount;
        int iHashCode25 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.safeMinAmount;
        int iHashCode26 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.safeMaxAmount;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + (str5 == null ? 0 : str5.hashCode())) * 31) + this.tokenPrice.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBaseToken() {
        return this.isBaseToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer isCanClaim() {
        return this.isCanClaim;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(long j) {
        this.chainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currencyAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpectTokenAddress(String str) {
        this.expectTokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestTokenWithAmount(chainId=" + this.chainId + ", coinAmount=" + this.coinAmount + ", currencyAmount=" + this.currencyAmount + ", depositTips=" + this.depositTips + ", isBaseToken=" + this.isBaseToken + ", network=" + this.network + ", tokenAddress=" + this.tokenAddress + ", tokenLogo=" + this.tokenLogo + ", tokenName=" + this.tokenName + ", tokenSymbol=" + this.tokenSymbol + ", tokenPrecision=" + this.tokenPrecision + ", browserUrl=" + this.browserUrl + ", tokenId=" + this.tokenId + ", isCanClaim=" + this.isCanClaim + ", buttonType=" + this.buttonType + ", expectTokenAddress=" + this.expectTokenAddress + ", transferableBalance=" + this.transferableBalance + ", dataType=" + this.dataType + ", availableClaimTime=" + this.availableClaimTime + ", collectionDeadLine=" + this.collectionDeadLine + ", availableClaimType=" + this.availableClaimType + ", minInvestAmount=" + this.minInvestAmount + ", originalInvestmentId=" + this.originalInvestmentId + ", originalProductType=" + this.originalProductType + ", rangeMinCoinAmount=" + this.rangeMinCoinAmount + ", safeMinAmount=" + this.safeMinAmount + ", safeMaxAmount=" + this.safeMaxAmount + ", tokenPrice=" + this.tokenPrice + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.chainId);
        parcel.writeString(this.coinAmount);
        parcel.writeString(this.currencyAmount);
        parcel.writeInt(this.depositTips ? 1 : 0);
        parcel.writeInt(this.isBaseToken ? 1 : 0);
        parcel.writeString(this.network);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.tokenLogo);
        parcel.writeString(this.tokenName);
        parcel.writeString(this.tokenSymbol);
        parcel.writeString(this.tokenPrecision);
        parcel.writeString(this.browserUrl);
        parcel.writeString(this.tokenId);
        Integer num = this.isCanClaim;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.buttonType.name());
        parcel.writeString(this.expectTokenAddress);
        parcel.writeString(this.transferableBalance);
        parcel.writeString(this.dataType.name());
        Long l = this.availableClaimTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.collectionDeadLine;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeInt(this.availableClaimType);
        parcel.writeString(this.minInvestAmount);
        Long l3 = this.originalInvestmentId;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        parcel.writeString(this.originalProductType);
        parcel.writeString(this.rangeMinCoinAmount);
        parcel.writeString(this.safeMinAmount);
        parcel.writeString(this.safeMaxAmount);
        parcel.writeString(this.tokenPrice);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.models.InvestTokenWithAmount.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestTokenWithAmount> serializer() {
            return InvestTokenWithAmount$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestTokenWithAmount(int i, long j, String str, String str2, boolean z, boolean z2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, ButtonType buttonType, String str11, String str12, InvestTokenType investTokenType, Long l, Long l2, int i2, String str13, Long l3, String str14, String str15, String str16, String str17, String str18, SerializationConstructorMarker serializationConstructorMarker) {
        this.chainId = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.coinAmount = "";
        } else {
            this.coinAmount = str;
        }
        if ((i & 4) == 0) {
            this.currencyAmount = "";
        } else {
            this.currencyAmount = str2;
        }
        if ((i & 8) == 0) {
            this.depositTips = false;
        } else {
            this.depositTips = z;
        }
        if ((i & 16) == 0) {
            this.isBaseToken = false;
        } else {
            this.isBaseToken = z2;
        }
        if ((i & 32) == 0) {
            this.network = "";
        } else {
            this.network = str3;
        }
        if ((i & 64) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str4;
        }
        if ((i & 128) == 0) {
            this.tokenLogo = "";
        } else {
            this.tokenLogo = str5;
        }
        if ((i & 256) == 0) {
            this.tokenName = "";
        } else {
            this.tokenName = str6;
        }
        if ((i & 512) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str7;
        }
        if ((i & 1024) == 0) {
            this.tokenPrecision = "";
        } else {
            this.tokenPrecision = str8;
        }
        if ((i & 2048) == 0) {
            this.browserUrl = "";
        } else {
            this.browserUrl = str9;
        }
        if ((i & 4096) == 0) {
            this.tokenId = "";
        } else {
            this.tokenId = str10;
        }
        if ((i & 8192) == 0) {
            this.isCanClaim = null;
        } else {
            this.isCanClaim = num;
        }
        this.buttonType = (i & 16384) == 0 ? ButtonType.CLAIM_TYPE_NO_NEED_SHOW : buttonType;
        if ((32768 & i) == 0) {
            this.expectTokenAddress = null;
        } else {
            this.expectTokenAddress = str11;
        }
        if ((65536 & i) == 0) {
            this.transferableBalance = "";
        } else {
            this.transferableBalance = str12;
        }
        this.dataType = (131072 & i) == 0 ? InvestTokenType.PRINCIPLE : investTokenType;
        if ((262144 & i) == 0) {
            this.availableClaimTime = null;
        } else {
            this.availableClaimTime = l;
        }
        if ((524288 & i) == 0) {
            this.collectionDeadLine = null;
        } else {
            this.collectionDeadLine = l2;
        }
        if ((1048576 & i) == 0) {
            this.availableClaimType = 0;
        } else {
            this.availableClaimType = i2;
        }
        if ((2097152 & i) == 0) {
            this.minInvestAmount = "";
        } else {
            this.minInvestAmount = str13;
        }
        if ((4194304 & i) == 0) {
            this.originalInvestmentId = null;
        } else {
            this.originalInvestmentId = l3;
        }
        if ((8388608 & i) == 0) {
            this.originalProductType = null;
        } else {
            this.originalProductType = str14;
        }
        if ((16777216 & i) == 0) {
            this.rangeMinCoinAmount = "";
        } else {
            this.rangeMinCoinAmount = str15;
        }
        if ((33554432 & i) == 0) {
            this.safeMinAmount = null;
        } else {
            this.safeMinAmount = str16;
        }
        if ((67108864 & i) == 0) {
            this.safeMaxAmount = null;
        } else {
            this.safeMaxAmount = str17;
        }
        if ((i & 134217728) == 0) {
            this.tokenPrice = "";
        } else {
            this.tokenPrice = str18;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestTokenWithAmount investTokenWithAmount, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investTokenWithAmount.chainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, investTokenWithAmount.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investTokenWithAmount.coinAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, investTokenWithAmount.coinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investTokenWithAmount.currencyAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, investTokenWithAmount.currencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investTokenWithAmount.depositTips) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, investTokenWithAmount.depositTips);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investTokenWithAmount.isBaseToken) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, investTokenWithAmount.isBaseToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) investTokenWithAmount.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, investTokenWithAmount.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) investTokenWithAmount.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, investTokenWithAmount.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) investTokenWithAmount.tokenLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, investTokenWithAmount.tokenLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) investTokenWithAmount.tokenName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, investTokenWithAmount.tokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) investTokenWithAmount.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, investTokenWithAmount.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) investTokenWithAmount.tokenPrecision, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, investTokenWithAmount.tokenPrecision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) investTokenWithAmount.browserUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, investTokenWithAmount.browserUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) investTokenWithAmount.tokenId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, investTokenWithAmount.tokenId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || investTokenWithAmount.isCanClaim != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, investTokenWithAmount.isCanClaim);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || investTokenWithAmount.buttonType != ButtonType.CLAIM_TYPE_NO_NEED_SHOW) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], investTokenWithAmount.buttonType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || investTokenWithAmount.expectTokenAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, investTokenWithAmount.expectTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) investTokenWithAmount.transferableBalance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, investTokenWithAmount.transferableBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || investTokenWithAmount.dataType != InvestTokenType.PRINCIPLE) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 17, kSerializerArr[17], investTokenWithAmount.dataType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || investTokenWithAmount.availableClaimTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, LongSerializer.INSTANCE, investTokenWithAmount.availableClaimTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || investTokenWithAmount.collectionDeadLine != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, LongSerializer.INSTANCE, investTokenWithAmount.collectionDeadLine);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || investTokenWithAmount.availableClaimType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 20, investTokenWithAmount.availableClaimType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) investTokenWithAmount.minInvestAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, investTokenWithAmount.minInvestAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || investTokenWithAmount.originalInvestmentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, LongSerializer.INSTANCE, investTokenWithAmount.originalInvestmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || investTokenWithAmount.originalProductType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, investTokenWithAmount.originalProductType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) investTokenWithAmount.rangeMinCoinAmount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, investTokenWithAmount.rangeMinCoinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || investTokenWithAmount.safeMinAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, investTokenWithAmount.safeMinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || investTokenWithAmount.safeMaxAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, investTokenWithAmount.safeMaxAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) && Intrinsics.EZpvd((Object) investTokenWithAmount.tokenPrice, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 27, investTokenWithAmount.tokenPrice);
    }

    public InvestTokenWithAmount(long j, @NotNull String str, @NotNull String str2, boolean z, boolean z2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, Integer num, @NotNull ButtonType buttonType, String str11, @NotNull String str12, @NotNull InvestTokenType investTokenType, Long l, Long l2, int i, @NotNull String str13, Long l3, String str14, String str15, String str16, String str17, @NotNull String str18) {
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
        Intrinsics.checkNotNullParameter(buttonType, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(investTokenType, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str18, "");
        this.chainId = j;
        this.coinAmount = str;
        this.currencyAmount = str2;
        this.depositTips = z;
        this.isBaseToken = z2;
        this.network = str3;
        this.tokenAddress = str4;
        this.tokenLogo = str5;
        this.tokenName = str6;
        this.tokenSymbol = str7;
        this.tokenPrecision = str8;
        this.browserUrl = str9;
        this.tokenId = str10;
        this.isCanClaim = num;
        this.buttonType = buttonType;
        this.expectTokenAddress = str11;
        this.transferableBalance = str12;
        this.dataType = investTokenType;
        this.availableClaimTime = l;
        this.collectionDeadLine = l2;
        this.availableClaimType = i;
        this.minInvestAmount = str13;
        this.originalInvestmentId = l3;
        this.originalProductType = str14;
        this.rangeMinCoinAmount = str15;
        this.safeMinAmount = str16;
        this.safeMaxAmount = str17;
        this.tokenPrice = str18;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x014d: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r59v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r30v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r59v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r59v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r59v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r34v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r59v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r35v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r59v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r59v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r59v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r59v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r59v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r59v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r59v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r59v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.Integer:0x007a: TERNARY null = ((wrap:int:0x006f: ARITH (r59v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r44v0 java.lang.Integer))
  (wrap:com.okinc.business.invest_biz.data.bean.ButtonType:?: TERNARY null = ((wrap:int:0x007c: ARITH (r59v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0080: SGET  A[WRAPPED] (LINE:44) com.okinc.business.invest_biz.data.bean.ButtonType.CLAIM_TYPE_NO_NEED_SHOW com.okinc.business.invest_biz.data.bean.ButtonType) : (r45v0 com.okinc.business.invest_biz.data.bean.ButtonType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r59v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (r59v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTokenType:?: TERNARY null = ((wrap:int:0x009e: ARITH (r59v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00a2: SGET  A[WRAPPED] (LINE:51) com.okinc.business.invest_biz.data.bean.InvestTokenType.PRINCIPLE com.okinc.business.invest_biz.data.bean.InvestTokenType) : (r48v0 com.okinc.business.invest_biz.data.bean.InvestTokenType))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r59v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r49v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r59v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r50v0 java.lang.Long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r59v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r51v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ca: ARITH (r59v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x00d5: ARITH (r59v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r53v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e0: ARITH (r59v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00eb: ARITH (r59v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f6: ARITH (r59v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0101: ARITH (r59v0 int) & (67108864 int) A[WRAPPED]) == (0 int)) ? (r57v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010a: ARITH (r59v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
 A[MD:(long, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.okinc.business.invest_biz.data.bean.ButtonType, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestTokenType, java.lang.Long, java.lang.Long, int, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:14) call: com.okinc.business.invest_biz.data.models.InvestTokenWithAmount.<init>(long, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.okinc.business.invest_biz.data.bean.ButtonType, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestTokenType, java.lang.Long, java.lang.Long, int, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InvestTokenWithAmount(long j, String str, String str2, boolean z, boolean z2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, ButtonType buttonType, String str11, String str12, InvestTokenType investTokenType, Long l, Long l2, int i, String str13, Long l3, String str14, String str15, String str16, String str17, String str18, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? "" : str4, (i2 & 128) != 0 ? "" : str5, (i2 & 256) != 0 ? "" : str6, (i2 & 512) != 0 ? "" : str7, (i2 & 1024) != 0 ? "" : str8, (i2 & 2048) != 0 ? "" : str9, (i2 & 4096) != 0 ? "" : str10, (i2 & 8192) != 0 ? null : num, (i2 & 16384) != 0 ? ButtonType.CLAIM_TYPE_NO_NEED_SHOW : buttonType, (i2 & 32768) != 0 ? null : str11, (i2 & 65536) != 0 ? "" : str12, (i2 & 131072) != 0 ? InvestTokenType.PRINCIPLE : investTokenType, (i2 & 262144) != 0 ? null : l, (i2 & 524288) != 0 ? null : l2, (i2 & 1048576) != 0 ? 0 : i, (i2 & 2097152) != 0 ? "" : str13, (i2 & 4194304) != 0 ? null : l3, (i2 & 8388608) != 0 ? null : str14, (i2 & 16777216) != 0 ? "" : str15, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str16, (i2 & 67108864) == 0 ? str17 : null, (i2 & 134217728) != 0 ? "" : str18);
    }

    public final boolean canClaim() {
        Integer num = this.isCanClaim;
        return num != null && num.intValue() == 1;
    }
}
