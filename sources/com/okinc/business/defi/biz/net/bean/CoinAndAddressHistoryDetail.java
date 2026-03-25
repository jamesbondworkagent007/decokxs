package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoJsonBean;
import com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoJsonBean$$serializer;
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
public final class CoinAndAddressHistoryDetail implements Parcelable {
    public static final String PHISHING = "phishing";
    public static final String RISK_TRANSACTION = "riskTransaction";
    private String address;
    private UTXOSpeedUpInfoJsonBean btcSpeedUpInfo;
    private int chainDecimalNum;
    private String chainSymbol;
    private int chainVdecimalNum;
    private Integer claimableStatus;
    private String coinAmount;
    private String coinAmountNum;
    private long coinId;
    private String coinSymbol;
    private String confirmedCount;
    private String contractAddress;
    private String contractName;
    private String currencyAmount;
    private int decimalNum;
    private boolean deleteSwitch;
    private String dexOrderId;
    private String direction;
    private String domain;
    private String from;
    private String gasLimit;
    private String gasPrice;
    private Integer hideTxType;
    private String inputData;
    private boolean isOkexWallet;
    private boolean isShowCancel;
    private boolean isShowPending;
    private boolean isShowSpeedUp;
    private boolean isShowSpeedupCancel;
    private String kysTxTypeText;
    private long mainCoinId;
    private String network;
    private String nonce;
    private String okexAccount;
    private String orderId;
    private String orderType;
    private Integer ordinalNftAmount;
    private Integer ordinalNftDirection;
    private String ordinalNftName;
    private String payAmount;
    private String payCurrency;
    private String payCurrencyIcon;
    private String pendingToastInfo;
    private String poolId;
    private String priorityFee;
    private int repeatTxType;
    private String rowId;
    private String serviceCharge;
    private String tipsType;
    private String to;
    private Long toChainId;
    private String totalConfirm;
    private String txId;
    private Integer txSource;
    private int txStatus;
    private long txTime;
    private int txType;
    private String txhash;
    private String uOpHash;
    private int vdecimalNum;
    private String walletId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CoinAndAddressHistoryDetail> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CoinAndAddressHistoryDetail> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinAndAddressHistoryDetail createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CoinAndAddressHistoryDetail(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : UTXOSpeedUpInfoJsonBean.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinAndAddressHistoryDetail[] newArray(int i) {
            return new CoinAndAddressHistoryDetail[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoinAndAddressHistoryDetail() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0L, 0L, 0, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, 0, 0, (String) null, 0L, 0, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, false, false, false, false, (String) null, (UTXOSpeedUpInfoJsonBean) null, (String) null, false, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (Integer) null, (Long) null, (String) null, -1, 536870911, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.kysTxTypeText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.coinAmountNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.coinSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component14() {
        return this.decimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component15() {
        return this.vdecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.chainSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component17() {
        return this.chainDecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component18() {
        return this.chainVdecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.txhash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component20() {
        return this.txTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component21() {
        return this.txStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.rowId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component25() {
        return this.isOkexWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.confirmedCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.totalConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.inputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component34() {
        return this.txSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component35() {
        return this.isShowPending;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component36() {
        return this.isShowSpeedUp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component37() {
        return this.isShowCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component38() {
        return this.isShowSpeedupCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.pendingToastInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UTXOSpeedUpInfoJsonBean component40() {
        return this.btcSpeedUpInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.serviceCharge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component42() {
        return this.deleteSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.contractName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component45() {
        return this.repeatTxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.okexAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component47() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component48() {
        return this.payAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component49() {
        return this.payCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component50() {
        return this.payCurrencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component51() {
        return this.ordinalNftAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component52() {
        return this.ordinalNftName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component53() {
        return this.ordinalNftDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component54() {
        return this.uOpHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component55() {
        return this.poolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component56() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component57() {
        return this.hideTxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component58() {
        return this.dexOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component59() {
        return this.claimableStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component60() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component61() {
        return this.tipsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component7() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component8() {
        return this.mainCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinAndAddressHistoryDetail copy(@NotNull String str, String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, long j, long j2, int i, String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, int i2, int i3, @NotNull String str11, int i4, int i5, @NotNull String str12, long j3, int i6, @NotNull String str13, @NotNull String str14, @NotNull String str15, boolean z, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, String str20, @NotNull String str21, @NotNull String str22, String str23, Integer num, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull String str24, UTXOSpeedUpInfoJsonBean uTXOSpeedUpInfoJsonBean, String str25, boolean z6, String str26, String str27, int i7, String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, Integer num2, String str33, Integer num3, String str34, String str35, @NotNull String str36, Integer num4, @NotNull String str37, Integer num5, Long l, String str38) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
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
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        return new CoinAndAddressHistoryDetail(str, str2, str3, str4, str5, str6, j, j2, i, str7, str8, str9, str10, i2, i3, str11, i4, i5, str12, j3, i6, str13, str14, str15, z, str16, str17, str18, str19, str20, str21, str22, str23, num, z2, z3, z4, z5, str24, uTXOSpeedUpInfoJsonBean, str25, z6, str26, str27, i7, str28, str29, str30, str31, str32, num2, str33, num3, str34, str35, str36, num4, str37, num5, l, str38);
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
        if (!(obj instanceof CoinAndAddressHistoryDetail)) {
            return false;
        }
        CoinAndAddressHistoryDetail coinAndAddressHistoryDetail = (CoinAndAddressHistoryDetail) obj;
        return Intrinsics.EZpvd((Object) this.txId, (Object) coinAndAddressHistoryDetail.txId) && Intrinsics.EZpvd((Object) this.txhash, (Object) coinAndAddressHistoryDetail.txhash) && Intrinsics.EZpvd((Object) this.walletId, (Object) coinAndAddressHistoryDetail.walletId) && Intrinsics.EZpvd((Object) this.address, (Object) coinAndAddressHistoryDetail.address) && Intrinsics.EZpvd((Object) this.from, (Object) coinAndAddressHistoryDetail.from) && Intrinsics.EZpvd((Object) this.to, (Object) coinAndAddressHistoryDetail.to) && this.coinId == coinAndAddressHistoryDetail.coinId && this.mainCoinId == coinAndAddressHistoryDetail.mainCoinId && this.txType == coinAndAddressHistoryDetail.txType && Intrinsics.EZpvd((Object) this.kysTxTypeText, (Object) coinAndAddressHistoryDetail.kysTxTypeText) && Intrinsics.EZpvd((Object) this.coinAmount, (Object) coinAndAddressHistoryDetail.coinAmount) && Intrinsics.EZpvd((Object) this.coinAmountNum, (Object) coinAndAddressHistoryDetail.coinAmountNum) && Intrinsics.EZpvd((Object) this.coinSymbol, (Object) coinAndAddressHistoryDetail.coinSymbol) && this.decimalNum == coinAndAddressHistoryDetail.decimalNum && this.vdecimalNum == coinAndAddressHistoryDetail.vdecimalNum && Intrinsics.EZpvd((Object) this.chainSymbol, (Object) coinAndAddressHistoryDetail.chainSymbol) && this.chainDecimalNum == coinAndAddressHistoryDetail.chainDecimalNum && this.chainVdecimalNum == coinAndAddressHistoryDetail.chainVdecimalNum && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) coinAndAddressHistoryDetail.currencyAmount) && this.txTime == coinAndAddressHistoryDetail.txTime && this.txStatus == coinAndAddressHistoryDetail.txStatus && Intrinsics.EZpvd((Object) this.rowId, (Object) coinAndAddressHistoryDetail.rowId) && Intrinsics.EZpvd((Object) this.domain, (Object) coinAndAddressHistoryDetail.domain) && Intrinsics.EZpvd((Object) this.network, (Object) coinAndAddressHistoryDetail.network) && this.isOkexWallet == coinAndAddressHistoryDetail.isOkexWallet && Intrinsics.EZpvd((Object) this.direction, (Object) coinAndAddressHistoryDetail.direction) && Intrinsics.EZpvd((Object) this.confirmedCount, (Object) coinAndAddressHistoryDetail.confirmedCount) && Intrinsics.EZpvd((Object) this.totalConfirm, (Object) coinAndAddressHistoryDetail.totalConfirm) && Intrinsics.EZpvd((Object) this.gasPrice, (Object) coinAndAddressHistoryDetail.gasPrice) && Intrinsics.EZpvd((Object) this.priorityFee, (Object) coinAndAddressHistoryDetail.priorityFee) && Intrinsics.EZpvd((Object) this.gasLimit, (Object) coinAndAddressHistoryDetail.gasLimit) && Intrinsics.EZpvd((Object) this.nonce, (Object) coinAndAddressHistoryDetail.nonce) && Intrinsics.EZpvd((Object) this.inputData, (Object) coinAndAddressHistoryDetail.inputData) && Intrinsics.EZpvd(this.txSource, coinAndAddressHistoryDetail.txSource) && this.isShowPending == coinAndAddressHistoryDetail.isShowPending && this.isShowSpeedUp == coinAndAddressHistoryDetail.isShowSpeedUp && this.isShowCancel == coinAndAddressHistoryDetail.isShowCancel && this.isShowSpeedupCancel == coinAndAddressHistoryDetail.isShowSpeedupCancel && Intrinsics.EZpvd((Object) this.pendingToastInfo, (Object) coinAndAddressHistoryDetail.pendingToastInfo) && Intrinsics.EZpvd(this.btcSpeedUpInfo, coinAndAddressHistoryDetail.btcSpeedUpInfo) && Intrinsics.EZpvd((Object) this.serviceCharge, (Object) coinAndAddressHistoryDetail.serviceCharge) && this.deleteSwitch == coinAndAddressHistoryDetail.deleteSwitch && Intrinsics.EZpvd((Object) this.contractName, (Object) coinAndAddressHistoryDetail.contractName) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) coinAndAddressHistoryDetail.contractAddress) && this.repeatTxType == coinAndAddressHistoryDetail.repeatTxType && Intrinsics.EZpvd((Object) this.okexAccount, (Object) coinAndAddressHistoryDetail.okexAccount) && Intrinsics.EZpvd((Object) this.orderId, (Object) coinAndAddressHistoryDetail.orderId) && Intrinsics.EZpvd((Object) this.payAmount, (Object) coinAndAddressHistoryDetail.payAmount) && Intrinsics.EZpvd((Object) this.payCurrency, (Object) coinAndAddressHistoryDetail.payCurrency) && Intrinsics.EZpvd((Object) this.payCurrencyIcon, (Object) coinAndAddressHistoryDetail.payCurrencyIcon) && Intrinsics.EZpvd(this.ordinalNftAmount, coinAndAddressHistoryDetail.ordinalNftAmount) && Intrinsics.EZpvd((Object) this.ordinalNftName, (Object) coinAndAddressHistoryDetail.ordinalNftName) && Intrinsics.EZpvd(this.ordinalNftDirection, coinAndAddressHistoryDetail.ordinalNftDirection) && Intrinsics.EZpvd((Object) this.uOpHash, (Object) coinAndAddressHistoryDetail.uOpHash) && Intrinsics.EZpvd((Object) this.poolId, (Object) coinAndAddressHistoryDetail.poolId) && Intrinsics.EZpvd((Object) this.orderType, (Object) coinAndAddressHistoryDetail.orderType) && Intrinsics.EZpvd(this.hideTxType, coinAndAddressHistoryDetail.hideTxType) && Intrinsics.EZpvd((Object) this.dexOrderId, (Object) coinAndAddressHistoryDetail.dexOrderId) && Intrinsics.EZpvd(this.claimableStatus, coinAndAddressHistoryDetail.claimableStatus) && Intrinsics.EZpvd(this.toChainId, coinAndAddressHistoryDetail.toChainId) && Intrinsics.EZpvd((Object) this.tipsType, (Object) coinAndAddressHistoryDetail.tipsType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UTXOSpeedUpInfoJsonBean getBtcSpeedUpInfo() {
        return this.btcSpeedUpInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getChainDecimalNum() {
        return this.chainDecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainSymbol() {
        return this.chainSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getChainVdecimalNum() {
        return this.chainVdecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getClaimableStatus() {
        return this.claimableStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmount() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmountNum() {
        return this.coinAmountNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinSymbol() {
        return this.coinSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConfirmedCount() {
        return this.confirmedCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractName() {
        return this.contractName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDecimalNum() {
        return this.decimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDeleteSwitch() {
        return this.deleteSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexOrderId() {
        return this.dexOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDomain() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasLimit() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getHideTxType() {
        return this.hideTxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInputData() {
        return this.inputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKysTxTypeText() {
        return this.kysTxTypeText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getMainCoinId() {
        return this.mainCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOkexAccount() {
        return this.okexAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getOrdinalNftAmount() {
        return this.ordinalNftAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getOrdinalNftDirection() {
        return this.ordinalNftDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdinalNftName() {
        return this.ordinalNftName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayAmount() {
        return this.payAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayCurrency() {
        return this.payCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayCurrencyIcon() {
        return this.payCurrencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPendingToastInfo() {
        return this.pendingToastInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPoolId() {
        return this.poolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFee() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRepeatTxType() {
        return this.repeatTxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRowId() {
        return this.rowId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceCharge() {
        return this.serviceCharge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTipsType() {
        return this.tipsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getToChainId() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalConfirm() {
        return this.totalConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxId() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTxSource() {
        return this.txSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTxStatus() {
        return this.txStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTxTime() {
        return this.txTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTxType() {
        return this.txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxhash() {
        return this.txhash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUOpHash() {
        return this.uOpHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getVdecimalNum() {
        return this.vdecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.txId.hashCode();
        String str = this.txhash;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.walletId;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int iHashCode4 = this.address.hashCode();
        int iHashCode5 = this.from.hashCode();
        int iHashCode6 = this.to.hashCode();
        int iHashCode7 = Long.hashCode(this.coinId);
        int iHashCode8 = Long.hashCode(this.mainCoinId);
        int iHashCode9 = Integer.hashCode(this.txType);
        String str3 = this.kysTxTypeText;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        int iHashCode11 = this.coinAmount.hashCode();
        int iHashCode12 = this.coinAmountNum.hashCode();
        int iHashCode13 = this.coinSymbol.hashCode();
        int iHashCode14 = Integer.hashCode(this.decimalNum);
        int iHashCode15 = Integer.hashCode(this.vdecimalNum);
        int iHashCode16 = this.chainSymbol.hashCode();
        int iHashCode17 = Integer.hashCode(this.chainDecimalNum);
        int iHashCode18 = Integer.hashCode(this.chainVdecimalNum);
        int iHashCode19 = this.currencyAmount.hashCode();
        int iHashCode20 = Long.hashCode(this.txTime);
        int iHashCode21 = Integer.hashCode(this.txStatus);
        int iHashCode22 = this.rowId.hashCode();
        int iHashCode23 = this.domain.hashCode();
        int iHashCode24 = this.network.hashCode();
        int iHashCode25 = Boolean.hashCode(this.isOkexWallet);
        int iHashCode26 = this.direction.hashCode();
        int iHashCode27 = this.confirmedCount.hashCode();
        int iHashCode28 = this.totalConfirm.hashCode();
        int iHashCode29 = this.gasPrice.hashCode();
        String str4 = this.priorityFee;
        int iHashCode30 = str4 == null ? 0 : str4.hashCode();
        int iHashCode31 = this.gasLimit.hashCode();
        int iHashCode32 = this.nonce.hashCode();
        String str5 = this.inputData;
        int iHashCode33 = str5 == null ? 0 : str5.hashCode();
        Integer num = this.txSource;
        int iHashCode34 = num == null ? 0 : num.hashCode();
        int iHashCode35 = Boolean.hashCode(this.isShowPending);
        int iHashCode36 = Boolean.hashCode(this.isShowSpeedUp);
        int iHashCode37 = Boolean.hashCode(this.isShowCancel);
        int iHashCode38 = Boolean.hashCode(this.isShowSpeedupCancel);
        int iHashCode39 = this.pendingToastInfo.hashCode();
        UTXOSpeedUpInfoJsonBean uTXOSpeedUpInfoJsonBean = this.btcSpeedUpInfo;
        int iHashCode40 = uTXOSpeedUpInfoJsonBean == null ? 0 : uTXOSpeedUpInfoJsonBean.hashCode();
        String str6 = this.serviceCharge;
        int iHashCode41 = str6 == null ? 0 : str6.hashCode();
        int iHashCode42 = Boolean.hashCode(this.deleteSwitch);
        String str7 = this.contractName;
        int iHashCode43 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.contractAddress;
        int iHashCode44 = str8 == null ? 0 : str8.hashCode();
        int iHashCode45 = Integer.hashCode(this.repeatTxType);
        String str9 = this.okexAccount;
        int iHashCode46 = str9 == null ? 0 : str9.hashCode();
        int iHashCode47 = this.orderId.hashCode();
        int iHashCode48 = this.payAmount.hashCode();
        int iHashCode49 = this.payCurrency.hashCode();
        int iHashCode50 = this.payCurrencyIcon.hashCode();
        Integer num2 = this.ordinalNftAmount;
        int iHashCode51 = num2 == null ? 0 : num2.hashCode();
        String str10 = this.ordinalNftName;
        int iHashCode52 = str10 == null ? 0 : str10.hashCode();
        Integer num3 = this.ordinalNftDirection;
        int iHashCode53 = num3 == null ? 0 : num3.hashCode();
        String str11 = this.uOpHash;
        int iHashCode54 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.poolId;
        int iHashCode55 = str12 == null ? 0 : str12.hashCode();
        int iHashCode56 = this.orderType.hashCode();
        Integer num4 = this.hideTxType;
        int iHashCode57 = num4 == null ? 0 : num4.hashCode();
        int iHashCode58 = this.dexOrderId.hashCode();
        Integer num5 = this.claimableStatus;
        int iHashCode59 = num5 == null ? 0 : num5.hashCode();
        Long l = this.toChainId;
        int iHashCode60 = l == null ? 0 : l.hashCode();
        String str13 = this.tipsType;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + (str13 == null ? 0 : str13.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isOkexWallet() {
        return this.isOkexWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowCancel() {
        return this.isShowCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowPending() {
        return this.isShowPending;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowSpeedUp() {
        return this.isShowSpeedUp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowSpeedupCancel() {
        return this.isShowSpeedupCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBtcSpeedUpInfo(UTXOSpeedUpInfoJsonBean uTXOSpeedUpInfoJsonBean) {
        this.btcSpeedUpInfo = uTXOSpeedUpInfoJsonBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainDecimalNum(int i) {
        this.chainDecimalNum = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainVdecimalNum(int i) {
        this.chainVdecimalNum = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClaimableStatus(Integer num) {
        this.claimableStatus = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinAmountNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinAmountNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConfirmedCount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.confirmedCount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractAddress(String str) {
        this.contractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractName(String str) {
        this.contractName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currencyAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDecimalNum(int i) {
        this.decimalNum = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeleteSwitch(boolean z) {
        this.deleteSwitch = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDexOrderId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dexOrderId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDirection(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.direction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDomain(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.domain = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasLimit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gasLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gasPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHideTxType(Integer num) {
        this.hideTxType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputData(String str) {
        this.inputData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKysTxTypeText(String str) {
        this.kysTxTypeText = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMainCoinId(long j) {
        this.mainCoinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetwork(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.network = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNonce(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nonce = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOkexAccount(String str) {
        this.okexAccount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOkexWallet(boolean z) {
        this.isOkexWallet = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdinalNftAmount(Integer num) {
        this.ordinalNftAmount = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdinalNftDirection(Integer num) {
        this.ordinalNftDirection = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdinalNftName(String str) {
        this.ordinalNftName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.payAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.payCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayCurrencyIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.payCurrencyIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPendingToastInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pendingToastInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPoolId(String str) {
        this.poolId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriorityFee(String str) {
        this.priorityFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRepeatTxType(int i) {
        this.repeatTxType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRowId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rowId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setServiceCharge(String str) {
        this.serviceCharge = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowCancel(boolean z) {
        this.isShowCancel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowPending(boolean z) {
        this.isShowPending = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowSpeedUp(boolean z) {
        this.isShowSpeedUp = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowSpeedupCancel(boolean z) {
        this.isShowSpeedupCancel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTipsType(String str) {
        this.tipsType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.to = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToChainId(Long l) {
        this.toChainId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalConfirm(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalConfirm = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.txId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxSource(Integer num) {
        this.txSource = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxStatus(int i) {
        this.txStatus = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxTime(long j) {
        this.txTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxType(int i) {
        this.txType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxhash(String str) {
        this.txhash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUOpHash(String str) {
        this.uOpHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVdecimalNum(int i) {
        this.vdecimalNum = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletId(String str) {
        this.walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinAndAddressHistoryDetail(txId=" + this.txId + ", txhash=" + this.txhash + ", walletId=" + this.walletId + ", address=" + this.address + ", from=" + this.from + ", to=" + this.to + ", coinId=" + this.coinId + ", mainCoinId=" + this.mainCoinId + ", txType=" + this.txType + ", kysTxTypeText=" + this.kysTxTypeText + ", coinAmount=" + this.coinAmount + ", coinAmountNum=" + this.coinAmountNum + ", coinSymbol=" + this.coinSymbol + ", decimalNum=" + this.decimalNum + ", vdecimalNum=" + this.vdecimalNum + ", chainSymbol=" + this.chainSymbol + ", chainDecimalNum=" + this.chainDecimalNum + ", chainVdecimalNum=" + this.chainVdecimalNum + ", currencyAmount=" + this.currencyAmount + ", txTime=" + this.txTime + ", txStatus=" + this.txStatus + ", rowId=" + this.rowId + ", domain=" + this.domain + ", network=" + this.network + ", isOkexWallet=" + this.isOkexWallet + ", direction=" + this.direction + ", confirmedCount=" + this.confirmedCount + ", totalConfirm=" + this.totalConfirm + ", gasPrice=" + this.gasPrice + ", priorityFee=" + this.priorityFee + ", gasLimit=" + this.gasLimit + ", nonce=" + this.nonce + ", inputData=" + this.inputData + ", txSource=" + this.txSource + ", isShowPending=" + this.isShowPending + ", isShowSpeedUp=" + this.isShowSpeedUp + ", isShowCancel=" + this.isShowCancel + ", isShowSpeedupCancel=" + this.isShowSpeedupCancel + ", pendingToastInfo=" + this.pendingToastInfo + ", btcSpeedUpInfo=" + this.btcSpeedUpInfo + ", serviceCharge=" + this.serviceCharge + ", deleteSwitch=" + this.deleteSwitch + ", contractName=" + this.contractName + ", contractAddress=" + this.contractAddress + ", repeatTxType=" + this.repeatTxType + ", okexAccount=" + this.okexAccount + ", orderId=" + this.orderId + ", payAmount=" + this.payAmount + ", payCurrency=" + this.payCurrency + ", payCurrencyIcon=" + this.payCurrencyIcon + ", ordinalNftAmount=" + this.ordinalNftAmount + ", ordinalNftName=" + this.ordinalNftName + ", ordinalNftDirection=" + this.ordinalNftDirection + ", uOpHash=" + this.uOpHash + ", poolId=" + this.poolId + ", orderType=" + this.orderType + ", hideTxType=" + this.hideTxType + ", dexOrderId=" + this.dexOrderId + ", claimableStatus=" + this.claimableStatus + ", toChainId=" + this.toChainId + ", tipsType=" + this.tipsType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.txId);
        parcel.writeString(this.txhash);
        parcel.writeString(this.walletId);
        parcel.writeString(this.address);
        parcel.writeString(this.from);
        parcel.writeString(this.to);
        parcel.writeLong(this.coinId);
        parcel.writeLong(this.mainCoinId);
        parcel.writeInt(this.txType);
        parcel.writeString(this.kysTxTypeText);
        parcel.writeString(this.coinAmount);
        parcel.writeString(this.coinAmountNum);
        parcel.writeString(this.coinSymbol);
        parcel.writeInt(this.decimalNum);
        parcel.writeInt(this.vdecimalNum);
        parcel.writeString(this.chainSymbol);
        parcel.writeInt(this.chainDecimalNum);
        parcel.writeInt(this.chainVdecimalNum);
        parcel.writeString(this.currencyAmount);
        parcel.writeLong(this.txTime);
        parcel.writeInt(this.txStatus);
        parcel.writeString(this.rowId);
        parcel.writeString(this.domain);
        parcel.writeString(this.network);
        parcel.writeInt(this.isOkexWallet ? 1 : 0);
        parcel.writeString(this.direction);
        parcel.writeString(this.confirmedCount);
        parcel.writeString(this.totalConfirm);
        parcel.writeString(this.gasPrice);
        parcel.writeString(this.priorityFee);
        parcel.writeString(this.gasLimit);
        parcel.writeString(this.nonce);
        parcel.writeString(this.inputData);
        Integer num = this.txSource;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.isShowPending ? 1 : 0);
        parcel.writeInt(this.isShowSpeedUp ? 1 : 0);
        parcel.writeInt(this.isShowCancel ? 1 : 0);
        parcel.writeInt(this.isShowSpeedupCancel ? 1 : 0);
        parcel.writeString(this.pendingToastInfo);
        UTXOSpeedUpInfoJsonBean uTXOSpeedUpInfoJsonBean = this.btcSpeedUpInfo;
        if (uTXOSpeedUpInfoJsonBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uTXOSpeedUpInfoJsonBean.writeToParcel(parcel, i);
        }
        parcel.writeString(this.serviceCharge);
        parcel.writeInt(this.deleteSwitch ? 1 : 0);
        parcel.writeString(this.contractName);
        parcel.writeString(this.contractAddress);
        parcel.writeInt(this.repeatTxType);
        parcel.writeString(this.okexAccount);
        parcel.writeString(this.orderId);
        parcel.writeString(this.payAmount);
        parcel.writeString(this.payCurrency);
        parcel.writeString(this.payCurrencyIcon);
        Integer num2 = this.ordinalNftAmount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.ordinalNftName);
        Integer num3 = this.ordinalNftDirection;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.uOpHash);
        parcel.writeString(this.poolId);
        parcel.writeString(this.orderType);
        Integer num4 = this.hideTxType;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeString(this.dexOrderId);
        Integer num5 = this.claimableStatus;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Long l = this.toChainId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.tipsType);
    }

    public /* synthetic */ CoinAndAddressHistoryDetail(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, int i3, String str7, String str8, String str9, String str10, int i4, int i5, String str11, int i6, int i7, String str12, long j3, int i8, String str13, String str14, String str15, boolean z, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Integer num, boolean z2, boolean z3, boolean z4, boolean z5, String str24, UTXOSpeedUpInfoJsonBean uTXOSpeedUpInfoJsonBean, String str25, boolean z6, String str26, String str27, int i9, String str28, String str29, String str30, String str31, String str32, Integer num2, String str33, Integer num3, String str34, String str35, String str36, Integer num4, String str37, Integer num5, Long l, String str38, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.txId = "";
        } else {
            this.txId = str;
        }
        if ((i & 2) == 0) {
            this.txhash = "";
        } else {
            this.txhash = str2;
        }
        if ((i & 4) == 0) {
            this.walletId = null;
        } else {
            this.walletId = str3;
        }
        if ((i & 8) == 0) {
            this.address = "";
        } else {
            this.address = str4;
        }
        if ((i & 16) == 0) {
            this.from = "";
        } else {
            this.from = str5;
        }
        if ((i & 32) == 0) {
            this.to = "";
        } else {
            this.to = str6;
        }
        if ((i & 64) == 0) {
            this.coinId = 0L;
        } else {
            this.coinId = j;
        }
        if ((i & 128) == 0) {
            this.mainCoinId = 0L;
        } else {
            this.mainCoinId = j2;
        }
        if ((i & 256) == 0) {
            this.txType = 0;
        } else {
            this.txType = i3;
        }
        if ((i & 512) == 0) {
            this.kysTxTypeText = null;
        } else {
            this.kysTxTypeText = str7;
        }
        if ((i & 1024) == 0) {
            this.coinAmount = "";
        } else {
            this.coinAmount = str8;
        }
        if ((i & 2048) == 0) {
            this.coinAmountNum = "";
        } else {
            this.coinAmountNum = str9;
        }
        if ((i & 4096) == 0) {
            this.coinSymbol = "";
        } else {
            this.coinSymbol = str10;
        }
        if ((i & 8192) == 0) {
            this.decimalNum = 0;
        } else {
            this.decimalNum = i4;
        }
        if ((i & 16384) == 0) {
            this.vdecimalNum = 0;
        } else {
            this.vdecimalNum = i5;
        }
        if ((i & 32768) == 0) {
            this.chainSymbol = "";
        } else {
            this.chainSymbol = str11;
        }
        if ((i & 65536) == 0) {
            this.chainDecimalNum = 0;
        } else {
            this.chainDecimalNum = i6;
        }
        if ((i & 131072) == 0) {
            this.chainVdecimalNum = 0;
        } else {
            this.chainVdecimalNum = i7;
        }
        if ((262144 & i) == 0) {
            this.currencyAmount = "";
        } else {
            this.currencyAmount = str12;
        }
        this.txTime = (524288 & i) != 0 ? j3 : 0L;
        if ((1048576 & i) == 0) {
            this.txStatus = 0;
        } else {
            this.txStatus = i8;
        }
        if ((2097152 & i) == 0) {
            this.rowId = "";
        } else {
            this.rowId = str13;
        }
        if ((4194304 & i) == 0) {
            this.domain = "";
        } else {
            this.domain = str14;
        }
        if ((8388608 & i) == 0) {
            this.network = "";
        } else {
            this.network = str15;
        }
        if ((16777216 & i) == 0) {
            this.isOkexWallet = false;
        } else {
            this.isOkexWallet = z;
        }
        if ((33554432 & i) == 0) {
            this.direction = "";
        } else {
            this.direction = str16;
        }
        if ((67108864 & i) == 0) {
            this.confirmedCount = "";
        } else {
            this.confirmedCount = str17;
        }
        if ((134217728 & i) == 0) {
            this.totalConfirm = "";
        } else {
            this.totalConfirm = str18;
        }
        if ((268435456 & i) == 0) {
            this.gasPrice = "";
        } else {
            this.gasPrice = str19;
        }
        if ((536870912 & i) == 0) {
            this.priorityFee = null;
        } else {
            this.priorityFee = str20;
        }
        if ((1073741824 & i) == 0) {
            this.gasLimit = "";
        } else {
            this.gasLimit = str21;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.nonce = "";
        } else {
            this.nonce = str22;
        }
        if ((i2 & 1) == 0) {
            this.inputData = null;
        } else {
            this.inputData = str23;
        }
        if ((i2 & 2) == 0) {
            this.txSource = null;
        } else {
            this.txSource = num;
        }
        if ((i2 & 4) == 0) {
            this.isShowPending = false;
        } else {
            this.isShowPending = z2;
        }
        if ((i2 & 8) == 0) {
            this.isShowSpeedUp = false;
        } else {
            this.isShowSpeedUp = z3;
        }
        if ((i2 & 16) == 0) {
            this.isShowCancel = false;
        } else {
            this.isShowCancel = z4;
        }
        if ((i2 & 32) == 0) {
            this.isShowSpeedupCancel = false;
        } else {
            this.isShowSpeedupCancel = z5;
        }
        if ((i2 & 64) == 0) {
            this.pendingToastInfo = "";
        } else {
            this.pendingToastInfo = str24;
        }
        if ((i2 & 128) == 0) {
            this.btcSpeedUpInfo = null;
        } else {
            this.btcSpeedUpInfo = uTXOSpeedUpInfoJsonBean;
        }
        if ((i2 & 256) == 0) {
            this.serviceCharge = null;
        } else {
            this.serviceCharge = str25;
        }
        this.deleteSwitch = (i2 & 512) == 0 ? true : z6;
        if ((i2 & 1024) == 0) {
            this.contractName = null;
        } else {
            this.contractName = str26;
        }
        if ((i2 & 2048) == 0) {
            this.contractAddress = null;
        } else {
            this.contractAddress = str27;
        }
        if ((i2 & 4096) == 0) {
            this.repeatTxType = 0;
        } else {
            this.repeatTxType = i9;
        }
        if ((i2 & 8192) == 0) {
            this.okexAccount = null;
        } else {
            this.okexAccount = str28;
        }
        if ((i2 & 16384) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str29;
        }
        if ((i2 & 32768) == 0) {
            this.payAmount = "";
        } else {
            this.payAmount = str30;
        }
        if ((i2 & 65536) == 0) {
            this.payCurrency = "";
        } else {
            this.payCurrency = str31;
        }
        if ((i2 & 131072) == 0) {
            this.payCurrencyIcon = "";
        } else {
            this.payCurrencyIcon = str32;
        }
        this.ordinalNftAmount = (262144 & i2) == 0 ? 0 : num2;
        if ((524288 & i2) == 0) {
            this.ordinalNftName = "";
        } else {
            this.ordinalNftName = str33;
        }
        this.ordinalNftDirection = (1048576 & i2) == 0 ? 0 : num3;
        if ((2097152 & i2) == 0) {
            this.uOpHash = null;
        } else {
            this.uOpHash = str34;
        }
        if ((4194304 & i2) == 0) {
            this.poolId = null;
        } else {
            this.poolId = str35;
        }
        if ((8388608 & i2) == 0) {
            this.orderType = "";
        } else {
            this.orderType = str36;
        }
        this.hideTxType = (16777216 & i2) == 0 ? 0 : num4;
        if ((33554432 & i2) == 0) {
            this.dexOrderId = "";
        } else {
            this.dexOrderId = str37;
        }
        if ((67108864 & i2) == 0) {
            this.claimableStatus = null;
        } else {
            this.claimableStatus = num5;
        }
        if ((134217728 & i2) == 0) {
            this.toChainId = null;
        } else {
            this.toChainId = l;
        }
        if ((268435456 & i2) == 0) {
            this.tipsType = null;
        } else {
            this.tipsType = str38;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Integer num2;
        Integer num3;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) coinAndAddressHistoryDetail.txId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, coinAndAddressHistoryDetail.txId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) coinAndAddressHistoryDetail.txhash, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, coinAndAddressHistoryDetail.txhash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || coinAndAddressHistoryDetail.walletId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, coinAndAddressHistoryDetail.walletId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) coinAndAddressHistoryDetail.address, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, coinAndAddressHistoryDetail.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) coinAndAddressHistoryDetail.from, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, coinAndAddressHistoryDetail.from);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) coinAndAddressHistoryDetail.to, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, coinAndAddressHistoryDetail.to);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || coinAndAddressHistoryDetail.coinId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 6, coinAndAddressHistoryDetail.coinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || coinAndAddressHistoryDetail.mainCoinId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 7, coinAndAddressHistoryDetail.mainCoinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || coinAndAddressHistoryDetail.txType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 8, coinAndAddressHistoryDetail.txType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || coinAndAddressHistoryDetail.kysTxTypeText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, coinAndAddressHistoryDetail.kysTxTypeText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) coinAndAddressHistoryDetail.coinAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, coinAndAddressHistoryDetail.coinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) coinAndAddressHistoryDetail.coinAmountNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, coinAndAddressHistoryDetail.coinAmountNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) coinAndAddressHistoryDetail.coinSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, coinAndAddressHistoryDetail.coinSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || coinAndAddressHistoryDetail.decimalNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 13, coinAndAddressHistoryDetail.decimalNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || coinAndAddressHistoryDetail.vdecimalNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 14, coinAndAddressHistoryDetail.vdecimalNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) coinAndAddressHistoryDetail.chainSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, coinAndAddressHistoryDetail.chainSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || coinAndAddressHistoryDetail.chainDecimalNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 16, coinAndAddressHistoryDetail.chainDecimalNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || coinAndAddressHistoryDetail.chainVdecimalNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 17, coinAndAddressHistoryDetail.chainVdecimalNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) coinAndAddressHistoryDetail.currencyAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, coinAndAddressHistoryDetail.currencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || coinAndAddressHistoryDetail.txTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 19, coinAndAddressHistoryDetail.txTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || coinAndAddressHistoryDetail.txStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 20, coinAndAddressHistoryDetail.txStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) coinAndAddressHistoryDetail.rowId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, coinAndAddressHistoryDetail.rowId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) coinAndAddressHistoryDetail.domain, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, coinAndAddressHistoryDetail.domain);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) coinAndAddressHistoryDetail.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, coinAndAddressHistoryDetail.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || coinAndAddressHistoryDetail.isOkexWallet) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 24, coinAndAddressHistoryDetail.isOkexWallet);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) coinAndAddressHistoryDetail.direction, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, coinAndAddressHistoryDetail.direction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) coinAndAddressHistoryDetail.confirmedCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, coinAndAddressHistoryDetail.confirmedCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) coinAndAddressHistoryDetail.totalConfirm, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, coinAndAddressHistoryDetail.totalConfirm);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) coinAndAddressHistoryDetail.gasPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, coinAndAddressHistoryDetail.gasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || coinAndAddressHistoryDetail.priorityFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, coinAndAddressHistoryDetail.priorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) coinAndAddressHistoryDetail.gasLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, coinAndAddressHistoryDetail.gasLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) coinAndAddressHistoryDetail.nonce, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, coinAndAddressHistoryDetail.nonce);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || coinAndAddressHistoryDetail.inputData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, StringSerializer.INSTANCE, coinAndAddressHistoryDetail.inputData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || coinAndAddressHistoryDetail.txSource != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, IntSerializer.INSTANCE, coinAndAddressHistoryDetail.txSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || coinAndAddressHistoryDetail.isShowPending) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 34, coinAndAddressHistoryDetail.isShowPending);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || coinAndAddressHistoryDetail.isShowSpeedUp) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 35, coinAndAddressHistoryDetail.isShowSpeedUp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || coinAndAddressHistoryDetail.isShowCancel) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 36, coinAndAddressHistoryDetail.isShowCancel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || coinAndAddressHistoryDetail.isShowSpeedupCancel) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 37, coinAndAddressHistoryDetail.isShowSpeedupCancel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) coinAndAddressHistoryDetail.pendingToastInfo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, coinAndAddressHistoryDetail.pendingToastInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || coinAndAddressHistoryDetail.btcSpeedUpInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 39, UTXOSpeedUpInfoJsonBean$$serializer.INSTANCE, coinAndAddressHistoryDetail.btcSpeedUpInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || coinAndAddressHistoryDetail.serviceCharge != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 40, StringSerializer.INSTANCE, coinAndAddressHistoryDetail.serviceCharge);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !coinAndAddressHistoryDetail.deleteSwitch) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 41, coinAndAddressHistoryDetail.deleteSwitch);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || coinAndAddressHistoryDetail.contractName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 42, StringSerializer.INSTANCE, coinAndAddressHistoryDetail.contractName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || coinAndAddressHistoryDetail.contractAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 43, StringSerializer.INSTANCE, coinAndAddressHistoryDetail.contractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || coinAndAddressHistoryDetail.repeatTxType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 44, coinAndAddressHistoryDetail.repeatTxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || coinAndAddressHistoryDetail.okexAccount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 45, StringSerializer.INSTANCE, coinAndAddressHistoryDetail.okexAccount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || !Intrinsics.EZpvd((Object) coinAndAddressHistoryDetail.orderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 46, coinAndAddressHistoryDetail.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || !Intrinsics.EZpvd((Object) coinAndAddressHistoryDetail.payAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 47, coinAndAddressHistoryDetail.payAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || !Intrinsics.EZpvd((Object) coinAndAddressHistoryDetail.payCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 48, coinAndAddressHistoryDetail.payCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || !Intrinsics.EZpvd((Object) coinAndAddressHistoryDetail.payCurrencyIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 49, coinAndAddressHistoryDetail.payCurrencyIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || (num3 = coinAndAddressHistoryDetail.ordinalNftAmount) == null || num3.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 50, IntSerializer.INSTANCE, coinAndAddressHistoryDetail.ordinalNftAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || !Intrinsics.EZpvd((Object) coinAndAddressHistoryDetail.ordinalNftName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 51, StringSerializer.INSTANCE, coinAndAddressHistoryDetail.ordinalNftName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || (num2 = coinAndAddressHistoryDetail.ordinalNftDirection) == null || num2.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 52, IntSerializer.INSTANCE, coinAndAddressHistoryDetail.ordinalNftDirection);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || coinAndAddressHistoryDetail.uOpHash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 53, StringSerializer.INSTANCE, coinAndAddressHistoryDetail.uOpHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || coinAndAddressHistoryDetail.poolId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 54, StringSerializer.INSTANCE, coinAndAddressHistoryDetail.poolId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || !Intrinsics.EZpvd((Object) coinAndAddressHistoryDetail.orderType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 55, coinAndAddressHistoryDetail.orderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || (num = coinAndAddressHistoryDetail.hideTxType) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 56, IntSerializer.INSTANCE, coinAndAddressHistoryDetail.hideTxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || !Intrinsics.EZpvd((Object) coinAndAddressHistoryDetail.dexOrderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 57, coinAndAddressHistoryDetail.dexOrderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || coinAndAddressHistoryDetail.claimableStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 58, IntSerializer.INSTANCE, coinAndAddressHistoryDetail.claimableStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || coinAndAddressHistoryDetail.toChainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 59, LongSerializer.INSTANCE, coinAndAddressHistoryDetail.toChainId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) && coinAndAddressHistoryDetail.tipsType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 60, StringSerializer.INSTANCE, coinAndAddressHistoryDetail.tipsType);
    }

    public CoinAndAddressHistoryDetail(@NotNull String str, String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, long j, long j2, int i, String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, int i2, int i3, @NotNull String str11, int i4, int i5, @NotNull String str12, long j3, int i6, @NotNull String str13, @NotNull String str14, @NotNull String str15, boolean z, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, String str20, @NotNull String str21, @NotNull String str22, String str23, Integer num, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull String str24, UTXOSpeedUpInfoJsonBean uTXOSpeedUpInfoJsonBean, String str25, boolean z6, String str26, String str27, int i7, String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, Integer num2, String str33, Integer num3, String str34, String str35, @NotNull String str36, Integer num4, @NotNull String str37, Integer num5, Long l, String str38) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
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
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        this.txId = str;
        this.txhash = str2;
        this.walletId = str3;
        this.address = str4;
        this.from = str5;
        this.to = str6;
        this.coinId = j;
        this.mainCoinId = j2;
        this.txType = i;
        this.kysTxTypeText = str7;
        this.coinAmount = str8;
        this.coinAmountNum = str9;
        this.coinSymbol = str10;
        this.decimalNum = i2;
        this.vdecimalNum = i3;
        this.chainSymbol = str11;
        this.chainDecimalNum = i4;
        this.chainVdecimalNum = i5;
        this.currencyAmount = str12;
        this.txTime = j3;
        this.txStatus = i6;
        this.rowId = str13;
        this.domain = str14;
        this.network = str15;
        this.isOkexWallet = z;
        this.direction = str16;
        this.confirmedCount = str17;
        this.totalConfirm = str18;
        this.gasPrice = str19;
        this.priorityFee = str20;
        this.gasLimit = str21;
        this.nonce = str22;
        this.inputData = str23;
        this.txSource = num;
        this.isShowPending = z2;
        this.isShowSpeedUp = z3;
        this.isShowCancel = z4;
        this.isShowSpeedupCancel = z5;
        this.pendingToastInfo = str24;
        this.btcSpeedUpInfo = uTXOSpeedUpInfoJsonBean;
        this.serviceCharge = str25;
        this.deleteSwitch = z6;
        this.contractName = str26;
        this.contractAddress = str27;
        this.repeatTxType = i7;
        this.okexAccount = str28;
        this.orderId = str29;
        this.payAmount = str30;
        this.payCurrency = str31;
        this.payCurrencyIcon = str32;
        this.ordinalNftAmount = num2;
        this.ordinalNftName = str33;
        this.ordinalNftDirection = num3;
        this.uOpHash = str34;
        this.poolId = str35;
        this.orderType = str36;
        this.hideTxType = num4;
        this.dexOrderId = str37;
        this.claimableStatus = num5;
        this.toChainId = l;
        this.tipsType = str38;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x02ee: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0004: ARITH (r129v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r129v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r129v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r129v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r129v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r129v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0036: ARITH (r129v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r71v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x003f: ARITH (r129v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r73v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0048: ARITH (r129v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r75v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r129v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r76v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r129v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r77v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r129v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r78v0 java.lang.String))
  (wrap:java.lang.String:0x0076: TERNARY null = ((wrap:int:0x006d: ARITH (r129v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r79v0 java.lang.String))
  (wrap:int:0x0081: TERNARY null = ((wrap:int:0x0078: ARITH (r129v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r80v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0083: ARITH (r129v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r81v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008f: ARITH (r129v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r82v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x009a: ARITH (r129v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r83v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00a5: ARITH (r129v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r84v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b0: ARITH (r129v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r85v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x00bb: ARITH (r129v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r86v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00c6: ARITH (r129v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r88v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d1: ARITH (r129v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r89v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00dc: ARITH (r129v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r90v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e7: ARITH (r129v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r91v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00f2: ARITH (r129v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? false : (r92v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fd: ARITH (r129v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r93v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0108: ARITH (r129v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r94v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0113: ARITH (r129v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r95v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011e: ARITH (r129v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r96v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0129: ARITH (r129v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r97v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0134: ARITH (r129v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r98v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013f: ARITH (r129v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r99v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0148: ARITH (r130v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r100v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0151: ARITH (r130v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r101v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x015a: ARITH (r130v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r102v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0163: ARITH (r130v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r103v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x016c: ARITH (r130v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r104v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0175: ARITH (r130v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r105v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x017e: ARITH (r130v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r106v0 java.lang.String))
  (wrap:com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoJsonBean:0x0191: TERNARY null = ((wrap:int:0x0189: ARITH (r130v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoJsonBean) : (r107v0 com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoJsonBean))
  (wrap:java.lang.String:0x019b: TERNARY null = ((wrap:int:0x0193: ARITH (r130v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r108v0 java.lang.String))
  (wrap:boolean:0x01a5: TERNARY null = ((wrap:int:0x019d: ARITH (r130v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? true : (r109v0 boolean))
  (wrap:java.lang.String:0x01af: TERNARY null = ((wrap:int:0x01a7: ARITH (r130v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r110v0 java.lang.String))
  (wrap:java.lang.String:0x01b9: TERNARY null = ((wrap:int:0x01b1: ARITH (r130v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r111v0 java.lang.String))
  (wrap:int:0x01c4: TERNARY null = ((wrap:int:0x01bb: ARITH (r130v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r112v0 int))
  (wrap:java.lang.String:0x01ce: TERNARY null = ((wrap:int:0x01c6: ARITH (r130v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r113v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01d0: ARITH (r130v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r114v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01d9: ARITH (r130v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r115v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01e2: ARITH (r130v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r116v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01eb: ARITH (r130v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r117v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x01f6: ARITH (r130v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r118v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0203: ARITH (r130v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r119v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x020e: ARITH (r130v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r120v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x021b: ARITH (r130v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r121v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0226: ARITH (r130v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r122v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0231: ARITH (r130v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r123v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x023c: ARITH (r130v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r124v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0249: ARITH (r130v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r125v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0254: ARITH (r130v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r126v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x025f: ARITH (r130v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r127v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x026a: ARITH (r130v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r128v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, int, int, java.lang.String, long, int, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, boolean, boolean, boolean, boolean, java.lang.String, com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoJsonBean, java.lang.String, boolean, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.String):void (m)] (LINE:35) call: com.okinc.business.defi.biz.net.bean.CoinAndAddressHistoryDetail.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, int, int, java.lang.String, long, int, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, boolean, boolean, boolean, boolean, java.lang.String, com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoJsonBean, java.lang.String, boolean, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.String):void type: THIS */
    public /* synthetic */ CoinAndAddressHistoryDetail(String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, int i, String str7, String str8, String str9, String str10, int i2, int i3, String str11, int i4, int i5, String str12, long j3, int i6, String str13, String str14, String str15, boolean z, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Integer num, boolean z2, boolean z3, boolean z4, boolean z5, String str24, UTXOSpeedUpInfoJsonBean uTXOSpeedUpInfoJsonBean, String str25, boolean z6, String str26, String str27, int i7, String str28, String str29, String str30, String str31, String str32, Integer num2, String str33, Integer num3, String str34, String str35, String str36, Integer num4, String str37, Integer num5, Long l, String str38, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? "" : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? "" : str4, (i8 & 16) != 0 ? "" : str5, (i8 & 32) != 0 ? "" : str6, (i8 & 64) != 0 ? 0L : j, (i8 & 128) != 0 ? 0L : j2, (i8 & 256) != 0 ? 0 : i, (i8 & 512) != 0 ? null : str7, (i8 & 1024) != 0 ? "" : str8, (i8 & 2048) != 0 ? "" : str9, (i8 & 4096) != 0 ? "" : str10, (i8 & 8192) != 0 ? 0 : i2, (i8 & 16384) != 0 ? 0 : i3, (i8 & 32768) != 0 ? "" : str11, (i8 & 65536) != 0 ? 0 : i4, (i8 & 131072) != 0 ? 0 : i5, (i8 & 262144) != 0 ? "" : str12, (i8 & 524288) != 0 ? 0L : j3, (i8 & 1048576) != 0 ? 0 : i6, (i8 & 2097152) != 0 ? "" : str13, (i8 & 4194304) != 0 ? "" : str14, (i8 & 8388608) != 0 ? "" : str15, (i8 & 16777216) != 0 ? false : z, (i8 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str16, (i8 & 67108864) != 0 ? "" : str17, (i8 & 134217728) != 0 ? "" : str18, (i8 & 268435456) != 0 ? "" : str19, (i8 & 536870912) != 0 ? null : str20, (i8 & 1073741824) != 0 ? "" : str21, (i8 & Integer.MIN_VALUE) != 0 ? "" : str22, (i9 & 1) != 0 ? null : str23, (i9 & 2) != 0 ? null : num, (i9 & 4) != 0 ? false : z2, (i9 & 8) != 0 ? false : z3, (i9 & 16) != 0 ? false : z4, (i9 & 32) != 0 ? false : z5, (i9 & 64) != 0 ? "" : str24, (i9 & 128) != 0 ? null : uTXOSpeedUpInfoJsonBean, (i9 & 256) != 0 ? null : str25, (i9 & 512) != 0 ? true : z6, (i9 & 1024) != 0 ? null : str26, (i9 & 2048) != 0 ? null : str27, (i9 & 4096) != 0 ? 0 : i7, (i9 & 8192) != 0 ? null : str28, (i9 & 16384) != 0 ? "" : str29, (i9 & 32768) != 0 ? "" : str30, (i9 & 65536) != 0 ? "" : str31, (i9 & 131072) != 0 ? "" : str32, (i9 & 262144) != 0 ? 0 : num2, (i9 & 524288) != 0 ? "" : str33, (i9 & 1048576) != 0 ? 0 : num3, (i9 & 2097152) != 0 ? null : str34, (i9 & 4194304) != 0 ? null : str35, (i9 & 8388608) != 0 ? "" : str36, (i9 & 16777216) != 0 ? 0 : num4, (i9 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str37, (i9 & 67108864) != 0 ? null : num5, (i9 & 134217728) != 0 ? null : l, (i9 & 268435456) != 0 ? null : str38);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CoinAndAddressHistoryDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CoinAndAddressHistoryDetail> serializer() {
            return CoinAndAddressHistoryDetail$$serializer.INSTANCE;
        }
    }
}
