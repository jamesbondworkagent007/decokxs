package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class CoinMetaBean implements Parcelable {
    public static final int COIN_CATEGORY_CUSTOM_COIN = 3;
    public static final int COIN_CATEGORY_FULL_ASSET_COIN = 2;
    public static final int COIN_CATEGORY_PLATFORM = 1;
    public static final int COIN_CATEGORY_TEMPORARY_COIN = 4;
    public static final int COIN_RISK_TYPE_AIRDROP = 1;
    public static final int COIN_RISK_TYPE_DEFAULT = 0;
    public static final int COIN_RISK_TYPE_GASMINT = 3;
    public static final int COIN_RISK_TYPE_HONEYPOT = 2;
    private Boolean aaSupport;
    private String address;
    private int aggregationType;
    private long baseCoinId;
    private boolean cefiSupport;
    private String chainAddressPrefix;
    private long chainId;
    private String chainImageUrl;
    private String chainName;
    private int coinCategory;
    private long coinId;
    private int coinType;
    private int currencyId;
    private int decimalNum;
    private int displayPrecision;
    private String explorerUrl;
    private FactionInfo factionInfo;
    private int hotNetworkRank;
    private String imageUrl;
    private boolean isDefault;
    private final Integer isHighQuality;
    private boolean isHotNetwork;
    private boolean isVisible;
    private String name;
    private int orderDecimalNum;
    private int platformType;
    private Integer protocolId;
    private Integer protocolType;
    private long realChainId;
    private final Integer riskType;

    @SerializedName("rank")
    private Integer sort;
    private boolean stableCoin;
    private Boolean supportFullHistory;
    private boolean supportPush;
    private boolean supportShowDetail;
    private boolean supportStableCoinInterest;
    private Long supportVersion;
    private String symbol;
    private Boolean systemToken;
    private int tokenSort;
    private String tokenType;
    private int vdecimalNum;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CoinMetaBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CoinMetaBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinMetaBean createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            long j4 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            String string7 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z3 = parcel.readInt() != 0;
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            int i7 = parcel.readInt();
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            String string8 = parcel.readString();
            FactionInfo factionInfoCreateFromParcel = parcel.readInt() == 0 ? null : FactionInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            int i8 = parcel.readInt();
            int i9 = parcel.readInt();
            boolean z6 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CoinMetaBean(j, j2, j3, j4, string, string2, string3, string4, string5, string6, i, i2, i3, i4, string7, z, z2, numValueOf, z3, i5, i6, i7, z4, z5, string8, factionInfoCreateFromParcel, boolValueOf, i8, i9, z6, boolValueOf2, lValueOf, boolValueOf3, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinMetaBean[] newArray(int i) {
            return new CoinMetaBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoinMetaBean() {
        this(0L, 0L, 0L, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, 0, (String) null, false, false, (Integer) null, false, 0, 0, 0, false, false, (String) null, (FactionInfo) null, (Boolean) null, 0, 0, false, (Boolean) null, (Long) null, (Boolean) null, (Integer) null, (Integer) null, 0, (Integer) null, (Integer) null, false, 0, false, (String) null, -1, 1023, (DefaultConstructorMarker) null);
    }

    @SerialName("rank")
    public static /* synthetic */ void getSort$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.decimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component12() {
        return this.vdecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.orderDecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component14() {
        return this.coinType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.tokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component16() {
        return this.isDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component17() {
        return this.isVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component18() {
        return this.sort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component19() {
        return this.isHotNetwork;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.baseCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component20() {
        return this.hotNetworkRank;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component21() {
        return this.aggregationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component22() {
        return this.tokenSort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component23() {
        return this.supportPush;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component24() {
        return this.supportShowDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FactionInfo component26() {
        return this.factionInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component27() {
        return this.systemToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component28() {
        return this.platformType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component29() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component30() {
        return this.cefiSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component31() {
        return this.aaSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component32() {
        return this.supportVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component33() {
        return this.supportFullHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component34() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component35() {
        return this.protocolType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component36() {
        return this.coinCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component37() {
        return this.riskType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component38() {
        return this.isHighQuality;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component39() {
        return this.stableCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.realChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component40() {
        return this.displayPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component41() {
        return this.supportStableCoinInterest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.chainAddressPrefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.chainImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinMetaBean copy(long j, long j2, long j3, long j4, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i, int i2, int i3, int i4, @NotNull String str7, boolean z, boolean z2, @JsonProperty(valueOf = "rank") Integer num, boolean z3, int i5, int i6, int i7, boolean z4, boolean z5, @NotNull String str8, FactionInfo factionInfo, Boolean bool, int i8, int i9, boolean z6, Boolean bool2, Long l, Boolean bool3, Integer num2, Integer num3, int i10, Integer num4, Integer num5, boolean z7, int i11, boolean z8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new CoinMetaBean(j, j2, j3, j4, str, str2, str3, str4, str5, str6, i, i2, i3, i4, str7, z, z2, num, z3, i5, i6, i7, z4, z5, str8, factionInfo, bool, i8, i9, z6, bool2, l, bool3, num2, num3, i10, num4, num5, z7, i11, z8, str9);
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
        if (!(obj instanceof CoinMetaBean)) {
            return false;
        }
        CoinMetaBean coinMetaBean = (CoinMetaBean) obj;
        return this.coinId == coinMetaBean.coinId && this.baseCoinId == coinMetaBean.baseCoinId && this.chainId == coinMetaBean.chainId && this.realChainId == coinMetaBean.realChainId && Intrinsics.EZpvd((Object) this.name, (Object) coinMetaBean.name) && Intrinsics.EZpvd((Object) this.chainName, (Object) coinMetaBean.chainName) && Intrinsics.EZpvd((Object) this.symbol, (Object) coinMetaBean.symbol) && Intrinsics.EZpvd((Object) this.imageUrl, (Object) coinMetaBean.imageUrl) && Intrinsics.EZpvd((Object) this.chainImageUrl, (Object) coinMetaBean.chainImageUrl) && Intrinsics.EZpvd((Object) this.address, (Object) coinMetaBean.address) && this.decimalNum == coinMetaBean.decimalNum && this.vdecimalNum == coinMetaBean.vdecimalNum && this.orderDecimalNum == coinMetaBean.orderDecimalNum && this.coinType == coinMetaBean.coinType && Intrinsics.EZpvd((Object) this.tokenType, (Object) coinMetaBean.tokenType) && this.isDefault == coinMetaBean.isDefault && this.isVisible == coinMetaBean.isVisible && Intrinsics.EZpvd(this.sort, coinMetaBean.sort) && this.isHotNetwork == coinMetaBean.isHotNetwork && this.hotNetworkRank == coinMetaBean.hotNetworkRank && this.aggregationType == coinMetaBean.aggregationType && this.tokenSort == coinMetaBean.tokenSort && this.supportPush == coinMetaBean.supportPush && this.supportShowDetail == coinMetaBean.supportShowDetail && Intrinsics.EZpvd((Object) this.explorerUrl, (Object) coinMetaBean.explorerUrl) && Intrinsics.EZpvd(this.factionInfo, coinMetaBean.factionInfo) && Intrinsics.EZpvd(this.systemToken, coinMetaBean.systemToken) && this.platformType == coinMetaBean.platformType && this.currencyId == coinMetaBean.currencyId && this.cefiSupport == coinMetaBean.cefiSupport && Intrinsics.EZpvd(this.aaSupport, coinMetaBean.aaSupport) && Intrinsics.EZpvd(this.supportVersion, coinMetaBean.supportVersion) && Intrinsics.EZpvd(this.supportFullHistory, coinMetaBean.supportFullHistory) && Intrinsics.EZpvd(this.protocolId, coinMetaBean.protocolId) && Intrinsics.EZpvd(this.protocolType, coinMetaBean.protocolType) && this.coinCategory == coinMetaBean.coinCategory && Intrinsics.EZpvd(this.riskType, coinMetaBean.riskType) && Intrinsics.EZpvd(this.isHighQuality, coinMetaBean.isHighQuality) && this.stableCoin == coinMetaBean.stableCoin && this.displayPrecision == coinMetaBean.displayPrecision && this.supportStableCoinInterest == coinMetaBean.supportStableCoinInterest && Intrinsics.EZpvd((Object) this.chainAddressPrefix, (Object) coinMetaBean.chainAddressPrefix);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAaSupport() {
        return this.aaSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAggregationType() {
        return this.aggregationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getBaseCoinId() {
        return this.baseCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCefiSupport() {
        return this.cefiSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainAddressPrefix() {
        return this.chainAddressPrefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainImageUrl() {
        return this.chainImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCoinCategory() {
        return this.coinCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCoinType() {
        return this.coinType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDecimalNum() {
        return this.decimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDisplayPrecision() {
        return this.displayPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExplorerUrl() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FactionInfo getFactionInfo() {
        return this.factionInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getHotNetworkRank() {
        return this.hotNetworkRank;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderDecimalNum() {
        return this.orderDecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPlatformType() {
        return this.platformType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getProtocolId() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getProtocolType() {
        return this.protocolType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getRealChainId() {
        return this.realChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRiskType() {
        return this.riskType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSort() {
        return this.sort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getStableCoin() {
        return this.stableCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSupportFullHistory() {
        return this.supportFullHistory;
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
    public final Boolean getSystemToken() {
        return this.systemToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTokenSort() {
        return this.tokenSort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenType() {
        return this.tokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getVdecimalNum() {
        return this.vdecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.coinId);
        int iHashCode2 = Long.hashCode(this.baseCoinId);
        int iHashCode3 = Long.hashCode(this.chainId);
        int iHashCode4 = Long.hashCode(this.realChainId);
        int iHashCode5 = this.name.hashCode();
        int iHashCode6 = this.chainName.hashCode();
        int iHashCode7 = this.symbol.hashCode();
        int iHashCode8 = this.imageUrl.hashCode();
        int iHashCode9 = this.chainImageUrl.hashCode();
        int iHashCode10 = this.address.hashCode();
        int iHashCode11 = Integer.hashCode(this.decimalNum);
        int iHashCode12 = Integer.hashCode(this.vdecimalNum);
        int iHashCode13 = Integer.hashCode(this.orderDecimalNum);
        int iHashCode14 = Integer.hashCode(this.coinType);
        int iHashCode15 = this.tokenType.hashCode();
        int iHashCode16 = Boolean.hashCode(this.isDefault);
        int iHashCode17 = Boolean.hashCode(this.isVisible);
        Integer num = this.sort;
        int iHashCode18 = num == null ? 0 : num.hashCode();
        int iHashCode19 = Boolean.hashCode(this.isHotNetwork);
        int iHashCode20 = Integer.hashCode(this.hotNetworkRank);
        int iHashCode21 = Integer.hashCode(this.aggregationType);
        int iHashCode22 = Integer.hashCode(this.tokenSort);
        int iHashCode23 = Boolean.hashCode(this.supportPush);
        int iHashCode24 = Boolean.hashCode(this.supportShowDetail);
        int iHashCode25 = this.explorerUrl.hashCode();
        FactionInfo factionInfo = this.factionInfo;
        int iHashCode26 = factionInfo == null ? 0 : factionInfo.hashCode();
        Boolean bool = this.systemToken;
        int iHashCode27 = bool == null ? 0 : bool.hashCode();
        int iHashCode28 = Integer.hashCode(this.platformType);
        int iHashCode29 = Integer.hashCode(this.currencyId);
        int iHashCode30 = Boolean.hashCode(this.cefiSupport);
        Boolean bool2 = this.aaSupport;
        int iHashCode31 = bool2 == null ? 0 : bool2.hashCode();
        Long l = this.supportVersion;
        int iHashCode32 = l == null ? 0 : l.hashCode();
        Boolean bool3 = this.supportFullHistory;
        int iHashCode33 = bool3 == null ? 0 : bool3.hashCode();
        Integer num2 = this.protocolId;
        int iHashCode34 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.protocolType;
        int iHashCode35 = num3 == null ? 0 : num3.hashCode();
        int iHashCode36 = Integer.hashCode(this.coinCategory);
        Integer num4 = this.riskType;
        int iHashCode37 = num4 == null ? 0 : num4.hashCode();
        Integer num5 = this.isHighQuality;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + (num5 != null ? num5.hashCode() : 0)) * 31) + Boolean.hashCode(this.stableCoin)) * 31) + Integer.hashCode(this.displayPrecision)) * 31) + Boolean.hashCode(this.supportStableCoinInterest)) * 31) + this.chainAddressPrefix.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDefault() {
        return this.isDefault;
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
    public final boolean isVisible() {
        return this.isVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAaSupport(Boolean bool) {
        this.aaSupport = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAggregationType(int i) {
        this.aggregationType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCoinId(long j) {
        this.baseCoinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCefiSupport(boolean z) {
        this.cefiSupport = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainAddressPrefix(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainAddressPrefix = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(long j) {
        this.chainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainImageUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainImageUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinCategory(int i) {
        this.coinCategory = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinType(int i) {
        this.coinType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(int i) {
        this.currencyId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDecimalNum(int i) {
        this.decimalNum = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefault(boolean z) {
        this.isDefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayPrecision(int i) {
        this.displayPrecision = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExplorerUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.explorerUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFactionInfo(FactionInfo factionInfo) {
        this.factionInfo = factionInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHotNetwork(boolean z) {
        this.isHotNetwork = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHotNetworkRank(int i) {
        this.hotNetworkRank = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.imageUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderDecimalNum(int i) {
        this.orderDecimalNum = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlatformType(int i) {
        this.platformType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProtocolId(Integer num) {
        this.protocolId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProtocolType(Integer num) {
        this.protocolType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRealChainId(long j) {
        this.realChainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSort(Integer num) {
        this.sort = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStableCoin(boolean z) {
        this.stableCoin = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportFullHistory(Boolean bool) {
        this.supportFullHistory = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportPush(boolean z) {
        this.supportPush = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportShowDetail(boolean z) {
        this.supportShowDetail = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportStableCoinInterest(boolean z) {
        this.supportStableCoinInterest = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportVersion(Long l) {
        this.supportVersion = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.symbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSystemToken(Boolean bool) {
        this.systemToken = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenSort(int i) {
        this.tokenSort = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVdecimalNum(int i) {
        this.vdecimalNum = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinMetaBean(coinId=" + this.coinId + ", baseCoinId=" + this.baseCoinId + ", chainId=" + this.chainId + ", realChainId=" + this.realChainId + ", name=" + this.name + ", chainName=" + this.chainName + ", symbol=" + this.symbol + ", imageUrl=" + this.imageUrl + ", chainImageUrl=" + this.chainImageUrl + ", address=" + this.address + ", decimalNum=" + this.decimalNum + ", vdecimalNum=" + this.vdecimalNum + ", orderDecimalNum=" + this.orderDecimalNum + ", coinType=" + this.coinType + ", tokenType=" + this.tokenType + ", isDefault=" + this.isDefault + ", isVisible=" + this.isVisible + ", sort=" + this.sort + ", isHotNetwork=" + this.isHotNetwork + ", hotNetworkRank=" + this.hotNetworkRank + ", aggregationType=" + this.aggregationType + ", tokenSort=" + this.tokenSort + ", supportPush=" + this.supportPush + ", supportShowDetail=" + this.supportShowDetail + ", explorerUrl=" + this.explorerUrl + ", factionInfo=" + this.factionInfo + ", systemToken=" + this.systemToken + ", platformType=" + this.platformType + ", currencyId=" + this.currencyId + ", cefiSupport=" + this.cefiSupport + ", aaSupport=" + this.aaSupport + ", supportVersion=" + this.supportVersion + ", supportFullHistory=" + this.supportFullHistory + ", protocolId=" + this.protocolId + ", protocolType=" + this.protocolType + ", coinCategory=" + this.coinCategory + ", riskType=" + this.riskType + ", isHighQuality=" + this.isHighQuality + ", stableCoin=" + this.stableCoin + ", displayPrecision=" + this.displayPrecision + ", supportStableCoinInterest=" + this.supportStableCoinInterest + ", chainAddressPrefix=" + this.chainAddressPrefix + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.coinId);
        parcel.writeLong(this.baseCoinId);
        parcel.writeLong(this.chainId);
        parcel.writeLong(this.realChainId);
        parcel.writeString(this.name);
        parcel.writeString(this.chainName);
        parcel.writeString(this.symbol);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.chainImageUrl);
        parcel.writeString(this.address);
        parcel.writeInt(this.decimalNum);
        parcel.writeInt(this.vdecimalNum);
        parcel.writeInt(this.orderDecimalNum);
        parcel.writeInt(this.coinType);
        parcel.writeString(this.tokenType);
        parcel.writeInt(this.isDefault ? 1 : 0);
        parcel.writeInt(this.isVisible ? 1 : 0);
        Integer num = this.sort;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.isHotNetwork ? 1 : 0);
        parcel.writeInt(this.hotNetworkRank);
        parcel.writeInt(this.aggregationType);
        parcel.writeInt(this.tokenSort);
        parcel.writeInt(this.supportPush ? 1 : 0);
        parcel.writeInt(this.supportShowDetail ? 1 : 0);
        parcel.writeString(this.explorerUrl);
        FactionInfo factionInfo = this.factionInfo;
        if (factionInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            factionInfo.writeToParcel(parcel, i);
        }
        Boolean bool = this.systemToken;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.platformType);
        parcel.writeInt(this.currencyId);
        parcel.writeInt(this.cefiSupport ? 1 : 0);
        Boolean bool2 = this.aaSupport;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Long l = this.supportVersion;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Boolean bool3 = this.supportFullHistory;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Integer num2 = this.protocolId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.protocolType;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeInt(this.coinCategory);
        Integer num4 = this.riskType;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.isHighQuality;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        parcel.writeInt(this.stableCoin ? 1 : 0);
        parcel.writeInt(this.displayPrecision);
        parcel.writeInt(this.supportStableCoinInterest ? 1 : 0);
        parcel.writeString(this.chainAddressPrefix);
    }

    public /* synthetic */ CoinMetaBean(int i, int i2, long j, long j2, long j3, long j4, String str, String str2, String str3, String str4, String str5, String str6, int i3, int i4, int i5, int i6, String str7, boolean z, boolean z2, Integer num, boolean z3, int i7, int i8, int i9, boolean z4, boolean z5, String str8, FactionInfo factionInfo, Boolean bool, int i10, int i11, boolean z6, Boolean bool2, Long l, Boolean bool3, Integer num2, Integer num3, int i12, Integer num4, Integer num5, boolean z7, int i13, boolean z8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coinId = 0L;
        } else {
            this.coinId = j;
        }
        if ((i & 2) == 0) {
            this.baseCoinId = 0L;
        } else {
            this.baseCoinId = j2;
        }
        this.chainId = (i & 4) == 0 ? -1L : j3;
        if ((i & 8) == 0) {
            this.realChainId = 0L;
        } else {
            this.realChainId = j4;
        }
        if ((i & 16) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        if ((i & 32) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str2;
        }
        if ((i & 64) == 0) {
            this.symbol = "";
        } else {
            this.symbol = str3;
        }
        if ((i & 128) == 0) {
            this.imageUrl = "";
        } else {
            this.imageUrl = str4;
        }
        if ((i & 256) == 0) {
            this.chainImageUrl = "";
        } else {
            this.chainImageUrl = str5;
        }
        if ((i & 512) == 0) {
            this.address = "";
        } else {
            this.address = str6;
        }
        if ((i & 1024) == 0) {
            this.decimalNum = 0;
        } else {
            this.decimalNum = i3;
        }
        if ((i & 2048) == 0) {
            this.vdecimalNum = 0;
        } else {
            this.vdecimalNum = i4;
        }
        if ((i & 4096) == 0) {
            this.orderDecimalNum = 0;
        } else {
            this.orderDecimalNum = i5;
        }
        if ((i & 8192) == 0) {
            this.coinType = 0;
        } else {
            this.coinType = i6;
        }
        if ((i & 16384) == 0) {
            this.tokenType = "";
        } else {
            this.tokenType = str7;
        }
        if ((32768 & i) == 0) {
            this.isDefault = false;
        } else {
            this.isDefault = z;
        }
        if ((65536 & i) == 0) {
            this.isVisible = false;
        } else {
            this.isVisible = z2;
        }
        this.sort = (131072 & i) == 0 ? 0 : num;
        if ((262144 & i) == 0) {
            this.isHotNetwork = false;
        } else {
            this.isHotNetwork = z3;
        }
        if ((524288 & i) == 0) {
            this.hotNetworkRank = 1;
        } else {
            this.hotNetworkRank = i7;
        }
        if ((1048576 & i) == 0) {
            this.aggregationType = 0;
        } else {
            this.aggregationType = i8;
        }
        if ((2097152 & i) == 0) {
            this.tokenSort = 0;
        } else {
            this.tokenSort = i9;
        }
        if ((4194304 & i) == 0) {
            this.supportPush = false;
        } else {
            this.supportPush = z4;
        }
        if ((8388608 & i) == 0) {
            this.supportShowDetail = false;
        } else {
            this.supportShowDetail = z5;
        }
        if ((16777216 & i) == 0) {
            this.explorerUrl = "";
        } else {
            this.explorerUrl = str8;
        }
        if ((33554432 & i) == 0) {
            this.factionInfo = null;
        } else {
            this.factionInfo = factionInfo;
        }
        if ((67108864 & i) == 0) {
            this.systemToken = null;
        } else {
            this.systemToken = bool;
        }
        if ((134217728 & i) == 0) {
            this.platformType = 0;
        } else {
            this.platformType = i10;
        }
        this.currencyId = (268435456 & i) == 0 ? -1 : i11;
        if ((536870912 & i) == 0) {
            this.cefiSupport = false;
        } else {
            this.cefiSupport = z6;
        }
        this.aaSupport = (1073741824 & i) == 0 ? Boolean.FALSE : bool2;
        this.supportVersion = (i & Integer.MIN_VALUE) == 0 ? 0L : l;
        this.supportFullHistory = (i2 & 1) == 0 ? Boolean.FALSE : bool3;
        if ((i2 & 2) == 0) {
            this.protocolId = null;
        } else {
            this.protocolId = num2;
        }
        if ((i2 & 4) == 0) {
            this.protocolType = null;
        } else {
            this.protocolType = num3;
        }
        if ((i2 & 8) == 0) {
            this.coinCategory = 1;
        } else {
            this.coinCategory = i12;
        }
        this.riskType = (i2 & 16) == 0 ? 0 : num4;
        this.isHighQuality = (i2 & 32) == 0 ? 1 : num5;
        if ((i2 & 64) == 0) {
            this.stableCoin = false;
        } else {
            this.stableCoin = z7;
        }
        this.displayPrecision = (i2 & 128) == 0 ? 6 : i13;
        if ((i2 & 256) == 0) {
            this.supportStableCoinInterest = false;
        } else {
            this.supportStableCoinInterest = z8;
        }
        if ((i2 & 512) == 0) {
            this.chainAddressPrefix = "";
        } else {
            this.chainAddressPrefix = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CoinMetaBean coinMetaBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Integer num2;
        Long l;
        Integer num3;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || coinMetaBean.coinId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, coinMetaBean.coinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || coinMetaBean.baseCoinId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, coinMetaBean.baseCoinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || coinMetaBean.chainId != -1) {
            compositeEncoder.encodeLongElement(serialDescriptor, 2, coinMetaBean.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || coinMetaBean.realChainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 3, coinMetaBean.realChainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) coinMetaBean.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, coinMetaBean.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) coinMetaBean.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, coinMetaBean.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) coinMetaBean.symbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, coinMetaBean.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) coinMetaBean.imageUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, coinMetaBean.imageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) coinMetaBean.chainImageUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, coinMetaBean.chainImageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) coinMetaBean.address, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, coinMetaBean.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || coinMetaBean.decimalNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 10, coinMetaBean.decimalNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || coinMetaBean.vdecimalNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 11, coinMetaBean.vdecimalNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || coinMetaBean.orderDecimalNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 12, coinMetaBean.orderDecimalNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || coinMetaBean.coinType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 13, coinMetaBean.coinType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) coinMetaBean.tokenType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, coinMetaBean.tokenType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || coinMetaBean.isDefault) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 15, coinMetaBean.isDefault);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || coinMetaBean.isVisible) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 16, coinMetaBean.isVisible);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || (num3 = coinMetaBean.sort) == null || num3.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, IntSerializer.INSTANCE, coinMetaBean.sort);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || coinMetaBean.isHotNetwork) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 18, coinMetaBean.isHotNetwork);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || coinMetaBean.hotNetworkRank != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 19, coinMetaBean.hotNetworkRank);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || coinMetaBean.aggregationType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 20, coinMetaBean.aggregationType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || coinMetaBean.tokenSort != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 21, coinMetaBean.tokenSort);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || coinMetaBean.supportPush) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 22, coinMetaBean.supportPush);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || coinMetaBean.supportShowDetail) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 23, coinMetaBean.supportShowDetail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) coinMetaBean.explorerUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, coinMetaBean.explorerUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || coinMetaBean.factionInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, FactionInfo$$serializer.INSTANCE, coinMetaBean.factionInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || coinMetaBean.systemToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, BooleanSerializer.INSTANCE, coinMetaBean.systemToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || coinMetaBean.platformType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 27, coinMetaBean.platformType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || coinMetaBean.currencyId != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 28, coinMetaBean.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || coinMetaBean.cefiSupport) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 29, coinMetaBean.cefiSupport);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd(coinMetaBean.aaSupport, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, BooleanSerializer.INSTANCE, coinMetaBean.aaSupport);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || (l = coinMetaBean.supportVersion) == null || l.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, LongSerializer.INSTANCE, coinMetaBean.supportVersion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd(coinMetaBean.supportFullHistory, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, BooleanSerializer.INSTANCE, coinMetaBean.supportFullHistory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || coinMetaBean.protocolId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, IntSerializer.INSTANCE, coinMetaBean.protocolId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || coinMetaBean.protocolType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, IntSerializer.INSTANCE, coinMetaBean.protocolType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || coinMetaBean.coinCategory != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 35, coinMetaBean.coinCategory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || (num2 = coinMetaBean.riskType) == null || num2.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, IntSerializer.INSTANCE, coinMetaBean.riskType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || (num = coinMetaBean.isHighQuality) == null || num.intValue() != 1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, IntSerializer.INSTANCE, coinMetaBean.isHighQuality);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || coinMetaBean.stableCoin) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 38, coinMetaBean.stableCoin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || coinMetaBean.displayPrecision != 6) {
            compositeEncoder.encodeIntElement(serialDescriptor, 39, coinMetaBean.displayPrecision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || coinMetaBean.supportStableCoinInterest) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 40, coinMetaBean.supportStableCoinInterest);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) && Intrinsics.EZpvd((Object) coinMetaBean.chainAddressPrefix, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 41, coinMetaBean.chainAddressPrefix);
    }

    public CoinMetaBean(long j, long j2, long j3, long j4, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i, int i2, int i3, int i4, @NotNull String str7, boolean z, boolean z2, @JsonProperty(valueOf = "rank") Integer num, boolean z3, int i5, int i6, int i7, boolean z4, boolean z5, @NotNull String str8, FactionInfo factionInfo, Boolean bool, int i8, int i9, boolean z6, Boolean bool2, Long l, Boolean bool3, Integer num2, Integer num3, int i10, Integer num4, Integer num5, boolean z7, int i11, boolean z8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.coinId = j;
        this.baseCoinId = j2;
        this.chainId = j3;
        this.realChainId = j4;
        this.name = str;
        this.chainName = str2;
        this.symbol = str3;
        this.imageUrl = str4;
        this.chainImageUrl = str5;
        this.address = str6;
        this.decimalNum = i;
        this.vdecimalNum = i2;
        this.orderDecimalNum = i3;
        this.coinType = i4;
        this.tokenType = str7;
        this.isDefault = z;
        this.isVisible = z2;
        this.sort = num;
        this.isHotNetwork = z3;
        this.hotNetworkRank = i5;
        this.aggregationType = i6;
        this.tokenSort = i7;
        this.supportPush = z4;
        this.supportShowDetail = z5;
        this.explorerUrl = str8;
        this.factionInfo = factionInfo;
        this.systemToken = bool;
        this.platformType = i8;
        this.currencyId = i9;
        this.cefiSupport = z6;
        this.aaSupport = bool2;
        this.supportVersion = l;
        this.supportFullHistory = bool3;
        this.protocolId = num2;
        this.protocolType = num3;
        this.coinCategory = i10;
        this.riskType = num4;
        this.isHighQuality = num5;
        this.stableCoin = z7;
        this.displayPrecision = i11;
        this.supportStableCoinInterest = z8;
        this.chainAddressPrefix = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x020f: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0004: ARITH (r92v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r46v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000d: ARITH (r92v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r48v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0016: ARITH (r92v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r50v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x001f: ARITH (r92v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r52v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r92v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r92v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r92v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r92v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r92v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:0x005d: TERNARY null = ((wrap:int:0x0054: ARITH (r92v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:int:0x006a: TERNARY null = ((wrap:int:0x005f: ARITH (r92v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r60v0 int))
  (wrap:int:0x0075: TERNARY null = ((wrap:int:0x006c: ARITH (r92v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r61v0 int))
  (wrap:int:0x0080: TERNARY null = ((wrap:int:0x0077: ARITH (r92v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r62v0 int))
  (wrap:int:0x008b: TERNARY null = ((wrap:int:0x0082: ARITH (r92v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r63v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r92v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0099: ARITH (r92v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? false : (r65v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00a4: ARITH (r92v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? false : (r66v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00af: ARITH (r92v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r67v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00bc: ARITH (r92v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? false : (r68v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00c7: ARITH (r92v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r69v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00d4: ARITH (r92v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r70v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00df: ARITH (r92v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r71v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00ea: ARITH (r92v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? false : (r72v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00f5: ARITH (r92v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? false : (r73v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0100: ARITH (r92v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r74v0 java.lang.String))
  (wrap:com.okinc.business.defi.biz.net.bean.FactionInfo:?: TERNARY null = ((wrap:int:0x010b: ARITH (r92v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.FactionInfo) : (r75v0 com.okinc.business.defi.biz.net.bean.FactionInfo))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0118: ARITH (r92v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r76v0 java.lang.Boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0123: ARITH (r92v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r77v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x012e: ARITH (r92v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r78v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0139: ARITH (r92v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? false : (r79v0 boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0144: ARITH (r92v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0148: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r80v0 java.lang.Boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x014f: ARITH (r92v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (0 long) : (r81v0 java.lang.Long))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x015c: ARITH (r93v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0160: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r82v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0165: ARITH (r93v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r83v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x016e: ARITH (r93v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r84v0 java.lang.Integer) : (null java.lang.Integer))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0175: ARITH (r93v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r85v0 int))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x017e: ARITH (r93v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r86v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0189: ARITH (r93v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r87v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0194: ARITH (r93v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r88v0 boolean))
  (wrap:int:0x01a7: TERNARY null = ((wrap:int:0x019f: ARITH (r93v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (6 int) : (r89v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x01a9: ARITH (r93v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r90v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01b0: ARITH (r93v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r91v0 java.lang.String))
 A[MD:(long, long, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, int, java.lang.String, boolean, boolean, java.lang.Integer, boolean, int, int, int, boolean, boolean, java.lang.String, com.okinc.business.defi.biz.net.bean.FactionInfo, java.lang.Boolean, int, int, boolean, java.lang.Boolean, java.lang.Long, java.lang.Boolean, java.lang.Integer, java.lang.Integer, int, java.lang.Integer, java.lang.Integer, boolean, int, boolean, java.lang.String):void (m)] (LINE:39) call: com.okinc.business.defi.biz.net.bean.CoinMetaBean.<init>(long, long, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, int, java.lang.String, boolean, boolean, java.lang.Integer, boolean, int, int, int, boolean, boolean, java.lang.String, com.okinc.business.defi.biz.net.bean.FactionInfo, java.lang.Boolean, int, int, boolean, java.lang.Boolean, java.lang.Long, java.lang.Boolean, java.lang.Integer, java.lang.Integer, int, java.lang.Integer, java.lang.Integer, boolean, int, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ CoinMetaBean(long j, long j2, long j3, long j4, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3, int i4, String str7, boolean z, boolean z2, Integer num, boolean z3, int i5, int i6, int i7, boolean z4, boolean z5, String str8, FactionInfo factionInfo, Boolean bool, int i8, int i9, boolean z6, Boolean bool2, Long l, Boolean bool3, Integer num2, Integer num3, int i10, Integer num4, Integer num5, boolean z7, int i11, boolean z8, String str9, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0L : j, (i12 & 2) != 0 ? 0L : j2, (i12 & 4) != 0 ? -1L : j3, (i12 & 8) != 0 ? 0L : j4, (i12 & 16) != 0 ? "" : str, (i12 & 32) != 0 ? "" : str2, (i12 & 64) != 0 ? "" : str3, (i12 & 128) != 0 ? "" : str4, (i12 & 256) != 0 ? "" : str5, (i12 & 512) != 0 ? "" : str6, (i12 & 1024) != 0 ? 0 : i, (i12 & 2048) != 0 ? 0 : i2, (i12 & 4096) != 0 ? 0 : i3, (i12 & 8192) != 0 ? 0 : i4, (i12 & 16384) != 0 ? "" : str7, (i12 & 32768) != 0 ? false : z, (i12 & 65536) != 0 ? false : z2, (i12 & 131072) != 0 ? 0 : num, (i12 & 262144) != 0 ? false : z3, (i12 & 524288) != 0 ? 1 : i5, (i12 & 1048576) != 0 ? 0 : i6, (i12 & 2097152) != 0 ? 0 : i7, (i12 & 4194304) != 0 ? false : z4, (i12 & 8388608) != 0 ? false : z5, (i12 & 16777216) != 0 ? "" : str8, (i12 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : factionInfo, (i12 & 67108864) != 0 ? null : bool, (i12 & 134217728) != 0 ? 0 : i8, (i12 & 268435456) != 0 ? -1 : i9, (i12 & 536870912) != 0 ? false : z6, (i12 & 1073741824) != 0 ? Boolean.FALSE : bool2, (i12 & Integer.MIN_VALUE) != 0 ? 0L : l, (i13 & 1) != 0 ? Boolean.FALSE : bool3, (i13 & 2) != 0 ? null : num2, (i13 & 4) == 0 ? num3 : null, (i13 & 8) != 0 ? 1 : i10, (i13 & 16) != 0 ? 0 : num4, (i13 & 32) != 0 ? 1 : num5, (i13 & 64) != 0 ? false : z7, (i13 & 128) != 0 ? 6 : i11, (i13 & 256) == 0 ? z8 : false, (i13 & 512) != 0 ? "" : str9);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CoinMetaBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CoinMetaBean> serializer() {
            return CoinMetaBean$$serializer.INSTANCE;
        }
    }
}
