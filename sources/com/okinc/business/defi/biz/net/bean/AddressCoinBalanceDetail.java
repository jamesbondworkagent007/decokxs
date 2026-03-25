package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C10854bwM;
import o.C10948byA;
import o.C10954byG;
import o.C11600cUg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class AddressCoinBalanceDetail implements Parcelable {
    private final String address;
    private Integer aggregationType;
    private Long baseCoinId;
    private final String chainImageUrl;
    private final long chainIndex;
    private final String chainName;
    private final String coinAmount;
    private final String coinAmountOrigin;
    private Long coinId;
    private final AddressCoinPriceInfo coinPriceVo;
    private final String currencyAmount;
    private final String explorerUrl;
    private final String imageUrl;
    private final Integer isHighQuality;
    private final Boolean isRiskType;
    private final String name;
    private Boolean stableCoin;
    private final String symbol;
    private final String tokenType;
    private final String userAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddressCoinBalanceDetail> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AddressCoinBalanceDetail> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressCoinBalanceDetail createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            long j = parcel.readLong();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            AddressCoinPriceInfo addressCoinPriceInfoCreateFromParcel = parcel.readInt() == 0 ? null : AddressCoinPriceInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AddressCoinBalanceDetail(lValueOf, lValueOf2, string, string2, string3, string4, string5, string6, j, string7, string8, string9, string10, string11, string12, addressCoinPriceInfoCreateFromParcel, boolValueOf, numValueOf, boolValueOf2, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressCoinBalanceDetail[] newArray(int i) {
            return new AddressCoinBalanceDetail[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AddressCoinBalanceDetail() {
        this((Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (AddressCoinPriceInfo) null, (Boolean) null, (Integer) null, (Boolean) null, (Integer) null, 1048575, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.chainImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.userAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.coinAmountOrigin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressCoinPriceInfo component16() {
        return this.coinPriceVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component17() {
        return this.isRiskType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component18() {
        return this.isHighQuality;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component19() {
        return this.stableCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.baseCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component20() {
        return this.aggregationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component9() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressCoinBalanceDetail copy(Long l, Long l2, @NotNull String str, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, long j, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, AddressCoinPriceInfo addressCoinPriceInfo, Boolean bool, Integer num, Boolean bool2, Integer num2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        return new AddressCoinBalanceDetail(l, l2, str, str2, str3, str4, str5, str6, j, str7, str8, str9, str10, str11, str12, addressCoinPriceInfo, bool, num, bool2, num2);
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
        if (!(obj instanceof AddressCoinBalanceDetail)) {
            return false;
        }
        AddressCoinBalanceDetail addressCoinBalanceDetail = (AddressCoinBalanceDetail) obj;
        return Intrinsics.EZpvd(this.coinId, addressCoinBalanceDetail.coinId) && Intrinsics.EZpvd(this.baseCoinId, addressCoinBalanceDetail.baseCoinId) && Intrinsics.EZpvd((Object) this.name, (Object) addressCoinBalanceDetail.name) && Intrinsics.EZpvd((Object) this.symbol, (Object) addressCoinBalanceDetail.symbol) && Intrinsics.EZpvd((Object) this.address, (Object) addressCoinBalanceDetail.address) && Intrinsics.EZpvd((Object) this.imageUrl, (Object) addressCoinBalanceDetail.imageUrl) && Intrinsics.EZpvd((Object) this.chainName, (Object) addressCoinBalanceDetail.chainName) && Intrinsics.EZpvd((Object) this.tokenType, (Object) addressCoinBalanceDetail.tokenType) && this.chainIndex == addressCoinBalanceDetail.chainIndex && Intrinsics.EZpvd((Object) this.explorerUrl, (Object) addressCoinBalanceDetail.explorerUrl) && Intrinsics.EZpvd((Object) this.chainImageUrl, (Object) addressCoinBalanceDetail.chainImageUrl) && Intrinsics.EZpvd((Object) this.userAddress, (Object) addressCoinBalanceDetail.userAddress) && Intrinsics.EZpvd((Object) this.coinAmount, (Object) addressCoinBalanceDetail.coinAmount) && Intrinsics.EZpvd((Object) this.coinAmountOrigin, (Object) addressCoinBalanceDetail.coinAmountOrigin) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) addressCoinBalanceDetail.currencyAmount) && Intrinsics.EZpvd(this.coinPriceVo, addressCoinBalanceDetail.coinPriceVo) && Intrinsics.EZpvd(this.isRiskType, addressCoinBalanceDetail.isRiskType) && Intrinsics.EZpvd(this.isHighQuality, addressCoinBalanceDetail.isHighQuality) && Intrinsics.EZpvd(this.stableCoin, addressCoinBalanceDetail.stableCoin) && Intrinsics.EZpvd(this.aggregationType, addressCoinBalanceDetail.aggregationType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAggregationType() {
        return this.aggregationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getBaseCoinId() {
        return this.baseCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainImageUrl() {
        return this.chainImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmount() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmountOrigin() {
        return this.coinAmountOrigin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressCoinPriceInfo getCoinPriceVo() {
        return this.coinPriceVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyAmount() {
        return this.currencyAmount;
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
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getStableCoin() {
        return this.stableCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenType() {
        return this.tokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserAddress() {
        return this.userAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.coinId;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.baseCoinId;
        int iHashCode2 = l2 == null ? 0 : l2.hashCode();
        int iHashCode3 = this.name.hashCode();
        int iHashCode4 = this.symbol.hashCode();
        String str = this.address;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        int iHashCode6 = this.imageUrl.hashCode();
        int iHashCode7 = this.chainName.hashCode();
        int iHashCode8 = this.tokenType.hashCode();
        int iHashCode9 = Long.hashCode(this.chainIndex);
        int iHashCode10 = this.explorerUrl.hashCode();
        int iHashCode11 = this.chainImageUrl.hashCode();
        int iHashCode12 = this.userAddress.hashCode();
        int iHashCode13 = this.coinAmount.hashCode();
        int iHashCode14 = this.coinAmountOrigin.hashCode();
        int iHashCode15 = this.currencyAmount.hashCode();
        AddressCoinPriceInfo addressCoinPriceInfo = this.coinPriceVo;
        int iHashCode16 = addressCoinPriceInfo == null ? 0 : addressCoinPriceInfo.hashCode();
        Boolean bool = this.isRiskType;
        int iHashCode17 = bool == null ? 0 : bool.hashCode();
        Integer num = this.isHighQuality;
        int iHashCode18 = num == null ? 0 : num.hashCode();
        Boolean bool2 = this.stableCoin;
        int iHashCode19 = bool2 == null ? 0 : bool2.hashCode();
        Integer num2 = this.aggregationType;
        return (((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + (num2 == null ? 0 : num2.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer isHighQuality() {
        return this.isHighQuality;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isRiskType() {
        return this.isRiskType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAggregationType(Integer num) {
        this.aggregationType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCoinId(Long l) {
        this.baseCoinId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(Long l) {
        this.coinId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStableCoin(Boolean bool) {
        this.stableCoin = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressCoinBalanceDetail(coinId=" + this.coinId + ", baseCoinId=" + this.baseCoinId + ", name=" + this.name + ", symbol=" + this.symbol + ", address=" + this.address + ", imageUrl=" + this.imageUrl + ", chainName=" + this.chainName + ", tokenType=" + this.tokenType + ", chainIndex=" + this.chainIndex + ", explorerUrl=" + this.explorerUrl + ", chainImageUrl=" + this.chainImageUrl + ", userAddress=" + this.userAddress + ", coinAmount=" + this.coinAmount + ", coinAmountOrigin=" + this.coinAmountOrigin + ", currencyAmount=" + this.currencyAmount + ", coinPriceVo=" + this.coinPriceVo + ", isRiskType=" + this.isRiskType + ", isHighQuality=" + this.isHighQuality + ", stableCoin=" + this.stableCoin + ", aggregationType=" + this.aggregationType + ")";
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
        Long l2 = this.baseCoinId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.name);
        parcel.writeString(this.symbol);
        parcel.writeString(this.address);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.chainName);
        parcel.writeString(this.tokenType);
        parcel.writeLong(this.chainIndex);
        parcel.writeString(this.explorerUrl);
        parcel.writeString(this.chainImageUrl);
        parcel.writeString(this.userAddress);
        parcel.writeString(this.coinAmount);
        parcel.writeString(this.coinAmountOrigin);
        parcel.writeString(this.currencyAmount);
        AddressCoinPriceInfo addressCoinPriceInfo = this.coinPriceVo;
        if (addressCoinPriceInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addressCoinPriceInfo.writeToParcel(parcel, i);
        }
        Boolean bool = this.isRiskType;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.isHighQuality;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool2 = this.stableCoin;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Integer num2 = this.aggregationType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AddressCoinBalanceDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressCoinBalanceDetail> serializer() {
            return AddressCoinBalanceDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddressCoinBalanceDetail(int i, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, long j, String str7, String str8, String str9, String str10, String str11, String str12, AddressCoinPriceInfo addressCoinPriceInfo, Boolean bool, Integer num, Boolean bool2, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coinId = null;
        } else {
            this.coinId = l;
        }
        if ((i & 2) == 0) {
            this.baseCoinId = null;
        } else {
            this.baseCoinId = l2;
        }
        if ((i & 4) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        if ((i & 8) == 0) {
            this.symbol = "";
        } else {
            this.symbol = str2;
        }
        if ((i & 16) == 0) {
            this.address = "";
        } else {
            this.address = str3;
        }
        if ((i & 32) == 0) {
            this.imageUrl = "";
        } else {
            this.imageUrl = str4;
        }
        if ((i & 64) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str5;
        }
        if ((i & 128) == 0) {
            this.tokenType = "";
        } else {
            this.tokenType = str6;
        }
        this.chainIndex = (i & 256) == 0 ? 0L : j;
        if ((i & 512) == 0) {
            this.explorerUrl = "";
        } else {
            this.explorerUrl = str7;
        }
        if ((i & 1024) == 0) {
            this.chainImageUrl = "";
        } else {
            this.chainImageUrl = str8;
        }
        if ((i & 2048) == 0) {
            this.userAddress = "";
        } else {
            this.userAddress = str9;
        }
        if ((i & 4096) == 0) {
            this.coinAmount = "";
        } else {
            this.coinAmount = str10;
        }
        if ((i & 8192) == 0) {
            this.coinAmountOrigin = "";
        } else {
            this.coinAmountOrigin = str11;
        }
        if ((i & 16384) == 0) {
            this.currencyAmount = "";
        } else {
            this.currencyAmount = str12;
        }
        if ((32768 & i) == 0) {
            this.coinPriceVo = null;
        } else {
            this.coinPriceVo = addressCoinPriceInfo;
        }
        this.isRiskType = (65536 & i) == 0 ? Boolean.FALSE : bool;
        if ((131072 & i) == 0) {
            this.isHighQuality = null;
        } else {
            this.isHighQuality = num;
        }
        if ((262144 & i) == 0) {
            this.stableCoin = null;
        } else {
            this.stableCoin = bool2;
        }
        if ((i & 524288) == 0) {
            this.aggregationType = null;
        } else {
            this.aggregationType = num2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AddressCoinBalanceDetail addressCoinBalanceDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || addressCoinBalanceDetail.coinId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, addressCoinBalanceDetail.coinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || addressCoinBalanceDetail.baseCoinId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, addressCoinBalanceDetail.baseCoinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) addressCoinBalanceDetail.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, addressCoinBalanceDetail.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) addressCoinBalanceDetail.symbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, addressCoinBalanceDetail.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) addressCoinBalanceDetail.address, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, addressCoinBalanceDetail.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) addressCoinBalanceDetail.imageUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, addressCoinBalanceDetail.imageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) addressCoinBalanceDetail.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, addressCoinBalanceDetail.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) addressCoinBalanceDetail.tokenType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, addressCoinBalanceDetail.tokenType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || addressCoinBalanceDetail.chainIndex != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 8, addressCoinBalanceDetail.chainIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) addressCoinBalanceDetail.explorerUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, addressCoinBalanceDetail.explorerUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) addressCoinBalanceDetail.chainImageUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, addressCoinBalanceDetail.chainImageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) addressCoinBalanceDetail.userAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, addressCoinBalanceDetail.userAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) addressCoinBalanceDetail.coinAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, addressCoinBalanceDetail.coinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) addressCoinBalanceDetail.coinAmountOrigin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, addressCoinBalanceDetail.coinAmountOrigin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) addressCoinBalanceDetail.currencyAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, addressCoinBalanceDetail.currencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || addressCoinBalanceDetail.coinPriceVo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, AddressCoinPriceInfo$$serializer.INSTANCE, addressCoinBalanceDetail.coinPriceVo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd(addressCoinBalanceDetail.isRiskType, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, BooleanSerializer.INSTANCE, addressCoinBalanceDetail.isRiskType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || addressCoinBalanceDetail.isHighQuality != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, IntSerializer.INSTANCE, addressCoinBalanceDetail.isHighQuality);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || addressCoinBalanceDetail.stableCoin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, BooleanSerializer.INSTANCE, addressCoinBalanceDetail.stableCoin);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) && addressCoinBalanceDetail.aggregationType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, IntSerializer.INSTANCE, addressCoinBalanceDetail.aggregationType);
    }

    public AddressCoinBalanceDetail(Long l, Long l2, @NotNull String str, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, long j, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, AddressCoinPriceInfo addressCoinPriceInfo, Boolean bool, Integer num, Boolean bool2, Integer num2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        this.coinId = l;
        this.baseCoinId = l2;
        this.name = str;
        this.symbol = str2;
        this.address = str3;
        this.imageUrl = str4;
        this.chainName = str5;
        this.tokenType = str6;
        this.chainIndex = j;
        this.explorerUrl = str7;
        this.chainImageUrl = str8;
        this.userAddress = str9;
        this.coinAmount = str10;
        this.coinAmountOrigin = str11;
        this.currencyAmount = str12;
        this.coinPriceVo = addressCoinPriceInfo;
        this.isRiskType = bool;
        this.isHighQuality = num;
        this.stableCoin = bool2;
        this.aggregationType = num2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00e4: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r44v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r23v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000a: ARITH (r44v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r24v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r44v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r44v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r44v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r44v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r44v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r44v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0044: ARITH (r44v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r31v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r44v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r44v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r44v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r44v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:0x0078: TERNARY null = ((wrap:int:0x006f: ARITH (r44v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007a: ARITH (r44v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:com.okinc.business.defi.biz.net.bean.AddressCoinPriceInfo:?: TERNARY null = ((wrap:int:0x0086: ARITH (r44v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.AddressCoinPriceInfo) : (r39v0 com.okinc.business.defi.biz.net.bean.AddressCoinPriceInfo))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0091: ARITH (r44v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0095: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r40v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x009c: ARITH (r44v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r41v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00a7: ARITH (r44v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r42v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00b2: ARITH (r44v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r43v0 java.lang.Integer))
 A[MD:(java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.biz.net.bean.AddressCoinPriceInfo, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.Integer):void (m)] (LINE:1726) call: com.okinc.business.defi.biz.net.bean.AddressCoinBalanceDetail.<init>(java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.biz.net.bean.AddressCoinPriceInfo, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.Integer):void type: THIS */
    public /* synthetic */ AddressCoinBalanceDetail(Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, long j, String str7, String str8, String str9, String str10, String str11, String str12, AddressCoinPriceInfo addressCoinPriceInfo, Boolean bool, Integer num, Boolean bool2, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? 0L : j, (i & 512) != 0 ? "" : str7, (i & 1024) != 0 ? "" : str8, (i & 2048) != 0 ? "" : str9, (i & 4096) != 0 ? "" : str10, (i & 8192) != 0 ? "" : str11, (i & 16384) != 0 ? "" : str12, (i & 32768) != 0 ? null : addressCoinPriceInfo, (i & 65536) != 0 ? Boolean.FALSE : bool, (i & 131072) != 0 ? null : num, (i & 262144) != 0 ? null : bool2, (i & 524288) != 0 ? null : num2);
    }

    public final boolean isRiskyToken() {
        return Intrinsics.EZpvd(this.isRiskType, Boolean.TRUE);
    }

    public final C10854bwM generateCoinMeta() {
        C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
        String str = this.address;
        if (str == null) {
            str = "";
        }
        C10854bwM c10854bwMEZpvd = c10948byAValueOf.EZpvd(str, this.chainIndex);
        if (c10854bwMEZpvd != null) {
            return c10854bwMEZpvd;
        }
        Long l = this.coinId;
        if (l == null) {
            return null;
        }
        long jLongValue = l != null ? l.longValue() : -1L;
        Long l2 = this.baseCoinId;
        long jLongValue2 = l2 != null ? l2.longValue() : -1L;
        String str2 = this.name;
        String str3 = this.symbol;
        String str4 = this.address;
        String str5 = str4 == null ? "" : str4;
        String str6 = this.chainName;
        String str7 = this.tokenType;
        long j = this.chainIndex;
        String str8 = this.explorerUrl;
        String str9 = this.chainImageUrl;
        Integer num = this.isHighQuality;
        Boolean bool = this.stableCoin;
        return new C10854bwM(new CoinMetaBean(jLongValue, jLongValue2, j, 0L, str2, str6, str3, (String) null, str9, str5, 0, 0, 0, 0, str7, false, false, (Integer) null, false, 0, C11600cUg.copydefault(this.aggregationType), 0, false, false, str8, (FactionInfo) null, (Boolean) null, 0, 0, false, (Boolean) null, (Long) null, (Boolean) null, (Integer) null, (Integer) null, 0, (Integer) null, num, bool != null ? bool.booleanValue() : false, 0, false, (String) null, -17843064, 927, (DefaultConstructorMarker) null));
    }
}
