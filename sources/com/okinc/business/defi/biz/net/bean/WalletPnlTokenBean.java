package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
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

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WalletPnlTokenBean implements Parcelable {
    public static final int $stable = 0;
    private final String balance;
    private final String balanceUsd;
    private final String buyAvgPrice;
    private final String buyVolume;
    private final String chainId;
    private final String chainLogo;
    private final String latestTime;
    private final String nativeTokenPrice;
    private final Integer riskLevel;
    private final Long rowId;
    private final String sellAvgPrice;
    private final String sellVolume;
    private final String tokenContractAddress;
    private final String tokenLogoUrl;
    private final String tokenSymbol;
    private final String totalPnl;
    private final String totalPnlPercentage;
    private final String totalTxBuy;
    private final String totalTxSell;
    private final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<WalletPnlTokenBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<WalletPnlTokenBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletPnlTokenBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WalletPnlTokenBean(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletPnlTokenBean[] newArray(int i) {
            return new WalletPnlTokenBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletPnlTokenBean() {
        this((Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, 1048575, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.rowId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.totalPnlPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.buyVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.buyAvgPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.sellVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.sellAvgPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.balanceUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.totalTxBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.totalTxSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.nativeTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component20() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.latestTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletPnlTokenBean copy(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, @NotNull String str18, Integer num) {
        Intrinsics.checkNotNullParameter(str18, "");
        return new WalletPnlTokenBean(l, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, num);
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
        if (!(obj instanceof WalletPnlTokenBean)) {
            return false;
        }
        WalletPnlTokenBean walletPnlTokenBean = (WalletPnlTokenBean) obj;
        return Intrinsics.EZpvd(this.rowId, walletPnlTokenBean.rowId) && Intrinsics.EZpvd((Object) this.chainId, (Object) walletPnlTokenBean.chainId) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) walletPnlTokenBean.chainLogo) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) walletPnlTokenBean.walletAddress) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) walletPnlTokenBean.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) walletPnlTokenBean.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) walletPnlTokenBean.tokenSymbol) && Intrinsics.EZpvd((Object) this.latestTime, (Object) walletPnlTokenBean.latestTime) && Intrinsics.EZpvd((Object) this.totalPnl, (Object) walletPnlTokenBean.totalPnl) && Intrinsics.EZpvd((Object) this.totalPnlPercentage, (Object) walletPnlTokenBean.totalPnlPercentage) && Intrinsics.EZpvd((Object) this.buyVolume, (Object) walletPnlTokenBean.buyVolume) && Intrinsics.EZpvd((Object) this.buyAvgPrice, (Object) walletPnlTokenBean.buyAvgPrice) && Intrinsics.EZpvd((Object) this.sellVolume, (Object) walletPnlTokenBean.sellVolume) && Intrinsics.EZpvd((Object) this.sellAvgPrice, (Object) walletPnlTokenBean.sellAvgPrice) && Intrinsics.EZpvd((Object) this.balanceUsd, (Object) walletPnlTokenBean.balanceUsd) && Intrinsics.EZpvd((Object) this.balance, (Object) walletPnlTokenBean.balance) && Intrinsics.EZpvd((Object) this.totalTxBuy, (Object) walletPnlTokenBean.totalTxBuy) && Intrinsics.EZpvd((Object) this.totalTxSell, (Object) walletPnlTokenBean.totalTxSell) && Intrinsics.EZpvd((Object) this.nativeTokenPrice, (Object) walletPnlTokenBean.nativeTokenPrice) && Intrinsics.EZpvd(this.riskLevel, walletPnlTokenBean.riskLevel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalance() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalanceUsd() {
        return this.balanceUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyAvgPrice() {
        return this.buyAvgPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyVolume() {
        return this.buyVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogo() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLatestTime() {
        return this.latestTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeTokenPrice() {
        return this.nativeTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRiskLevel() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getRowId() {
        return this.rowId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellAvgPrice() {
        return this.sellAvgPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellVolume() {
        return this.sellVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogoUrl() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnl() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnlPercentage() {
        return this.totalPnlPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalTxBuy() {
        return this.totalTxBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalTxSell() {
        return this.totalTxSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAddress() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.rowId;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.chainId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.chainLogo;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.walletAddress;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.tokenContractAddress;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tokenLogoUrl;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.tokenSymbol;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.latestTime;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.totalPnl;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.totalPnlPercentage;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.buyVolume;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.buyAvgPrice;
        int iHashCode12 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.sellVolume;
        int iHashCode13 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.sellAvgPrice;
        int iHashCode14 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.balanceUsd;
        int iHashCode15 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.balance;
        int iHashCode16 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.totalTxBuy;
        int iHashCode17 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.totalTxSell;
        int iHashCode18 = str17 == null ? 0 : str17.hashCode();
        int iHashCode19 = this.nativeTokenPrice.hashCode();
        Integer num = this.riskLevel;
        return (((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletPnlTokenBean(rowId=" + this.rowId + ", chainId=" + this.chainId + ", chainLogo=" + this.chainLogo + ", walletAddress=" + this.walletAddress + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenLogoUrl=" + this.tokenLogoUrl + ", tokenSymbol=" + this.tokenSymbol + ", latestTime=" + this.latestTime + ", totalPnl=" + this.totalPnl + ", totalPnlPercentage=" + this.totalPnlPercentage + ", buyVolume=" + this.buyVolume + ", buyAvgPrice=" + this.buyAvgPrice + ", sellVolume=" + this.sellVolume + ", sellAvgPrice=" + this.sellAvgPrice + ", balanceUsd=" + this.balanceUsd + ", balance=" + this.balance + ", totalTxBuy=" + this.totalTxBuy + ", totalTxSell=" + this.totalTxSell + ", nativeTokenPrice=" + this.nativeTokenPrice + ", riskLevel=" + this.riskLevel + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.rowId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.chainId);
        parcel.writeString(this.chainLogo);
        parcel.writeString(this.walletAddress);
        parcel.writeString(this.tokenContractAddress);
        parcel.writeString(this.tokenLogoUrl);
        parcel.writeString(this.tokenSymbol);
        parcel.writeString(this.latestTime);
        parcel.writeString(this.totalPnl);
        parcel.writeString(this.totalPnlPercentage);
        parcel.writeString(this.buyVolume);
        parcel.writeString(this.buyAvgPrice);
        parcel.writeString(this.sellVolume);
        parcel.writeString(this.sellAvgPrice);
        parcel.writeString(this.balanceUsd);
        parcel.writeString(this.balance);
        parcel.writeString(this.totalTxBuy);
        parcel.writeString(this.totalTxSell);
        parcel.writeString(this.nativeTokenPrice);
        Integer num = this.riskLevel;
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.WalletPnlTokenBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletPnlTokenBean> serializer() {
            return WalletPnlTokenBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletPnlTokenBean(int i, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        this.rowId = (i & 1) == 0 ? 0L : l;
        if ((i & 2) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 4) == 0) {
            this.chainLogo = "";
        } else {
            this.chainLogo = str2;
        }
        if ((i & 8) == 0) {
            this.walletAddress = "";
        } else {
            this.walletAddress = str3;
        }
        if ((i & 16) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str4;
        }
        if ((i & 32) == 0) {
            this.tokenLogoUrl = "";
        } else {
            this.tokenLogoUrl = str5;
        }
        if ((i & 64) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str6;
        }
        if ((i & 128) == 0) {
            this.latestTime = "";
        } else {
            this.latestTime = str7;
        }
        if ((i & 256) == 0) {
            this.totalPnl = "";
        } else {
            this.totalPnl = str8;
        }
        if ((i & 512) == 0) {
            this.totalPnlPercentage = "";
        } else {
            this.totalPnlPercentage = str9;
        }
        if ((i & 1024) == 0) {
            this.buyVolume = "";
        } else {
            this.buyVolume = str10;
        }
        if ((i & 2048) == 0) {
            this.buyAvgPrice = "";
        } else {
            this.buyAvgPrice = str11;
        }
        if ((i & 4096) == 0) {
            this.sellVolume = "";
        } else {
            this.sellVolume = str12;
        }
        if ((i & 8192) == 0) {
            this.sellAvgPrice = "";
        } else {
            this.sellAvgPrice = str13;
        }
        if ((i & 16384) == 0) {
            this.balanceUsd = "";
        } else {
            this.balanceUsd = str14;
        }
        if ((32768 & i) == 0) {
            this.balance = "";
        } else {
            this.balance = str15;
        }
        if ((65536 & i) == 0) {
            this.totalTxBuy = "";
        } else {
            this.totalTxBuy = str16;
        }
        if ((131072 & i) == 0) {
            this.totalTxSell = "";
        } else {
            this.totalTxSell = str17;
        }
        if ((262144 & i) == 0) {
            this.nativeTokenPrice = "";
        } else {
            this.nativeTokenPrice = str18;
        }
        this.riskLevel = (i & 524288) == 0 ? 0 : num;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletPnlTokenBean walletPnlTokenBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Long l;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (l = walletPnlTokenBean.rowId) == null || l.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, walletPnlTokenBean.rowId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) walletPnlTokenBean.chainId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, walletPnlTokenBean.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) walletPnlTokenBean.chainLogo, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, walletPnlTokenBean.chainLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) walletPnlTokenBean.walletAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, walletPnlTokenBean.walletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) walletPnlTokenBean.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, walletPnlTokenBean.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) walletPnlTokenBean.tokenLogoUrl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, walletPnlTokenBean.tokenLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) walletPnlTokenBean.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, walletPnlTokenBean.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) walletPnlTokenBean.latestTime, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, walletPnlTokenBean.latestTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) walletPnlTokenBean.totalPnl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, walletPnlTokenBean.totalPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) walletPnlTokenBean.totalPnlPercentage, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, walletPnlTokenBean.totalPnlPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) walletPnlTokenBean.buyVolume, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, walletPnlTokenBean.buyVolume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) walletPnlTokenBean.buyAvgPrice, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, walletPnlTokenBean.buyAvgPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) walletPnlTokenBean.sellVolume, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, walletPnlTokenBean.sellVolume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) walletPnlTokenBean.sellAvgPrice, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, walletPnlTokenBean.sellAvgPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) walletPnlTokenBean.balanceUsd, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, walletPnlTokenBean.balanceUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) walletPnlTokenBean.balance, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, walletPnlTokenBean.balance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) walletPnlTokenBean.totalTxBuy, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, walletPnlTokenBean.totalTxBuy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) walletPnlTokenBean.totalTxSell, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, walletPnlTokenBean.totalTxSell);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) walletPnlTokenBean.nativeTokenPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, walletPnlTokenBean.nativeTokenPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || (num = walletPnlTokenBean.riskLevel) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, IntSerializer.INSTANCE, walletPnlTokenBean.riskLevel);
        }
    }

    public WalletPnlTokenBean(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, @NotNull String str18, Integer num) {
        Intrinsics.checkNotNullParameter(str18, "");
        this.rowId = l;
        this.chainId = str;
        this.chainLogo = str2;
        this.walletAddress = str3;
        this.tokenContractAddress = str4;
        this.tokenLogoUrl = str5;
        this.tokenSymbol = str6;
        this.latestTime = str7;
        this.totalPnl = str8;
        this.totalPnlPercentage = str9;
        this.buyVolume = str10;
        this.buyAvgPrice = str11;
        this.sellVolume = str12;
        this.sellAvgPrice = str13;
        this.balanceUsd = str14;
        this.balance = str15;
        this.totalTxBuy = str16;
        this.totalTxSell = str17;
        this.nativeTokenPrice = str18;
        this.riskLevel = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00e9: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r42v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r22v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r42v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r42v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r42v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r42v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r42v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r42v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r42v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r42v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r42v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0059: ARITH (r42v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0061: ARITH (r42v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0069: ARITH (r42v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0071: ARITH (r42v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007b: ARITH (r42v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0087: ARITH (r42v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0092: ARITH (r42v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009d: ARITH (r42v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a8: ARITH (r42v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00b3: ARITH (r42v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r41v0 java.lang.Integer))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:39) call: com.okinc.business.defi.biz.net.bean.WalletPnlTokenBean.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ WalletPnlTokenBean(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : l, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? "" : str13, (i & 16384) != 0 ? "" : str14, (i & 32768) != 0 ? "" : str15, (i & 65536) != 0 ? "" : str16, (i & 131072) != 0 ? "" : str17, (i & 262144) != 0 ? "" : str18, (i & 524288) != 0 ? 0 : num);
    }
}
