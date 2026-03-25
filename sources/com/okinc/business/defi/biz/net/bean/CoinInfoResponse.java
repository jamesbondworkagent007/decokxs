package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
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

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class CoinInfoResponse implements Parcelable {
    public static final int $stable = 0;
    private final boolean aaSupport;
    private final Integer accountType;
    private final String address;
    private final boolean aggregation;
    private final Long baseCoinId;
    private final Long blockHeight;
    private final boolean cefiSupport;
    private final Long chainId;
    private final String chainImageUrl;
    private final Long chainIndex;
    private final String chainName;
    private final Long coinDetailId;
    private final Long coinId;
    private final Integer coinType;
    private final Integer currencyId;
    private final Integer decimalNum;
    private final String explorerUrl;
    private final String imageUrl;
    private final Integer isAggregation;
    private final boolean isCaseSensitivity;
    private final boolean isDefault;
    private final boolean isDelete;
    private final Integer isHighQuality;
    private final boolean isHotNetwork;
    private final boolean isRiskType;
    private final boolean isVisible;
    private final Integer isVoucher;
    private final Integer logIndex;
    private final Integer mpcSignType;
    private final String name;
    private final Long okexCoinId;
    private final Integer orderDecimalNum;
    private final Integer platformType;
    private final Integer rank;
    private final Long realChainId;
    private final Integer riskType;
    private final String simageUrl;
    private final boolean supportPush;
    private final boolean supportShowDetail;
    private final boolean supportStableCoinInterest;
    private final Long supportVersion;
    private final String symbol;
    private final boolean systemToken;
    private final String tokenAddress;
    private final Integer tokenCategory;
    private final Integer tokenSort;
    private final String tokenType;
    private final boolean userRelation;
    private final Integer vdecimalNum;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CoinInfoResponse> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<CoinInfoResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinInfoResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CoinInfoResponse(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinInfoResponse[] newArray(int i) {
            return new CoinInfoResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoinInfoResponse() {
        this((Long) null, (String) null, (String) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, (String) null, (Integer) null, (Integer) null, false, (String) null, false, (Long) null, (Long) null, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, false, (Integer) null, (Long) null, (Long) null, (String) null, (String) null, false, (Integer) null, false, false, (Long) null, (Long) null, false, (String) null, false, (Integer) null, (Integer) null, (Integer) null, false, false, false, (String) null, (Integer) null, false, false, (Integer) null, (String) null, -1, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component10() {
        return this.rank;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component11() {
        return this.coinType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.isVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.isDelete;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component15() {
        return this.blockHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component16() {
        return this.supportVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component17() {
        return this.isDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component18() {
        return this.riskType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component19() {
        return this.isAggregation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component20() {
        return this.isVoucher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component21() {
        return this.platformType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component22() {
        return this.logIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component23() {
        return this.cefiSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component24() {
        return this.tokenCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component25() {
        return this.coinDetailId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component26() {
        return this.realChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.tokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component29() {
        return this.aggregation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component30() {
        return this.tokenSort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component31() {
        return this.userRelation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component32() {
        return this.supportPush;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component33() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component34() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component35() {
        return this.supportShowDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component37() {
        return this.isCaseSensitivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component38() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component39() {
        return this.mpcSignType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.accountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component40() {
        return this.orderDecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component41() {
        return this.systemToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component42() {
        return this.aaSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component43() {
        return this.isHotNetwork;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.chainImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component45() {
        return this.isHighQuality;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component46() {
        return this.isRiskType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component47() {
        return this.supportStableCoinInterest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component48() {
        return this.vdecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component49() {
        return this.simageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.decimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component6() {
        return this.baseCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component7() {
        return this.okexCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinInfoResponse copy(Long l, String str, String str2, Integer num, Integer num2, Long l2, Long l3, String str3, String str4, Integer num3, Integer num4, boolean z, String str5, boolean z2, Long l4, Long l5, boolean z3, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, boolean z4, Integer num10, Long l6, Long l7, String str6, String str7, boolean z5, Integer num11, boolean z6, boolean z7, Long l8, Long l9, boolean z8, String str8, boolean z9, Integer num12, Integer num13, Integer num14, boolean z10, boolean z11, boolean z12, String str9, Integer num15, boolean z13, boolean z14, Integer num16, String str10) {
        return new CoinInfoResponse(l, str, str2, num, num2, l2, l3, str3, str4, num3, num4, z, str5, z2, l4, l5, z3, num5, num6, num7, num8, num9, z4, num10, l6, l7, str6, str7, z5, num11, z6, z7, l8, l9, z8, str8, z9, num12, num13, num14, z10, z11, z12, str9, num15, z13, z14, num16, str10);
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
        if (!(obj instanceof CoinInfoResponse)) {
            return false;
        }
        CoinInfoResponse coinInfoResponse = (CoinInfoResponse) obj;
        return Intrinsics.EZpvd(this.coinId, coinInfoResponse.coinId) && Intrinsics.EZpvd((Object) this.name, (Object) coinInfoResponse.name) && Intrinsics.EZpvd((Object) this.symbol, (Object) coinInfoResponse.symbol) && Intrinsics.EZpvd(this.accountType, coinInfoResponse.accountType) && Intrinsics.EZpvd(this.decimalNum, coinInfoResponse.decimalNum) && Intrinsics.EZpvd(this.baseCoinId, coinInfoResponse.baseCoinId) && Intrinsics.EZpvd(this.okexCoinId, coinInfoResponse.okexCoinId) && Intrinsics.EZpvd((Object) this.address, (Object) coinInfoResponse.address) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) coinInfoResponse.tokenAddress) && Intrinsics.EZpvd(this.rank, coinInfoResponse.rank) && Intrinsics.EZpvd(this.coinType, coinInfoResponse.coinType) && this.isVisible == coinInfoResponse.isVisible && Intrinsics.EZpvd((Object) this.imageUrl, (Object) coinInfoResponse.imageUrl) && this.isDelete == coinInfoResponse.isDelete && Intrinsics.EZpvd(this.blockHeight, coinInfoResponse.blockHeight) && Intrinsics.EZpvd(this.supportVersion, coinInfoResponse.supportVersion) && this.isDefault == coinInfoResponse.isDefault && Intrinsics.EZpvd(this.riskType, coinInfoResponse.riskType) && Intrinsics.EZpvd(this.isAggregation, coinInfoResponse.isAggregation) && Intrinsics.EZpvd(this.isVoucher, coinInfoResponse.isVoucher) && Intrinsics.EZpvd(this.platformType, coinInfoResponse.platformType) && Intrinsics.EZpvd(this.logIndex, coinInfoResponse.logIndex) && this.cefiSupport == coinInfoResponse.cefiSupport && Intrinsics.EZpvd(this.tokenCategory, coinInfoResponse.tokenCategory) && Intrinsics.EZpvd(this.coinDetailId, coinInfoResponse.coinDetailId) && Intrinsics.EZpvd(this.realChainId, coinInfoResponse.realChainId) && Intrinsics.EZpvd((Object) this.chainName, (Object) coinInfoResponse.chainName) && Intrinsics.EZpvd((Object) this.tokenType, (Object) coinInfoResponse.tokenType) && this.aggregation == coinInfoResponse.aggregation && Intrinsics.EZpvd(this.tokenSort, coinInfoResponse.tokenSort) && this.userRelation == coinInfoResponse.userRelation && this.supportPush == coinInfoResponse.supportPush && Intrinsics.EZpvd(this.chainId, coinInfoResponse.chainId) && Intrinsics.EZpvd(this.chainIndex, coinInfoResponse.chainIndex) && this.supportShowDetail == coinInfoResponse.supportShowDetail && Intrinsics.EZpvd((Object) this.explorerUrl, (Object) coinInfoResponse.explorerUrl) && this.isCaseSensitivity == coinInfoResponse.isCaseSensitivity && Intrinsics.EZpvd(this.currencyId, coinInfoResponse.currencyId) && Intrinsics.EZpvd(this.mpcSignType, coinInfoResponse.mpcSignType) && Intrinsics.EZpvd(this.orderDecimalNum, coinInfoResponse.orderDecimalNum) && this.systemToken == coinInfoResponse.systemToken && this.aaSupport == coinInfoResponse.aaSupport && this.isHotNetwork == coinInfoResponse.isHotNetwork && Intrinsics.EZpvd((Object) this.chainImageUrl, (Object) coinInfoResponse.chainImageUrl) && Intrinsics.EZpvd(this.isHighQuality, coinInfoResponse.isHighQuality) && this.isRiskType == coinInfoResponse.isRiskType && this.supportStableCoinInterest == coinInfoResponse.supportStableCoinInterest && Intrinsics.EZpvd(this.vdecimalNum, coinInfoResponse.vdecimalNum) && Intrinsics.EZpvd((Object) this.simageUrl, (Object) coinInfoResponse.simageUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAaSupport() {
        return this.aaSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAccountType() {
        return this.accountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAggregation() {
        return this.aggregation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getBaseCoinId() {
        return this.baseCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getBlockHeight() {
        return this.blockHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCefiSupport() {
        return this.cefiSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainImageUrl() {
        return this.chainImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCoinDetailId() {
        return this.coinDetailId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCoinType() {
        return this.coinType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getDecimalNum() {
        return this.decimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExplorerUrl() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getLogIndex() {
        return this.logIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMpcSignType() {
        return this.mpcSignType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getOkexCoinId() {
        return this.okexCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getOrderDecimalNum() {
        return this.orderDecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPlatformType() {
        return this.platformType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRank() {
        return this.rank;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getRealChainId() {
        return this.realChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRiskType() {
        return this.riskType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSimageUrl() {
        return this.simageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportPush() {
        return this.supportPush;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportShowDetail() {
        return this.supportShowDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportStableCoinInterest() {
        return this.supportStableCoinInterest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getSupportVersion() {
        return this.supportVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSystemToken() {
        return this.systemToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTokenCategory() {
        return this.tokenCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTokenSort() {
        return this.tokenSort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenType() {
        return this.tokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUserRelation() {
        return this.userRelation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getVdecimalNum() {
        return this.vdecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.coinId;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.name;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.symbol;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.accountType;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        Integer num2 = this.decimalNum;
        int iHashCode5 = num2 == null ? 0 : num2.hashCode();
        Long l2 = this.baseCoinId;
        int iHashCode6 = l2 == null ? 0 : l2.hashCode();
        Long l3 = this.okexCoinId;
        int iHashCode7 = l3 == null ? 0 : l3.hashCode();
        String str3 = this.address;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.tokenAddress;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        Integer num3 = this.rank;
        int iHashCode10 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.coinType;
        int iHashCode11 = num4 == null ? 0 : num4.hashCode();
        int iHashCode12 = Boolean.hashCode(this.isVisible);
        String str5 = this.imageUrl;
        int iHashCode13 = str5 == null ? 0 : str5.hashCode();
        int iHashCode14 = Boolean.hashCode(this.isDelete);
        Long l4 = this.blockHeight;
        int iHashCode15 = l4 == null ? 0 : l4.hashCode();
        Long l5 = this.supportVersion;
        int iHashCode16 = l5 == null ? 0 : l5.hashCode();
        int iHashCode17 = Boolean.hashCode(this.isDefault);
        Integer num5 = this.riskType;
        int iHashCode18 = num5 == null ? 0 : num5.hashCode();
        Integer num6 = this.isAggregation;
        int iHashCode19 = num6 == null ? 0 : num6.hashCode();
        Integer num7 = this.isVoucher;
        int iHashCode20 = num7 == null ? 0 : num7.hashCode();
        Integer num8 = this.platformType;
        int iHashCode21 = num8 == null ? 0 : num8.hashCode();
        Integer num9 = this.logIndex;
        int iHashCode22 = num9 == null ? 0 : num9.hashCode();
        int iHashCode23 = Boolean.hashCode(this.cefiSupport);
        Integer num10 = this.tokenCategory;
        int iHashCode24 = num10 == null ? 0 : num10.hashCode();
        Long l6 = this.coinDetailId;
        int iHashCode25 = l6 == null ? 0 : l6.hashCode();
        Long l7 = this.realChainId;
        int iHashCode26 = l7 == null ? 0 : l7.hashCode();
        String str6 = this.chainName;
        int iHashCode27 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.tokenType;
        int iHashCode28 = str7 == null ? 0 : str7.hashCode();
        int iHashCode29 = Boolean.hashCode(this.aggregation);
        Integer num11 = this.tokenSort;
        int iHashCode30 = num11 == null ? 0 : num11.hashCode();
        int iHashCode31 = Boolean.hashCode(this.userRelation);
        int iHashCode32 = Boolean.hashCode(this.supportPush);
        Long l8 = this.chainId;
        int iHashCode33 = l8 == null ? 0 : l8.hashCode();
        Long l9 = this.chainIndex;
        int iHashCode34 = l9 == null ? 0 : l9.hashCode();
        int iHashCode35 = Boolean.hashCode(this.supportShowDetail);
        String str8 = this.explorerUrl;
        int iHashCode36 = str8 == null ? 0 : str8.hashCode();
        int iHashCode37 = Boolean.hashCode(this.isCaseSensitivity);
        Integer num12 = this.currencyId;
        int iHashCode38 = num12 == null ? 0 : num12.hashCode();
        Integer num13 = this.mpcSignType;
        int iHashCode39 = num13 == null ? 0 : num13.hashCode();
        Integer num14 = this.orderDecimalNum;
        int iHashCode40 = num14 == null ? 0 : num14.hashCode();
        int iHashCode41 = Boolean.hashCode(this.systemToken);
        int iHashCode42 = Boolean.hashCode(this.aaSupport);
        int iHashCode43 = Boolean.hashCode(this.isHotNetwork);
        String str9 = this.chainImageUrl;
        int iHashCode44 = str9 == null ? 0 : str9.hashCode();
        Integer num15 = this.isHighQuality;
        int iHashCode45 = num15 == null ? 0 : num15.hashCode();
        int iHashCode46 = Boolean.hashCode(this.isRiskType);
        int iHashCode47 = Boolean.hashCode(this.supportStableCoinInterest);
        Integer num16 = this.vdecimalNum;
        int iHashCode48 = num16 == null ? 0 : num16.hashCode();
        String str10 = this.simageUrl;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + (str10 == null ? 0 : str10.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer isAggregation() {
        return this.isAggregation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCaseSensitivity() {
        return this.isCaseSensitivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDefault() {
        return this.isDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDelete() {
        return this.isDelete;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer isHighQuality() {
        return this.isHighQuality;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHotNetwork() {
        return this.isHotNetwork;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isRiskType() {
        return this.isRiskType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isVisible() {
        return this.isVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer isVoucher() {
        return this.isVoucher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinInfoResponse(coinId=" + this.coinId + ", name=" + this.name + ", symbol=" + this.symbol + ", accountType=" + this.accountType + ", decimalNum=" + this.decimalNum + ", baseCoinId=" + this.baseCoinId + ", okexCoinId=" + this.okexCoinId + ", address=" + this.address + ", tokenAddress=" + this.tokenAddress + ", rank=" + this.rank + ", coinType=" + this.coinType + ", isVisible=" + this.isVisible + ", imageUrl=" + this.imageUrl + ", isDelete=" + this.isDelete + ", blockHeight=" + this.blockHeight + ", supportVersion=" + this.supportVersion + ", isDefault=" + this.isDefault + ", riskType=" + this.riskType + ", isAggregation=" + this.isAggregation + ", isVoucher=" + this.isVoucher + ", platformType=" + this.platformType + ", logIndex=" + this.logIndex + ", cefiSupport=" + this.cefiSupport + ", tokenCategory=" + this.tokenCategory + ", coinDetailId=" + this.coinDetailId + ", realChainId=" + this.realChainId + ", chainName=" + this.chainName + ", tokenType=" + this.tokenType + ", aggregation=" + this.aggregation + ", tokenSort=" + this.tokenSort + ", userRelation=" + this.userRelation + ", supportPush=" + this.supportPush + ", chainId=" + this.chainId + ", chainIndex=" + this.chainIndex + ", supportShowDetail=" + this.supportShowDetail + ", explorerUrl=" + this.explorerUrl + ", isCaseSensitivity=" + this.isCaseSensitivity + ", currencyId=" + this.currencyId + ", mpcSignType=" + this.mpcSignType + ", orderDecimalNum=" + this.orderDecimalNum + ", systemToken=" + this.systemToken + ", aaSupport=" + this.aaSupport + ", isHotNetwork=" + this.isHotNetwork + ", chainImageUrl=" + this.chainImageUrl + ", isHighQuality=" + this.isHighQuality + ", isRiskType=" + this.isRiskType + ", supportStableCoinInterest=" + this.supportStableCoinInterest + ", vdecimalNum=" + this.vdecimalNum + ", simageUrl=" + this.simageUrl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.coinId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.name);
        parcel.writeString(this.symbol);
        Integer num = this.accountType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.decimalNum;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Long l2 = this.baseCoinId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Long l3 = this.okexCoinId;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        parcel.writeString(this.address);
        parcel.writeString(this.tokenAddress);
        Integer num3 = this.rank;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.coinType;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeInt(this.isVisible ? 1 : 0);
        parcel.writeString(this.imageUrl);
        parcel.writeInt(this.isDelete ? 1 : 0);
        Long l4 = this.blockHeight;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l4.longValue());
        }
        Long l5 = this.supportVersion;
        if (l5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l5.longValue());
        }
        parcel.writeInt(this.isDefault ? 1 : 0);
        Integer num5 = this.riskType;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Integer num6 = this.isAggregation;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        Integer num7 = this.isVoucher;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num7.intValue());
        }
        Integer num8 = this.platformType;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num8.intValue());
        }
        Integer num9 = this.logIndex;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num9.intValue());
        }
        parcel.writeInt(this.cefiSupport ? 1 : 0);
        Integer num10 = this.tokenCategory;
        if (num10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num10.intValue());
        }
        Long l6 = this.coinDetailId;
        if (l6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l6.longValue());
        }
        Long l7 = this.realChainId;
        if (l7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l7.longValue());
        }
        parcel.writeString(this.chainName);
        parcel.writeString(this.tokenType);
        parcel.writeInt(this.aggregation ? 1 : 0);
        Integer num11 = this.tokenSort;
        if (num11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num11.intValue());
        }
        parcel.writeInt(this.userRelation ? 1 : 0);
        parcel.writeInt(this.supportPush ? 1 : 0);
        Long l8 = this.chainId;
        if (l8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l8.longValue());
        }
        Long l9 = this.chainIndex;
        if (l9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l9.longValue());
        }
        parcel.writeInt(this.supportShowDetail ? 1 : 0);
        parcel.writeString(this.explorerUrl);
        parcel.writeInt(this.isCaseSensitivity ? 1 : 0);
        Integer num12 = this.currencyId;
        if (num12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num12.intValue());
        }
        Integer num13 = this.mpcSignType;
        if (num13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num13.intValue());
        }
        Integer num14 = this.orderDecimalNum;
        if (num14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num14.intValue());
        }
        parcel.writeInt(this.systemToken ? 1 : 0);
        parcel.writeInt(this.aaSupport ? 1 : 0);
        parcel.writeInt(this.isHotNetwork ? 1 : 0);
        parcel.writeString(this.chainImageUrl);
        Integer num15 = this.isHighQuality;
        if (num15 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num15.intValue());
        }
        parcel.writeInt(this.isRiskType ? 1 : 0);
        parcel.writeInt(this.supportStableCoinInterest ? 1 : 0);
        Integer num16 = this.vdecimalNum;
        if (num16 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num16.intValue());
        }
        parcel.writeString(this.simageUrl);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CoinInfoResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CoinInfoResponse> serializer() {
            return CoinInfoResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CoinInfoResponse(int i, int i2, Long l, String str, String str2, Integer num, Integer num2, Long l2, Long l3, String str3, String str4, Integer num3, Integer num4, boolean z, String str5, boolean z2, Long l4, Long l5, boolean z3, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, boolean z4, Integer num10, Long l6, Long l7, String str6, String str7, boolean z5, Integer num11, boolean z6, boolean z7, Long l8, Long l9, boolean z8, String str8, boolean z9, Integer num12, Integer num13, Integer num14, boolean z10, boolean z11, boolean z12, String str9, Integer num15, boolean z13, boolean z14, Integer num16, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coinId = null;
        } else {
            this.coinId = l;
        }
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 4) == 0) {
            this.symbol = null;
        } else {
            this.symbol = str2;
        }
        if ((i & 8) == 0) {
            this.accountType = null;
        } else {
            this.accountType = num;
        }
        if ((i & 16) == 0) {
            this.decimalNum = null;
        } else {
            this.decimalNum = num2;
        }
        if ((i & 32) == 0) {
            this.baseCoinId = null;
        } else {
            this.baseCoinId = l2;
        }
        if ((i & 64) == 0) {
            this.okexCoinId = null;
        } else {
            this.okexCoinId = l3;
        }
        if ((i & 128) == 0) {
            this.address = null;
        } else {
            this.address = str3;
        }
        if ((i & 256) == 0) {
            this.tokenAddress = null;
        } else {
            this.tokenAddress = str4;
        }
        if ((i & 512) == 0) {
            this.rank = null;
        } else {
            this.rank = num3;
        }
        if ((i & 1024) == 0) {
            this.coinType = null;
        } else {
            this.coinType = num4;
        }
        if ((i & 2048) == 0) {
            this.isVisible = false;
        } else {
            this.isVisible = z;
        }
        if ((i & 4096) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str5;
        }
        if ((i & 8192) == 0) {
            this.isDelete = false;
        } else {
            this.isDelete = z2;
        }
        if ((i & 16384) == 0) {
            this.blockHeight = null;
        } else {
            this.blockHeight = l4;
        }
        if ((i & 32768) == 0) {
            this.supportVersion = null;
        } else {
            this.supportVersion = l5;
        }
        if ((i & 65536) == 0) {
            this.isDefault = false;
        } else {
            this.isDefault = z3;
        }
        if ((131072 & i) == 0) {
            this.riskType = null;
        } else {
            this.riskType = num5;
        }
        if ((262144 & i) == 0) {
            this.isAggregation = null;
        } else {
            this.isAggregation = num6;
        }
        if ((524288 & i) == 0) {
            this.isVoucher = null;
        } else {
            this.isVoucher = num7;
        }
        if ((1048576 & i) == 0) {
            this.platformType = null;
        } else {
            this.platformType = num8;
        }
        if ((2097152 & i) == 0) {
            this.logIndex = null;
        } else {
            this.logIndex = num9;
        }
        if ((4194304 & i) == 0) {
            this.cefiSupport = false;
        } else {
            this.cefiSupport = z4;
        }
        if ((8388608 & i) == 0) {
            this.tokenCategory = null;
        } else {
            this.tokenCategory = num10;
        }
        if ((16777216 & i) == 0) {
            this.coinDetailId = null;
        } else {
            this.coinDetailId = l6;
        }
        if ((33554432 & i) == 0) {
            this.realChainId = null;
        } else {
            this.realChainId = l7;
        }
        if ((67108864 & i) == 0) {
            this.chainName = null;
        } else {
            this.chainName = str6;
        }
        if ((134217728 & i) == 0) {
            this.tokenType = null;
        } else {
            this.tokenType = str7;
        }
        if ((268435456 & i) == 0) {
            this.aggregation = false;
        } else {
            this.aggregation = z5;
        }
        if ((536870912 & i) == 0) {
            this.tokenSort = null;
        } else {
            this.tokenSort = num11;
        }
        if ((1073741824 & i) == 0) {
            this.userRelation = false;
        } else {
            this.userRelation = z6;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.supportPush = false;
        } else {
            this.supportPush = z7;
        }
        if ((i2 & 1) == 0) {
            this.chainId = null;
        } else {
            this.chainId = l8;
        }
        if ((i2 & 2) == 0) {
            this.chainIndex = null;
        } else {
            this.chainIndex = l9;
        }
        if ((i2 & 4) == 0) {
            this.supportShowDetail = false;
        } else {
            this.supportShowDetail = z8;
        }
        if ((i2 & 8) == 0) {
            this.explorerUrl = null;
        } else {
            this.explorerUrl = str8;
        }
        if ((i2 & 16) == 0) {
            this.isCaseSensitivity = false;
        } else {
            this.isCaseSensitivity = z9;
        }
        if ((i2 & 32) == 0) {
            this.currencyId = null;
        } else {
            this.currencyId = num12;
        }
        if ((i2 & 64) == 0) {
            this.mpcSignType = null;
        } else {
            this.mpcSignType = num13;
        }
        if ((i2 & 128) == 0) {
            this.orderDecimalNum = null;
        } else {
            this.orderDecimalNum = num14;
        }
        if ((i2 & 256) == 0) {
            this.systemToken = false;
        } else {
            this.systemToken = z10;
        }
        if ((i2 & 512) == 0) {
            this.aaSupport = false;
        } else {
            this.aaSupport = z11;
        }
        if ((i2 & 1024) == 0) {
            this.isHotNetwork = false;
        } else {
            this.isHotNetwork = z12;
        }
        if ((i2 & 2048) == 0) {
            this.chainImageUrl = null;
        } else {
            this.chainImageUrl = str9;
        }
        if ((i2 & 4096) == 0) {
            this.isHighQuality = null;
        } else {
            this.isHighQuality = num15;
        }
        if ((i2 & 8192) == 0) {
            this.isRiskType = false;
        } else {
            this.isRiskType = z13;
        }
        if ((i2 & 16384) == 0) {
            this.supportStableCoinInterest = false;
        } else {
            this.supportStableCoinInterest = z14;
        }
        if ((i2 & 32768) == 0) {
            this.vdecimalNum = null;
        } else {
            this.vdecimalNum = num16;
        }
        if ((i2 & 65536) == 0) {
            this.simageUrl = null;
        } else {
            this.simageUrl = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CoinInfoResponse coinInfoResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || coinInfoResponse.coinId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, coinInfoResponse.coinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || coinInfoResponse.name != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, coinInfoResponse.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || coinInfoResponse.symbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, coinInfoResponse.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || coinInfoResponse.accountType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, coinInfoResponse.accountType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || coinInfoResponse.decimalNum != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, coinInfoResponse.decimalNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || coinInfoResponse.baseCoinId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, coinInfoResponse.baseCoinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || coinInfoResponse.okexCoinId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, LongSerializer.INSTANCE, coinInfoResponse.okexCoinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || coinInfoResponse.address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, coinInfoResponse.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || coinInfoResponse.tokenAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, coinInfoResponse.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || coinInfoResponse.rank != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, coinInfoResponse.rank);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || coinInfoResponse.coinType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.INSTANCE, coinInfoResponse.coinType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || coinInfoResponse.isVisible) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 11, coinInfoResponse.isVisible);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || coinInfoResponse.imageUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, coinInfoResponse.imageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || coinInfoResponse.isDelete) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 13, coinInfoResponse.isDelete);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || coinInfoResponse.blockHeight != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, LongSerializer.INSTANCE, coinInfoResponse.blockHeight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || coinInfoResponse.supportVersion != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, LongSerializer.INSTANCE, coinInfoResponse.supportVersion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || coinInfoResponse.isDefault) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 16, coinInfoResponse.isDefault);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || coinInfoResponse.riskType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, IntSerializer.INSTANCE, coinInfoResponse.riskType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || coinInfoResponse.isAggregation != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, IntSerializer.INSTANCE, coinInfoResponse.isAggregation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || coinInfoResponse.isVoucher != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, IntSerializer.INSTANCE, coinInfoResponse.isVoucher);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || coinInfoResponse.platformType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, IntSerializer.INSTANCE, coinInfoResponse.platformType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || coinInfoResponse.logIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, IntSerializer.INSTANCE, coinInfoResponse.logIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || coinInfoResponse.cefiSupport) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 22, coinInfoResponse.cefiSupport);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || coinInfoResponse.tokenCategory != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, IntSerializer.INSTANCE, coinInfoResponse.tokenCategory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || coinInfoResponse.coinDetailId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, LongSerializer.INSTANCE, coinInfoResponse.coinDetailId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || coinInfoResponse.realChainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, LongSerializer.INSTANCE, coinInfoResponse.realChainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || coinInfoResponse.chainName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, coinInfoResponse.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || coinInfoResponse.tokenType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, StringSerializer.INSTANCE, coinInfoResponse.tokenType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || coinInfoResponse.aggregation) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 28, coinInfoResponse.aggregation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || coinInfoResponse.tokenSort != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, IntSerializer.INSTANCE, coinInfoResponse.tokenSort);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || coinInfoResponse.userRelation) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 30, coinInfoResponse.userRelation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || coinInfoResponse.supportPush) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 31, coinInfoResponse.supportPush);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || coinInfoResponse.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, LongSerializer.INSTANCE, coinInfoResponse.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || coinInfoResponse.chainIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, LongSerializer.INSTANCE, coinInfoResponse.chainIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || coinInfoResponse.supportShowDetail) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 34, coinInfoResponse.supportShowDetail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || coinInfoResponse.explorerUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, StringSerializer.INSTANCE, coinInfoResponse.explorerUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || coinInfoResponse.isCaseSensitivity) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 36, coinInfoResponse.isCaseSensitivity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || coinInfoResponse.currencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, IntSerializer.INSTANCE, coinInfoResponse.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || coinInfoResponse.mpcSignType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 38, IntSerializer.INSTANCE, coinInfoResponse.mpcSignType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || coinInfoResponse.orderDecimalNum != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 39, IntSerializer.INSTANCE, coinInfoResponse.orderDecimalNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || coinInfoResponse.systemToken) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 40, coinInfoResponse.systemToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || coinInfoResponse.aaSupport) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 41, coinInfoResponse.aaSupport);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || coinInfoResponse.isHotNetwork) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 42, coinInfoResponse.isHotNetwork);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || coinInfoResponse.chainImageUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 43, StringSerializer.INSTANCE, coinInfoResponse.chainImageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || coinInfoResponse.isHighQuality != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 44, IntSerializer.INSTANCE, coinInfoResponse.isHighQuality);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || coinInfoResponse.isRiskType) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 45, coinInfoResponse.isRiskType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || coinInfoResponse.supportStableCoinInterest) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 46, coinInfoResponse.supportStableCoinInterest);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || coinInfoResponse.vdecimalNum != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 47, IntSerializer.INSTANCE, coinInfoResponse.vdecimalNum);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) && coinInfoResponse.simageUrl == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 48, StringSerializer.INSTANCE, coinInfoResponse.simageUrl);
    }

    public CoinInfoResponse(Long l, String str, String str2, Integer num, Integer num2, Long l2, Long l3, String str3, String str4, Integer num3, Integer num4, boolean z, String str5, boolean z2, Long l4, Long l5, boolean z3, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, boolean z4, Integer num10, Long l6, Long l7, String str6, String str7, boolean z5, Integer num11, boolean z6, boolean z7, Long l8, Long l9, boolean z8, String str8, boolean z9, Integer num12, Integer num13, Integer num14, boolean z10, boolean z11, boolean z12, String str9, Integer num15, boolean z13, boolean z14, Integer num16, String str10) {
        this.coinId = l;
        this.name = str;
        this.symbol = str2;
        this.accountType = num;
        this.decimalNum = num2;
        this.baseCoinId = l2;
        this.okexCoinId = l3;
        this.address = str3;
        this.tokenAddress = str4;
        this.rank = num3;
        this.coinType = num4;
        this.isVisible = z;
        this.imageUrl = str5;
        this.isDelete = z2;
        this.blockHeight = l4;
        this.supportVersion = l5;
        this.isDefault = z3;
        this.riskType = num5;
        this.isAggregation = num6;
        this.isVoucher = num7;
        this.platformType = num8;
        this.logIndex = num9;
        this.cefiSupport = z4;
        this.tokenCategory = num10;
        this.coinDetailId = l6;
        this.realChainId = l7;
        this.chainName = str6;
        this.tokenType = str7;
        this.aggregation = z5;
        this.tokenSort = num11;
        this.userRelation = z6;
        this.supportPush = z7;
        this.chainId = l8;
        this.chainIndex = l9;
        this.supportShowDetail = z8;
        this.explorerUrl = str8;
        this.isCaseSensitivity = z9;
        this.currencyId = num12;
        this.mpcSignType = num13;
        this.orderDecimalNum = num14;
        this.systemToken = z10;
        this.aaSupport = z11;
        this.isHotNetwork = z12;
        this.chainImageUrl = str9;
        this.isHighQuality = num15;
        this.isRiskType = z13;
        this.supportStableCoinInterest = z14;
        this.vdecimalNum = num16;
        this.simageUrl = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x023d: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0004: ARITH (r99v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r50v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r99v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r99v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001c: ARITH (r99v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r53v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0024: ARITH (r99v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r54v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x002c: ARITH (r99v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r55v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0034: ARITH (r99v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r56v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r99v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r99v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r58v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x004c: ARITH (r99v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r59v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0054: ARITH (r99v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r60v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005c: ARITH (r99v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r61v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r99v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r62v0 java.lang.String))
  (wrap:boolean:0x0074: TERNARY null = ((wrap:int:0x006c: ARITH (r99v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r63v0 boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0076: ARITH (r99v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r64v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0081: ARITH (r99v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r65v0 java.lang.Long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x008c: ARITH (r99v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? false : (r66v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0097: ARITH (r99v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r67v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00a2: ARITH (r99v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r68v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00ad: ARITH (r99v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r69v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00b8: ARITH (r99v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r70v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00c3: ARITH (r99v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r71v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00ce: ARITH (r99v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? false : (r72v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00d9: ARITH (r99v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r73v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x00e4: ARITH (r99v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r74v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x00ef: ARITH (r99v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r75v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fa: ARITH (r99v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r76v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0105: ARITH (r99v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r77v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0110: ARITH (r99v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? false : (r78v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x011b: ARITH (r99v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r79v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0126: ARITH (r99v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? false : (r80v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0131: ARITH (r99v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? false : (r81v0 boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0139: ARITH (r100v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r82v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0142: ARITH (r100v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r83v0 java.lang.Long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x014b: ARITH (r100v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r84v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0154: ARITH (r100v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r85v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x015d: ARITH (r100v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r86v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0166: ARITH (r100v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r87v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x016f: ARITH (r100v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r88v0 java.lang.Integer))
  (wrap:java.lang.Integer:0x0182: TERNARY null = ((wrap:int:0x017a: ARITH (r100v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r89v0 java.lang.Integer))
  (wrap:boolean:0x018c: TERNARY null = ((wrap:int:0x0184: ARITH (r100v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r90v0 boolean))
  (wrap:boolean:0x0196: TERNARY null = ((wrap:int:0x018e: ARITH (r100v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r91v0 boolean))
  (wrap:boolean:0x01a0: TERNARY null = ((wrap:int:0x0198: ARITH (r100v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r92v0 boolean))
  (wrap:java.lang.String:0x01aa: TERNARY null = ((wrap:int:0x01a2: ARITH (r100v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r93v0 java.lang.String))
  (wrap:java.lang.Integer:0x01b4: TERNARY null = ((wrap:int:0x01ac: ARITH (r100v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r94v0 java.lang.Integer))
  (wrap:boolean:0x01be: TERNARY null = ((wrap:int:0x01b6: ARITH (r100v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r95v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x01c0: ARITH (r100v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r96v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x01c8: ARITH (r100v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r97v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01d1: ARITH (r100v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r98v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, boolean, java.lang.String, boolean, java.lang.Long, java.lang.Long, boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, boolean, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, boolean, java.lang.Integer, boolean, boolean, java.lang.Long, java.lang.Long, boolean, java.lang.String, boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, boolean, boolean, boolean, java.lang.String, java.lang.Integer, boolean, boolean, java.lang.Integer, java.lang.String):void (m)] (LINE:2022) call: com.okinc.business.defi.biz.net.bean.CoinInfoResponse.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, boolean, java.lang.String, boolean, java.lang.Long, java.lang.Long, boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, boolean, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, boolean, java.lang.Integer, boolean, boolean, java.lang.Long, java.lang.Long, boolean, java.lang.String, boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, boolean, boolean, boolean, java.lang.String, java.lang.Integer, boolean, boolean, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ CoinInfoResponse(Long l, String str, String str2, Integer num, Integer num2, Long l2, Long l3, String str3, String str4, Integer num3, Integer num4, boolean z, String str5, boolean z2, Long l4, Long l5, boolean z3, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, boolean z4, Integer num10, Long l6, Long l7, String str6, String str7, boolean z5, Integer num11, boolean z6, boolean z7, Long l8, Long l9, boolean z8, String str8, boolean z9, Integer num12, Integer num13, Integer num14, boolean z10, boolean z11, boolean z12, String str9, Integer num15, boolean z13, boolean z14, Integer num16, String str10, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? null : l3, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : num3, (i & 1024) != 0 ? null : num4, (i & 2048) != 0 ? false : z, (i & 4096) != 0 ? null : str5, (i & 8192) != 0 ? false : z2, (i & 16384) != 0 ? null : l4, (i & 32768) != 0 ? null : l5, (i & 65536) != 0 ? false : z3, (i & 131072) != 0 ? null : num5, (i & 262144) != 0 ? null : num6, (i & 524288) != 0 ? null : num7, (i & 1048576) != 0 ? null : num8, (i & 2097152) != 0 ? null : num9, (i & 4194304) != 0 ? false : z4, (i & 8388608) != 0 ? null : num10, (i & 16777216) != 0 ? null : l6, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : l7, (i & 67108864) != 0 ? null : str6, (i & 134217728) != 0 ? null : str7, (i & 268435456) != 0 ? false : z5, (i & 536870912) != 0 ? null : num11, (i & 1073741824) != 0 ? false : z6, (i & Integer.MIN_VALUE) != 0 ? false : z7, (i2 & 1) != 0 ? null : l8, (i2 & 2) != 0 ? null : l9, (i2 & 4) != 0 ? false : z8, (i2 & 8) != 0 ? null : str8, (i2 & 16) != 0 ? false : z9, (i2 & 32) != 0 ? null : num12, (i2 & 64) != 0 ? null : num13, (i2 & 128) != 0 ? null : num14, (i2 & 256) != 0 ? false : z10, (i2 & 512) != 0 ? false : z11, (i2 & 1024) != 0 ? false : z12, (i2 & 2048) != 0 ? null : str9, (i2 & 4096) != 0 ? null : num15, (i2 & 8192) != 0 ? false : z13, (i2 & 16384) != 0 ? false : z14, (i2 & 32768) != 0 ? null : num16, (i2 & 65536) != 0 ? null : str10);
    }
}
